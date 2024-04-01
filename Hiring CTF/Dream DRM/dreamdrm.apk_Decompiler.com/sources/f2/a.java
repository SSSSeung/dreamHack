package f2;

import com.bumptech.glide.load.data.l;
import e2.f;
import e2.m;
import e2.t;
import e2.u;
import e2.v;
import java.util.ArrayDeque;
import y1.h;
import y1.i;

public final class a implements v {

    /* renamed from: b  reason: collision with root package name */
    public static final h f2638b = h.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a  reason: collision with root package name */
    public final f f2639a;

    public a(f fVar) {
        this.f2639a = fVar;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        m mVar = (m) obj;
        return true;
    }

    public final u b(Object obj, int i3, int i6, i iVar) {
        m mVar = (m) obj;
        f fVar = this.f2639a;
        if (fVar != null) {
            t a6 = t.a(mVar);
            r2.h hVar = (r2.h) fVar.f2505e;
            Object a7 = hVar.a(a6);
            ArrayDeque arrayDeque = t.f2540d;
            synchronized (arrayDeque) {
                arrayDeque.offer(a6);
            }
            m mVar2 = (m) a7;
            if (mVar2 == null) {
                hVar.d(t.a(mVar), mVar);
            } else {
                mVar = mVar2;
            }
        }
        return new u(mVar, new l(mVar, ((Integer) iVar.c(f2638b)).intValue()));
    }
}
