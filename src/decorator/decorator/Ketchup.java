package decorator.decorator;

public class Ketchup extends JunkFoodDecorator
{
    public Ketchup(IJunkFood junkFood)
    {
        super(junkFood);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with ketchup";
    }
}
