
public class ExceptionDemo5 {

    public static void main(String[] args) {
        try {
            int x = 1 / 5;
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        System.out.println("exit");
    }
}
