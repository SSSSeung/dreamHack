package e4;

import android.util.Base64;
import java.util.List;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f2588a = new int[256];

    /* renamed from: b  reason: collision with root package name */
    public int f2589b;

    /* renamed from: c  reason: collision with root package name */
    public int f2590c;

    public m(List list) {
        int[] iArr;
        int[] iArr2 = new int[256];
        int i3 = 0;
        while (true) {
            iArr = this.f2588a;
            if (i3 >= 256) {
                break;
            }
            iArr[i3] = i3;
            iArr2[i3] = ((Number) list.get(i3 % list.size())).intValue();
            i3++;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < 256; i7++) {
            int i8 = iArr[i7];
            i6 = ((i6 + i8) + iArr2[i7]) % 256;
            int i9 = iArr[i6];
            iArr[i6] = i8;
            iArr[i7] = i9;
        }
    }

    public final String a(String str) {
        byte[] decode = Base64.decode(str, 0);
        char[] cArr = new char[decode.length];
        int length = decode.length;
        for (int i3 = 0; i3 < length; i3++) {
            int i6 = (this.f2589b + 1) % 256;
            this.f2589b = i6;
            int i7 = this.f2590c;
            int[] iArr = this.f2588a;
            int i8 = iArr[i6];
            int i9 = (i7 + i8) % 256;
            this.f2590c = i9;
            int i10 = iArr[i9];
            iArr[i9] = i8;
            iArr[i6] = i10;
            cArr[i3] = (char) ((iArr[(i10 + iArr[i9]) % 256] ^ decode[i3]) & 255);
        }
        return new String(cArr);
    }
}
