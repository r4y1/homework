package warmup1;

public class ParrotTrouble {
    boolean parrotTrouble(boolean talking, int hour) {
        return (talking && ((hour > 0 && hour < 7) || (hour > 20 && hour <= 23)));
    }
}
