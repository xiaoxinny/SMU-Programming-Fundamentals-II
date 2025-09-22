public class ExceptionDemo2 {
    public static void main(String[] args){
        try {
            int x = 1/0;
        }
        catch(Exception e) {
            System.out.println("catch");
        }
        System.out.println("exit");
    }
}