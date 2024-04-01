package p4;

import java.io.Serializable;

public abstract class a implements t4.a, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public transient t4.a f4852d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f4853e;

    /* renamed from: f  reason: collision with root package name */
    public final Class f4854f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4855g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4856h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f4857i;

    public a(Object obj, Class cls, String str, String str2, boolean z5) {
        this.f4853e = obj;
        this.f4854f = cls;
        this.f4855g = str;
        this.f4856h = str2;
        this.f4857i = z5;
    }

    public final b b() {
        Class cls = this.f4854f;
        if (cls == null) {
            return null;
        }
        if (!this.f4857i) {
            return j.a(cls);
        }
        j.f4866a.getClass();
        return new g(cls);
    }
}
