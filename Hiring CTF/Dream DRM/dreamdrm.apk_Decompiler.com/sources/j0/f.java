package j0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.m3;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.datepicker.n;
import java.util.ArrayList;
import x0.h2;
import x0.s;

public final class f implements s {

    /* renamed from: d  reason: collision with root package name */
    public int f3699d;

    /* renamed from: e  reason: collision with root package name */
    public int f3700e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f3701f;

    /* renamed from: g  reason: collision with root package name */
    public Object f3702g;

    public f(Context context, XmlResourceParser xmlResourceParser) {
        this.f3701f = new ArrayList();
        this.f3700e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f3783g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 0) {
                this.f3699d = obtainStyledAttributes.getResourceId(index, this.f3699d);
            } else if (index == 1) {
                this.f3700e = obtainStyledAttributes.getResourceId(index, this.f3700e);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f3700e);
                context.getResources().getResourceName(this.f3700e);
                if ("layout".equals(resourceTypeName)) {
                    n nVar = new n();
                    this.f3702g = nVar;
                    nVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(this.f3700e, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final h2 v(View view, h2 h2Var) {
        int i3 = h2Var.a(7).f4870b;
        int i6 = this.f3699d;
        Object obj = this.f3701f;
        if (i6 >= 0) {
            View view2 = (View) obj;
            view2.getLayoutParams().height = this.f3699d + i3;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = (View) obj;
        view3.setPadding(view3.getPaddingLeft(), this.f3700e + i3, view3.getPaddingRight(), view3.getPaddingBottom());
        return h2Var;
    }

    public f(n nVar, int i3, View view, int i6) {
        this.f3702g = nVar;
        this.f3699d = i3;
        this.f3701f = view;
        this.f3700e = i6;
    }

    public f(s3.n nVar, m3 m3Var) {
        this.f3701f = new SparseArray();
        this.f3702g = nVar;
        this.f3699d = m3Var.i(28, 0);
        this.f3700e = m3Var.i(52, 0);
    }
}
