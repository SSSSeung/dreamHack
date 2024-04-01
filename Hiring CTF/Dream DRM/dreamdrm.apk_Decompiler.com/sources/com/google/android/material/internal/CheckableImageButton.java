package com.google.android.material.internal;

import a3.a;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.c0;
import com.theori.dreamdrm.R;
import x0.u0;

public class CheckableImageButton extends c0 implements Checkable {

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f1987j = {16842912};

    /* renamed from: g  reason: collision with root package name */
    public boolean f1988g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1989h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1990i = true;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        u0.l(this, new a(2, this));
    }

    public final boolean isChecked() {
        return this.f1988g;
    }

    public final int[] onCreateDrawableState(int i3) {
        return this.f1988g ? View.mergeDrawableStates(super.onCreateDrawableState(i3 + 1), f1987j) : super.onCreateDrawableState(i3);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k3.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k3.a aVar = (k3.a) parcelable;
        super.onRestoreInstanceState(aVar.f2483d);
        setChecked(aVar.f3910f);
    }

    public final Parcelable onSaveInstanceState() {
        k3.a aVar = new k3.a(super.onSaveInstanceState());
        aVar.f3910f = this.f1988g;
        return aVar;
    }

    public void setCheckable(boolean z5) {
        if (this.f1989h != z5) {
            this.f1989h = z5;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z5) {
        if (this.f1989h && this.f1988g != z5) {
            this.f1988g = z5;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z5) {
        this.f1990i = z5;
    }

    public void setPressed(boolean z5) {
        if (this.f1990i) {
            super.setPressed(z5);
        }
    }

    public final void toggle() {
        setChecked(!this.f1988g);
    }
}
