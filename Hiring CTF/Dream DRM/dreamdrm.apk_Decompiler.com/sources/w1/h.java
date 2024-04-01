package w1;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public final class h implements Closeable {

    /* renamed from: d  reason: collision with root package name */
    public final InputStream f5460d;

    /* renamed from: e  reason: collision with root package name */
    public final Charset f5461e;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f5462f;

    /* renamed from: g  reason: collision with root package name */
    public int f5463g;

    /* renamed from: h  reason: collision with root package name */
    public int f5464h;

    public h(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        } else if (charset.equals(i.f5465a)) {
            this.f5460d = fileInputStream;
            this.f5461e = charset;
            this.f5462f = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final String b() {
        int i3;
        synchronized (this.f5460d) {
            byte[] bArr = this.f5462f;
            if (bArr != null) {
                if (this.f5463g >= this.f5464h) {
                    int read = this.f5460d.read(bArr, 0, bArr.length);
                    if (read != -1) {
                        this.f5463g = 0;
                        this.f5464h = read;
                    } else {
                        throw new EOFException();
                    }
                }
                for (int i6 = this.f5463g; i6 != this.f5464h; i6++) {
                    byte[] bArr2 = this.f5462f;
                    if (bArr2[i6] == 10) {
                        int i7 = this.f5463g;
                        if (i6 != i7) {
                            i3 = i6 - 1;
                            if (bArr2[i3] == 13) {
                                String str = new String(bArr2, i7, i3 - i7, this.f5461e.name());
                                this.f5463g = i6 + 1;
                                return str;
                            }
                        }
                        i3 = i6;
                        String str2 = new String(bArr2, i7, i3 - i7, this.f5461e.name());
                        this.f5463g = i6 + 1;
                        return str2;
                    }
                }
                g gVar = new g(this, (this.f5464h - this.f5463g) + 80);
                while (true) {
                    byte[] bArr3 = this.f5462f;
                    int i8 = this.f5463g;
                    gVar.write(bArr3, i8, this.f5464h - i8);
                    this.f5464h = -1;
                    byte[] bArr4 = this.f5462f;
                    int read2 = this.f5460d.read(bArr4, 0, bArr4.length);
                    if (read2 != -1) {
                        this.f5463g = 0;
                        this.f5464h = read2;
                        int i9 = 0;
                        while (true) {
                            if (i9 != this.f5464h) {
                                byte[] bArr5 = this.f5462f;
                                if (bArr5[i9] == 10) {
                                    int i10 = this.f5463g;
                                    if (i9 != i10) {
                                        gVar.write(bArr5, i10, i9 - i10);
                                    }
                                    this.f5463g = i9 + 1;
                                    String gVar2 = gVar.toString();
                                    return gVar2;
                                }
                                i9++;
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            } else {
                throw new IOException("LineReader is closed");
            }
        }
    }

    public final void close() {
        synchronized (this.f5460d) {
            if (this.f5462f != null) {
                this.f5462f = null;
                this.f5460d.close();
            }
        }
    }
}
