package android.support.v4.media;

import a.e;
import android.os.Bundle;
import android.os.Parcelable;
import w4.p;

class MediaBrowserCompat$ItemReceiver extends e {
    public final void a(int i3, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(p.class.getClassLoader());
        }
        if (i3 != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) parcelable;
            throw null;
        }
        throw null;
    }
}
