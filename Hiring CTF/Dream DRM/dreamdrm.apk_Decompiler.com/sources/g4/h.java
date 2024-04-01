package g4;

import b1.o;
import b1.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import kotlinx.coroutines.internal.r;

public abstract class h extends v {
    public static final List W(Object[] objArr) {
        o.m(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        o.l(asList, "asList(this)");
        return asList;
    }

    public static final void X(int i3, int i6, int i7, byte[] bArr, byte[] bArr2) {
        o.m(bArr, "<this>");
        o.m(bArr2, "destination");
        System.arraycopy(bArr, i6, bArr2, i3, i7 - i6);
    }

    public static final void Y(int i3, int i6, int i7, int[] iArr, int[] iArr2) {
        o.m(iArr, "<this>");
        o.m(iArr2, "destination");
        System.arraycopy(iArr, i6, iArr2, i3, i7 - i6);
    }

    public static final void Z(Object[] objArr, Object[] objArr2, int i3, int i6, int i7) {
        o.m(objArr, "<this>");
        o.m(objArr2, "destination");
        System.arraycopy(objArr, i6, objArr2, i3, i7 - i6);
    }

    public static /* synthetic */ void b0(Object[] objArr, Object[] objArr2, int i3, int i6, int i7, int i8) {
        if ((i8 & 2) != 0) {
            i3 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = objArr.length;
        }
        Z(objArr, objArr2, i3, i6, i7);
    }

    public static void c0(Object[] objArr, r rVar) {
        int length = objArr.length;
        o.m(objArr, "<this>");
        Arrays.fill(objArr, 0, length, rVar);
    }

    public static final ArrayList d0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final char e0(char[] cArr) {
        o.m(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }
}
