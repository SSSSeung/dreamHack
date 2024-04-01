package z4;

import b1.o;
import b1.v;
import f4.c;
import g4.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import s4.a;
import v4.i;
import x0.a1;

public final class r implements Iterable {

    /* renamed from: d  reason: collision with root package name */
    public final String[] f6060d;

    public r(String[] strArr) {
        this.f6060d = strArr;
    }

    public final String a(String str) {
        o.m(str, "name");
        String[] strArr = this.f6060d;
        a R = v.R(new a(strArr.length - 2, 0, -1), 2);
        int i3 = R.f5073d;
        int i6 = R.f5074e;
        int i7 = R.f5075f;
        if (i7 < 0 ? i3 >= i6 : i3 <= i6) {
            while (!i.T(str, strArr[i3])) {
                if (i3 != i6) {
                    i3 += i7;
                }
            }
            return strArr[i3 + 1];
        }
        return null;
    }

    public final String b(int i3) {
        return this.f6060d[i3 * 2];
    }

    public final q c() {
        q qVar = new q();
        ArrayList arrayList = qVar.f6059a;
        o.m(arrayList, "<this>");
        String[] strArr = this.f6060d;
        o.m(strArr, "elements");
        arrayList.addAll(h.W(strArr));
        return qVar;
    }

    public final String d(int i3) {
        return this.f6060d[(i3 * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            if (Arrays.equals(this.f6060d, ((r) obj).f6060d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6060d);
    }

    public final Iterator iterator() {
        int length = this.f6060d.length / 2;
        c[] cVarArr = new c[length];
        for (int i3 = 0; i3 < length; i3++) {
            cVarArr[i3] = new c(b(i3), d(i3));
        }
        return new a1((Object[]) cVarArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f6060d.length / 2;
        for (int i3 = 0; i3 < length; i3++) {
            sb.append(b(i3));
            sb.append(": ");
            sb.append(d(i3));
            sb.append("\n");
        }
        String sb2 = sb.toString();
        o.l(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
