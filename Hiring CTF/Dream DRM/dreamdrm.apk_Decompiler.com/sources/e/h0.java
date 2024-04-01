package e;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.q;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.t;
import com.theori.dreamdrm.R;
import java.lang.reflect.Constructor;
import k.j;

public class h0 {

    /* renamed from: b  reason: collision with root package name */
    public static final Class[] f2377b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f2378c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f2379d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f2380e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f2381f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f2382g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    public static final j f2383h = new j();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f2384a = new Object[2];

    public q a(Context context, AttributeSet attributeSet) {
        return new q(context, attributeSet);
    }

    public s b(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet, R.attr.buttonStyle);
    }

    public t c(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet, R.attr.checkboxStyle);
    }

    public i0 d(Context context, AttributeSet attributeSet) {
        return new i0(context, attributeSet);
    }

    public i1 e(Context context, AttributeSet attributeSet) {
        return new i1(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String str3;
        j jVar = f2383h;
        Constructor<? extends U> constructor = (Constructor) jVar.getOrDefault(str, (Object) null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2377b);
            jVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2384a);
    }
}
