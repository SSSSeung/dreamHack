package s3;

import android.widget.AutoCompleteTextView;

public final /* synthetic */ class j implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f4972a;

    public /* synthetic */ j(k kVar) {
        this.f4972a = kVar;
    }

    public final void onDismiss() {
        k kVar = this.f4972a;
        kVar.f4981m = true;
        kVar.f4983o = System.currentTimeMillis();
        kVar.t(false);
    }
}
