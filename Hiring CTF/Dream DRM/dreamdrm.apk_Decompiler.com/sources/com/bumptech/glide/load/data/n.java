package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import b2.h;
import h2.w;
import java.io.InputStream;

public final class n implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1777a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1778b;

    public n(ParcelFileDescriptor parcelFileDescriptor) {
        this.f1778b = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public final ParcelFileDescriptor a() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f1778b).rewind();
    }

    public final void b() {
        switch (this.f1777a) {
            case 0:
            case 1:
                return;
            default:
                ((w) this.f1778b).e();
                return;
        }
    }

    public final Object d() {
        int i3 = this.f1777a;
        Object obj = this.f1778b;
        switch (i3) {
            case 0:
                return a();
            case 1:
                return obj;
            default:
                w wVar = (w) obj;
                wVar.reset();
                return wVar;
        }
    }

    public n(InputStream inputStream, h hVar) {
        w wVar = new w(inputStream, hVar);
        this.f1778b = wVar;
        wVar.mark(5242880);
    }

    public n(Object obj) {
        this.f1778b = obj;
    }
}
