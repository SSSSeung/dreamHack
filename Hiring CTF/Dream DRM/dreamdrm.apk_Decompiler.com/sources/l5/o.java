package l5;

import g4.d;
import java.util.RandomAccess;

public final class o extends d implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public final j[] f4144d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f4145e;

    public o(j[] jVarArr, int[] iArr) {
        this.f4144d = jVarArr;
        this.f4145e = iArr;
    }

    public final int a() {
        return this.f4144d.length;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof j) {
            return super.contains((j) obj);
        }
        return false;
    }

    public final Object get(int i3) {
        return this.f4144d[i3];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof j) {
            return super.indexOf((j) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof j) {
            return super.lastIndexOf((j) obj);
        }
        return -1;
    }
}
