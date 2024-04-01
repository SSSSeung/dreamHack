package androidx.appcompat.widget;

public final class y2 {

    /* renamed from: a  reason: collision with root package name */
    public int f856a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f857b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f858c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f859d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f860e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f861f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f862g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f863h = false;

    public final void a(int i3, int i6) {
        this.f858c = i3;
        this.f859d = i6;
        this.f863h = true;
        if (this.f862g) {
            if (i6 != Integer.MIN_VALUE) {
                this.f856a = i6;
            }
            if (i3 != Integer.MIN_VALUE) {
                this.f857b = i3;
                return;
            }
            return;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f856a = i3;
        }
        if (i6 != Integer.MIN_VALUE) {
            this.f857b = i6;
        }
    }
}
