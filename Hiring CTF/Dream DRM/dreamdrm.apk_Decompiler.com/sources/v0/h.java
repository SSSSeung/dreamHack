package v0;

import b2.k;
import e2.b0;
import e2.g;
import e2.v;
import e2.w;
import java.util.ArrayDeque;
import java.util.Queue;
import r2.l;

public abstract class h implements w {

    /* renamed from: d  reason: collision with root package name */
    public final Object f5372d;

    public h() {
        char[] cArr = l.f4938a;
        this.f5372d = new ArrayDeque(20);
    }

    public abstract k a();

    public abstract boolean b();

    public final k c() {
        k kVar = (k) ((Queue) this.f5372d).poll();
        return kVar == null ? a() : kVar;
    }

    public final v d(b0 b0Var) {
        return new g(2, (e2.l) this.f5372d);
    }

    public final boolean e(CharSequence charSequence, int i3) {
        if (charSequence == null || i3 < 0 || charSequence.length() - i3 < 0) {
            throw new IllegalArgumentException();
        }
        g gVar = (g) this.f5372d;
        if (gVar == null) {
            return b();
        }
        int g6 = gVar.g(charSequence, i3);
        if (g6 == 0) {
            return true;
        }
        if (g6 != 1) {
            return b();
        }
        return false;
    }

    public final void f(k kVar) {
        Object obj = this.f5372d;
        if (((Queue) obj).size() < 20) {
            ((Queue) obj).offer(kVar);
        }
    }

    public /* synthetic */ h(Object obj) {
        this.f5372d = obj;
    }
}
