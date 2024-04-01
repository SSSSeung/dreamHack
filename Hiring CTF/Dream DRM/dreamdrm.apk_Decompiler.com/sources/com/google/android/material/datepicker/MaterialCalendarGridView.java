package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.theori.dreamdrm.R;
import java.util.Calendar;
import x0.u0;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1909d;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        w.d((Calendar) null);
        if (n.M(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f1909d = n.N(getContext(), R.attr.nestedScrollable);
        u0.l(this, new h(3, this));
    }

    /* renamed from: a */
    public final q getAdapter() {
        return (q) super.getAdapter();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        q a6 = getAdapter();
        a6.getClass();
        int max = Math.max(a6.a(), getFirstVisiblePosition());
        int min = Math.min((a6.a() + a6.f1973d.f1968h) - 1, getLastVisiblePosition());
        a6.getItem(max);
        a6.getItem(min);
        throw null;
    }

    public final void onFocusChanged(boolean z5, int i3, Rect rect) {
        int i6;
        if (z5) {
            if (i3 == 33) {
                q a6 = getAdapter();
                i6 = (a6.a() + a6.f1973d.f1968h) - 1;
            } else if (i3 == 130) {
                i6 = getAdapter().a();
            } else {
                super.onFocusChanged(true, i3, rect);
                return;
            }
            setSelection(i6);
            return;
        }
        super.onFocusChanged(false, i3, rect);
    }

    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (!super.onKeyDown(i3, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().a()) {
            return true;
        }
        if (19 != i3) {
            return false;
        }
        setSelection(getAdapter().a());
        return true;
    }

    public final void onMeasure(int i3, int i6) {
        if (this.f1909d) {
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i3, i6);
    }

    public final void setSelection(int i3) {
        if (i3 < getAdapter().a()) {
            i3 = getAdapter().a();
        }
        super.setSelection(i3);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof q) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), q.class.getCanonicalName()}));
        }
    }
}
