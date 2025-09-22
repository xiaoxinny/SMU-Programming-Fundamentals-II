
public class ExceptionDemo20 {

    public static void main(String[] args) {
        a();
    }

    public static void a() {
        try {
            c();
        } catch (Exception e) {
            b();
        }
    }

    public static void b() throws Exception {
        c();
    }

    public static void c() throws Exception {
        throw new Exception("test");
    }
}
