package flyweight.bank;

public abstract class Question
{
    private String description;

    public Question(String description)
    {
        this.description = description;
    }

    protected String getDescription()
    {
        return description;
    }

    @Override
    public String toString() {
        return "Question{" + description + "}";
    }
}
