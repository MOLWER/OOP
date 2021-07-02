package zoo.animals;

import zoo.behavior.Swim;

public class Fish extends Carnivorous implements Swim {
    @Override
    public void swim() {
        System.out.println(this + " плывет");
    }

    @Override
    public String toString() {
        return "Рыба";
    }
}
