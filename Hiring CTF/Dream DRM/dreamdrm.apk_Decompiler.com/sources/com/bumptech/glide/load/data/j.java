package com.bumptech.glide.load.data;

import a2.m;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class j extends FilterInputStream {

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f1766f = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: g  reason: collision with root package name */
    public static final int f1767g = 31;

    /* renamed from: d  reason: collision with root package name */
    public final byte f1768d;

    /* renamed from: e  reason: collision with root package name */
    public int f1769e;

    public j(InputStream inputStream, int i3) {
        super(inputStream);
        if (i3 < -1 || i3 > 8) {
            throw new IllegalArgumentException(m.g("Cannot add invalid orientation: ", i3));
        }
        this.f1768d = (byte) i3;
    }

    public final void mark(int i3) {
        throw new UnsupportedOperationException();
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        int i3;
        int i6 = this.f1769e;
        int read = (i6 < 2 || i6 > (i3 = f1767g)) ? super.read() : i6 == i3 ? this.f1768d : f1766f[i6 - 2] & 255;
        if (read != -1) {
            this.f1769e++;
        }
        return read;
    }

    public final void reset() {
        throw new UnsupportedOperationException();
    }

    public final long skip(long j6) {
        long skip = super.skip(j6);
        if (skip > 0) {
            this.f1769e = (int) (((long) this.f1769e) + skip);
        }
        return skip;
    }

    public final int read(byte[] bArr, int i3, int i6) {
        int i7;
        int i8 = this.f1769e;
        int i9 = f1767g;
        if (i8 > i9) {
            i7 = super.read(bArr, i3, i6);
        } else if (i8 == i9) {
            bArr[i3] = this.f1768d;
            i7 = 1;
        } else if (i8 < 2) {
            i7 = super.read(bArr, i3, 2 - i8);
        } else {
            int min = Math.min(i9 - i8, i6);
            System.arraycopy(f1766f, this.f1769e - 2, bArr, i3, min);
            i7 = min;
        }
        if (i7 > 0) {
            this.f1769e += i7;
        }
        return i7;
    }
}
