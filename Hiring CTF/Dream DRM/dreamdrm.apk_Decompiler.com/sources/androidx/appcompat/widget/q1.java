package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public final class q1 {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f728l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    public static final ConcurrentHashMap f729m = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public int f730a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f731b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f732c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f733d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f734e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f735f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f736g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f737h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f738i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f739j;

    /* renamed from: k  reason: collision with root package name */
    public final m1 f740k;

    static {
        new ConcurrentHashMap();
    }

    public q1(TextView textView) {
        this.f738i = textView;
        this.f739j = textView.getContext();
        this.f740k = Build.VERSION.SDK_INT >= 29 ? new o1() : new m1();
    }

    public static int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i3 : iArr) {
            if (i3 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i3)) < 0) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i6 = 0; i6 < size; i6++) {
            iArr2[i6] = ((Integer) arrayList.get(i6)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f729m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e6) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e6);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + r3 + "() method", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object e(java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
        /*
            java.lang.reflect.Method r0 = d(r3)     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            java.lang.Object r4 = r0.invoke(r2, r1)     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            goto L_0x0027
        L_0x000c:
            r2 = move-exception
            throw r2
        L_0x000e:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to invoke TextView#"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = "() method"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ACTVAutoSizeHelper"
            android.util.Log.w(r0, r3, r2)
        L_0x0027:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.q1.e(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    public final void a() {
        if (i() && this.f730a != 0) {
            if (this.f731b) {
                if (this.f738i.getMeasuredHeight() > 0 && this.f738i.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f740k.b(this.f738i) ? 1048576 : (this.f738i.getMeasuredWidth() - this.f738i.getTotalPaddingLeft()) - this.f738i.getTotalPaddingRight();
                    int height = (this.f738i.getHeight() - this.f738i.getCompoundPaddingBottom()) - this.f738i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f728l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            float c6 = (float) c(rectF);
                            if (c6 != this.f738i.getTextSize()) {
                                f(0, c6);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f731b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        RectF rectF2 = rectF;
        int length = this.f735f.length;
        if (length != 0) {
            int i3 = length - 1;
            int i6 = 1;
            int i7 = 0;
            while (i6 <= i3) {
                int i8 = (i6 + i3) / 2;
                int i9 = this.f735f[i8];
                TextView textView = this.f738i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null)) {
                    text = transformation;
                }
                int b6 = j1.b(textView);
                TextPaint textPaint = this.f737h;
                if (textPaint == null) {
                    this.f737h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f737h.set(textView.getPaint());
                this.f737h.setTextSize((float) i9);
                StaticLayout a6 = l1.a(text, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF2.right), b6, this.f738i, this.f737h, this.f740k);
                if ((b6 == -1 || (a6.getLineCount() <= b6 && a6.getLineEnd(a6.getLineCount() - 1) == text.length())) && ((float) a6.getHeight()) <= rectF2.bottom) {
                    int i10 = i8 + 1;
                    i7 = i6;
                    i6 = i10;
                } else {
                    i7 = i8 - 1;
                    i3 = i7;
                }
            }
            return this.f735f[i7];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void f(int i3, float f6) {
        Context context = this.f739j;
        float applyDimension = TypedValue.applyDimension(i3, f6, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f738i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a6 = k1.a(textView);
            if (textView.getLayout() != null) {
                this.f731b = false;
                try {
                    Method d6 = d("nullLayouts");
                    if (d6 != null) {
                        d6.invoke(textView, new Object[0]);
                    }
                } catch (Exception e6) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e6);
                }
                if (!a6) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (!i() || this.f730a != 1) {
            this.f731b = false;
        } else {
            if (!this.f736g || this.f735f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f734e - this.f733d) / this.f732c))) + 1;
                int[] iArr = new int[floor];
                for (int i3 = 0; i3 < floor; i3++) {
                    iArr[i3] = Math.round((((float) i3) * this.f732c) + this.f733d);
                }
                this.f735f = b(iArr);
            }
            this.f731b = true;
        }
        return this.f731b;
    }

    public final boolean h() {
        int[] iArr = this.f735f;
        int length = iArr.length;
        boolean z5 = length > 0;
        this.f736g = z5;
        if (z5) {
            this.f730a = 1;
            this.f733d = (float) iArr[0];
            this.f734e = (float) iArr[length - 1];
            this.f732c = -1.0f;
        }
        return z5;
    }

    public final boolean i() {
        return !(this.f738i instanceof z);
    }

    public final void j(float f6, float f7, float f8) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f6 + "px) is less or equal to (0px)");
        } else if (f7 <= f6) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f7 + "px) is less or equal to minimum auto-size text size (" + f6 + "px)");
        } else if (f8 > 0.0f) {
            this.f730a = 1;
            this.f733d = f6;
            this.f734e = f7;
            this.f732c = f8;
            this.f736g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f8 + "px) is less or equal to (0px)");
        }
    }
}
