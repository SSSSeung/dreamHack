package f2;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import e.b0;
import java.io.InputStream;

public final class b extends b0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, int i3) {
        super(context, ParcelFileDescriptor.class);
        if (i3 != 1) {
        } else {
            super(context, InputStream.class);
        }
    }
}
