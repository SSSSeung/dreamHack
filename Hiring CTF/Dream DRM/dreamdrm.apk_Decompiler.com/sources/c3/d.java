package c3;

import android.view.View;
import androidx.activity.i;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import l0.a;
import x0.d0;
import x0.u0;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1630a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1631b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1632c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f1633d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a f1634e;

    public d(BottomSheetBehavior bottomSheetBehavior) {
        this.f1634e = bottomSheetBehavior;
        this.f1633d = new i(10, this);
    }

    public final void a(int i3) {
        int i6 = this.f1630a;
        Runnable runnable = this.f1633d;
        a aVar = this.f1634e;
        switch (i6) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) aVar;
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f1631b = i3;
                    if (!this.f1632c) {
                        WeakHashMap weakHashMap = u0.f5622a;
                        d0.m((View) bottomSheetBehavior.U.get(), runnable);
                        this.f1632c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) aVar;
                WeakReference weakReference2 = sideSheetBehavior.f2009p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f1631b = i3;
                    if (!this.f1632c) {
                        WeakHashMap weakHashMap2 = u0.f5622a;
                        d0.m((View) sideSheetBehavior.f2009p.get(), runnable);
                        this.f1632c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ d(BottomSheetBehavior bottomSheetBehavior, int i3) {
        this(bottomSheetBehavior);
    }

    public d(SideSheetBehavior sideSheetBehavior) {
        this.f1634e = sideSheetBehavior;
        this.f1633d = new androidx.activity.d(8, this);
    }
}
