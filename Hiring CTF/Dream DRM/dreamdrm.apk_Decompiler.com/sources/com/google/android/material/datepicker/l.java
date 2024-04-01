package com.google.android.material.datepicker;

import a2.m;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class l<S> extends u {

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ int f1939h0 = 0;
    public int W;
    public c X;
    public p Y;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public b f1940a0;

    /* renamed from: b0  reason: collision with root package name */
    public RecyclerView f1941b0;

    /* renamed from: c0  reason: collision with root package name */
    public RecyclerView f1942c0;

    /* renamed from: d0  reason: collision with root package name */
    public View f1943d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f1944e0;
    public View f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f1945g0;

    public final void H(int i3) {
        this.f1942c0.post(new g(this, i3));
    }

    public final void I(p pVar) {
        RecyclerView recyclerView;
        int i3;
        p pVar2 = ((t) this.f1942c0.getAdapter()).f1980d.f1917d;
        Calendar calendar = pVar2.f1964d;
        if (calendar instanceof GregorianCalendar) {
            int i6 = pVar.f1966f;
            int i7 = pVar2.f1966f;
            int i8 = pVar.f1965e;
            int i9 = pVar2.f1965e;
            int i10 = (i8 - i9) + ((i6 - i7) * 12);
            p pVar3 = this.Y;
            if (calendar instanceof GregorianCalendar) {
                int i11 = i10 - ((pVar3.f1965e - i9) + ((pVar3.f1966f - i7) * 12));
                boolean z5 = true;
                boolean z6 = Math.abs(i11) > 3;
                if (i11 <= 0) {
                    z5 = false;
                }
                this.Y = pVar;
                if (!z6 || !z5) {
                    if (z6) {
                        recyclerView = this.f1942c0;
                        i3 = i10 + 3;
                    }
                    H(i10);
                    return;
                }
                recyclerView = this.f1942c0;
                i3 = i10 - 3;
                recyclerView.e0(i3);
                H(i10);
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final void J(int i3) {
        this.Z = i3;
        if (i3 == 2) {
            this.f1941b0.getLayoutManager().m0(this.Y.f1966f - ((y) this.f1941b0.getAdapter()).f1985d.X.f1917d.f1966f);
            this.f0.setVisibility(0);
            this.f1945g0.setVisibility(8);
            this.f1943d0.setVisibility(8);
            this.f1944e0.setVisibility(8);
        } else if (i3 == 1) {
            this.f0.setVisibility(8);
            this.f1945g0.setVisibility(0);
            this.f1943d0.setVisibility(0);
            this.f1944e0.setVisibility(0);
            I(this.Y);
        }
    }

    public final void r(Bundle bundle) {
        super.r(bundle);
        if (bundle == null) {
            bundle = this.f1259i;
        }
        this.W = bundle.getInt("THEME_RES_ID_KEY");
        m.n(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.X = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        m.n(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.Y = (p) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x018d, code lost:
        r0 = new p1.d0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View s(android.view.LayoutInflater r11, android.view.ViewGroup r12) {
        /*
            r10 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r10.i()
            int r2 = r10.W
            r0.<init>(r1, r2)
            android.support.v4.media.b r1 = new android.support.v4.media.b
            r1.<init>(r0)
            r10.f1940a0 = r1
            android.view.LayoutInflater r11 = r11.cloneInContext(r0)
            com.google.android.material.datepicker.c r1 = r10.X
            com.google.android.material.datepicker.p r1 = r1.f1917d
            boolean r2 = com.google.android.material.datepicker.n.M(r0)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0027
            r2 = 2131427412(0x7f0b0054, float:1.847644E38)
            r5 = r3
            goto L_0x002b
        L_0x0027:
            r2 = 2131427407(0x7f0b004f, float:1.847643E38)
            r5 = r4
        L_0x002b:
            android.view.View r11 = r11.inflate(r2, r12, r4)
            android.content.Context r12 = r10.D()
            android.content.res.Resources r12 = r12.getResources()
            r2 = 2131100293(0x7f060285, float:1.7812963E38)
            int r2 = r12.getDimensionPixelSize(r2)
            r6 = 2131100294(0x7f060286, float:1.7812965E38)
            int r6 = r12.getDimensionPixelOffset(r6)
            int r6 = r6 + r2
            r2 = 2131100292(0x7f060284, float:1.7812961E38)
            int r2 = r12.getDimensionPixelOffset(r2)
            int r2 = r2 + r6
            r6 = 2131100277(0x7f060275, float:1.781293E38)
            int r6 = r12.getDimensionPixelSize(r6)
            int r7 = com.google.android.material.datepicker.q.f1971g
            r8 = 2131100272(0x7f060270, float:1.781292E38)
            int r8 = r12.getDimensionPixelSize(r8)
            int r8 = r8 * r7
            int r7 = r7 + -1
            r9 = 2131100291(0x7f060283, float:1.781296E38)
            int r9 = r12.getDimensionPixelOffset(r9)
            int r9 = r9 * r7
            int r9 = r9 + r8
            r7 = 2131100269(0x7f06026d, float:1.7812915E38)
            int r12 = r12.getDimensionPixelOffset(r7)
            int r2 = r2 + r6
            int r2 = r2 + r9
            int r2 = r2 + r12
            r11.setMinimumHeight(r2)
            r12 = 2131230983(0x7f080107, float:1.8078034E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.GridView r12 = (android.widget.GridView) r12
            com.google.android.material.datepicker.h r2 = new com.google.android.material.datepicker.h
            r2.<init>(r4, r10)
            x0.u0.l(r12, r2)
            com.google.android.material.datepicker.c r2 = r10.X
            int r2 = r2.f1921h
            com.google.android.material.datepicker.e r6 = new com.google.android.material.datepicker.e
            if (r2 <= 0) goto L_0x0094
            r6.<init>(r2)
            goto L_0x0097
        L_0x0094:
            r6.<init>()
        L_0x0097:
            r12.setAdapter(r6)
            int r1 = r1.f1967g
            r12.setNumColumns(r1)
            r12.setEnabled(r4)
            r12 = 2131230986(0x7f08010a, float:1.807804E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            r10.f1942c0 = r12
            com.google.android.material.datepicker.i r12 = new com.google.android.material.datepicker.i
            r10.i()
            r12.<init>(r10, r5, r5)
            androidx.recyclerview.widget.RecyclerView r1 = r10.f1942c0
            r1.setLayoutManager(r12)
            androidx.recyclerview.widget.RecyclerView r12 = r10.f1942c0
            java.lang.String r1 = "MONTHS_VIEW_GROUP_TAG"
            r12.setTag(r1)
            com.google.android.material.datepicker.t r12 = new com.google.android.material.datepicker.t
            com.google.android.material.datepicker.c r1 = r10.X
            e2.f r2 = new e2.f
            r5 = 11
            r2.<init>(r5, r10)
            r12.<init>(r0, r1, r2)
            androidx.recyclerview.widget.RecyclerView r1 = r10.f1942c0
            r1.setAdapter(r12)
            android.content.res.Resources r1 = r0.getResources()
            r2 = 2131296306(0x7f090032, float:1.8210525E38)
            int r1 = r1.getInteger(r2)
            r2 = 2131230989(0x7f08010d, float:1.8078046E38)
            android.view.View r5 = r11.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            r10.f1941b0 = r5
            if (r5 == 0) goto L_0x010d
            r5.setHasFixedSize(r3)
            androidx.recyclerview.widget.RecyclerView r5 = r10.f1941b0
            androidx.recyclerview.widget.GridLayoutManager r6 = new androidx.recyclerview.widget.GridLayoutManager
            r6.<init>(r1)
            r5.setLayoutManager(r6)
            androidx.recyclerview.widget.RecyclerView r1 = r10.f1941b0
            com.google.android.material.datepicker.y r5 = new com.google.android.material.datepicker.y
            r5.<init>(r10)
            r1.setAdapter(r5)
            androidx.recyclerview.widget.RecyclerView r1 = r10.f1941b0
            com.google.android.material.datepicker.j r5 = new com.google.android.material.datepicker.j
            r5.<init>(r10)
            r1.i(r5)
        L_0x010d:
            r1 = 2131230976(0x7f080100, float:1.807802E38)
            android.view.View r5 = r11.findViewById(r1)
            if (r5 == 0) goto L_0x0187
            android.view.View r1 = r11.findViewById(r1)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            java.lang.String r5 = "SELECTOR_TOGGLE_TAG"
            r1.setTag(r5)
            com.google.android.material.datepicker.h r5 = new com.google.android.material.datepicker.h
            r6 = 2
            r5.<init>(r6, r10)
            x0.u0.l(r1, r5)
            r5 = 2131230978(0x7f080102, float:1.8078024E38)
            android.view.View r5 = r11.findViewById(r5)
            r10.f1943d0 = r5
            java.lang.String r7 = "NAVIGATION_PREV_TAG"
            r5.setTag(r7)
            r5 = 2131230977(0x7f080101, float:1.8078022E38)
            android.view.View r5 = r11.findViewById(r5)
            r10.f1944e0 = r5
            java.lang.String r7 = "NAVIGATION_NEXT_TAG"
            r5.setTag(r7)
            android.view.View r2 = r11.findViewById(r2)
            r10.f0 = r2
            r2 = 2131230982(0x7f080106, float:1.8078032E38)
            android.view.View r2 = r11.findViewById(r2)
            r10.f1945g0 = r2
            r10.J(r3)
            com.google.android.material.datepicker.p r2 = r10.Y
            java.lang.String r2 = r2.c()
            r1.setText(r2)
            androidx.recyclerview.widget.RecyclerView r2 = r10.f1942c0
            com.google.android.material.datepicker.k r5 = new com.google.android.material.datepicker.k
            r5.<init>(r10, r12, r1)
            r2.j(r5)
            e.b r2 = new e.b
            r2.<init>(r6, r10)
            r1.setOnClickListener(r2)
            android.view.View r1 = r10.f1944e0
            com.google.android.material.datepicker.f r2 = new com.google.android.material.datepicker.f
            r2.<init>(r10, r12, r3)
            r1.setOnClickListener(r2)
            android.view.View r1 = r10.f1943d0
            com.google.android.material.datepicker.f r2 = new com.google.android.material.datepicker.f
            r2.<init>(r10, r12, r4)
            r1.setOnClickListener(r2)
        L_0x0187:
            boolean r0 = com.google.android.material.datepicker.n.M(r0)
            if (r0 != 0) goto L_0x01da
            p1.d0 r0 = new p1.d0
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView r1 = r10.f1942c0
            androidx.recyclerview.widget.RecyclerView r2 = r0.f4461a
            if (r2 != r1) goto L_0x0199
            goto L_0x01da
        L_0x0199:
            p1.i1 r4 = r0.f4462b
            if (r2 == 0) goto L_0x01aa
            java.util.ArrayList r2 = r2.f1436j0
            if (r2 == 0) goto L_0x01a4
            r2.remove(r4)
        L_0x01a4:
            androidx.recyclerview.widget.RecyclerView r2 = r0.f4461a
            r5 = 0
            r2.setOnFlingListener(r5)
        L_0x01aa:
            r0.f4461a = r1
            if (r1 == 0) goto L_0x01da
            p1.q0 r1 = r1.getOnFlingListener()
            if (r1 != 0) goto L_0x01d2
            androidx.recyclerview.widget.RecyclerView r1 = r0.f4461a
            r1.j(r4)
            androidx.recyclerview.widget.RecyclerView r1 = r0.f4461a
            r1.setOnFlingListener(r0)
            android.widget.Scroller r1 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r2 = r0.f4461a
            android.content.Context r2 = r2.getContext()
            android.view.animation.DecelerateInterpolator r4 = new android.view.animation.DecelerateInterpolator
            r4.<init>()
            r1.<init>(r2, r4)
            r0.e()
            goto L_0x01da
        L_0x01d2:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "An instance of OnFlingListener already set."
            r11.<init>(r12)
            throw r11
        L_0x01da:
            androidx.recyclerview.widget.RecyclerView r0 = r10.f1942c0
            com.google.android.material.datepicker.p r1 = r10.Y
            com.google.android.material.datepicker.c r12 = r12.f1980d
            com.google.android.material.datepicker.p r12 = r12.f1917d
            java.util.Calendar r2 = r12.f1964d
            boolean r2 = r2 instanceof java.util.GregorianCalendar
            if (r2 == 0) goto L_0x0203
            int r2 = r1.f1966f
            int r4 = r12.f1966f
            int r2 = r2 - r4
            int r2 = r2 * 12
            int r1 = r1.f1965e
            int r12 = r12.f1965e
            int r1 = r1 - r12
            int r1 = r1 + r2
            r0.e0(r1)
            androidx.recyclerview.widget.RecyclerView r12 = r10.f1942c0
            com.google.android.material.datepicker.h r0 = new com.google.android.material.datepicker.h
            r0.<init>(r3, r10)
            x0.u0.l(r12, r0)
            return r11
        L_0x0203:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Only Gregorian calendars are supported."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.l.s(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.W);
        bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.X);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.Y);
    }
}
