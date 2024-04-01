package x0;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

public abstract class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f5541a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f5542b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5543c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5544d;

    public b0(int i3, Class cls, int i6, int i7) {
        this.f5541a = i3;
        this.f5542b = cls;
        this.f5544d = i6;
        this.f5543c = i7;
    }

    public static boolean a(Boolean bool, Boolean bool2) {
        return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
    }

    public final Object b(View view) {
        if (Build.VERSION.SDK_INT >= this.f5543c) {
            z zVar = (z) this;
            int i3 = zVar.f5645e;
            switch (i3) {
                case 0:
                    return zVar.d(view);
                case 1:
                    switch (i3) {
                        case 1:
                            return n0.b(view);
                        default:
                            return p0.b(view);
                    }
                case 2:
                    switch (i3) {
                        case 1:
                            return n0.b(view);
                        default:
                            return p0.b(view);
                    }
                default:
                    return zVar.d(view);
            }
        } else {
            Object tag = view.getTag(this.f5541a);
            if (this.f5542b.isInstance(tag)) {
                return tag;
            }
            return null;
        }
    }

    public final void c(View view, Object obj) {
        boolean a6;
        if (Build.VERSION.SDK_INT >= this.f5543c) {
            int i3 = ((z) this).f5645e;
            switch (i3) {
                case 0:
                    Boolean bool = (Boolean) obj;
                    switch (i3) {
                        case 0:
                            n0.j(view, bool.booleanValue());
                            return;
                        default:
                            n0.g(view, bool.booleanValue());
                            return;
                    }
                case 1:
                    CharSequence charSequence = (CharSequence) obj;
                    switch (i3) {
                        case 1:
                            n0.h(view, charSequence);
                            return;
                        default:
                            p0.f(view, charSequence);
                            return;
                    }
                case 2:
                    CharSequence charSequence2 = (CharSequence) obj;
                    switch (i3) {
                        case 1:
                            n0.h(view, charSequence2);
                            return;
                        default:
                            p0.f(view, charSequence2);
                            return;
                    }
                default:
                    Boolean bool2 = (Boolean) obj;
                    switch (i3) {
                        case 0:
                            n0.j(view, bool2.booleanValue());
                            return;
                        default:
                            n0.g(view, bool2.booleanValue());
                            return;
                    }
            }
        } else {
            Object b6 = b(view);
            int i6 = ((z) this).f5645e;
            switch (i6) {
                case 0:
                    Boolean bool3 = (Boolean) b6;
                    Boolean bool4 = (Boolean) obj;
                    switch (i6) {
                        case 0:
                            a6 = a(bool3, bool4);
                            break;
                        default:
                            a6 = a(bool3, bool4);
                            break;
                    }
                case 1:
                    CharSequence charSequence3 = (CharSequence) b6;
                    CharSequence charSequence4 = (CharSequence) obj;
                    switch (i6) {
                        case 1:
                            a6 = TextUtils.equals(charSequence3, charSequence4);
                            break;
                        default:
                            a6 = TextUtils.equals(charSequence3, charSequence4);
                            break;
                    }
                case 2:
                    CharSequence charSequence5 = (CharSequence) b6;
                    CharSequence charSequence6 = (CharSequence) obj;
                    switch (i6) {
                        case 1:
                            a6 = TextUtils.equals(charSequence5, charSequence6);
                            break;
                        default:
                            a6 = TextUtils.equals(charSequence5, charSequence6);
                            break;
                    }
                default:
                    Boolean bool5 = (Boolean) b6;
                    Boolean bool6 = (Boolean) obj;
                    switch (i6) {
                        case 0:
                            a6 = a(bool5, bool6);
                            break;
                        default:
                            a6 = a(bool5, bool6);
                            break;
                    }
            }
            if (!a6) {
                View.AccessibilityDelegate c6 = u0.c(view);
                c cVar = c6 == null ? null : c6 instanceof a ? ((a) c6).f5535a : new c(c6);
                if (cVar == null) {
                    cVar = new c();
                }
                u0.l(view, cVar);
                view.setTag(this.f5541a, obj);
                u0.g(view, this.f5544d);
            }
        }
    }
}
