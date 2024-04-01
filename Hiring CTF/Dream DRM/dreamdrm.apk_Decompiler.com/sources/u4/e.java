package u4;

import java.util.Iterator;
import o4.c;

public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5346a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final c f5347b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5348c;

    public e(f fVar, c cVar) {
        this.f5348c = fVar;
        this.f5347b = cVar;
    }

    public final Iterator iterator() {
        switch (this.f5346a) {
            case 0:
                return new d(this);
            default:
                return new j(this);
        }
    }
}
