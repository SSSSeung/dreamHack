package z4;

import b1.o;
import e5.c;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public final class k {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f6035j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f6036k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f6037l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f6038m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    public final String f6039a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6040b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6041c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6042d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6043e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6044f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6045g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6046h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f6047i;

    public k(String str, String str2, long j6, String str3, String str4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f6039a = str;
        this.f6040b = str2;
        this.f6041c = j6;
        this.f6042d = str3;
        this.f6043e = str4;
        this.f6044f = z5;
        this.f6045g = z6;
        this.f6046h = z7;
        this.f6047i = z8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            return o.c(kVar.f6039a, this.f6039a) && o.c(kVar.f6040b, this.f6040b) && kVar.f6041c == this.f6041c && o.c(kVar.f6042d, this.f6042d) && o.c(kVar.f6043e, this.f6043e) && kVar.f6044f == this.f6044f && kVar.f6045g == this.f6045g && kVar.f6046h == this.f6046h && kVar.f6047i == this.f6047i;
        }
    }

    public final int hashCode() {
        int hashCode = this.f6040b.hashCode();
        int hashCode2 = Long.hashCode(this.f6041c);
        int hashCode3 = this.f6042d.hashCode();
        int hashCode4 = this.f6043e.hashCode();
        int hashCode5 = Boolean.hashCode(this.f6044f);
        int hashCode6 = Boolean.hashCode(this.f6045g);
        int hashCode7 = Boolean.hashCode(this.f6046h);
        return Boolean.hashCode(this.f6047i) + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f6039a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6039a);
        sb.append('=');
        sb.append(this.f6040b);
        if (this.f6046h) {
            long j6 = this.f6041c;
            if (j6 == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sb.append("; expires=");
                str = ((DateFormat) c.f2593a.get()).format(new Date(j6));
                o.l(str, "STANDARD_DATE_FORMAT.get().format(this)");
            }
            sb.append(str);
        }
        if (!this.f6047i) {
            sb.append("; domain=");
            sb.append(this.f6042d);
        }
        sb.append("; path=");
        sb.append(this.f6043e);
        if (this.f6044f) {
            sb.append("; secure");
        }
        if (this.f6045g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        o.l(sb2, "toString()");
        return sb2;
    }
}
