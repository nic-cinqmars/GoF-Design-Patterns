package decorator;

import decorator.decorator.*;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<IJunkFood> junkFoods = new ArrayList<>();

        McDo mcDo = new McDo();
        HotDog hotDog = new HotDog();
        Poutine poutine = new Poutine();

        junkFoods.add(poutine);
        junkFoods.add(hotDog);
        junkFoods.add(mcDo);

        junkFoods.add(new Sauce(poutine));
        junkFoods.add(new Sauce(mcDo));
        junkFoods.add(new Ketchup(hotDog));
        junkFoods.add(new Ketchup(mcDo));

        for (IJunkFood junkFood : junkFoods)
        {
            System.out.println(junkFood.getDescription());
        }
    }
}
