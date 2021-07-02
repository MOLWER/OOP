package zoo.animals;

import zoo.behavior.Run;
import zoo.behavior.Sleep;
import zoo.behavior.Voice;

public class Antelope extends Herbivore implements Voice, Run, Sleep {
    @Override
    public String voice() {
        return "Аааррррр";
    }

    @Override
    public void run() {
        System.out.println(this + " бежит");
    }

    @Override
    public String toString() {
        return "Антилопа";
    }

    @Override
    public void sleep() {
        System.out.println(this + " спит");
    }
}
