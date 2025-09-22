public class ExceptionDemo1 {
    public static void main(String[] args){
        try {
            int x = 1/5;
        }
        catch(Exception e) {
            System.out.println("catch");
        }
        System.out.println("exit");
    }
}