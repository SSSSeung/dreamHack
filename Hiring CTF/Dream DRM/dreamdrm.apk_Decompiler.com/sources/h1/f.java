package h1;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.l;

public final class f implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f3366a;

    /* renamed from: b  reason: collision with root package name */
    public e f3367b;

    public f(TextView textView) {
        this.f3366a = textView;
    }

    public final CharSequence filter(CharSequence charSequence, int i3, int i6, Spanned spanned, int i7, int i8) {
        TextView textView = this.f3366a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b6 = l.a().b();
        if (b6 != 0) {
            boolean z5 = true;
            if (b6 == 1) {
                if (i8 == 0 && i7 == 0 && spanned.length() == 0 && charSequence == textView.getText()) {
                    z5 = false;
                }
                if (!z5 || charSequence == null) {
                    return charSequence;
                }
                if (!(i3 == 0 && i6 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i3, i6);
                }
                return l.a().f(0, charSequence.length(), charSequence);
            } else if (b6 != 3) {
                return charSequence;
            }
        }
        l a6 = l.a();
        if (this.f3367b == null) {
            this.f3367b = new e(textView, this);
        }
        a6.g(this.f3367b);
        return charSequence;
    }
}
