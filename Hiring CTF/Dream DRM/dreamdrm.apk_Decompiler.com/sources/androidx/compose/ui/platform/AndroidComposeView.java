package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.lifecycle.d;
import androidx.lifecycle.r;
import b1.o;
import com.bumptech.glide.e;
import d0.a;
import d0.c;
import java.lang.reflect.Method;
import q.b;
import x0.v0;
import y.f;
import y.g;
import y.k;
import y.l;

@SuppressLint({"ViewConstructor", "VisibleForTests"})
public final class AndroidComposeView extends ViewGroup implements l, d {

    /* renamed from: m  reason: collision with root package name */
    public static Class f875m;

    /* renamed from: n  reason: collision with root package name */
    public static Method f876n;

    /* renamed from: d  reason: collision with root package name */
    public c f877d;

    /* renamed from: e  reason: collision with root package name */
    public o4.c f878e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f879f;

    /* renamed from: g  reason: collision with root package name */
    public g f880g;

    /* renamed from: h  reason: collision with root package name */
    public a f881h;

    /* renamed from: i  reason: collision with root package name */
    public long f882i;

    /* renamed from: j  reason: collision with root package name */
    public int f883j;

    /* renamed from: k  reason: collision with root package name */
    public MotionEvent f884k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f885l;

    static {
        new e(0, 0);
    }

