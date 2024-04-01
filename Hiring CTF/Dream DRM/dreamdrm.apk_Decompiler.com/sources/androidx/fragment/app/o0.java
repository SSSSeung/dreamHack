package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.k0;
import java.util.HashMap;
import java.util.Iterator;

public final class o0 extends k0 {

    /* renamed from: i  reason: collision with root package name */
    public static final n0 f1219i = new n0(0);

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f1220c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f1221d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f1222e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1223f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1224g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1225h = false;

    public o0(boolean z5) {
        this.f1223f = z5;
    }

    public final void a() {
        if (l0.G(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1224g = true;
    }

    public final void b(r rVar) {
        if (!this.f1225h) {
            if ((this.f1220c.remove(rVar.f1258h) != null) && l0.G(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + rVar);
            }
        } else if (l0.G(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0.class != obj.getClass()) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f1220c.equals(o0Var.f1220c) && this.f1221d.equals(o0Var.f1221d) && this.f1222e.equals(o0Var.f1222e);
    }

    public final int hashCode() {
        int hashCode = this.f1221d.hashCode();
        return this.f1222e.hashCode() + ((hashCode + (this.f1220c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f1220c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f1221d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f1222e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
