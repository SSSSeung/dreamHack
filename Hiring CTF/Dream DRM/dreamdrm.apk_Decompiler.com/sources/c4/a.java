package c4;

import a2.m;
import java.io.Closeable;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import x3.d;

public class a implements Closeable {

    /* renamed from: d  reason: collision with root package name */
    public final Reader f1640d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1641e = false;

    /* renamed from: f  reason: collision with root package name */
    public final char[] f1642f = new char[1024];

    /* renamed from: g  reason: collision with root package name */
    public int f1643g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f1644h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f1645i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f1646j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f1647k = 0;

    /* renamed from: l  reason: collision with root package name */
    public long f1648l;

    /* renamed from: m  reason: collision with root package name */
    public int f1649m;

    /* renamed from: n  reason: collision with root package name */
    public String f1650n;

    /* renamed from: o  reason: collision with root package name */
    public int[] f1651o;

    /* renamed from: p  reason: collision with root package name */
    public int f1652p;

    /* renamed from: q  reason: collision with root package name */
    public String[] f1653q;

    /* renamed from: r  reason: collision with root package name */
    public int[] f1654r;

    static {
        d.f5715d = new d();
    }

    public a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f1651o = iArr;
        this.f1652p = 1;
        iArr[0] = 6;
        this.f1653q = new String[32];
        this.f1654r = new int[32];
        this.f1640d = stringReader;
    }

    public final String C(boolean z5) {
        StringBuilder sb = new StringBuilder("$");
        int i3 = 0;
        while (true) {
            int i6 = this.f1652p;
            if (i3 >= i6) {
                return sb.toString();
            }
            int i7 = this.f1651o[i3];
            if (i7 == 1 || i7 == 2) {
                int i8 = this.f1654r[i3];
                if (z5 && i8 > 0 && i3 == i6 - 1) {
                    i8--;
                }
                sb.append('[');
                sb.append(i8);
                sb.append(']');
            } else if (i7 == 3 || i7 == 4 || i7 == 5) {
                sb.append('.');
                String str = this.f1653q[i3];
                if (str != null) {
                    sb.append(str);
                }
            }
            i3++;
        }
    }

    public final boolean D() {
        int i3 = this.f1647k;
        if (i3 == 0) {
            i3 = l();
        }
        return (i3 == 2 || i3 == 4 || i3 == 17) ? false : true;
    }

    public final boolean E(char c6) {
        if (c6 == 9 || c6 == 10 || c6 == 12 || c6 == 13 || c6 == ' ') {
            return false;
        }
        if (c6 != '#') {
            if (c6 == ',') {
                return false;
            }
            if (!(c6 == '/' || c6 == '=')) {
                if (c6 == '{' || c6 == '}' || c6 == ':') {
                    return false;
                }
                if (c6 != ';') {
                    switch (c6) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        i();
        return false;
    }

    public final String F() {
        return " at line " + (this.f1645i + 1) + " column " + ((this.f1643g - this.f1646j) + 1) + " path " + C(false);
    }

    public final boolean G() {
        int i3 = this.f1647k;
        if (i3 == 0) {
            i3 = l();
        }
        if (i3 == 5) {
            this.f1647k = 0;
            int[] iArr = this.f1654r;
            int i6 = this.f1652p - 1;
            iArr[i6] = iArr[i6] + 1;
            return true;
        } else if (i3 == 6) {
            this.f1647k = 0;
            int[] iArr2 = this.f1654r;
            int i7 = this.f1652p - 1;
            iArr2[i7] = iArr2[i7] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + m.w(Q()) + F());
        }
    }

    public final double H() {
        String str;
        int i3 = this.f1647k;
        if (i3 == 0) {
            i3 = l();
        }
        if (i3 == 15) {
            this.f1647k = 0;
            int[] iArr = this.f1654r;
            int i6 = this.f1652p - 1;
            iArr[i6] = iArr[i6] + 1;
            return (double) this.f1648l;
        }
        if (i3 == 16) {
            this.f1650n = new String(this.f1642f, this.f1643g, this.f1649m);
            this.f1643g += this.f1649m;
        } else {
            if (i3 == 8 || i3 == 9) {
                str = N(i3 == 8 ? '\'' : '\"');
            } else if (i3 == 10) {
                str = P();
            } else if (i3 != 11) {
                throw new IllegalStateException("Expected a double but was " + m.w(Q()) + F());
            }
            this.f1650n = str;
        }
        this.f1647k = 11;
        double parseDouble = Double.parseDouble(this.f1650n);
        if (this.f1641e || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f1650n = null;
            this.f1647k = 0;
            int[] iArr2 = this.f1654r;
            int i7 = this.f1652p - 1;
            iArr2[i7] = iArr2[i7] + 1;
            return parseDouble;
        }
        throw new c("JSON forbids NaN and infinities: " + parseDouble + F());
    }

    public final int I() {
        String N;
        int i3 = this.f1647k;
        if (i3 == 0) {
            i3 = l();
        }
        if (i3 == 15) {
            long j6 = this.f1648l;
            int i6 = (int) j6;
            if (j6 == ((long) i6)) {
                this.f1647k = 0;
                int[] iArr = this.f1654r;
                int i7 = this.f1652p - 1;
                iArr[i7] = iArr[i7] + 1;
                return i6;
            }
            throw new NumberFormatException("Expected an int but was " + this.f1648l + F());
        }
        if (i3 == 16) {
            this.f1650n = new String(this.f1642f, this.f1643g, this.f1649m);
            this.f1643g += this.f1649m;
        } else if (i3 == 8 || i3 == 9 || i3 == 10) {
            if (i3 == 10) {
                N = P();
            } else {
                N = N(i3 == 8 ? '\'' : '\"');
            }
            this.f1650n = N;
            try {
                int parseInt = Integer.parseInt(this.f1650n);
                this.f1647k = 0;
                int[] iArr2 = this.f1654r;
                int i8 = this.f1652p - 1;
                iArr2[i8] = iArr2[i8] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + m.w(Q()) + F());
        }
        this.f1647k = 11;
        double parseDouble = Double.parseDouble(this.f1650n);
        int i9 = (int) parseDouble;
        if (((double) i9) == parseDouble) {
            this.f1650n = null;
            this.f1647k = 0;
            int[] iArr3 = this.f1654r;
            int i10 = this.f1652p - 1;
            iArr3[i10] = iArr3[i10] + 1;
            return i9;
        }
        throw new NumberFormatException("Expected an int but was " + this.f1650n + F());
    }

    public final long J() {
        String N;
        int i3 = this.f1647k;
        if (i3 == 0) {
            i3 = l();
        }
        if (i3 == 15) {
            this.f1647k = 0;
            int[] iArr = this.f1654r;
            int i6 = this.f1652p - 1;
            iArr[i6] = iArr[i6] + 1;
            return this.f1648l;
        }
        if (i3 == 16) {
            this.f1650n = new String(this.f1642f, this.f1643g, this.f1649m);
            this.f1643g += this.f1649m;
        } else if (i3 == 8 || i3 == 9 || i3 == 10) {
            if (i3 == 10) {
                N = P();
            } else {
                N = N(i3 == 8 ? '\'' : '\"');
            }
            this.f1650n = N;
            try {
                long parseLong = Long.parseLong(this.f1650n);
                this.f1647k = 0;
                int[] iArr2 = this.f1654r;
                int i7 = this.f1652p - 1;
                iArr2[i7] = iArr2[i7] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + m.w(Q()) + F());
        }
        this.f1647k = 11;
        double parseDouble = Double.parseDouble(this.f1650n);
        long j6 = (long) parseDouble;
        if (((double) j6) == parseDouble) {
            this.f1650n = null;
            this.f1647k = 0;
            int[] iArr3 = this.f1654r;
            int i8 = this.f1652p - 1;
            iArr3[i8] = iArr3[i8] + 1;
            return j6;
        }
        throw new NumberFormatException("Expected a long but was " + this.f1650n + F());
    }

    public final String K() {
        String str;
        char c6;
        int i3 = this.f1647k;
        if (i3 == 0) {
            i3 = l();
        }
        if (i3 == 14) {
            str = P();
        } else {
            if (i3 == 12) {
                c6 = '\'';
            } else if (i3 == 13) {
                c6 = '\"';
            } else {
                throw new IllegalStateException("Expected a name but was " + m.w(Q()) + F());
            }
            str = N(c6);
        }
        this.f1647k = 0;
        this.f1653q[this.f1652p - 1] = str;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r0 != '/') goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        r9.f1643g = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r3 != r1) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        r9.f1643g = r3 - 1;
        r1 = q(2);
        r9.f1643g++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0066, code lost:
        if (r1 != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        i();
        r1 = r9.f1643g;
        r3 = r4[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        if (r3 == '*') goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r3 == '/') goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0077, code lost:
        r9.f1643g = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
        r9.f1643g = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        if ((r9.f1643g + 2) <= r9.f1644h) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        if (q(2) == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0091, code lost:
        r0 = r9.f1643g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        if (r4[r0] != 10) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0097, code lost:
        r9.f1645i++;
        r9.f1646j = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
        if (r3 >= 2) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ae, code lost:
        if (r4[r9.f1643g + r3] == "*/".charAt(r3)) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b0, code lost:
        r9.f1643g++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b6, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b9, code lost:
        if (r2 == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c0, code lost:
        X("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c6, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c7, code lost:
        r9.f1643g = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cb, code lost:
        if (r0 != '#') goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cd, code lost:
        i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d5, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int L(boolean r10) {
        /*
            r9 = this;
        L_0x0000:
            int r0 = r9.f1643g
        L_0x0002:
            int r1 = r9.f1644h
        L_0x0004:
            r2 = 1
            if (r0 != r1) goto L_0x002f
            r9.f1643g = r0
            boolean r0 = r9.q(r2)
            if (r0 != 0) goto L_0x002b
            if (r10 != 0) goto L_0x0013
            r10 = -1
            return r10
        L_0x0013:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "End of input"
            r0.<init>(r1)
            java.lang.String r1 = r9.F()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x002b:
            int r0 = r9.f1643g
            int r1 = r9.f1644h
        L_0x002f:
            int r3 = r0 + 1
            char[] r4 = r9.f1642f
            char r0 = r4[r0]
            r5 = 10
            if (r0 != r5) goto L_0x0042
            int r0 = r9.f1645i
            int r0 = r0 + r2
            r9.f1645i = r0
            r9.f1646j = r3
            goto L_0x00d6
        L_0x0042:
            r6 = 32
            if (r0 == r6) goto L_0x00d6
            r6 = 13
            if (r0 == r6) goto L_0x00d6
            r6 = 9
            if (r0 != r6) goto L_0x0050
            goto L_0x00d6
        L_0x0050:
            r6 = 47
            if (r0 != r6) goto L_0x00c7
            r9.f1643g = r3
            r7 = 2
            if (r3 != r1) goto L_0x0069
            int r3 = r3 + -1
            r9.f1643g = r3
            boolean r1 = r9.q(r7)
            int r3 = r9.f1643g
            int r3 = r3 + r2
            r9.f1643g = r3
            if (r1 != 0) goto L_0x0069
            return r0
        L_0x0069:
            r9.i()
            int r1 = r9.f1643g
            char r3 = r4[r1]
            r8 = 42
            if (r3 == r8) goto L_0x007c
            if (r3 == r6) goto L_0x0077
            return r0
        L_0x0077:
            int r1 = r1 + 1
            r9.f1643g = r1
            goto L_0x00d0
        L_0x007c:
            int r1 = r1 + 1
            r9.f1643g = r1
        L_0x0080:
            int r0 = r9.f1643g
            int r0 = r0 + r7
            int r1 = r9.f1644h
            r3 = 0
            if (r0 <= r1) goto L_0x0091
            boolean r0 = r9.q(r7)
            if (r0 == 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r2 = r3
            goto L_0x00b9
        L_0x0091:
            int r0 = r9.f1643g
            char r1 = r4[r0]
            if (r1 != r5) goto L_0x00a1
            int r1 = r9.f1645i
            int r1 = r1 + r2
            r9.f1645i = r1
            int r0 = r0 + 1
            r9.f1646j = r0
            goto L_0x00b0
        L_0x00a1:
            if (r3 >= r7) goto L_0x00b9
            int r0 = r9.f1643g
            int r0 = r0 + r3
            char r0 = r4[r0]
            java.lang.String r1 = "*/"
            char r1 = r1.charAt(r3)
            if (r0 == r1) goto L_0x00b6
        L_0x00b0:
            int r0 = r9.f1643g
            int r0 = r0 + r2
            r9.f1643g = r0
            goto L_0x0080
        L_0x00b6:
            int r3 = r3 + 1
            goto L_0x00a1
        L_0x00b9:
            if (r2 == 0) goto L_0x00c0
            int r0 = r9.f1643g
            int r0 = r0 + r7
            goto L_0x0002
        L_0x00c0:
            java.lang.String r10 = "Unterminated comment"
            r9.X(r10)
            r10 = 0
            throw r10
        L_0x00c7:
            r9.f1643g = r3
            r1 = 35
            if (r0 != r1) goto L_0x00d5
            r9.i()
        L_0x00d0:
            r9.U()
            goto L_0x0000
        L_0x00d5:
            return r0
        L_0x00d6:
            r0 = r3
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.L(boolean):int");
    }

    public final void M() {
        int i3 = this.f1647k;
        if (i3 == 0) {
            i3 = l();
        }
        if (i3 == 7) {
            this.f1647k = 0;
            int[] iArr = this.f1654r;
            int i6 = this.f1652p - 1;
            iArr[i6] = iArr[i6] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + m.w(Q()) + F());
    }

    public final String N(char c6) {
        StringBuilder sb = null;
        while (true) {
            int i3 = this.f1643g;
            int i6 = this.f1644h;
            int i7 = i3;
            while (true) {
                char[] cArr = this.f1642f;
                if (i7 < i6) {
                    int i8 = i7 + 1;
                    char c7 = cArr[i7];
                    if (c7 == c6) {
                        this.f1643g = i8;
                        int i9 = (i8 - i3) - 1;
                        if (sb == null) {
                            return new String(cArr, i3, i9);
                        }
                        sb.append(cArr, i3, i9);
                        return sb.toString();
                    } else if (c7 == '\\') {
                        this.f1643g = i8;
                        int i10 = (i8 - i3) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i10 + 1) * 2, 16));
                        }
                        sb.append(cArr, i3, i10);
                        sb.append(S());
                    } else {
                        if (c7 == 10) {
                            this.f1645i++;
                            this.f1646j = i8;
                        }
                        i7 = i8;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i7 - i3) * 2, 16));
                    }
                    sb.append(cArr, i3, i7 - i3);
                    this.f1643g = i7;
                    if (!q(1)) {
                        X("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public final String O() {
        String str;
        char c6;
        int i3 = this.f1647k;
        if (i3 == 0) {
            i3 = l();
        }
        if (i3 == 10) {
            str = P();
        } else {
            if (i3 == 8) {
                c6 = '\'';
            } else if (i3 == 9) {
                c6 = '\"';
            } else if (i3 == 11) {
                str = this.f1650n;
                this.f1650n = null;
            } else if (i3 == 15) {
                str = Long.toString(this.f1648l);
            } else if (i3 == 16) {
                str = new String(this.f1642f, this.f1643g, this.f1649m);
                this.f1643g += this.f1649m;
            } else {
                throw new IllegalStateException("Expected a string but was " + m.w(Q()) + F());
            }
            str = N(c6);
        }
        this.f1647k = 0;
        int[] iArr = this.f1654r;
        int i6 = this.f1652p - 1;
        iArr[i6] = iArr[i6] + 1;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        i();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String P() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r1
        L_0x0003:
            int r3 = r7.f1643g
            int r4 = r3 + r2
            int r5 = r7.f1644h
            char[] r6 = r7.f1642f
            if (r4 >= r5) goto L_0x004e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005a
            r4 = 10
            if (r3 == r4) goto L_0x005a
            r4 = 12
            if (r3 == r4) goto L_0x005a
            r4 = 13
            if (r3 == r4) goto L_0x005a
            r4 = 32
            if (r3 == r4) goto L_0x005a
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005a
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005a
            r4 = 58
            if (r3 == r4) goto L_0x005a
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005a;
                case 92: goto L_0x004a;
                case 93: goto L_0x005a;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r7.i()
            goto L_0x005a
        L_0x004e:
            int r3 = r6.length
            if (r2 >= r3) goto L_0x005c
            int r3 = r2 + 1
            boolean r3 = r7.q(r3)
            if (r3 == 0) goto L_0x005a
            goto L_0x0003
        L_0x005a:
            r1 = r2
            goto L_0x007a
        L_0x005c:
            if (r0 != 0) goto L_0x0069
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L_0x0069:
            int r3 = r7.f1643g
            r0.append(r6, r3, r2)
            int r3 = r7.f1643g
            int r3 = r3 + r2
            r7.f1643g = r3
            r2 = 1
            boolean r2 = r7.q(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007a:
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f1643g
            r0.<init>(r6, r2, r1)
            goto L_0x008d
        L_0x0084:
            int r2 = r7.f1643g
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L_0x008d:
            int r2 = r7.f1643g
            int r2 = r2 + r1
            r7.f1643g = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.P():java.lang.String");
    }

    public final int Q() {
        int i3 = this.f1647k;
        if (i3 == 0) {
            i3 = l();
        }
        switch (i3) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void R(int i3) {
        int i6 = this.f1652p;
        int[] iArr = this.f1651o;
        if (i6 == iArr.length) {
            int i7 = i6 * 2;
            this.f1651o = Arrays.copyOf(iArr, i7);
            this.f1654r = Arrays.copyOf(this.f1654r, i7);
            this.f1653q = (String[]) Arrays.copyOf(this.f1653q, i7);
        }
        int[] iArr2 = this.f1651o;
        int i8 = this.f1652p;
        this.f1652p = i8 + 1;
        iArr2[i8] = i3;
    }

    public final char S() {
        int i3;
        int i6;
        if (this.f1643g != this.f1644h || q(1)) {
            int i7 = this.f1643g;
            int i8 = i7 + 1;
            this.f1643g = i8;
            char[] cArr = this.f1642f;
            char c6 = cArr[i7];
            if (c6 == 10) {
                this.f1645i++;
                this.f1646j = i8;
            } else if (!(c6 == '\"' || c6 == '\'' || c6 == '/' || c6 == '\\')) {
                if (c6 == 'b') {
                    return 8;
                }
                if (c6 == 'f') {
                    return 12;
                }
                if (c6 == 'n') {
                    return 10;
                }
                if (c6 == 'r') {
                    return 13;
                }
                if (c6 == 't') {
                    return 9;
                }
                if (c6 != 'u') {
                    X("Invalid escape sequence");
                    throw null;
                } else if (i8 + 4 <= this.f1644h || q(4)) {
                    int i9 = this.f1643g;
                    int i10 = i9 + 4;
                    char c7 = 0;
                    while (i9 < i10) {
                        char c8 = cArr[i9];
                        char c9 = (char) (c7 << 4);
                        if (c8 < '0' || c8 > '9') {
                            if (c8 >= 'a' && c8 <= 'f') {
                                i6 = c8 - 'a';
                            } else if (c8 < 'A' || c8 > 'F') {
                                throw new NumberFormatException("\\u".concat(new String(cArr, this.f1643g, 4)));
                            } else {
                                i6 = c8 - 'A';
                            }
                            i3 = i6 + 10;
                        } else {
                            i3 = c8 - '0';
                        }
                        c7 = (char) (i3 + c9);
                        i9++;
                    }
                    this.f1643g += 4;
                    return c7;
                } else {
                    X("Unterminated escape sequence");
                    throw null;
                }
            }
            return c6;
        }
        X("Unterminated escape sequence");
        throw null;
    }

    public final void T(char c6) {
        while (true) {
            int i3 = this.f1643g;
            int i6 = this.f1644h;
            while (true) {
                if (i3 < i6) {
                    int i7 = i3 + 1;
                    char c7 = this.f1642f[i3];
                    if (c7 == c6) {
                        this.f1643g = i7;
                        return;
                    } else if (c7 == '\\') {
                        this.f1643g = i7;
                        S();
                        break;
                    } else {
                        if (c7 == 10) {
                            this.f1645i++;
                            this.f1646j = i7;
                        }
                        i3 = i7;
                    }
                } else {
                    this.f1643g = i3;
                    if (!q(1)) {
                        X("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public final void U() {
        char c6;
        do {
            if (this.f1643g < this.f1644h || q(1)) {
                int i3 = this.f1643g;
                int i6 = i3 + 1;
                this.f1643g = i6;
                c6 = this.f1642f[i3];
                if (c6 == 10) {
                    this.f1645i++;
                    this.f1646j = i6;
                    return;
                }
            } else {
                return;
            }
        } while (c6 != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        i();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void V() {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f1643g
            int r2 = r1 + r0
            int r3 = r4.f1644h
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f1642f
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.i()
        L_0x004b:
            int r1 = r4.f1643g
            int r1 = r1 + r0
            r4.f1643g = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f1643g = r1
            r0 = 1
            boolean r0 = r4.q(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.V():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        r7.f1652p--;
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        r7.f1647k = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void W() {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r7.f1647k
            if (r2 != 0) goto L_0x000a
            int r2 = r7.l()
        L_0x000a:
            r3 = 34
            r4 = 39
            java.lang.String r5 = "<skipped>"
            r6 = 1
            switch(r2) {
                case 1: goto L_0x0068;
                case 2: goto L_0x005d;
                case 3: goto L_0x0059;
                case 4: goto L_0x0051;
                case 5: goto L_0x0014;
                case 6: goto L_0x0014;
                case 7: goto L_0x0014;
                case 8: goto L_0x004d;
                case 9: goto L_0x0049;
                case 10: goto L_0x0045;
                case 11: goto L_0x0014;
                case 12: goto L_0x0038;
                case 13: goto L_0x002b;
                case 14: goto L_0x001e;
                case 15: goto L_0x0014;
                case 16: goto L_0x0016;
                case 17: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x006e
        L_0x0015:
            return
        L_0x0016:
            int r2 = r7.f1643g
            int r3 = r7.f1649m
            int r2 = r2 + r3
            r7.f1643g = r2
            goto L_0x006e
        L_0x001e:
            r7.V()
            if (r1 != 0) goto L_0x006e
            java.lang.String[] r2 = r7.f1653q
            int r3 = r7.f1652p
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x006e
        L_0x002b:
            r7.T(r3)
            if (r1 != 0) goto L_0x006e
            java.lang.String[] r2 = r7.f1653q
            int r3 = r7.f1652p
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x006e
        L_0x0038:
            r7.T(r4)
            if (r1 != 0) goto L_0x006e
            java.lang.String[] r2 = r7.f1653q
            int r3 = r7.f1652p
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x006e
        L_0x0045:
            r7.V()
            goto L_0x006e
        L_0x0049:
            r7.T(r3)
            goto L_0x006e
        L_0x004d:
            r7.T(r4)
            goto L_0x006e
        L_0x0051:
            int r2 = r7.f1652p
            int r2 = r2 - r6
            r7.f1652p = r2
            int r1 = r1 + -1
            goto L_0x006e
        L_0x0059:
            r7.R(r6)
            goto L_0x006c
        L_0x005d:
            if (r1 != 0) goto L_0x0051
            java.lang.String[] r2 = r7.f1653q
            int r3 = r7.f1652p
            int r3 = r3 - r6
            r4 = 0
            r2[r3] = r4
            goto L_0x0051
        L_0x0068:
            r2 = 3
            r7.R(r2)
        L_0x006c:
            int r1 = r1 + 1
        L_0x006e:
            r7.f1647k = r0
            if (r1 > 0) goto L_0x0002
            int[] r0 = r7.f1654r
            int r1 = r7.f1652p
            int r1 = r1 - r6
            r2 = r0[r1]
            int r2 = r2 + r6
            r0[r1] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.W():void");
    }

    public final void X(String str) {
        throw new c(str + F());
    }

    public final void b() {
        int i3 = this.f1647k;
        if (i3 == 0) {
            i3 = l();
        }
        if (i3 == 3) {
            R(1);
            this.f1654r[this.f1652p - 1] = 0;
            this.f1647k = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + m.w(Q()) + F());
    }

    public final void close() {
        this.f1647k = 0;
        this.f1651o[0] = 8;
        this.f1652p = 1;
        this.f1640d.close();
    }

    public final void e() {
        int i3 = this.f1647k;
        if (i3 == 0) {
            i3 = l();
        }
        if (i3 == 1) {
            R(3);
            this.f1647k = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + m.w(Q()) + F());
    }

    public final void i() {
        if (!this.f1641e) {
            X("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0210, code lost:
        if (E(r5) != false) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0212, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0213, code lost:
        if (r3 != 2) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0215, code lost:
        if (r13 == false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x021b, code lost:
        if (r7 != Long.MIN_VALUE) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x021d, code lost:
        if (r12 == false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0221, code lost:
        if (r7 != 0) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0223, code lost:
        if (r12 != false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0225, code lost:
        if (r12 == false) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0228, code lost:
        r7 = -r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0229, code lost:
        r0.f1648l = r7;
        r0.f1643g += r11;
        r1 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0233, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0234, code lost:
        if (r3 == r1) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0237, code lost:
        if (r3 == 4) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x023a, code lost:
        if (r3 != 7) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x023c, code lost:
        r0.f1649m = r11;
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0240, code lost:
        r7 = r1;
        r0.f1647k = r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0182 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int l() {
        /*
            r18 = this;
            r0 = r18
            int[] r1 = r0.f1651o
            int r2 = r0.f1652p
            int r3 = r2 + -1
            r3 = r1[r3]
            r9 = 0
            r10 = 39
            r11 = 93
            r12 = 59
            r13 = 44
            r14 = 3
            r15 = 6
            char[] r6 = r0.f1642f
            r5 = 2
            r7 = 4
            r8 = 5
            r4 = 1
            if (r3 != r4) goto L_0x0025
            int r2 = r2 - r4
            r1[r2] = r5
        L_0x0020:
            r5 = 10
            r9 = 7
            goto L_0x00c5
        L_0x0025:
            if (r3 != r5) goto L_0x003e
            int r1 = r0.L(r4)
            if (r1 == r13) goto L_0x0020
            if (r1 == r12) goto L_0x003a
            if (r1 != r11) goto L_0x0034
            r0.f1647k = r7
            return r7
        L_0x0034:
            java.lang.String r1 = "Unterminated array"
            r0.X(r1)
            throw r9
        L_0x003a:
            r18.i()
            goto L_0x0020
        L_0x003e:
            r5 = 125(0x7d, float:1.75E-43)
            if (r3 == r14) goto L_0x02b9
            if (r3 != r8) goto L_0x0048
            r6 = r4
            r4 = 2
            goto L_0x02bb
        L_0x0048:
            if (r3 != r7) goto L_0x007a
            int r2 = r2 - r4
            r1[r2] = r8
            int r1 = r0.L(r4)
            r2 = 58
            if (r1 == r2) goto L_0x0020
            r2 = 61
            if (r1 != r2) goto L_0x0074
            r18.i()
            int r1 = r0.f1643g
            int r2 = r0.f1644h
            if (r1 < r2) goto L_0x0068
            boolean r1 = r0.q(r4)
            if (r1 == 0) goto L_0x0020
        L_0x0068:
            int r1 = r0.f1643g
            char r2 = r6[r1]
            r5 = 62
            if (r2 != r5) goto L_0x0020
            int r1 = r1 + r4
            r0.f1643g = r1
            goto L_0x0020
        L_0x0074:
            java.lang.String r1 = "Expected ':'"
            r0.X(r1)
            throw r9
        L_0x007a:
            if (r3 != r15) goto L_0x00c9
            boolean r1 = r0.f1641e
            if (r1 == 0) goto L_0x00bb
            r0.L(r4)
            int r1 = r0.f1643g
            int r1 = r1 - r4
            r0.f1643g = r1
            int r1 = r1 + r8
            int r2 = r0.f1644h
            if (r1 <= r2) goto L_0x0094
            boolean r1 = r0.q(r8)
            if (r1 != 0) goto L_0x0094
            goto L_0x00bb
        L_0x0094:
            int r1 = r0.f1643g
            char r2 = r6[r1]
            r9 = 41
            if (r2 != r9) goto L_0x00bb
            int r2 = r1 + 1
            char r2 = r6[r2]
            if (r2 != r11) goto L_0x00bb
            int r2 = r1 + 2
            char r2 = r6[r2]
            if (r2 != r5) goto L_0x00bb
            int r2 = r1 + 3
            char r2 = r6[r2]
            if (r2 != r10) goto L_0x00bb
            int r2 = r1 + 4
            char r2 = r6[r2]
            r5 = 10
            if (r2 == r5) goto L_0x00b7
            goto L_0x00bd
        L_0x00b7:
            int r1 = r1 + r8
            r0.f1643g = r1
            goto L_0x00bd
        L_0x00bb:
            r5 = 10
        L_0x00bd:
            int[] r1 = r0.f1651o
            int r2 = r0.f1652p
            int r2 = r2 - r4
            r9 = 7
            r1[r2] = r9
        L_0x00c5:
            r1 = 0
        L_0x00c6:
            r2 = 8
            goto L_0x00e7
        L_0x00c9:
            r5 = 10
            r9 = 7
            r1 = 0
            if (r3 != r9) goto L_0x00e3
            int r2 = r0.L(r1)
            r9 = -1
            if (r2 != r9) goto L_0x00da
            r4 = 17
            goto L_0x0313
        L_0x00da:
            r18.i()
            int r2 = r0.f1643g
            int r2 = r2 - r4
            r0.f1643g = r2
            goto L_0x00c6
        L_0x00e3:
            r2 = 8
            if (r3 == r2) goto L_0x02b1
        L_0x00e7:
            int r9 = r0.L(r4)
            r1 = 34
            if (r9 == r1) goto L_0x02ae
            if (r9 == r10) goto L_0x02a9
            if (r9 == r13) goto L_0x0290
            if (r9 == r12) goto L_0x0290
            r1 = 91
            if (r9 == r1) goto L_0x028d
            if (r9 == r11) goto L_0x0287
            r1 = 123(0x7b, float:1.72E-43)
            if (r9 == r1) goto L_0x0284
            int r1 = r0.f1643g
            int r1 = r1 - r4
            r0.f1643g = r1
            char r1 = r6[r1]
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto L_0x012c
            r2 = 84
            if (r1 != r2) goto L_0x010f
            goto L_0x012c
        L_0x010f:
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L_0x0126
            r2 = 70
            if (r1 != r2) goto L_0x0118
            goto L_0x0126
        L_0x0118:
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L_0x0120
            r2 = 78
            if (r1 != r2) goto L_0x0177
        L_0x0120:
            java.lang.String r1 = "null"
            java.lang.String r2 = "NULL"
            r9 = 7
            goto L_0x0131
        L_0x0126:
            java.lang.String r1 = "false"
            java.lang.String r2 = "FALSE"
            r9 = r15
            goto L_0x0131
        L_0x012c:
            java.lang.String r1 = "true"
            java.lang.String r2 = "TRUE"
            r9 = r8
        L_0x0131:
            int r3 = r1.length()
            r10 = r4
        L_0x0136:
            if (r10 >= r3) goto L_0x015d
            int r11 = r0.f1643g
            int r11 = r11 + r10
            int r12 = r0.f1644h
            if (r11 < r12) goto L_0x0148
            int r11 = r10 + 1
            boolean r11 = r0.q(r11)
            if (r11 != 0) goto L_0x0148
            goto L_0x0177
        L_0x0148:
            int r11 = r0.f1643g
            int r11 = r11 + r10
            char r11 = r6[r11]
            char r12 = r1.charAt(r10)
            if (r11 == r12) goto L_0x015a
            char r12 = r2.charAt(r10)
            if (r11 == r12) goto L_0x015a
            goto L_0x0177
        L_0x015a:
            int r10 = r10 + 1
            goto L_0x0136
        L_0x015d:
            int r1 = r0.f1643g
            int r1 = r1 + r3
            int r2 = r0.f1644h
            if (r1 < r2) goto L_0x016c
            int r1 = r3 + 1
            boolean r1 = r0.q(r1)
            if (r1 == 0) goto L_0x0179
        L_0x016c:
            int r1 = r0.f1643g
            int r1 = r1 + r3
            char r1 = r6[r1]
            boolean r1 = r0.E(r1)
            if (r1 == 0) goto L_0x0179
        L_0x0177:
            r9 = 0
            goto L_0x0180
        L_0x0179:
            int r1 = r0.f1643g
            int r1 = r1 + r3
            r0.f1643g = r1
            r0.f1647k = r9
        L_0x0180:
            if (r9 == 0) goto L_0x0183
            return r9
        L_0x0183:
            int r1 = r0.f1643g
            int r2 = r0.f1644h
            r9 = 0
            r13 = r4
            r7 = r9
            r3 = 0
            r11 = 0
            r12 = 0
        L_0x018e:
            int r5 = r1 + r11
            if (r5 != r2) goto L_0x01a5
            int r1 = r6.length
            if (r11 != r1) goto L_0x0197
            goto L_0x0268
        L_0x0197:
            int r1 = r11 + 1
            boolean r1 = r0.q(r1)
            if (r1 != 0) goto L_0x01a1
            goto L_0x0212
        L_0x01a1:
            int r1 = r0.f1643g
            int r2 = r0.f1644h
        L_0x01a5:
            int r5 = r1 + r11
            char r5 = r6[r5]
            r15 = 43
            if (r5 == r15) goto L_0x025e
            r15 = 69
            if (r5 == r15) goto L_0x0255
            r15 = 101(0x65, float:1.42E-43)
            if (r5 == r15) goto L_0x0255
            r15 = 45
            if (r5 == r15) goto L_0x024a
            r15 = 46
            if (r5 == r15) goto L_0x0244
            r15 = 48
            if (r5 < r15) goto L_0x020c
            r15 = 57
            if (r5 <= r15) goto L_0x01c6
            goto L_0x020c
        L_0x01c6:
            if (r3 == r4) goto L_0x0205
            if (r3 != 0) goto L_0x01cb
            goto L_0x0205
        L_0x01cb:
            r15 = 2
            if (r3 != r15) goto L_0x01f5
            int r15 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r15 != 0) goto L_0x01d4
            goto L_0x0268
        L_0x01d4:
            r16 = 10
            long r16 = r16 * r7
            int r5 = r5 + -48
            long r4 = (long) r5
            long r16 = r16 - r4
            r4 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x01ef
            if (r4 != 0) goto L_0x01ed
            int r4 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x01ed
            goto L_0x01ef
        L_0x01ed:
            r4 = 0
            goto L_0x01f0
        L_0x01ef:
            r4 = 1
        L_0x01f0:
            r13 = r13 & r4
            r7 = r16
            goto L_0x0262
        L_0x01f5:
            if (r3 != r14) goto L_0x01fa
            r3 = 4
            goto L_0x0262
        L_0x01fa:
            r4 = 5
            if (r3 == r4) goto L_0x0201
            r4 = 6
            if (r3 != r4) goto L_0x0262
            goto L_0x0202
        L_0x0201:
            r4 = 6
        L_0x0202:
            r3 = 7
            goto L_0x0262
        L_0x0205:
            r4 = 6
            int r5 = r5 + -48
            int r3 = -r5
            long r7 = (long) r3
            r3 = 2
            goto L_0x0262
        L_0x020c:
            boolean r1 = r0.E(r5)
            if (r1 != 0) goto L_0x0268
        L_0x0212:
            r1 = 2
            if (r3 != r1) goto L_0x0234
            if (r13 == 0) goto L_0x0233
            r1 = -9223372036854775808
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x021f
            if (r12 == 0) goto L_0x0233
        L_0x021f:
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x0225
            if (r12 != 0) goto L_0x0233
        L_0x0225:
            if (r12 == 0) goto L_0x0228
            goto L_0x0229
        L_0x0228:
            long r7 = -r7
        L_0x0229:
            r0.f1648l = r7
            int r1 = r0.f1643g
            int r1 = r1 + r11
            r0.f1643g = r1
            r1 = 15
            goto L_0x0240
        L_0x0233:
            r1 = 2
        L_0x0234:
            if (r3 == r1) goto L_0x023c
            r1 = 4
            if (r3 == r1) goto L_0x023c
            r5 = 7
            if (r3 != r5) goto L_0x0268
        L_0x023c:
            r0.f1649m = r11
            r1 = 16
        L_0x0240:
            r7 = r1
            r0.f1647k = r7
            goto L_0x0269
        L_0x0244:
            r4 = 2
            r5 = 7
            if (r3 != r4) goto L_0x0268
            r3 = r14
            goto L_0x0262
        L_0x024a:
            r4 = 2
            r5 = 7
            if (r3 != 0) goto L_0x0251
            r3 = 1
            r12 = 1
            goto L_0x0262
        L_0x0251:
            r5 = 5
            if (r3 != r5) goto L_0x0268
            goto L_0x0261
        L_0x0255:
            r4 = 2
            r5 = 5
            if (r3 == r4) goto L_0x025c
            r4 = 4
            if (r3 != r4) goto L_0x0268
        L_0x025c:
            r3 = r5
            goto L_0x0262
        L_0x025e:
            r5 = 5
            if (r3 != r5) goto L_0x0268
        L_0x0261:
            r3 = 6
        L_0x0262:
            int r11 = r11 + 1
            r4 = 1
            r15 = 6
            goto L_0x018e
        L_0x0268:
            r7 = 0
        L_0x0269:
            if (r7 == 0) goto L_0x026c
            return r7
        L_0x026c:
            int r1 = r0.f1643g
            char r1 = r6[r1]
            boolean r1 = r0.E(r1)
            if (r1 == 0) goto L_0x027d
            r18.i()
            r4 = 10
            goto L_0x0313
        L_0x027d:
            java.lang.String r1 = "Expected value"
            r0.X(r1)
            r1 = 0
            throw r1
        L_0x0284:
            r4 = 1
            goto L_0x0313
        L_0x0287:
            r1 = r4
            if (r3 != r1) goto L_0x0291
            r5 = 4
            goto L_0x0304
        L_0x028d:
            r0.f1647k = r14
            return r14
        L_0x0290:
            r1 = r4
        L_0x0291:
            if (r3 == r1) goto L_0x029e
            r4 = 2
            if (r3 != r4) goto L_0x0297
            goto L_0x029e
        L_0x0297:
            java.lang.String r1 = "Unexpected value"
            r0.X(r1)
            r1 = 0
            throw r1
        L_0x029e:
            r18.i()
            int r2 = r0.f1643g
            int r2 = r2 - r1
            r0.f1643g = r2
            r4 = 7
            goto L_0x0313
        L_0x02a9:
            r18.i()
            r4 = r2
            goto L_0x0313
        L_0x02ae:
            r4 = 9
            goto L_0x0313
        L_0x02b1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x02b9:
            r4 = 2
            r6 = 1
        L_0x02bb:
            int r2 = r2 - r6
            r7 = 4
            r1[r2] = r7
            r1 = 5
            if (r3 != r1) goto L_0x02d9
            int r1 = r0.L(r6)
            if (r1 == r13) goto L_0x02d7
            if (r1 == r12) goto L_0x02d4
            if (r1 != r5) goto L_0x02cd
            goto L_0x0313
        L_0x02cd:
            java.lang.String r1 = "Unterminated object"
            r0.X(r1)
            r1 = 0
            throw r1
        L_0x02d4:
            r18.i()
        L_0x02d7:
            r1 = 1
            goto L_0x02da
        L_0x02d9:
            r1 = r6
        L_0x02da:
            int r2 = r0.L(r1)
            r6 = 34
            if (r2 == r6) goto L_0x0311
            if (r2 == r10) goto L_0x030b
            java.lang.String r6 = "Expected name"
            if (r2 == r5) goto L_0x02ff
            r18.i()
            int r3 = r0.f1643g
            int r3 = r3 - r1
            r0.f1643g = r3
            char r1 = (char) r2
            boolean r1 = r0.E(r1)
            if (r1 == 0) goto L_0x02fa
            r4 = 14
            goto L_0x0313
        L_0x02fa:
            r0.X(r6)
            r1 = 0
            throw r1
        L_0x02ff:
            r1 = 0
            r2 = 5
            if (r3 == r2) goto L_0x0307
            r5 = r4
        L_0x0304:
            r0.f1647k = r5
            return r5
        L_0x0307:
            r0.X(r6)
            throw r1
        L_0x030b:
            r18.i()
            r4 = 12
            goto L_0x0313
        L_0x0311:
            r4 = 13
        L_0x0313:
            r0.f1647k = r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.l():int");
    }

    public final void n() {
        int i3 = this.f1647k;
        if (i3 == 0) {
            i3 = l();
        }
        if (i3 == 4) {
            int i6 = this.f1652p - 1;
            this.f1652p = i6;
            int[] iArr = this.f1654r;
            int i7 = i6 - 1;
            iArr[i7] = iArr[i7] + 1;
            this.f1647k = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + m.w(Q()) + F());
    }

    public final void p() {
        int i3 = this.f1647k;
        if (i3 == 0) {
            i3 = l();
        }
        if (i3 == 2) {
            int i6 = this.f1652p - 1;
            this.f1652p = i6;
            this.f1653q[i6] = null;
            int[] iArr = this.f1654r;
            int i7 = i6 - 1;
            iArr[i7] = iArr[i7] + 1;
            this.f1647k = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + m.w(Q()) + F());
    }

    public final boolean q(int i3) {
        int i6;
        int i7;
        int i8 = this.f1646j;
        int i9 = this.f1643g;
        this.f1646j = i8 - i9;
        int i10 = this.f1644h;
        char[] cArr = this.f1642f;
        if (i10 != i9) {
            int i11 = i10 - i9;
            this.f1644h = i11;
            System.arraycopy(cArr, i9, cArr, 0, i11);
        } else {
            this.f1644h = 0;
        }
        this.f1643g = 0;
        do {
            int i12 = this.f1644h;
            int read = this.f1640d.read(cArr, i12, cArr.length - i12);
            if (read == -1) {
                return false;
            }
            i6 = this.f1644h + read;
            this.f1644h = i6;
            if (this.f1645i == 0 && (i7 = this.f1646j) == 0 && i6 > 0 && cArr[0] == 65279) {
                this.f1643g++;
                this.f1646j = i7 + 1;
                i3++;
                continue;
            }
        } while (i6 < i3);
        return true;
    }

    public final String toString() {
        return a.class.getSimpleName() + F();
    }
}
