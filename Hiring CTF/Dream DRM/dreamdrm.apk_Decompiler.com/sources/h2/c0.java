package h2;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import y1.g;

public final class c0 implements g {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3389d;

    /* renamed from: e  reason: collision with root package name */
    public final ByteBuffer f3390e;

    public c0(int i3) {
        this.f3389d = i3;
        if (i3 != 1) {
            this.f3390e = ByteBuffer.allocate(8);
        } else {
            this.f3390e = ByteBuffer.allocate(4);
        }
    }

    public final void e(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f3389d) {
            case 0:
                Long l6 = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.f3390e) {
                    this.f3390e.position(0);
                    messageDigest.update(this.f3390e.putLong(l6.longValue()).array());
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num != null) {
                    messageDigest.update(bArr);
                    synchronized (this.f3390e) {
                        this.f3390e.position(0);
                        messageDigest.update(this.f3390e.putInt(num.intValue()).array());
                    }
                    return;
                }
                return;
        }
    }
}
