package x0;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import androidx.compose.ui.platform.d;
import b1.w;
import e.n0;
import java.util.Objects;

public final class r0 implements OnReceiveContentListener {

    /* renamed from: a  reason: collision with root package name */
    public final t f5608a;

    public r0(t tVar) {
        this.f5608a = tVar;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        h hVar = new h(new n0(contentInfo));
        h a6 = ((w) this.f5608a).a(view, hVar);
        if (a6 == null) {
            return null;
        }
        if (a6 == hVar) {
            return contentInfo;
        }
        ContentInfo n5 = a6.f5570a.n();
        Objects.requireNonNull(n5);
        return d.j(n5);
    }
}
