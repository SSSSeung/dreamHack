package m3;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import h5.d;

public final class c extends d {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Context f4190g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ TextPaint f4191h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ d f4192i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ d f4193j;

    public c(d dVar, Context context, TextPaint textPaint, d dVar2) {
        this.f4193j = dVar;
        this.f4190g = context;
        this.f4191h = textPaint;
        this.f4192i = dVar2;
    }

    public final void j(int i3) {
        this.f4192i.j(i3);
    }

    public final void k(Typeface typeface, boolean z5) {
        this.f4193j.g(this.f4190g, this.f4191h, typeface);
        this.f4192i.k(typeface, z5);
    }
}
