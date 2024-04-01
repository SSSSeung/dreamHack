package androidx.fragment.app;

import a2.m;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.theori.dreamdrm.R;
import j1.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import x0.h0;
import x0.h2;
import x0.u0;

public final class FragmentContainerView extends FrameLayout {

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f1063d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f1064e;

    /* renamed from: f  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1065f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1066g = true;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f3789b);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
            }
        }
    }

    public final void a(View view) {
        ArrayList arrayList = this.f1064e;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f1063d == null) {
                this.f1063d = new ArrayList();
            }
            this.f1063d.add(view);
        }
    }

    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof r ? (r) tag : null) != null) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public final boolean addViewInLayout(View view, int i3, ViewGroup.LayoutParams layoutParams, boolean z5) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof r ? (r) tag : null) != null) {
            return super.addViewInLayout(view, i3, layoutParams, z5);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        h2 h2Var;
        h2 h6 = h2.h((View) null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1065f;
        if (onApplyWindowInsetsListener != null) {
            h2Var = h2.h((View) null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            WeakHashMap weakHashMap = u0.f5622a;
            WindowInsets g6 = h6.g();
            if (g6 != null) {
                WindowInsets b6 = h0.b(this, g6);
                if (!b6.equals(g6)) {
                    h6 = h2.h(this, b6);
                }
            }
            h2Var = h6;
        }
        if (!h2Var.f5572a.m()) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                WeakHashMap weakHashMap2 = u0.f5622a;
                WindowInsets g7 = h2Var.g();
                if (g7 != null) {
                    WindowInsets a6 = h0.a(childAt, g7);
                    if (!a6.equals(g7)) {
                        h2.h(childAt, a6);
                    }
                }
            }
        }
        return windowInsets;
    }

    public final void dispatchDraw(Canvas canvas) {
        if (this.f1066g && this.f1063d != null) {
            for (int i3 = 0; i3 < this.f1063d.size(); i3++) {
                super.drawChild(canvas, (View) this.f1063d.get(i3), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public final boolean drawChild(Canvas canvas, View view, long j6) {
        ArrayList arrayList;
        if (!this.f1066g || (arrayList = this.f1063d) == null || arrayList.size() <= 0 || !this.f1063d.contains(view)) {
            return super.drawChild(canvas, view, j6);
        }
        return false;
    }

    public final void endViewTransition(View view) {
        ArrayList arrayList = this.f1064e;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f1063d;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f1066g = true;
            }
        }
        super.endViewTransition(view);
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    public final void removeDetachedView(View view, boolean z5) {
        if (z5) {
            a(view);
        }
        super.removeDetachedView(view, z5);
    }

    public final void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    public final void removeViewAt(int i3) {
        a(getChildAt(i3));
        super.removeViewAt(i3);
    }

    public final void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    public final void removeViews(int i3, int i6) {
        for (int i7 = i3; i7 < i3 + i6; i7++) {
            a(getChildAt(i7));
        }
        super.removeViews(i3, i6);
    }

    public final void removeViewsInLayout(int i3, int i6) {
        for (int i7 = i3; i7 < i3 + i6; i7++) {
            a(getChildAt(i7));
        }
        super.removeViewsInLayout(i3, i6);
    }

    public void setDrawDisappearingViewsLast(boolean z5) {
        this.f1066g = z5;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f1065f = onApplyWindowInsetsListener;
    }

    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f1064e == null) {
                this.f1064e = new ArrayList();
            }
            this.f1064e.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: finally extract failed */
    public FragmentContainerView(Context context, AttributeSet attributeSet, l0 l0Var) {
        super(context, attributeSet);
        View view;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f3789b);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        r A = l0Var.A(id);
        if (classAttribute != null && A == null) {
            if (id <= 0) {
                throw new IllegalStateException(m.i("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            f0 D = l0Var.D();
            context.getClassLoader();
            r a6 = D.a(classAttribute);
            a6.F = true;
            u uVar = a6.f1272v;
            if ((uVar == null ? null : uVar.f1294q) != null) {
                a6.F = true;
            }
            a aVar = new a(l0Var);
            aVar.f1081o = true;
            a6.G = this;
            aVar.e(getId(), a6, string, 1);
            if (!aVar.f1073g) {
                l0 l0Var2 = aVar.f1082p;
                if (l0Var2.f1186p != null && !l0Var2.C) {
                    l0Var2.v(true);
                    aVar.a(l0Var2.E, l0Var2.F);
                    l0Var2.f1172b = true;
                    try {
                        l0Var2.Q(l0Var2.E, l0Var2.F);
                        l0Var2.d();
                        l0Var2.b0();
                        if (l0Var2.D) {
                            l0Var2.D = false;
                            l0Var2.Z();
                        }
                        l0Var2.f1173c.f1283b.values().removeAll(Collections.singleton((Object) null));
                    } catch (Throwable th) {
                        l0Var2.d();
                        throw th;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = l0Var.f1173c.d().iterator();
        while (it.hasNext()) {
            r0 r0Var = (r0) it.next();
            r rVar = r0Var.f1278c;
            if (rVar.f1275z == getId() && (view = rVar.H) != null && view.getParent() == null) {
                rVar.G = this;
                r0Var.b();
            }
        }
    }
}
