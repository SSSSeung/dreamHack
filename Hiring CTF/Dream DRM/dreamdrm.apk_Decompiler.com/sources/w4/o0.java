package w4;

import b1.o;
import h5.l;
import java.util.ArrayList;

public final class o0 implements g0 {
    private volatile /* synthetic */ Object _exceptionsHolder;
    private volatile /* synthetic */ int _isCompleting = 0;
    private volatile /* synthetic */ Object _rootCause;

    /* renamed from: d  reason: collision with root package name */
    public final t0 f5499d;

    public o0(t0 t0Var, Throwable th) {
        this.f5499d = t0Var;
        this._rootCause = th;
        this._exceptionsHolder = null;
    }

    public final void a(Throwable th) {
        Throwable th2 = (Throwable) this._rootCause;
        if (th2 == null) {
            this._rootCause = th;
        } else if (th != th2) {
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                this._exceptionsHolder = th;
            } else if (obj instanceof Throwable) {
                if (th != obj) {
                    ArrayList arrayList = new ArrayList(4);
                    arrayList.add(obj);
                    arrayList.add(th);
                    this._exceptionsHolder = arrayList;
                }
            } else if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
    }

    public final boolean b() {
        return ((Throwable) this._rootCause) == null;
    }

    public final Throwable c() {
        return (Throwable) this._rootCause;
    }

    public final boolean d() {
        return ((Throwable) this._rootCause) != null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    public final boolean e() {
        return this._isCompleting;
    }

    public final t0 f() {
        return this.f5499d;
    }

    public final boolean g() {
        return this._exceptionsHolder == l.f3495n;
    }

    public final ArrayList h(Throwable th) {
        ArrayList arrayList;
        Object obj = this._exceptionsHolder;
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable th2 = (Throwable) this._rootCause;
        if (th2 != null) {
            arrayList.add(0, th2);
        }
        if (th != null && !o.c(th, th2)) {
            arrayList.add(th);
        }
        this._exceptionsHolder = l.f3495n;
        return arrayList;
    }

    public final void i() {
        this._isCompleting = 1;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [boolean, int] */
    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + this._isCompleting + ", rootCause=" + ((Throwable) this._rootCause) + ", exceptions=" + this._exceptionsHolder + ", list=" + this.f5499d + ']';
    }
}
