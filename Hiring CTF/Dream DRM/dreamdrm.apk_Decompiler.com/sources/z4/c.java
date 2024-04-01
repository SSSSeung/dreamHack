package z4;

import b1.o;
import java.util.concurrent.TimeUnit;

public final class c {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f5974n = 0;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5975a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5976b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5977c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5978d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5979e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5980f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5981g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5982h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5983i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f5984j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f5985k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f5986l;

    /* renamed from: m  reason: collision with root package name */
    public String f5987m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        o.m(timeUnit, "timeUnit");
        timeUnit.toSeconds((long) Integer.MAX_VALUE);
    }

    public c(boolean z5, boolean z6, int i3, int i6, boolean z7, boolean z8, boolean z9, int i7, int i8, boolean z10, boolean z11, boolean z12, String str) {
        this.f5975a = z5;
        this.f5976b = z6;
        this.f5977c = i3;
        this.f5978d = i6;
        this.f5979e = z7;
        this.f5980f = z8;
        this.f5981g = z9;
        this.f5982h = i7;
        this.f5983i = i8;
        this.f5984j = z10;
        this.f5985k = z11;
        this.f5986l = z12;
        this.f5987m = str;
    }

    public final String toString() {
        String str = this.f5987m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f5975a) {
            sb.append("no-cache, ");
        }
        if (this.f5976b) {
            sb.append("no-store, ");
        }
        int i3 = this.f5977c;
        if (i3 != -1) {
            sb.append("max-age=");
            sb.append(i3);
            sb.append(", ");
        }
        int i6 = this.f5978d;
        if (i6 != -1) {
            sb.append("s-maxage=");
            sb.append(i6);
            sb.append(", ");
        }
        if (this.f5979e) {
            sb.append("private, ");
        }
        if (this.f5980f) {
            sb.append("public, ");
        }
        if (this.f5981g) {
            sb.append("must-revalidate, ");
        }
        int i7 = this.f5982h;
        if (i7 != -1) {
            sb.append("max-stale=");
            sb.append(i7);
            sb.append(", ");
        }
        int i8 = this.f5983i;
        if (i8 != -1) {
            sb.append("min-fresh=");
            sb.append(i8);
            sb.append(", ");
        }
        if (this.f5984j) {
            sb.append("only-if-cached, ");
        }
        if (this.f5985k) {
            sb.append("no-transform, ");
        }
        if (this.f5986l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        o.l(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f5987m = sb2;
        return sb2;
    }
}
