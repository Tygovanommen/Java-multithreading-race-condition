package counter;

public class Counter {

    private int count;

    public Counter(int defaultCount) {
        this.count = defaultCount;
    }

    public void addCount() {
        if (Tester.isRaceCon) {
            // Because threads are running at the same time result will be unexpected
            this.count++;
        } else {
            // Synchronizing makes the count go one by one. It will wait for other add() actions
            synchronized (this) {
                this.count++;
            }
        }
    }

    public int getCount() {
        return this.count;
    }

}
