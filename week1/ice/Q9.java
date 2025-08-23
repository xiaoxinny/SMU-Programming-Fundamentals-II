public class Q9 {

    public static void main(String[] args) {
        char c = 'a';
        int age = 9;

        // fragment A
        if (c == 'a' && ++age == 10){
            age++;
        }
        System.out.print("Fragment A: "+ age + "\n");

        // fragment B
        if (c == 'a' & ++age == 10){
            age++;
        }
        System.out.print("Fragment B: "+ age + "\n");

        // fragment C
        if (c != 'a' && ++age == 10){
            age++;
        }
        System.out.print("Fragment C: "+ age + "\n");

        // fragment D
        if (c != 'a' || ++age == 10){
            age++;
        }
        System.out.print("Fragment D: "+ age + "\n");

        // fragment E
        if (c == 'a' || ++age == 10){
            age++;
        }
        System.out.print("Fragment E: "+ age + "\n");
        
        // fragment F
        if (c != 'a' | ++age == 10){
            age++;
        }
        System.out.print("Fragment F: "+ age + "\n");

    }
}