package a2;

import b1.o;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import y1.f;

public final class b extends WeakReference {

    /* renamed from: a  reason: collision with root package name */
    public final f f18a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f19b;

    /* renamed from: c  reason: collision with root package name */
    public f0 f20c;

    public b(f fVar, z zVar, ReferenceQueue referenceQueue, boolean z5) {
        super(zVar, referenceQueue);
        f0 f0Var;
        o.i(fVar);
        this.f18a = fVar;
        if (!zVar.f179d || !z5) {
            f0Var = null;
        } else {
            f0Var = zVar.f181f;
            o.i(f0Var);
        }
        this.f20c = f0Var;
        this.f19b = zVar.f179d;
    }
}
