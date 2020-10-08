package counter;

public class Main {

    public static void main(String[] args) {
        // Change int value to switch between issue and solutions
        // 1 = race condition issue
        // 2 = solution synchronize
        // 3 = solution stateless
        new Tester().raceCondition(3);
    }

}