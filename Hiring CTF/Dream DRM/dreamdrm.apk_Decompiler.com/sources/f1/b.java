package f1;

import android.graphics.Rect;
import androidx.compose.ui.platform.e;
import java.util.Comparator;
import y0.o;

public final class b implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f2611a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public final Rect f2612b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2613c;

    /* renamed from: d  reason: collision with root package name */
    public final e f2614d;

    public b(boolean z5, e eVar) {
        this.f2613c = z5;
        this.f2614d = eVar;
    }

    public final int compare(Object obj, Object obj2) {
        this.f2614d.getClass();
        Rect rect = this.f2611a;
        ((o) obj).f(rect);
        Rect rect2 = this.f2612b;
        ((o) obj2).f(rect2);
        int i3 = rect.top;
        int i6 = rect2.top;
        if (i3 < i6) {
            return -1;
        }
        if (i3 > i6) {
            return 1;
        }
        int i7 = rect.left;
        int i8 = rect2.left;
        boolean z5 = this.f2613c;
        if (i7 < i8) {
            return z5 ? 1 : -1;
        }
        if (i7 > i8) {
            return z5 ? -1 : 1;
        }
        int i9 = rect.bottom;
        int i10 = rect2.bottom;
        if (i9 < i10) {
            return -1;
        }
        if (i9 > i10) {
            return 1;
        }
        int i11 = rect.right;
        int i12 = rect2.right;
        if (i11 < i12) {
            return z5 ? 1 : -1;
        }
        if (i11 > i12) {
            return z5 ? -1 : 1;
        }
        return 0;
    }
}
