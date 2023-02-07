package decorator.decorator;

public abstract class JunkFoodDecorator implements IJunkFood
{
    IJunkFood junkFood;

    public JunkFoodDecorator(IJunkFood junkFood)
    {
        this.junkFood = junkFood;
    }

    @Override
    public String getDescription()
    {
        return junkFood.getDescription();
    }
}
