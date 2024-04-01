package y0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f5779a;

    /* renamed from: b  reason: collision with root package name */
    public final o f5780b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5781c;

    public a(int i3, o oVar, int i6) {
        this.f5779a = i3;
        this.f5780b = oVar;
        this.f5781c = i6;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f5779a);
        this.f5780b.f5796a.performAction(this.f5781c, bundle);
    }
}
