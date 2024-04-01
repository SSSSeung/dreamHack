package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.f4;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.n;
import d.a;
import h.b;
import h.c;
import h.d0;
import h.o;
import h.q;

public class ActionMenuItemView extends i1 implements d0, View.OnClickListener, n {

    /* renamed from: k  reason: collision with root package name */
    public q f352k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f353l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f354m;

    /* renamed from: n  reason: collision with root package name */
    public h.n f355n;

    /* renamed from: o  reason: collision with root package name */
    public b f356o;

    /* renamed from: p  reason: collision with root package name */
    public c f357p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f358q = m();

    /* renamed from: r  reason: collision with root package name */
    public boolean f359r;

    /* renamed from: s  reason: collision with root package name */
    public final int f360s;

    /* renamed from: t  reason: collision with root package name */
    public int f361t;

    /* renamed from: u  reason: collision with root package name */
    public final int f362u;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2115c, 0, 0);
        this.f360s = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f362u = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f361t = -1;
        setSaveEnabled(false);
    }

    public final boolean a() {
        return l();
    }

    public final boolean b() {
        return l() && this.f352k.getIcon() == null;
    }

    public final void d(q qVar) {
        this.f352k = qVar;
        setIcon(qVar.getIcon());
        setTitle(qVar.getTitleCondensed());
        setId(qVar.f3196a);
        setVisibility(qVar.isVisible() ? 0 : 8);
        setEnabled(qVar.isEnabled());
        if (qVar.hasSubMenu() && this.f356o == null) {
            this.f356o = new b(this);
        }
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public q getItemData() {
        return this.f352k;
    }

    public final boolean l() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean m() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        return i3 >= 480 || (i3 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void n() {
        boolean z5 = true;
        boolean z6 = !TextUtils.isEmpty(this.f353l);
        if (this.f354m != null) {
            if (!((this.f352k.f3219y & 4) == 4) || (!this.f358q && !this.f359r)) {
                z5 = false;
            }
        }
        boolean z7 = z6 & z5;
        CharSequence charSequence = null;
        setText(z7 ? this.f353l : null);
        CharSequence charSequence2 = this.f352k.f3212q;
        if (TextUtils.isEmpty(charSequence2)) {
            charSequence2 = z7 ? null : this.f352k.f3200e;
        }
        setContentDescription(charSequence2);
        CharSequence charSequence3 = this.f352k.f3213r;
        if (TextUtils.isEmpty(charSequence3)) {
            if (!z7) {
                charSequence = this.f352k.f3200e;
            }
            f4.a(this, charSequence);
            return;
        }
        f4.a(this, charSequence3);
    }

    public final void onClick(View view) {
        h.n nVar = this.f355n;
        if (nVar != null) {
            nVar.b(this.f352k);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f358q = m();
        n();
    }

    public final void onMeasure(int i3, int i6) {
        int i7;
        boolean l6 = l();
        if (l6 && (i7 = this.f361t) >= 0) {
            super.setPadding(i7, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i3, i6);
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int measuredWidth = getMeasuredWidth();
        int i8 = this.f360s;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i8) : i8;
        if (mode != 1073741824 && i8 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i6);
        }
        if (!l6 && this.f354m != null) {
            super.setPadding((getMeasuredWidth() - this.f354m.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (!this.f352k.hasSubMenu() || (bVar = this.f356o) == null || !bVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z5) {
    }

    public void setChecked(boolean z5) {
    }

    public void setExpandedFormat(boolean z5) {
        if (this.f359r != z5) {
            this.f359r = z5;
            q qVar = this.f352k;
            if (qVar != null) {
                o oVar = qVar.f3209n;
                oVar.f3180k = true;
                oVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f354m = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i3 = this.f362u;
            if (intrinsicWidth > i3) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i3) / ((float) intrinsicWidth)));
                intrinsicWidth = i3;
            }
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i3) / ((float) intrinsicHeight)));
            } else {
                i3 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i3);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        n();
    }

    public void setItemInvoker(h.n nVar) {
        this.f355n = nVar;
    }

    public final void setPadding(int i3, int i6, int i7, int i8) {
        this.f361t = i3;
        super.setPadding(i3, i6, i7, i8);
    }

    public void setPopupCallback(c cVar) {
        this.f357p = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f353l = charSequence;
        n();
    }
}
