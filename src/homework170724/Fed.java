package homework170724;

public class Fed implements Pet {
    @Override
    public void clean() {
        System.out.println("Sneaky cleaning himself.");
    }

    @Override
    public void brush() {
        System.out.println("Sneaky brush himself");
    }

    @Override
    public void feed() {
        eat();
    }

    private void eat() {
        System.out.println("Sneaking eating.");
    }

    @Override
    public void play() {
        System.out.println("Playing.");
    }
}
