package decorator.decorator;

public class Sauce extends JunkFoodDecorator
{
    public Sauce(IJunkFood junkFood)
    {
        super(junkFood);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with sauce";
    }
}
