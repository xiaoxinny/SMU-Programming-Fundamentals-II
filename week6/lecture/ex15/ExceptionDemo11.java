
public class ExceptionDemo11 {

    public static void main(String[] args) {
        ExceptionDemo11 demo = new ExceptionDemo11();
        try {
            demo.doA();
        } catch (Exception e) {
            System.out.println("test");
}
}
public void doA() throws Exception {
        throw new Exception("");
    }
}
