package homework170724;

public class Cat {
    //inner class

    private interface CatBrain extends Pet {}

    private class Hungry implements CatBrain {
        @Override
        public void clean() {
            bite();
        }

        @Override
        public void brush() {
            bite();
        }

        @Override
        public void feed() {
            meow();
            eat();
        }

        @Override
        public void play() {
            bite();
            meow();
            bite();
        }
    }

    private class Fed implements CatBrain {

        @Override
        public void clean() {
            meow();
            clean();
        }

        @Override
        public void brush() {
            bite();
        }

        @Override
        public void feed() {
            bite();
        }

        @Override
        public void play() {
            meow();
            meow();
            meow();
        }
    }

    private void eat() {
        System.out.println("Eating.");
    }

    private void meow() {
        System.out.println("Meeeooww!!");
    }

    private void bite() {
        System.out.println("Biting your arm.");
    }
}
