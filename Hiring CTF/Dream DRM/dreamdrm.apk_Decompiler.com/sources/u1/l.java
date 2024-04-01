package u1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public final class l extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f5317a;

    /* renamed from: b  reason: collision with root package name */
    public k f5318b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f5319c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f5320d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5321e;

    /* renamed from: f  reason: collision with root package name */
    public Bitmap f5322f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f5323g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f5324h;

    /* renamed from: i  reason: collision with root package name */
    public int f5325i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5326j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5327k;

    /* renamed from: l  reason: collision with root package name */
    public Paint f5328l;

    public l() {
        this.f5319c = null;
        this.f5320d = n.f5330m;
        this.f5318b = new k();
    }

    public int getChangingConfigurations() {
        return this.f5317a;
    }

    public final Drawable newDrawable() {
        return new n(this);
    }

    public l(l lVar) {
        this.f5319c = null;
        this.f5320d = n.f5330m;
        if (lVar != null) {
            this.f5317a = lVar.f5317a;
            k kVar = new k(lVar.f5318b);
            this.f5318b = kVar;
            if (lVar.f5318b.f5306e != null) {
                kVar.f5306e = new Paint(lVar.f5318b.f5306e);
            }
            if (lVar.f5318b.f5305d != null) {
                this.f5318b.f5305d = new Paint(lVar.f5318b.f5305d);
            }
            this.f5319c = lVar.f5319c;
            this.f5320d = lVar.f5320d;
            this.f5321e = lVar.f5321e;
        }
    }

    public final Drawable newDrawable(Resources resources) {
        return new n(this);
    }
}
