package j2;

import a2.m;
import android.os.Handler;
import android.os.Message;
import g.h;

public final class g implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3816a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3817b;

    public /* synthetic */ g(int i3, Object obj) {
        this.f3816a = i3;
        this.f3817b = obj;
    }

    public final boolean handleMessage(Message message) {
        switch (this.f3816a) {
            case 0:
                int i3 = message.what;
                Object obj = this.f3817b;
                if (i3 == 1) {
                    ((h) obj).b((e) message.obj);
                    return true;
                } else if (i3 != 2) {
                    return false;
                } else {
                    ((h) obj).f3821d.l((e) message.obj);
                    return false;
                }
            default:
                if (message.what != 0) {
                    return false;
                }
                h hVar = (h) this.f3817b;
                m.o(message.obj);
                synchronized (hVar.f2725a) {
                    m.o(hVar.f2727c);
                    throw null;
                }
        }
    }
}
