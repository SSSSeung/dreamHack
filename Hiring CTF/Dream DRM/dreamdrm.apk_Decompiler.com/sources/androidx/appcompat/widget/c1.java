package androidx.appcompat.widget;

import android.widget.TextView;

public abstract class c1 {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i3, int i6, int i7, int i8) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i3, i6, i7, i8);
    }

    public static void c(TextView textView, int[] iArr, int i3) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
