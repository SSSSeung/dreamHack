package e;

import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import g.f;
import w4.p;

public final class c0 extends ContentFrameLayout {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ e0 f2285l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, f fVar) {
        super(fVar, (AttributeSet) null);
        this.f2285l = e0Var;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f2285l.v(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x5 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            if (x5 < -5 || y5 < -5 || x5 > getWidth() + 5 || y5 > getHeight() + 5) {
                e0 e0Var = this.f2285l;
                e0Var.t(e0Var.A(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBackgroundResource(int i3) {
        setBackgroundDrawable(p.n(getContext(), i3));
    }
}
