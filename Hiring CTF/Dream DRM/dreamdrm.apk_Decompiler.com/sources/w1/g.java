package w1;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

public final class g extends ByteArrayOutputStream {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h f5459d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar, int i3) {
        super(i3);
        this.f5459d = hVar;
    }

    public final String toString() {
        int i3 = this.count;
        if (i3 > 0 && this.buf[i3 - 1] == 13) {
            i3--;
        }
        try {
            return new String(this.buf, 0, i3, this.f5459d.f5461e.name());
        } catch (UnsupportedEncodingException e6) {
            throw new AssertionError(e6);
        }
    }
}
