package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.theori.dreamdrm.R;
import d.a;
import java.util.WeakHashMap;
import x0.d0;
import x0.u0;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: d  reason: collision with root package name */
    public boolean f440d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f441e;

    /* renamed from: f  reason: collision with root package name */
    public int f442f = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = a.f2123k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        u0.k(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f440d = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f440d);
        }
    }

    private void setStacked(boolean z5) {
        if (this.f441e == z5) {
            return;
        }
        if (!z5 || this.f440d) {
            this.f441e = z5;
            setOrientation(z5 ? 1 : 0);
            setGravity(z5 ? 8388613 : 80);
            View findViewById = findViewById(R.id.spacer);
            if (findViewById != null) {
                findViewById.setVisibility(z5 ? 8 : 4);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    public final void onMeasure(int i3, int i6) {
        boolean z5;
        int i7;
        int i8;
        int i9;
        int size = View.MeasureSpec.getSize(i3);
        int i10 = 0;
        if (this.f440d) {
            if (size > this.f442f && this.f441e) {
                setStacked(false);
            }
            this.f442f = size;
        }
        if (this.f441e || View.MeasureSpec.getMode(i3) != 1073741824) {
            i7 = i3;
            z5 = false;
        } else {
            i7 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z5 = true;
        }
        super.onMeasure(i7, i6);
        if (this.f440d && !this.f441e) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z5 = true;
            }
        }
        if (z5) {
            super.onMeasure(i3, i6);
        }
        int childCount = getChildCount();
        int i11 = 0;
        while (true) {
            i8 = -1;
            if (i11 >= childCount) {
                i11 = -1;
                break;
            } else if (getChildAt(i11).getVisibility() == 0) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            View childAt = getChildAt(i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i10 = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f441e) {
                int i12 = i11 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i12 >= childCount2) {
                        break;
                    } else if (getChildAt(i12).getVisibility() == 0) {
                        i8 = i12;
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i8 >= 0) {
                    i9 = getChildAt(i8).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                i9 = getPaddingBottom();
            }
            i10 += i9;
        }
        WeakHashMap weakHashMap = u0.f5622a;
        if (d0.d(this) != i10) {
            setMinimumHeight(i10);
            if (i6 == 0) {
                super.onMeasure(i3, i6);
            }
        }
    }

    public void setAllowStacking(boolean z5) {
        if (this.f440d != z5) {
            this.f440d = z5;
            if (!z5 && this.f441e) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
