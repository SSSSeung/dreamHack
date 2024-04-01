package p1;

import android.view.View;
import androidx.fragment.app.l;
import java.util.Arrays;
import java.util.List;
import k.d;
import k.j;

public final class r1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4657a;

    /* renamed from: b  reason: collision with root package name */
    public Object f4658b;

    /* renamed from: c  reason: collision with root package name */
    public Object f4659c;

    public r1(int i3) {
        this.f4657a = i3;
        if (i3 != 1) {
            this.f4658b = new j();
            this.f4659c = new d();
        }
    }

    public final void a(f1 f1Var) {
        q1 q1Var = (q1) ((j) this.f4658b).getOrDefault(f1Var, (Object) null);
        if (q1Var == null) {
            q1Var = q1.a();
            ((j) this.f4658b).put(f1Var, q1Var);
        }
        q1Var.f4649a |= 1;
    }

    public final void b(f1 f1Var, k0 k0Var) {
        q1 q1Var = (q1) ((j) this.f4658b).getOrDefault(f1Var, (Object) null);
        if (q1Var == null) {
            q1Var = q1.a();
            ((j) this.f4658b).put(f1Var, q1Var);
        }
        q1Var.f4651c = k0Var;
        q1Var.f4649a |= 8;
    }

    public final void c(f1 f1Var, k0 k0Var) {
        q1 q1Var = (q1) ((j) this.f4658b).getOrDefault(f1Var, (Object) null);
        if (q1Var == null) {
            q1Var = q1.a();
            ((j) this.f4658b).put(f1Var, q1Var);
        }
        q1Var.f4650b = k0Var;
        q1Var.f4649a |= 4;
    }

    public final void d() {
        switch (this.f4657a) {
            case 0:
                ((j) this.f4658b).clear();
                ((d) this.f4659c).a();
                return;
            default:
                int[] iArr = (int[]) this.f4658b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                this.f4659c = null;
                return;
        }
    }

    public final void e(int i3) {
        Object obj = this.f4658b;
        if (((int[]) obj) == null) {
            int[] iArr = new int[(Math.max(i3, 10) + 1)];
            this.f4658b = iArr;
            Arrays.fill(iArr, -1);
        } else if (i3 >= ((int[]) obj).length) {
            int[] iArr2 = (int[]) obj;
            int length = ((int[]) obj).length;
            while (length <= i3) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f4658b = iArr3;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            Object obj2 = this.f4658b;
            Arrays.fill((int[]) obj2, iArr2.length, ((int[]) obj2).length, -1);
        }
    }

    public final View f(int i3, int i6, int i7, int i8) {
        int i9;
        View view;
        l lVar = (l) ((p1) this.f4658b);
        int i10 = lVar.f1169a;
        Object obj = lVar.f1170b;
        switch (i10) {
            case 0:
                i9 = ((o0) obj).C();
                break;
            default:
                i9 = ((o0) obj).E();
                break;
        }
        int c6 = ((l) ((p1) this.f4658b)).c();
        int i11 = i6 > i3 ? 1 : -1;
        View view2 = null;
        while (i3 != i6) {
            l lVar2 = (l) ((p1) this.f4658b);
            int i12 = lVar2.f1169a;
            Object obj2 = lVar2.f1170b;
            switch (i12) {
                case 0:
                    view = ((o0) obj2).u(i3);
                    break;
                default:
                    view = ((o0) obj2).u(i3);
                    break;
            }
            int b6 = ((l) ((p1) this.f4658b)).b(view);
            int a6 = ((l) ((p1) this.f4658b)).a(view);
            Object obj3 = this.f4659c;
            o1 o1Var = (o1) obj3;
            o1Var.f4611b = i9;
            o1Var.f4612c = c6;
            o1Var.f4613d = b6;
            o1Var.f4614e = a6;
            if (i7 != 0) {
                ((o1) obj3).f4610a = i7 | 0;
                if (((o1) obj3).a()) {
                    return view;
                }
            }
            if (i8 != 0) {
                Object obj4 = this.f4659c;
                ((o1) obj4).f4610a = i8 | 0;
                if (((o1) obj4).a()) {
                    view2 = view;
                }
            }
            i3 += i11;
        }
        return view2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f4658b
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = r0.length
            if (r6 < r0) goto L_0x000c
            return r1
        L_0x000c:
            java.lang.Object r0 = r5.f4659c
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x0014
            goto L_0x0071
        L_0x0014:
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            if (r0 != 0) goto L_0x001a
            goto L_0x0034
        L_0x001a:
            int r0 = r0.size()
            int r0 = r0 + r1
        L_0x001f:
            if (r0 < 0) goto L_0x0034
            java.lang.Object r3 = r5.f4659c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r0)
            p1.l1 r3 = (p1.l1) r3
            int r4 = r3.f4566d
            if (r4 != r6) goto L_0x0031
            r2 = r3
            goto L_0x0034
        L_0x0031:
            int r0 = r0 + -1
            goto L_0x001f
        L_0x0034:
            if (r2 == 0) goto L_0x003d
            java.lang.Object r0 = r5.f4659c
            java.util.List r0 = (java.util.List) r0
            r0.remove(r2)
        L_0x003d:
            java.lang.Object r0 = r5.f4659c
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r2 = 0
        L_0x0046:
            if (r2 >= r0) goto L_0x005a
            java.lang.Object r3 = r5.f4659c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r2)
            p1.l1 r3 = (p1.l1) r3
            int r3 = r3.f4566d
            if (r3 < r6) goto L_0x0057
            goto L_0x005b
        L_0x0057:
            int r2 = r2 + 1
            goto L_0x0046
        L_0x005a:
            r2 = r1
        L_0x005b:
            if (r2 == r1) goto L_0x0071
            java.lang.Object r0 = r5.f4659c
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
            p1.l1 r0 = (p1.l1) r0
            java.lang.Object r3 = r5.f4659c
            java.util.List r3 = (java.util.List) r3
            r3.remove(r2)
            int r0 = r0.f4566d
            goto L_0x0072
        L_0x0071:
            r0 = r1
        L_0x0072:
            if (r0 != r1) goto L_0x0082
            java.lang.Object r0 = r5.f4658b
            int[] r0 = (int[]) r0
            int r2 = r0.length
            java.util.Arrays.fill(r0, r6, r2, r1)
            java.lang.Object r6 = r5.f4658b
            int[] r6 = (int[]) r6
            int r6 = r6.length
            return r6
        L_0x0082:
            int r0 = r0 + 1
            java.lang.Object r2 = r5.f4658b
            int[] r2 = (int[]) r2
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.Object r2 = r5.f4658b
            int[] r2 = (int[]) r2
            java.util.Arrays.fill(r2, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.r1.g(int):int");
    }

    public final boolean h(View view) {
        int i3;
        o1 o1Var = (o1) this.f4659c;
        l lVar = (l) ((p1) this.f4658b);
        int i6 = lVar.f1169a;
        Object obj = lVar.f1170b;
        switch (i6) {
            case 0:
                i3 = ((o0) obj).C();
                break;
            default:
                i3 = ((o0) obj).E();
                break;
        }
        int c6 = ((l) ((p1) this.f4658b)).c();
        int b6 = ((l) ((p1) this.f4658b)).b(view);
        int a6 = ((l) ((p1) this.f4658b)).a(view);
        o1Var.f4611b = i3;
        o1Var.f4612c = c6;
        o1Var.f4613d = b6;
        o1Var.f4614e = a6;
        Object obj2 = this.f4659c;
        ((o1) obj2).f4610a = 24579 | 0;
        return ((o1) obj2).a();
    }

    public final void i(int i3, int i6) {
        int[] iArr = (int[]) this.f4658b;
        if (iArr != null && i3 < iArr.length) {
            int i7 = i3 + i6;
            e(i7);
            int[] iArr2 = (int[]) this.f4658b;
            System.arraycopy(iArr2, i3, iArr2, i7, (iArr2.length - i3) - i6);
            Arrays.fill((int[]) this.f4658b, i3, i7, -1);
            List list = (List) this.f4659c;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    l1 l1Var = (l1) ((List) this.f4659c).get(size);
                    int i8 = l1Var.f4566d;
                    if (i8 >= i3) {
                        l1Var.f4566d = i8 + i6;
                    }
                }
            }
        }
    }

    public final void j(int i3, int i6) {
        int[] iArr = (int[]) this.f4658b;
        if (iArr != null && i3 < iArr.length) {
            int i7 = i3 + i6;
            e(i7);
            int[] iArr2 = (int[]) this.f4658b;
            System.arraycopy(iArr2, i7, iArr2, i3, (iArr2.length - i3) - i6);
            int[] iArr3 = (int[]) this.f4658b;
            Arrays.fill(iArr3, iArr3.length - i6, iArr3.length, -1);
            List list = (List) this.f4659c;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    l1 l1Var = (l1) ((List) this.f4659c).get(size);
                    int i8 = l1Var.f4566d;
                    if (i8 >= i3) {
                        if (i8 < i7) {
                            ((List) this.f4659c).remove(size);
                        } else {
                            l1Var.f4566d = i8 - i6;
                        }
                    }
                }
            }
        }
    }

    public final k0 k(f1 f1Var, int i3) {
        q1 q1Var;
        k0 k0Var;
        int e6 = ((j) this.f4658b).e(f1Var);
        if (e6 >= 0 && (q1Var = (q1) ((j) this.f4658b).l(e6)) != null) {
            int i6 = q1Var.f4649a;
            if ((i6 & i3) != 0) {
                int i7 = i6 & (~i3);
                q1Var.f4649a = i7;
                if (i3 == 4) {
                    k0Var = q1Var.f4650b;
                } else if (i3 == 8) {
                    k0Var = q1Var.f4651c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i7 & 12) == 0) {
                    ((j) this.f4658b).j(e6);
                    q1Var.f4649a = 0;
                    q1Var.f4650b = null;
                    q1Var.f4651c = null;
                    q1.f4648d.a(q1Var);
                }
                return k0Var;
            }
        }
        return null;
    }

    public final void l(f1 f1Var) {
        q1 q1Var = (q1) ((j) this.f4658b).getOrDefault(f1Var, (Object) null);
        if (q1Var != null) {
            q1Var.f4649a &= -2;
        }
    }

    public final void m(f1 f1Var) {
        d dVar = (d) this.f4659c;
        if (dVar.f3868d) {
            dVar.c();
        }
        int i3 = dVar.f3871g - 1;
        while (true) {
            if (i3 < 0) {
                break;
            } else if (f1Var == ((d) this.f4659c).f(i3)) {
                d dVar2 = (d) this.f4659c;
                Object[] objArr = dVar2.f3870f;
                Object obj = objArr[i3];
                Object obj2 = d.f3867h;
                if (obj != obj2) {
                    objArr[i3] = obj2;
                    dVar2.f3868d = true;
                }
            } else {
                i3--;
            }
        }
        q1 q1Var = (q1) ((j) this.f4658b).remove(f1Var);
        if (q1Var != null) {
            q1Var.f4649a = 0;
            q1Var.f4650b = null;
            q1Var.f4651c = null;
            q1.f4648d.a(q1Var);
        }
    }

    public r1(l lVar) {
        this.f4657a = 2;
        this.f4658b = lVar;
        this.f4659c = new o1();
    }
}
