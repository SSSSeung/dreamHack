package h1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.compose.ui.platform.e;
import androidx.emoji2.text.l;

public final class i extends e {

    /* renamed from: o  reason: collision with root package name */
    public final h f3373o;

    public i(TextView textView) {
        super(27);
        this.f3373o = new h(textView);
    }

    public final void A(boolean z5) {
        boolean z6 = !(l.f1012j != null);
        h hVar = this.f3373o;
        if (z6) {
            hVar.f3372q = z5;
        } else {
            hVar.A(z5);
        }
    }

    public final InputFilter[] p(InputFilter[] inputFilterArr) {
        return (l.f1012j != null) ^ true ? inputFilterArr : this.f3373o.p(inputFilterArr);
    }

    public final void x(boolean z5) {
        if (!(!(l.f1012j != null))) {
            this.f3373o.x(z5);
        }
    }
}
