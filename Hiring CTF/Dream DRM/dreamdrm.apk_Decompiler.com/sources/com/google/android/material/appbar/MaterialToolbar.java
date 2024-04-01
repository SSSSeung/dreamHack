package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b1.o;
import b1.v;
import com.bumptech.glide.c;
import com.theori.dreamdrm.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p3.g;
import r0.b;
import x0.d0;
import x0.j0;
import x0.u0;
import y2.a;

public class MaterialToolbar extends Toolbar {

    /* renamed from: c0  reason: collision with root package name */
    public static final ImageView.ScaleType[] f1814c0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer U;
    public boolean V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public ImageView.ScaleType f1815a0;

    /* renamed from: b0  reason: collision with root package name */
    public Boolean f1816b0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(o.c0(context, attributeSet, R.attr.toolbarStyle, 2131756126), attributeSet, 0);
        int i3 = 0;
        Context context2 = getContext();
        TypedArray G = v.G(context2, attributeSet, a.f5837r, R.attr.toolbarStyle, 2131756126, new int[0]);
        if (G.hasValue(2)) {
            setNavigationIconTint(G.getColor(2, -1));
        }
        this.V = G.getBoolean(4, false);
        this.W = G.getBoolean(3, false);
        int i6 = G.getInt(1, -1);
        if (i6 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f1814c0;
            if (i6 < scaleTypeArr.length) {
                this.f1815a0 = scaleTypeArr[i6];
            }
        }
        if (G.hasValue(0)) {
            this.f1816b0 = Boolean.valueOf(G.getBoolean(0, false));
        }
        G.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.j(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : i3));
            gVar.h(context2);
            WeakHashMap weakHashMap = u0.f5622a;
            gVar.i(j0.i(this));
            d0.q(this, gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f1815a0;
    }

    public Integer getNavigationIconTint() {
        return this.U;
    }

    public final void k(int i3) {
        Menu menu = getMenu();
        boolean z5 = menu instanceof h.o;
        if (z5) {
            ((h.o) menu).w();
        }
        super.k(i3);
        if (z5) {
            ((h.o) menu).v();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            c.F(this, (g) background);
        }
    }

    public final void onLayout(boolean z5, int i3, int i6, int i7, int i8) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z5, i3, i6, i7, i8);
        int i9 = 0;
        ImageView imageView2 = null;
        if (this.V || this.W) {
            ArrayList r5 = c.r(this, getTitle());
            boolean isEmpty = r5.isEmpty();
            l0.g gVar = c.f1698b;
            TextView textView = isEmpty ? null : (TextView) Collections.min(r5, gVar);
            ArrayList r6 = c.r(this, getSubtitle());
            TextView textView2 = r6.isEmpty() ? null : (TextView) Collections.max(r6, gVar);
            if (!(textView == null && textView2 == null)) {
                int measuredWidth = getMeasuredWidth();
                int i10 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                        if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.V && textView != null) {
                    t(textView, pair);
                }
                if (this.W && textView2 != null) {
                    t(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i9 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i9);
                if ((childAt2 instanceof ImageView) && (drawable = imageView.getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = (ImageView) childAt2;
                    break;
                }
                i9++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f1816b0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f1815a0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    public void setElevation(float f6) {
        super.setElevation(f6);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).i(f6);
        }
    }

    public void setLogoAdjustViewBounds(boolean z5) {
        Boolean bool = this.f1816b0;
        if (bool == null || bool.booleanValue() != z5) {
            this.f1816b0 = Boolean.valueOf(z5);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f1815a0 != scaleType) {
            this.f1815a0 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.U == null)) {
            drawable = drawable.mutate();
            b.g(drawable, this.U.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i3) {
        this.U = Integer.valueOf(i3);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z5) {
        if (this.W != z5) {
            this.W = z5;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z5) {
        if (this.V != z5) {
            this.V = z5;
            requestLayout();
        }
    }

    public final void t(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i3 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i6 = measuredWidth2 + i3;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i3, 0), Math.max(i6 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i3 += max;
            i6 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i6 - i3, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i3, textView.getTop(), i6, textView.getBottom());
    }
}
