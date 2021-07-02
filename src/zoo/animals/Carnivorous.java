package zoo.animals;

import zoo.foods.Food;
import zoo.foods.Grass;
import zoo.foods.Meat;

public class Carnivorous extends Animal {

    @Override
    public void eat(Food food) {
        if (food instanceof Grass)
            System.out.println("Я не ем " + food);
        else
            System.out.println("Я съел " + food);
    }
}
