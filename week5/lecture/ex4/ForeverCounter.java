public class ForeverCounter extends Counter {
    
    @Override
    public void increment() {
        setValue(getValue() + 1);
    }

    @Override
    public void decrement() {
        setValue(getValue() - 1);
    }
}
