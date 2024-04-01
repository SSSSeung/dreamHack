package androidx.media;

import v1.a;

public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f1407a = aVar.f(audioAttributesImplBase.f1407a, 1);
        audioAttributesImplBase.f1408b = aVar.f(audioAttributesImplBase.f1408b, 2);
        audioAttributesImplBase.f1409c = aVar.f(audioAttributesImplBase.f1409c, 3);
        audioAttributesImplBase.f1410d = aVar.f(audioAttributesImplBase.f1410d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.f1407a, 1);
        aVar.j(audioAttributesImplBase.f1408b, 2);
        aVar.j(audioAttributesImplBase.f1409c, 3);
        aVar.j(audioAttributesImplBase.f1410d, 4);
    }
}
