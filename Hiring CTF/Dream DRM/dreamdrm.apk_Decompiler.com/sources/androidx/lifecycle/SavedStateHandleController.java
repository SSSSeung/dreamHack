package androidx.lifecycle;

public final class SavedStateHandleController implements p {

    /* renamed from: d  reason: collision with root package name */
    public boolean f1341d;

    public final void b(r rVar, l lVar) {
        if (lVar == l.ON_DESTROY) {
            this.f1341d = false;
            rVar.h().t(this);
        }
    }
}
