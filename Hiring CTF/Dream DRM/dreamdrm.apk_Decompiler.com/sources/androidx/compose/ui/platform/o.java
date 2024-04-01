package androidx.compose.ui.platform;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import androidx.emoji2.text.u;
import c1.a;

public final class o extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f915a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f916b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(a aVar) {
        super(new Handler());
        this.f916b = aVar;
    }

    public final boolean deliverSelfNotifications() {
        switch (this.f915a) {
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    public final void onChange(boolean z5) {
        Cursor cursor;
        switch (this.f915a) {
            case 1:
                a aVar = (a) this.f916b;
                if (aVar.f1599e && (cursor = aVar.f1600f) != null && !cursor.isClosed()) {
                    aVar.f1598d = aVar.f1600f.requery();
                    return;
                }
                return;
            default:
                super.onChange(z5);
                return;
        }
    }

    public final void onChange(boolean z5, Uri uri) {
        int i3 = this.f915a;
        Object obj = this.f916b;
        switch (i3) {
            case 0:
                ((y4.a) obj).a();
                return;
            case 2:
                ((u) obj).c();
                return;
            default:
                super.onChange(z5, uri);
                return;
        }
    }
}
