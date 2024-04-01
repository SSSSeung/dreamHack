package e2;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class q implements n {

    /* renamed from: b  reason: collision with root package name */
    public final Map f2533b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Map f2534c;

    public q(Map map) {
        this.f2533b = Collections.unmodifiableMap(map);
    }

    public final Map a() {
        if (this.f2534c == null) {
            synchronized (this) {
                if (this.f2534c == null) {
                    this.f2534c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f2534c;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f2533b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                String str = ((p) list.get(i3)).f2532a;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i3 != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(entry.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f2533b.equals(((q) obj).f2533b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2533b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f2533b + '}';
    }
}
