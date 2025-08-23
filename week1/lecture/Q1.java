public class Q1 {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        
        y -= x--;
        System.out.printf("%d%d%d", y, x+1, x);
    }
}
