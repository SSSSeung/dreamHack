package h;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import e.i;

public final class p implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, b0 {

    /* renamed from: d  reason: collision with root package name */
    public final o f3193d;

    /* renamed from: e  reason: collision with root package name */
    public i f3194e;

    /* renamed from: f  reason: collision with root package name */
    public k f3195f;

    public p(o oVar) {
        this.f3193d = oVar;
    }

    public final void b(o oVar, boolean z5) {
        i iVar;
        if ((z5 || oVar == this.f3193d) && (iVar = this.f3194e) != null) {
            iVar.dismiss();
        }
    }

    public final boolean i(o oVar) {
        return false;
    }

    public final void onClick(DialogInterface dialogInterface, int i3) {
        k kVar = this.f3195f;
        if (kVar.f3162i == null) {
            kVar.f3162i = new j(kVar);
        }
        this.f3193d.q(kVar.f3162i.getItem(i3), (c0) null, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f3195f.b(this.f3193d, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        o oVar = this.f3193d;
        if (i3 == 82 || i3 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f3194e.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f3194e.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                oVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return oVar.performShortcut(i3, keyEvent, 0);
    }
}
