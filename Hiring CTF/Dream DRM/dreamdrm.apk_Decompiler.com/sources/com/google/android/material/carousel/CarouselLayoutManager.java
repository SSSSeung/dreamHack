package com.google.android.material.carousel;

import a2.m;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.widget.a0;
import androidx.recyclerview.widget.RecyclerView;
import e3.a;
import e3.b;
import e3.d;
import java.util.List;
import p1.a1;
import p1.b1;
import p1.c0;
import p1.o0;
import p1.p0;
import p1.v0;

public class CarouselLayoutManager extends o0 implements a1 {

    /* renamed from: p  reason: collision with root package name */
    public int f1889p;

    /* renamed from: q  reason: collision with root package name */
    public b f1890q;

    public CarouselLayoutManager() {
        new a();
        k0();
        E0(0);
    }

    public static a0 A0(float f6, List list, boolean z5) {
        float f7 = Float.MAX_VALUE;
        int i3 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        float f8 = -3.4028235E38f;
        float f9 = Float.MAX_VALUE;
        float f10 = Float.MAX_VALUE;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((d) list.get(i9)).getClass();
            float abs = Math.abs(0.0f - f6);
            if (0.0f <= f6 && abs <= f7) {
                i3 = i9;
                f7 = abs;
            }
            if (0.0f > f6 && abs <= f9) {
                i7 = i9;
                f9 = abs;
            }
            if (0.0f <= f10) {
                i6 = i9;
                f10 = 0.0f;
            }
            if (0.0f > f8) {
                i8 = i9;
                f8 = 0.0f;
            }
        }
        if (i3 == -1) {
            i3 = i6;
        }
        if (i7 == -1) {
            i7 = i8;
        }
        return new a0((d) list.get(i3), (d) list.get(i7));
    }

    public static float z0(float f6, a0 a0Var) {
        d dVar = (d) a0Var.f503e;
        dVar.getClass();
        d dVar2 = (d) a0Var.f504f;
        dVar2.getClass();
        dVar.getClass();
        dVar2.getClass();
        return z2.a.a(0.0f, 0.0f, 0.0f, 0.0f, f6);
    }

    public final boolean B0() {
        return this.f1890q.f2562a == 0;
    }

    public final boolean C0() {
        return B0() && A() == 1;
    }

    public final int D0(int i3, v0 v0Var, b1 b1Var) {
        if (v() == 0 || i3 == 0) {
            return 0;
        }
        int i6 = this.f1889p;
        int i7 = i6 + i3;
        if (i7 < 0 || i7 > 0) {
            i3 = 0 - i6;
        }
        this.f1889p = i6 + i3;
        F0();
        throw null;
    }

    public final void E0(int i3) {
        b bVar;
        if (i3 == 0 || i3 == 1) {
            c((String) null);
            b bVar2 = this.f1890q;
            if (bVar2 == null || i3 != bVar2.f2562a) {
                if (i3 == 0) {
                    bVar = new b(0, this, 1);
                } else if (i3 == 1) {
                    bVar = new b(1, this, 0);
                } else {
                    throw new IllegalArgumentException("invalid orientation");
                }
                this.f1890q = bVar;
                k0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(m.g("invalid orientation:", i3));
    }

    public final void F0() {
        C0();
        throw null;
    }

    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(o0.F(u(0)));
            accessibilityEvent.setToIndex(o0.F(u(v() - 1)));
        }
    }

    public final PointF a(int i3) {
        return null;
    }

    public final void a0(v0 v0Var, b1 b1Var) {
        if (b1Var.b() <= 0) {
            f0(v0Var);
            return;
        }
        C0();
        v0Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final void b0(b1 b1Var) {
        if (v() != 0) {
            o0.F(u(0));
        }
    }

    public final boolean d() {
        return B0();
    }

    public final boolean e() {
        return !B0();
    }

    public final int j(b1 b1Var) {
        throw null;
    }

    public final boolean j0(RecyclerView recyclerView, View view, Rect rect, boolean z5, boolean z6) {
        return false;
    }

    public final int k(b1 b1Var) {
        return this.f1889p;
    }

    public final int l(b1 b1Var) {
        return 0 - 0;
    }

    public final int l0(int i3, v0 v0Var, b1 b1Var) {
        if (!B0()) {
            return 0;
        }
        D0(i3, v0Var, b1Var);
        return 0;
    }

    public final int m(b1 b1Var) {
        throw null;
    }

    public final void m0(int i3) {
    }

    public final int n(b1 b1Var) {
        return this.f1889p;
    }

    public final int n0(int i3, v0 v0Var, b1 b1Var) {
        if (!e()) {
            return 0;
        }
        D0(i3, v0Var, b1Var);
        return 0;
    }

    public final int o(b1 b1Var) {
        return 0 - 0;
    }

    public final p0 r() {
        return new p0(-2, -2);
    }

    public final void w0(RecyclerView recyclerView, int i3) {
        c0 c0Var = new c0(this, recyclerView.getContext(), 1);
        c0Var.f4718a = i3;
        x0(c0Var);
    }

    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerX();
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i3, int i6) {
        new a();
        E0(o0.G(context, attributeSet, i3, i6).f4584a);
        k0();
    }
}
