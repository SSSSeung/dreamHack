package e;

import a2.f0;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h2.z;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import k2.a;
import u0.g;
import y0.b0;
import y1.i;
import z4.d0;

public final class h implements a, b0 {

    /* renamed from: d  reason: collision with root package name */
    public int f2375d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f2376e;

    public /* synthetic */ h(int i3, Object obj) {
        this.f2376e = obj;
        this.f2375d = i3;
    }

    public final i a() {
        d dVar = (d) this.f2376e;
        i iVar = new i(dVar.f2286a, this.f2375d);
        View view = dVar.f2290e;
        g gVar = iVar.f2387i;
        if (view != null) {
            gVar.w = view;
        } else {
            CharSequence charSequence = dVar.f2289d;
            if (charSequence != null) {
                gVar.f2350e = charSequence;
                TextView textView = gVar.f2366u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = dVar.f2288c;
            if (drawable != null) {
                gVar.f2364s = drawable;
                gVar.f2363r = 0;
                ImageView imageView = gVar.f2365t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    gVar.f2365t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = dVar.f2291f;
        if (charSequence2 != null) {
            gVar.f2351f = charSequence2;
            TextView textView2 = gVar.f2367v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = dVar.f2292g;
        if (charSequence3 != null) {
            DialogInterface.OnClickListener onClickListener = dVar.f2293h;
            Message obtainMessage = onClickListener != null ? gVar.E.obtainMessage(-1, onClickListener) : null;
            gVar.f2357l = charSequence3;
            gVar.f2358m = obtainMessage;
            gVar.f2359n = null;
        }
        if (dVar.f2296k != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) dVar.f2287b.inflate(gVar.A, (ViewGroup) null);
            int i3 = dVar.f2299n ? gVar.B : gVar.C;
            ListAdapter listAdapter = dVar.f2296k;
            if (listAdapter == null) {
                listAdapter = new f(dVar.f2286a, i3);
            }
            gVar.f2368x = listAdapter;
            gVar.f2369y = dVar.f2300o;
            if (dVar.f2297l != null) {
                alertController$RecycleListView.setOnItemClickListener(new c(dVar, 0, gVar));
            }
            if (dVar.f2299n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            gVar.f2352g = alertController$RecycleListView;
        }
        View view2 = dVar.f2298m;
        if (view2 != null) {
            gVar.f2353h = view2;
            gVar.f2354i = 0;
            gVar.f2355j = false;
        }
        iVar.setCancelable(dVar.f2294i);
        if (dVar.f2294i) {
            iVar.setCanceledOnTouchOutside(true);
        }
        dVar.getClass();
        iVar.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dVar.getClass();
        iVar.setOnDismissListener((DialogInterface.OnDismissListener) null);
        DialogInterface.OnKeyListener onKeyListener = dVar.f2295j;
        if (onKeyListener != null) {
            iVar.setOnKeyListener(onKeyListener);
        }
        return iVar;
    }

    public final boolean b(View view) {
        ((BottomSheetBehavior) this.f2376e).D(this.f2375d);
        return true;
    }

    public final boolean c() {
        return this.f2375d < ((List) this.f2376e).size();
    }

    public final d0 d() {
        if (c()) {
            int i3 = this.f2375d;
            this.f2375d = i3 + 1;
            return (d0) ((List) this.f2376e).get(i3);
        }
        throw new NoSuchElementException();
    }

    public final f0 f(f0 f0Var, i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) f0Var.get()).compress((Bitmap.CompressFormat) this.f2376e, this.f2375d, byteArrayOutputStream);
        f0Var.d();
        return new z(byteArrayOutputStream.toByteArray());
    }

    public h(int i3, g[] gVarArr) {
        this.f2375d = i3;
        this.f2376e = gVarArr;
    }

    public h(Context context) {
        int p2 = i.p(context, 0);
        this.f2376e = new d(new ContextThemeWrapper(context, i.p(context, p2)));
        this.f2375d = p2;
    }

    public h(ArrayList arrayList) {
        this.f2376e = arrayList;
    }
}
