package d0;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f2138b = {18, 20, 17, 15};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f2139c = {65535, 262143, 32767, 8191};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f2140d = {32767, 8191, 65535, 262143};

    /* renamed from: a  reason: collision with root package name */
    public final long f2141a;

    public /* synthetic */ a(long j6) {
        this.f2141a = j6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f2141a == ((a) obj).f2141a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2141a);
    }

    public final String toString() {
        int[] iArr = f2139c;
        long j6 = this.f2141a;
        int i3 = (int) (3 & j6);
        int i6 = iArr[i3] & ((int) (j6 >> 33));
        int i7 = i6 == 0 ? Integer.MAX_VALUE : i6 - 1;
        String str = "Infinity";
        String valueOf = i7 == Integer.MAX_VALUE ? str : String.valueOf(i7);
        int[] iArr2 = f2140d;
        int i8 = iArr2[i3];
        int[] iArr3 = f2138b;
        int i9 = i8 & ((int) (j6 >> (iArr3[i3] + 31)));
        int i10 = i9 == 0 ? Integer.MAX_VALUE : i9 - 1;
        if (i10 != Integer.MAX_VALUE) {
            str = String.valueOf(i10);
        }
        return "Constraints(minWidth = " + (iArr[i3] & ((int) (j6 >> 2))) + ", maxWidth = " + valueOf + ", minHeight = " + (iArr2[i3] & ((int) (j6 >> iArr3[i3]))) + ", maxHeight = " + str + ')';
    }
}
