package a2;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import y1.a;
import y1.f;

public final class b0 extends Exception {

    /* renamed from: i  reason: collision with root package name */
    public static final StackTraceElement[] f21i = new StackTraceElement[0];

    /* renamed from: d  reason: collision with root package name */
    public final List f22d;

    /* renamed from: e  reason: collision with root package name */
    public f f23e;

    /* renamed from: f  reason: collision with root package name */
    public a f24f;

    /* renamed from: g  reason: collision with root package name */
    public Class f25g;

    /* renamed from: h  reason: collision with root package name */
    public final String f26h;

    public b0(String str) {
        this(str, Collections.emptyList());
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (th instanceof b0) {
            for (Throwable a6 : ((b0) th).f22d) {
                a(a6, arrayList);
            }
            return;
        }
        arrayList.add(th);
    }

    public static void b(List list, a0 a0Var) {
        try {
            c(list, a0Var);
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static void c(List list, a0 a0Var) {
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            a0Var.append((CharSequence) "Cause (");
            int i6 = i3 + 1;
            a0Var.append((CharSequence) String.valueOf(i6));
            a0Var.append(" of ");
            a0Var.append(String.valueOf(size));
            a0Var.append("): ");
            Throwable th = (Throwable) list.get(i3);
            if (th instanceof b0) {
                ((b0) th).f(a0Var);
            } else {
                d(th, a0Var);
            }
            i3 = i6;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i6 = i3 + 1;
            sb.append(i6);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i3));
            i3 = i6;
        }
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.f22d, new a0(appendable));
    }

    public final Throwable fillInStackTrace() {
        return this;
    }

    public final String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f26h);
        String str4 = "";
        if (this.f25g != null) {
            str = ", " + this.f25g;
        } else {
            str = str4;
        }
        sb.append(str);
        if (this.f24f != null) {
            str2 = ", " + this.f24f;
        } else {
            str2 = str4;
        }
        sb.append(str2);
        if (this.f23e != null) {
            str4 = ", " + this.f23e;
        }
        sb.append(str4);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            str3 = "\nThere was 1 root cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            str3 = " root causes:";
        }
        sb.append(str3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public final void printStackTrace() {
        f(System.err);
    }

    public b0(String str, List list) {
        this.f26h = str;
        setStackTrace(f21i);
        this.f22d = list;
    }

    public final void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }
}
