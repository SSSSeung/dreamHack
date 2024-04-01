package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import com.theori.dreamdrm.R;
import e.c;
import h.e;

public final class t0 extends o2 implements v0 {
    public CharSequence F;
    public ListAdapter G;
    public final Rect H = new Rect();
    public int I;
    public final /* synthetic */ w0 J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t0(w0 w0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.J = w0Var;
        this.f710r = w0Var;
        this.B = true;
        this.C.setFocusable(true);
        this.f711s = new c(this, 1, w0Var);
    }

    public final void d(int i3, int i6) {
        ViewTreeObserver viewTreeObserver;
        boolean a6 = a();
        s();
        g0 g0Var = this.C;
        g0Var.setInputMethodMode(2);
        f();
        b2 b2Var = this.f698f;
        b2Var.setChoiceMode(1);
        o0.d(b2Var, i3);
        o0.c(b2Var, i6);
        w0 w0Var = this.J;
        int selectedItemPosition = w0Var.getSelectedItemPosition();
        b2 b2Var2 = this.f698f;
        if (a() && b2Var2 != null) {
            b2Var2.setListSelectionHidden(false);
            b2Var2.setSelection(selectedItemPosition);
            if (b2Var2.getChoiceMode() != 0) {
                b2Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!a6 && (viewTreeObserver = w0Var.getViewTreeObserver()) != null) {
            e eVar = new e(3, this);
            viewTreeObserver.addOnGlobalLayoutListener(eVar);
            g0Var.setOnDismissListener(new s0(this, eVar));
        }
    }

    public final CharSequence i() {
        return this.F;
    }

    public final void k(CharSequence charSequence) {
        this.F = charSequence;
    }

    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.G = listAdapter;
    }

    public final void p(int i3) {
        this.I = i3;
    }

    public final void s() {
        int i3;
        Drawable h6 = h();
        w0 w0Var = this.J;
        if (h6 != null) {
            h6.getPadding(w0Var.f833k);
            i3 = j4.a(w0Var) ? w0Var.f833k.right : -w0Var.f833k.left;
        } else {
            Rect rect = w0Var.f833k;
            rect.right = 0;
            rect.left = 0;
            i3 = 0;
        }
        int paddingLeft = w0Var.getPaddingLeft();
        int paddingRight = w0Var.getPaddingRight();
        int width = w0Var.getWidth();
        int i6 = w0Var.f832j;
        if (i6 == -2) {
            int a6 = w0Var.a((SpinnerAdapter) this.G, h());
            int i7 = w0Var.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = w0Var.f833k;
            int i8 = (i7 - rect2.left) - rect2.right;
            if (a6 > i8) {
                a6 = i8;
            }
            i6 = Math.max(a6, (width - paddingLeft) - paddingRight);
        } else if (i6 == -1) {
            i6 = (width - paddingLeft) - paddingRight;
        }
        r(i6);
        this.f701i = j4.a(w0Var) ? (((width - paddingRight) - this.f700h) - this.I) + i3 : paddingLeft + this.I + i3;
    }
}
