package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;
import b1.c;
import r0.b;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f805a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f806b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f807c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f808d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f809e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f810f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f811g;

    public /* synthetic */ v(TextView textView, int i3) {
        this.f805a = i3;
        this.f811g = textView;
    }

    public final void a() {
        TextView textView = this.f811g;
        Drawable a6 = c.a((CompoundButton) textView);
        if (a6 == null) {
            return;
        }
        if (this.f808d || this.f809e) {
            Drawable mutate = a6.mutate();
            if (this.f808d) {
                b.h(mutate, this.f806b);
            }
            if (this.f809e) {
                b.i(mutate, this.f807c);
            }
            if (mutate.isStateful()) {
                mutate.setState(((CompoundButton) textView).getDrawableState());
            }
            ((CompoundButton) textView).setButtonDrawable(mutate);
        }
    }

    public final void b() {
        TextView textView = this.f811g;
        Drawable checkMarkDrawable = ((CheckedTextView) textView).getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.f808d || this.f809e) {
            Drawable mutate = checkMarkDrawable.mutate();
            if (this.f808d) {
                b.h(mutate, this.f806b);
            }
            if (this.f809e) {
                b.i(mutate, this.f807c);
            }
            if (mutate.isStateful()) {
                mutate.setState(((CheckedTextView) textView).getDrawableState());
            }
            ((CheckedTextView) textView).setCheckMarkDrawable(mutate);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053 A[SYNTHETIC, Splitter:B:14:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076 A[Catch:{ all -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086 A[Catch:{ all -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00da A[SYNTHETIC, Splitter:B:43:0x00da] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fd A[Catch:{ all -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010d A[Catch:{ all -> 0x011e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.util.AttributeSet r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r7 = r18
            r8 = 0
            int r2 = r1.f805a
            r9 = -1
            r10 = 3
            r11 = 2
            r12 = 1
            r13 = 0
            android.widget.TextView r14 = r1.f811g
            switch(r2) {
                case 0: goto L_0x0015;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x009c
        L_0x0015:
            r2 = r14
            android.widget.CheckedTextView r2 = (android.widget.CheckedTextView) r2
            android.content.Context r3 = r2.getContext()
            int[] r4 = d.a.f2124l
            androidx.appcompat.widget.m3 r15 = androidx.appcompat.widget.m3.m(r3, r0, r4, r7)
            android.content.Context r3 = r2.getContext()
            java.lang.Object r5 = r15.f686b
            r6 = r5
            android.content.res.TypedArray r6 = (android.content.res.TypedArray) r6
            r5 = r17
            r7 = r18
            x0.u0.k(r2, r3, r4, r5, r6, r7)
            boolean r0 = r15.l(r12)     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0050
            int r0 = r15.i(r12, r13)     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0050
            r2 = r14
            android.widget.CheckedTextView r2 = (android.widget.CheckedTextView) r2     // Catch:{ NotFoundException -> 0x0050 }
            r3 = r14
            android.widget.CheckedTextView r3 = (android.widget.CheckedTextView) r3     // Catch:{ NotFoundException -> 0x0050 }
            android.content.Context r3 = r3.getContext()     // Catch:{ NotFoundException -> 0x0050 }
            android.graphics.drawable.Drawable r0 = w4.p.n(r3, r0)     // Catch:{ NotFoundException -> 0x0050 }
            r2.setCheckMarkDrawable(r0)     // Catch:{ NotFoundException -> 0x0050 }
            goto L_0x0051
        L_0x0050:
            r12 = r13
        L_0x0051:
            if (r12 != 0) goto L_0x0070
            boolean r0 = r15.l(r13)     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0070
            int r0 = r15.i(r13, r13)     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0070
            r2 = r14
            android.widget.CheckedTextView r2 = (android.widget.CheckedTextView) r2     // Catch:{ all -> 0x0097 }
            r3 = r14
            android.widget.CheckedTextView r3 = (android.widget.CheckedTextView) r3     // Catch:{ all -> 0x0097 }
            android.content.Context r3 = r3.getContext()     // Catch:{ all -> 0x0097 }
            android.graphics.drawable.Drawable r0 = w4.p.n(r3, r0)     // Catch:{ all -> 0x0097 }
            r2.setCheckMarkDrawable(r0)     // Catch:{ all -> 0x0097 }
        L_0x0070:
            boolean r0 = r15.l(r11)     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0080
            r0 = r14
            android.widget.CheckedTextView r0 = (android.widget.CheckedTextView) r0     // Catch:{ all -> 0x0097 }
            android.content.res.ColorStateList r2 = r15.b(r11)     // Catch:{ all -> 0x0097 }
            r0.setCheckMarkTintList(r2)     // Catch:{ all -> 0x0097 }
        L_0x0080:
            boolean r0 = r15.l(r10)     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0093
            android.widget.CheckedTextView r14 = (android.widget.CheckedTextView) r14     // Catch:{ all -> 0x0097 }
            int r0 = r15.h(r10, r9)     // Catch:{ all -> 0x0097 }
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.v1.b(r0, r8)     // Catch:{ all -> 0x0097 }
            r14.setCheckMarkTintMode(r0)     // Catch:{ all -> 0x0097 }
        L_0x0093:
            r15.o()
            return
        L_0x0097:
            r0 = move-exception
            r15.o()
            throw r0
        L_0x009c:
            r2 = r14
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            android.content.Context r3 = r2.getContext()
            int[] r4 = d.a.f2125m
            androidx.appcompat.widget.m3 r15 = androidx.appcompat.widget.m3.m(r3, r0, r4, r7)
            android.content.Context r3 = r2.getContext()
            java.lang.Object r5 = r15.f686b
            r6 = r5
            android.content.res.TypedArray r6 = (android.content.res.TypedArray) r6
            r5 = r17
            r7 = r18
            x0.u0.k(r2, r3, r4, r5, r6, r7)
            boolean r0 = r15.l(r12)     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x00d7
            int r0 = r15.i(r12, r13)     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x00d7
            r2 = r14
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2     // Catch:{ NotFoundException -> 0x00d7 }
            r3 = r14
            android.widget.CompoundButton r3 = (android.widget.CompoundButton) r3     // Catch:{ NotFoundException -> 0x00d7 }
            android.content.Context r3 = r3.getContext()     // Catch:{ NotFoundException -> 0x00d7 }
            android.graphics.drawable.Drawable r0 = w4.p.n(r3, r0)     // Catch:{ NotFoundException -> 0x00d7 }
            r2.setButtonDrawable(r0)     // Catch:{ NotFoundException -> 0x00d7 }
            goto L_0x00d8
        L_0x00d7:
            r12 = r13
        L_0x00d8:
            if (r12 != 0) goto L_0x00f7
            boolean r0 = r15.l(r13)     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x00f7
            int r0 = r15.i(r13, r13)     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x00f7
            r2 = r14
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2     // Catch:{ all -> 0x011e }
            r3 = r14
            android.widget.CompoundButton r3 = (android.widget.CompoundButton) r3     // Catch:{ all -> 0x011e }
            android.content.Context r3 = r3.getContext()     // Catch:{ all -> 0x011e }
            android.graphics.drawable.Drawable r0 = w4.p.n(r3, r0)     // Catch:{ all -> 0x011e }
            r2.setButtonDrawable(r0)     // Catch:{ all -> 0x011e }
        L_0x00f7:
            boolean r0 = r15.l(r11)     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x0107
            r0 = r14
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0     // Catch:{ all -> 0x011e }
            android.content.res.ColorStateList r2 = r15.b(r11)     // Catch:{ all -> 0x011e }
            b1.b.c(r0, r2)     // Catch:{ all -> 0x011e }
        L_0x0107:
            boolean r0 = r15.l(r10)     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x011a
            android.widget.CompoundButton r14 = (android.widget.CompoundButton) r14     // Catch:{ all -> 0x011e }
            int r0 = r15.h(r10, r9)     // Catch:{ all -> 0x011e }
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.v1.b(r0, r8)     // Catch:{ all -> 0x011e }
            b1.b.d(r14, r0)     // Catch:{ all -> 0x011e }
        L_0x011a:
            r15.o()
            return
        L_0x011e:
            r0 = move-exception
            r15.o()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v.c(android.util.AttributeSet, int):void");
    }
}
