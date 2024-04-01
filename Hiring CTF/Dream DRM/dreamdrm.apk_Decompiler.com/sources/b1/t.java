package b1;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

public abstract class t {
    public static CharSequence a(PrecomputedText precomputedText) {
        return precomputedText;
    }

    public static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static PrecomputedText.Params c(TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static void d(TextView textView, int i3) {
        textView.setFirstBaselineToTopHeight(i3);
    }
}
