package androidx.emoji2.text;

import com.bumptech.glide.load.data.g;
import h2.j;
import h2.k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class v implements k, g {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f1052a;

    public v(int i3, ByteBuffer byteBuffer) {
        if (i3 != 2) {
            this.f1052a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
            return;
        }
        this.f1052a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public final long a(long j6) {
        ByteBuffer byteBuffer = this.f1052a;
        int min = (int) Math.min((long) byteBuffer.remaining(), j6);
        byteBuffer.position(byteBuffer.position() + min);
        return (long) min;
    }

    public final void b() {
    }

    public final int c() {
        return (e() << 8) | e();
    }

    public final Object d() {
        ByteBuffer byteBuffer = this.f1052a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    public final short e() {
        ByteBuffer byteBuffer = this.f1052a;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new j();
    }

    public final short f(int i3) {
        ByteBuffer byteBuffer = this.f1052a;
        if (byteBuffer.remaining() - i3 >= 2) {
            return byteBuffer.getShort(i3);
        }
        return -1;
    }

    public final long g() {
        return ((long) this.f1052a.getInt()) & 4294967295L;
    }

    public final void h(int i3) {
        ByteBuffer byteBuffer = this.f1052a;
        byteBuffer.position(byteBuffer.position() + i3);
    }

    public /* synthetic */ v(ByteBuffer byteBuffer) {
        this.f1052a = byteBuffer;
    }

    public v(byte[] bArr, int i3) {
        this.f1052a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i3);
    }
}
