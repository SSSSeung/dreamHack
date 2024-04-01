package e4;

import android.view.View;
import b1.o;
import b1.v;
import com.theori.dreamdrm.FileItem;
import com.theori.dreamdrm.MainActivity;
import com.theori.dreamdrm.R;
import d5.j;
import h5.l;
import z4.w;
import z4.y;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f2571d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FileItem f2572e;

    public /* synthetic */ d(g gVar, FileItem fileItem) {
        this.f2571d = gVar;
        this.f2572e = fileItem;
    }

    public final void onClick(View view) {
        g gVar = this.f2571d;
        o.m(gVar, "this$0");
        FileItem fileItem = this.f2572e;
        o.m(fileItem, "$currentItem");
        MainActivity mainActivity = (MainActivity) gVar.f2577f;
        mainActivity.getClass();
        w wVar = new w();
        y yVar = new y();
        StringBuilder sb = new StringBuilder("http://");
        sb.append(l.f3485d);
        sb.append(':');
        sb.append(l.f3486e);
        m mVar = new m(v.E(249, 34, 147, 28, 237, 32, 7, 160, 25, 166, 82, 165, 119, 173, 152, 149));
        String string = mainActivity.getString(R.string.req_book_path);
        o.l(string, "getString(R.string.req_book_path)");
        sb.append(mVar.a(string));
        sb.append(fileItem.b());
        yVar.e(sb.toString());
        m mVar2 = new m(v.E(242, 90, 182, 126, 98, 130, 73, 158, 179, 228, 252, 119, 74, 45, 169, 127));
        String string2 = mainActivity.getString(R.string.user_agent);
        o.l(string2, "getString(R.string.user_agent)");
        yVar.a("User-Agent", mVar2.a(string2));
        m mVar3 = new m(v.E(161, 239, 215, 17, 227, 215, 183, 129, 55, 123, 66, 109, 147, 253, 60, 1));
        String string3 = mainActivity.getString(R.string.authorization);
        o.l(string3, "getString(R.string.authorization)");
        yVar.a("Authorization", mVar3.a(string3));
        new j(wVar, yVar.b(), false).e(new j(mainActivity, fileItem));
    }
}
