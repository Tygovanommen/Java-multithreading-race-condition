package counter;

public class Main {

    private final static Tester tester = new Tester();

    public static void main(String[] args) {
        // Change value to switch between issue and solution
        tester.raceCondition(true);

        // Race condition fix
        tester.raceConditionFix();
    }
}