package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1282a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f1283b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public o0 f1284c;

    public final void a(r rVar) {
        if (!this.f1282a.contains(rVar)) {
            synchronized (this.f1282a) {
                this.f1282a.add(rVar);
            }
            rVar.f1264n = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + rVar);
    }

    public final r b(String str) {
        r0 r0Var = (r0) this.f1283b.get(str);
        if (r0Var != null) {
            return r0Var.f1278c;
        }
        return null;
    }

    public final r c(String str) {
        for (r0 r0Var : this.f1283b.values()) {
            if (r0Var != null) {
                r rVar = r0Var.f1278c;
                if (!str.equals(rVar.f1258h)) {
                    rVar = rVar.w.f1173c.c(str);
                }
                if (rVar != null) {
                    return rVar;
                }
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (r0 r0Var : this.f1283b.values()) {
            if (r0Var != null) {
                arrayList.add(r0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (r0 r0Var : this.f1283b.values()) {
            arrayList.add(r0Var != null ? r0Var.f1278c : null);
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f1282a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1282a) {
            arrayList = new ArrayList(this.f1282a);
        }
        return arrayList;
    }

    public final void g(r0 r0Var) {
        r rVar = r0Var.f1278c;
        String str = rVar.f1258h;
        HashMap hashMap = this.f1283b;
        if (!(hashMap.get(str) != null)) {
            hashMap.put(rVar.f1258h, r0Var);
            if (l0.G(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + rVar);
            }
        }
    }

    public final void h(r0 r0Var) {
        r rVar = r0Var.f1278c;
        if (rVar.D) {
            this.f1284c.b(rVar);
        }
        if (((r0) this.f1283b.put(rVar.f1258h, (Object) null)) != null && l0.G(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + rVar);
        }
    }
}
