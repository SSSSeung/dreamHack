package b2;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1545a;

    public /* synthetic */ e(int i3) {
        this.f1545a = i3;
    }

    public final int a(Object obj) {
        switch (this.f1545a) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    public final String b() {
        switch (this.f1545a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }
}
