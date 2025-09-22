
public class ExceptionDemo10 {

    public static void main(String[] args) {
        try {
            int iResult = 1 / 0;
        } catch (NullPointerException e) {
            System.out.println("Catch-1");
        } catch (ArithmeticException e) {
            System.out.println("Catch-2");
        }
    }
}
