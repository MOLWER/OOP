package zoo.animals;

import zoo.behavior.Run;
import zoo.behavior.Swim;
import zoo.behavior.Voice;

public class Leon extends Carnivorous implements Voice, Run, Swim {
    @Override
    public String voice() {
        return "Рррр-ррр";
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
        return "Лев";
    }
}
