package week1.ice;

import java.util.Scanner;

public class Q8BinaryConverter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter decimal number: ");
    int numToConvert = sc.nextInt();
    int currentNum = numToConvert;
    String binaryString = new String("");
    
    while (currentNum > 1) {
      binaryString += Integer.toString(currentNum % 2);
      currentNum = currentNum/2;
    }

    binaryString += Integer.toString(currentNum);

    StringBuilder sb = new StringBuilder(binaryString);

    System.out.printf("Binary equivalent of %d is %s. \n", numToConvert, sb.reverse().toString());
  }
}
