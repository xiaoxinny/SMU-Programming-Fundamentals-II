
public class ExceptionDemo16 {

    public static void main(String[] args) {
        try {
            ExceptionDemo16 demo = new ExceptionDemo16();
            demo.doA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void doA() throws Exception {
        try {
            doB();
        } catch (Exception e) {
            throw new Exception("test2");
        }
    }

    public void doB() throws Exception {
        throw new Exception("test");
    }
}
