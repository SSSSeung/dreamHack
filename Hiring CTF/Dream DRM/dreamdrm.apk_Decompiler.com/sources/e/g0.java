package e;

import a2.m;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class g0 implements View.OnClickListener {

    /* renamed from: d  reason: collision with root package name */
    public final View f2371d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2372e;

    /* renamed from: f  reason: collision with root package name */
    public Method f2373f;

    /* renamed from: g  reason: collision with root package name */
    public Context f2374g;

    public g0(View view, String str) {
        this.f2371d = view;
        this.f2372e = str;
    }

    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f2373f == null) {
            View view2 = this.f2371d;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f2372e;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, new Class[]{View.class})) != null) {
                            this.f2373f = method;
                            this.f2374g = context;
                            break;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                } else {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder k6 = m.k("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    k6.append(view2.getClass());
                    k6.append(str);
                    throw new IllegalStateException(k6.toString());
                }
            }
        }
        try {
            this.f2373f.invoke(this.f2374g, new Object[]{view});
        } catch (IllegalAccessException e6) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e6);
        } catch (InvocationTargetException e7) {
            throw new IllegalStateException("Could not execute method for android:onClick", e7);
        }
    }
}
