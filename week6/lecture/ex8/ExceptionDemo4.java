
public class ExceptionDemo4 {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                if (i == 3) {
                    int err = 1 / 0;
                }
            }
        } catch (Exception e) {
            System.out.println("catch");
        }
        System.out.println("exit");
    }
}
