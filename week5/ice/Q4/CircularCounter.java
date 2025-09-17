public class CircularCounter extends Counter{
    private int limit;
    
    public CircularCounter(int limit) {
        super(0);
        this.limit = limit;
    }

    @Override
    public void decrement() {
        if (super.getValue() > 0) {
            super.decrement();
        } else {
            super.setValue(limit);
        }
    }

    @Override
    public void increment() {
        if (super.getValue() < limit) {
            super.increment();
        } else {
            super.setValue(0);
        }
    }
}
