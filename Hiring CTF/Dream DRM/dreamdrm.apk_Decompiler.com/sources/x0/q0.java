package x0;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import androidx.compose.ui.platform.d;
import e.n0;
import java.util.Objects;

public abstract class q0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static h b(View view, h hVar) {
        ContentInfo n5 = hVar.f5570a.n();
        Objects.requireNonNull(n5);
        ContentInfo j6 = d.j(n5);
        ContentInfo i3 = view.performReceiveContent(j6);
        if (i3 == null) {
            return null;
        }
        return i3 == j6 ? hVar : new h(new n0(i3));
    }

    public static void c(View view, String[] strArr, t tVar) {
        if (tVar == null) {
            view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
        } else {
            view.setOnReceiveContentListener(strArr, new r0(tVar));
        }
    }
}
