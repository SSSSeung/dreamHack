package n1;

import java.io.Serializable;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4229d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f4230e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f4231f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f4232g;

    public /* synthetic */ a(int i3, int i6, Object obj, Serializable serializable) {
        this.f4229d = i6;
        this.f4232g = obj;
        this.f4230e = i3;
        this.f4231f = serializable;
    }

    public final void run() {
        int i3 = this.f4229d;
        Object obj = this.f4231f;
        int i6 = this.f4230e;
        Object obj2 = this.f4232g;
        switch (i3) {
            case 0:
                ((b) obj2).f4234b.o(i6, obj);
                return;
            default:
                ((d) obj2).o(i6, obj);
                return;
        }
    }
}
