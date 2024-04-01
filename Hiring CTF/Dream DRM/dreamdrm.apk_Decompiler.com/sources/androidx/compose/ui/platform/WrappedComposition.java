package androidx.compose.ui.platform;

import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import b1.o;

final class WrappedComposition implements p {

    /* renamed from: d  reason: collision with root package name */
    public boolean f886d;

    public final void b(r rVar, l lVar) {
        if (lVar != l.ON_DESTROY) {
            if (lVar == l.ON_CREATE && !this.f886d) {
                o.m((Object) null, "content");
                throw null;
            }
        } else if (!this.f886d) {
            this.f886d = true;
            throw null;
        } else {
            throw null;
        }
    }
}
