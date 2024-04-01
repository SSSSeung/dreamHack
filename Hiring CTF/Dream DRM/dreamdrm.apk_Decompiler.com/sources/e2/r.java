package e2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.e;
import java.io.File;
import java.io.FileNotFoundException;
import y1.a;

public final class r implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f2535f = {"_data"};

    /* renamed from: d  reason: collision with root package name */
    public final Context f2536d;

    /* renamed from: e  reason: collision with root package name */
    public final Uri f2537e;

    public r(Context context, Uri uri) {
        this.f2536d = context;
        this.f2537e = uri;
    }

    public final Class a() {
        return File.class;
    }

    public final void b() {
    }

    public final a c() {
        return a.f5800d;
    }

    public final void cancel() {
    }

    public final void d(h hVar, d dVar) {
        Cursor query = this.f2536d.getContentResolver().query(this.f2537e, f2535f, (String) null, (String[]) null, (String) null);
        String str = null;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    str = query.getString(query.getColumnIndexOrThrow("_data"));
                }
            } finally {
                query.close();
            }
        }
        if (TextUtils.isEmpty(str)) {
            dVar.h(new FileNotFoundException("Failed to find file path for: " + this.f2537e));
            return;
        }
        dVar.l(new File(str));
    }
}
