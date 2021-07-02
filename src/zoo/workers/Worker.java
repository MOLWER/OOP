package zoo.workers;

import zoo.animals.Animal;
import zoo.behavior.Voice;
import zoo.foods.Food;

public class Worker {
    public void feed(Animal animal, Food food) {
        System.out.println("Рабочий покормил животное '" + animal + "'");
        animal.eat(food);
    }

    public void getVoice(Voice animal) {
        System.out.println(animal + " издает звук '" + animal.voice() + "'");
    }
}
