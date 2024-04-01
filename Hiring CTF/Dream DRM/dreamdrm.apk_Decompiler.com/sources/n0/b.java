package n0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import p0.j;
import p0.k;
import p0.l;
import p0.p;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f4213a = new Object();

    public static ColorStateList a(Context context, int i3) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        k kVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        l lVar = new l(resources, theme);
        synchronized (p.f4413c) {
            SparseArray sparseArray = (SparseArray) p.f4412b.get(lVar);
            colorStateList = null;
            if (!(sparseArray == null || sparseArray.size() <= 0 || (kVar = (k) sparseArray.get(i3)) == null)) {
                if (!kVar.f4401b.equals(resources.getConfiguration()) || (!(theme == null && kVar.f4402c == 0) && (theme == null || kVar.f4402c != theme.hashCode()))) {
                    sparseArray.remove(i3);
                } else {
                    colorStateList2 = kVar.f4400a;
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = p.f4411a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z5 = true;
        resources.getValue(i3, typedValue, true);
        int i6 = typedValue.type;
        if (i6 < 28 || i6 > 31) {
            z5 = false;
        }
        if (!z5) {
            try {
                colorStateList = p0.b.a(resources, resources.getXml(i3), theme);
            } catch (Exception e6) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e6);
            }
        }
        if (colorStateList == null) {
            return j.b(resources, i3, theme);
        }
        synchronized (p.f4413c) {
            WeakHashMap weakHashMap = p.f4412b;
            SparseArray sparseArray2 = (SparseArray) weakHashMap.get(lVar);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(lVar, sparseArray2);
            }
            sparseArray2.append(i3, new k(colorStateList, lVar.f4403a.getConfiguration(), theme));
        }
        return colorStateList;
    }
}
