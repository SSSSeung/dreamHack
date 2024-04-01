package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.theori.dreamdrm.R;
import d.a;
import r0.b;
import r0.c;
import x0.e0;
import x0.u0;

public final class m0 extends h0 {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f678d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f679e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f680f = null;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f681g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f682h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f683i = false;

    public m0(SeekBar seekBar) {
        super(seekBar);
        this.f678d = seekBar;
    }

    public final void a(AttributeSet attributeSet, int i3) {
        super.a(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.f678d;
        Context context = seekBar.getContext();
        int[] iArr = a.f2119g;
        m3 m6 = m3.m(context, attributeSet, iArr, R.attr.seekBarStyle);
        u0.k(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) m6.f686b, R.attr.seekBarStyle);
        Drawable f6 = m6.f(0);
        if (f6 != null) {
            seekBar.setThumb(f6);
        }
        Drawable e6 = m6.e(1);
        Drawable drawable = this.f679e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f679e = e6;
        if (e6 != null) {
            e6.setCallback(seekBar);
            c.b(e6, e0.d(seekBar));
            if (e6.isStateful()) {
                e6.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (m6.l(3)) {
            this.f681g = v1.b(m6.h(3, -1), this.f681g);
            this.f683i = true;
        }
        if (m6.l(2)) {
            this.f680f = m6.b(2);
            this.f682h = true;
        }
        m6.o();
        c();
    }

    public final void c() {
        Drawable drawable = this.f679e;
        if (drawable == null) {
            return;
        }
        if (this.f682h || this.f683i) {
            Drawable mutate = drawable.mutate();
            this.f679e = mutate;
            if (this.f682h) {
                b.h(mutate, this.f680f);
            }
            if (this.f683i) {
                b.i(this.f679e, this.f681g);
            }
            if (this.f679e.isStateful()) {
                this.f679e.setState(this.f678d.getDrawableState());
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f679e != null) {
            SeekBar seekBar = this.f678d;
            int max = seekBar.getMax();
            int i3 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f679e.getIntrinsicWidth();
                int intrinsicHeight = this.f679e.getIntrinsicHeight();
                int i6 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i3 = intrinsicHeight / 2;
                }
                this.f679e.setBounds(-i6, -i3, i6, i3);
                float width = ((float) ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) seekBar.getPaddingLeft(), (float) (seekBar.getHeight() / 2));
                for (int i7 = 0; i7 <= max; i7++) {
                    this.f679e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
