package h1;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.j;
import androidx.emoji2.text.l;
import java.lang.ref.WeakReference;

public final class e extends j {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f3364a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f3365b;

    public e(TextView textView, f fVar) {
        this.f3364a = new WeakReference(textView);
        this.f3365b = new WeakReference(fVar);
    }

    public final void a() {
        boolean z5;
        int i3;
        InputFilter[] filters;
        TextView textView = (TextView) this.f3364a.get();
        InputFilter inputFilter = (InputFilter) this.f3365b.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            int i6 = 0;
            while (true) {
                if (i6 >= filters.length) {
                    break;
                } else if (filters[i6] == inputFilter) {
                    z5 = true;
                    break;
                } else {
                    i6++;
                }
            }
        }
        z5 = false;
        if (z5 && textView.isAttachedToWindow()) {
            CharSequence text = textView.getText();
            l a6 = l.a();
            if (text == null) {
                i3 = 0;
            } else {
                a6.getClass();
                i3 = text.length();
            }
            CharSequence f6 = a6.f(0, i3, text);
            if (text != f6) {
                int selectionStart = Selection.getSelectionStart(f6);
                int selectionEnd = Selection.getSelectionEnd(f6);
                textView.setText(f6);
                if (f6 instanceof Spannable) {
                    Spannable spannable = (Spannable) f6;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }
}
