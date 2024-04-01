package p1;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import x0.d0;
import x0.u0;

public abstract class f1 {

    /* renamed from: t  reason: collision with root package name */
    public static final List f4482t = Collections.emptyList();

    /* renamed from: a  reason: collision with root package name */
    public final View f4483a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference f4484b;

    /* renamed from: c  reason: collision with root package name */
    public int f4485c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f4486d = -1;

    /* renamed from: e  reason: collision with root package name */
    public long f4487e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f4488f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f4489g = -1;

    /* renamed from: h  reason: collision with root package name */
    public f1 f4490h = null;

    /* renamed from: i  reason: collision with root package name */
    public f1 f4491i = null;

    /* renamed from: j  reason: collision with root package name */
    public int f4492j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f4493k = null;

    /* renamed from: l  reason: collision with root package name */
    public List f4494l = null;

    /* renamed from: m  reason: collision with root package name */
    public int f4495m = 0;

    /* renamed from: n  reason: collision with root package name */
    public v0 f4496n = null;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4497o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f4498p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f4499q = -1;

    /* renamed from: r  reason: collision with root package name */
    public RecyclerView f4500r;

    /* renamed from: s  reason: collision with root package name */
    public g0 f4501s;

    public f1(View view) {
        if (view != null) {
            this.f4483a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(Object obj) {
        if (obj == null) {
            b(1024);
        } else if ((1024 & this.f4492j) == 0) {
            if (this.f4493k == null) {
                ArrayList arrayList = new ArrayList();
                this.f4493k = arrayList;
                this.f4494l = Collections.unmodifiableList(arrayList);
            }
            this.f4493k.add(obj);
        }
    }

    public final void b(int i3) {
        this.f4492j = i3 | this.f4492j;
    }

    public final int c() {
        int i3 = this.f4489g;
        return i3 == -1 ? this.f4485c : i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f4493k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List d() {
        /*
            r1 = this;
            int r0 = r1.f4492j
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 != 0) goto L_0x0014
            java.util.ArrayList r0 = r1.f4493k
            if (r0 == 0) goto L_0x0014
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            java.util.List r0 = r1.f4494l
            return r0
        L_0x0014:
            java.util.List r0 = f4482t
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.f1.d():java.util.List");
    }

    public final boolean e() {
        View view = this.f4483a;
        return (view.getParent() == null || view.getParent() == this.f4500r) ? false : true;
    }

    public final boolean f() {
        return (this.f4492j & 1) != 0;
    }

    public final boolean g() {
        return (this.f4492j & 4) != 0;
    }

    public final boolean h() {
        if ((this.f4492j & 16) == 0) {
            WeakHashMap weakHashMap = u0.f5622a;
            if (!d0.i(this.f4483a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        return (this.f4492j & 8) != 0;
    }

    public final boolean j() {
        return this.f4496n != null;
    }

    public final boolean k() {
        return (this.f4492j & 256) != 0;
    }

    public final void l(int i3, boolean z5) {
        if (this.f4486d == -1) {
            this.f4486d = this.f4485c;
        }
        if (this.f4489g == -1) {
            this.f4489g = this.f4485c;
        }
        if (z5) {
            this.f4489g += i3;
        }
        this.f4485c += i3;
        View view = this.f4483a;
        if (view.getLayoutParams() != null) {
            ((p0) view.getLayoutParams()).f4642c = true;
        }
    }

    public final void m() {
        if (!RecyclerView.A0 || !k()) {
            this.f4492j = 0;
            this.f4485c = -1;
            this.f4486d = -1;
            this.f4487e = -1;
            this.f4489g = -1;
            this.f4495m = 0;
            this.f4490h = null;
            this.f4491i = null;
            ArrayList arrayList = this.f4493k;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.f4492j &= -1025;
            this.f4498p = 0;
            this.f4499q = -1;
            RecyclerView.l(this);
            return;
        }
        throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
    }

    public final void n(boolean z5) {
        int i3;
        int i6 = this.f4495m;
        int i7 = z5 ? i6 - 1 : i6 + 1;
        this.f4495m = i7;
        if (i7 < 0) {
            this.f4495m = 0;
            if (!RecyclerView.A0) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else {
            if (!z5 && i7 == 1) {
                i3 = this.f4492j | 16;
            } else if (z5 && i7 == 0) {
                i3 = this.f4492j & -17;
            }
            this.f4492j = i3;
        }
        if (RecyclerView.B0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z5 + ":" + this);
        }
    }

    public final boolean o() {
        return (this.f4492j & 128) != 0;
    }

    public final boolean p() {
        return (this.f4492j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f4485c + " id=" + this.f4487e + ", oldPos=" + this.f4486d + ", pLpos:" + this.f4489g);
        if (j()) {
            sb.append(" scrap ");
            sb.append(this.f4497o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (g()) {
            sb.append(" invalid");
        }
        if (!f()) {
            sb.append(" unbound");
        }
        boolean z5 = true;
        if ((this.f4492j & 2) != 0) {
            sb.append(" update");
        }
        if (i()) {
            sb.append(" removed");
        }
        if (o()) {
            sb.append(" ignored");
        }
        if (k()) {
            sb.append(" tmpDetached");
        }
        if (!h()) {
            sb.append(" not recyclable(" + this.f4495m + ")");
        }
        if ((this.f4492j & 512) == 0 && !g()) {
            z5 = false;
        }
        if (z5) {
            sb.append(" undefined adapter position");
        }
        if (this.f4483a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
