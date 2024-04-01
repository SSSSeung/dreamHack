package x0;

import android.view.View;

public final class z extends b0 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f5645e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(int i3, int i6) {
        super(i3, Boolean.class, 0, 28);
        this.f5645e = i6;
    }

    public final Boolean d(View view) {
        switch (this.f5645e) {
            case 0:
                return Boolean.valueOf(n0.d(view));
            default:
                return Boolean.valueOf(n0.c(view));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i3, int i6, int i7, int i8) {
        super(i3, CharSequence.class, i6, i7);
        this.f5645e = i8;
    }
}
