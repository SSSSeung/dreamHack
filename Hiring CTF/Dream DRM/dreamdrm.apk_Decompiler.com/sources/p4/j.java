package p4;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final k f4866a;

    static {
        k kVar = null;
        try {
            kVar = (k) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (kVar == null) {
            kVar = new k();
        }
        f4866a = kVar;
    }

    public static c a(Class cls) {
        f4866a.getClass();
        return new c(cls);
    }
}
