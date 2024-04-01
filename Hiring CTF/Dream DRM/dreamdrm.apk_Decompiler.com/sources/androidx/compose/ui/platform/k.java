package androidx.compose.ui.platform;

import a2.m;
import android.graphics.Matrix;
import android.view.View;
import b1.o;
import i4.c;
import i4.h;
import i4.i;
import kotlinx.coroutines.internal.u;
import o4.e;
import p4.f;

public final class k extends f implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final k f900f = new k(1);

    /* renamed from: g  reason: collision with root package name */
    public static final k f901g = new k(2);

    /* renamed from: h  reason: collision with root package name */
    public static final k f902h = new k(3);

    /* renamed from: i  reason: collision with root package name */
    public static final k f903i = new k(4);

    /* renamed from: j  reason: collision with root package name */
    public static final k f904j = new k(7);

    /* renamed from: k  reason: collision with root package name */
    public static final k f905k = new k(8);

    /* renamed from: l  reason: collision with root package name */
    public static final k f906l = new k(9);

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f907e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i3) {
        super(2);
        this.f907e = i3;
    }

    public final h b(i4.f fVar, h hVar) {
        c cVar;
        switch (this.f907e) {
            case 2:
                o.m(hVar, "acc");
                o.m(fVar, "element");
                h e6 = hVar.e(fVar.getKey());
                i iVar = i.f3606d;
                if (e6 == iVar) {
                    return fVar;
                }
                e eVar = e.f892i;
                i4.e eVar2 = (i4.e) e6.l(eVar);
                if (eVar2 == null) {
                    cVar = new c(fVar, e6);
                } else {
                    h e7 = e6.e(eVar);
                    if (e7 == iVar) {
                        return new c(eVar2, fVar);
                    }
                    cVar = new c(eVar2, new c(fVar, e7));
                }
                return cVar;
            default:
                return hVar.p(fVar);
        }
    }

    public final Object h(Object obj, Object obj2) {
        boolean z5 = true;
        switch (this.f907e) {
            case 0:
                View view = (View) obj;
                Matrix matrix = (Matrix) obj2;
                o.m(view, "view");
                o.m(matrix, "matrix");
                matrix.set(view.getMatrix());
                return f4.h.f2682a;
            case 1:
                String str = (String) obj;
                i4.f fVar = (i4.f) obj2;
                o.m(str, "acc");
                o.m(fVar, "element");
                if (str.length() != 0) {
                    z5 = false;
                }
                if (z5) {
                    return fVar.toString();
                }
                return str + ", " + fVar;
            case 2:
                return b((i4.f) obj2, (h) obj);
            case 3:
                return b((i4.f) obj2, (h) obj);
            case 4:
                i4.f fVar2 = (i4.f) obj2;
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 5:
                return Boolean.valueOf(o.c(obj, obj2));
            case 6:
                i4.f fVar3 = (i4.f) obj2;
                return Integer.valueOf(((Number) obj).intValue() + 1);
            case 7:
                i4.f fVar4 = (i4.f) obj2;
                return obj;
            case 8:
                m.o(obj);
                i4.f fVar5 = (i4.f) obj2;
                return null;
            default:
                i4.f fVar6 = (i4.f) obj2;
                return (u) obj;
        }
    }
}
