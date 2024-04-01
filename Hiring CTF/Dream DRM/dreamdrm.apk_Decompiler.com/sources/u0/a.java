package u0;

import a3.c;
import android.graphics.Typeface;
import android.os.Handler;
import android.view.View;
import b1.v;
import e.n0;
import java.util.concurrent.Callable;

public final class a implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5237d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f5238e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f5239f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f5240g;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i3) {
        this.f5237d = i3;
        this.f5240g = obj;
        this.f5238e = obj2;
        this.f5239f = obj3;
    }

    public final void run() {
        Object obj;
        int i3 = this.f5237d;
        Object obj2 = this.f5240g;
        Object obj3 = this.f5239f;
        Object obj4 = this.f5238e;
        switch (i3) {
            case 0:
                Typeface typeface = (Typeface) obj3;
                v vVar = (v) ((n0) obj4).f2403e;
                if (vVar != null) {
                    vVar.I(typeface);
                    return;
                }
                return;
            case 1:
                ((d) ((w0.a) obj4)).a(obj3);
                return;
            case 2:
                try {
                    obj = ((Callable) obj4).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) obj2).post(new a(this, (w0.a) obj3, obj, 1));
                return;
            default:
                if (((View) obj3) != null) {
                    ((c) obj2).getClass();
                    return;
                }
                return;
        }
    }
}
