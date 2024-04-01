package h3;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public final class a implements View.OnTouchListener {

    /* renamed from: d  reason: collision with root package name */
    public final Dialog f3452d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3453e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3454f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3455g;

    public a(Dialog dialog, Rect rect) {
        this.f3452d = dialog;
        this.f3453e = rect.left;
        this.f3454f = rect.top;
        this.f3455g = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f3453e;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f3454f;
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i3 = this.f3455g;
            obtain.setLocation((float) ((-i3) - 1), (float) ((-i3) - 1));
        }
        view.performClick();
        return this.f3452d.onTouchEvent(obtain);
    }
}
