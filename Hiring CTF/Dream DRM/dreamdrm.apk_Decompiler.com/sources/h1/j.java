package h1;

import android.widget.EditText;
import java.lang.ref.WeakReference;

public final class j extends androidx.emoji2.text.j {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f3374a;

    public j(EditText editText) {
        this.f3374a = new WeakReference(editText);
    }

    public final void a() {
        k.a((EditText) this.f3374a.get(), 1);
    }
}
