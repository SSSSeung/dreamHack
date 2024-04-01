package q0;

import android.graphics.Insets;

public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final c f4868e = new c(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f4869a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4870b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4871c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4872d;

    public c(int i3, int i6, int i7, int i8) {
        this.f4869a = i3;
        this.f4870b = i6;
        this.f4871c = i7;
        this.f4872d = i8;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f4869a, cVar2.f4869a), Math.max(cVar.f4870b, cVar2.f4870b), Math.max(cVar.f4871c, cVar2.f4871c), Math.max(cVar.f4872d, cVar2.f4872d));
    }

    public static c b(int i3, int i6, int i7, int i8) {
        return (i3 == 0 && i6 == 0 && i7 == 0 && i8 == 0) ? f4868e : new c(i3, i6, i7, i8);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return b.a(this.f4869a, this.f4870b, this.f4871c, this.f4872d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f4872d == cVar.f4872d && this.f4869a == cVar.f4869a && this.f4871c == cVar.f4871c && this.f4870b == cVar.f4870b;
    }

    public final int hashCode() {
        return (((((this.f4869a * 31) + this.f4870b) * 31) + this.f4871c) * 31) + this.f4872d;
    }

    public final String toString() {
        return "Insets{left=" + this.f4869a + ", top=" + this.f4870b + ", right=" + this.f4871c + ", bottom=" + this.f4872d + '}';
    }
}
