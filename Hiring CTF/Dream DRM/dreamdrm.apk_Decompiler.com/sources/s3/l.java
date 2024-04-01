package s3;

import android.text.Editable;
import k3.j;

public final class l extends j {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n f4987d;

    public l(n nVar) {
        this.f4987d = nVar;
    }

    public final void afterTextChanged(Editable editable) {
        this.f4987d.b().a();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i3, int i6, int i7) {
        this.f4987d.b().b();
    }
}
