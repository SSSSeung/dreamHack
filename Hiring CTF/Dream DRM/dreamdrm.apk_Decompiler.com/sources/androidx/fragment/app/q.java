package androidx.fragment.app;

public class q extends RuntimeException {
    public q() {
        super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }

    public /* synthetic */ q(int i3) {
    }

    public /* synthetic */ q(String str) {
        super(str);
    }

    public /* synthetic */ q(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ q(Throwable th) {
        super(th);
    }
}
