package o3;

import android.graphics.Paint;
import android.graphics.Path;

public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f4335i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f4336j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f4337k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f4338l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f4339a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f4340b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f4341c;

    /* renamed from: d  reason: collision with root package name */
    public int f4342d;

    /* renamed from: e  reason: collision with root package name */
    public int f4343e;

    /* renamed from: f  reason: collision with root package name */
    public int f4344f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f4345g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public final Paint f4346h;

    public a() {
        Paint paint = new Paint();
        this.f4346h = paint;
        this.f4339a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f4340b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f4341c = new Paint(paint2);
    }

    public final void a(int i3) {
        this.f4342d = q0.a.c(i3, 68);
        this.f4343e = q0.a.c(i3, 20);
        this.f4344f = q0.a.c(i3, 0);
        this.f4339a.setColor(this.f4342d);
    }
}
