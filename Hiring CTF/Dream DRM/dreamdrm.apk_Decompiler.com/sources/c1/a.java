package c1;

import a2.m;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.l2;
import androidx.appcompat.widget.s3;
import androidx.compose.ui.platform.o;

public abstract class a extends BaseAdapter implements Filterable, b {

    /* renamed from: d  reason: collision with root package name */
    public boolean f1598d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1599e = true;

    /* renamed from: f  reason: collision with root package name */
    public Cursor f1600f = null;

    /* renamed from: g  reason: collision with root package name */
    public int f1601g = -1;

    /* renamed from: h  reason: collision with root package name */
    public o f1602h = new o(this);

    /* renamed from: i  reason: collision with root package name */
    public l2 f1603i = new l2(1, this);

    /* renamed from: j  reason: collision with root package name */
    public c f1604j;

    public a(Context context) {
    }

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f1600f;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                o oVar = this.f1602h;
                if (oVar != null) {
                    cursor2.unregisterContentObserver(oVar);
                }
                l2 l2Var = this.f1603i;
                if (l2Var != null) {
                    cursor2.unregisterDataSetObserver(l2Var);
                }
            }
            this.f1600f = cursor;
            if (cursor != null) {
                o oVar2 = this.f1602h;
                if (oVar2 != null) {
                    cursor.registerContentObserver(oVar2);
                }
                l2 l2Var2 = this.f1603i;
                if (l2Var2 != null) {
                    cursor.registerDataSetObserver(l2Var2);
                }
                this.f1601g = cursor.getColumnIndexOrThrow("_id");
                this.f1598d = true;
                notifyDataSetChanged();
            } else {
                this.f1601g = -1;
                this.f1598d = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    public final int getCount() {
        Cursor cursor;
        if (!this.f1598d || (cursor = this.f1600f) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f1598d) {
            return null;
        }
        this.f1600f.moveToPosition(i3);
        if (view == null) {
            s3 s3Var = (s3) this;
            view = s3Var.f771m.inflate(s3Var.f770l, viewGroup, false);
        }
        a(view, this.f1600f);
        return view;
    }

    public final Filter getFilter() {
        if (this.f1604j == null) {
            this.f1604j = new c(this);
        }
        return this.f1604j;
    }

    public final Object getItem(int i3) {
        Cursor cursor;
        if (!this.f1598d || (cursor = this.f1600f) == null) {
            return null;
        }
        cursor.moveToPosition(i3);
        return this.f1600f;
    }

    public final long getItemId(int i3) {
        Cursor cursor;
        if (!this.f1598d || (cursor = this.f1600f) == null || !cursor.moveToPosition(i3)) {
            return 0;
        }
        return this.f1600f.getLong(this.f1601g);
    }

    public View getView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f1598d) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f1600f.moveToPosition(i3)) {
            if (view == null) {
                view = d(viewGroup);
            }
            a(view, this.f1600f);
            return view;
        } else {
            throw new IllegalStateException(m.g("couldn't move cursor to position ", i3));
        }
    }
}
