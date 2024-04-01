package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class e0 extends ImageView {

    /* renamed from: d  reason: collision with root package name */
    public final r f549d;

    /* renamed from: e  reason: collision with root package name */
    public final d0 f550e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f551f = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e0(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        u3.a(context);
        t3.a(this, getContext());
        r rVar = new r(this);
        this.f549d = rVar;
        rVar.e(attributeSet, i3);
        d0 d0Var = new d0(this);
        this.f550e = d0Var;
        d0Var.c(attributeSet, i3);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f549d;
        if (rVar != null) {
            rVar.a();
        }
        d0 d0Var = this.f550e;
        if (d0Var != null) {
            d0Var.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f549d;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f549d;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        v3 v3Var;
        d0 d0Var = this.f550e;
        if (d0Var == null || (v3Var = (v3) d0Var.f540f) == null) {
            return null;
        }
        return (ColorStateList) v3Var.f816c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        v3 v3Var;
        d0 d0Var = this.f550e;
        if (d0Var == null || (v3Var = (v3) d0Var.f540f) == null) {
            return null;
        }
        return (PorterDuff.Mode) v3Var.f817d;
    }

    public final boolean hasOverlappingRendering() {
        return ((((ImageView) this.f550e.f539e).getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f549d;
        if (rVar != null) {
            rVar.f();
        }
    }

    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        r rVar = this.f549d;
        if (rVar != null) {
            rVar.g(i3);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        d0 d0Var = this.f550e;
        if (d0Var != null) {
            d0Var.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        d0 d0Var = this.f550e;
        if (!(d0Var == null || drawable == null || this.f551f)) {
            d0Var.f538d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (d0Var != null) {
            d0Var.a();
            if (!this.f551f) {
                ImageView imageView = (ImageView) d0Var.f539e;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(d0Var.f538d);
                }
            }
        }
    }

    public void setImageLevel(int i3) {
        super.setImageLevel(i3);
        this.f551f = true;
    }

    public void setImageResource(int i3) {
        d0 d0Var = this.f550e;
        if (d0Var != null) {
            d0Var.d(i3);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        d0 d0Var = this.f550e;
        if (d0Var != null) {
            d0Var.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f549d;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f549d;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        d0 d0Var = this.f550e;
        if (d0Var != null) {
            d0Var.e(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        d0 d0Var = this.f550e;
        if (d0Var != null) {
            d0Var.f(mode);
        }
    }
}
