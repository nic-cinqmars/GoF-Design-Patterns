package flyweight.bank;

public class Assessment
{
    private int assessmentNumber;

    private Question q1;
    private Question q2;

    public Assessment(int assessmentNumber, char q1ID, char q2ID)
    {
        this.assessmentNumber = assessmentNumber;
        q1 = Bank.getInstance().getQuestion(q1ID);
        q2 = Bank.getInstance().getQuestion(q2ID);
    }

    @Override
    public String toString() {
        return "Assessment #" + assessmentNumber +
                "\n\tq1 " + q1 +
                "\n\tq2 " + q2;
    }
}
