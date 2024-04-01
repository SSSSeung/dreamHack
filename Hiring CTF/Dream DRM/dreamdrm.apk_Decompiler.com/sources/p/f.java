package p;

import a2.m;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.j0;
import androidx.lifecycle.r;
import b1.o;
import com.theori.dreamdrm.R;
import f4.h;
import l1.b;
import o4.c;
import s.a;
import w4.e0;
import w4.l;
import y.j;

public final class f extends p4.f implements c {

    /* renamed from: f  reason: collision with root package name */
    public static final f f4369f = new f(9);

    /* renamed from: g  reason: collision with root package name */
    public static final f f4370g = new f(15);

    /* renamed from: h  reason: collision with root package name */
    public static final f f4371h = new f(16);

    /* renamed from: i  reason: collision with root package name */
    public static final f f4372i = new f(17);

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f4373e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i3) {
        super(1);
        this.f4373e = i3;
    }

    public final View b(View view) {
        switch (this.f4373e) {
            case 10:
                o.m(view, "currentView");
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                o.m(view, "view");
                ViewParent parent2 = view.getParent();
                if (parent2 instanceof View) {
                    return (View) parent2;
                }
                return null;
        }
    }

    public final Boolean c(Object obj) {
        switch (this.f4373e) {
            case 8:
                o.m(obj, "it");
                return Boolean.valueOf(com.bumptech.glide.c.f(obj));
            default:
                return Boolean.valueOf(obj == null);
        }
    }

    public final Double e(double d6) {
        switch (this.f4373e) {
            case 1:
                double d7 = d6 < 0.0d ? -d6 : d6;
                return Double.valueOf(Math.copySign(d7 >= 0.0031308049535603718d ? (Math.pow(d7, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d7 / 0.07739938080495357d, d6));
            case 2:
                double d8 = d6 < 0.0d ? -d6 : d6;
                return Double.valueOf(Math.copySign(d8 >= 0.04045d ? Math.pow((0.9478672985781991d * d8) + 0.05213270142180095d, 2.4d) : 0.07739938080495357d * d8, d6));
            default:
                return Double.valueOf(d6);
        }
    }

    public final Object i(Object obj) {
        h hVar = h.f2682a;
        int i3 = this.f4373e;
        switch (i3) {
            case 0:
                o.m((e) obj, "it");
                return hVar;
            case 1:
                return e(((Number) obj).doubleValue());
            case 2:
                return e(((Number) obj).doubleValue());
            case 3:
                return e(((Number) obj).doubleValue());
            case 4:
                o.m((a) obj, "$this$null");
                return hVar;
            case 5:
                j jVar = (j) obj;
                switch (i3) {
                    case 5:
                        o.m(jVar, "coordinator");
                        break;
                    default:
                        o.m(jVar, "coordinator");
                        break;
                }
                return hVar;
            case 6:
                j jVar2 = (j) obj;
                switch (i3) {
                    case 5:
                        o.m(jVar2, "coordinator");
                        break;
                    default:
                        o.m(jVar2, "coordinator");
                        break;
                }
                return hVar;
            case 7:
                m.o(obj);
                o.m((Object) null, "it");
                throw null;
            case 8:
                return c(obj);
            case 9:
                o.m((b) obj, "$this$initializer");
                return new j0();
            case 10:
                return b((View) obj);
            case 11:
                View view = (View) obj;
                o.m(view, "viewParent");
                Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof r) {
                    return (r) tag;
                }
                return null;
            case 12:
                return b((View) obj);
            case 13:
                View view2 = (View) obj;
                o.m(view2, "view");
                Object tag2 = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag2 instanceof q1.f) {
                    return (q1.f) tag2;
                }
                return null;
            case 14:
                return c(obj);
            case 15:
                String str = (String) obj;
                o.m(str, "line");
                return str;
            case 16:
                i4.f fVar = (i4.f) obj;
                if (fVar instanceof l) {
                    return (l) fVar;
                }
                return null;
            case 17:
                i4.f fVar2 = (i4.f) obj;
                if (fVar2 instanceof e0) {
                    return (e0) fVar2;
                }
                return null;
            case 18:
                return obj;
            default:
                Throwable th = (Throwable) obj;
                return null;
        }
    }
}
