package z1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

public final class b implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f5924b = {"_data"};

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f5925a;

    public b(ContentResolver contentResolver) {
        this.f5925a = contentResolver;
    }

    public final Cursor a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f5925a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f5924b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
    }
}
