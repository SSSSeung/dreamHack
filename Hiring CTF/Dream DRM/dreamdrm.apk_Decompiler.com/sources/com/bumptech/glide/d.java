package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.activity.result.c;
import b1.o;
import e.m0;
import e0.f;
import e0.g;
import l5.t;
import n0.h;
import org.xmlpull.v1.XmlPullParser;
import p3.u;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f1700a = new c((Object) null, (Object) null, (Object) null, 11);

    /* renamed from: b  reason: collision with root package name */
    public static c f1701b;

    /* renamed from: c  reason: collision with root package name */
    public static final char[] f1702c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: d  reason: collision with root package name */
    public static final m0 f1703d = new m0(1);

    /* renamed from: e  reason: collision with root package name */
    public static final m0 f1704e = new m0(2);

    public /* synthetic */ d() {
    }

    public static final int B(t tVar, int i3) {
        int i6;
        o.m(tVar, "$this$segment");
        int i7 = i3 + 1;
        int length = tVar.f4162h.length;
        int[] iArr = tVar.f4163i;
        o.m(iArr, "$this$binarySearch");
        int i8 = length - 1;
        int i9 = 0;
        while (true) {
            if (i9 <= i8) {
                i6 = (i9 + i8) >>> 1;
                int i10 = iArr[i6];
                if (i10 >= i7) {
                    if (i10 <= i7) {
                        break;
                    }
                    i8 = i6 - 1;
                } else {
                    i9 = i6 + 1;
                }
            } else {
                i6 = (-i9) - 1;
                break;
            }
        }
        return i6 >= 0 ? i6 : ~i6;
    }

    public static final int a(char c6) {
        if ('0' <= c6 && '9' >= c6) {
            return c6 - '0';
        }
        char c7 = 'a';
        if ('a' > c6 || 'f' < c6) {
            c7 = 'A';
            if ('A' > c6 || 'F' < c6) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c6);
            }
        }
        return (c6 - c7) + 10;
    }

    public static int e(int i3, int i6, int i7) {
        return i3 < i6 ? i6 : i3 > i7 ? i7 : i3;
    }

    public static p0.c i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i3) {
        p0.c cVar;
        if (p(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i3, typedValue);
            int i6 = typedValue.type;
            if (i6 >= 28 && i6 <= 31) {
                return new p0.c((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                cVar = p0.c.a(typedArray.getResources(), typedArray.getResourceId(i3, 0), theme);
            } catch (Exception e6) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e6);
                cVar = null;
            }
            if (cVar != null) {
                return cVar;
            }
        }
        return new p0.c((Shader) null, (ColorStateList) null, 0);
    }

    public static float j(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i3, float f6) {
        return !p(xmlPullParser, str) ? f6 : typedArray.getFloat(i3, f6);
    }

    public static int k(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i3, int i6) {
        return !p(xmlPullParser, str) ? i6 : typedArray.getInt(i3, i6);
    }

    public static Intent l(Activity activity) {
        Intent a6 = h.a(activity);
        if (a6 != null) {
            return a6;
        }
        try {
            String m6 = m(activity, activity.getComponentName());
            if (m6 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, m6);
            try {
                return m(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + m6 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public static String m(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static boolean p(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray q(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static void r(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public abstract void A(f fVar, Thread thread);

    public abstract boolean C(View view, int i3);

    public abstract boolean b(g gVar, e0.c cVar);

    public abstract boolean c(g gVar, Object obj, Object obj2);

    public abstract boolean d(g gVar, f fVar, f fVar2);

    public abstract int f(View view, int i3);

    public abstract int g(View view, int i3);

    public abstract void h(float f6, float f7, u uVar);

    public int n(View view) {
        return 0;
    }

    public int o() {
        return 0;
    }

    public abstract void s(Throwable th);

    public abstract void t(g.h hVar);

    public void u(View view, int i3) {
    }

    public abstract void v(int i3);

    public abstract void w(View view, int i3, int i6);

    public abstract void x(View view, float f6, float f7);

    public abstract Object y(Intent intent, int i3);

    public abstract void z(f fVar, f fVar2);

    public /* synthetic */ d(int i3) {
    }
}
