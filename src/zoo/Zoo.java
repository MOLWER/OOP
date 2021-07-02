package zoo;

import zoo.animals.*;
import zoo.behavior.Swim;
import zoo.foods.Food;
import zoo.foods.Grass;
import zoo.foods.Meat;
import zoo.workers.Worker;

public class Zoo {

    public static void main(String[] args) {
        Bear bear = new Bear();
        Fish fish = new Fish();
        Duck duck = new Duck();
        Leon leon = new Leon();
        Antelope antelope = new Antelope();

        Food meat = new Meat();
        Food grass = new Grass();

        Worker worker = new Worker();

        worker.feed(bear, meat);
        worker.getVoice(bear);

        worker.feed(duck, meat);
        worker.getVoice(duck);

        worker.feed(leon, meat);
        worker.getVoice(leon);

        worker.feed(antelope, grass);
        worker.getVoice(antelope);

        Swim[] pond = {fish, leon, bear, duck};
        for (Swim animal : pond)
            animal.swim();
        antelope.sleep();
    }
}
