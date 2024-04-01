package p0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f4400a;

    /* renamed from: b  reason: collision with root package name */
    public final Configuration f4401b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4402c;

    public k(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f4400a = colorStateList;
        this.f4401b = configuration;
        this.f4402c = theme == null ? 0 : theme.hashCode();
    }
}
