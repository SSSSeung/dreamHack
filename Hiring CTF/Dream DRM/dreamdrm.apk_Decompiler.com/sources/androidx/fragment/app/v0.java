package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import t1.l;

public abstract class v0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a1 f1307a = new a1();

    /* renamed from: b  reason: collision with root package name */
    public static final c1 f1308b;

    static {
        c1 c1Var;
        try {
            c1Var = l.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c1Var = null;
        }
        f1308b = c1Var;
    }

    public static void a(r rVar, r rVar2, boolean z5) {
        if (z5) {
            rVar2.getClass();
        } else {
            rVar.getClass();
        }
    }

    public static void b(ArrayList arrayList, int i3) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i3);
            }
        }
    }
}
