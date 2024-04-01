package com.bumptech.glide.load.data;

import b2.h;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class c extends OutputStream {

    /* renamed from: d  reason: collision with root package name */
    public final OutputStream f1759d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f1760e;

    /* renamed from: f  reason: collision with root package name */
    public final h f1761f;

    /* renamed from: g  reason: collision with root package name */
    public int f1762g;

    public c(FileOutputStream fileOutputStream, h hVar) {
        this.f1759d = fileOutputStream;
        this.f1761f = hVar;
        this.f1760e = (byte[]) hVar.c(65536, byte[].class);
    }

    /* JADX INFO: finally extract failed */
    public final void close() {
        OutputStream outputStream = this.f1759d;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f1760e;
            if (bArr != null) {
                this.f1761f.g(bArr);
                this.f1760e = null;
            }
        } catch (Throwable th) {
            outputStream.close();
            throw th;
        }
    }

    public final void flush() {
        int i3 = this.f1762g;
        OutputStream outputStream = this.f1759d;
        if (i3 > 0) {
            outputStream.write(this.f1760e, 0, i3);
            this.f1762g = 0;
        }
        outputStream.flush();
    }

    public final void write(int i3) {
        byte[] bArr = this.f1760e;
        int i6 = this.f1762g;
        int i7 = i6 + 1;
        this.f1762g = i7;
        bArr[i6] = (byte) i3;
        if (i7 == bArr.length && i7 > 0) {
            this.f1759d.write(bArr, 0, i7);
            this.f1762g = 0;
        }
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i3, int i6) {
        int i7 = 0;
        do {
            int i8 = i6 - i7;
            int i9 = i3 + i7;
            int i10 = this.f1762g;
            OutputStream outputStream = this.f1759d;
            if (i10 != 0 || i8 < this.f1760e.length) {
                int min = Math.min(i8, this.f1760e.length - i10);
                System.arraycopy(bArr, i9, this.f1760e, this.f1762g, min);
                int i11 = this.f1762g + min;
                this.f1762g = i11;
                i7 += min;
                byte[] bArr2 = this.f1760e;
                if (i11 == bArr2.length && i11 > 0) {
                    outputStream.write(bArr2, 0, i11);
                    this.f1762g = 0;
                    continue;
                }
            } else {
                outputStream.write(bArr, i9, i8);
                return;
            }
        } while (i7 < i6);
    }
}
