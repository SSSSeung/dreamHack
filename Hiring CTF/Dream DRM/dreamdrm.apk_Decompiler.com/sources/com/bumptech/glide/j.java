package com.bumptech.glide;

import java.util.List;

public final class j extends i {
    public j() {
        super("Failed to find image header parser.");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(int i3, Class cls) {
        super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        if (i3 != 3) {
            return;
        }
        super("Failed to find source encoder for data class: " + cls);
    }

    public j(Class cls, Class cls2) {
        super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
    }

    public j(Object obj) {
        super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
    }

    public j(Object obj, List list) {
        super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
    }
}
