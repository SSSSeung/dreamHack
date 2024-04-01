package e2;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import y1.i;

public final class j0 implements v {

    /* renamed from: b  reason: collision with root package name */
    public static final Set f2520b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a  reason: collision with root package name */
    public final v f2521a;

    public j0(v vVar) {
        this.f2521a = vVar;
    }

    public final boolean a(Object obj) {
        return f2520b.contains(((Uri) obj).getScheme());
    }

    public final u b(Object obj, int i3, int i6, i iVar) {
        return this.f2521a.b(new m(((Uri) obj).toString()), i3, i6, iVar);
    }
}
