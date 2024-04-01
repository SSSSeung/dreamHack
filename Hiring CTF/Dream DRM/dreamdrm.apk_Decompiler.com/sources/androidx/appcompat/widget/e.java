package androidx.appcompat.widget;

public final class e implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f547d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f548e;

    public /* synthetic */ e(ActionBarOverlayLayout actionBarOverlayLayout, int i3) {
        this.f547d = i3;
        this.f548e = actionBarOverlayLayout;
    }

    public final void run() {
        int i3 = this.f547d;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f548e;
        switch (i3) {
            case 0:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f431z = actionBarOverlayLayout.f413g.animate().translationY(0.0f).setListener(actionBarOverlayLayout.A);
                return;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f431z = actionBarOverlayLayout.f413g.animate().translationY((float) (-actionBarOverlayLayout.f413g.getHeight())).setListener(actionBarOverlayLayout.A);
                return;
        }
    }
}