    public static f4.c c(int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            return new f4.c(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return new f4.c(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return new f4.c(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    public static View d(View view, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (o.c(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i3))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            o.l(childAt, "currentView.getChildAt(i)");
            View d6 = d(childAt, i3);
            if (d6 != null) {
                return d6;
            }
        }
        return null;
    }

    public static void e(f fVar) {
        fVar.getClass();
        throw null;
    }

    public static boolean f(MotionEvent motionEvent) {
        float x5 = motionEvent.getX();
        if (!(!Float.isInfinite(x5) && !Float.isNaN(x5))) {
            return true;
        }
        float y5 = motionEvent.getY();
        if (!(!Float.isInfinite(y5) && !Float.isNaN(y5))) {
            return true;
        }
        float rawX = motionEvent.getRawX();
        if (!(!Float.isInfinite(rawX) && !Float.isNaN(rawX))) {
            return true;
        }
        float rawY = motionEvent.getRawY();
        return !(!Float.isInfinite(rawY) && !Float.isNaN(rawY));
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    private void setFontFamilyResolver(b0.d dVar) {
        throw null;
    }

    private void setLayoutDirection(d0.d dVar) {
        throw null;
    }

    private final void setViewTreeOwners(f fVar) {
        throw null;
    }

    public final void a(r rVar) {
        Object obj;
        boolean z5 = false;
        try {
            if (f875m == null) {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                f875m = cls;
                f876n = cls.getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE});
            }
            Method method = f876n;
            Boolean bool = null;
            if (method != null) {
                obj = method.invoke((Object) null, new Object[]{"debug.layout", Boolean.FALSE});
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                bool = (Boolean) obj;
            }
            if (bool != null) {
                z5 = bool.booleanValue();
            }
        } catch (Exception unused) {
        }
        setShowLayoutBounds(z5);
    }

    public final void autofill(SparseArray sparseArray) {
        o.m(sparseArray, "values");
    }

    public final boolean canScrollHorizontally(int i3) {
        throw null;
    }

    public final boolean canScrollVertically(int i3) {
        throw null;
    }

    public final void dispatchDraw(Canvas canvas) {
        o.m(canvas, "canvas");
        if (!isAttachedToWindow()) {
            e(getRoot());
        }
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            throw null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        o.m(motionEvent, "event");
        if (motionEvent.getActionMasked() == 8) {
            if (motionEvent.isFromSource(4194304)) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                motionEvent.getAxisValue(26);
                getContext();
                v0.b(viewConfiguration);
                getContext();
                v0.a(viewConfiguration);
                motionEvent.getEventTime();
                throw null;
            } else if (!f(motionEvent) && isAttachedToWindow()) {
                removeCallbacks((Runnable) null);
                this.f882i = AnimationUtils.currentAnimationTimeMillis();
                throw null;
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "event"
            b1.o.m(r8, r0)
            boolean r0 = r7.f885l
            r1 = 0
            if (r0 != 0) goto L_0x009a
            boolean r0 = f(r8)
            r2 = 0
            if (r0 != 0) goto L_0x0099
            boolean r0 = r7.isAttachedToWindow()
            if (r0 != 0) goto L_0x0019
            goto L_0x0099
        L_0x0019:
            r0 = 4098(0x1002, float:5.743E-42)
            boolean r0 = r8.isFromSource(r0)
            r3 = 1
            if (r0 == 0) goto L_0x002a
            int r0 = r8.getToolType(r2)
            if (r0 == r3) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            throw r1
        L_0x002a:
            int r0 = r8.getActionMasked()
            r4 = 7
            if (r0 == r4) goto L_0x0088
            r4 = 10
            if (r0 != r4) goto L_0x008f
            float r0 = r8.getX()
            float r4 = r8.getY()
            r5 = 0
            int r6 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r6 > 0) goto L_0x004d
            int r6 = r7.getWidth()
            float r6 = (float) r6
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x004d
            r0 = r3
            goto L_0x004e
        L_0x004d:
            r0 = r2
        L_0x004e:
            if (r0 == 0) goto L_0x0064
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x005f
            int r0 = r7.getHeight()
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x005f
            r0 = r3
            goto L_0x0060
        L_0x005f:
            r0 = r2
        L_0x0060:
            if (r0 == 0) goto L_0x0064
            r0 = r3
            goto L_0x0065
        L_0x0064:
            r0 = r2
        L_0x0065:
            if (r0 == 0) goto L_0x008f
            int r0 = r8.getToolType(r2)
            r4 = 3
            if (r0 == r4) goto L_0x0081
            android.view.MotionEvent r0 = r7.f884k
            if (r0 == 0) goto L_0x0075
            r0.recycle()
        L_0x0075:
            android.view.MotionEvent r8 = android.view.MotionEvent.obtainNoHistory(r8)
            r7.f884k = r8
            r7.f885l = r3
            r7.post(r1)
            return r2
        L_0x0081:
            int r8 = r8.getButtonState()
            if (r8 == 0) goto L_0x008f
            return r2
        L_0x0088:
            boolean r8 = r7.g(r8)
            if (r8 != 0) goto L_0x008f
            return r2
        L_0x008f:
            r7.removeCallbacks(r1)
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r7.f882i = r2
            throw r1
        L_0x0099:
            return r2
        L_0x009a:
            r7.removeCallbacks(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        o.m(keyEvent, "event");
        if (!isFocused()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        keyEvent.getMetaState();
        throw null;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        o.m(motionEvent, "motionEvent");
        if (this.f885l) {
            removeCallbacks((Runnable) null);
            MotionEvent motionEvent2 = this.f884k;
            o.k(motionEvent2);
            if (motionEvent.getActionMasked() == 0) {
                if (!((motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                    this.f885l = false;
                }
            }
            throw null;
        }
        if (f(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !g(motionEvent)) {
            return false;
        }
        removeCallbacks((Runnable) null);
        this.f882i = AnimationUtils.currentAnimationTimeMillis();
        throw null;
    }

    public final View findViewByAccessibilityIdTraversal(int i3) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return d(this, i3);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[]{Integer.TYPE});
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, new Object[]{Integer.valueOf(i3)});
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
        }
    }

    public final boolean g(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.f884k) == null) {
            return true;
        }
        if (!(motionEvent.getRawX() == motionEvent2.getRawX())) {
            return true;
        }
        return !((motionEvent.getRawY() > motionEvent2.getRawY() ? 1 : (motionEvent.getRawY() == motionEvent2.getRawY() ? 0 : -1)) == 0);
    }

    public final g getAndroidViewsHandler$ui_release() {
        if (this.f880g == null) {
            Context context = getContext();
            o.l(context, "context");
            g gVar = new g(context);
            this.f880g = gVar;
            addView(gVar);
        }
        g gVar2 = this.f880g;
        o.k(gVar2);
        return gVar2;
    }

    public q.a getAutofill() {
        return null;
    }

    public b getAutofillTree() {
        return null;
    }

    public c getClipboardManager() {
        return null;
    }

    public final o4.c getConfigurationChangeObserver() {
        return this.f878e;
    }

    public d0.b getDensity() {
        return this.f877d;
    }

    public r.a getFocusManager() {
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        o.m(rect, "rect");
        throw null;
    }

    public b0.d getFontFamilyResolver() {
        throw null;
    }

    public b0.c getFontLoader() {
        return null;
    }

    public t.a getHapticFeedBack() {
        return null;
    }

    public boolean getHasPendingMeasureOrLayout() {
        throw null;
    }

    public u.a getInputModeManager() {
        return null;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f882i;
    }

    public d0.d getLayoutDirection() {
        throw null;
    }

    public long getMeasureIteration() {
        throw null;
    }

    public x.a getModifierLocalManager() {
        return null;
    }

    public v.a getPointerIconService() {
        return null;
    }

    public f getRoot() {
        return null;
    }

    public l getRootForTest() {
        return null;
    }

    public z.a getSemanticsOwner() {
        return null;
    }

    public g getSharedDrawScope() {
        return null;
    }

    public boolean getShowLayoutBounds() {
        return this.f879f;
    }

    public k getSnapshotObserver() {
        return null;
    }

    public c0.a getTextInputService() {
        return null;
    }

    public i getTextToolbar() {
        return null;
    }

    public View getView() {
        return this;
    }

    public j getViewConfiguration() {
        return null;
    }

    public final f getViewTreeOwners() {
        throw null;
    }

    public l getWindowInfo() {
        return null;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getRoot();
        throw null;
    }

    public final boolean onCheckIsTextEditor() {
        throw null;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        o.m(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        o.l(context, "context");
        this.f877d = new c(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
        int i3 = Build.VERSION.SDK_INT;
        int i6 = 0;
        if ((i3 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f883j) {
            this.f883j = i3 >= 31 ? configuration.fontWeightAdjustment : 0;
            Context context2 = getContext();
            o.l(context2, "context");
            e eVar = new e(context2);
            if (i3 >= 31) {
                i6 = context2.getResources().getConfiguration().fontWeightAdjustment;
            }
            setFontFamilyResolver(new e(eVar, new b0.a(i6)));
        }
        this.f878e.i(configuration);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        o.m(editorInfo, "outAttrs");
        throw null;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver();
        throw null;
    }

    public final void onDraw(Canvas canvas) {
        o.m(canvas, "canvas");
    }

    public final void onFocusChanged(boolean z5, int i3, Rect rect) {
        super.onFocusChanged(z5, i3, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z5 + ')');
        throw null;
    }

    public final void onLayout(boolean z5, int i3, int i6, int i7, int i8) {
        throw null;
    }

    public final void onMeasure(int i3, int i6) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (isAttachedToWindow()) {
                f4.c c6 = c(i3);
                int intValue = ((Number) c6.f2676d).intValue();
                int intValue2 = ((Number) c6.f2677e).intValue();
                f4.c c7 = c(i6);
                long a6 = e.a(intValue, intValue2, ((Number) c7.f2676d).intValue(), ((Number) c7.f2677e).intValue());
                a aVar = this.f881h;
                if (aVar == null) {
                    this.f881h = new a(a6);
                } else if (aVar.f2141a == a6) {
                }
                throw null;
            }
            getRoot();
            throw null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i3) {
    }

    public final void onRtlPropertiesChanged(int i3) {
    }

    public final void onWindowFocusChanged(boolean z5) {
        throw null;
    }

    public final void setConfigurationChangeObserver(o4.c cVar) {
        o.m(cVar, "<set-?>");
        this.f878e = cVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j6) {
        this.f882i = j6;
    }

    public final void setOnViewTreeOwnersAvailable(o4.c cVar) {
        o.m(cVar, "callback");
        getViewTreeOwners();
        isAttachedToWindow();
    }

    public void setShowLayoutBounds(boolean z5) {
        this.f879f = z5;
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public b getAccessibilityManager() {
        return null;
    }
}
