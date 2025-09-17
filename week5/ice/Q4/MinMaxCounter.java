public class MinMaxCounter extends Counter {
    private int max;
    private int min;

    public MinMaxCounter(int min, int max) {
        super(0);
        this.min = min;
        this.max = max;
    }

    @Override
    public void decrement() {
        if (super.getValue() > min) {
            super.decrement();
        }
    }

    @Override
    public void increment() {
        if (super.getValue() < max) {
            super.increment();
        }
    }
}
