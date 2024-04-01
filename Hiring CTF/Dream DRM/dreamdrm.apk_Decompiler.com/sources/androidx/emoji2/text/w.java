package androidx.emoji2.text;

import android.util.SparseArray;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray f1053a;

    /* renamed from: b  reason: collision with root package name */
    public q f1054b;

    public w(int i3) {
        this.f1053a = new SparseArray(i3);
    }

    public final void a(q qVar, int i3, int i6) {
        int a6 = qVar.a(i3);
        SparseArray sparseArray = this.f1053a;
        w wVar = sparseArray == null ? null : (w) sparseArray.get(a6);
        if (wVar == null) {
            wVar = new w(1);
            sparseArray.put(qVar.a(i3), wVar);
        }
        if (i6 > i3) {
            wVar.a(qVar, i3 + 1, i6);
        } else {
            wVar.f1054b = qVar;
        }
    }
}
