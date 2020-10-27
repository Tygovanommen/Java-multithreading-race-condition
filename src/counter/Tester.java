package counter;

public class Tester {

    // Make race condition static so it can be accessed everywhere
    public static boolean isRaceCon;

    /**
     * Simulates a multithreading race condition problem
     */
    public void raceCondition(boolean isRaceCondition) {
        isRaceCon = isRaceCondition;

        // Initialize Counter object
        Counter counter = new Counter(0);

        // Create new threads
        Thread thread1 = new Thread(new Increaser(counter));
        thread1.start();

        Thread thread2 = new Thread(new Increaser(counter));
        thread2.start();

        try {
            // Wait till threads are finished
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + counter.getCount());
    }

    public void raceConditionFix() {

        // Create counters
        Counter counter1 = new Counter(0);
        Counter counter2 = new Counter(0);

        // Create new threads
        Thread thread1 = new Thread(new Increaser(counter1));
        thread1.start();

        Thread thread2 = new Thread(new Increaser(counter2));
        thread2.start();

        try {
            // Wait till threads are finished
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Merge calculation results
        System.out.println("Count: "+ (counter1.getCount() + counter2.getCount()));

    }
}
