package androidx.appcompat.widget;

import android.database.Cursor;
import c1.a;

public final class b3 implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f526d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ SearchView f527e;

    public /* synthetic */ b3(SearchView searchView, int i3) {
        this.f526d = i3;
        this.f527e = searchView;
    }

    public final void run() {
        int i3 = this.f526d;
        SearchView searchView = this.f527e;
        switch (i3) {
            case 0:
                searchView.u();
                return;
            default:
                a aVar = searchView.R;
                if (aVar instanceof s3) {
                    aVar.b((Cursor) null);
                    return;
                }
                return;
        }
    }
}
