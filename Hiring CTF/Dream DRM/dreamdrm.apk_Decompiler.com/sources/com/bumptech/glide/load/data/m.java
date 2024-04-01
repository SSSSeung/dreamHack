package com.bumptech.glide.load.data;

import b2.h;
import java.io.InputStream;

public final class m implements f {

    /* renamed from: a  reason: collision with root package name */
    public final h f1776a;

    public m(h hVar) {
        this.f1776a = hVar;
    }

    public final Class a() {
        return InputStream.class;
    }

    public final g b(Object obj) {
        return new n((InputStream) obj, this.f1776a);
    }
}
