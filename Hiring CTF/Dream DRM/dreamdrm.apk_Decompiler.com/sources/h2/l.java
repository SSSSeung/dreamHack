package h2;

import android.util.Log;
import androidx.emoji2.text.v;
import b1.o;
import b2.h;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import y1.d;
import y1.e;

public final class l implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f3407a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f3408b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bumptech.glide.load.ImageHeaderParser$ImageType d(h2.k r5) {
        /*
            int r0 = r5.c()     // Catch:{ j -> 0x00a0 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG     // Catch:{ j -> 0x00a0 }
            return r5
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r5.e()     // Catch:{ j -> 0x00a0 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF     // Catch:{ j -> 0x00a0 }
            return r5
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r5.e()     // Catch:{ j -> 0x00a0 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r5.a(r0)     // Catch:{ j -> 0x00a0 }
            short r5 = r5.e()     // Catch:{ j -> 0x0039 }
            r0 = 3
            if (r5 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A     // Catch:{ j -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG     // Catch:{ j -> 0x0039 }
        L_0x0038:
            return r5
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG     // Catch:{ j -> 0x00a0 }
            return r5
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x0044
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN     // Catch:{ j -> 0x00a0 }
            return r5
        L_0x0044:
            r0 = 4
            r5.a(r0)     // Catch:{ j -> 0x00a0 }
            int r2 = r5.c()     // Catch:{ j -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r5.c()     // Catch:{ j -> 0x00a0 }
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.16888601E14)
            if (r2 == r3) goto L_0x005c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN     // Catch:{ j -> 0x00a0 }
            return r5
        L_0x005c:
            int r2 = r5.c()     // Catch:{ j -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r5.c()     // Catch:{ j -> 0x00a0 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x0071
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN     // Catch:{ j -> 0x00a0 }
            return r5
        L_0x0071:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x0088
            r5.a(r0)     // Catch:{ j -> 0x00a0 }
            short r5 = r5.e()     // Catch:{ j -> 0x00a0 }
            r5 = r5 & 16
            if (r5 == 0) goto L_0x0085
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A     // Catch:{ j -> 0x00a0 }
            goto L_0x0087
        L_0x0085:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP     // Catch:{ j -> 0x00a0 }
        L_0x0087:
            return r5
        L_0x0088:
            r3 = 76
            if (r2 != r3) goto L_0x009d
            r5.a(r0)     // Catch:{ j -> 0x00a0 }
            short r5 = r5.e()     // Catch:{ j -> 0x00a0 }
            r5 = r5 & 8
            if (r5 == 0) goto L_0x009a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A     // Catch:{ j -> 0x00a0 }
            goto L_0x009c
        L_0x009a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP     // Catch:{ j -> 0x00a0 }
        L_0x009c:
            return r5
        L_0x009d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP     // Catch:{ j -> 0x00a0 }
            return r5
        L_0x00a0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.l.d(h2.k):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    public static int e(e eVar) {
        short e6;
        int c6;
        long j6;
        long a6;
        do {
            short e7 = eVar.e();
            if (e7 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + e7);
                }
                return -1;
            }
            e6 = eVar.e();
            if (e6 == 218) {
                return -1;
            }
            if (e6 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            c6 = eVar.c() - 2;
            if (e6 == 225) {
                return c6;
            }
            j6 = (long) c6;
            a6 = eVar.a(j6);
        } while (a6 == j6);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + e6 + ", wanted to skip: " + c6 + ", but actually skipped: " + a6);
        }
        return -1;
    }

    public static int f(e eVar, byte[] bArr, int i3) {
        ByteOrder byteOrder;
        String str;
        StringBuilder sb;
        StringBuilder sb2;
        int b6 = eVar.b(bArr, i3);
        if (b6 != i3) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i3 + ", actually read: " + b6);
            }
            return -1;
        }
        byte[] bArr2 = f3407a;
        short s5 = 1;
        boolean z5 = i3 > bArr2.length;
        if (z5) {
            int i6 = 0;
            while (true) {
                if (i6 >= bArr2.length) {
                    break;
                } else if (bArr[i6] != bArr2[i6]) {
                    z5 = false;
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (z5) {
            v vVar = new v(bArr, i3);
            short f6 = vVar.f(6);
            if (f6 != 18761) {
                if (f6 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + f6);
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            ByteBuffer byteBuffer = vVar.f1052a;
            byteBuffer.order(byteOrder);
            int i7 = (byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1) + 6;
            short f7 = vVar.f(i7);
            int i8 = 0;
            while (i8 < f7) {
                int i9 = (i8 * 12) + i7 + 2;
                short f8 = vVar.f(i9);
                if (f8 == 274) {
                    short f9 = vVar.f(i9 + 2);
                    if (f9 >= s5 && f9 <= 12) {
                        int i10 = i9 + 4;
                        if (byteBuffer.remaining() - i10 < 4) {
                            s5 = 0;
                        }
                        int i11 = s5 != 0 ? byteBuffer.getInt(i10) : -1;
                        if (i11 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got tagIndex=" + i8 + " tagType=" + f8 + " formatCode=" + f9 + " componentCount=" + i11);
                            }
                            int i12 = i11 + f3408b[f9];
                            if (i12 <= 4) {
                                int i13 = i9 + 8;
                                if (i13 < 0 || i13 > byteBuffer.remaining()) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        sb = new StringBuilder("Illegal tagValueOffset=");
                                        sb.append(i13);
                                        sb.append(" tagType=");
                                    }
                                } else if (i12 >= 0 && i12 + i13 <= byteBuffer.remaining()) {
                                    return vVar.f(i13);
                                } else {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        sb = new StringBuilder("Illegal number of bytes for TI tag data tagType=");
                                    }
                                }
                                sb.append(f8);
                                str = sb.toString();
                                Log.d("DfltImageHeaderParser", str);
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                sb2 = new StringBuilder("Got byte count > 4, not orientation, continuing, formatCode=");
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            str = "Negative tiff component count";
                            Log.d("DfltImageHeaderParser", str);
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        sb2 = new StringBuilder("Got invalid format code = ");
                    }
                    sb.append(f9);
                    str = sb.toString();
                    Log.d("DfltImageHeaderParser", str);
                }
                i8++;
                s5 = 1;
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        o.i(byteBuffer);
        return d(new v(2, byteBuffer));
    }

    public final ImageHeaderParser$ImageType b(InputStream inputStream) {
        o.i(inputStream);
        return d(new e(inputStream));
    }

    public final int c(InputStream inputStream, h hVar) {
        String str;
        byte[] bArr;
        o.i(inputStream);
        e eVar = new e(inputStream);
        o.i(hVar);
        try {
            int c6 = eVar.c();
            if ((c6 & 65496) == 65496 || c6 == 19789 || c6 == 18761) {
                int e6 = e(eVar);
                if (e6 != -1) {
                    bArr = (byte[]) hVar.c(e6, byte[].class);
                    int f6 = f(eVar, bArr, e6);
                    hVar.g(bArr);
                    return f6;
                } else if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                } else {
                    str = "Failed to parse exif segment length, or exif segment not found";
                }
            } else if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                return -1;
            } else {
                str = "Parser doesn't handle magic number: " + c6;
            }
            Log.d("DfltImageHeaderParser", str);
            return -1;
        } catch (j unused) {
            return -1;
        } catch (Throwable th) {
            hVar.g(bArr);
            throw th;
        }
    }
}
