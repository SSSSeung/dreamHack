package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import androidx.emoji2.text.v;
import java.nio.ByteBuffer;

public final class h implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1763a;

    public /* synthetic */ h(int i3) {
        this.f1763a = i3;
    }

    public final Class a() {
        switch (this.f1763a) {
            case 0:
                throw new UnsupportedOperationException("Not implemented");
            case 1:
                return ParcelFileDescriptor.class;
            default:
                return ByteBuffer.class;
        }
    }

    public final g b(Object obj) {
        switch (this.f1763a) {
            case 0:
                return new n(obj);
            case 1:
                return new n((ParcelFileDescriptor) obj);
            default:
                return new v((ByteBuffer) obj);
        }
    }
}
