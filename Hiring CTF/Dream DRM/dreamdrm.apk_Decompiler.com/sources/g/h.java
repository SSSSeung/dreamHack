package g;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.q;
import androidx.fragment.app.i;
import g0.f;
import g1.a;
import h.f0;
import h.o;
import h.w;
import j2.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import k.b;
import k.d;
import k.j;
import t0.c;
import w4.p;

public final class h implements b, c {

    /* renamed from: e  reason: collision with root package name */
    public static h f2724e;

    /* renamed from: a  reason: collision with root package name */
    public final Object f2725a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2726b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2727c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2728d;

    public h(int i3) {
        if (i3 == 2) {
            this.f2725a = new f(10, 1);
            this.f2728d = new j();
            this.f2727c = new ArrayList();
            this.f2726b = new HashSet();
        } else if (i3 == 5) {
            this.f2725a = new b();
            this.f2726b = new SparseArray();
            this.f2727c = new d();
            this.f2728d = new b();
        } else if (i3 != 6) {
            this.f2725a = new f(256, 0);
            this.f2726b = new f(256, 0);
            this.f2727c = new f(256, 0);
            this.f2728d = new g0.j[32];
        } else {
            this.f2725a = new Object();
            this.f2726b = new Handler(Looper.getMainLooper(), new g(1, this));
        }
    }

    public final boolean a(c cVar, o oVar) {
        return ((ActionMode.Callback) this.f2725a).onPrepareActionMode(g(cVar), h(oVar));
    }

    public final void b(c cVar) {
        ((ActionMode.Callback) this.f2725a).onDestroyActionMode(g(cVar));
    }

    public final boolean c(c cVar, o oVar) {
        return ((ActionMode.Callback) this.f2725a).onCreateActionMode(g(cVar), h(oVar));
    }

    public final void d() {
        Object obj = this.f2725a;
        ((View) obj).clearAnimation();
        ((ViewGroup) this.f2726b).endViewTransition((View) obj);
        ((androidx.fragment.app.g) this.f2727c).b();
    }

    public final boolean e(c cVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f2725a).onActionItemClicked(g(cVar), new w((Context) this.f2726b, (s0.b) menuItem));
    }

    public final void f(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) ((j) this.f2728d).getOrDefault(obj, (Object) null);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        f(arrayList2.get(i3), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public final i g(c cVar) {
        ArrayList arrayList = (ArrayList) this.f2727c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = (i) arrayList.get(i3);
            if (iVar != null && iVar.f2730b == cVar) {
                return iVar;
            }
        }
        i iVar2 = new i((Context) this.f2726b, cVar);
        arrayList.add(iVar2);
        return iVar2;
    }

    public final Menu h(o oVar) {
        Menu menu = (Menu) ((j) this.f2728d).getOrDefault(oVar, (Object) null);
        if (menu != null) {
            return menu;
        }
        f0 f0Var = new f0((Context) this.f2726b, oVar);
        ((j) this.f2728d).put(oVar, f0Var);
        return f0Var;
    }

    public h(Context context, ActionMode.Callback callback) {
        this.f2726b = context;
        this.f2725a = callback;
        this.f2727c = new ArrayList();
        this.f2728d = new j();
    }

    public h(Typeface typeface, g1.b bVar) {
        int i3;
        int i6;
        this.f2728d = typeface;
        this.f2725a = bVar;
        this.f2727c = new androidx.emoji2.text.w(1024);
        int a6 = bVar.a(6);
        if (a6 != 0) {
            int i7 = a6 + bVar.f2840a;
            i3 = ((ByteBuffer) bVar.f2843d).getInt(((ByteBuffer) bVar.f2843d).getInt(i7) + i7);
        } else {
            i3 = 0;
        }
        this.f2726b = new char[(i3 * 2)];
        int a7 = bVar.a(6);
        if (a7 != 0) {
            int i8 = a7 + bVar.f2840a;
            i6 = ((ByteBuffer) bVar.f2843d).getInt(((ByteBuffer) bVar.f2843d).getInt(i8) + i8);
        } else {
            i6 = 0;
        }
        for (int i9 = 0; i9 < i6; i9++) {
            q qVar = new q(this, i9);
            a c6 = qVar.c();
            int a8 = c6.a(4);
            Character.toChars(a8 != 0 ? ((ByteBuffer) c6.f2843d).getInt(a8 + c6.f2840a) : 0, (char[]) this.f2726b, i9 * 2);
            p.b("invalid metadata codepoint length", qVar.b() > 0);
            ((androidx.emoji2.text.w) this.f2727c).a(qVar, 0, qVar.b() - 1);
        }
    }

    public h(View view, ViewGroup viewGroup, androidx.fragment.app.g gVar, i iVar) {
        this.f2728d = iVar;
        this.f2725a = view;
        this.f2726b = viewGroup;
        this.f2727c = gVar;
    }
}
