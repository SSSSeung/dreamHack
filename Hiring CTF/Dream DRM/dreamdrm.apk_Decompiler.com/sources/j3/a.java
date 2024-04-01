package j3;

import android.content.Context;
import b1.v;
import com.theori.dreamdrm.R;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final int f3839f = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3840a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3841b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3842c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3843d;

    /* renamed from: e  reason: collision with root package name */
    public final float f3844e;

    public a(Context context) {
        boolean M = v.M(context, R.attr.elevationOverlayEnabled, false);
        int t5 = v.t(context, R.attr.elevationOverlayColor, 0);
        int t6 = v.t(context, R.attr.elevationOverlayAccentColor, 0);
        int t7 = v.t(context, R.attr.colorSurface, 0);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f3840a = M;
        this.f3841b = t5;
        this.f3842c = t6;
        this.f3843d = t7;
        this.f3844e = f6;
    }
}
