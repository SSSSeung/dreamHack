package androidx.lifecycle;

import a2.m;
import android.os.Bundle;
import androidx.fragment.app.v;
import b1.o;
import f4.f;
import java.util.Iterator;
import java.util.Map;
import q1.c;
import q1.d;
import y.e;

public final class i0 implements c {

    /* renamed from: a  reason: collision with root package name */
    public final d f1362a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1363b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f1364c;

    /* renamed from: d  reason: collision with root package name */
    public final f f1365d;

    public i0(d dVar, v vVar) {
        o.m(dVar, "savedStateRegistry");
        this.f1362a = dVar;
        this.f1365d = new f(new e(3, vVar));
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1364c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((j0) this.f1365d.a()).f1366c.entrySet().iterator();
        if (!it.hasNext()) {
            this.f1363b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        String str = (String) entry.getKey();
        m.o(entry.getValue());
        throw null;
    }
}
