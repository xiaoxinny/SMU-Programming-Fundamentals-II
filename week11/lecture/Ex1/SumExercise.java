
public class SumExercise {

    public static void main(String[] args) {
        String s1 = "I";
        String s2 = "Love";
        String s3 = "Java";
        String[] arr = {s1, s2, s3};
        arr[1] = "Hate";
        System.out.println(s1 + " " + s2 + " " + s3);
    }
}

// Predicted output: I Love Java
