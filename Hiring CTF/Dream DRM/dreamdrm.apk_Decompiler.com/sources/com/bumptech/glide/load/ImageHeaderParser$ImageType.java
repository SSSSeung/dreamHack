package com.bumptech.glide.load;

public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    UNKNOWN(false);
    

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1752d;

    /* access modifiers changed from: public */
    ImageHeaderParser$ImageType(boolean z5) {
        this.f1752d = z5;
    }

    public boolean hasAlpha() {
        return this.f1752d;
    }
}
