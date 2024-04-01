package x0;

import android.view.View;
import android.view.autofill.AutofillId;
import com.theori.dreamdrm.R;
import java.util.Objects;
import k.j;
import v0.d;

public abstract class n0 {
    public static void a(View view, s0 s0Var) {
        j jVar = (j) view.getTag(R.id.tag_unhandled_key_listeners);
        if (jVar == null) {
            jVar = new j();
            view.setTag(R.id.tag_unhandled_key_listeners, jVar);
        }
        Objects.requireNonNull(s0Var);
        m0 m0Var = new m0();
        jVar.put(s0Var, m0Var);
        view.addOnUnhandledKeyEventListener(m0Var);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, s0 s0Var) {
        View.OnUnhandledKeyEventListener f6;
        j jVar = (j) view.getTag(R.id.tag_unhandled_key_listeners);
        if (jVar != null && (f6 = d.f(jVar.getOrDefault(s0Var, (Object) null))) != null) {
            view.removeOnUnhandledKeyEventListener(f6);
        }
    }

    public static <T> T f(View view, int i3) {
        return view.requireViewById(i3);
    }

    public static void g(View view, boolean z5) {
        view.setAccessibilityHeading(z5);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, AutofillId autofillId) {
        view.setAutofillId(autofillId);
    }

    public static void j(View view, boolean z5) {
        view.setScreenReaderFocusable(z5);
    }
}
