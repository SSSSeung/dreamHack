package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import d.a;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: d  reason: collision with root package name */
    public int f495d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f496e;

    /* renamed from: f  reason: collision with root package name */
    public WeakReference f497f;

    /* renamed from: g  reason: collision with root package name */
    public LayoutInflater f498g;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.A, 0, 0);
        this.f496e = obtainStyledAttributes.getResourceId(2, -1);
        this.f495d = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f495d != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f498g;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f495d, viewGroup, false);
            int i3 = this.f496e;
            if (i3 != -1) {
                inflate.setId(i3);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f497f = new WeakReference(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public final void dispatchDraw(Canvas canvas) {
    }

    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f496e;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f498g;
    }

    public int getLayoutResource() {
        return this.f495d;
    }

    public final void onMeasure(int i3, int i6) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i3) {
        this.f496e = i3;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f498g = layoutInflater;
    }

    public void setLayoutResource(int i3) {
        this.f495d = i3;
    }

    public void setOnInflateListener(i4 i4Var) {
    }

    public void setVisibility(int i3) {
        WeakReference weakReference = this.f497f;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i3);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i3);
        if (i3 == 0 || i3 == 4) {
            a();
        }
    }
}
