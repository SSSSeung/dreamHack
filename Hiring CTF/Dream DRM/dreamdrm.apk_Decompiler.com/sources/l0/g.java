package l0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b1.o;
import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.WeakHashMap;
import p1.r;
import x0.j0;
import x0.u0;

public final class g implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4072a;

    public /* synthetic */ g(int i3) {
        this.f4072a = i3;
    }

    public final int a(View view, View view2) {
        switch (this.f4072a) {
            case 0:
                WeakHashMap weakHashMap = u0.f5622a;
                float m6 = j0.m(view);
                float m7 = j0.m(view2);
                if (m6 > m7) {
                    return -1;
                }
                return m6 < m7 ? 1 : 0;
            default:
                return view.getTop() - view2.getTop();
        }
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f4072a) {
            case 0:
                return a((View) obj, (View) obj2);
            case 1:
                r rVar = (r) obj;
                r rVar2 = (r) obj2;
                RecyclerView recyclerView = rVar.f4655d;
                if ((recyclerView == null) == (rVar2.f4655d == null)) {
                    boolean z5 = rVar.f4652a;
                    if (z5 == rVar2.f4652a) {
                        int i3 = rVar2.f4653b - rVar.f4653b;
                        if (i3 != 0) {
                            return i3;
                        }
                        int i6 = rVar.f4654c - rVar2.f4654c;
                        if (i6 != 0) {
                            return i6;
                        }
                        return 0;
                    } else if (z5) {
                        return -1;
                    }
                } else if (recyclerView != null) {
                    return -1;
                }
                return 1;
            case 2:
                return a((View) obj, (View) obj2);
            case 3:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 4:
                Integer valueOf = Integer.valueOf(((Constructor) obj2).getParameterTypes().length);
                Integer valueOf2 = Integer.valueOf(((Constructor) obj).getParameterTypes().length);
                if (valueOf == valueOf2) {
                    return 0;
                }
                if (valueOf == null) {
                    return -1;
                }
                if (valueOf2 == null) {
                    return 1;
                }
                return valueOf.compareTo(valueOf2);
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                o.m(str, "a");
                o.m(str2, "b");
                int min = Math.min(str.length(), str2.length());
                int i7 = 4;
                while (true) {
                    if (i7 >= min) {
                        int length = str.length();
                        int length2 = str2.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length < length2) {
                            return -1;
                        }
                    } else {
                        char charAt = str.charAt(i7);
                        char charAt2 = str2.charAt(i7);
                        if (charAt == charAt2) {
                            i7++;
                        } else if (o.o(charAt, charAt2) < 0) {
                            return -1;
                        }
                    }
                }
                return 1;
        }
    }
}
