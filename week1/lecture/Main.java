public class Main {
    public static void main(String[] args) {
        String str1 = new String("smu");
        String str2 = new String("love");

        if (str1.equals(str2)) {
            System.out.println("They are the SAME");
        } else {
            System.out.println("They are NOT SAME");
        }

        String str3 = "smu";
        String str4 = "smu";
        if (str3 == str1) {
            System.out.println("They are the SAME");
        } else {
            System.out.println("They are not the SAME");
        }

        str2 = str2.intern();
        if (str3 == str2) {
            System.out.println("They are the SAME");
        } else {
            System.out.println("They are not the SAME");
        }
    }
}
