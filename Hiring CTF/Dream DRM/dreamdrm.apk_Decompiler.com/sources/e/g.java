package e;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.theori.dreamdrm.R;
import d.a;

public final class g {
    public final int A;
    public final int B;
    public final int C;
    public final boolean D;
    public final e E;
    public final b F = new b(0, this);

    /* renamed from: a  reason: collision with root package name */
    public final Context f2346a;

    /* renamed from: b  reason: collision with root package name */
    public final i f2347b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f2348c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2349d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f2350e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f2351f;

    /* renamed from: g  reason: collision with root package name */
    public AlertController$RecycleListView f2352g;

    /* renamed from: h  reason: collision with root package name */
    public View f2353h;

    /* renamed from: i  reason: collision with root package name */
    public int f2354i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2355j = false;

    /* renamed from: k  reason: collision with root package name */
    public Button f2356k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f2357l;

    /* renamed from: m  reason: collision with root package name */
    public Message f2358m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f2359n;

    /* renamed from: o  reason: collision with root package name */
    public Button f2360o;

    /* renamed from: p  reason: collision with root package name */
    public Button f2361p;

    /* renamed from: q  reason: collision with root package name */
    public NestedScrollView f2362q;

    /* renamed from: r  reason: collision with root package name */
    public int f2363r = 0;

    /* renamed from: s  reason: collision with root package name */
    public Drawable f2364s;

    /* renamed from: t  reason: collision with root package name */
    public ImageView f2365t;

    /* renamed from: u  reason: collision with root package name */
    public TextView f2366u;

    /* renamed from: v  reason: collision with root package name */
    public TextView f2367v;
    public View w;

    /* renamed from: x  reason: collision with root package name */
    public ListAdapter f2368x;

    /* renamed from: y  reason: collision with root package name */
    public int f2369y = -1;

    /* renamed from: z  reason: collision with root package name */
    public final int f2370z;

    public g(Context context, i iVar, Window window) {
        this.f2346a = context;
        this.f2347b = iVar;
        this.f2348c = window;
        this.E = new e(iVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, a.f2117e, R.attr.alertDialogStyle, 0);
        this.f2370z = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.A = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.B = obtainStyledAttributes.getResourceId(7, 0);
        this.C = obtainStyledAttributes.getResourceId(3, 0);
        this.D = obtainStyledAttributes.getBoolean(6, true);
        this.f2349d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        iVar.k().j(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void b(View view, View view2, View view3) {
        int i3 = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i3 = 4;
            }
            view3.setVisibility(i3);
        }
    }

    public static ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
