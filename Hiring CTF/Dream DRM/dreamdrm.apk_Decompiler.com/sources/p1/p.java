package p1;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import x0.e0;
import x0.u0;

public final class p extends m0 implements r0 {
    public static final int[] C = {16842919};
    public static final int[] D = new int[0];
    public int A;
    public final l B;

    /* renamed from: a  reason: collision with root package name */
    public final int f4615a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4616b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f4617c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f4618d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4619e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4620f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f4621g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f4622h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4623i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4624j;

    /* renamed from: k  reason: collision with root package name */
    public int f4625k;

    /* renamed from: l  reason: collision with root package name */
    public int f4626l;

    /* renamed from: m  reason: collision with root package name */
    public float f4627m;

    /* renamed from: n  reason: collision with root package name */
    public int f4628n;

    /* renamed from: o  reason: collision with root package name */
    public int f4629o;

    /* renamed from: p  reason: collision with root package name */
    public float f4630p;

    /* renamed from: q  reason: collision with root package name */
    public int f4631q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f4632r = 0;

    /* renamed from: s  reason: collision with root package name */
    public RecyclerView f4633s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4634t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4635u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f4636v = 0;
    public int w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f4637x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f4638y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f4639z;

    public p(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i3, int i6, int i7) {
        boolean z5 = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f4639z = ofFloat;
        this.A = 0;
        l lVar = new l(0, this);
        this.B = lVar;
        m mVar = new m(this);
        this.f4617c = stateListDrawable;
        this.f4618d = drawable;
        this.f4621g = stateListDrawable2;
        this.f4622h = drawable2;
        this.f4619e = Math.max(i3, stateListDrawable.getIntrinsicWidth());
        this.f4620f = Math.max(i3, drawable.getIntrinsicWidth());
        this.f4623i = Math.max(i3, stateListDrawable2.getIntrinsicWidth());
        this.f4624j = Math.max(i3, drawable2.getIntrinsicWidth());
        this.f4615a = i6;
        this.f4616b = i7;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new n(this));
        ofFloat.addUpdateListener(new o(this));
        RecyclerView recyclerView2 = this.f4633s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                o0 o0Var = recyclerView2.f1447p;
                if (o0Var != null) {
                    o0Var.c("Cannot remove item decoration during a scroll  or layout");
                }
                ArrayList arrayList = recyclerView2.f1451r;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z5);
                }
                recyclerView2.P();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f4633s;
                recyclerView3.f1453s.remove(this);
                if (recyclerView3.f1455t == this) {
                    recyclerView3.f1455t = null;
                }
                ArrayList arrayList2 = this.f4633s.f1436j0;
                if (arrayList2 != null) {
                    arrayList2.remove(mVar);
                }
                this.f4633s.removeCallbacks(lVar);
            }
            this.f4633s = recyclerView;
            if (recyclerView != null) {
                recyclerView.i(this);
                this.f4633s.f1453s.add(this);
                this.f4633s.j(mVar);
            }
        }
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i3;
        if (this.f4631q != this.f4633s.getWidth() || this.f4632r != this.f4633s.getHeight()) {
            this.f4631q = this.f4633s.getWidth();
            this.f4632r = this.f4633s.getHeight();
            f(0);
        } else if (this.A != 0) {
            if (this.f4634t) {
                int i6 = this.f4631q;
                int i7 = this.f4619e;
                int i8 = i6 - i7;
                int i9 = this.f4626l;
                int i10 = this.f4625k;
                int i11 = i9 - (i10 / 2);
                StateListDrawable stateListDrawable = this.f4617c;
                stateListDrawable.setBounds(0, 0, i7, i10);
                int i12 = this.f4632r;
                int i13 = this.f4620f;
                Drawable drawable = this.f4618d;
                drawable.setBounds(0, 0, i13, i12);
                RecyclerView recyclerView2 = this.f4633s;
                WeakHashMap weakHashMap = u0.f5622a;
                boolean z5 = true;
                if (e0.d(recyclerView2) != 1) {
                    z5 = false;
                }
                if (z5) {
                    drawable.draw(canvas);
                    canvas.translate((float) i7, (float) i11);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    i3 = -i7;
                } else {
                    canvas.translate((float) i8, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, (float) i11);
                    stateListDrawable.draw(canvas);
                    i3 = -i8;
                }
                canvas.translate((float) i3, (float) (-i11));
            }
            if (this.f4635u) {
                int i14 = this.f4632r;
                int i15 = this.f4623i;
                int i16 = i14 - i15;
                int i17 = this.f4629o;
                int i18 = this.f4628n;
                int i19 = i17 - (i18 / 2);
                StateListDrawable stateListDrawable2 = this.f4621g;
                stateListDrawable2.setBounds(0, 0, i18, i15);
                int i20 = this.f4631q;
                int i21 = this.f4624j;
                Drawable drawable2 = this.f4622h;
                drawable2.setBounds(0, 0, i20, i21);
                canvas.translate(0.0f, (float) i16);
                drawable2.draw(canvas);
                canvas.translate((float) i19, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate((float) (-i19), (float) (-i16));
            }
        }
    }

    public final boolean c(float f6, float f7) {
        if (f7 >= ((float) (this.f4632r - this.f4623i))) {
            int i3 = this.f4629o;
            int i6 = this.f4628n;
            return f6 >= ((float) (i3 - (i6 / 2))) && f6 <= ((float) ((i6 / 2) + i3));
        }
    }

    public final boolean d(float f6, float f7) {
        RecyclerView recyclerView = this.f4633s;
        WeakHashMap weakHashMap = u0.f5622a;
        boolean z5 = e0.d(recyclerView) == 1;
        int i3 = this.f4619e;
        if (z5) {
            if (f6 > ((float) i3)) {
                return false;
            }
        } else if (f6 < ((float) (this.f4631q - i3))) {
            return false;
        }
        int i6 = this.f4626l;
        int i7 = this.f4625k / 2;
        return f7 >= ((float) (i6 - i7)) && f7 <= ((float) (i7 + i6));
    }

    public final void e(int i3) {
        RecyclerView recyclerView = this.f4633s;
        l lVar = this.B;
        recyclerView.removeCallbacks(lVar);
        this.f4633s.postDelayed(lVar, (long) i3);
    }

    public final void f(int i3) {
        int i6;
        StateListDrawable stateListDrawable = this.f4617c;
        if (i3 == 2 && this.f4636v != 2) {
            stateListDrawable.setState(C);
            this.f4633s.removeCallbacks(this.B);
        }
        if (i3 == 0) {
            this.f4633s.invalidate();
        } else {
            g();
        }
        if (this.f4636v != 2 || i3 == 2) {
            if (i3 == 1) {
                i6 = 1500;
            }
            this.f4636v = i3;
        }
        stateListDrawable.setState(D);
        i6 = 1200;
        e(i6);
        this.f4636v = i3;
    }

    public final void g() {
        int i3 = this.A;
        ValueAnimator valueAnimator = this.f4639z;
        if (i3 != 0) {
            if (i3 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        valueAnimator.setDuration(500);
        valueAnimator.setStartDelay(0);
        valueAnimator.start();
    }
}
