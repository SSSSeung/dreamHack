package androidx.activity;

import android.window.BackEvent;
import b1.o;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final float f276a;

    /* renamed from: b  reason: collision with root package name */
    public final float f277b;

    /* renamed from: c  reason: collision with root package name */
    public final float f278c;

    /* renamed from: d  reason: collision with root package name */
    public final int f279d;

    public b(BackEvent backEvent) {
        o.m(backEvent, "backEvent");
        a aVar = a.f275a;
        float d6 = aVar.d(backEvent);
        float e6 = aVar.e(backEvent);
        float b6 = aVar.b(backEvent);
        int c6 = aVar.c(backEvent);
        this.f276a = d6;
        this.f277b = e6;
        this.f278c = b6;
        this.f279d = c6;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f276a + ", touchY=" + this.f277b + ", progress=" + this.f278c + ", swipeEdge=" + this.f279d + '}';
    }
}
