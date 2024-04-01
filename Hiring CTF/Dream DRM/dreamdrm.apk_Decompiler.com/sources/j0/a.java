package j0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import y.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f3644a;

    /* renamed from: b  reason: collision with root package name */
    public int f3645b;

    /* renamed from: c  reason: collision with root package name */
    public float f3646c;

    /* renamed from: d  reason: collision with root package name */
    public String f3647d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3648e;

    /* renamed from: f  reason: collision with root package name */
    public int f3649f;

    public a(a aVar, Object obj) {
        aVar.getClass();
        this.f3644a = aVar.f3644a;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        int i3;
        float f6;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f3779c);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i6 = 0;
        Object obj = null;
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            int i8 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i6 = 6;
            } else {
                int i9 = 3;
                if (index != 3) {
                    i9 = 4;
                    if (index != 2) {
                        if (index == 7) {
                            f6 = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                        } else if (index == 4) {
                            f6 = obtainStyledAttributes.getDimension(index, 0.0f);
                        } else if (index == 5) {
                            obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                            i6 = 2;
                        } else if (index == 6) {
                            i3 = obtainStyledAttributes.getInteger(index, -1);
                            obj = Integer.valueOf(i3);
                            i6 = i8;
                        } else if (index == 8) {
                            obj = obtainStyledAttributes.getString(index);
                            i6 = 5;
                        }
                        obj = Float.valueOf(f6);
                        i6 = 7;
                    }
                }
                i8 = i9;
                i3 = obtainStyledAttributes.getColor(index, 0);
                obj = Integer.valueOf(i3);
                i6 = i8;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new a(str, i6, obj));
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (d.b(this.f3644a)) {
            case 0:
                this.f3645b = ((Integer) obj).intValue();
                return;
            case 1:
            case 6:
                this.f3646c = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f3649f = ((Integer) obj).intValue();
                return;
            case 4:
                this.f3647d = (String) obj;
                return;
            case 5:
                this.f3648e = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }

    public a(String str, int i3, Object obj) {
        this.f3644a = i3;
        b(obj);
    }
}
