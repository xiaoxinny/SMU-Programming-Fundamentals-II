public abstract class Counter {
    private int value;

    public abstract void increment();

    public abstract void decrement();

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}