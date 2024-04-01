package androidx.media;

import v1.a;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.f1404a;
        if (aVar.e(1)) {
            obj = aVar.h();
        }
        audioAttributesCompat.f1404a = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f1404a;
        aVar.i(1);
        aVar.l(audioAttributesImpl);
    }
}
