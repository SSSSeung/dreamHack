package g1;

import androidx.compose.ui.platform.e;
import java.nio.ByteBuffer;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public int f2840a;

    /* renamed from: b  reason: collision with root package name */
    public int f2841b;

    /* renamed from: c  reason: collision with root package name */
    public int f2842c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2843d;

    public c() {
        if (e.f887d == null) {
            e.f887d = new e();
        }
    }

    public final int a(int i3) {
        if (i3 < this.f2842c) {
            return ((ByteBuffer) this.f2843d).getShort(this.f2841b + i3);
        }
        return 0;
    }

    public final void b(int i3, ByteBuffer byteBuffer) {
        short s5;
        this.f2843d = byteBuffer;
        if (byteBuffer != null) {
            this.f2840a = i3;
            int i6 = i3 - byteBuffer.getInt(i3);
            this.f2841b = i6;
            s5 = ((ByteBuffer) this.f2843d).getShort(i6);
        } else {
            s5 = 0;
            this.f2840a = 0;
            this.f2841b = 0;
        }
        this.f2842c = s5;
    }
}
