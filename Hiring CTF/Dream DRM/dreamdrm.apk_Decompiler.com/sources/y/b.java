package y;

import b1.o;
import java.util.Comparator;

public final /* synthetic */ class b implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5769a;

    public /* synthetic */ b(int i3) {
        this.f5769a = i3;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f5769a) {
            case 0:
                f fVar = (f) obj;
                f fVar2 = (f) obj2;
                fVar.getClass();
                fVar2.getClass();
                fVar.getClass();
                fVar2.getClass();
                return o.o(0, 0);
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b6 = bArr[i3];
                    byte b7 = bArr2[i3];
                    if (b6 != b7) {
                        return b6 - b7;
                    }
                }
                return 0;
        }
    }
}
