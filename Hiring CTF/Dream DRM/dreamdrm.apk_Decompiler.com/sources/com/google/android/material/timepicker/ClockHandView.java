package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bumptech.glide.c;
import com.theori.dreamdrm.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import x0.d0;
import x0.u0;
import y2.a;

class ClockHandView extends View {

    /* renamed from: d  reason: collision with root package name */
    public final ValueAnimator f2074d = new ValueAnimator();

    /* renamed from: e  reason: collision with root package name */
    public boolean f2075e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f2076f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final int f2077g;

    /* renamed from: h  reason: collision with root package name */
    public final float f2078h;

    /* renamed from: i  reason: collision with root package name */
    public final Paint f2079i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f2080j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2081k;

    /* renamed from: l  reason: collision with root package name */
    public float f2082l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2083m;

    /* renamed from: n  reason: collision with root package name */
    public double f2084n;

    /* renamed from: o  reason: collision with root package name */
    public int f2085o;

    /* renamed from: p  reason: collision with root package name */
    public int f2086p;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        Paint paint = new Paint();
        this.f2079i = paint;
        this.f2080j = new RectF();
        this.f2086p = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f5823d, R.attr.materialClockStyle, 2131756118);
        c.D(context, R.attr.motionDurationLong2, 200);
        c.E(context, R.attr.motionEasingEmphasizedInterpolator, z2.a.f5934b);
        this.f2085o = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f2077g = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f2081k = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f2078h = (float) resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = u0.f5622a;
        d0.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i3) {
        return i3 == 2 ? Math.round(((float) this.f2085o) * 0.66f) : this.f2085o;
    }

    public final void b(float f6) {
        ValueAnimator valueAnimator = this.f2074d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f6);
    }

    public final void c(float f6) {
        float f7 = f6 % 360.0f;
        this.f2082l = f7;
        this.f2084n = Math.toRadians((double) (f7 - 90.0f));
        float a6 = (float) a(this.f2086p);
        float cos = (((float) Math.cos(this.f2084n)) * a6) + ((float) (getWidth() / 2));
        float sin = (a6 * ((float) Math.sin(this.f2084n))) + ((float) (getHeight() / 2));
        float f8 = (float) this.f2077g;
        this.f2080j.set(cos - f8, sin - f8, cos + f8, sin + f8);
        Iterator it = this.f2076f.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.J - f7) > 0.001f) {
                clockFaceView.J = f7;
                clockFaceView.g();
            }
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int a6 = a(this.f2086p);
        float f6 = (float) width;
        float f7 = (float) a6;
        float f8 = (float) height;
        Paint paint = this.f2079i;
        paint.setStrokeWidth(0.0f);
        int i3 = this.f2077g;
        canvas.drawCircle((((float) Math.cos(this.f2084n)) * f7) + f6, (f7 * ((float) Math.sin(this.f2084n))) + f8, (float) i3, paint);
        double sin = Math.sin(this.f2084n);
        double d6 = (double) ((float) (a6 - i3));
        paint.setStrokeWidth((float) this.f2081k);
        canvas.drawLine(f6, f8, (float) (width + ((int) (Math.cos(this.f2084n) * d6))), (float) (height + ((int) (d6 * sin))), paint);
        canvas.drawCircle(f6, f8, this.f2078h, paint);
    }

    public final void onLayout(boolean z5, int i3, int i6, int i7, int i8) {
        super.onLayout(z5, i3, i6, i7, i8);
        if (!this.f2074d.isRunning()) {
            b(this.f2082l);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z6;
        int actionMasked = motionEvent.getActionMasked();
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        boolean z7 = false;
        if (actionMasked == 0) {
            this.f2083m = false;
            z5 = true;
            z6 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z6 = this.f2083m;
            if (this.f2075e) {
                this.f2086p = ((float) Math.hypot((double) (x5 - ((float) (getWidth() / 2))), (double) (y5 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z5 = false;
        } else {
            z6 = false;
            z5 = false;
        }
        boolean z8 = this.f2083m;
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (y5 - ((float) (getHeight() / 2))), (double) (x5 - ((float) (getWidth() / 2)))))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f6 = (float) degrees;
        boolean z9 = this.f2082l != f6;
        if (!z5 || !z9) {
            if (z9 || z6) {
                b(f6);
            }
            this.f2083m = z8 | z7;
            return true;
        }
        z7 = true;
        this.f2083m = z8 | z7;
        return true;
    }
}
