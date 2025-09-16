public class CircularCounter extends Counter {
    private int limit;

    public CircularCounter(int limit) {
        super();
        setValue(0);
        this.limit = limit;
    }

    @Override
    public void increment() {
        setValue((getValue() < limit) ? getValue()+1 : 0);
    }

    @Override
    public void decrement() {
        setValue((getValue() > 0) ? getValue() - 1 : limit);
    }
}
