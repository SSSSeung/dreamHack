package i0;

import h0.d;
import h0.e;

public abstract class m implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f3545a;

    /* renamed from: b  reason: collision with root package name */
    public e f3546b;

    /* renamed from: c  reason: collision with root package name */
    public k f3547c;

    /* renamed from: d  reason: collision with root package name */
    public int f3548d;

    /* renamed from: e  reason: collision with root package name */
    public final g f3549e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f3550f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3551g = false;

    /* renamed from: h  reason: collision with root package name */
    public final f f3552h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public final f f3553i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public int f3554j = 1;

    public m(e eVar) {
        this.f3546b = eVar;
    }

    public static void b(f fVar, f fVar2, int i3) {
        fVar.f3538l.add(fVar2);
        fVar.f3532f = i3;
        fVar2.f3537k.add(fVar);
    }

    public static f h(d dVar) {
        m mVar;
        m mVar2;
        d dVar2 = dVar.f3264d;
        if (dVar2 == null) {
            return null;
        }
        int ordinal = dVar2.f3263c.ordinal();
        e eVar = dVar2.f3262b;
        if (ordinal == 1) {
            mVar = eVar.f3274d;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                mVar2 = eVar.f3274d;
            } else if (ordinal == 4) {
                mVar2 = eVar.f3275e;
            } else if (ordinal != 5) {
                return null;
            } else {
                return eVar.f3275e.f3543k;
            }
            return mVar2.f3553i;
        } else {
            mVar = eVar.f3275e;
        }
        return mVar.f3552h;
    }

    public static f i(d dVar, int i3) {
        d dVar2 = dVar.f3264d;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f3262b;
        m mVar = i3 == 0 ? eVar.f3274d : eVar.f3275e;
        int ordinal = dVar2.f3263c.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return mVar.f3552h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return mVar.f3553i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i3, g gVar) {
        fVar.f3538l.add(fVar2);
        fVar.f3538l.add(this.f3549e);
        fVar.f3534h = i3;
        fVar.f3535i = gVar;
        fVar2.f3537k.add(fVar);
        gVar.f3537k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i3, int i6) {
        int i7;
        if (i6 == 0) {
            e eVar = this.f3546b;
            int i8 = eVar.f3284n;
            i7 = Math.max(eVar.f3283m, i3);
            if (i8 > 0) {
                i7 = Math.min(i8, i3);
            }
            if (i7 == i3) {
                return i3;
            }
        } else {
            e eVar2 = this.f3546b;
            int i9 = eVar2.f3287q;
            int max = Math.max(eVar2.f3286p, i3);
            if (i9 > 0) {
                max = Math.min(i9, i3);
            }
            if (i7 == i3) {
                return i3;
            }
        }
        return i7;
    }

    public long j() {
        g gVar = this.f3549e;
        if (gVar.f3536j) {
            return (long) gVar.f3533g;
        }
        return 0;
    }

    public abstract boolean k();

    public final void l(d dVar, d dVar2, int i3) {
        int i6;
        int i7;
        f h6 = h(dVar);
        f h7 = h(dVar2);
        if (h6.f3536j && h7.f3536j) {
            int c6 = dVar.c() + h6.f3533g;
            int c7 = h7.f3533g - dVar2.c();
            int i8 = c7 - c6;
            g gVar = this.f3549e;
            if (!gVar.f3536j && this.f3548d == 3) {
                int i9 = this.f3545a;
                if (i9 != 0) {
                    if (i9 == 1) {
                        i6 = Math.min(g(gVar.f3539m, i3), i8);
                    } else if (i9 == 2) {
                        e eVar = this.f3546b;
                        e eVar2 = eVar.I;
                        if (eVar2 != null) {
                            g gVar2 = (i3 == 0 ? eVar2.f3274d : eVar2.f3275e).f3549e;
                            if (gVar2.f3536j) {
                                i7 = (int) ((((float) gVar2.f3533g) * (i3 == 0 ? eVar.f3285o : eVar.f3288r)) + 0.5f);
                            }
                        }
                    } else if (i9 == 3) {
                        e eVar3 = this.f3546b;
                        m mVar = eVar3.f3274d;
                        int i10 = mVar.f3548d;
                        m mVar2 = eVar3.f3275e;
                        if (!(i10 == 3 && mVar.f3545a == 3 && mVar2.f3548d == 3 && mVar2.f3545a == 3)) {
                            if (i3 == 0) {
                                mVar = mVar2;
                            }
                            g gVar3 = mVar.f3549e;
                            if (gVar3.f3536j) {
                                float f6 = eVar3.L;
                                i6 = i3 == 1 ? (int) ((((float) gVar3.f3533g) / f6) + 0.5f) : (int) ((f6 * ((float) gVar3.f3533g)) + 0.5f);
                            }
                        }
                    }
                    gVar.d(i6);
                } else {
                    i7 = i8;
                }
                i6 = g(i7, i3);
                gVar.d(i6);
            }
            if (gVar.f3536j) {
                int i11 = gVar.f3533g;
                f fVar = this.f3553i;
                f fVar2 = this.f3552h;
                if (i11 == i8) {
                    fVar2.d(c6);
                    fVar.d(c7);
                    return;
                }
                e eVar4 = this.f3546b;
                float f7 = i3 == 0 ? eVar4.S : eVar4.T;
                if (h6 == h7) {
                    c6 = h6.f3533g;
                    c7 = h7.f3533g;
                    f7 = 0.5f;
                }
                fVar2.d((int) ((((float) ((c7 - c6) - i11)) * f7) + ((float) c6) + 0.5f));
                fVar.d(fVar2.f3533g + gVar.f3533g);
            }
        }
    }
}
