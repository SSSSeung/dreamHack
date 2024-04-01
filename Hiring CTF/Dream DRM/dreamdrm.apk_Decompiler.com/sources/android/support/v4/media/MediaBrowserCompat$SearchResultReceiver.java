package android.support.v4.media;

import a.e;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import w4.p;

class MediaBrowserCompat$SearchResultReceiver extends e {
    public final void a(int i3, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(p.class.getClassLoader());
        }
        if (i3 != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        if (parcelableArray != null) {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
        }
        throw null;
    }
}
