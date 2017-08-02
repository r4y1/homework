package homework170724;

public class Hungry implements Pet {
    @Override
    public void clean() {
        bite();
        hide();
    }

    private void bite() {
        System.out.println("Bite you.");
    }

    @Override
    public void brush() {
        bite();
        hide();
    }

    @Override
    public void feed() {
        bite();
        hide();
    }

    @Override
    public void play() {
        bite();
        bite();
        hide();
    }

    private void hide() {
        System.out.println("Run away.");
    }
}
