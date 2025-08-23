import java.util.*;

public class Q8BinaryToText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary message: ");
        String binaryMessage = sc.nextLine();
        String originalText = new String();

        for(int x = 0; x < binaryMessage.length(); x+=8) {
            String binaryTextToConvert = binaryMessage.substring(x, x+8);
            // System.out.println(binaryTextToConvert);
            int currentNum = 0;
            StringBuilder sb = new StringBuilder(binaryTextToConvert).reverse();
            for (int y=0; y < binaryTextToConvert.length(); y++) {
                if (sb.toString().toCharArray()[y]=='1') {
                    currentNum += Math.pow(2, y);
                } 
            }
            originalText += (char)currentNum;
        }

        System.out.println(originalText);
    }

   
}
