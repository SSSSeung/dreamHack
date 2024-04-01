package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

public final class j implements DialogInterface.OnCancelListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n f1164d;

    public j(n nVar) {
        this.f1164d = nVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        n nVar = this.f1164d;
        Dialog dialog = nVar.f1211g0;
        if (dialog != null) {
            nVar.onCancel(dialog);
        }
    }
}
