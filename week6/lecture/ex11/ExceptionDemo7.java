public class ExceptionDemo7 {
    public static void main(String[] args) {
        String s = "hello";
        try {
            s.charAt(3); // do no harm
            return;
        } catch (Exception e) {
            System.out.println("1");
        } finally {
            System.out.println("2");
        }
    }
}