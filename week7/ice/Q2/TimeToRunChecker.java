public class TimeToRunChecker {
    public static void main(String[] args) {
        long q1Start = System.currentTimeMillis();
        Q1_TextFileReader.main(args);
        long q1End = System.currentTimeMillis();
        System.out.println("Time to run Q1's TextFileReader.java: " + (q1End - q1Start));

        long q2Start = System.currentTimeMillis();
        Q2_TextFileReader.main(args);
        long q2End = System.currentTimeMillis();
        System.out.println("Time to run Q2's TextFileReader.java: " + (q2End - q2Start));
    }
}