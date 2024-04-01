package x1;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f5685a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f5686b;

    /* renamed from: c  reason: collision with root package name */
    public c f5687c;

    /* renamed from: d  reason: collision with root package name */
    public int f5688d = 0;

    public final boolean a() {
        return this.f5687c.f5675b != 0;
    }

    public final c b() {
        byte[] bArr;
        if (this.f5686b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (a()) {
            return this.f5687c;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < 6; i3++) {
                sb.append((char) c());
            }
            if (!sb.toString().startsWith("GIF")) {
                this.f5687c.f5675b = 1;
            } else {
                this.f5687c.f5679f = f();
                this.f5687c.f5680g = f();
                int c6 = c();
                c cVar = this.f5687c;
                cVar.f5681h = (c6 & 128) != 0;
                cVar.f5682i = (int) Math.pow(2.0d, (double) ((c6 & 7) + 1));
                this.f5687c.f5683j = c();
                c cVar2 = this.f5687c;
                c();
                cVar2.getClass();
                if (this.f5687c.f5681h && !a()) {
                    c cVar3 = this.f5687c;
                    cVar3.f5674a = e(cVar3.f5682i);
                    c cVar4 = this.f5687c;
                    cVar4.f5684k = cVar4.f5674a[cVar4.f5683j];
                }
            }
            if (!a()) {
                boolean z5 = false;
                while (!z5 && !a() && this.f5687c.f5676c <= Integer.MAX_VALUE) {
                    int c7 = c();
                    if (c7 == 33) {
                        int c8 = c();
                        if (c8 != 1) {
                            if (c8 == 249) {
                                this.f5687c.f5677d = new b();
                                c();
                                int c9 = c();
                                b bVar = this.f5687c.f5677d;
                                int i6 = (c9 & 28) >> 2;
                                bVar.f5669g = i6;
                                if (i6 == 0) {
                                    bVar.f5669g = 1;
                                }
                                bVar.f5668f = (c9 & 1) != 0;
                                int f6 = f();
                                if (f6 < 2) {
                                    f6 = 10;
                                }
                                b bVar2 = this.f5687c.f5677d;
                                bVar2.f5671i = f6 * 10;
                                bVar2.f5670h = c();
                                c();
                            } else if (c8 != 254 && c8 == 255) {
                                d();
                                StringBuilder sb2 = new StringBuilder();
                                int i7 = 0;
                                while (true) {
                                    bArr = this.f5685a;
                                    if (i7 >= 11) {
                                        break;
                                    }
                                    sb2.append((char) bArr[i7]);
                                    i7++;
                                }
                                if (sb2.toString().equals("NETSCAPE2.0")) {
                                    do {
                                        d();
                                        if (bArr[0] == 1) {
                                            byte b6 = bArr[1];
                                            byte b7 = bArr[2];
                                            this.f5687c.getClass();
                                        }
                                        if (this.f5688d <= 0) {
                                            break;
                                        }
                                    } while (a());
                                }
                            }
                        }
                        g();
                    } else if (c7 == 44) {
                        c cVar5 = this.f5687c;
                        if (cVar5.f5677d == null) {
                            cVar5.f5677d = new b();
                        }
                        cVar5.f5677d.f5663a = f();
                        this.f5687c.f5677d.f5664b = f();
                        this.f5687c.f5677d.f5665c = f();
                        this.f5687c.f5677d.f5666d = f();
                        int c10 = c();
                        boolean z6 = (c10 & 128) != 0;
                        int pow = (int) Math.pow(2.0d, (double) ((c10 & 7) + 1));
                        b bVar3 = this.f5687c.f5677d;
                        bVar3.f5667e = (c10 & 64) != 0;
                        if (z6) {
                            bVar3.f5673k = e(pow);
                        } else {
                            bVar3.f5673k = null;
                        }
                        this.f5687c.f5677d.f5672j = this.f5686b.position();
                        c();
                        g();
                        if (!a()) {
                            c cVar6 = this.f5687c;
                            cVar6.f5676c++;
                            cVar6.f5678e.add(cVar6.f5677d);
                        }
                    } else if (c7 != 59) {
                        this.f5687c.f5675b = 1;
                    } else {
                        z5 = true;
                    }
                }
                c cVar7 = this.f5687c;
                if (cVar7.f5676c < 0) {
                    cVar7.f5675b = 1;
                }
            }
            return this.f5687c;
        }
    }

    public final int c() {
        try {
            return this.f5686b.get() & 255;
        } catch (Exception unused) {
            this.f5687c.f5675b = 1;
            return 0;
        }
    }

    public final void d() {
        int c6 = c();
        this.f5688d = c6;
        if (c6 > 0) {
            int i3 = 0;
            int i6 = 0;
            while (true) {
                try {
                    int i7 = this.f5688d;
                    if (i3 < i7) {
                        i6 = i7 - i3;
                        this.f5686b.get(this.f5685a, i3, i6);
                        i3 += i6;
                    } else {
                        return;
                    }
                } catch (Exception e6) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i3 + " count: " + i6 + " blockSize: " + this.f5688d, e6);
                    }
                    this.f5687c.f5675b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i3) {
        byte[] bArr = new byte[(i3 * 3)];
        int[] iArr = null;
        try {
            this.f5686b.get(bArr);
            iArr = new int[256];
            int i6 = 0;
            int i7 = 0;
            while (i6 < i3) {
                int i8 = i7 + 1;
                int i9 = i8 + 1;
                int i10 = i9 + 1;
                int i11 = i6 + 1;
                iArr[i6] = ((bArr[i7] & 255) << 16) | -16777216 | ((bArr[i8] & 255) << 8) | (bArr[i9] & 255);
                i7 = i10;
                i6 = i11;
            }
        } catch (BufferUnderflowException e6) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e6);
            }
            this.f5687c.f5675b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f5686b.getShort();
    }

    public final void g() {
        int c6;
        do {
            c6 = c();
            this.f5686b.position(Math.min(this.f5686b.position() + c6, this.f5686b.limit()));
        } while (c6 > 0);
    }
}
