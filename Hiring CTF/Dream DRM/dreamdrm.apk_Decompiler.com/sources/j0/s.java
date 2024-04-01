package j0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import h0.h;

public abstract class s extends b {

    /* renamed from: j  reason: collision with root package name */
    public boolean f3786j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3787k;

    public s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f3778b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 6) {
                    this.f3786j = true;
                } else if (index == 13) {
                    this.f3787k = true;
                }
            }
        }
    }

    public abstract void h(h hVar, int i3, int i6);

    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f3786j || this.f3787k) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i3 = 0; i3 < this.f3651e; i3++) {
                View view = (View) constraintLayout.f922d.get(this.f3650d[i3]);
                if (view != null) {
                    if (this.f3786j) {
                        view.setVisibility(visibility);
                    }
                    if (this.f3787k && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void setElevation(float f6) {
        super.setElevation(f6);
        c();
    }

    public void setVisibility(int i3) {
        super.setVisibility(i3);
        c();
    }
}
