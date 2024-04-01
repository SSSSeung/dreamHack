package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.theori.dreamdrm.R;
import r0.b;

public final class l extends e0 implements n {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ m f652g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context) {
        super(context, (AttributeSet) null, R.attr.actionOverflowButtonStyle);
        this.f652g = mVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        f4.a(this, getContentDescription());
        setOnTouchListener(new k(this, this, mVar, 0));
    }

    public final boolean a() {
        return false;
    }

    public final boolean b() {
        return false;
    }

    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f652g.l();
        return true;
    }

    public final boolean setFrame(int i3, int i6, int i7, int i8) {
        boolean frame = super.setFrame(i3, i6, i7, i8);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            b.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
