public class Concatenation {
    public static void main(String[] args) {
        String s1 = 1 + '_' + "test";
        System.out.println("s1 = " + s1);
        String s2 = 1 + "_" + "test";
        System.out.println("s2 = " + s2);
        String s3 = "test" + '_' + 1;
        System.out.println("s3 = " + s3);
        String s4 = '_' + 1 + "test";
        System.out.println("s4 = " + s4);

        String s5 = "test" + 1 + 2;
        System.out.println("s5 = " + s5);
        System.out.println(0 + '_');
    }
}
