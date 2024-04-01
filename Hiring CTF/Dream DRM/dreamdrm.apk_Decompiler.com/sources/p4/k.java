package p4;

public final class k {
    public static String a(d dVar) {
        String obj = dVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
