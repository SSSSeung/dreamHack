package k3;

import android.view.View;
import android.widget.EditText;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f3966d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f3967e = false;

    public /* synthetic */ k(EditText editText) {
        this.f3966d = editText;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            boolean r0 = r3.f3967e
            android.view.View r1 = r3.f3966d
            if (r0 == 0) goto L_0x003e
            java.util.WeakHashMap r0 = x0.u0.f5622a
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L_0x0013
            x0.m2 r0 = x0.p0.c(r1)
            goto L_0x0036
        L_0x0013:
            android.content.Context r0 = r1.getContext()
        L_0x0017:
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L_0x0035
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L_0x002e
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x0035
            x0.m2 r2 = new x0.m2
            r2.<init>(r0, r1)
            r0 = r2
            goto L_0x0036
        L_0x002e:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L_0x0017
        L_0x0035:
            r0 = 0
        L_0x0036:
            if (r0 == 0) goto L_0x003e
            androidx.compose.ui.platform.e r0 = r0.f5590a
            r0.C()
            goto L_0x0050
        L_0x003e:
            android.content.Context r0 = r1.getContext()
            java.lang.Object r2 = n0.b.f4213a
            java.lang.Class<android.view.inputmethod.InputMethodManager> r2 = android.view.inputmethod.InputMethodManager.class
            java.lang.Object r0 = o0.c.b(r0, r2)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r2 = 1
            r0.showSoftInput(r1, r2)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.k.run():void");
    }
}
