package androidx.appcompat.widget;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import e.d;
import e.h;
import e.i;

public final class q0 implements v0, DialogInterface.OnClickListener {

    /* renamed from: d  reason: collision with root package name */
    public i f724d;

    /* renamed from: e  reason: collision with root package name */
    public ListAdapter f725e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f726f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ w0 f727g;

    public q0(w0 w0Var) {
        this.f727g = w0Var;
    }

    public final boolean a() {
        i iVar = this.f724d;
        if (iVar != null) {
            return iVar.isShowing();
        }
        return false;
    }

    public final void b(int i3) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    public final int c() {
        return 0;
    }

    public final void d(int i3, int i6) {
        if (this.f725e != null) {
            w0 w0Var = this.f727g;
            h hVar = new h(w0Var.getPopupContext());
            CharSequence charSequence = this.f726f;
            Object obj = hVar.f2376e;
            if (charSequence != null) {
                ((d) obj).f2289d = charSequence;
            }
            ListAdapter listAdapter = this.f725e;
            int selectedItemPosition = w0Var.getSelectedItemPosition();
            d dVar = (d) obj;
            dVar.f2296k = listAdapter;
            dVar.f2297l = this;
            dVar.f2300o = selectedItemPosition;
            dVar.f2299n = true;
            i a6 = hVar.a();
            this.f724d = a6;
            AlertController$RecycleListView alertController$RecycleListView = a6.f2387i.f2352g;
            o0.d(alertController$RecycleListView, i3);
            o0.c(alertController$RecycleListView, i6);
            this.f724d.show();
        }
    }

    public final void dismiss() {
        i iVar = this.f724d;
        if (iVar != null) {
            iVar.dismiss();
            this.f724d = null;
        }
    }

    public final int e() {
        return 0;
    }

    public final Drawable h() {
        return null;
    }

    public final CharSequence i() {
        return this.f726f;
    }

    public final void k(CharSequence charSequence) {
        this.f726f = charSequence;
    }

    public final void l(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    public final void n(int i3) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    public final void o(ListAdapter listAdapter) {
        this.f725e = listAdapter;
    }

    public final void onClick(DialogInterface dialogInterface, int i3) {
        w0 w0Var = this.f727g;
        w0Var.setSelection(i3);
        if (w0Var.getOnItemClickListener() != null) {
            w0Var.performItemClick((View) null, i3, this.f725e.getItemId(i3));
        }
        dismiss();
    }

    public final void p(int i3) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
