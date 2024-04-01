package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.theori.dreamdrm.R;
import java.util.WeakHashMap;
import x0.e0;
import x0.u0;
import z2.a;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: d  reason: collision with root package name */
    public TextView f2017d;

    /* renamed from: e  reason: collision with root package name */
    public Button f2018e;

    /* renamed from: f  reason: collision with root package name */
    public int f2019f;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c.E(context, R.attr.motionEasingEmphasizedInterpolator, a.f5934b);
    }

    public final boolean a(int i3, int i6, int i7) {
        boolean z5;
        if (i3 != getOrientation()) {
            setOrientation(i3);
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.f2017d.getPaddingTop() == i6 && this.f2017d.getPaddingBottom() == i7) {
            return z5;
        }
        TextView textView = this.f2017d;
        WeakHashMap weakHashMap = u0.f5622a;
        if (e0.g(textView)) {
            e0.k(textView, e0.f(textView), i6, e0.e(textView), i7);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i6, textView.getPaddingRight(), i7);
        return true;
    }

    public Button getActionView() {
        return this.f2018e;
    }

    public TextView getMessageView() {
        return this.f2017d;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2017d = (TextView) findViewById(R.id.snackbar_text);
        this.f2018e = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (a(1, r0, r0 - r2) != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (a(0, r0, r0) != false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto L_0x000b
            return
        L_0x000b:
            android.content.res.Resources r0 = r7.getResources()
            r2 = 2131099783(0x7f060087, float:1.7811929E38)
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131099782(0x7f060086, float:1.7811927E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f2017d
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L_0x0032
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L_0x0032
            r3 = r1
            goto L_0x0033
        L_0x0032:
            r3 = r4
        L_0x0033:
            if (r3 == 0) goto L_0x004c
            int r5 = r7.f2019f
            if (r5 <= 0) goto L_0x004c
            android.widget.Button r5 = r7.f2018e
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f2019f
            if (r5 <= r6) goto L_0x004c
            int r2 = r0 - r2
            boolean r0 = r7.a(r1, r0, r2)
            if (r0 == 0) goto L_0x0057
            goto L_0x0058
        L_0x004c:
            if (r3 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r0 = r2
        L_0x0050:
            boolean r0 = r7.a(r4, r0, r0)
            if (r0 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r1 = r4
        L_0x0058:
            if (r1 == 0) goto L_0x005d
            super.onMeasure(r8, r9)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i3) {
        this.f2019f = i3;
    }
}
