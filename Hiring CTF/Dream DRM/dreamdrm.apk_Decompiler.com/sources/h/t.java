package h;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import g.d;

public final class t extends FrameLayout implements d {

    /* renamed from: d  reason: collision with root package name */
    public final CollapsibleActionView f3224d;

    public t(View view) {
        super(view.getContext());
        this.f3224d = (CollapsibleActionView) view;
        addView(view);
    }

    public final void c() {
        this.f3224d.onActionViewExpanded();
    }

    public final void e() {
        this.f3224d.onActionViewCollapsed();
    }
}
