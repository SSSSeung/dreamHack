package i1;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f3563a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3564b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f3565c;

    public c(byte[] bArr, int i3, int i6) {
        this(bArr, i3, i6, 0);
    }

    public static c a(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(f.M);
        return new c(bytes, 2, bytes.length, 0);
    }

    public static c b(long j6, ByteOrder byteOrder) {
        long[] jArr = {j6};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(f.D[4] * 1)]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new c(wrap.array(), 4, 1);
    }

    public static c c(e eVar, ByteOrder byteOrder) {
        e[] eVarArr = {eVar};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(f.D[5] * 1)]);
        wrap.order(byteOrder);
        e eVar2 = eVarArr[0];
        wrap.putInt((int) eVar2.f3570a);
        wrap.putInt((int) eVar2.f3571b);
        return new c(wrap.array(), 5, 1);
    }

    public static c d(int i3, ByteOrder byteOrder) {
        int[] iArr = {i3};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(f.D[3] * 1)]);
        wrap.order(byteOrder);
        wrap.putShort((short) iArr[0]);
        return new c(wrap.array(), 3, 1);
    }

    public final double e(ByteOrder byteOrder) {
        Serializable h6 = h(byteOrder);
        if (h6 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        } else if (h6 instanceof String) {
            return Double.parseDouble((String) h6);
        } else {
            if (h6 instanceof long[]) {
                long[] jArr = (long[]) h6;
                if (jArr.length == 1) {
                    return (double) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (h6 instanceof int[]) {
                int[] iArr = (int[]) h6;
                if (iArr.length == 1) {
                    return (double) iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (h6 instanceof double[]) {
                double[] dArr = (double[]) h6;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (h6 instanceof e[]) {
                e[] eVarArr = (e[]) h6;
                if (eVarArr.length == 1) {
                    e eVar = eVarArr[0];
                    return ((double) eVar.f3570a) / ((double) eVar.f3571b);
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
    }

    public final int f(ByteOrder byteOrder) {
        Serializable h6 = h(byteOrder);
        if (h6 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        } else if (h6 instanceof String) {
            return Integer.parseInt((String) h6);
        } else {
            if (h6 instanceof long[]) {
                long[] jArr = (long[]) h6;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (h6 instanceof int[]) {
                int[] iArr = (int[]) h6;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
    }

    public final String g(ByteOrder byteOrder) {
        Serializable h6 = h(byteOrder);
        if (h6 == null) {
            return null;
        }
        if (h6 instanceof String) {
            return (String) h6;
        }
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        if (h6 instanceof long[]) {
            long[] jArr = (long[]) h6;
            while (i3 < jArr.length) {
                sb.append(jArr[i3]);
                i3++;
                if (i3 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (h6 instanceof int[]) {
            int[] iArr = (int[]) h6;
            while (i3 < iArr.length) {
                sb.append(iArr[i3]);
                i3++;
                if (i3 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (h6 instanceof double[]) {
            double[] dArr = (double[]) h6;
            while (i3 < dArr.length) {
                sb.append(dArr[i3]);
                i3++;
                if (i3 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (!(h6 instanceof e[])) {
            return null;
        } else {
            e[] eVarArr = (e[]) h6;
            while (i3 < eVarArr.length) {
                sb.append(eVarArr[i3].f3570a);
                sb.append('/');
                sb.append(eVarArr[i3].f3571b);
                i3++;
                if (i3 != eVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
    }

    /* JADX WARNING: type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v24, types: [long[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v25, types: [i1.e[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v27, types: [int[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v28, types: [i1.e[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v30, types: [double[], java.io.Serializable] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x017f A[SYNTHETIC, Splitter:B:155:0x017f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable h(java.nio.ByteOrder r15) {
        /*
            r14 = this;
            byte[] r0 = r14.f3565c
            java.lang.String r1 = "IOException occurred while closing InputStream"
            java.lang.String r2 = "ExifInterface"
            r3 = 0
            i1.b r4 = new i1.b     // Catch:{ IOException -> 0x016b, all -> 0x0169 }
            r4.<init>((byte[]) r0)     // Catch:{ IOException -> 0x016b, all -> 0x0169 }
            r4.f3560e = r15     // Catch:{ IOException -> 0x00b2 }
            int r15 = r14.f3563a     // Catch:{ IOException -> 0x00b2 }
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r7 = 1
            r8 = 0
            int r9 = r14.f3564b
            switch(r15) {
                case 1: goto L_0x012f;
                case 2: goto L_0x00ec;
                case 3: goto L_0x00d6;
                case 4: goto L_0x00be;
                case 5: goto L_0x0098;
                case 6: goto L_0x012f;
                case 7: goto L_0x00ec;
                case 8: goto L_0x0082;
                case 9: goto L_0x006c;
                case 10: goto L_0x004b;
                case 11: goto L_0x0034;
                case 12: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x015d
        L_0x001e:
            double[] r15 = new double[r9]     // Catch:{ IOException -> 0x00b2 }
        L_0x0020:
            if (r8 >= r9) goto L_0x002b
            double r5 = r4.readDouble()     // Catch:{ IOException -> 0x00b2 }
            r15[r8] = r5     // Catch:{ IOException -> 0x00b2 }
            int r8 = r8 + 1
            goto L_0x0020
        L_0x002b:
            r4.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
        L_0x0033:
            return r15
        L_0x0034:
            double[] r15 = new double[r9]     // Catch:{ IOException -> 0x00b2 }
        L_0x0036:
            if (r8 >= r9) goto L_0x0042
            float r0 = r4.readFloat()     // Catch:{ IOException -> 0x00b2 }
            double r5 = (double) r0     // Catch:{ IOException -> 0x00b2 }
            r15[r8] = r5     // Catch:{ IOException -> 0x00b2 }
            int r8 = r8 + 1
            goto L_0x0036
        L_0x0042:
            r4.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
        L_0x004a:
            return r15
        L_0x004b:
            i1.e[] r15 = new i1.e[r9]     // Catch:{ IOException -> 0x00b2 }
        L_0x004d:
            if (r8 >= r9) goto L_0x0063
            int r0 = r4.readInt()     // Catch:{ IOException -> 0x00b2 }
            long r5 = (long) r0     // Catch:{ IOException -> 0x00b2 }
            int r0 = r4.readInt()     // Catch:{ IOException -> 0x00b2 }
            long r10 = (long) r0     // Catch:{ IOException -> 0x00b2 }
            i1.e r0 = new i1.e     // Catch:{ IOException -> 0x00b2 }
            r0.<init>(r5, r10)     // Catch:{ IOException -> 0x00b2 }
            r15[r8] = r0     // Catch:{ IOException -> 0x00b2 }
            int r8 = r8 + 1
            goto L_0x004d
        L_0x0063:
            r4.close()     // Catch:{ IOException -> 0x0067 }
            goto L_0x006b
        L_0x0067:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
        L_0x006b:
            return r15
        L_0x006c:
            int[] r15 = new int[r9]     // Catch:{ IOException -> 0x00b2 }
        L_0x006e:
            if (r8 >= r9) goto L_0x0079
            int r0 = r4.readInt()     // Catch:{ IOException -> 0x00b2 }
            r15[r8] = r0     // Catch:{ IOException -> 0x00b2 }
            int r8 = r8 + 1
            goto L_0x006e
        L_0x0079:
            r4.close()     // Catch:{ IOException -> 0x007d }
            goto L_0x0081
        L_0x007d:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
        L_0x0081:
            return r15
        L_0x0082:
            int[] r15 = new int[r9]     // Catch:{ IOException -> 0x00b2 }
        L_0x0084:
            if (r8 >= r9) goto L_0x008f
            short r0 = r4.readShort()     // Catch:{ IOException -> 0x00b2 }
            r15[r8] = r0     // Catch:{ IOException -> 0x00b2 }
            int r8 = r8 + 1
            goto L_0x0084
        L_0x008f:
            r4.close()     // Catch:{ IOException -> 0x0093 }
            goto L_0x0097
        L_0x0093:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
        L_0x0097:
            return r15
        L_0x0098:
            i1.e[] r15 = new i1.e[r9]     // Catch:{ IOException -> 0x00b2 }
        L_0x009a:
            if (r8 >= r9) goto L_0x00b5
            int r0 = r4.readInt()     // Catch:{ IOException -> 0x00b2 }
            long r10 = (long) r0     // Catch:{ IOException -> 0x00b2 }
            long r10 = r10 & r5
            int r0 = r4.readInt()     // Catch:{ IOException -> 0x00b2 }
            long r12 = (long) r0     // Catch:{ IOException -> 0x00b2 }
            long r12 = r12 & r5
            i1.e r0 = new i1.e     // Catch:{ IOException -> 0x00b2 }
            r0.<init>(r10, r12)     // Catch:{ IOException -> 0x00b2 }
            r15[r8] = r0     // Catch:{ IOException -> 0x00b2 }
            int r8 = r8 + 1
            goto L_0x009a
        L_0x00b2:
            r15 = move-exception
            goto L_0x016d
        L_0x00b5:
            r4.close()     // Catch:{ IOException -> 0x00b9 }
            goto L_0x00bd
        L_0x00b9:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
        L_0x00bd:
            return r15
        L_0x00be:
            long[] r15 = new long[r9]     // Catch:{ IOException -> 0x00b2 }
        L_0x00c0:
            if (r8 >= r9) goto L_0x00cd
            int r0 = r4.readInt()     // Catch:{ IOException -> 0x00b2 }
            long r10 = (long) r0     // Catch:{ IOException -> 0x00b2 }
            long r10 = r10 & r5
            r15[r8] = r10     // Catch:{ IOException -> 0x00b2 }
            int r8 = r8 + 1
            goto L_0x00c0
        L_0x00cd:
            r4.close()     // Catch:{ IOException -> 0x00d1 }
            goto L_0x00d5
        L_0x00d1:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
        L_0x00d5:
            return r15
        L_0x00d6:
            int[] r15 = new int[r9]     // Catch:{ IOException -> 0x00b2 }
        L_0x00d8:
            if (r8 >= r9) goto L_0x00e3
            int r0 = r4.readUnsignedShort()     // Catch:{ IOException -> 0x00b2 }
            r15[r8] = r0     // Catch:{ IOException -> 0x00b2 }
            int r8 = r8 + 1
            goto L_0x00d8
        L_0x00e3:
            r4.close()     // Catch:{ IOException -> 0x00e7 }
            goto L_0x00eb
        L_0x00e7:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
        L_0x00eb:
            return r15
        L_0x00ec:
            byte[] r15 = i1.f.E     // Catch:{ IOException -> 0x00b2 }
            int r15 = r15.length     // Catch:{ IOException -> 0x00b2 }
            if (r9 < r15) goto L_0x0105
            r15 = r8
        L_0x00f2:
            byte[] r5 = i1.f.E     // Catch:{ IOException -> 0x00b2 }
            int r6 = r5.length     // Catch:{ IOException -> 0x00b2 }
            if (r15 >= r6) goto L_0x0102
            byte r6 = r0[r15]     // Catch:{ IOException -> 0x00b2 }
            byte r10 = r5[r15]     // Catch:{ IOException -> 0x00b2 }
            if (r6 == r10) goto L_0x00ff
            r7 = r8
            goto L_0x0102
        L_0x00ff:
            int r15 = r15 + 1
            goto L_0x00f2
        L_0x0102:
            if (r7 == 0) goto L_0x0105
            int r8 = r5.length     // Catch:{ IOException -> 0x00b2 }
        L_0x0105:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b2 }
            r15.<init>()     // Catch:{ IOException -> 0x00b2 }
        L_0x010a:
            if (r8 >= r9) goto L_0x0122
            byte r5 = r0[r8]     // Catch:{ IOException -> 0x00b2 }
            if (r5 != 0) goto L_0x0111
            goto L_0x0122
        L_0x0111:
            r6 = 32
            if (r5 < r6) goto L_0x011a
            char r5 = (char) r5     // Catch:{ IOException -> 0x00b2 }
            r15.append(r5)     // Catch:{ IOException -> 0x00b2 }
            goto L_0x011f
        L_0x011a:
            r5 = 63
            r15.append(r5)     // Catch:{ IOException -> 0x00b2 }
        L_0x011f:
            int r8 = r8 + 1
            goto L_0x010a
        L_0x0122:
            java.lang.String r15 = r15.toString()     // Catch:{ IOException -> 0x00b2 }
            r4.close()     // Catch:{ IOException -> 0x012a }
            goto L_0x012e
        L_0x012a:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
        L_0x012e:
            return r15
        L_0x012f:
            int r15 = r0.length     // Catch:{ IOException -> 0x00b2 }
            if (r15 != r7) goto L_0x014d
            byte r15 = r0[r8]     // Catch:{ IOException -> 0x00b2 }
            if (r15 < 0) goto L_0x014d
            if (r15 > r7) goto L_0x014d
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x00b2 }
            char[] r5 = new char[r7]     // Catch:{ IOException -> 0x00b2 }
            int r15 = r15 + 48
            char r15 = (char) r15     // Catch:{ IOException -> 0x00b2 }
            r5[r8] = r15     // Catch:{ IOException -> 0x00b2 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x00b2 }
            r4.close()     // Catch:{ IOException -> 0x0148 }
            goto L_0x014c
        L_0x0148:
            r15 = move-exception
            android.util.Log.e(r2, r1, r15)
        L_0x014c:
            return r0
        L_0x014d:
            java.lang.String r15 = new java.lang.String     // Catch:{ IOException -> 0x00b2 }
            java.nio.charset.Charset r5 = i1.f.M     // Catch:{ IOException -> 0x00b2 }
            r15.<init>(r0, r5)     // Catch:{ IOException -> 0x00b2 }
            r4.close()     // Catch:{ IOException -> 0x0158 }
            goto L_0x015c
        L_0x0158:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
        L_0x015c:
            return r15
        L_0x015d:
            r4.close()     // Catch:{ IOException -> 0x0161 }
            goto L_0x0165
        L_0x0161:
            r15 = move-exception
            android.util.Log.e(r2, r1, r15)
        L_0x0165:
            return r3
        L_0x0166:
            r15 = move-exception
            r3 = r4
            goto L_0x017d
        L_0x0169:
            r15 = move-exception
            goto L_0x017d
        L_0x016b:
            r15 = move-exception
            r4 = r3
        L_0x016d:
            java.lang.String r0 = "IOException occurred during reading a value"
            android.util.Log.w(r2, r0, r15)     // Catch:{ all -> 0x0166 }
            if (r4 == 0) goto L_0x017c
            r4.close()     // Catch:{ IOException -> 0x0178 }
            goto L_0x017c
        L_0x0178:
            r15 = move-exception
            android.util.Log.e(r2, r1, r15)
        L_0x017c:
            return r3
        L_0x017d:
            if (r3 == 0) goto L_0x0187
            r3.close()     // Catch:{ IOException -> 0x0183 }
            goto L_0x0187
        L_0x0183:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
        L_0x0187:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.c.h(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        return "(" + f.C[this.f3563a] + ", data length:" + this.f3565c.length + ")";
    }

    public c(byte[] bArr, int i3, int i6, int i7) {
        this.f3563a = i3;
        this.f3564b = i6;
        this.f3565c = bArr;
    }
}
