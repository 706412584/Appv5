package i.runlibrary.a;

public final class p {
    public static boolean a(Object obj) {
        try {
            return (String) obj;
        } catch (ClassCastException unused) {
            return false;
        }
    }
}