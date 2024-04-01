package c4;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public class b implements Closeable, Flushable {

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f1655k = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f1656l = new String[128];

    /* renamed from: d  reason: collision with root package name */
    public final Writer f1657d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f1658e;

    /* renamed from: f  reason: collision with root package name */
    public int f1659f = 0;

    /* renamed from: g  reason: collision with root package name */
    public final String f1660g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1661h;

    /* renamed from: i  reason: collision with root package name */
    public String f1662i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f1663j;

    static {
        for (int i3 = 0; i3 <= 31; i3++) {
            f1656l[i3] = String.format("\\u%04x", new Object[]{Integer.valueOf(i3)});
        }
        String[] strArr = f1656l;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f1658e = iArr;
        if (iArr.length == 0) {
            this.f1658e = Arrays.copyOf(iArr, 0 * 2);
        }
        int[] iArr2 = this.f1658e;
        int i3 = this.f1659f;
        this.f1659f = i3 + 1;
        iArr2[i3] = 6;
        this.f1660g = ":";
        this.f1663j = true;
        Objects.requireNonNull(writer, "out == null");
        this.f1657d = writer;
    }

    public b C() {
        if (this.f1662i != null) {
            if (this.f1663j) {
                M();
            } else {
                this.f1662i = null;
                return this;
            }
        }
        b();
        this.f1657d.write("null");
        return this;
    }

    public final int D() {
        int i3 = this.f1659f;
        if (i3 != 0) {
            return this.f1658e[i3 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void E(int i3) {
        this.f1658e[this.f1659f - 1] = i3;
    }

    public final void F(String str) {
        String str2;
        Writer writer = this.f1657d;
        writer.write(34);
        int length = str.length();
        int i3 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if (charAt < 128) {
                str2 = f1656l[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i3 < i6) {
                writer.write(str, i3, i6 - i3);
            }
            writer.write(str2);
            i3 = i6 + 1;
        }
        if (i3 < length) {
            writer.write(str, i3, length - i3);
        }
        writer.write(34);
    }

    public void G(double d6) {
        M();
        if (this.f1661h || (!Double.isNaN(d6) && !Double.isInfinite(d6))) {
            b();
            this.f1657d.append(Double.toString(d6));
            return;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d6);
    }

    public void H(long j6) {
        M();
        b();
        this.f1657d.write(Long.toString(j6));
    }

    public void I(Boolean bool) {
        if (bool == null) {
            C();
            return;
        }
        M();
        b();
        this.f1657d.write(bool.booleanValue() ? "true" : "false");
    }

    public void J(Number number) {
        if (number == null) {
            C();
            return;
        }
        M();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!(cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class) && !f1655k.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f1661h) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        b();
        this.f1657d.append(obj);
    }

    public void K(String str) {
        if (str == null) {
            C();
            return;
        }
        M();
        b();
        F(str);
    }

    public void L(boolean z5) {
        M();
        b();
        this.f1657d.write(z5 ? "true" : "false");
    }

    public final void M() {
        if (this.f1662i != null) {
            int D = D();
            if (D == 5) {
                this.f1657d.write(44);
            } else if (D != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            E(4);
            F(this.f1662i);
            this.f1662i = null;
        }
    }

    public final void b() {
        int D = D();
        int i3 = 2;
        if (D != 1) {
            Writer writer = this.f1657d;
            if (D == 2) {
                writer.append(',');
                return;
            } else if (D != 4) {
                i3 = 7;
                if (D != 6) {
                    if (D != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    } else if (!this.f1661h) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
            } else {
                writer.append(this.f1660g);
                E(5);
                return;
            }
        }
        E(i3);
    }

    public void close() {
        this.f1657d.close();
        int i3 = this.f1659f;
        if (i3 > 1 || (i3 == 1 && this.f1658e[i3 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f1659f = 0;
    }

    public void e() {
        M();
        b();
        int i3 = this.f1659f;
        int[] iArr = this.f1658e;
        if (i3 == iArr.length) {
            this.f1658e = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f1658e;
        int i6 = this.f1659f;
        this.f1659f = i6 + 1;
        iArr2[i6] = 1;
        this.f1657d.write(91);
    }

    public void flush() {
        if (this.f1659f != 0) {
            this.f1657d.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public void i() {
        M();
        b();
        int i3 = this.f1659f;
        int[] iArr = this.f1658e;
        if (i3 == iArr.length) {
            this.f1658e = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f1658e;
        int i6 = this.f1659f;
        this.f1659f = i6 + 1;
        iArr2[i6] = 3;
        this.f1657d.write(123);
    }

    public final void l(int i3, int i6, char c6) {
        int D = D();
        if (D != i6 && D != i3) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f1662i == null) {
            this.f1659f--;
            this.f1657d.write(c6);
        } else {
            throw new IllegalStateException("Dangling name: " + this.f1662i);
        }
    }

    public void n() {
        l(1, 2, ']');
    }

    public void p() {
        l(3, 5, '}');
    }

    public void q(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f1662i != null) {
            throw new IllegalStateException();
        } else if (this.f1659f != 0) {
            this.f1662i = str;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }
}
