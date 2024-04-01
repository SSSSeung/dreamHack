package androidx.appcompat.widget;

import android.view.View;
import x0.h1;

public final class a implements h1 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f499a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f500b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f501c;

    public a(ActionBarContextView actionBarContextView) {
        this.f501c = actionBarContextView;
    }

    public final void a() {
        if (!this.f499a) {
            ActionBarContextView actionBarContextView = this.f501c;
            actionBarContextView.f396i = null;
            a.super.setVisibility(this.f500b);
        }
    }

    public final void b(View view) {
        this.f499a = true;
    }

    public final void c() {
        a.super.setVisibility(0);
        this.f499a = false;
    }
}
