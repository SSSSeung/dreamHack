package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import e.s;
import x0.h2;

public class FitWindowsFrameLayout extends FrameLayout {

    /* renamed from: d  reason: collision with root package name */
    public c2 f451d;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean fitSystemWindows(Rect rect) {
        c2 c2Var = this.f451d;
        if (c2Var != null) {
            rect.top = ((s) c2Var).f2429e.K((h2) null, rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(c2 c2Var) {
        this.f451d = c2Var;
    }
}
