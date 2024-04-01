package b4;

import y3.a;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f1592a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f1593b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f1594c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f1595d;

    static {
        boolean z5;
        a aVar;
        try {
            Class.forName("java.sql.Date");
            z5 = true;
        } catch (ClassNotFoundException unused) {
            z5 = false;
        }
        f1592a = z5;
        if (z5) {
            f1593b = a.f1586b;
            f1594c = b.f1588b;
            aVar = c.f1590b;
        } else {
            aVar = null;
            f1593b = null;
            f1594c = null;
        }
        f1595d = aVar;
    }
}
