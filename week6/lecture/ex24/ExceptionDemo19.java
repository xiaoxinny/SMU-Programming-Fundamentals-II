
public class ExceptionDemo19 {

    public void doC() throws Exception {
        throw new Exception("test");
    }

    public void doB() throws Exception {
        doC();
    }

    public void doA() throws Exception {
        doB();
    }

    public static void main(String[] args) {
        ExceptionDemo19 demo = new ExceptionDemo19();
        demo.doA();
    }
}
