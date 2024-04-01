package f1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import e.n0;
import g3.d;
import java.util.WeakHashMap;
import x0.d0;
import x0.u0;
import y0.o;

public final class a extends n0 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d f2610f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(d dVar) {
        super(15);
        this.f2610f = dVar;
    }

    public final o E(int i3) {
        d dVar = this.f2610f;
        int i6 = i3 == 2 ? dVar.f2866k : dVar.f2867l;
        if (i6 == Integer.MIN_VALUE) {
            return null;
        }
        return x(i6);
    }

    public final boolean F(int i3, int i6, Bundle bundle) {
        int i7;
        d dVar = this.f2610f;
        View view = dVar.f2864i;
        if (i3 != -1) {
            boolean z5 = true;
            if (i6 == 1) {
                return dVar.p(i3);
            }
            if (i6 == 2) {
                return dVar.j(i3);
            }
            boolean z6 = false;
            if (i6 == 64) {
                AccessibilityManager accessibilityManager = dVar.f2863h;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i7 = dVar.f2866k) != i3) {
                    if (i7 != Integer.MIN_VALUE) {
                        dVar.f2866k = Integer.MIN_VALUE;
                        dVar.f2864i.invalidate();
                        dVar.q(i7, 65536);
                    }
                    dVar.f2866k = i3;
                    view.invalidate();
                    dVar.q(i3, 32768);
                    return z5;
                }
            } else if (i6 != 128) {
                if (i6 == 16) {
                    Chip chip = dVar.f2869n;
                    if (i3 == 0) {
                        return chip.performClick();
                    }
                    if (i3 == 1) {
                        chip.playSoundEffect(0);
                        View.OnClickListener onClickListener = chip.f1895k;
                        if (onClickListener != null) {
                            onClickListener.onClick(chip);
                            z6 = true;
                        }
                        if (chip.f1906v) {
                            chip.f1905u.q(1, 1);
                        }
                    }
                }
                return z6;
            } else if (dVar.f2866k == i3) {
                dVar.f2866k = Integer.MIN_VALUE;
                view.invalidate();
                dVar.q(i3, 65536);
                return z5;
            }
            z5 = false;
            return z5;
        }
        WeakHashMap weakHashMap = u0.f5622a;
        return d0.j(view, i6, bundle);
    }

    public final o x(int i3) {
        return new o(AccessibilityNodeInfo.obtain(this.f2610f.n(i3).f5796a));
    }
}
