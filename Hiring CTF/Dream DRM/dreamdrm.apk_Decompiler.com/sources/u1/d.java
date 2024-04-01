package u1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bumptech.glide.c;
import f.a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p0.i;
import r0.b;
import w4.p;

public final class d extends e implements Animatable {

    /* renamed from: e  reason: collision with root package name */
    public final b f5268e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f5269f;

    /* renamed from: g  reason: collision with root package name */
    public androidx.appcompat.widget.d f5270g = null;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f5271h = null;

    /* renamed from: i  reason: collision with root package name */
    public final a f5272i;

    public d(Context context) {
        a aVar = new a(this);
        this.f5272i = aVar;
        this.f5269f = context;
        this.f5268e = new b(aVar);
    }

    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            b.a(drawable, theme);
        }
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            return b.b(drawable);
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f5268e;
        bVar.f5263a.draw(canvas);
        if (bVar.f5264b.isStarted()) {
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.f5273d;
        return drawable != null ? r0.a.a(drawable) : this.f5268e.f5263a.getAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f5268e.getClass();
        return changingConfigurations | 0;
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f5273d;
        return drawable != null ? b.c(drawable) : this.f5268e.f5263a.getColorFilter();
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f5273d != null) {
            return new c(this.f5273d.getConstantState());
        }
        return null;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f5273d;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f5268e.f5263a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f5273d;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f5268e.f5263a.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.f5273d;
        return drawable != null ? drawable.getOpacity() : this.f5268e.f5263a.getOpacity();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f5273d;
        return drawable != null ? r0.a.d(drawable) : this.f5268e.f5263a.isAutoMirrored();
    }

    public final boolean isRunning() {
        Drawable drawable = this.f5273d;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f5268e.f5264b.isRunning();
    }

    public final boolean isStateful() {
        Drawable drawable = this.f5273d;
        return drawable != null ? drawable.isStateful() : this.f5268e.f5263a.isStateful();
    }

    public final Drawable mutate() {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f5268e.f5263a.setBounds(rect);
        }
    }

    public final boolean onLevelChange(int i3) {
        Drawable drawable = this.f5273d;
        return drawable != null ? drawable.setLevel(i3) : this.f5268e.f5263a.setLevel(i3);
    }

    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f5273d;
        return drawable != null ? drawable.setState(iArr) : this.f5268e.f5263a.setState(iArr);
    }

    public final void setAlpha(int i3) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            drawable.setAlpha(i3);
        } else {
            this.f5268e.f5263a.setAlpha(i3);
        }
    }

    public final void setAutoMirrored(boolean z5) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            r0.a.e(drawable, z5);
        } else {
            this.f5268e.f5263a.setAutoMirrored(z5);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f5268e.f5263a.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i3) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            c.G(drawable, i3);
        } else {
            this.f5268e.f5263a.setTint(i3);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            c.H(drawable, colorStateList);
        } else {
            this.f5268e.f5263a.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            c.I(drawable, mode);
        } else {
            this.f5268e.f5263a.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z5, boolean z6) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            return drawable.setVisible(z5, z6);
        }
        this.f5268e.f5263a.setVisible(z5, z6);
        return super.setVisible(z5, z6);
    }

    public final void start() {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f5268e;
        if (!bVar.f5264b.isStarted()) {
            bVar.f5264b.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f5268e.f5264b.end();
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        b bVar;
        TypedArray typedArray;
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            b.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            bVar = this.f5268e;
            if (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if ("animated-vector".equals(name)) {
                        typedArray = com.bumptech.glide.d.q(resources, theme, attributeSet, p.f5513n);
                        int resourceId = typedArray.getResourceId(0, 0);
                        if (resourceId != 0) {
                            n nVar = new n();
                            ThreadLocal threadLocal = p0.p.f4411a;
                            nVar.f5273d = i.a(resources, resourceId, theme);
                            new m(nVar.f5273d.getConstantState());
                            nVar.f5335i = false;
                            nVar.setCallback(this.f5272i);
                            n nVar2 = bVar.f5263a;
                            if (nVar2 != null) {
                                nVar2.setCallback((Drawable.Callback) null);
                            }
                            bVar.f5263a = nVar;
                        }
                    } else if ("target".equals(name)) {
                        typedArray = resources.obtainAttributes(attributeSet, p.f5514o);
                        String string = typedArray.getString(0);
                        int resourceId2 = typedArray.getResourceId(1, 0);
                        if (resourceId2 != 0) {
                            Context context = this.f5269f;
                            if (context != null) {
                                Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                                loadAnimator.setTarget(bVar.f5263a.f5331e.f5318b.f5316o.getOrDefault(string, (Object) null));
                                if (bVar.f5265c == null) {
                                    bVar.f5265c = new ArrayList();
                                    bVar.f5266d = new k.b();
                                }
                                bVar.f5265c.add(loadAnimator);
                                bVar.f5266d.put(loadAnimator, string);
                            } else {
                                typedArray.recycle();
                                throw new IllegalStateException("Context can't be null when inflating animators");
                            }
                        }
                    } else {
                        continue;
                    }
                    typedArray.recycle();
                }
                eventType = xmlPullParser.next();
            }
        }
        if (bVar.f5264b == null) {
            bVar.f5264b = new AnimatorSet();
        }
        bVar.f5264b.playTogether(bVar.f5265c);
    }
}
