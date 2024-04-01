package com.bumptech.glide;

import a2.m;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.r;
import androidx.compose.ui.platform.k;
import b1.o;
import b1.v;
import d5.i;
import g4.l;
import i4.h;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.logging.Logger;
import l.e;
import l0.g;
import l5.j;
import l5.n;
import l5.x;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import p0.d;
import p3.f;
import r0.b;
import w4.c1;
import w4.d1;
import w4.u;
import x0.j0;
import x0.u0;
import z0.a;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Class[] f1697a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: b  reason: collision with root package name */
    public static final g f1698b = new g(2);

    /* renamed from: c  reason: collision with root package name */
    public static final Object[] f1699c = new Object[0];

    public static void A(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                newSerializer.setOutput(openFileOutput, (String) null);
                newSerializer.startDocument("UTF-8", Boolean.TRUE);
                newSerializer.startTag((String) null, "locales");
                newSerializer.attribute((String) null, "application_locales", str);
                newSerializer.endTag((String) null, "locales");
                newSerializer.endDocument();
                Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                if (openFileOutput == null) {
                    return;
                }
            } catch (Exception e6) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e6);
                if (openFileOutput == null) {
                    return;
                }
            } catch (Throwable th) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
            try {
                openFileOutput.close();
            } catch (IOException unused2) {
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", new Object[]{"androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"}));
        }
    }

    public static List B(int i3, Resources resources) {
        if (i3 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i3);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (d.a(obtainTypedArray, 0) == 1) {
                for (int i6 = 0; i6 < obtainTypedArray.length(); i6++) {
                    int resourceId = obtainTypedArray.getResourceId(i6, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String decode : stringArray) {
                            arrayList2.add(Base64.decode(decode, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i3);
                ArrayList arrayList3 = new ArrayList();
                for (String decode2 : stringArray2) {
                    arrayList3.add(Base64.decode(decode2, 0));
                }
                arrayList.add(arrayList3);
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r3 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        if (r3 == null) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String C(android.content.Context r9) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch:{ FileNotFoundException -> 0x006a }
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch:{ IOException | XmlPullParserException -> 0x0048 }
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch:{ IOException | XmlPullParserException -> 0x0048 }
            int r5 = r4.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x0048 }
        L_0x0017:
            int r6 = r4.next()     // Catch:{ IOException | XmlPullParserException -> 0x0048 }
            r7 = 1
            if (r6 == r7) goto L_0x0040
            r7 = 3
            if (r6 != r7) goto L_0x0027
            int r8 = r4.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x0048 }
            if (r8 <= r5) goto L_0x0040
        L_0x0027:
            if (r6 == r7) goto L_0x0017
            r7 = 4
            if (r6 != r7) goto L_0x002d
            goto L_0x0017
        L_0x002d:
            java.lang.String r6 = r4.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0048 }
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch:{ IOException | XmlPullParserException -> 0x0048 }
            if (r6 == 0) goto L_0x0017
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch:{ IOException | XmlPullParserException -> 0x0048 }
        L_0x0040:
            if (r3 == 0) goto L_0x0050
        L_0x0042:
            r3.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x0050
        L_0x0046:
            r9 = move-exception
            goto L_0x0064
        L_0x0048:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x0046 }
            if (r3 == 0) goto L_0x0050
            goto L_0x0042
        L_0x0050:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0060
            java.lang.String r9 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            java.lang.String r9 = r9.concat(r2)
            android.util.Log.d(r1, r9)
            goto L_0x0063
        L_0x0060:
            r9.deleteFile(r0)
        L_0x0063:
            return r2
        L_0x0064:
            if (r3 == 0) goto L_0x0069
            r3.close()     // Catch:{ IOException -> 0x0069 }
        L_0x0069:
            throw r9
        L_0x006a:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.C(android.content.Context):java.lang.String");
    }

    public static int D(Context context, int i3, int i6) {
        TypedValue L = v.L(context, i3);
        return (L == null || L.type != 16) ? i6 : L.data;
    }

    public static TimeInterpolator E(Context context, int i3, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i3, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!(v(valueOf, "cubic-bezier") || v(valueOf, "path"))) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (v(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return a.b(q(split, 0), q(split, 1), q(split, 2), q(split, 3));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            } else if (v(valueOf, "path")) {
                return a.c(e.l(valueOf.substring(5, valueOf.length() - 1)));
            } else {
                throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
    }

    public static void F(View view, p3.g gVar) {
        j3.a aVar = gVar.f4767d.f4746b;
        if (aVar != null && aVar.f3840a) {
            float f6 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = u0.f5622a;
                f6 += j0.i((View) parent);
            }
            f fVar = gVar.f4767d;
            if (fVar.f4757m != f6) {
                fVar.f4757m = f6;
                gVar.m();
            }
        }
    }

    public static void G(Drawable drawable, int i3) {
        b.g(drawable, i3);
    }

    public static void H(Drawable drawable, ColorStateList colorStateList) {
        b.h(drawable, colorStateList);
    }

    public static void I(Drawable drawable, PorterDuff.Mode mode) {
        b.i(drawable, mode);
    }

    public static final l5.c J(Socket socket) {
        Logger logger = n.f4143a;
        i iVar = new i(socket);
        OutputStream outputStream = socket.getOutputStream();
        o.l(outputStream, "getOutputStream()");
        return new l5.c(iVar, new l5.c(outputStream, iVar));
    }

    public static void K(XmlResourceParser xmlResourceParser) {
        int i3 = 1;
        while (i3 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i3++;
            } else if (next == 3) {
                i3--;
            }
        }
    }

    public static final l5.d L(Socket socket) {
        Logger logger = n.f4143a;
        i iVar = new i(socket);
        InputStream inputStream = socket.getInputStream();
        o.l(inputStream, "getInputStream()");
        return new l5.d(iVar, new l5.d(inputStream, (x) iVar));
    }

    public static final void M(Object obj) {
        if (obj instanceof f4.d) {
            throw ((f4.d) obj).f2678d;
        }
    }

    public static final Object[] N(Collection collection) {
        o.m(collection, "collection");
        int size = collection.size();
        Object[] objArr = f1699c;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i3 = 0;
        while (true) {
            int i6 = i3 + 1;
            objArr2[i3] = it.next();
            if (i6 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i7 = ((i6 * 3) + 1) >>> 1;
                if (i7 <= i6) {
                    i7 = 2147483645;
                    if (i6 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i7);
                o.l(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i6);
                o.l(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i3 = i6;
        }
    }

    public static final Object[] O(Collection collection, Object[] objArr) {
        Object[] objArr2;
        o.m(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i3 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    o.j(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i6 = i3 + 1;
                    objArr2[i3] = it.next();
                    if (i6 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i7 = ((i6 * 3) + 1) >>> 1;
                        if (i7 <= i6) {
                            i7 = 2147483645;
                            if (i6 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i7);
                        o.l(objArr2, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i6] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i6);
                        o.l(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i3 = i6;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length <= 0) {
            return objArr;
        } else {
            objArr[0] = null;
            return objArr;
        }
    }

    public static String P(String str) {
        String str2;
        o.m(str, "<this>");
        if (!v4.i.a0("|")) {
            List c02 = v4.i.c0(str);
            int size = (c02.size() * 0) + str.length();
            p.f fVar = p.f.f4370g;
            int v5 = v.v(c02);
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (Object next : c02) {
                int i6 = i3 + 1;
                if (i3 >= 0) {
                    String str3 = (String) next;
                    String str4 = null;
                    if ((i3 == 0 || i3 == v5) && v4.i.a0(str3)) {
                        str3 = null;
                    } else {
                        int length = str3.length();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length) {
                                i7 = -1;
                                break;
                            } else if (!v.B(str3.charAt(i7))) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1 && v4.i.j0(str3, "|", i7, false)) {
                            str4 = str3.substring("|".length() + i7);
                            o.l(str4, "this as java.lang.String).substring(startIndex)");
                        }
                        if (!(str4 == null || (str2 = (String) fVar.i(str4)) == null)) {
                            str3 = str2;
                        }
                    }
                    if (str3 != null) {
                        arrayList.add(str3);
                    }
                    i3 = i6;
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            StringBuilder sb = new StringBuilder(size);
            l.Z(arrayList, sb, "\n", "", "", -1, "...", (o4.c) null);
            String sb2 = sb.toString();
            o.l(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static final c1 Q(i4.d dVar, h hVar, Object obj) {
        c1 c1Var;
        if (!(dVar instanceof k4.d)) {
            return null;
        }
        if (!(hVar.l(d1.f5480d) != null)) {
            return null;
        }
        k4.d dVar2 = (k4.d) dVar;
        while (true) {
            if (!(dVar2 instanceof u) && (dVar2 = dVar2.c()) != null) {
                if (dVar2 instanceof c1) {
                    c1Var = (c1) dVar2;
                    break;
                }
            }
        }
        c1Var = null;
        if (c1Var == null) {
            return c1Var;
        }
        throw null;
    }

    public static final void a(c5.a aVar, c5.c cVar, String str) {
        Logger logger = c5.f.f1679i;
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f1675f);
        sb.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        o.l(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(aVar.f1666c);
        logger.fine(sb.toString());
    }

    public static final void b(StringBuilder sb, Object obj, o4.c cVar) {
        CharSequence charSequence;
        if (cVar != null) {
            obj = cVar.i(obj);
        } else {
            if (!(obj == null ? true : obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    sb.append(((Character) obj).charValue());
                    return;
                }
                charSequence = String.valueOf(obj);
                sb.append(charSequence);
            }
        }
        charSequence = (CharSequence) obj;
        sb.append(charSequence);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r10.right <= r12.left) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r10.left >= r12.right) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = d(r9, r10, r11)
            boolean r1 = d(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L_0x007d
            if (r0 != 0) goto L_0x000f
            goto L_0x007d
        L_0x000f:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L_0x003d
            if (r9 == r3) goto L_0x0036
            if (r9 == r4) goto L_0x002f
            if (r9 != r1) goto L_0x0029
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L_0x0045
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x002f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L_0x0045
            goto L_0x0043
        L_0x0036:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L_0x0045
            goto L_0x0043
        L_0x003d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L_0x0045
        L_0x0043:
            r7 = r6
            goto L_0x0046
        L_0x0045:
            r7 = r2
        L_0x0046:
            if (r7 != 0) goto L_0x0049
            return r6
        L_0x0049:
            if (r9 == r5) goto L_0x007c
            if (r9 != r4) goto L_0x004e
            goto L_0x007c
        L_0x004e:
            int r11 = w(r9, r10, r11)
            if (r9 == r5) goto L_0x006f
            if (r9 == r3) goto L_0x006a
            if (r9 == r4) goto L_0x0065
            if (r9 != r1) goto L_0x005f
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L_0x0073
        L_0x005f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x0065:
            int r9 = r12.right
            int r10 = r10.right
            goto L_0x0073
        L_0x006a:
            int r9 = r10.top
            int r10 = r12.top
            goto L_0x0073
        L_0x006f:
            int r9 = r10.left
            int r10 = r12.left
        L_0x0073:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L_0x007b
            r2 = r6
        L_0x007b:
            return r2
        L_0x007c:
            return r6
        L_0x007d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.c(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean d(int i3, Rect rect, Rect rect2) {
        if (i3 != 17) {
            if (i3 != 33) {
                if (i3 != 66) {
                    if (i3 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static void e(long j6, l5.g gVar, int i3, ArrayList arrayList, int i6, int i7, ArrayList arrayList2) {
        int i8;
        int i9;
        l5.g gVar2;
        int i10;
        long j7;
        int i11;
        l5.g gVar3;
        l5.g gVar4 = gVar;
        int i12 = i3;
        ArrayList arrayList3 = arrayList;
        int i13 = i6;
        int i14 = i7;
        ArrayList arrayList4 = arrayList2;
        if (i13 < i14) {
            int i15 = i13;
            while (i15 < i14) {
                if (((j) arrayList3.get(i15)).b() >= i12) {
                    i15++;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            j jVar = (j) arrayList.get(i6);
            j jVar2 = (j) arrayList3.get(i14 - 1);
            int i16 = -1;
            if (i12 == jVar.b()) {
                int intValue = ((Number) arrayList4.get(i13)).intValue();
                int i17 = i13 + 1;
                j jVar3 = (j) arrayList3.get(i17);
                i8 = i17;
                i9 = intValue;
                jVar = jVar3;
            } else {
                i8 = i13;
                i9 = -1;
            }
            if (jVar.e(i12) != jVar2.e(i12)) {
                int i18 = 1;
                for (int i19 = i8 + 1; i19 < i14; i19++) {
                    if (((j) arrayList3.get(i19 - 1)).e(i12) != ((j) arrayList3.get(i19)).e(i12)) {
                        i18++;
                    }
                }
                long j8 = (long) 4;
                long j9 = ((long) (i18 * 2)) + (gVar4.f4128e / j8) + j6 + ((long) 2);
                gVar4.I(i18);
                gVar4.I(i9);
                for (int i20 = i8; i20 < i14; i20++) {
                    byte e6 = ((j) arrayList3.get(i20)).e(i12);
                    if (i20 == i8 || e6 != ((j) arrayList3.get(i20 - 1)).e(i12)) {
                        gVar4.I(e6 & 255);
                    }
                }
                l5.g gVar5 = new l5.g();
                while (i8 < i14) {
                    byte e7 = ((j) arrayList3.get(i8)).e(i12);
                    int i21 = i8 + 1;
                    int i22 = i21;
                    while (true) {
                        if (i22 >= i14) {
                            i10 = i14;
                            break;
                        } else if (e7 != ((j) arrayList3.get(i22)).e(i12)) {
                            i10 = i22;
                            break;
                        } else {
                            i22++;
                        }
                    }
                    if (i21 == i10 && i12 + 1 == ((j) arrayList3.get(i8)).b()) {
                        gVar4.I(((Number) arrayList4.get(i8)).intValue());
                        i11 = i10;
                        gVar3 = gVar5;
                        j7 = j8;
                    } else {
                        gVar4.I(((int) ((gVar5.f4128e / j8) + j9)) * i16);
                        i11 = i10;
                        gVar3 = gVar5;
                        j7 = j8;
                        e(j9, gVar5, i12 + 1, arrayList, i8, i11, arrayList2);
                    }
                    gVar5 = gVar3;
                    i8 = i11;
                    j8 = j7;
                    i16 = -1;
                }
                gVar2 = gVar5;
            } else {
                int min = Math.min(jVar.b(), jVar2.b());
                int i23 = i12;
                int i24 = 0;
                while (i23 < min && jVar.e(i23) == jVar2.e(i23)) {
                    i24++;
                    i23++;
                }
                long j10 = (long) 4;
                long j11 = (gVar4.f4128e / j10) + j6 + ((long) 2) + ((long) i24) + 1;
                gVar4.I(-i24);
                gVar4.I(i9);
                int i25 = i12 + i24;
                while (i12 < i25) {
                    gVar4.I(jVar.e(i12) & 255);
                    i12++;
                }
                if (i8 + 1 == i14) {
                    if (i25 == ((j) arrayList3.get(i8)).b()) {
                        gVar4.I(((Number) arrayList4.get(i8)).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                gVar2 = new l5.g();
                gVar4.I(((int) ((gVar2.f4128e / j10) + j11)) * -1);
                e(j11, gVar2, i25, arrayList, i8, i7, arrayList2);
            }
            gVar4.F(gVar2);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final boolean f(Object obj) {
        if (obj instanceof p.h) {
            l.d dVar = (l.d) ((p.h) obj);
            e eVar = dVar.f4049d;
            if (eVar != l.a.f4047a && eVar != l.f.f4051a && eVar != l.c.f4048a) {
                return false;
            }
            Object a6 = dVar.a();
            if (a6 == null) {
                return true;
            }
            return f(a6);
        } else if ((obj instanceof f4.a) && (obj instanceof Serializable)) {
            return false;
        } else {
            Class[] clsArr = f1697a;
            for (int i3 = 0; i3 < 7; i3++) {
                if (clsArr[i3].isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static int g(float f6) {
        return ((int) (((double) f6) + 16384.999999999996d)) - 16384;
    }

    public static void h(boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException();
        }
    }

    public static d i(int i3) {
        return i3 != 0 ? i3 != 1 ? new p3.i() : new p3.d() : new p3.i();
    }

    public static p3.e j() {
        return new p3.e(0);
    }

    public static final f4.d k(Throwable th) {
        o.m(th, "exception");
        return new f4.d(th);
    }

    public static int l(float f6) {
        return ((int) (((double) f6) + 16384.0d)) - 16384;
    }

    public static final h m(h hVar, h hVar2, boolean z5) {
        Boolean bool = Boolean.FALSE;
        k kVar = k.f903i;
        boolean booleanValue = ((Boolean) hVar.q(bool, kVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.q(bool, kVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.p(hVar2);
        }
        p4.i iVar = new p4.i();
        iVar.f4865d = hVar2;
        i4.i iVar2 = i4.i.f3606d;
        h hVar3 = (h) hVar.q(iVar2, new v4.h(2, iVar, z5));
        if (booleanValue2) {
            iVar.f4865d = ((h) iVar.f4865d).q(iVar2, k.f902h);
        }
        return hVar3.p((h) iVar.f4865d);
    }

    public static final String n(long j6) {
        StringBuilder sb;
        long j7;
        StringBuilder sb2;
        long j8;
        StringBuilder sb3;
        long j9;
        if (j6 <= ((long) -999500000)) {
            sb = new StringBuilder();
            j7 = j6 - ((long) 500000000);
        } else {
            if (j6 <= ((long) -999500)) {
                sb2 = new StringBuilder();
                j8 = j6 - ((long) 500000);
            } else {
                if (j6 <= 0) {
                    sb3 = new StringBuilder();
                    j9 = j6 - ((long) 500);
                } else if (j6 < ((long) 999500)) {
                    sb3 = new StringBuilder();
                    j9 = j6 + ((long) 500);
                } else if (j6 < ((long) 999500000)) {
                    sb2 = new StringBuilder();
                    j8 = j6 + ((long) 500000);
                } else {
                    sb = new StringBuilder();
                    j7 = j6 + ((long) 500000000);
                }
                sb3.append(j9 / ((long) 1000));
                sb3.append(" µs");
                String format = String.format("%6s", Arrays.copyOf(new Object[]{sb3.toString()}, 1));
                o.l(format, "java.lang.String.format(format, *args)");
                return format;
            }
            sb3.append(j8 / ((long) 1000000));
            sb3.append(" ms");
            String format2 = String.format("%6s", Arrays.copyOf(new Object[]{sb3.toString()}, 1));
            o.l(format2, "java.lang.String.format(format, *args)");
            return format2;
        }
        sb3.append(j7 / ((long) 1000000000));
        sb3.append(" s ");
        String format22 = String.format("%6s", Arrays.copyOf(new Object[]{sb3.toString()}, 1));
        o.l(format22, "java.lang.String.format(format, *args)");
        return format22;
    }

    public static float o(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b1.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void p(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            m.o(it.next());
            throw null;
        }
    }

    public static float q(String[] strArr, int i3) {
        float parseFloat = Float.parseFloat(strArr[i3]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static ArrayList r(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < toolbar.getChildCount(); i3++) {
            View childAt = toolbar.getChildAt(i3);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static final void s(h hVar, Throwable th) {
        try {
            w4.m mVar = (w4.m) hVar.l(androidx.compose.ui.platform.e.f896m);
            if (mVar != null) {
                mVar.i(hVar, th);
            } else {
                w4.n.a(hVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                o.a(runtimeException, th);
                th = runtimeException;
            }
            w4.n.a(hVar, th);
        }
    }

    public static final boolean t(AssertionError assertionError) {
        Logger logger = n.f4143a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? v4.i.R(message, "getsockname failed") : false;
    }

    public static boolean u(int i3, Rect rect, Rect rect2) {
        if (i3 == 17) {
            int i6 = rect.right;
            int i7 = rect2.right;
            return (i6 > i7 || rect.left >= i7) && rect.left > rect2.left;
        } else if (i3 == 33) {
            int i8 = rect.bottom;
            int i9 = rect2.bottom;
            return (i8 > i9 || rect.top >= i9) && rect.top > rect2.top;
        } else if (i3 == 66) {
            int i10 = rect.left;
            int i11 = rect2.left;
            return (i10 < i11 || rect.right <= i11) && rect.right < rect2.right;
        } else if (i3 == 130) {
            int i12 = rect.top;
            int i13 = rect2.top;
            return (i12 < i13 || rect.bottom <= i13) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static boolean v(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int w(int i3, Rect rect, Rect rect2) {
        int i6;
        int i7;
        if (i3 == 17) {
            i7 = rect.left;
            i6 = rect2.right;
        } else if (i3 == 33) {
            i7 = rect.top;
            i6 = rect2.bottom;
        } else if (i3 == 66) {
            i7 = rect2.left;
            i6 = rect.right;
        } else if (i3 == 130) {
            i7 = rect2.top;
            i6 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i7 - i6);
    }

    public static int x(int i3, Rect rect, Rect rect2) {
        int i6;
        int i7;
        int i8;
        if (i3 != 17) {
            if (i3 != 33) {
                if (i3 != 66) {
                    if (i3 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            i7 = (rect.width() / 2) + rect.left;
            i8 = rect2.left;
            i6 = rect2.width();
            return Math.abs(i7 - ((i6 / 2) + i8));
        }
        i7 = (rect.height() / 2) + rect.top;
        i8 = rect2.top;
        i6 = rect2.height();
        return Math.abs(i7 - ((i6 / 2) + i8));
    }

    public static float y(EdgeEffect edgeEffect, float f6, float f7) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b1.e.c(edgeEffect, f6, f7);
        }
        b1.d.a(edgeEffect, f6, f7);
        return f6;
    }

    public static p0.e z(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        Resources resources2 = resources;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, (String) null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), m0.a.f4169b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != 3) {
                        if (xmlResourceParser.getEventType() == 2) {
                            if (xmlResourceParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), m0.a.f4170c);
                                int i3 = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i3 = 1;
                                }
                                int i6 = obtainAttributes2.getInt(i3, 400);
                                boolean z5 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                                int i7 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i7 = 3;
                                }
                                int i8 = 7;
                                if (!obtainAttributes2.hasValue(7)) {
                                    i8 = 4;
                                }
                                String string5 = obtainAttributes2.getString(i8);
                                int i9 = obtainAttributes2.getInt(i7, 0);
                                int i10 = obtainAttributes2.hasValue(5) ? 5 : 0;
                                int resourceId2 = obtainAttributes2.getResourceId(i10, 0);
                                String string6 = obtainAttributes2.getString(i10);
                                obtainAttributes2.recycle();
                                while (xmlResourceParser.next() != 3) {
                                    K(xmlResourceParser);
                                }
                                arrayList.add(new p0.g(i6, i9, resourceId2, string6, string5, z5));
                            } else {
                                K(xmlResourceParser);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new p0.f((p0.g[]) arrayList.toArray(new p0.g[0]));
                    }
                } else {
                    while (xmlResourceParser.next() != 3) {
                        K(xmlResourceParser);
                    }
                    return new p0.h(new r(string, string2, string3, B(resourceId, resources2)), integer, integer2, string4);
                }
            } else {
                K(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
