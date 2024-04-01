package x0;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import b1.w;
import com.theori.dreamdrm.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import y0.b0;
import y0.h;

public abstract class u0 {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap f5622a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Field f5623b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f5624c = false;

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f5625d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e  reason: collision with root package name */
    public static final y f5626e = new y();

    /* renamed from: f  reason: collision with root package name */
    public static final a0 f5627f = new a0();

    static {
        new AtomicInteger(1);
    }

    public static g1 a(View view) {
        if (f5622a == null) {
            f5622a = new WeakHashMap();
        }
        g1 g1Var = (g1) f5622a.get(view);
        if (g1Var != null) {
            return g1Var;
        }
        g1 g1Var2 = new g1(view);
        f5622a.put(view, g1Var2);
        return g1Var2;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = t0.f5614d;
        t0 t0Var = (t0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (t0Var == null) {
            t0Var = new t0();
            view.setTag(R.id.tag_unhandled_key_event_manager, t0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = t0Var.f5615a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = t0.f5614d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (t0Var.f5615a == null) {
                        t0Var.f5615a = new WeakHashMap();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList arrayList3 = t0.f5614d;
                        View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            t0Var.f5615a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                t0Var.f5615a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a6 = t0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a6 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (t0Var.f5616b == null) {
                    t0Var.f5616b = new SparseArray();
                }
                t0Var.f5616b.put(keyCode, new WeakReference(a6));
            }
        }
        return a6 != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return o0.a(view);
        }
        if (f5624c) {
            return null;
        }
        if (f5623b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f5623b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f5624c = true;
                return null;
            }
        }
        Object obj = f5623b.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static CharSequence d(View view) {
        return (CharSequence) new z(R.id.tag_accessibility_pane_title, 8, 28, 1).b(view);
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] f(View view) {
        return Build.VERSION.SDK_INT >= 31 ? q0.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(View view, int i3) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z5 = d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i6 = 32;
            if (g0.a(view) != 0 || z5) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z5) {
                    i6 = 2048;
                }
                obtain.setEventType(i6);
                g0.g(obtain, i3);
                if (z5) {
                    obtain.getText().add(d(view));
                    if (d0.c(view) == 0) {
                        d0.s(view, 1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i3 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                g0.g(obtain2, i3);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(d(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    g0.e(view.getParent(), view, view, i3);
                } catch (AbstractMethodError e6) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e6);
                }
            }
        }
    }

    public static h h(View view, h hVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + hVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return q0.b(view, hVar);
        }
        t tVar = (t) view.getTag(R.id.tag_on_receive_content_listener);
        u uVar = f5626e;
        if (tVar != null) {
            h a6 = ((w) tVar).a(view, hVar);
            if (a6 == null) {
                return null;
            }
            if (view instanceof u) {
                uVar = (u) view;
            }
            return uVar.a(a6);
        }
        if (view instanceof u) {
            uVar = (u) view;
        }
        return uVar.a(hVar);
    }

    public static void i(View view, int i3) {
        ArrayList e6 = e(view);
        for (int i6 = 0; i6 < e6.size(); i6++) {
            if (((h) e6.get(i6)).a() == i3) {
                e6.remove(i6);
                return;
            }
        }
    }

    public static void j(View view, h hVar, b0 b0Var) {
        h hVar2 = new h((Object) null, hVar.f5792b, (String) null, b0Var, hVar.f5793c);
        View.AccessibilityDelegate c6 = c(view);
        c cVar = c6 == null ? null : c6 instanceof a ? ((a) c6).f5535a : new c(c6);
        if (cVar == null) {
            cVar = new c();
        }
        l(view, cVar);
        i(view, hVar2.a());
        e(view).add(hVar2);
        g(view, 0);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            o0.d(view, context, iArr, attributeSet, typedArray, i3, 0);
        }
    }

    public static void l(View view, c cVar) {
        if (cVar == null && (c(view) instanceof a)) {
            cVar = new c();
        }
        if (d0.c(view) == 0) {
            d0.s(view, 1);
        }
        view.setAccessibilityDelegate(cVar == null ? null : cVar.f5550b);
    }

    public static void m(View view, CharSequence charSequence) {
        boolean z5 = true;
        new z(R.id.tag_accessibility_pane_title, 8, 28, 1).c(view, charSequence);
        a0 a0Var = f5627f;
        if (charSequence != null) {
            WeakHashMap weakHashMap = a0Var.f5536d;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z5 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z5));
            view.addOnAttachStateChangeListener(a0Var);
            if (g0.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(a0Var);
                return;
            }
            return;
        }
        a0Var.f5536d.remove(view);
        view.removeOnAttachStateChangeListener(a0Var);
        d0.o(view.getViewTreeObserver(), a0Var);
    }
}
