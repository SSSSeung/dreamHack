package e2;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.load.data.a;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.data.o;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import q2.b;
import y1.i;

public final class i0 implements v {

    /* renamed from: b  reason: collision with root package name */
    public static final Set f2514b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: a  reason: collision with root package name */
    public final h0 f2515a;

    public i0(h0 h0Var) {
        this.f2515a = h0Var;
    }

    public final boolean a(Object obj) {
        return f2514b.contains(((Uri) obj).getScheme());
    }

    public final u b(Object obj, int i3, int i6, i iVar) {
        e eVar;
        Uri uri = (Uri) obj;
        b bVar = new b(uri);
        g0 g0Var = (g0) this.f2515a;
        int i7 = g0Var.f2509d;
        ContentResolver contentResolver = g0Var.f2510e;
        switch (i7) {
            case 0:
                eVar = new a(contentResolver, uri, 0);
                break;
            case 1:
                eVar = new a(contentResolver, uri, 1);
                break;
            default:
                eVar = new o(contentResolver, uri);
                break;
        }
        return new u(bVar, eVar);
    }
}
