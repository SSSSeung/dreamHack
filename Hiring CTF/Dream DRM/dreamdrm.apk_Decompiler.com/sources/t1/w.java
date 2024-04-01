package t1;

import a2.m;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f5170a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final View f5171b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f5172c = new ArrayList();

    public w(View view) {
        this.f5171b = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (t1.w) r3;
        r0 = r3.f5171b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof t1.w
            if (r0 == 0) goto L_0x0018
            t1.w r3 = (t1.w) r3
            android.view.View r0 = r3.f5171b
            android.view.View r1 = r2.f5171b
            if (r1 != r0) goto L_0x0018
            java.util.HashMap r0 = r2.f5170a
            java.util.HashMap r3 = r3.f5170a
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0018
            r3 = 1
            return r3
        L_0x0018:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.w.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f5170a.hashCode() + (this.f5171b.hashCode() * 31);
    }

    public final String toString() {
        String h6 = m.h(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f5171b + "\n", "    values:");
        HashMap hashMap = this.f5170a;
        for (String str : hashMap.keySet()) {
            h6 = h6 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return h6;
    }
}
