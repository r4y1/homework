package homework170724;

public class Rat implements Pet {
    //outer class
    boolean fed = false;

    private Hungry brainHungry = new Hungry();
    private Fed brainFed = new Fed();


    @Override
    public void clean() {
        if (!fed) {
            brainHungry.clean();
        } else {
            brainFed.clean();
        }
    }

    @Override
    public void brush() {
        if (!fed) {
            brainHungry.brush();
        } else {
            brainFed.brush();
        }
    }

    @Override
    public void feed() {
        if (!fed) {
            brainHungry.feed();
        } else {
            brainFed.feed();
        }
    }

    @Override
    public void play() {
        if (!fed) {
            brainHungry.play();
        } else {
            brainFed.play();
        }
    }
}
