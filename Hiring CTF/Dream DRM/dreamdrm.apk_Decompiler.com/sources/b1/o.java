package b1;

import a2.m;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.ui.platform.e;
import androidx.compose.ui.platform.k;
import b2.h;
import com.bumptech.glide.c;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.theori.dreamdrm.R;
import h2.w;
import i4.f;
import i4.g;
import i4.i;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlinx.coroutines.internal.r;
import kotlinx.coroutines.internal.u;
import r0.b;
import w4.r0;
import w4.w0;
import w4.y0;
import x0.c0;
import x0.d0;
import x0.e0;
import x0.u0;
import x3.a;
import y1.d;
import z4.v;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static long f1514a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f1515b;

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1516c = new int[0];

    /* renamed from: d  reason: collision with root package name */
    public static final Object[] f1517d = new Object[0];

    /* renamed from: e  reason: collision with root package name */
    public static final e f1518e = new e();

    /* renamed from: f  reason: collision with root package name */
    public static final e f1519f = new e();

    /* renamed from: g  reason: collision with root package name */
    public static final e f1520g = new e();

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f1521h = new int[0];

    /* renamed from: i  reason: collision with root package name */
    public static final Object[] f1522i = new Object[0];

    /* renamed from: j  reason: collision with root package name */
    public static final r f1523j = new r("NO_THREAD_ELEMENTS");

    /* renamed from: k  reason: collision with root package name */
    public static final float[][] f1524k = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: l  reason: collision with root package name */
    public static final float[][] f1525l = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: m  reason: collision with root package name */
    public static final float[] f1526m = {95.047f, 100.0f, 108.883f};

    /* renamed from: n  reason: collision with root package name */
    public static final float[][] f1527n = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f1528o = {16842752, R.attr.theme};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f1529p = {R.attr.materialThemeOverlay};

    /* renamed from: q  reason: collision with root package name */
    public static final Type[] f1530q = new Type[0];

    public static Class A(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            c.h(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(A(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return A(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    public static Type B(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        c.h(cls2.isAssignableFrom(cls));
        return T(type, cls, x(type, cls, cls2), new HashMap());
    }

    /* JADX INFO: finally extract failed */
    public static ImageHeaderParser$ImageType C(h hVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, hVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            try {
                ImageHeaderParser$ImageType b6 = ((d) list.get(i3)).b(inputStream);
                inputStream.reset();
                if (b6 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return b6;
                }
                i3++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static boolean D() {
        try {
            if (f1515b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        Class<Trace> cls = Trace.class;
        try {
            if (f1515b == null) {
                f1514a = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                f1515b = cls.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f1515b.invoke((Object) null, new Object[]{Long.valueOf(f1514a)})).booleanValue();
        } catch (Exception e6) {
            if (e6 instanceof InvocationTargetException) {
                Throwable cause = e6.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e6);
            return false;
        }
    }

    public static boolean E(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean F(View view) {
        WeakHashMap weakHashMap = u0.f5622a;
        return e0.d(view) == 1;
    }

    public static final w0 G(w4.o oVar, i4.h hVar, int i3, o4.e eVar) {
        i4.h m6 = c.m(oVar.d(), hVar, true);
        kotlinx.coroutines.scheduling.d dVar = w4.w.f5529a;
        if (m6 != dVar && m6.l(e.f892i) == null) {
            m6 = m6.p(dVar);
        }
        if (i3 != 0) {
            w0 r0Var = i3 == 2 ? new r0(m6, eVar) : new w0(m6, true);
            r0Var.U(i3, r0Var, eVar);
            return r0Var;
        }
        throw null;
    }

    public static float H(int i3) {
        float f6 = ((float) i3) / 255.0f;
        return (f6 <= 0.04045f ? f6 / 12.92f : (float) Math.pow((double) ((f6 + 0.055f) / 1.055f), 2.4000000953674316d)) * 100.0f;
    }

    public static final int I(int i3) {
        if (i3 < 0) {
            return i3;
        }
        if (i3 < 3) {
            return i3 + 1;
        }
        if (i3 < 1073741824) {
            return (int) ((((float) i3) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static i4.h J(f fVar, g gVar) {
        m(gVar, "key");
        return c(fVar.getKey(), gVar) ? i.f3606d : fVar;
    }

    public static PorterDuff.Mode K(int i3, PorterDuff.Mode mode) {
        if (i3 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i3 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i3 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i3) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static final boolean L(String str) {
        m(str, "method");
        return !c(str, "GET") && !c(str, "HEAD");
    }

    public static void M(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j6 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Animator animator = (Animator) arrayList.get(i3);
            j6 = Math.max(j6, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j6);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static i4.h N(f fVar, i4.h hVar) {
        m(hVar, "context");
        return v.K(fVar, hVar);
    }

    public static byte[] O(InputStream inputStream, int i3) {
        byte[] bArr = new byte[i3];
        int i6 = 0;
        while (i6 < i3) {
            int read = inputStream.read(bArr, i6, i3 - i6);
            if (read >= 0) {
                i6 += read;
            } else {
                throw new IllegalStateException(m.g("Not enough bytes to read: ", i3));
            }
        }
        return bArr;
    }

    public static byte[] P(FileInputStream fileInputStream, int i3, int i6) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i6];
            byte[] bArr2 = new byte[2048];
            int i7 = 0;
            int i8 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i7 < i3) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i8 += inflater.inflate(bArr, i8, i6 - i8);
                    i7 += read;
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i3 + " bytes");
                }
            }
            if (i7 != i3) {
                throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i3 + " actual=" + i7);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw new IllegalStateException("Inflater did not finish");
            }
        } catch (DataFormatException e6) {
            throw new IllegalStateException(e6.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static long Q(InputStream inputStream, int i3) {
        byte[] O = O(inputStream, i3);
        long j6 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            j6 += ((long) (O[i6] & 255)) << (i6 * 8);
        }
        return j6;
    }

    public static int R(InputStream inputStream) {
        return (int) Q(inputStream, 2);
    }

    public static void S(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            b.h(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: x3.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: x3.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: java.lang.reflect.ParameterizedType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x013f A[EDGE_INSN: B:79:0x013f->B:74:0x013f ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type T(java.lang.reflect.Type r9, java.lang.Class r10, java.lang.reflect.Type r11, java.util.HashMap r12) {
        /*
            r0 = 0
            r1 = r0
        L_0x0002:
            boolean r2 = r11 instanceof java.lang.reflect.TypeVariable
            r3 = 0
            if (r2 == 0) goto L_0x005e
            r2 = r11
            java.lang.reflect.TypeVariable r2 = (java.lang.reflect.TypeVariable) r2
            java.lang.Object r4 = r12.get(r2)
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
            if (r4 == 0) goto L_0x0019
            java.lang.Class r9 = java.lang.Void.TYPE
            if (r4 != r9) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r11 = r4
        L_0x0018:
            return r11
        L_0x0019:
            java.lang.Class r11 = java.lang.Void.TYPE
            r12.put(r2, r11)
            if (r1 != 0) goto L_0x0021
            r1 = r2
        L_0x0021:
            java.lang.reflect.GenericDeclaration r11 = r2.getGenericDeclaration()
            boolean r4 = r11 instanceof java.lang.Class
            if (r4 == 0) goto L_0x002c
            java.lang.Class r11 = (java.lang.Class) r11
            goto L_0x002d
        L_0x002c:
            r11 = r0
        L_0x002d:
            if (r11 != 0) goto L_0x0030
            goto L_0x0059
        L_0x0030:
            java.lang.reflect.Type r4 = x(r9, r10, r11)
            boolean r5 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L_0x0059
            java.lang.reflect.TypeVariable[] r11 = r11.getTypeParameters()
            int r5 = r11.length
        L_0x003d:
            if (r3 >= r5) goto L_0x0053
            r6 = r11[r3]
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x0050
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r11 = r4.getActualTypeArguments()
            r11 = r11[r3]
            goto L_0x005a
        L_0x0050:
            int r3 = r3 + 1
            goto L_0x003d
        L_0x0053:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException
            r9.<init>()
            throw r9
        L_0x0059:
            r11 = r2
        L_0x005a:
            if (r11 != r2) goto L_0x0002
            goto L_0x013f
        L_0x005e:
            boolean r0 = r11 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0082
            r0 = r11
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x0082
            java.lang.Class r11 = r0.getComponentType()
            java.lang.reflect.Type r9 = T(r9, r10, r11, r12)
            boolean r10 = java.util.Objects.equals(r11, r9)
            if (r10 == 0) goto L_0x007c
            r11 = r0
            goto L_0x013f
        L_0x007c:
            x3.a r10 = new x3.a
            r10.<init>(r9)
            goto L_0x009d
        L_0x0082:
            boolean r0 = r11 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x00a0
            java.lang.reflect.GenericArrayType r11 = (java.lang.reflect.GenericArrayType) r11
            java.lang.reflect.Type r0 = r11.getGenericComponentType()
            java.lang.reflect.Type r9 = T(r9, r10, r0, r12)
            boolean r10 = java.util.Objects.equals(r0, r9)
            if (r10 == 0) goto L_0x0098
            goto L_0x013f
        L_0x0098:
            x3.a r10 = new x3.a
            r10.<init>(r9)
        L_0x009d:
            r11 = r10
            goto L_0x013f
        L_0x00a0:
            boolean r0 = r11 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00e4
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r0 = r11.getOwnerType()
            java.lang.reflect.Type r4 = T(r9, r10, r0, r12)
            boolean r0 = java.util.Objects.equals(r4, r0)
            r0 = r0 ^ r2
            java.lang.reflect.Type[] r5 = r11.getActualTypeArguments()
            int r6 = r5.length
        L_0x00b9:
            if (r3 >= r6) goto L_0x00d8
            r7 = r5[r3]
            java.lang.reflect.Type r7 = T(r9, r10, r7, r12)
            r8 = r5[r3]
            boolean r8 = java.util.Objects.equals(r7, r8)
            if (r8 != 0) goto L_0x00d5
            if (r0 != 0) goto L_0x00d3
            java.lang.Object r0 = r5.clone()
            r5 = r0
            java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
            r0 = r2
        L_0x00d3:
            r5[r3] = r7
        L_0x00d5:
            int r3 = r3 + 1
            goto L_0x00b9
        L_0x00d8:
            if (r0 == 0) goto L_0x013f
            java.lang.reflect.Type r9 = r11.getRawType()
            x3.b r10 = new x3.b
            r10.<init>(r4, r9, r5)
            goto L_0x009d
        L_0x00e4:
            boolean r0 = r11 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x013f
            java.lang.reflect.WildcardType r11 = (java.lang.reflect.WildcardType) r11
            java.lang.reflect.Type[] r0 = r11.getLowerBounds()
            java.lang.reflect.Type[] r4 = r11.getUpperBounds()
            int r5 = r0.length
            if (r5 != r2) goto L_0x011b
            r4 = r0[r3]
            java.lang.reflect.Type r9 = T(r9, r10, r4, r12)
            r10 = r0[r3]
            if (r9 == r10) goto L_0x013f
            boolean r10 = r9 instanceof java.lang.reflect.WildcardType
            if (r10 == 0) goto L_0x010a
            java.lang.reflect.WildcardType r9 = (java.lang.reflect.WildcardType) r9
            java.lang.reflect.Type[] r9 = r9.getLowerBounds()
            goto L_0x010f
        L_0x010a:
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            r10[r3] = r9
            r9 = r10
        L_0x010f:
            x3.c r11 = new x3.c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r3] = r0
            r11.<init>(r10, r9)
            goto L_0x013f
        L_0x011b:
            int r0 = r4.length
            if (r0 != r2) goto L_0x013f
            r0 = r4[r3]
            java.lang.reflect.Type r9 = T(r9, r10, r0, r12)
            r10 = r4[r3]
            if (r9 == r10) goto L_0x013f
            boolean r10 = r9 instanceof java.lang.reflect.WildcardType
            if (r10 == 0) goto L_0x0133
            java.lang.reflect.WildcardType r9 = (java.lang.reflect.WildcardType) r9
            java.lang.reflect.Type[] r9 = r9.getUpperBounds()
            goto L_0x0138
        L_0x0133:
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            r10[r3] = r9
            r9 = r10
        L_0x0138:
            x3.c r11 = new x3.c
            java.lang.reflect.Type[] r10 = f1530q
            r11.<init>(r9, r10)
        L_0x013f:
            if (r1 == 0) goto L_0x0144
            r12.put(r1, r11)
        L_0x0144:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.o.T(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashMap):java.lang.reflect.Type");
    }

    public static final void U(i4.h hVar, Object obj) {
        if (obj != f1523j) {
            if (obj instanceof u) {
                y0[] y0VarArr = ((u) obj).f4006b;
                int length = y0VarArr.length - 1;
                if (length >= 0) {
                    y0 y0Var = y0VarArr[length];
                    k((Object) null);
                    throw null;
                }
                return;
            }
            Object q5 = hVar.q((Object) null, k.f905k);
            if (q5 != null) {
                m.o(q5);
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    public static void V(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i3 = -1;
        for (int i6 = 0; i6 < length; i6++) {
            if (str.equals(stackTrace[i6].getClassName())) {
                i3 = i6;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i3 + 1, length));
    }

    public static void W(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = u0.f5622a;
        boolean a6 = c0.a(checkableImageButton);
        boolean z5 = false;
        int i3 = 1;
        boolean z6 = onLongClickListener != null;
        if (a6 || z6) {
            z5 = true;
        }
        checkableImageButton.setFocusable(z5);
        checkableImageButton.setClickable(a6);
        checkableImageButton.setPressable(a6);
        checkableImageButton.setLongClickable(z6);
        if (!z5) {
            i3 = 2;
        }
        d0.s(checkableImageButton, i3);
    }

    public static final Object X(i4.h hVar) {
        Object q5 = hVar.q(0, k.f904j);
        k(q5);
        return q5;
    }

    public static void Y(String str) {
        f4.g gVar = new f4.g(m.i("lateinit property ", str, " has not been initialized"));
        V(o.class.getName(), gVar);
        throw gVar;
    }

    public static final Map Z(LinkedHashMap linkedHashMap) {
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        l(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public static final void a(Throwable th, Throwable th2) {
        m(th, "<this>");
        m(th2, "exception");
        if (th != th2) {
            l4.c.f4111a.a(th, th2);
        }
    }

    public static String a0(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static void b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                b.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                b.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                b.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final Object b0(i4.h hVar, Object obj) {
        if (obj == null) {
            obj = X(hVar);
        }
        if (obj == 0) {
            return f1523j;
        }
        if (obj instanceof Integer) {
            return hVar.q(new u(hVar, ((Number) obj).intValue()), k.f906l);
        }
        m.o(obj);
        throw null;
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static Context c0(Context context, AttributeSet attributeSet, int i3, int i6) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1529p, i3, i6);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z5 = (context instanceof g.f) && ((g.f) context).f2713a == resourceId;
        if (resourceId == 0 || z5) {
            return context;
        }
        g.f fVar = new g.f(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1528o);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            fVar.getTheme().applyStyle(resourceId2, true);
        }
        return fVar;
    }

    public static int d(int i3, int i6, int[] iArr) {
        int i7 = i3 - 1;
        int i8 = 0;
        while (i8 <= i7) {
            int i9 = (i8 + i7) >>> 1;
            int i10 = iArr[i9];
            if (i10 < i6) {
                i8 = i9 + 1;
            } else if (i10 <= i6) {
                return i9;
            } else {
                i7 = i9 - 1;
            }
        }
        return ~i8;
    }

    public static void d0(ByteArrayOutputStream byteArrayOutputStream, long j6, int i3) {
        byte[] bArr = new byte[i3];
        for (int i6 = 0; i6 < i3; i6++) {
            bArr[i6] = (byte) ((int) ((j6 >> (i6 * 8)) & 255));
        }
        byteArrayOutputStream.write(bArr);
    }

    public static int e(long[] jArr, int i3, long j6) {
        int i6 = i3 - 1;
        int i7 = 0;
        while (i7 <= i6) {
            int i8 = (i7 + i6) >>> 1;
            int i9 = (jArr[i8] > j6 ? 1 : (jArr[i8] == j6 ? 0 : -1));
            if (i9 < 0) {
                i7 = i8 + 1;
            } else if (i9 <= 0) {
                return i8;
            } else {
                i6 = i8 - 1;
            }
        }
        return ~i7;
    }

    public static void e0(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        d0(byteArrayOutputStream, (long) i3, 2);
    }

    public static final int f(int i3, int i6, int[] iArr) {
        m(iArr, "<this>");
        int i7 = i3 - 1;
        int i8 = 0;
        while (i8 <= i7) {
            int i9 = (i8 + i7) >>> 1;
            int i10 = iArr[i9];
            if (i10 < i6) {
                i8 = i9 + 1;
            } else if (i10 <= i6) {
                return i9;
            } else {
                i7 = i9 - 1;
            }
        }
        return ~i8;
    }

    public static float f0() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static Type g(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(g(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new x3.b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new x3.c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    public static void h(String str, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void i(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument must not be null");
        }
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str);
            V(o.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static void k(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            V(o.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
            V(o.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Class<o> cls = o.class;
            String name = cls.getName();
            int i3 = 0;
            while (!stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            while (stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            StackTraceElement stackTraceElement = stackTrace[i3];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str);
            V(cls.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static void n(Type type) {
        c.h(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    public static int o(int i3, int i6) {
        if (i3 < i6) {
            return -1;
        }
        return i3 == i6 ? 0 : 1;
    }

    public static byte[] p(byte[] bArr) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    public static ImageView.ScaleType q(int i3) {
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 5 ? i3 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static boolean r(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return r(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
    }

    public static f s(f fVar, g gVar) {
        m(gVar, "key");
        if (c(fVar.getKey(), gVar)) {
            return fVar;
        }
        return null;
    }

    public static v t(String str) {
        Matcher matcher = v.f6079c.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            l(group, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            l(locale, "Locale.US");
            l(group.toLowerCase(locale), "(this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            l(group2, "typeSubtype.group(2)");
            l(group2.toLowerCase(locale), "(this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = v.f6080d.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group3 = matcher2.group(1);
                    if (group3 != null) {
                        String group4 = matcher2.group(2);
                        if (group4 == null) {
                            group4 = matcher2.group(3);
                        } else if (v4.i.k0(group4, "'", false) && group4.endsWith("'") && group4.length() > 2) {
                            group4 = group4.substring(1, group4.length() - 1);
                            l(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        }
                        arrayList.add(group3);
                        arrayList.add(group4);
                    }
                    end = matcher2.end();
                } else {
                    StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                    String substring = str.substring(end);
                    l(substring, "(this as java.lang.String).substring(startIndex)");
                    sb.append(substring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append('\"');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new v(str, (String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = n0.b.a(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList u(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = n0.b.a(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.o.u(android.content.Context, android.content.res.TypedArray, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = n0.b.a(r1, (r0 = r2.i(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList v(android.content.Context r1, androidx.appcompat.widget.m3 r2, int r3) {
        /*
            boolean r0 = r2.l(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.i(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = n0.b.a(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.content.res.ColorStateList r1 = r2.b(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.o.v(android.content.Context, androidx.appcompat.widget.m3, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = w4.p.n(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable w(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r1 = w4.p.n(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.o.w(android.content.Context, android.content.res.TypedArray, int):android.graphics.drawable.Drawable");
    }

    public static Type x(Type type, Class<? super Object> cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i3 = 0; i3 < length; i3++) {
                Class cls3 = interfaces[i3];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i3];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return x(cls.getGenericInterfaces()[i3], interfaces[i3], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return x(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static final Class y(t4.b bVar) {
        m(bVar, "<this>");
        Class a6 = ((p4.b) bVar).a();
        if (!a6.isPrimitive()) {
            return a6;
        }
        String name = a6.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? a6 : Double.class;
            case 104431:
                return !name.equals("int") ? a6 : Integer.class;
            case 3039496:
                return !name.equals("byte") ? a6 : Byte.class;
            case 3052374:
                return !name.equals("char") ? a6 : Character.class;
            case 3327612:
                return !name.equals("long") ? a6 : Long.class;
            case 3625364:
                return !name.equals("void") ? a6 : Void.class;
            case 64711720:
                return !name.equals("boolean") ? a6 : Boolean.class;
            case 97526364:
                return !name.equals("float") ? a6 : Float.class;
            case 109413500:
                return !name.equals("short") ? a6 : Short.class;
            default:
                return a6;
        }
    }

    public static int z(h hVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, hVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            try {
                int c6 = ((d) list.get(i3)).c(inputStream, hVar);
                if (c6 != -1) {
                    return c6;
                }
                i3++;
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }
}
