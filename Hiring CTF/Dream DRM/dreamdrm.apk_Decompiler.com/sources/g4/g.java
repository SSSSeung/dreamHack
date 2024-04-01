package g4;

import b1.o;
import b1.v;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class g extends e {

    /* renamed from: g  reason: collision with root package name */
    public static final Object[] f2901g = new Object[0];

    /* renamed from: d  reason: collision with root package name */
    public int f2902d;

    /* renamed from: e  reason: collision with root package name */
    public Object[] f2903e = f2901g;

    /* renamed from: f  reason: collision with root package name */
    public int f2904f;

    public final int a() {
        return this.f2904f;
    }

    public final void add(int i3, Object obj) {
        int i6 = this.f2904f;
        if (i3 < 0 || i3 > i6) {
            throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i6);
        } else if (i3 == i6) {
            c(obj);
        } else if (i3 == 0) {
            e(i6 + 1);
            int i7 = this.f2902d;
            if (i7 == 0) {
                Object[] objArr = this.f2903e;
                o.m(objArr, "<this>");
                i7 = objArr.length;
            }
            int i8 = i7 - 1;
            this.f2902d = i8;
            this.f2903e[i8] = obj;
            this.f2904f++;
        } else {
            e(i6 + 1);
            int g6 = g(this.f2902d + i3);
            int i9 = this.f2904f;
            if (i3 < ((i9 + 1) >> 1)) {
                if (g6 == 0) {
                    Object[] objArr2 = this.f2903e;
                    o.m(objArr2, "<this>");
                    g6 = objArr2.length;
                }
                int i10 = g6 - 1;
                int i11 = this.f2902d;
                if (i11 == 0) {
                    Object[] objArr3 = this.f2903e;
                    o.m(objArr3, "<this>");
                    i11 = objArr3.length;
                }
                int i12 = i11 - 1;
                int i13 = this.f2902d;
                Object[] objArr4 = this.f2903e;
                if (i10 >= i13) {
                    objArr4[i12] = objArr4[i13];
                    h.Z(objArr4, objArr4, i13, i13 + 1, i10 + 1);
                } else {
                    h.Z(objArr4, objArr4, i13 - 1, i13, objArr4.length);
                    Object[] objArr5 = this.f2903e;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    h.Z(objArr5, objArr5, 0, 1, i10 + 1);
                }
                this.f2903e[i10] = obj;
                this.f2902d = i12;
            } else {
                int g7 = g(i9 + this.f2902d);
                Object[] objArr6 = this.f2903e;
                if (g6 < g7) {
                    h.Z(objArr6, objArr6, g6 + 1, g6, g7);
                } else {
                    h.Z(objArr6, objArr6, 1, 0, g7);
                    Object[] objArr7 = this.f2903e;
                    objArr7[0] = objArr7[objArr7.length - 1];
                    h.Z(objArr7, objArr7, g6 + 1, g6, objArr7.length - 1);
                }
                this.f2903e[g6] = obj;
            }
            this.f2904f++;
        }
    }

    public final boolean addAll(int i3, Collection collection) {
        o.m(collection, "elements");
        int i6 = this.f2904f;
        if (i3 < 0 || i3 > i6) {
            throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i6);
        } else if (collection.isEmpty()) {
            return false;
        } else {
            int i7 = this.f2904f;
            if (i3 == i7) {
                return addAll(collection);
            }
            e(collection.size() + i7);
            int g6 = g(this.f2904f + this.f2902d);
            int g7 = g(this.f2902d + i3);
            int size = collection.size();
            if (i3 < ((this.f2904f + 1) >> 1)) {
                int i8 = this.f2902d;
                int i9 = i8 - size;
                if (g7 < i8) {
                    Object[] objArr = this.f2903e;
                    h.Z(objArr, objArr, i9, i8, objArr.length);
                    Object[] objArr2 = this.f2903e;
                    int length = objArr2.length - size;
                    if (size >= g7) {
                        h.Z(objArr2, objArr2, length, 0, g7);
                    } else {
                        h.Z(objArr2, objArr2, length, 0, size);
                        Object[] objArr3 = this.f2903e;
                        h.Z(objArr3, objArr3, 0, size, g7);
                    }
                } else if (i9 >= 0) {
                    Object[] objArr4 = this.f2903e;
                    h.Z(objArr4, objArr4, i9, i8, g7);
                } else {
                    Object[] objArr5 = this.f2903e;
                    i9 += objArr5.length;
                    int i10 = g7 - i8;
                    int length2 = objArr5.length - i9;
                    if (length2 >= i10) {
                        h.Z(objArr5, objArr5, i9, i8, g7);
                    } else {
                        h.Z(objArr5, objArr5, i9, i8, i8 + length2);
                        Object[] objArr6 = this.f2903e;
                        h.Z(objArr6, objArr6, 0, this.f2902d + length2, g7);
                    }
                }
                this.f2902d = i9;
                g7 -= size;
                if (g7 < 0) {
                    g7 += this.f2903e.length;
                }
            } else {
                int i11 = g7 + size;
                if (g7 < g6) {
                    int i12 = size + g6;
                    Object[] objArr7 = this.f2903e;
                    if (i12 > objArr7.length) {
                        if (i11 >= objArr7.length) {
                            i11 -= objArr7.length;
                        } else {
                            int length3 = g6 - (i12 - objArr7.length);
                            h.Z(objArr7, objArr7, 0, length3, g6);
                            Object[] objArr8 = this.f2903e;
                            h.Z(objArr8, objArr8, i11, g7, length3);
                        }
                    }
                    h.Z(objArr7, objArr7, i11, g7, g6);
                } else {
                    Object[] objArr9 = this.f2903e;
                    h.Z(objArr9, objArr9, size, 0, g6);
                    Object[] objArr10 = this.f2903e;
                    if (i11 >= objArr10.length) {
                        h.Z(objArr10, objArr10, i11 - objArr10.length, g7, objArr10.length);
                    } else {
                        h.Z(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                        Object[] objArr11 = this.f2903e;
                        h.Z(objArr11, objArr11, i11, g7, objArr11.length - size);
                    }
                }
            }
            d(g7, collection);
            return true;
        }
    }

    public final Object b(int i3) {
        int i6 = this.f2904f;
        if (i3 < 0 || i3 >= i6) {
            throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i6);
        } else if (i3 == v.v(this)) {
            if (!isEmpty()) {
                int g6 = g(v.v(this) + this.f2902d);
                Object[] objArr = this.f2903e;
                Object obj = objArr[g6];
                objArr[g6] = null;
                this.f2904f--;
                return obj;
            }
            throw new NoSuchElementException("ArrayDeque is empty.");
        } else if (i3 != 0) {
            int g7 = g(this.f2902d + i3);
            Object[] objArr2 = this.f2903e;
            Object obj2 = objArr2[g7];
            if (i3 < (this.f2904f >> 1)) {
                int i7 = this.f2902d;
                if (g7 >= i7) {
                    h.Z(objArr2, objArr2, i7 + 1, i7, g7);
                } else {
                    h.Z(objArr2, objArr2, 1, 0, g7);
                    Object[] objArr3 = this.f2903e;
                    objArr3[0] = objArr3[objArr3.length - 1];
                    int i8 = this.f2902d;
                    h.Z(objArr3, objArr3, i8 + 1, i8, objArr3.length - 1);
                }
                Object[] objArr4 = this.f2903e;
                int i9 = this.f2902d;
                objArr4[i9] = null;
                this.f2902d = f(i9);
            } else {
                int g8 = g(v.v(this) + this.f2902d);
                Object[] objArr5 = this.f2903e;
                int i10 = g7 + 1;
                if (g7 <= g8) {
                    h.Z(objArr5, objArr5, g7, i10, g8 + 1);
                } else {
                    h.Z(objArr5, objArr5, g7, i10, objArr5.length);
                    Object[] objArr6 = this.f2903e;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    h.Z(objArr6, objArr6, 0, 1, g8 + 1);
                }
                this.f2903e[g8] = null;
            }
            this.f2904f--;
            return obj2;
        } else if (!isEmpty()) {
            Object[] objArr7 = this.f2903e;
            int i11 = this.f2902d;
            Object obj3 = objArr7[i11];
            objArr7[i11] = null;
            this.f2902d = f(i11);
            this.f2904f--;
            return obj3;
        } else {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
    }

    public final void c(Object obj) {
        e(a() + 1);
        this.f2903e[g(a() + this.f2902d)] = obj;
        this.f2904f = a() + 1;
    }

    public final void clear() {
        int g6 = g(this.f2904f + this.f2902d);
        int i3 = this.f2902d;
        if (i3 < g6) {
            Object[] objArr = this.f2903e;
            o.m(objArr, "<this>");
            Arrays.fill(objArr, i3, g6, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f2903e;
            Arrays.fill(objArr2, this.f2902d, objArr2.length, (Object) null);
            Object[] objArr3 = this.f2903e;
            o.m(objArr3, "<this>");
            Arrays.fill(objArr3, 0, g6, (Object) null);
        }
        this.f2902d = 0;
        this.f2904f = 0;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i3, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f2903e.length;
        while (i3 < length && it.hasNext()) {
            this.f2903e[i3] = it.next();
            i3++;
        }
        int i6 = this.f2902d;
        for (int i7 = 0; i7 < i6 && it.hasNext(); i7++) {
            this.f2903e[i7] = it.next();
        }
        this.f2904f = collection.size() + a();
    }

    public final void e(int i3) {
        if (i3 >= 0) {
            Object[] objArr = this.f2903e;
            if (i3 > objArr.length) {
                if (objArr == f2901g) {
                    if (i3 < 10) {
                        i3 = 10;
                    }
                    this.f2903e = new Object[i3];
                    return;
                }
                int length = objArr.length;
                int i6 = length + (length >> 1);
                if (i6 - i3 < 0) {
                    i6 = i3;
                }
                if (i6 - 2147483639 > 0) {
                    i6 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                }
                Object[] objArr2 = new Object[i6];
                h.Z(objArr, objArr2, 0, this.f2902d, objArr.length);
                Object[] objArr3 = this.f2903e;
                int length2 = objArr3.length;
                int i7 = this.f2902d;
                h.Z(objArr3, objArr2, length2 - i7, 0, i7);
                this.f2902d = 0;
                this.f2903e = objArr2;
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int f(int i3) {
        Object[] objArr = this.f2903e;
        o.m(objArr, "<this>");
        if (i3 == objArr.length - 1) {
            return 0;
        }
        return i3 + 1;
    }

    public final int g(int i3) {
        Object[] objArr = this.f2903e;
        return i3 >= objArr.length ? i3 - objArr.length : i3;
    }

    public final Object get(int i3) {
        int a6 = a();
        if (i3 >= 0 && i3 < a6) {
            return this.f2903e[g(this.f2902d + i3)];
        }
        throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + a6);
    }

    public final int indexOf(Object obj) {
        int g6 = g(a() + this.f2902d);
        int i3 = this.f2902d;
        if (i3 < g6) {
            while (i3 < g6) {
                if (!o.c(obj, this.f2903e[i3])) {
                    i3++;
                }
            }
            return -1;
        } else if (i3 < g6) {
            return -1;
        } else {
            int length = this.f2903e.length;
            while (true) {
                if (i3 >= length) {
                    int i6 = 0;
                    while (i6 < g6) {
                        if (o.c(obj, this.f2903e[i6])) {
                            i3 = i6 + this.f2903e.length;
                        } else {
                            i6++;
                        }
                    }
                    return -1;
                } else if (o.c(obj, this.f2903e[i3])) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        return i3 - this.f2902d;
    }

    public final boolean isEmpty() {
        return a() == 0;
    }

    public final int lastIndexOf(Object obj) {
        int i3;
        int g6 = g(this.f2904f + this.f2902d);
        int i6 = this.f2902d;
        if (i6 < g6) {
            i3 = g6 - 1;
            if (i6 <= i3) {
                while (!o.c(obj, this.f2903e[i3])) {
                    if (i3 != i6) {
                        i3--;
                    }
                }
            }
            return -1;
        }
        if (i6 > g6) {
            int i7 = g6 - 1;
            while (true) {
                if (-1 >= i7) {
                    Object[] objArr = this.f2903e;
                    o.m(objArr, "<this>");
                    int length = objArr.length - 1;
                    int i8 = this.f2902d;
                    if (i8 <= length) {
                        while (!o.c(obj, this.f2903e[i3])) {
                            if (i3 != i8) {
                                length = i3 - 1;
                            }
                        }
                    }
                } else if (o.c(obj, this.f2903e[i7])) {
                    i3 = i7 + this.f2903e.length;
                    break;
                } else {
                    i7--;
                }
            }
        }
        return -1;
        return i3 - this.f2902d;
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean removeAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            b1.o.m(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x009b
            java.lang.Object[] r0 = r11.f2903e
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x009b
        L_0x0019:
            int r0 = r11.f2902d
            int r3 = r11.f2904f
            int r3 = r3 + r0
            int r0 = r11.g(r3)
            int r3 = r11.f2902d
            r4 = 0
            if (r3 >= r0) goto L_0x004c
            r5 = r3
        L_0x0028:
            if (r3 >= r0) goto L_0x0041
            java.lang.Object[] r6 = r11.f2903e
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x003d
            java.lang.Object[] r7 = r11.f2903e
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003e
        L_0x003d:
            r1 = r2
        L_0x003e:
            int r3 = r3 + 1
            goto L_0x0028
        L_0x0041:
            java.lang.Object[] r12 = r11.f2903e
            java.lang.String r2 = "<this>"
            b1.o.m(r12, r2)
            java.util.Arrays.fill(r12, r5, r0, r4)
            goto L_0x008e
        L_0x004c:
            java.lang.Object[] r5 = r11.f2903e
            int r5 = r5.length
            r7 = r1
            r6 = r3
        L_0x0051:
            if (r3 >= r5) goto L_0x006c
            java.lang.Object[] r8 = r11.f2903e
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0068
            java.lang.Object[] r8 = r11.f2903e
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0069
        L_0x0068:
            r7 = r2
        L_0x0069:
            int r3 = r3 + 1
            goto L_0x0051
        L_0x006c:
            int r3 = r11.g(r6)
            r5 = r3
        L_0x0071:
            if (r1 >= r0) goto L_0x008d
            java.lang.Object[] r3 = r11.f2903e
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0089
            java.lang.Object[] r3 = r11.f2903e
            r3[r5] = r6
            int r5 = r11.f(r5)
            goto L_0x008a
        L_0x0089:
            r7 = r2
        L_0x008a:
            int r1 = r1 + 1
            goto L_0x0071
        L_0x008d:
            r1 = r7
        L_0x008e:
            if (r1 == 0) goto L_0x009b
            int r12 = r11.f2902d
            int r5 = r5 - r12
            if (r5 >= 0) goto L_0x0099
            java.lang.Object[] r12 = r11.f2903e
            int r12 = r12.length
            int r5 = r5 + r12
        L_0x0099:
            r11.f2904f = r5
        L_0x009b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.g.removeAll(java.util.Collection):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean retainAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            b1.o.m(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0098
            java.lang.Object[] r0 = r11.f2903e
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0098
        L_0x0019:
            int r0 = r11.f2902d
            int r3 = r11.f2904f
            int r3 = r3 + r0
            int r0 = r11.g(r3)
            int r3 = r11.f2902d
            r4 = 0
            if (r3 >= r0) goto L_0x004b
            r5 = r3
        L_0x0028:
            if (r3 >= r0) goto L_0x0040
            java.lang.Object[] r6 = r11.f2903e
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x003c
            java.lang.Object[] r7 = r11.f2903e
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003d
        L_0x003c:
            r1 = r2
        L_0x003d:
            int r3 = r3 + 1
            goto L_0x0028
        L_0x0040:
            java.lang.Object[] r12 = r11.f2903e
            java.lang.String r2 = "<this>"
            b1.o.m(r12, r2)
            java.util.Arrays.fill(r12, r5, r0, r4)
            goto L_0x008b
        L_0x004b:
            java.lang.Object[] r5 = r11.f2903e
            int r5 = r5.length
            r7 = r1
            r6 = r3
        L_0x0050:
            if (r3 >= r5) goto L_0x006a
            java.lang.Object[] r8 = r11.f2903e
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0066
            java.lang.Object[] r8 = r11.f2903e
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0067
        L_0x0066:
            r7 = r2
        L_0x0067:
            int r3 = r3 + 1
            goto L_0x0050
        L_0x006a:
            int r3 = r11.g(r6)
            r5 = r3
        L_0x006f:
            if (r1 >= r0) goto L_0x008a
            java.lang.Object[] r3 = r11.f2903e
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            if (r3 == 0) goto L_0x0086
            java.lang.Object[] r3 = r11.f2903e
            r3[r5] = r6
            int r5 = r11.f(r5)
            goto L_0x0087
        L_0x0086:
            r7 = r2
        L_0x0087:
            int r1 = r1 + 1
            goto L_0x006f
        L_0x008a:
            r1 = r7
        L_0x008b:
            if (r1 == 0) goto L_0x0098
            int r12 = r11.f2902d
            int r5 = r5 - r12
            if (r5 >= 0) goto L_0x0096
            java.lang.Object[] r12 = r11.f2903e
            int r12 = r12.length
            int r5 = r5 + r12
        L_0x0096:
            r11.f2904f = r5
        L_0x0098:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.g.retainAll(java.util.Collection):boolean");
    }

    public final Object set(int i3, Object obj) {
        int a6 = a();
        if (i3 < 0 || i3 >= a6) {
            throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + a6);
        }
        int g6 = g(this.f2902d + i3);
        Object[] objArr = this.f2903e;
        Object obj2 = objArr[g6];
        objArr[g6] = obj;
        return obj2;
    }

    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    public final Object[] toArray(Object[] objArr) {
        o.m(objArr, "array");
        int length = objArr.length;
        int i3 = this.f2904f;
        if (length < i3) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i3);
            o.j(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int g6 = g(this.f2904f + this.f2902d);
        int i6 = this.f2902d;
        if (i6 < g6) {
            h.b0(this.f2903e, objArr, 0, i6, g6, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f2903e;
            h.Z(objArr2, objArr, 0, this.f2902d, objArr2.length);
            Object[] objArr3 = this.f2903e;
            h.Z(objArr3, objArr, objArr3.length - this.f2902d, 0, g6);
        }
        int length2 = objArr.length;
        int i7 = this.f2904f;
        if (length2 > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }

    public final boolean addAll(Collection collection) {
        o.m(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        e(collection.size() + a());
        d(g(a() + this.f2902d), collection);
        return true;
    }

    public final boolean add(Object obj) {
        c(obj);
        return true;
    }
}
