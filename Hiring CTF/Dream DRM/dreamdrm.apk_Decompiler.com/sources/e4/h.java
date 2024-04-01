package e4;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import androidx.emoji2.text.n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b1.o;
import b1.v;
import com.theori.dreamdrm.MainActivity;
import com.theori.dreamdrm.R;
import d2.a;
import d5.j;
import h5.l;
import v4.i;
import y.e;
import z4.w;
import z4.y;

public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ EditText f2578d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f2579e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ MainActivity f2580f;

    public /* synthetic */ h(EditText editText, EditText editText2, MainActivity mainActivity) {
        this.f2578d = editText;
        this.f2579e = editText2;
        this.f2580f = mainActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i3) {
        int i6 = MainActivity.A;
        MainActivity mainActivity = this.f2580f;
        o.m(mainActivity, "this$0");
        String obj = this.f2578d.getText().toString();
        String obj2 = this.f2579e.getText().toString();
        if (!i.S(obj, ".dreamhack.games")) {
            mainActivity.runOnUiThread(new n(mainActivity, "Invalid host", "Host must be ends with \".dreamhack.games\"", 1));
            return;
        }
        l.f3485d = obj;
        l.f3486e = obj2;
        new a(new e(4, mainActivity)).start();
        View findViewById = mainActivity.findViewById(R.id.recyclerView);
        o.l(findViewById, "findViewById(R.id.recyclerView)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        mainActivity.f2111y = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        g gVar = new g(mainActivity, mainActivity);
        mainActivity.f2112z = gVar;
        RecyclerView recyclerView2 = mainActivity.f2111y;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(gVar);
            w wVar = new w();
            y yVar = new y();
            StringBuilder sb = new StringBuilder("http://");
            sb.append(l.f3485d);
            sb.append(':');
            sb.append(l.f3486e);
            m mVar = new m(v.E(93, 25, 129, 92, 162, 195, 243, 146, 18, 33, 159, 134, 104, 94, 252, 168));
            String string = mainActivity.getString(R.string.books_path);
            o.l(string, "getString(R.string.books_path)");
            sb.append(mVar.a(string));
            yVar.e(sb.toString());
            m mVar2 = new m(v.E(242, 90, 182, 126, 98, 130, 73, 158, 179, 228, 252, 119, 74, 45, 169, 127));
            String string2 = mainActivity.getString(R.string.user_agent);
            o.l(string2, "getString(R.string.user_agent)");
            yVar.a("User-Agent", mVar2.a(string2));
            m mVar3 = new m(v.E(161, 239, 215, 17, 227, 215, 183, 129, 55, 123, 66, 109, 147, 253, 60, 1));
            String string3 = mainActivity.getString(R.string.authorization);
            o.l(string3, "getString(R.string.authorization)");
            yVar.a("Authorization", mVar3.a(string3));
            new j(wVar, yVar.b(), false).e(new l(mainActivity));
            return;
        }
        o.Y("recyclerView");
        throw null;
    }
}
