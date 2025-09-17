public class Counter {
    private int value;

    protected Counter(int value) {
        this.value = value;
    }

    public void decrement() {
        value--;
    };
    public void increment() {
        value++;
    };

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}