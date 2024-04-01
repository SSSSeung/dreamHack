package g;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import h.f0;

public final class i extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2729a;

    /* renamed from: b  reason: collision with root package name */
    public final c f2730b;

    public i(Context context, c cVar) {
        this.f2729a = context;
        this.f2730b = cVar;
    }

    public final void finish() {
        this.f2730b.a();
    }

    public final View getCustomView() {
        return this.f2730b.b();
    }

    public final Menu getMenu() {
        return new f0(this.f2729a, this.f2730b.e());
    }

    public final MenuInflater getMenuInflater() {
        return this.f2730b.f();
    }

    public final CharSequence getSubtitle() {
        return this.f2730b.g();
    }

    public final Object getTag() {
        return this.f2730b.f2710d;
    }

    public final CharSequence getTitle() {
        return this.f2730b.h();
    }

    public final boolean getTitleOptionalHint() {
        return this.f2730b.f2711e;
    }

    public final void invalidate() {
        this.f2730b.i();
    }

    public final boolean isTitleOptional() {
        return this.f2730b.j();
    }

    public final void setCustomView(View view) {
        this.f2730b.k(view);
    }

    public final void setSubtitle(int i3) {
        this.f2730b.l(i3);
    }

    public final void setTag(Object obj) {
        this.f2730b.f2710d = obj;
    }

    public final void setTitle(int i3) {
        this.f2730b.n(i3);
    }

    public final void setTitleOptionalHint(boolean z5) {
        this.f2730b.p(z5);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f2730b.m(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f2730b.o(charSequence);
    }
}
