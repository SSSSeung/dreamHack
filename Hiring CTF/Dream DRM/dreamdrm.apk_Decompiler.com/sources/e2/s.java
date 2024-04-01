package e2;

import android.content.Context;
import android.net.Uri;
import b1.v;
import h2.f0;
import q2.b;
import y1.i;
import z1.a;
import z1.c;

public final class s implements v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2538a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2539b;

    public s(Context context, int i3) {
        this.f2538a = i3;
        if (i3 == 1) {
            this.f2539b = context.getApplicationContext();
        } else if (i3 != 2) {
            this.f2539b = context;
        } else {
            this.f2539b = context.getApplicationContext();
        }
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.f2538a) {
            case 0:
                return d((Uri) obj);
            case 1:
                return d((Uri) obj);
            default:
                return d((Uri) obj);
        }
    }

    public final /* bridge */ /* synthetic */ u b(Object obj, int i3, int i6, i iVar) {
        switch (this.f2538a) {
            case 0:
                return c((Uri) obj, i3, i6, iVar);
            case 1:
                return c((Uri) obj, i3, i6, iVar);
            default:
                return c((Uri) obj, i3, i6, iVar);
        }
    }

    public final u c(Uri uri, int i3, int i6, i iVar) {
        boolean z5 = true;
        int i7 = this.f2538a;
        Context context = this.f2539b;
        switch (i7) {
            case 0:
                return new u(new b(uri), new r(context, uri));
            case 1:
                if (i3 == Integer.MIN_VALUE || i6 == Integer.MIN_VALUE || i3 > 512 || i6 > 384) {
                    z5 = false;
                }
                if (z5) {
                    return new u(new b(uri), c.e(context, uri, new a(context.getContentResolver())));
                }
                return null;
            default:
                if (!(i3 != Integer.MIN_VALUE && i6 != Integer.MIN_VALUE && i3 <= 512 && i6 <= 384)) {
                    return null;
                }
                Long l6 = (Long) iVar.c(f0.f3397d);
                if (l6 == null || l6.longValue() != -1) {
                    z5 = false;
                }
                if (z5) {
                    return new u(new b(uri), c.e(context, uri, new z1.b(context.getContentResolver())));
                }
                return null;
        }
    }

    public final boolean d(Uri uri) {
        switch (this.f2538a) {
            case 0:
                return v.A(uri);
            case 1:
                return v.A(uri) && !uri.getPathSegments().contains("video");
            default:
                return v.A(uri) && uri.getPathSegments().contains("video");
        }
    }
}
