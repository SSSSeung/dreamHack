package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

final class ParcelFileDescriptorRewinder$InternalRewinder {

    /* renamed from: a  reason: collision with root package name */
    public final ParcelFileDescriptor f1753a;

    public ParcelFileDescriptorRewinder$InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f1753a = parcelFileDescriptor;
    }

    public ParcelFileDescriptor rewind() {
        ParcelFileDescriptor parcelFileDescriptor = this.f1753a;
        try {
            Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0, OsConstants.SEEK_SET);
            return parcelFileDescriptor;
        } catch (ErrnoException e6) {
            throw new IOException(e6);
        }
    }
}
