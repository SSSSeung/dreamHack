package x0;

import android.view.View;
import android.view.ViewGroup;
import b1.o;
import g4.d;
import java.util.Iterator;
import java.util.NoSuchElementException;
import u4.b;

public class a1 implements Iterator {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5537d;

    /* renamed from: e  reason: collision with root package name */
    public int f5538e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f5539f;

    public /* synthetic */ a1(int i3, Object obj) {
        this.f5537d = i3;
        this.f5539f = obj;
    }

    public final boolean hasNext() {
        int i3 = this.f5537d;
        Object obj = this.f5539f;
        switch (i3) {
            case 0:
                return this.f5538e < ((ViewGroup) obj).getChildCount();
            case 1:
                return this.f5538e < ((d) obj).a();
            case 2:
                return this.f5538e < ((Object[]) obj).length;
        }
        while (this.f5538e > 0) {
            Iterator it = (Iterator) obj;
            if (!it.hasNext()) {
                return ((Iterator) obj).hasNext();
            }
            it.next();
            this.f5538e--;
        }
        return ((Iterator) obj).hasNext();
    }

    public final Object next() {
        int i3 = this.f5537d;
        Object obj = this.f5539f;
        switch (i3) {
            case 0:
                int i6 = this.f5538e;
                this.f5538e = i6 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i6);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (hasNext()) {
                    int i7 = this.f5538e;
                    this.f5538e = i7 + 1;
                    return ((d) obj).get(i7);
                }
                throw new NoSuchElementException();
            case 2:
                try {
                    int i8 = this.f5538e;
                    this.f5538e = i8 + 1;
                    return ((Object[]) obj)[i8];
                } catch (ArrayIndexOutOfBoundsException e6) {
                    this.f5538e--;
                    throw new NoSuchElementException(e6.getMessage());
                }
        }
        while (this.f5538e > 0) {
            Iterator it = (Iterator) obj;
            if (!it.hasNext()) {
                return ((Iterator) obj).next();
            }
            it.next();
            this.f5538e--;
        }
        return ((Iterator) obj).next();
    }

    public final void remove() {
        switch (this.f5537d) {
            case 0:
                int i3 = this.f5538e - 1;
                this.f5538e = i3;
                ((ViewGroup) this.f5539f).removeViewAt(i3);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a1(b bVar) {
        this.f5537d = 3;
        this.f5539f = bVar.f5341a.iterator();
        this.f5538e = bVar.f5342b;
    }

    public a1(Object[] objArr) {
        this.f5537d = 2;
        o.m(objArr, "array");
        this.f5539f = objArr;
    }
}
