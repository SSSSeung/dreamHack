package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.theori.dreamdrm.R;

public final class j0 extends RatingBar {

    /* renamed from: d  reason: collision with root package name */
    public final h0 f646d;

    public j0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        t3.a(this, getContext());
        h0 h0Var = new h0(this);
        this.f646d = h0Var;
        h0Var.a(attributeSet, R.attr.ratingBarStyle);
    }

    public final synchronized void onMeasure(int i3, int i6) {
        super.onMeasure(i3, i6);
        Bitmap bitmap = this.f646d.f622b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i3, 0), getMeasuredHeight());
        }
    }
}
