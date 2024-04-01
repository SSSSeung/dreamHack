package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.compose.ui.platform.e;
import d.a;
import e.n0;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f512a;

    /* renamed from: b  reason: collision with root package name */
    public final n0 f513b;

    public b0(TextView textView) {
        this.f512a = textView;
        this.f513b = new n0(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((e) this.f513b.f2403e).p(inputFilterArr);
    }

    /* JADX INFO: finally extract failed */
    public final void b(AttributeSet attributeSet, int i3) {
        TypedArray obtainStyledAttributes = this.f512a.getContext().obtainStyledAttributes(attributeSet, a.f2121i, i3, 0);
        try {
            boolean z5 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z5 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z5);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z5) {
        ((e) this.f513b.f2403e).x(z5);
    }

    public final void d(boolean z5) {
        ((e) this.f513b.f2403e).A(z5);
    }
}
