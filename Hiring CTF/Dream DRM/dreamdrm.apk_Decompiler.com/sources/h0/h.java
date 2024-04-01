package h0;

import i0.b;
import j0.e;
import java.util.ArrayList;

public final class h extends k {
    public float A0 = 0.5f;
    public float B0 = 0.5f;
    public int C0 = 0;
    public int D0 = 0;
    public int E0 = 2;
    public int F0 = 2;
    public int G0 = 0;
    public int H0 = -1;
    public int I0 = 0;
    public final ArrayList J0 = new ArrayList();
    public e[] K0 = null;
    public e[] L0 = null;
    public int[] M0 = null;
    public e[] N0;
    public int O0 = 0;
    public int f0 = 0;

    /* renamed from: g0  reason: collision with root package name */
    public int f3328g0 = 0;

    /* renamed from: h0  reason: collision with root package name */
    public int f3329h0 = 0;

    /* renamed from: i0  reason: collision with root package name */
    public int f3330i0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public int f3331j0 = 0;

    /* renamed from: k0  reason: collision with root package name */
    public int f3332k0 = 0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f3333l0 = false;

    /* renamed from: m0  reason: collision with root package name */
    public int f3334m0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    public int f3335n0 = 0;

    /* renamed from: o0  reason: collision with root package name */
    public final b f3336o0 = new b();

    /* renamed from: p0  reason: collision with root package name */
    public e f3337p0 = null;

    /* renamed from: q0  reason: collision with root package name */
    public int f3338q0 = -1;

    /* renamed from: r0  reason: collision with root package name */
    public int f3339r0 = -1;

    /* renamed from: s0  reason: collision with root package name */
    public int f3340s0 = -1;

    /* renamed from: t0  reason: collision with root package name */
    public int f3341t0 = -1;

    /* renamed from: u0  reason: collision with root package name */
    public int f3342u0 = -1;

    /* renamed from: v0  reason: collision with root package name */
    public int f3343v0 = -1;

    /* renamed from: w0  reason: collision with root package name */
    public float f3344w0 = 0.5f;

    /* renamed from: x0  reason: collision with root package name */
    public float f3345x0 = 0.5f;

    /* renamed from: y0  reason: collision with root package name */
    public float f3346y0 = 0.5f;

    /* renamed from: z0  reason: collision with root package name */
    public float f3347z0 = 0.5f;

    public final int B(e eVar, int i3) {
        if (eVar == null) {
            return 0;
        }
        int[] iArr = eVar.f3273c0;
        if (iArr[1] == 3) {
            int i6 = eVar.f3281k;
            if (i6 == 0) {
                return 0;
            }
            if (i6 == 2) {
                int i7 = (int) (eVar.f3288r * ((float) i3));
                if (i7 != eVar.j()) {
                    D(eVar, iArr[0], eVar.l(), 1, i7);
                }
                return i7;
            } else if (i6 == 1) {
                return eVar.j();
            } else {
                if (i6 == 3) {
                    return (int) ((((float) eVar.l()) * eVar.L) + 0.5f);
                }
            }
        }
        return eVar.j();
    }

    public final int C(e eVar, int i3) {
        if (eVar == null) {
            return 0;
        }
        int[] iArr = eVar.f3273c0;
        if (iArr[0] == 3) {
            int i6 = eVar.f3280j;
            if (i6 == 0) {
                return 0;
            }
            if (i6 == 2) {
                int i7 = (int) (eVar.f3285o * ((float) i3));
                if (i7 != eVar.l()) {
                    D(eVar, 1, i7, iArr[1], eVar.j());
                }
                return i7;
            } else if (i6 == 1) {
                return eVar.l();
            } else {
                if (i6 == 3) {
                    return (int) ((((float) eVar.j()) * eVar.L) + 0.5f);
                }
            }
        }
        return eVar.l();
    }

