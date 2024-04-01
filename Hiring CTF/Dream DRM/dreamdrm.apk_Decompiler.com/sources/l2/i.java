package l2;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.b;
import com.bumptech.glide.n;
import e2.f;
import java.util.HashSet;

public final class i extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    public final a f4088d;

    /* renamed from: e  reason: collision with root package name */
    public final f f4089e = new f(6, this);

    /* renamed from: f  reason: collision with root package name */
    public final HashSet f4090f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    public n f4091g;

    /* renamed from: h  reason: collision with root package name */
    public i f4092h;

    /* renamed from: i  reason: collision with root package name */
    public Fragment f4093i;

    public i() {
        a aVar = new a();
        this.f4088d = aVar;
    }

    public final void a(Activity activity) {
        i iVar = this.f4092h;
        if (iVar != null) {
            iVar.f4090f.remove(this);
            this.f4092h = null;
        }
        j jVar = b.b(activity).f1694i;
        jVar.getClass();
        i d6 = jVar.d(activity.getFragmentManager());
        this.f4092h = d6;
        if (!equals(d6)) {
            this.f4092h.f4090f.add(this);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e6) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e6);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f4088d.a();
        i iVar = this.f4092h;
        if (iVar != null) {
            iVar.f4090f.remove(this);
            this.f4092h = null;
        }
    }

    public final void onDetach() {
        super.onDetach();
        i iVar = this.f4092h;
        if (iVar != null) {
            iVar.f4090f.remove(this);
            this.f4092h = null;
        }
    }

    public final void onStart() {
        super.onStart();
        this.f4088d.c();
    }

    public final void onStop() {
        super.onStop();
        this.f4088d.d();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f4093i;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
