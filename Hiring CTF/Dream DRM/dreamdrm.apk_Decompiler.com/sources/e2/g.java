package e2;

import java.io.File;
import q2.b;
import y1.i;

public final class g implements v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2507a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2508b;

    public /* synthetic */ g(int i3, Object obj) {
        this.f2507a = i3;
        this.f2508b = obj;
    }

    public final boolean a(Object obj) {
        switch (this.f2507a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                File file = (File) obj;
                return true;
        }
    }

    public final u b(Object obj, int i3, int i6, i iVar) {
        int i7 = this.f2507a;
        Object obj2 = this.f2508b;
        switch (i7) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new u(new b(bArr), new e(bArr, (d) obj2));
            case 1:
                return new u(new b(obj), new j(obj.toString(), 0, (f) obj2));
            default:
                File file = (File) obj;
                return new u(new b(file), new j(file, 1, (l) obj2));
        }
    }
}
