package a2;

import android.os.Handler;
import android.os.Message;

public final class i0 implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f87a;

    public /* synthetic */ i0(int i3) {
        this.f87a = i3;
    }

    public final boolean handleMessage(Message message) {
        switch (this.f87a) {
            case 0:
                if (message.what != 1) {
                    return false;
                }
                ((f0) message.obj).d();
                return true;
            default:
                int i3 = message.what;
                if (i3 == 0) {
                    m.o(message.obj);
                    throw null;
                } else if (i3 != 1) {
                    return false;
                } else {
                    m.o(message.obj);
                    throw null;
                }
        }
    }
}
