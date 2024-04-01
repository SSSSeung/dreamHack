package l0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import k0.a;

public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public a f4053a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4054b = false;

    /* renamed from: c  reason: collision with root package name */
    public final int f4055c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f4056d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final int f4057e = -1;

    /* renamed from: f  reason: collision with root package name */
    public final int f4058f = -1;

    /* renamed from: g  reason: collision with root package name */
    public final int f4059g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f4060h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f4061i;

    /* renamed from: j  reason: collision with root package name */
    public int f4062j;

    /* renamed from: k  reason: collision with root package name */
    public View f4063k;

    /* renamed from: l  reason: collision with root package name */
    public View f4064l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4065m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4066n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4067o;

    /* renamed from: p  reason: collision with root package name */
    public final Rect f4068p = new Rect();

    public d() {
        super(-2, -2);
    }

    public final boolean a(int i3) {
        if (i3 == 0) {
            return this.f4066n;
        }
        if (i3 != 1) {
            return false;
        }
        return this.f4067o;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f3901b);
        this.f4055c = obtainStyledAttributes.getInteger(0, 0);
        this.f4058f = obtainStyledAttributes.getResourceId(1, -1);
        this.f4056d = obtainStyledAttributes.getInteger(2, 0);
        this.f4057e = obtainStyledAttributes.getInteger(6, -1);
        this.f4059g = obtainStyledAttributes.getInt(5, 0);
        this.f4060h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f4054b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.w;
            if (TextUtils.isEmpty(string)) {
                aVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.w;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f938y;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f937x);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aVar = (a) constructor.newInstance(new Object[]{context, attributeSet});
                } catch (Exception e6) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e6);
                }
            }
            this.f4053a = aVar;
        }
        obtainStyledAttributes.recycle();
        a aVar2 = this.f4053a;
        if (aVar2 != null) {
            aVar2.c(this);
        }
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public d(d dVar) {
        super(dVar);
    }
}
