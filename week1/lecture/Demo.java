import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input:");
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            
            System.out.println(line);

            if (line.equals("q")) {
                System.out.println("Bye");
                break;
            }

            System.out.print("Please input again:");
        
            // Problem with .close is that, it closes both System.in and Scanner class, 
            // which terminates all keyboard input capabilities
            sc.close();

            // Thus, this code will not run at all unless the above is removed
            Scanner sc2 = new Scanner(System.in);
            System.out.print("Please input:");
            while (sc2.hasNextLine()) {
                String line2 = sc2.nextLine();
                
                System.out.println(line2);

                if (line2.equals("q")) {
                    System.out.println("Bye");
                    break;
                }
            }

            
        }
    }
}
