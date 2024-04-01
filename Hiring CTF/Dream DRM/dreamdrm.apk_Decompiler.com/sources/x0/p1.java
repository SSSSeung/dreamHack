package x0;

import a1.a;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import c3.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import q0.c;

public final class p1 extends WindowInsetsAnimation.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final e f5601a;

    /* renamed from: b  reason: collision with root package name */
    public List f5602b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f5603c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f5604d = new HashMap();

    public p1(e eVar) {
        super(0);
        this.f5601a = eVar;
    }

    public final s1 a(WindowInsetsAnimation windowInsetsAnimation) {
        s1 s1Var = (s1) this.f5604d.get(windowInsetsAnimation);
        if (s1Var != null) {
            return s1Var;
        }
        s1 s1Var2 = new s1(windowInsetsAnimation);
        this.f5604d.put(windowInsetsAnimation, s1Var2);
        return s1Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        e eVar = this.f5601a;
        a(windowInsetsAnimation);
        eVar.f1636b.setTranslationY(0.0f);
        this.f5604d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        e eVar = this.f5601a;
        a(windowInsetsAnimation);
        View view = eVar.f1636b;
        int[] iArr = eVar.f1639e;
        view.getLocationOnScreen(iArr);
        eVar.f1637c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f5603c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f5603c = arrayList2;
            this.f5602b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                WindowInsetsAnimation k6 = a.k(list.get(size));
                s1 a6 = a(k6);
                a6.f5613a.d(k6.getFraction());
                this.f5603c.add(a6);
            } else {
                e eVar = this.f5601a;
                h2 h6 = h2.h((View) null, windowInsets);
                eVar.a(h6, this.f5602b);
                return h6.g();
            }
        }
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        e eVar = this.f5601a;
        a(windowInsetsAnimation);
        c c6 = c.c(bounds.getLowerBound());
        c c7 = c.c(bounds.getUpperBound());
        View view = eVar.f1636b;
        int[] iArr = eVar.f1639e;
        view.getLocationOnScreen(iArr);
        int i3 = eVar.f1637c - iArr[1];
        eVar.f1638d = i3;
        view.setTranslationY((float) i3);
        a.B();
        return a.i(c6.d(), c7.d());
    }
}
