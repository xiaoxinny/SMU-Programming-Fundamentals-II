
public class ExceptionDemo17 {

    public static void main(String[] args) throws Exception {
        a();
    }

    public static void a() throws Exception {
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
