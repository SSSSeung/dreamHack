package e;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

public final class e extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f2317a;

    public e(DialogInterface dialogInterface) {
        this.f2317a = new WeakReference(dialogInterface);
    }

    public final void handleMessage(Message message) {
        int i3 = message.what;
        if (i3 == -3 || i3 == -2 || i3 == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f2317a.get(), message.what);
        } else if (i3 == 1) {
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
