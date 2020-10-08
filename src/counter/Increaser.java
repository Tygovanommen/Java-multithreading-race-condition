package counter;

public class Increaser implements Runnable {

    private final Counter counter;

    public Increaser(Counter currentCounter) {
        this.counter = currentCounter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.addCount();
        }
    }
}
