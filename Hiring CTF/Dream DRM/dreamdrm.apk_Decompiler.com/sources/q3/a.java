package q3;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b1.v;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final class a extends v {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f4902g;

    /* renamed from: h  reason: collision with root package name */
    public final SideSheetBehavior f4903h;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i3) {
        this.f4902g = i3;
        this.f4903h = sideSheetBehavior;
    }

    public final int W(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f4902g) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    public final float X(int i3) {
        switch (this.f4902g) {
            case 0:
                float Z = (float) Z();
                return (((float) i3) - Z) / (((float) Y()) - Z);
            default:
                float Z2 = (float) Z();
                return (Z2 - ((float) i3)) / (Z2 - ((float) Y()));
        }
    }

    public final int Y() {
        int i3 = this.f4902g;
        SideSheetBehavior sideSheetBehavior = this.f4903h;
        switch (i3) {
            case 0:
                return Math.max(0, sideSheetBehavior.f2007n + sideSheetBehavior.f2008o);
            default:
                return Math.max(0, (Z() - sideSheetBehavior.f2005l) - sideSheetBehavior.f2008o);
        }
    }

    public final int Z() {
        int i3 = this.f4902g;
        SideSheetBehavior sideSheetBehavior = this.f4903h;
        switch (i3) {
            case 0:
                return (-sideSheetBehavior.f2005l) - sideSheetBehavior.f2008o;
            default:
                return sideSheetBehavior.f2006m;
        }
    }

    public final int a0(View view) {
        int i3 = this.f4902g;
        SideSheetBehavior sideSheetBehavior = this.f4903h;
        switch (i3) {
            case 0:
                return view.getRight() + sideSheetBehavior.f2008o;
            default:
                return view.getLeft() - sideSheetBehavior.f2008o;
        }
    }

    public final int b0(CoordinatorLayout coordinatorLayout) {
        switch (this.f4902g) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    public final int c0() {
        switch (this.f4902g) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    public final boolean d0(float f6) {
        switch (this.f4902g) {
            case 0:
                return f6 > 0.0f;
            default:
                return f6 < 0.0f;
        }
    }

    public final boolean e0(View view) {
        switch (this.f4902g) {
            case 0:
                return view.getRight() < (Y() - Z()) / 2;
            default:
                return view.getLeft() > (Y() + Z()) / 2;
        }
    }

    public final boolean f0(float f6, float f7) {
        int i3 = this.f4902g;
        SideSheetBehavior sideSheetBehavior = this.f4903h;
        switch (i3) {
            case 0:
                if (Math.abs(f6) > Math.abs(f7)) {
                    float abs = Math.abs(f6);
                    sideSheetBehavior.getClass();
                    if (abs > ((float) 500)) {
                        return true;
                    }
                }
                return false;
            default:
                if (Math.abs(f6) > Math.abs(f7)) {
                    float abs2 = Math.abs(f6);
                    sideSheetBehavior.getClass();
                    if (abs2 > ((float) 500)) {
                        return true;
                    }
                }
                return false;
        }
    }

    public final boolean g0(View view, float f6) {
        int i3 = this.f4902g;
        SideSheetBehavior sideSheetBehavior = this.f4903h;
        switch (i3) {
            case 0:
                return Math.abs((f6 * sideSheetBehavior.f2004k) + ((float) view.getLeft())) > 0.5f;
            default:
                return Math.abs((f6 * sideSheetBehavior.f2004k) + ((float) view.getRight())) > 0.5f;
        }
    }
}
