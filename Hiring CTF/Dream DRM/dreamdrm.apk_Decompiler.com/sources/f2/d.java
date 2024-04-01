package f2;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import e2.u;
import e2.v;
import q2.b;
import y1.i;

public final class d implements v {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2651a;

    /* renamed from: b  reason: collision with root package name */
    public final v f2652b;

    /* renamed from: c  reason: collision with root package name */
    public final v f2653c;

    /* renamed from: d  reason: collision with root package name */
    public final Class f2654d;

    public d(Context context, v vVar, v vVar2, Class cls) {
        this.f2651a = context.getApplicationContext();
        this.f2652b = vVar;
        this.f2653c = vVar2;
        this.f2654d = cls;
    }

    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && b1.v.A((Uri) obj);
    }

    public final u b(Object obj, int i3, int i6, i iVar) {
        Uri uri = (Uri) obj;
        return new u(new b(uri), new c(this.f2651a, this.f2652b, this.f2653c, uri, i3, i6, iVar, this.f2654d));
    }
}
