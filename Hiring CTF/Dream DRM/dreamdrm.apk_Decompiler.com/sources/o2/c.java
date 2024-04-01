package o2;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.theori.dreamdrm.R;
import java.util.ArrayList;
import l0.e;
import n2.g;

public abstract class c extends a {

    /* renamed from: d  reason: collision with root package name */
    public final View f4328d;

    /* renamed from: e  reason: collision with root package name */
    public final f f4329e;

    /* renamed from: f  reason: collision with root package name */
    public Animatable f4330f;

    public c(ImageView imageView) {
        this.f4328d = imageView;
        this.f4329e = new f(imageView);
    }

    public final void a(d dVar) {
        this.f4329e.f4333b.remove(dVar);
    }

    public final void b(Drawable drawable) {
        l((Object) null);
        ((ImageView) this.f4328d).setImageDrawable(drawable);
    }

    public final void c(n2.c cVar) {
        this.f4328d.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    public final void d(Drawable drawable) {
        l((Object) null);
        ((ImageView) this.f4328d).setImageDrawable(drawable);
    }

    public final void e() {
        Animatable animatable = this.f4330f;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final n2.c f() {
        Object tag = this.f4328d.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof n2.c) {
            return (n2.c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public final void g(d dVar) {
        f fVar = this.f4329e;
        int c6 = fVar.c();
        int b6 = fVar.b();
        boolean z5 = false;
        if (c6 > 0 || c6 == Integer.MIN_VALUE) {
            if (b6 > 0 || b6 == Integer.MIN_VALUE) {
                z5 = true;
            }
        }
        if (z5) {
            ((g) dVar).n(c6, b6);
            return;
        }
        ArrayList arrayList = fVar.f4333b;
        if (!arrayList.contains(dVar)) {
            arrayList.add(dVar);
        }
        if (fVar.f4334c == null) {
            ViewTreeObserver viewTreeObserver = fVar.f4332a.getViewTreeObserver();
            e eVar = new e(fVar);
            fVar.f4334c = eVar;
            viewTreeObserver.addOnPreDrawListener(eVar);
        }
    }

    public final void h(Drawable drawable) {
        f fVar = this.f4329e;
        ViewTreeObserver viewTreeObserver = fVar.f4332a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(fVar.f4334c);
        }
        fVar.f4334c = null;
        fVar.f4333b.clear();
        Animatable animatable = this.f4330f;
        if (animatable != null) {
            animatable.stop();
        }
        l((Object) null);
        ((ImageView) this.f4328d).setImageDrawable(drawable);
    }

    public final void i(Object obj) {
        l(obj);
    }

    public final void j() {
        Animatable animatable = this.f4330f;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void l(Object obj) {
        b bVar = (b) this;
        int i3 = bVar.f4327g;
        View view = bVar.f4328d;
        switch (i3) {
            case 0:
                ((ImageView) view).setImageBitmap((Bitmap) obj);
                break;
            default:
                ((ImageView) view).setImageDrawable((Drawable) obj);
                break;
        }
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f4330f = animatable;
            animatable.start();
            return;
        }
        this.f4330f = null;
    }

    /* renamed from: m */
    public final String toString() {
        return "Target for: " + this.f4328d;
    }
}
