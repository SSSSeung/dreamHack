package p1;

import androidx.fragment.app.l;
import androidx.recyclerview.widget.RecyclerView;
import g0.f;
import java.util.ArrayList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final f f4430a = new f(30, 1);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f4431b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f4432c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final f0 f4433d;

    /* renamed from: e  reason: collision with root package name */
    public final l f4434e;

    public b(f0 f0Var) {
        this.f4433d = f0Var;
        this.f4434e = new l(2, this);
    }

    public final boolean a(int i3) {
        ArrayList arrayList = this.f4432c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            a aVar = (a) arrayList.get(i6);
            int i7 = aVar.f4425a;
            if (i7 == 8) {
                if (f(aVar.f4428d, i6 + 1) == i3) {
                    return true;
                }
            } else if (i7 == 1) {
                int i8 = aVar.f4426b;
                int i9 = aVar.f4428d + i8;
                while (i8 < i9) {
                    if (f(i8, i6 + 1) == i3) {
                        return true;
                    }
                    i8++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f4432c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f4433d.a((a) arrayList.get(i3));
        }
        l(arrayList);
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f4431b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            a aVar = (a) arrayList.get(i3);
            int i6 = aVar.f4425a;
            f0 f0Var = this.f4433d;
            if (i6 == 1) {
                f0Var.a(aVar);
                f0Var.e(aVar.f4426b, aVar.f4428d);
            } else if (i6 == 2) {
                f0Var.a(aVar);
                int i7 = aVar.f4426b;
                int i8 = aVar.f4428d;
                RecyclerView recyclerView = f0Var.f4481a;
                recyclerView.Q(i7, i8, true);
                recyclerView.f1438k0 = true;
                recyclerView.f1432h0.f4440c += i8;
            } else if (i6 == 4) {
                f0Var.a(aVar);
                f0Var.d(aVar.f4426b, aVar.f4428d, aVar.f4427c);
            } else if (i6 == 8) {
                f0Var.a(aVar);
                f0Var.f(aVar.f4426b, aVar.f4428d);
            }
        }
        l(arrayList);
    }

    public final void d(a aVar) {
        int i3;
        f fVar;
        int i6 = aVar.f4425a;
        if (i6 == 1 || i6 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m6 = m(aVar.f4426b, i6);
        int i7 = aVar.f4426b;
        int i8 = aVar.f4425a;
        if (i8 == 2) {
            i3 = 0;
        } else if (i8 == 4) {
            i3 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + aVar);
        }
        int i9 = 1;
        int i10 = 1;
        while (true) {
            int i11 = aVar.f4428d;
            fVar = this.f4430a;
            if (i9 >= i11) {
                break;
            }
            int m7 = m((i3 * i9) + aVar.f4426b, aVar.f4425a);
            int i12 = aVar.f4425a;
            if (i12 == 2 ? m7 == m6 : i12 == 4 && m7 == m6 + 1) {
                i10++;
            } else {
                a h6 = h(aVar.f4427c, i12, m6, i10);
                e(h6, i7);
                h6.f4427c = null;
                fVar.a(h6);
                if (aVar.f4425a == 4) {
                    i7 += i10;
                }
                i10 = 1;
                m6 = m7;
            }
            i9++;
        }
        Object obj = aVar.f4427c;
        aVar.f4427c = null;
        fVar.a(aVar);
        if (i10 > 0) {
            a h7 = h(obj, aVar.f4425a, m6, i10);
            e(h7, i7);
            h7.f4427c = null;
            fVar.a(h7);
        }
    }

    public final void e(a aVar, int i3) {
        f0 f0Var = this.f4433d;
        f0Var.a(aVar);
        int i6 = aVar.f4425a;
        if (i6 == 2) {
            int i7 = aVar.f4428d;
            RecyclerView recyclerView = f0Var.f4481a;
            recyclerView.Q(i3, i7, true);
            recyclerView.f1438k0 = true;
            recyclerView.f1432h0.f4440c += i7;
        } else if (i6 == 4) {
            f0Var.d(i3, aVar.f4428d, aVar.f4427c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public final int f(int i3, int i6) {
        ArrayList arrayList = this.f4432c;
        int size = arrayList.size();
        while (i6 < size) {
            a aVar = (a) arrayList.get(i6);
            int i7 = aVar.f4425a;
            if (i7 == 8) {
                int i8 = aVar.f4426b;
                if (i8 == i3) {
                    i3 = aVar.f4428d;
                } else {
                    if (i8 < i3) {
                        i3--;
                    }
                    if (aVar.f4428d <= i3) {
                        i3++;
                    }
                }
            } else {
                int i9 = aVar.f4426b;
                if (i9 > i3) {
                    continue;
                } else if (i7 == 2) {
                    int i10 = aVar.f4428d;
                    if (i3 < i9 + i10) {
                        return -1;
                    }
                    i3 -= i10;
                } else if (i7 == 1) {
                    i3 += aVar.f4428d;
                }
            }
            i6++;
        }
        return i3;
    }

    public final boolean g() {
        return this.f4431b.size() > 0;
    }

    public final a h(Object obj, int i3, int i6, int i7) {
        a aVar = (a) this.f4430a.b();
        if (aVar == null) {
            return new a(obj, i3, i6, i7);
        }
        aVar.f4425a = i3;
        aVar.f4426b = i6;
        aVar.f4428d = i7;
        aVar.f4427c = obj;
        return aVar;
    }

    public final void i(a aVar) {
        this.f4432c.add(aVar);
        int i3 = aVar.f4425a;
        f0 f0Var = this.f4433d;
        if (i3 == 1) {
            f0Var.e(aVar.f4426b, aVar.f4428d);
        } else if (i3 == 2) {
            int i6 = aVar.f4426b;
            int i7 = aVar.f4428d;
            RecyclerView recyclerView = f0Var.f4481a;
            recyclerView.Q(i6, i7, false);
            recyclerView.f1438k0 = true;
        } else if (i3 == 4) {
            f0Var.d(aVar.f4426b, aVar.f4428d, aVar.f4427c);
        } else if (i3 == 8) {
            f0Var.f(aVar.f4426b, aVar.f4428d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x015d, code lost:
        if (r5 > r12.f4426b) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0187, code lost:
        if (r5 >= r12.f4426b) goto L_0x0189;
     */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r17 = this;
            r0 = r17
            java.util.ArrayList r1 = r0.f4431b
            androidx.fragment.app.l r2 = r0.f4434e
            r2.getClass()
        L_0x0009:
            int r3 = r1.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x0010:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L_0x0026
            java.lang.Object r9 = r1.get(r3)
            p1.a r9 = (p1.a) r9
            int r9 = r9.f4425a
            if (r9 != r7) goto L_0x0022
            if (r6 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0022:
            r6 = r4
        L_0x0023:
            int r3 = r3 + -1
            goto L_0x0010
        L_0x0026:
            r3 = r8
        L_0x0027:
            r6 = 0
            r9 = 4
            r10 = 2
            if (r3 == r8) goto L_0x01cf
            int r7 = r3 + 1
            java.lang.Object r11 = r1.get(r3)
            p1.a r11 = (p1.a) r11
            java.lang.Object r12 = r1.get(r7)
            p1.a r12 = (p1.a) r12
            int r13 = r12.f4425a
            if (r13 == r4) goto L_0x01a5
            java.lang.Object r8 = r2.f1170b
            if (r13 == r10) goto L_0x00af
            if (r13 == r9) goto L_0x0045
            goto L_0x0009
        L_0x0045:
            int r5 = r11.f4428d
            int r10 = r12.f4426b
            if (r5 >= r10) goto L_0x0050
            int r10 = r10 + -1
            r12.f4426b = r10
            goto L_0x0065
        L_0x0050:
            int r13 = r12.f4428d
            int r10 = r10 + r13
            if (r5 >= r10) goto L_0x0065
            int r13 = r13 + -1
            r12.f4428d = r13
            r5 = r8
            p1.b r5 = (p1.b) r5
            int r10 = r11.f4426b
            java.lang.Object r13 = r12.f4427c
            p1.a r4 = r5.h(r13, r9, r10, r4)
            goto L_0x0066
        L_0x0065:
            r4 = r6
        L_0x0066:
            int r5 = r11.f4426b
            int r10 = r12.f4426b
            if (r5 > r10) goto L_0x0071
            int r10 = r10 + 1
            r12.f4426b = r10
            goto L_0x0088
        L_0x0071:
            int r13 = r12.f4428d
            int r10 = r10 + r13
            if (r5 >= r10) goto L_0x0088
            int r10 = r10 - r5
            r13 = r8
            p1.b r13 = (p1.b) r13
            int r5 = r5 + 1
            java.lang.Object r14 = r12.f4427c
            p1.a r5 = r13.h(r14, r9, r5, r10)
            int r9 = r12.f4428d
            int r9 = r9 - r10
            r12.f4428d = r9
            goto L_0x0089
        L_0x0088:
            r5 = r6
        L_0x0089:
            r1.set(r7, r11)
            int r7 = r12.f4428d
            if (r7 <= 0) goto L_0x0094
            r1.set(r3, r12)
            goto L_0x00a3
        L_0x0094:
            r1.remove(r3)
            p1.b r8 = (p1.b) r8
            r8.getClass()
            r12.f4427c = r6
            g0.f r6 = r8.f4430a
            r6.a(r12)
        L_0x00a3:
            if (r4 == 0) goto L_0x00a8
            r1.add(r3, r4)
        L_0x00a8:
            if (r5 == 0) goto L_0x0009
            r1.add(r3, r5)
            goto L_0x0009
        L_0x00af:
            int r9 = r11.f4426b
            int r13 = r11.f4428d
            int r14 = r12.f4426b
            if (r9 >= r13) goto L_0x00c4
            if (r14 != r9) goto L_0x00c2
            int r15 = r12.f4428d
            int r9 = r13 - r9
            if (r15 != r9) goto L_0x00c2
            r5 = r4
            r9 = 0
            goto L_0x00d2
        L_0x00c2:
            r5 = 0
            goto L_0x00ce
        L_0x00c4:
            int r15 = r13 + 1
            if (r14 != r15) goto L_0x00d0
            int r15 = r12.f4428d
            int r9 = r9 - r13
            if (r15 != r9) goto L_0x00d0
            r5 = r4
        L_0x00ce:
            r9 = r5
            goto L_0x00d2
        L_0x00d0:
            r9 = r4
            r5 = 0
        L_0x00d2:
            if (r13 >= r14) goto L_0x00d9
            int r14 = r14 + -1
            r12.f4426b = r14
            goto L_0x00fb
        L_0x00d9:
            int r15 = r12.f4428d
            int r14 = r14 + r15
            if (r13 >= r14) goto L_0x00fb
            int r15 = r15 + -1
            r12.f4428d = r15
            r11.f4425a = r10
            r11.f4428d = r4
            int r3 = r12.f4428d
            if (r3 != 0) goto L_0x0009
            r1.remove(r7)
            p1.b r8 = (p1.b) r8
            r8.getClass()
            r12.f4427c = r6
            g0.f r3 = r8.f4430a
            r3.a(r12)
            goto L_0x0009
        L_0x00fb:
            int r4 = r11.f4426b
            int r13 = r12.f4426b
            if (r4 > r13) goto L_0x0106
            int r13 = r13 + 1
            r12.f4426b = r13
            goto L_0x011d
        L_0x0106:
            int r14 = r12.f4428d
            int r13 = r13 + r14
            if (r4 >= r13) goto L_0x011d
            int r13 = r13 - r4
            r14 = r8
            p1.b r14 = (p1.b) r14
            int r4 = r4 + 1
            p1.a r4 = r14.h(r6, r10, r4, r13)
            int r10 = r11.f4426b
            int r13 = r12.f4426b
            int r10 = r10 - r13
            r12.f4428d = r10
            goto L_0x011e
        L_0x011d:
            r4 = r6
        L_0x011e:
            if (r5 == 0) goto L_0x0134
            r1.set(r3, r12)
            r1.remove(r7)
            p1.b r8 = (p1.b) r8
            r8.getClass()
            r11.f4427c = r6
            g0.f r3 = r8.f4430a
            r3.a(r11)
            goto L_0x0009
        L_0x0134:
            if (r9 == 0) goto L_0x0160
            if (r4 == 0) goto L_0x014e
            int r5 = r11.f4426b
            int r6 = r4.f4426b
            if (r5 <= r6) goto L_0x0143
            int r6 = r4.f4428d
            int r5 = r5 - r6
            r11.f4426b = r5
        L_0x0143:
            int r5 = r11.f4428d
            int r6 = r4.f4426b
            if (r5 <= r6) goto L_0x014e
            int r6 = r4.f4428d
            int r5 = r5 - r6
            r11.f4428d = r5
        L_0x014e:
            int r5 = r11.f4426b
            int r6 = r12.f4426b
            if (r5 <= r6) goto L_0x0159
            int r6 = r12.f4428d
            int r5 = r5 - r6
            r11.f4426b = r5
        L_0x0159:
            int r5 = r11.f4428d
            int r6 = r12.f4426b
            if (r5 <= r6) goto L_0x018e
            goto L_0x0189
        L_0x0160:
            if (r4 == 0) goto L_0x0178
            int r5 = r11.f4426b
            int r6 = r4.f4426b
            if (r5 < r6) goto L_0x016d
            int r6 = r4.f4428d
            int r5 = r5 - r6
            r11.f4426b = r5
        L_0x016d:
            int r5 = r11.f4428d
            int r6 = r4.f4426b
            if (r5 < r6) goto L_0x0178
            int r6 = r4.f4428d
            int r5 = r5 - r6
            r11.f4428d = r5
        L_0x0178:
            int r5 = r11.f4426b
            int r6 = r12.f4426b
            if (r5 < r6) goto L_0x0183
            int r6 = r12.f4428d
            int r5 = r5 - r6
            r11.f4426b = r5
        L_0x0183:
            int r5 = r11.f4428d
            int r6 = r12.f4426b
            if (r5 < r6) goto L_0x018e
        L_0x0189:
            int r6 = r12.f4428d
            int r5 = r5 - r6
            r11.f4428d = r5
        L_0x018e:
            r1.set(r3, r12)
            int r5 = r11.f4426b
            int r6 = r11.f4428d
            if (r5 == r6) goto L_0x019b
            r1.set(r7, r11)
            goto L_0x019e
        L_0x019b:
            r1.remove(r7)
        L_0x019e:
            if (r4 == 0) goto L_0x0009
            r1.add(r3, r4)
            goto L_0x0009
        L_0x01a5:
            int r4 = r11.f4428d
            int r6 = r12.f4426b
            if (r4 >= r6) goto L_0x01ad
            r5 = r8
            goto L_0x01ae
        L_0x01ad:
            r5 = 0
        L_0x01ae:
            int r8 = r11.f4426b
            if (r8 >= r6) goto L_0x01b4
            int r5 = r5 + 1
        L_0x01b4:
            if (r6 > r8) goto L_0x01bb
            int r6 = r12.f4428d
            int r8 = r8 + r6
            r11.f4426b = r8
        L_0x01bb:
            int r6 = r12.f4426b
            if (r6 > r4) goto L_0x01c4
            int r8 = r12.f4428d
            int r4 = r4 + r8
            r11.f4428d = r4
        L_0x01c4:
            int r6 = r6 + r5
            r12.f4426b = r6
            r1.set(r3, r12)
            r1.set(r7, r11)
            goto L_0x0009
        L_0x01cf:
            int r2 = r1.size()
            r3 = 0
        L_0x01d4:
            if (r3 >= r2) goto L_0x02a3
            java.lang.Object r11 = r1.get(r3)
            p1.a r11 = (p1.a) r11
            int r12 = r11.f4425a
            if (r12 == r4) goto L_0x0299
            g0.f r13 = r0.f4430a
            p1.f0 r14 = r0.f4433d
            if (r12 == r10) goto L_0x0242
            if (r12 == r9) goto L_0x01f1
            if (r12 == r7) goto L_0x01ec
            goto L_0x029c
        L_0x01ec:
            r0.i(r11)
            goto L_0x029c
        L_0x01f1:
            int r12 = r11.f4426b
            int r15 = r11.f4428d
            int r15 = r15 + r12
            r5 = r12
            r7 = 0
        L_0x01f8:
            if (r12 >= r15) goto L_0x0228
            p1.f1 r16 = r14.b(r12)
            if (r16 != 0) goto L_0x0216
            boolean r16 = r0.a(r12)
            if (r16 == 0) goto L_0x0207
            goto L_0x0216
        L_0x0207:
            if (r8 != r4) goto L_0x0214
            java.lang.Object r8 = r11.f4427c
            p1.a r5 = r0.h(r8, r9, r5, r7)
            r0.i(r5)
            r5 = r12
            r7 = 0
        L_0x0214:
            r8 = 0
            goto L_0x0224
        L_0x0216:
            if (r8 != 0) goto L_0x0223
            java.lang.Object r8 = r11.f4427c
            p1.a r5 = r0.h(r8, r9, r5, r7)
            r0.d(r5)
            r5 = r12
            r7 = 0
        L_0x0223:
            r8 = r4
        L_0x0224:
            int r7 = r7 + r4
            int r12 = r12 + 1
            goto L_0x01f8
        L_0x0228:
            int r12 = r11.f4428d
            if (r7 == r12) goto L_0x0237
            java.lang.Object r12 = r11.f4427c
            r11.f4427c = r6
            r13.a(r11)
            p1.a r11 = r0.h(r12, r9, r5, r7)
        L_0x0237:
            if (r8 != 0) goto L_0x023e
            r0.d(r11)
            goto L_0x029c
        L_0x023e:
            r0.i(r11)
            goto L_0x029c
        L_0x0242:
            int r5 = r11.f4426b
            int r7 = r11.f4428d
            int r7 = r7 + r5
            r8 = r5
            r12 = 0
            r15 = -1
        L_0x024a:
            if (r8 >= r7) goto L_0x0282
            p1.f1 r16 = r14.b(r8)
            if (r16 != 0) goto L_0x0268
            boolean r16 = r0.a(r8)
            if (r16 == 0) goto L_0x0259
            goto L_0x0268
        L_0x0259:
            if (r15 != r4) goto L_0x0264
            p1.a r15 = r0.h(r6, r10, r5, r12)
            r0.i(r15)
            r15 = r4
            goto L_0x0265
        L_0x0264:
            r15 = 0
        L_0x0265:
            r16 = 0
            goto L_0x0276
        L_0x0268:
            if (r15 != 0) goto L_0x0273
            p1.a r15 = r0.h(r6, r10, r5, r12)
            r0.d(r15)
            r15 = r4
            goto L_0x0274
        L_0x0273:
            r15 = 0
        L_0x0274:
            r16 = r4
        L_0x0276:
            if (r15 == 0) goto L_0x027c
            int r8 = r8 - r12
            int r7 = r7 - r12
            r12 = r4
            goto L_0x027e
        L_0x027c:
            int r12 = r12 + 1
        L_0x027e:
            int r8 = r8 + r4
            r15 = r16
            goto L_0x024a
        L_0x0282:
            int r7 = r11.f4428d
            if (r12 == r7) goto L_0x028f
            r11.f4427c = r6
            r13.a(r11)
            p1.a r11 = r0.h(r6, r10, r5, r12)
        L_0x028f:
            if (r15 != 0) goto L_0x0295
            r0.d(r11)
            goto L_0x029c
        L_0x0295:
            r0.i(r11)
            goto L_0x029c
        L_0x0299:
            r0.i(r11)
        L_0x029c:
            int r3 = r3 + 1
            r7 = 8
            r8 = -1
            goto L_0x01d4
        L_0x02a3:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.b.j():void");
    }

    public final void k(a aVar) {
        aVar.f4427c = null;
        this.f4430a.a(aVar);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            k((a) arrayList.get(i3));
        }
        arrayList.clear();
    }

    public final int m(int i3, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList = this.f4432c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i13 = aVar.f4425a;
            if (i13 == 8) {
                int i14 = aVar.f4426b;
                int i15 = aVar.f4428d;
                if (i14 < i15) {
                    i9 = i14;
                    i8 = i15;
                } else {
                    i8 = i14;
                    i9 = i15;
                }
                if (i3 < i9 || i3 > i8) {
                    if (i3 < i14) {
                        if (i6 == 1) {
                            aVar.f4426b = i14 + 1;
                            i10 = i15 + 1;
                        } else if (i6 == 2) {
                            aVar.f4426b = i14 - 1;
                            i10 = i15 - 1;
                        }
                        aVar.f4428d = i10;
                    }
                } else if (i9 == i14) {
                    if (i6 == 1) {
                        i12 = i15 + 1;
                    } else {
                        if (i6 == 2) {
                            i12 = i15 - 1;
                        }
                        i3++;
                    }
                    aVar.f4428d = i12;
                    i3++;
                } else {
                    if (i6 == 1) {
                        i11 = i14 + 1;
                    } else {
                        if (i6 == 2) {
                            i11 = i14 - 1;
                        }
                        i3--;
                    }
                    aVar.f4426b = i11;
                    i3--;
                }
            } else {
                int i16 = aVar.f4426b;
                if (i16 > i3) {
                    if (i6 == 1) {
                        i7 = i16 + 1;
                    } else if (i6 == 2) {
                        i7 = i16 - 1;
                    }
                    aVar.f4426b = i7;
                } else if (i13 == 1) {
                    i3 -= aVar.f4428d;
                } else if (i13 == 2) {
                    i3 += aVar.f4428d;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            if (aVar2.f4425a == 8) {
                int i17 = aVar2.f4428d;
                if (i17 != aVar2.f4426b && i17 >= 0) {
                }
            } else if (aVar2.f4428d > 0) {
            }
            arrayList.remove(size2);
            k(aVar2);
        }
        return i3;
    }
}
