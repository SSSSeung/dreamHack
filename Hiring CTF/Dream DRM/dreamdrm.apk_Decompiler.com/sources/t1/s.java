package t1;

import a2.m;
import android.view.ViewGroup;
import com.theori.dreamdrm.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k.b;
import x0.g0;
import x0.u0;

public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5163a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f5164b = new ThreadLocal();

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList f5165c = new ArrayList();

    public static void a(ViewGroup viewGroup, p pVar) {
        ArrayList arrayList = f5165c;
        if (!arrayList.contains(viewGroup)) {
            WeakHashMap weakHashMap = u0.f5622a;
            if (g0.c(viewGroup)) {
                arrayList.add(viewGroup);
                if (pVar == null) {
                    pVar = f5163a;
                }
                p j6 = pVar.clone();
                ArrayList arrayList2 = (ArrayList) b().getOrDefault(viewGroup, (Object) null);
                if (arrayList2 != null && arrayList2.size() > 0) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((p) it.next()).u(viewGroup);
                    }
                }
                if (j6 != null) {
                    j6.h(viewGroup, true);
                }
                m.o(viewGroup.getTag(R.id.transition_current_scene));
                viewGroup.setTag(R.id.transition_current_scene, (Object) null);
                if (j6 != null) {
                    r rVar = new r(viewGroup, j6);
                    viewGroup.addOnAttachStateChangeListener(rVar);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(rVar);
                }
            }
        }
    }

    public static b b() {
        b bVar;
        ThreadLocal threadLocal = f5164b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (b) weakReference.get()) != null) {
            return bVar;
        }
        b bVar2 = new b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