    public final void D(e eVar, int i3, int i6, int i7, int i8) {
        e eVar2;
        e eVar3;
        while (true) {
            eVar2 = this.f3337p0;
            if (eVar2 != null || (eVar3 = this.I) == null) {
                b bVar = this.f3336o0;
                bVar.f3507a = i3;
                bVar.f3508b = i7;
                bVar.f3509c = i6;
                bVar.f3510d = i8;
                eVar2.a(eVar, bVar);
                eVar.y(bVar.f3511e);
                eVar.v(bVar.f3512f);
                eVar.w = bVar.f3514h;
                int i9 = bVar.f3513g;
                eVar.P = i9;
            } else {
                this.f3337p0 = ((f) eVar3).f3298g0;
            }
        }
        b bVar2 = this.f3336o0;
        bVar2.f3507a = i3;
        bVar2.f3508b = i7;
        bVar2.f3509c = i6;
        bVar2.f3510d = i8;
        eVar2.a(eVar, bVar2);
        eVar.y(bVar2.f3511e);
        eVar.v(bVar2.f3512f);
        eVar.w = bVar2.f3514h;
        int i92 = bVar2.f3513g;
        eVar.P = i92;
        eVar.w = i92 > 0;
    }

    public final void a() {
        for (int i3 = 0; i3 < this.f3353e0; i3++) {
            e eVar = this.f3352d0[i3];
        }
    }

    public final void b(g0.e eVar) {
        e eVar2;
        super.b(eVar);
        e eVar3 = this.I;
        boolean z5 = eVar3 != null ? ((f) eVar3).f3299h0 : false;
        int i3 = this.G0;
        ArrayList arrayList = this.J0;
        if (i3 != 0) {
            if (i3 == 1) {
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    ((g) arrayList.get(i6)).b(i6, z5, i6 == size + -1);
                    i6++;
                }
            } else if (!(i3 != 2 || this.M0 == null || this.L0 == null || this.K0 == null)) {
                for (int i7 = 0; i7 < this.O0; i7++) {
                    this.N0[i7].t();
                }
                int[] iArr = this.M0;
                int i8 = iArr[0];
                int i9 = iArr[1];
                e eVar4 = null;
                for (int i10 = 0; i10 < i8; i10++) {
                    e eVar5 = this.L0[z5 ? (i8 - i10) - 1 : i10];
                    if (!(eVar5 == null || eVar5.V == 8)) {
                        d dVar = eVar5.f3293x;
                        if (i10 == 0) {
                            eVar5.f(dVar, this.f3293x, this.f3331j0);
                            eVar5.X = this.f3338q0;
                            eVar5.S = this.f3344w0;
                        }
                        if (i10 == i8 - 1) {
                            eVar5.f(eVar5.f3295z, this.f3295z, this.f3332k0);
                        }
                        if (i10 > 0) {
                            eVar5.f(dVar, eVar4.f3295z, this.C0);
                            eVar4.f(eVar4.f3295z, dVar, 0);
                        }
                        eVar4 = eVar5;
                    }
                }
                for (int i11 = 0; i11 < i9; i11++) {
                    e eVar6 = this.K0[i11];
                    if (!(eVar6 == null || eVar6.V == 8)) {
                        d dVar2 = eVar6.f3294y;
                        if (i11 == 0) {
                            eVar6.f(dVar2, this.f3294y, this.f0);
                            eVar6.Y = this.f3339r0;
                            eVar6.T = this.f3345x0;
                        }
                        if (i11 == i9 - 1) {
                            eVar6.f(eVar6.A, this.A, this.f3328g0);
                        }
                        if (i11 > 0) {
                            eVar6.f(dVar2, eVar4.A, this.D0);
                            eVar4.f(eVar4.A, dVar2, 0);
                        }
                        eVar4 = eVar6;
                    }
                }
                for (int i12 = 0; i12 < i8; i12++) {
                    for (int i13 = 0; i13 < i9; i13++) {
                        int i14 = (i13 * i8) + i12;
                        if (this.I0 == 1) {
                            i14 = (i12 * i9) + i13;
                        }
                        e[] eVarArr = this.N0;
                        if (!(i14 >= eVarArr.length || (eVar2 = eVarArr[i14]) == null || eVar2.V == 8)) {
                            e eVar7 = this.L0[i12];
                            e eVar8 = this.K0[i13];
                            if (eVar2 != eVar7) {
                                eVar2.f(eVar2.f3293x, eVar7.f3293x, 0);
                                eVar2.f(eVar2.f3295z, eVar7.f3295z, 0);
                            }
                            if (eVar2 != eVar8) {
                                eVar2.f(eVar2.f3294y, eVar8.f3294y, 0);
                                eVar2.f(eVar2.A, eVar8.A, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((g) arrayList.get(0)).b(0, z5, true);
        }
        this.f3333l0 = false;
    }
}
