
public class ExceptionDemo14 {

    public static void main(String[] args) throws Exception {
        String s = null;
        try {
            s.charAt(3);
        } catch (Exception e) {
            try {
                s.charAt(3);
            } catch (ArithmeticException e2) {
                throw new ArithmeticException();
            } catch (Exception e3) {
                System.out.println("2");
            }
        }
    }
}
