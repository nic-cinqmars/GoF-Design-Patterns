package flyweight.bank;

import java.util.HashMap;

public class Bank
{
    private HashMap<Character, Question> questions;

    private static Bank bank;

    private Bank()
    {
        questions = new HashMap<>();
    }

    public static Bank getInstance()
    {
        if (bank == null)
        {
            bank = new Bank();
        }

        return bank;
    }

    Question getQuestion(char id)
    {
        if (questions.containsKey(id))
            return questions.get(id);
        return loadQuestion(id);
    }

    private Question loadQuestion(char id)
    {
        Question question = null;
        try
        {
            Class<Question> questionClass = (Class<Question>)Class.forName("flyweight.bank.Question" + id);
            question = questionClass.newInstance();
            questions.put(id, question);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return question;
    }
}
