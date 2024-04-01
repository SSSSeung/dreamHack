package androidx.fragment.app;

import java.util.ArrayList;

public final class f implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1134d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f1135e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f1136f;

    public /* synthetic */ f(Object obj, int i3, Object obj2) {
        this.f1134d = i3;
        this.f1135e = obj;
        this.f1136f = obj2;
    }

    public final void run() {
        int i3 = this.f1134d;
        Object obj = this.f1136f;
        switch (i3) {
            case 0:
                v0.b((ArrayList) obj, 4);
                return;
            case 1:
                ((h) obj).b();
                return;
            default:
                ((h1) obj).c();
                return;
        }
    }
}
