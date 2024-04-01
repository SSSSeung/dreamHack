package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

public final class w0 extends Transition.EpicenterCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1311a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Rect f1312b;

    public /* synthetic */ w0(Rect rect, int i3) {
        this.f1311a = i3;
        this.f1312b = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        int i3 = this.f1311a;
        Rect rect = this.f1312b;
        switch (i3) {
            case 0:
                return rect;
            default:
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
