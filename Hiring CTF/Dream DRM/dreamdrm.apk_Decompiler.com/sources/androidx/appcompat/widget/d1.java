package androidx.appcompat.widget;

import android.graphics.ImageDecoder;
import android.text.PrecomputedText;
import android.text.Spannable;

public abstract /* synthetic */ class d1 {
    public static /* bridge */ /* synthetic */ ImageDecoder.Source f(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ void w(Object obj) {
        ImageDecoder.Source source = (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ boolean x(Spannable spannable) {
        return spannable instanceof PrecomputedText;
    }
}
