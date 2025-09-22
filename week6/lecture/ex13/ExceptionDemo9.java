
public class ExceptionDemo9 {

    public static void main(String[] args) {
        try {
            int iResult = 1 / 0;
        } catch (Error e) {
            System.out.println("catch");
        }
    }
}
