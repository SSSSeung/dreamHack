package x0;

import a2.m;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.theori.dreamdrm.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class t0 {

    /* renamed from: d  reason: collision with root package name */
    public static final ArrayList f5614d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f5615a = null;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray f5616b = null;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference f5617c = null;

    public static void b(View view) {
        int size;
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList != null && arrayList.size() - 1 >= 0) {
            m.o(arrayList.get(size));
            throw null;
        }
    }

    public final View a(View view) {
        View a6;
        WeakHashMap weakHashMap = this.f5615a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            do {
                childCount--;
                if (childCount >= 0) {
                    a6 = a(viewGroup.getChildAt(childCount));
                }
            } while (a6 == null);
            return a6;
        }
        b(view);
        return null;
    }
}
