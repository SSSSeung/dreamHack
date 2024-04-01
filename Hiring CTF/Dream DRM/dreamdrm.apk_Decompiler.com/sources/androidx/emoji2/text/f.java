package androidx.emoji2.text;

import androidx.compose.ui.platform.e;
import com.bumptech.glide.d;
import g.h;

public final class f extends d {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g f1005f;

    public f(g gVar) {
        this.f1005f = gVar;
    }

    public final void s(Throwable th) {
        ((l) this.f1005f.f2403e).d(th);
    }

    public final void t(h hVar) {
        g gVar = this.f1005f;
        gVar.f1007g = hVar;
        h hVar2 = gVar.f1007g;
        e eVar = new e(20);
        Object obj = gVar.f2403e;
        e eVar2 = ((l) obj).f1020h;
        ((l) obj).getClass();
        gVar.f1006f = new s(hVar2, eVar, eVar2);
        ((l) gVar.f2403e).e();
    }
}
