package flyweight;

import flyweight.bank.Assessment;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main
{
    public static void main(String[] args)
    {
        final int NUM_STUDENTS = 149;
        ArrayList<Assessment> myAssessments = new ArrayList<>();

        for (int x = 1; x <= NUM_STUDENTS; x++)
        {
            myAssessments.add(new Assessment(x, generateQuestionID(), generateQuestionID()));
        }

        for (Assessment assessment : myAssessments)
        {
            System.out.println(assessment);
        }
    }

    private static char generateQuestionID()
    {
        return (char)(ThreadLocalRandom.current().nextInt(65, 68));
    }
}
