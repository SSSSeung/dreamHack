package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

public final class k implements DialogInterface.OnDismissListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n f1165d;

    public k(n nVar) {
        this.f1165d = nVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        n nVar = this.f1165d;
        Dialog dialog = nVar.f1211g0;
        if (dialog != null) {
            nVar.onDismiss(dialog);
        }
    }
}
