package p;

import b1.o;
import b1.v;
import g4.h;
import g4.i;
import i4.d;
import java.util.ArrayList;
import java.util.Iterator;
import u4.g;

public final class e implements Iterable {

    /* renamed from: h  reason: collision with root package name */
    public static final e f4364h = new e(0, 0, 0, (int[]) null);

    /* renamed from: d  reason: collision with root package name */
    public final long f4365d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4366e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4367f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f4368g;

    public e(long j6, long j7, int i3, int[] iArr) {
        this.f4365d = j6;
        this.f4366e = j7;
        this.f4367f = i3;
        this.f4368g = iArr;
    }

    public final boolean a(int i3) {
        int[] iArr;
        int i6 = i3 - this.f4367f;
        boolean z5 = true;
        if (i6 >= 0 && i6 < 64) {
            return ((1 << i6) & this.f4366e) != 0;
        }
        if (i6 >= 64 && i6 < 128) {
            return ((1 << (i6 - 64)) & this.f4365d) != 0;
        }
        if (i6 > 0 || (iArr = this.f4368g) == null) {
            return false;
        }
        if (com.bumptech.glide.e.d(iArr, i3) < 0) {
            z5 = false;
        }
        return z5;
    }

    public final e b() {
        int i3;
        long j6;
        int i6 = this.f4367f;
        int i7 = 1 - i6;
        long j7 = this.f4366e;
        if (i7 < 0 || i7 >= 64) {
            long j8 = this.f4365d;
            if (i7 < 64 || i7 >= 128) {
                int i8 = 0;
                int[] iArr = this.f4368g;
                if (i7 >= 128) {
                    if (!a(1)) {
                        int i9 = this.f4367f;
                        ArrayList<Number> arrayList = null;
                        long j9 = j8;
                        while (true) {
                            if (i9 >= 0) {
                                i3 = i9;
                                j6 = j7;
                                break;
                            }
                            if (j7 != 0) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList<>();
                                    if (iArr != null) {
                                        for (int valueOf : iArr) {
                                            arrayList.add(Integer.valueOf(valueOf));
                                        }
                                    }
                                }
                                for (int i10 = 0; i10 < 64; i10++) {
                                    if (((1 << i10) & j7) != 0) {
                                        arrayList.add(Integer.valueOf(i10 + i9));
                                    }
                                }
                            }
                            if (j9 == 0) {
                                j6 = 0;
                                i3 = 0;
                                break;
                            }
                            i9 += 64;
                            j7 = j9;
                            j9 = 0;
                        }
                        if (arrayList != null) {
                            iArr = new int[arrayList.size()];
                            for (Number intValue : arrayList) {
                                iArr[i8] = intValue.intValue();
                                i8++;
                            }
                        }
                        return new e(j9, j6, i3, iArr).b();
                    }
                } else if (iArr == null) {
                    return new e(j8, j7, i6, new int[]{1});
                } else {
                    int d6 = com.bumptech.glide.e.d(iArr, 1);
                    if (d6 < 0) {
                        int i11 = -(d6 + 1);
                        int length = iArr.length + 1;
                        int[] iArr2 = new int[length];
                        h.Y(0, 0, i11, iArr, iArr2);
                        h.Y(i11 + 1, i11, length - 1, iArr, iArr2);
                        iArr2[i11] = 1;
                        return new e(this.f4365d, this.f4366e, this.f4367f, iArr2);
                    }
                }
            } else {
                long j10 = 1 << (i7 - 64);
                if ((j8 & j10) == 0) {
                    return new e(j8 | j10, j7, i6, this.f4368g);
                }
            }
        } else {
            long j11 = 1 << i7;
            if ((j7 & j11) == 0) {
                return new e(this.f4365d, j7 | j11, i6, this.f4368g);
            }
        }
        return this;
    }

    public final Iterator iterator() {
        d dVar = new d(this, (d) null);
        g gVar = new g();
        gVar.f5352g = v.q(gVar, gVar, dVar);
        return gVar;
    }

    public final String toString() {
        CharSequence charSequence;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(i.W(this));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        int size = arrayList.size();
        int i3 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = arrayList.get(i6);
            boolean z5 = true;
            i3++;
            if (i3 > 1) {
                sb2.append(", ");
            }
            if (obj != null) {
                z5 = obj instanceof CharSequence;
            }
            if (z5) {
                charSequence = (CharSequence) obj;
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                charSequence = String.valueOf(obj);
            }
            sb2.append(charSequence);
        }
        sb2.append("");
        String sb3 = sb2.toString();
        o.l(sb3, "fastJoinTo(StringBuilder…form)\n        .toString()");
        sb.append(sb3);
        sb.append(']');
        return sb.toString();
    }
}
