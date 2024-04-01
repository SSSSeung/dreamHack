package g0;

public final class h implements Comparable {

    /* renamed from: d  reason: collision with root package name */
    public j f2811d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ i f2812e;

    public h(i iVar) {
        this.f2812e = iVar;
    }

    public final int compareTo(Object obj) {
        return this.f2811d.f2818b - ((j) obj).f2818b;
    }

    public final String toString() {
        String str = "[ ";
        if (this.f2811d != null) {
            for (int i3 = 0; i3 < 9; i3++) {
                str = str + this.f2811d.f2824h[i3] + " ";
            }
        }
        return str + "] " + this.f2811d;
    }
}
