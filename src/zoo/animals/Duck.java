package zoo.animals;

import zoo.behavior.Fly;
import zoo.behavior.Run;
import zoo.behavior.Swim;
import zoo.behavior.Voice;

public class Duck extends Herbivore implements Voice, Swim, Fly, Run {

    @Override
    public String voice() {
        return "Кря-кря";
    }
    @Override
    public void run() {
        System.out.println(this + " бежит");
    }

    @Override
    public void swim() {
        System.out.println(this + " плывет");

    }

    @Override
    public void fly() {
        System.out.println(this +" летит");
    }

    @Override
    public String toString() {
        return "Утка";
    }
}
