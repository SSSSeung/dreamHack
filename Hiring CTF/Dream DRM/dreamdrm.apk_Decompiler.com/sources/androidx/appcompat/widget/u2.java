package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import h.o;
import h.q;
import java.lang.reflect.Method;

public final class u2 extends o2 implements p2 {
    public static final Method G;
    public p2 F;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                G = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public u2(Context context, int i3, int i6) {
        super(context, (AttributeSet) null, i3, i6);
    }

    public final void g(o oVar, MenuItem menuItem) {
        p2 p2Var = this.F;
        if (p2Var != null) {
            p2Var.g(oVar, menuItem);
        }
    }

    public final void m(o oVar, q qVar) {
        p2 p2Var = this.F;
        if (p2Var != null) {
            p2Var.m(oVar, qVar);
        }
    }

    public final b2 q(Context context, boolean z5) {
        t2 t2Var = new t2(context, z5);
        t2Var.setHoverListener(this);
        return t2Var;
    }
}
