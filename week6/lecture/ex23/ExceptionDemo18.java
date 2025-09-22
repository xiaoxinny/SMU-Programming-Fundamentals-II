
public class ExceptionDemo18 {

    public static void main(String[] args) throws Exception {
        try {
            int i = 4;
            int j = 5 / (i - (i / 2) - (i / 2));
        } catch (ArithmeticException ae) {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("2");
        }
    }
}
