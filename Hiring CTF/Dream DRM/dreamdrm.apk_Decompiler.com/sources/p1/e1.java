package p1;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import f1.c;
import java.util.Arrays;
import java.util.WeakHashMap;
import x0.d0;
import x0.u0;

public final class e1 implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public int f4469d;

    /* renamed from: e  reason: collision with root package name */
    public int f4470e;

    /* renamed from: f  reason: collision with root package name */
    public OverScroller f4471f;

    /* renamed from: g  reason: collision with root package name */
    public Interpolator f4472g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4473h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4474i = false;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4475j;

    public e1(RecyclerView recyclerView) {
        this.f4475j = recyclerView;
        c cVar = RecyclerView.H0;
        this.f4472g = cVar;
        this.f4471f = new OverScroller(recyclerView.getContext(), cVar);
    }

    public final void a(int i3, int i6) {
        RecyclerView recyclerView = this.f4475j;
        recyclerView.setScrollState(2);
        this.f4470e = 0;
        this.f4469d = 0;
        Interpolator interpolator = this.f4472g;
        c cVar = RecyclerView.H0;
        if (interpolator != cVar) {
            this.f4472g = cVar;
            this.f4471f = new OverScroller(recyclerView.getContext(), cVar);
        }
        this.f4471f.fling(0, 0, i3, i6, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f4473h) {
            this.f4474i = true;
            return;
        }
        RecyclerView recyclerView = this.f4475j;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = u0.f5622a;
        d0.m(recyclerView, this);
    }

    public final void c(int i3, int i6, int i7, Interpolator interpolator) {
        RecyclerView recyclerView = this.f4475j;
        if (i7 == Integer.MIN_VALUE) {
            int abs = Math.abs(i3);
            int abs2 = Math.abs(i6);
            boolean z5 = abs > abs2;
            int width = z5 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z5) {
                abs = abs2;
            }
            i7 = Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), 2000);
        }
        int i8 = i7;
        if (interpolator == null) {
            interpolator = RecyclerView.H0;
        }
        if (this.f4472g != interpolator) {
            this.f4472g = interpolator;
            this.f4471f = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f4470e = 0;
        this.f4469d = 0;
        recyclerView.setScrollState(2);
        this.f4471f.startScroll(0, 0, i3, i6, i8);
        b();
    }

    public final void run() {
        int i3;
        int i6;
        int i7;
        int i8;
        RecyclerView recyclerView = this.f4475j;
        if (recyclerView.f1447p == null) {
            recyclerView.removeCallbacks(this);
            this.f4471f.abortAnimation();
            return;
        }
        this.f4474i = false;
        this.f4473h = true;
        recyclerView.p();
        OverScroller overScroller = this.f4471f;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i9 = currY - this.f4470e;
            this.f4469d = currX;
            this.f4470e = currY;
            int o5 = RecyclerView.o(currX - this.f4469d, recyclerView.I, recyclerView.K, recyclerView.getWidth());
            int o6 = RecyclerView.o(i9, recyclerView.J, recyclerView.L, recyclerView.getHeight());
            int[] iArr = recyclerView.f1456t0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean u3 = recyclerView.u(o5, o6, 1, iArr, (int[]) null);
            int[] iArr2 = recyclerView.f1456t0;
            if (u3) {
                o5 -= iArr2[0];
                o6 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(o5, o6);
            }
            if (recyclerView.f1445o != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.d0(o5, o6, iArr2);
                int i10 = iArr2[0];
                int i11 = iArr2[1];
                int i12 = o5 - i10;
                int i13 = o6 - i11;
                z zVar = recyclerView.f1447p.f4599e;
                if (zVar != null && !zVar.f4721d && zVar.f4722e) {
                    int b6 = recyclerView.f1432h0.b();
                    if (b6 == 0) {
                        zVar.i();
                    } else {
                        if (zVar.f4718a >= b6) {
                            zVar.f4718a = b6 - 1;
                        }
                        zVar.g(i10, i11);
                    }
                }
                i7 = i10;
                i6 = i12;
                i3 = i13;
                i8 = i11;
            } else {
                i6 = o5;
                i3 = o6;
                i8 = 0;
                i7 = 0;
            }
            if (!recyclerView.f1451r.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f1456t0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i14 = i8;
            recyclerView.v(i7, i8, i6, i3, (int[]) null, 1, iArr3);
            int i15 = i6 - iArr2[0];
            int i16 = i3 - iArr2[1];
            if (!(i7 == 0 && i14 == 0)) {
                recyclerView.w(i7, i14);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z5 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i15 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i16 != 0));
            z zVar2 = recyclerView.f1447p.f4599e;
            if ((zVar2 != null && zVar2.f4721d) || !z5) {
                b();
                s sVar = recyclerView.f0;
                if (sVar != null) {
                    sVar.a(recyclerView, i7, i14);
                }
            } else {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i17 = i15 < 0 ? -currVelocity : i15 > 0 ? currVelocity : 0;
                    if (i16 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i16 <= 0) {
                        currVelocity = 0;
                    }
                    if (i17 < 0) {
                        recyclerView.y();
                        if (recyclerView.I.isFinished()) {
                            recyclerView.I.onAbsorb(-i17);
                        }
                    } else if (i17 > 0) {
                        recyclerView.z();
                        if (recyclerView.K.isFinished()) {
                            recyclerView.K.onAbsorb(i17);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A();
                        if (recyclerView.J.isFinished()) {
                            recyclerView.J.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.x();
                        if (recyclerView.L.isFinished()) {
                            recyclerView.L.onAbsorb(currVelocity);
                        }
                    }
                    if (!(i17 == 0 && currVelocity == 0)) {
                        WeakHashMap weakHashMap = u0.f5622a;
                        d0.k(recyclerView);
                    }
                }
                if (RecyclerView.F0) {
                    q qVar = recyclerView.f1430g0;
                    int[] iArr4 = (int[]) qVar.f4647d;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    qVar.f4646c = 0;
                }
            }
        }
        z zVar3 = recyclerView.f1447p.f4599e;
        if (zVar3 != null && zVar3.f4721d) {
            zVar3.g(0, 0);
        }
        this.f4473h = false;
        if (this.f4474i) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = u0.f5622a;
            d0.m(recyclerView, this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.j0(1);
    }
}
