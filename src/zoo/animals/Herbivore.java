package zoo.animals;

import zoo.foods.Food;
import zoo.foods.Grass;
import zoo.foods.Meat;

public class Herbivore extends Animal {

    @Override
    public void eat(Food food) {
        if (food instanceof Meat)
            System.out.println("Я не ем " + food);
        else
            System.out.println("Я съел " + food);
    }
}
