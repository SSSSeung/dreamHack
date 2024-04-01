package l2;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.l0;
import androidx.fragment.app.r;
import com.bumptech.glide.b;
import com.bumptech.glide.n;
import e2.f;
import java.util.HashSet;

public class m extends r {
    public final a V;
    public final f W = new f(7, this);
    public final HashSet X = new HashSet();
    public m Y;
    public n Z;

    /* renamed from: a0  reason: collision with root package name */
    public r f4105a0;

    public m() {
        a aVar = new a();
        this.V = aVar;
    }

    public final void H(Context context, l0 l0Var) {
        m mVar = this.Y;
        if (mVar != null) {
            mVar.X.remove(this);
            this.Y = null;
        }
        m e6 = b.b(context).f1694i.e(l0Var);
        this.Y = e6;
        if (!equals(e6)) {
            this.Y.X.add(this);
        }
    }

    public final void q(Context context) {
        super.q(context);
        r rVar = this;
        while (true) {
            r rVar2 = rVar.f1273x;
            if (rVar2 == null) {
                break;
            }
            rVar = rVar2;
        }
        l0 l0Var = rVar.f1271u;
        if (l0Var != null) {
            try {
                H(i(), l0Var);
            } catch (IllegalStateException e6) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e6);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    public final void t() {
        this.F = true;
        this.V.a();
        m mVar = this.Y;
        if (mVar != null) {
            mVar.X.remove(this);
            this.Y = null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        r rVar = this.f1273x;
        if (rVar == null) {
            rVar = this.f4105a0;
        }
        sb.append(rVar);
        sb.append("}");
        return sb.toString();
    }

    public final void v() {
        this.F = true;
        this.f4105a0 = null;
        m mVar = this.Y;
        if (mVar != null) {
            mVar.X.remove(this);
            this.Y = null;
        }
    }

    public final void y() {
        this.F = true;
        this.V.c();
    }

    public final void z() {
        this.F = true;
        this.V.d();
    }
}
