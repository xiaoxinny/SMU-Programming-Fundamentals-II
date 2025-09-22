public class ExceptionDemo3 {
    public static void main(String[] args){
        for (int i=0;i<5;i++) {
            try{
                int k = i/(i%2);
            }
            catch (Exception e) {
                System.out.println("Exception @" + i);
            }
        }
    }
}