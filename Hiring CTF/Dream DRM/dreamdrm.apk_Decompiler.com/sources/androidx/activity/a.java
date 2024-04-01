package androidx.activity;

import android.window.BackEvent;
import b1.o;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f275a = new a();

    public final BackEvent a(float f6, float f7, float f8, int i3) {
        return new BackEvent(f6, f7, f8, i3);
    }

    public final float b(BackEvent backEvent) {
        o.m(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        o.m(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        o.m(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        o.m(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
