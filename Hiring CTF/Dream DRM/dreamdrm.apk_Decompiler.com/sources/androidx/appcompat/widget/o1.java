package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.widget.TextView;

public final class o1 extends m1 {
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
