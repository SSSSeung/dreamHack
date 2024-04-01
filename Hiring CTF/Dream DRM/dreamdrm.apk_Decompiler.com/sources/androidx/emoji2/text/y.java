package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class y extends SpannableStringBuilder {

    /* renamed from: d  reason: collision with root package name */
    public final Class f1057d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f1058e = new ArrayList();

    public y(Class cls, CharSequence charSequence) {
        super(charSequence);
        if (cls != null) {
            this.f1057d = cls;
            return;
        }
        throw new NullPointerException("watcherClass cannot be null");
    }

    public final void a() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f1058e;
            if (i3 < arrayList.size()) {
                ((x) arrayList.get(i3)).f1056e.incrementAndGet();
                i3++;
            } else {
                return;
            }
        }
    }

    public final Editable append(char c6) {
        super.append(c6);
        return this;
    }

    public final void b() {
        e();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f1058e;
            if (i3 < arrayList.size()) {
                ((x) arrayList.get(i3)).onTextChanged(this, 0, length(), length());
                i3++;
            } else {
                return;
            }
        }
    }

    public final x c(Object obj) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f1058e;
            if (i3 >= arrayList.size()) {
                return null;
            }
            x xVar = (x) arrayList.get(i3);
            if (xVar.f1055d == obj) {
                return xVar;
            }
            i3++;
        }
    }

    public final boolean d(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f1057d == obj.getClass();
    }

    public final Editable delete(int i3, int i6) {
        super.delete(i3, i6);
        return this;
    }

    public final void e() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f1058e;
            if (i3 < arrayList.size()) {
                ((x) arrayList.get(i3)).f1056e.decrementAndGet();
                i3++;
            } else {
                return;
            }
        }
    }

    public final int getSpanEnd(Object obj) {
        x c6;
        if (d(obj) && (c6 = c(obj)) != null) {
            obj = c6;
        }
        return super.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        x c6;
        if (d(obj) && (c6 = c(obj)) != null) {
            obj = c6;
        }
        return super.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        x c6;
        if (d(obj) && (c6 = c(obj)) != null) {
            obj = c6;
        }
        return super.getSpanStart(obj);
    }

    public final Object[] getSpans(int i3, int i6, Class cls) {
        if (!(this.f1057d == cls)) {
            return super.getSpans(i3, i6, cls);
        }
        x[] xVarArr = (x[]) super.getSpans(i3, i6, x.class);
        Object[] objArr = (Object[]) Array.newInstance(cls, xVarArr.length);
        for (int i7 = 0; i7 < xVarArr.length; i7++) {
            objArr[i7] = xVarArr[i7].f1055d;
        }
        return objArr;
    }

    public final Editable insert(int i3, CharSequence charSequence) {
        super.insert(i3, charSequence);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if ((r1.f1057d == r4) != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int nextSpanTransition(int r2, int r3, java.lang.Class<androidx.emoji2.text.x> r4) {
        /*
            r1 = this;
            if (r4 == 0) goto L_0x000b
            java.lang.Class r0 = r1.f1057d
            if (r0 != r4) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r0 == 0) goto L_0x000d
        L_0x000b:
            java.lang.Class<androidx.emoji2.text.x> r4 = androidx.emoji2.text.x.class
        L_0x000d:
            int r2 = super.nextSpanTransition(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.y.nextSpanTransition(int, int, java.lang.Class):int");
    }

    public final void removeSpan(Object obj) {
        x xVar;
        if (d(obj)) {
            xVar = c(obj);
            if (xVar != null) {
                obj = xVar;
            }
        } else {
            xVar = null;
        }
        super.removeSpan(obj);
        if (xVar != null) {
            this.f1058e.remove(xVar);
        }
    }

    public final void setSpan(Object obj, int i3, int i6, int i7) {
        if (d(obj)) {
            x xVar = new x(obj);
            this.f1058e.add(xVar);
            obj = xVar;
        }
        super.setSpan(obj, i3, i6, i7);
    }

    public final CharSequence subSequence(int i3, int i6) {
        return new y(this.f1057d, this, i3, i6);
    }

    public y(Class cls, CharSequence charSequence, int i3, int i6) {
        super(charSequence, i3, i6);
        if (cls != null) {
            this.f1057d = cls;
            return;
        }
        throw new NullPointerException("watcherClass cannot be null");
    }

    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: delete  reason: collision with other method in class */
    public final SpannableStringBuilder m6delete(int i3, int i6) {
        super.delete(i3, i6);
        return this;
    }

    public final Editable insert(int i3, CharSequence charSequence, int i6, int i7) {
        super.insert(i3, charSequence, i6, i7);
        return this;
    }

    public final Editable append(CharSequence charSequence, int i3, int i6) {
        super.append(charSequence, i3, i6);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m7insert(int i3, CharSequence charSequence) {
        super.insert(i3, charSequence);
        return this;
    }

    public final SpannableStringBuilder replace(int i3, int i6, CharSequence charSequence) {
        a();
        super.replace(i3, i6, charSequence);
        e();
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m0append(char c6) {
        super.append(c6);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m8insert(int i3, CharSequence charSequence, int i6, int i7) {
        super.insert(i3, charSequence, i6, i7);
        return this;
    }

    public final SpannableStringBuilder replace(int i3, int i6, CharSequence charSequence, int i7, int i8) {
        a();
        super.replace(i3, i6, charSequence, i7, i8);
        e();
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m1append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m2append(CharSequence charSequence, int i3, int i6) {
        super.append(charSequence, i3, i6);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i3) {
        super.append(charSequence, obj, i3);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m3append(char c6) {
        super.append(c6);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m4append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m5append(CharSequence charSequence, int i3, int i6) {
        super.append(charSequence, i3, i6);
        return this;
    }
}
