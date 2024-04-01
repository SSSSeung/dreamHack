package x0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import e.n0;

public final class d implements e {

    /* renamed from: d  reason: collision with root package name */
    public final ContentInfo.Builder f5554d;

    public d(ClipData clipData, int i3) {
        androidx.compose.ui.platform.d.m();
        this.f5554d = androidx.compose.ui.platform.d.g(clipData, i3);
    }

    public final h a() {
        return new h(new n0(this.f5554d.build()));
    }

    public final void b(Bundle bundle) {
        this.f5554d.setExtras(bundle);
    }

    public final void c(Uri uri) {
        this.f5554d.setLinkUri(uri);
    }

    public final void d(int i3) {
        this.f5554d.setFlags(i3);
    }
}
