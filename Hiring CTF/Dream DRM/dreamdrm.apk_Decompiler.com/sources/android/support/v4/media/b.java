package android.support.v4.media;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.appcompat.widget.r;
import b1.o;
import b1.v;
import com.google.android.material.datepicker.l;
import com.theori.dreamdrm.R;
import y2.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Object f234a;

    /* renamed from: b  reason: collision with root package name */
    public Object f235b;

    /* renamed from: c  reason: collision with root package name */
    public Object f236c;

    /* renamed from: d  reason: collision with root package name */
    public Object f237d;

    /* renamed from: e  reason: collision with root package name */
    public Object f238e;

    /* renamed from: f  reason: collision with root package name */
    public Object f239f;

    /* renamed from: g  reason: collision with root package name */
    public Object f240g;

    /* renamed from: h  reason: collision with root package name */
    public Object f241h;

    public b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(v.N(context, R.attr.materialCalendarStyle, l.class.getCanonicalName()).data, a.f5830k);
        this.f234a = r.b(context, obtainStyledAttributes.getResourceId(4, 0));
        this.f240g = r.b(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f235b = r.b(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f236c = r.b(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList u3 = o.u(context, obtainStyledAttributes, 7);
        this.f237d = r.b(context, obtainStyledAttributes.getResourceId(9, 0));
        this.f238e = r.b(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f239f = r.b(context, obtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.f241h = paint;
        paint.setColor(u3.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
