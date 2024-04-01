package e2;

import java.io.File;
import q2.b;

public final class i implements v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2513a;

    public /* synthetic */ i(int i3) {
        this.f2513a = i3;
    }

    public final boolean a(Object obj) {
        switch (this.f2513a) {
            case 0:
                File file = (File) obj;
                return true;
            default:
                return false;
        }
    }

    public final u b(Object obj, int i3, int i6, y1.i iVar) {
        switch (this.f2513a) {
            case 0:
                File file = (File) obj;
                return new u(new b(file), new h(0, file));
            default:
                return null;
        }
    }
}
