package j2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import b1.o;
import java.util.ArrayList;
import x1.e;

public final class c extends Drawable implements f, Animatable {

    /* renamed from: d  reason: collision with root package name */
    public final b f3798d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3799e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3800f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3801g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3802h = true;

    /* renamed from: i  reason: collision with root package name */
    public int f3803i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3804j = -1;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3805k;

    /* renamed from: l  reason: collision with root package name */
    public Paint f3806l;

    /* renamed from: m  reason: collision with root package name */
    public Rect f3807m;

    public c(b bVar) {
        o.i(bVar);
        this.f3798d = bVar;
    }

    public final void a() {
        o.h("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f3801g);
        h hVar = this.f3798d.f3797a;
        if (((e) hVar.f3818a).f5700l.f5676c != 1) {
            if (!this.f3799e) {
                this.f3799e = true;
                if (!hVar.f3827j) {
                    ArrayList arrayList = hVar.f3820c;
                    if (!arrayList.contains(this)) {
                        boolean isEmpty = arrayList.isEmpty();
                        arrayList.add(this);
                        if (isEmpty && !hVar.f3823f) {
                            hVar.f3823f = true;
                            hVar.f3827j = false;
                            hVar.a();
                        }
                    } else {
                        throw new IllegalStateException("Cannot subscribe twice in a row");
                    }
                } else {
                    throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
                }
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        if (!this.f3801g) {
            if (this.f3805k) {
                int intrinsicWidth = getIntrinsicWidth();
                int intrinsicHeight = getIntrinsicHeight();
                Rect bounds = getBounds();
                if (this.f3807m == null) {
                    this.f3807m = new Rect();
                }
                Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f3807m);
                this.f3805k = false;
            }
            h hVar = this.f3798d.f3797a;
            e eVar = hVar.f3826i;
            Bitmap bitmap = eVar != null ? eVar.f3815j : hVar.f3829l;
            if (this.f3807m == null) {
                this.f3807m = new Rect();
            }
            Rect rect = this.f3807m;
            if (this.f3806l == null) {
                this.f3806l = new Paint(2);
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.f3806l);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f3798d;
    }

    public final int getIntrinsicHeight() {
        return this.f3798d.f3797a.f3833p;
    }

    public final int getIntrinsicWidth() {
        return this.f3798d.f3797a.f3832o;
    }

    public final int getOpacity() {
        return -2;
    }

    public final boolean isRunning() {
        return this.f3799e;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3805k = true;
    }

    public final void setAlpha(int i3) {
        if (this.f3806l == null) {
            this.f3806l = new Paint(2);
        }
        this.f3806l.setAlpha(i3);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f3806l == null) {
            this.f3806l = new Paint(2);
        }
        this.f3806l.setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z5, boolean z6) {
        o.h("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f3801g);
        this.f3802h = z5;
        if (!z5) {
            this.f3799e = false;
            h hVar = this.f3798d.f3797a;
            ArrayList arrayList = hVar.f3820c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                hVar.f3823f = false;
            }
        } else if (this.f3800f) {
            a();
        }
        return super.setVisible(z5, z6);
    }

    public final void start() {
        this.f3800f = true;
        this.f3803i = 0;
        if (this.f3802h) {
            a();
        }
    }

    public final void stop() {
        this.f3800f = false;
        this.f3799e = false;
        h hVar = this.f3798d.f3797a;
        ArrayList arrayList = hVar.f3820c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            hVar.f3823f = false;
        }
    }
}
