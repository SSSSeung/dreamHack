package x0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f5593a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f5594b;

    /* renamed from: c  reason: collision with root package name */
    public final View f5595c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5596d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f5597e;

    public o(View view) {
        this.f5595c = view;
    }

    public final boolean a(float f6, float f7, boolean z5) {
        ViewParent f8;
        if (!this.f5596d || (f8 = f(0)) == null) {
            return false;
        }
        try {
            return c1.a(f8, this.f5595c, f6, f7, z5);
        } catch (AbstractMethodError e6) {
            Log.e("ViewParentCompat", "ViewParent " + f8 + " does not implement interface method onNestedFling", e6);
            return false;
        }
    }

    public final boolean b(float f6, float f7) {
        ViewParent f8;
        if (!this.f5596d || (f8 = f(0)) == null) {
            return false;
        }
        try {
            return c1.b(f8, this.f5595c, f6, f7);
        } catch (AbstractMethodError e6) {
            Log.e("ViewParentCompat", "ViewParent " + f8 + " does not implement interface method onNestedPreFling", e6);
            return false;
        }
    }

    public final boolean c(int i3, int i6, int i7, int[] iArr, int[] iArr2) {
        ViewParent f6;
        int i8;
        int i9;
        int[] iArr3;
        int i10 = i3;
        int i11 = i6;
        int i12 = i7;
        int[] iArr4 = iArr2;
        if (!this.f5596d || (f6 = f(i12)) == null) {
            return false;
        }
        if (i10 != 0 || i11 != 0) {
            View view = this.f5595c;
            if (iArr4 != null) {
                view.getLocationInWindow(iArr4);
                i9 = iArr4[0];
                i8 = iArr4[1];
            } else {
                i9 = 0;
                i8 = 0;
            }
            if (iArr == null) {
                if (this.f5597e == null) {
                    this.f5597e = new int[2];
                }
                iArr3 = this.f5597e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view2 = this.f5595c;
            if (f6 instanceof p) {
                ((p) f6).c(view2, i3, i6, iArr3, i7);
            } else if (i12 == 0) {
                try {
                    c1.c(f6, view2, i10, i11, iArr3);
                } catch (AbstractMethodError e6) {
                    Log.e("ViewParentCompat", "ViewParent " + f6 + " does not implement interface method onNestedPreScroll", e6);
                }
            }
            if (iArr4 != null) {
                view.getLocationInWindow(iArr4);
                iArr4[0] = iArr4[0] - i9;
                iArr4[1] = iArr4[1] - i8;
            }
            return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
        } else if (iArr4 == null) {
            return false;
        } else {
            iArr4[0] = 0;
            iArr4[1] = 0;
            return false;
        }
    }

    public final void d(int i3, int i6, int i7, int[] iArr) {
        e(0, i3, 0, i6, (int[]) null, i7, iArr);
    }

    public final boolean e(int i3, int i6, int i7, int i8, int[] iArr, int i9, int[] iArr2) {
        ViewParent f6;
        int i10;
        int i11;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i12 = i9;
        if (!this.f5596d || (f6 = f(i12)) == null) {
            return false;
        }
        if (i3 == 0 && i6 == 0 && i7 == 0 && i8 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        View view = this.f5595c;
        if (iArr4 != null) {
            view.getLocationInWindow(iArr4);
            i11 = iArr4[0];
            i10 = iArr4[1];
        } else {
            i11 = 0;
            i10 = 0;
        }
        if (iArr2 == null) {
            if (this.f5597e == null) {
                this.f5597e = new int[2];
            }
            int[] iArr5 = this.f5597e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.f5595c;
        if (f6 instanceof q) {
            ((q) f6).d(view2, i3, i6, i7, i8, i9, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i7;
            iArr3[1] = iArr3[1] + i8;
            if (f6 instanceof p) {
                ((p) f6).e(view2, i3, i6, i7, i8, i9);
            } else if (i12 == 0) {
                try {
                    c1.d(f6, view2, i3, i6, i7, i8);
                } catch (AbstractMethodError e6) {
                    Log.e("ViewParentCompat", "ViewParent " + f6 + " does not implement interface method onNestedScroll", e6);
                }
            }
        }
        if (iArr4 != null) {
            view.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i11;
            iArr4[1] = iArr4[1] - i10;
        }
        return true;
    }

    public final ViewParent f(int i3) {
        if (i3 == 0) {
            return this.f5593a;
        }
        if (i3 != 1) {
            return null;
        }
        return this.f5594b;
    }

    public final boolean g(int i3, int i6) {
        boolean z5;
        if (f(i6) != null) {
            return true;
        }
        if (this.f5596d) {
            View view = this.f5595c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z6 = parent instanceof p;
                if (z6) {
                    z5 = ((p) parent).f(view2, view, i3, i6);
                } else {
                    if (i6 == 0) {
                        try {
                            z5 = c1.f(parent, view2, view, i3);
                        } catch (AbstractMethodError e6) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e6);
                        }
                    }
                    z5 = false;
                }
                if (z5) {
                    if (i6 == 0) {
                        this.f5593a = parent;
                    } else if (i6 == 1) {
                        this.f5594b = parent;
                    }
                    if (z6) {
                        ((p) parent).a(view2, view, i3, i6);
                    } else if (i6 == 0) {
                        try {
                            c1.e(parent, view2, view, i3);
                        } catch (AbstractMethodError e7) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e7);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i3) {
        ViewParent f6 = f(i3);
        if (f6 != null) {
            boolean z5 = f6 instanceof p;
            View view = this.f5595c;
            if (z5) {
                ((p) f6).b(view, i3);
            } else if (i3 == 0) {
                try {
                    c1.g(f6, view);
                } catch (AbstractMethodError e6) {
                    Log.e("ViewParentCompat", "ViewParent " + f6 + " does not implement interface method onStopNestedScroll", e6);
                }
            }
            if (i3 == 0) {
                this.f5593a = null;
            } else if (i3 == 1) {
                this.f5594b = null;
            }
        }
    }
}
