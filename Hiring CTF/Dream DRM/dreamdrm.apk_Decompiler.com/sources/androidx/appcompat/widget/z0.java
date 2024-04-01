package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

public final class z0 implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TextView f871d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Typeface f872e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f873f;

    public z0(TextView textView, Typeface typeface, int i3) {
        this.f871d = textView;
        this.f872e = typeface;
        this.f873f = i3;
    }

    public final void run() {
        this.f871d.setTypeface(this.f872e, this.f873f);
    }
}
