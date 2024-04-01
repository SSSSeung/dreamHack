package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

public final class x implements TextWatcher, SpanWatcher {

    /* renamed from: d  reason: collision with root package name */
    public final Object f1055d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicInteger f1056e = new AtomicInteger(0);

    public x(Object obj) {
        this.f1055d = obj;
    }

    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f1055d).afterTextChanged(editable);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i3, int i6, int i7) {
        ((TextWatcher) this.f1055d).beforeTextChanged(charSequence, i3, i6, i7);
    }

    public final void onSpanAdded(Spannable spannable, Object obj, int i3, int i6) {
        if (this.f1056e.get() <= 0 || !(obj instanceof z)) {
            ((SpanWatcher) this.f1055d).onSpanAdded(spannable, obj, i3, i6);
        }
    }

    public final void onSpanChanged(Spannable spannable, Object obj, int i3, int i6, int i7, int i8) {
        int i9;
        int i10;
        if (this.f1056e.get() <= 0 || !(obj instanceof z)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i3 > i6) {
                    i3 = 0;
                }
                if (i7 > i8) {
                    i10 = i3;
                    i9 = 0;
                    ((SpanWatcher) this.f1055d).onSpanChanged(spannable, obj, i10, i6, i9, i8);
                }
            }
            i10 = i3;
            i9 = i7;
            ((SpanWatcher) this.f1055d).onSpanChanged(spannable, obj, i10, i6, i9, i8);
        }
    }

    public final void onSpanRemoved(Spannable spannable, Object obj, int i3, int i6) {
        if (this.f1056e.get() <= 0 || !(obj instanceof z)) {
            ((SpanWatcher) this.f1055d).onSpanRemoved(spannable, obj, i3, i6);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i3, int i6, int i7) {
        ((TextWatcher) this.f1055d).onTextChanged(charSequence, i3, i6, i7);
    }
}
