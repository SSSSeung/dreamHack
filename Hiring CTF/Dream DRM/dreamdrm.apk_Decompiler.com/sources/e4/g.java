package e4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import b1.o;
import com.bumptech.glide.m;
import com.theori.dreamdrm.FileItem;
import com.theori.dreamdrm.MainActivity;
import com.theori.dreamdrm.R;
import g4.n;
import h2.h;
import h2.i;
import h2.t;
import h5.l;
import java.util.List;
import n2.a;
import o2.b;
import p1.f1;
import p1.g0;

public final class g extends g0 {

    /* renamed from: d  reason: collision with root package name */
    public List f2575d = n.f2906d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f2576e;

    /* renamed from: f  reason: collision with root package name */
    public final f f2577f;

    public g(MainActivity mainActivity, MainActivity mainActivity2) {
        this.f2576e = mainActivity;
        this.f2577f = mainActivity2;
    }

    public final int a() {
        return this.f2575d.size();
    }

    public final void c(f1 f1Var, int i3) {
        a aVar;
        b bVar;
        e eVar = (e) f1Var;
        FileItem fileItem = (FileItem) this.f2575d.get(i3);
        eVar.f2573u.setText(fileItem.a());
        eVar.f4483a.setOnClickListener(new d(this, fileItem));
        com.bumptech.glide.n d6 = com.bumptech.glide.b.d(this.f2576e);
        d6.getClass();
        Class<Drawable> cls = Drawable.class;
        m u3 = new m(d6.f1781d, d6, cls, d6.f1782e).u("http://" + l.f3485d + ':' + l.f3486e + "/static/" + fileItem.c());
        u3.getClass();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ImageView imageView = eVar.f2574v;
            o.i(imageView);
            if (!a.e(u3.f4263d, 2048) && u3.f4276q && imageView.getScaleType() != null) {
                switch (com.bumptech.glide.l.f1750a[imageView.getScaleType().ordinal()]) {
                    case 1:
                        aVar = u3.clone().f(h2.n.f3412c, new h());
                        break;
                    case 2:
                    case 6:
                        aVar = u3.clone().f(h2.n.f3411b, new i());
                        aVar.B = true;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        aVar = u3.clone().f(h2.n.f3410a, new t());
                        aVar.B = true;
                        break;
                }
            }
            aVar = u3;
            u3.G.f1727c.getClass();
            Class cls2 = u3.F;
            if (Bitmap.class.equals(cls2)) {
                bVar = new b(imageView, 0);
            } else if (cls.isAssignableFrom(cls2)) {
                bVar = new b(imageView, 1);
            } else {
                throw new IllegalArgumentException("Unhandled class: " + cls2 + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            u3.t(bVar, aVar);
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }

    public final f1 d(RecyclerView recyclerView) {
        o.m(recyclerView, "parent");
        View inflate = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.item_file, recyclerView, false);
        o.l(inflate, "itemView");
        return new e(inflate);
    }
}
