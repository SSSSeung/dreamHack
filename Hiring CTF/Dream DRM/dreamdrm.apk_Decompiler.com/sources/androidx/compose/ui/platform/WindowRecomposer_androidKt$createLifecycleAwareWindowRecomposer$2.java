package androidx.compose.ui.platform;

import android.view.View;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import b1.o;
import i4.d;
import i4.i;

public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 implements p {
    public final void b(r rVar, l lVar) {
        int i3 = m.f908a[lVar.ordinal()];
        if (i3 == 1) {
            o.G((w4.o) null, i.f3606d, 4, new n((p4.i) null, rVar, this, (View) null, (d) null));
            throw null;
        } else if (i3 != 2 && i3 != 3 && i3 == 4) {
            throw null;
        }
    }
}
