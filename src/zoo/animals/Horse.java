package zoo.animals;

import zoo.behavior.Run;
import zoo.behavior.Swim;
import zoo.behavior.Voice;

public class Horse extends Herbivore implements Voice, Run, Swim {
    @Override
    public String voice() {
        return "Ии-го-го";
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
    public String toString() {
        return "Лощадь";
    }
}
