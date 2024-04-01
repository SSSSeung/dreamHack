package x0;

import a2.m;
import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import g4.h;
import java.util.Locale;

public final class f implements e, g {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5563d;

    /* renamed from: e  reason: collision with root package name */
    public Object f5564e;

    /* renamed from: f  reason: collision with root package name */
    public int f5565f;

    /* renamed from: g  reason: collision with root package name */
    public int f5566g;

    /* renamed from: h  reason: collision with root package name */
    public Object f5567h;

    /* renamed from: i  reason: collision with root package name */
    public Cloneable f5568i;

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Cloneable, int[]] */
    public f() {
        this.f5563d = 2;
        this.f5564e = new int[16];
        this.f5567h = new int[16];
        ? r12 = new int[16];
        int i3 = 0;
        while (i3 < 16) {
            int i6 = i3 + 1;
            r12[i3] = i6;
            i3 = i6;
        }
        this.f5568i = r12;
    }

    public final h a() {
        return new h(new f(this));
    }

    public final void b(Bundle bundle) {
        this.f5568i = bundle;
    }

    public final void c(Uri uri) {
        this.f5567h = uri;
    }

    public final void d(int i3) {
        this.f5566g = i3;
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [java.lang.Cloneable, int[]] */
    public final int e(int i3) {
        int i6 = this.f5565f + 1;
        int[] iArr = (int[]) this.f5564e;
        int length = iArr.length;
        int i7 = 0;
        if (i6 > length) {
            int i8 = length * 2;
            int[] iArr2 = new int[i8];
            int[] iArr3 = new int[i8];
            h.Y(0, 0, iArr.length, iArr, iArr2);
            h.Y(0, 0, ((int[]) this.f5567h).length, (int[]) this.f5567h, iArr3);
            this.f5564e = iArr2;
            this.f5567h = iArr3;
        }
        int i9 = this.f5565f;
        this.f5565f = i9 + 1;
        int length2 = ((int[]) this.f5568i).length;
        if (this.f5566g >= length2) {
            int i10 = length2 * 2;
            ? r22 = new int[i10];
            while (i7 < i10) {
                int i11 = i7 + 1;
                r22[i7] = i11;
                i7 = i11;
            }
            h.Y(0, 0, ((int[]) this.f5568i).length, (int[]) this.f5568i, r22);
            this.f5568i = r22;
        }
        int i12 = this.f5566g;
        int[] iArr4 = (int[]) this.f5568i;
        this.f5566g = iArr4[i12];
        int[] iArr5 = (int[]) this.f5564e;
        iArr5[i9] = i3;
        ((int[]) this.f5567h)[i9] = i12;
        iArr4[i12] = i9;
        int i13 = iArr5[i9];
        while (i9 > 0) {
            int i14 = ((i9 + 1) >> 1) - 1;
            if (iArr5[i14] <= i13) {
                break;
            }
            int[] iArr6 = (int[]) this.f5564e;
            int[] iArr7 = (int[]) this.f5567h;
            int[] iArr8 = (int[]) this.f5568i;
            int i15 = iArr6[i14];
            iArr6[i14] = iArr6[i9];
            iArr6[i9] = i15;
            int i16 = iArr7[i14];
            iArr7[i14] = iArr7[i9];
            iArr7[i9] = i16;
            iArr8[iArr7[i14]] = i14;
            iArr8[iArr7[i9]] = i9;
            i9 = i14;
        }
        return i12;
    }

    public final ClipData f() {
        return (ClipData) this.f5564e;
    }

    public final int k() {
        return this.f5566g;
    }

    public final ContentInfo n() {
        return null;
    }

    public final int r() {
        return this.f5565f;
    }

    public final String toString() {
        String str;
        switch (this.f5563d) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f5564e).getDescription());
                sb.append(", source=");
                int i3 = this.f5565f;
                sb.append(i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? String.valueOf(i3) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i6 = this.f5566g;
                sb.append((i6 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i6));
                String str2 = "";
                if (((Uri) this.f5567h) == null) {
                    str = str2;
                } else {
                    str = ", hasLinkUri(" + ((Uri) this.f5567h).toString().length() + ")";
                }
                sb.append(str);
                if (((Bundle) this.f5568i) != null) {
                    str2 = ", hasExtras";
                }
                return m.j(sb, str2, "}");
            default:
                return super.toString();
        }
    }

    public f(ClipData clipData, int i3) {
        this.f5563d = 0;
        this.f5564e = clipData;
        this.f5565f = i3;
    }

    public f(f fVar) {
        this.f5563d = 1;
        ClipData clipData = (ClipData) fVar.f5564e;
        clipData.getClass();
        this.f5564e = clipData;
        int i3 = fVar.f5565f;
        if (i3 < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{"source", 0, 5}));
        } else if (i3 <= 5) {
            this.f5565f = i3;
            int i6 = fVar.f5566g;
            if ((i6 & 1) == i6) {
                this.f5566g = i6;
                this.f5567h = (Uri) fVar.f5567h;
                this.f5568i = (Bundle) fVar.f5568i;
                return;
            }
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i6) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{"source", 0, 5}));
        }
    }
}
