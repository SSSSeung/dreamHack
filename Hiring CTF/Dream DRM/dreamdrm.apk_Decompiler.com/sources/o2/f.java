package o2;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import b1.o;
import java.util.ArrayList;
import l0.e;

public final class f {

    /* renamed from: d  reason: collision with root package name */
    public static Integer f4331d;

    /* renamed from: a  reason: collision with root package name */
    public final View f4332a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f4333b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public e f4334c;

    public f(View view) {
        this.f4332a = view;
    }

    public final int a(int i3, int i6, int i7) {
        int i8 = i6 - i7;
        if (i8 > 0) {
            return i8;
        }
        int i9 = i3 - i7;
        if (i9 > 0) {
            return i9;
        }
        View view = this.f4332a;
        if (view.isLayoutRequested() || i6 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
            Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = view.getContext();
        if (f4331d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            o.i(windowManager);
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f4331d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f4331d.intValue();
    }

    public final int b() {
        View view = this.f4332a;
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return a(view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
    }

    public final int c() {
        View view = this.f4332a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
    }
}
