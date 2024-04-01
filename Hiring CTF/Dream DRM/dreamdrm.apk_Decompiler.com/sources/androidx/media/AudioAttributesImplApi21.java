package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f1405a;

    /* renamed from: b  reason: collision with root package name */
    public int f1406b = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f1405a.equals(((AudioAttributesImplApi21) obj).f1405a);
    }

    public final int hashCode() {
        return this.f1405a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1405a;
    }
}
