package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.platform.e;
import java.util.stream.IntStream;

public final class b0 implements Spannable {

    /* renamed from: d  reason: collision with root package name */
    public boolean f1001d = false;

    /* renamed from: e  reason: collision with root package name */
    public Spannable f1002e;

    public b0(Spannable spannable) {
        this.f1002e = spannable;
    }

    public final void a() {
        Spannable spannable = this.f1002e;
        if (!this.f1001d) {
            if ((Build.VERSION.SDK_INT < 28 ? new e(22) : new a0()).v(spannable)) {
                this.f1002e = new SpannableString(spannable);
            }
        }
        this.f1001d = true;
    }

    public final char charAt(int i3) {
        return this.f1002e.charAt(i3);
    }

    public final IntStream chars() {
        return this.f1002e.chars();
    }

    public final IntStream codePoints() {
        return this.f1002e.codePoints();
    }

    public final int getSpanEnd(Object obj) {
        return this.f1002e.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        return this.f1002e.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        return this.f1002e.getSpanStart(obj);
    }

    public final Object[] getSpans(int i3, int i6, Class cls) {
        return this.f1002e.getSpans(i3, i6, cls);
    }

    public final int length() {
        return this.f1002e.length();
    }

    public final int nextSpanTransition(int i3, int i6, Class cls) {
        return this.f1002e.nextSpanTransition(i3, i6, cls);
    }

    public final void removeSpan(Object obj) {
        a();
        this.f1002e.removeSpan(obj);
    }

    public final void setSpan(Object obj, int i3, int i6, int i7) {
        a();
        this.f1002e.setSpan(obj, i3, i6, i7);
    }

    public final CharSequence subSequence(int i3, int i6) {
        return this.f1002e.subSequence(i3, i6);
    }

    public final String toString() {
        return this.f1002e.toString();
    }

    public b0(CharSequence charSequence) {
        this.f1002e = new SpannableString(charSequence);
    }
}
