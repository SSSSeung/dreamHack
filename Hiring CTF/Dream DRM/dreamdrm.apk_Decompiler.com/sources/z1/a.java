package z1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

public final class a implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f5922b = {"_data"};

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f5923a;

    public a(ContentResolver contentResolver) {
        this.f5923a = contentResolver;
    }

    public final Cursor a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f5923a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f5922b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
    }
}
