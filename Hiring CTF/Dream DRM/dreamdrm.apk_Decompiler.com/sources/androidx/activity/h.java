package androidx.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.a;
import androidx.activity.result.b;
import androidx.activity.result.c;
import androidx.activity.result.d;
import androidx.fragment.app.d0;
import java.util.ArrayList;
import java.util.HashMap;
import q4.e;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f285a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f286b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f287c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f288d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final transient HashMap f289e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f290f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f291g = new Bundle();

    public final boolean a(int i3, int i6, Intent intent) {
        b bVar;
        String str = (String) this.f285a.get(Integer.valueOf(i3));
        if (str == null) {
            return false;
        }
        d dVar = (d) this.f289e.get(str);
        if (dVar == null || (bVar = dVar.f330a) == null || !this.f288d.contains(str)) {
            this.f290f.remove(str);
            this.f291g.putParcelable(str, new a(intent, i6));
        } else {
            ((d0) bVar).b(dVar.f331b.y(intent, i6));
            this.f288d.remove(str);
        }
        return true;
    }

    public final c b(String str, com.bumptech.glide.d dVar, d0 d0Var) {
        int b6;
        HashMap hashMap;
        HashMap hashMap2 = this.f286b;
        if (((Integer) hashMap2.get(str)) == null) {
            do {
                b6 = e.f4910d.b() + 65536;
                hashMap = this.f285a;
            } while (hashMap.containsKey(Integer.valueOf(b6)));
            hashMap.put(Integer.valueOf(b6), str);
            hashMap2.put(str, Integer.valueOf(b6));
        }
        this.f289e.put(str, new d(d0Var, dVar));
        HashMap hashMap3 = this.f290f;
        if (hashMap3.containsKey(str)) {
            Object obj = hashMap3.get(str);
            hashMap3.remove(str);
            d0Var.b(obj);
        }
        Bundle bundle = this.f291g;
        a aVar = (a) bundle.getParcelable(str);
        if (aVar != null) {
            bundle.remove(str);
            d0Var.b(dVar.y(aVar.f324e, aVar.f323d));
        }
        return new c(this, str, dVar);
    }
}
