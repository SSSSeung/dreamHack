package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import e.s;
import x0.h2;

public class FitWindowsLinearLayout extends LinearLayout {

    /* renamed from: d  reason: collision with root package name */
    public c2 f452d;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean fitSystemWindows(Rect rect) {
        c2 c2Var = this.f452d;
        if (c2Var != null) {
            rect.top = ((s) c2Var).f2429e.K((h2) null, rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(c2 c2Var) {
        this.f452d = c2Var;
    }
}
