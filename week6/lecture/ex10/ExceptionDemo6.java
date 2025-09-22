
public class ExceptionDemo6 {

    public static void main(String[] args) {
        try {
            int x = 1 / 0;
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        System.out.println("exit");
    }
}
