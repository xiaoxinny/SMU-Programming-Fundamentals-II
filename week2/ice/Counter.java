// this is for Q8
public class Counter {
    private int value = 2;

    public Counter() {
    }

    public Counter(int v) {
        this.value = v;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int newValue) {
        this.value = newValue;
    }

    public void increment() {
        this.value++;
    }

    public void decrement() {
        this.value--;
    }

    public void reset() {
        this.value = 0;
    }
}