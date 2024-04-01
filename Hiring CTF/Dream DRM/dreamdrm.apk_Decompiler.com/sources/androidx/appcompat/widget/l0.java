package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.theori.dreamdrm.R;

public final class l0 extends SeekBar {

    /* renamed from: d  reason: collision with root package name */
    public final m0 f653d;

    public l0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        t3.a(this, getContext());
        m0 m0Var = new m0(this);
        this.f653d = m0Var;
        m0Var.a(attributeSet, R.attr.seekBarStyle);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m0 m0Var = this.f653d;
        Drawable drawable = m0Var.f679e;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = m0Var.f678d;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f653d.f679e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f653d.d(canvas);
    }
}
