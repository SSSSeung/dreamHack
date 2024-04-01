package p1;

import android.graphics.Rect;
import android.view.View;

public final class a0 extends b0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4429d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(o0 o0Var, int i3) {
        super(o0Var);
        this.f4429d = i3;
    }

    public final int b(View view) {
        int bottom;
        int i3;
        int i6 = this.f4429d;
        o0 o0Var = this.f4435a;
        switch (i6) {
            case 0:
                o0Var.getClass();
                bottom = view.getRight() + ((p0) view.getLayoutParams()).f4641b.right;
                i3 = ((p0) view.getLayoutParams()).rightMargin;
                break;
            default:
                o0Var.getClass();
                bottom = view.getBottom() + ((p0) view.getLayoutParams()).f4641b.bottom;
                i3 = ((p0) view.getLayoutParams()).bottomMargin;
                break;
        }
        return bottom + i3;
    }

    public final int c(View view) {
        int measuredHeight;
        int i3;
        int i6 = this.f4429d;
        o0 o0Var = this.f4435a;
        switch (i6) {
            case 0:
                p0 p0Var = (p0) view.getLayoutParams();
                o0Var.getClass();
                Rect rect = ((p0) view.getLayoutParams()).f4641b;
                measuredHeight = view.getMeasuredWidth() + rect.left + rect.right + p0Var.leftMargin;
                i3 = p0Var.rightMargin;
                break;
            default:
                p0 p0Var2 = (p0) view.getLayoutParams();
                o0Var.getClass();
                Rect rect2 = ((p0) view.getLayoutParams()).f4641b;
                measuredHeight = view.getMeasuredHeight() + rect2.top + rect2.bottom + p0Var2.topMargin;
                i3 = p0Var2.bottomMargin;
                break;
        }
        return measuredHeight + i3;
    }

    public final int d(View view) {
        int top;
        int i3;
        int i6 = this.f4429d;
        o0 o0Var = this.f4435a;
        switch (i6) {
            case 0:
                o0Var.getClass();
                top = view.getLeft() - ((p0) view.getLayoutParams()).f4641b.left;
                i3 = ((p0) view.getLayoutParams()).leftMargin;
                break;
            default:
                o0Var.getClass();
                top = view.getTop() - ((p0) view.getLayoutParams()).f4641b.top;
                i3 = ((p0) view.getLayoutParams()).topMargin;
                break;
        }
        return top - i3;
    }

    public final int e() {
        int i3 = this.f4429d;
        o0 o0Var = this.f4435a;
        switch (i3) {
            case 0:
                return o0Var.f4608n;
            default:
                return o0Var.f4609o;
        }
    }

    public final int f() {
        int i3;
        int B;
        int i6 = this.f4429d;
        o0 o0Var = this.f4435a;
        switch (i6) {
            case 0:
                i3 = o0Var.f4608n;
                B = o0Var.D();
                break;
            default:
                i3 = o0Var.f4609o;
                B = o0Var.B();
                break;
        }
        return i3 - B;
    }

    public final int g() {
        int i3 = this.f4429d;
        o0 o0Var = this.f4435a;
        switch (i3) {
            case 0:
                return o0Var.f4606l;
            default:
                return o0Var.f4607m;
        }
    }

    public final int h() {
        int i3 = this.f4429d;
        o0 o0Var = this.f4435a;
        switch (i3) {
            case 0:
                return o0Var.C();
            default:
                return o0Var.E();
        }
    }

    public final int i() {
        int E;
        int B;
        int i3 = this.f4429d;
        o0 o0Var = this.f4435a;
        switch (i3) {
            case 0:
                E = o0Var.f4608n - o0Var.C();
                B = o0Var.D();
                break;
            default:
                E = o0Var.f4609o - o0Var.E();
                B = o0Var.B();
                break;
        }
        return E - B;
    }

    public final int j(View view) {
        int i3 = this.f4429d;
        Rect rect = this.f4437c;
        o0 o0Var = this.f4435a;
        switch (i3) {
            case 0:
                o0Var.I(view, rect);
                return rect.right;
            default:
                o0Var.I(view, rect);
                return rect.bottom;
        }
    }

    public final int k(View view) {
        int i3 = this.f4429d;
        Rect rect = this.f4437c;
        o0 o0Var = this.f4435a;
        switch (i3) {
            case 0:
                o0Var.I(view, rect);
                return rect.left;
            default:
                o0Var.I(view, rect);
                return rect.top;
        }
    }

    public final void l(int i3) {
        int i6 = this.f4429d;
        o0 o0Var = this.f4435a;
        switch (i6) {
            case 0:
                o0Var.M(i3);
                return;
            default:
                o0Var.N(i3);
                return;
        }
    }

    public final int m(View view) {
        int measuredWidth;
        int i3;
        int i6 = this.f4429d;
        o0 o0Var = this.f4435a;
        switch (i6) {
            case 0:
                p0 p0Var = (p0) view.getLayoutParams();
                o0Var.getClass();
                Rect rect = ((p0) view.getLayoutParams()).f4641b;
                measuredWidth = view.getMeasuredHeight() + rect.top + rect.bottom + p0Var.topMargin;
                i3 = p0Var.bottomMargin;
                break;
            default:
                p0 p0Var2 = (p0) view.getLayoutParams();
                o0Var.getClass();
                Rect rect2 = ((p0) view.getLayoutParams()).f4641b;
                measuredWidth = view.getMeasuredWidth() + rect2.left + rect2.right + p0Var2.leftMargin;
                i3 = p0Var2.rightMargin;
                break;
        }
        return measuredWidth + i3;
    }
}
