package x3;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class n implements Iterator {

    /* renamed from: d  reason: collision with root package name */
    public o f5735d;

    /* renamed from: e  reason: collision with root package name */
    public o f5736e = null;

    /* renamed from: f  reason: collision with root package name */
    public int f5737f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ p f5738g;

    public n(p pVar) {
        this.f5738g = pVar;
        this.f5735d = pVar.f5754i.f5742g;
        this.f5737f = pVar.f5753h;
    }

    public final o a() {
        o oVar = this.f5735d;
        p pVar = this.f5738g;
        if (oVar == pVar.f5754i) {
            throw new NoSuchElementException();
        } else if (pVar.f5753h == this.f5737f) {
            this.f5735d = oVar.f5742g;
            this.f5736e = oVar;
            return oVar;
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        return this.f5735d != this.f5738g.f5754i;
    }

    public final void remove() {
        o oVar = this.f5736e;
        if (oVar != null) {
            p pVar = this.f5738g;
            pVar.d(oVar, true);
            this.f5736e = null;
            this.f5737f = pVar.f5753h;
            return;
        }
        throw new IllegalStateException();
    }
}
