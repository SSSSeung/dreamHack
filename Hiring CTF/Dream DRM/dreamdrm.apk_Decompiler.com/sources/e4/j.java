package e4;

import a5.c;
import b1.o;
import b1.v;
import com.theori.dreamdrm.DecryptionItem;
import com.theori.dreamdrm.FileItem;
import com.theori.dreamdrm.MainActivity;
import com.theori.dreamdrm.MainActivity$downloadAndDisplayPdf$1$onResponse$fileType$1;
import com.theori.dreamdrm.R;
import h5.l;
import java.io.IOException;
import l5.i;
import v3.n;
import z4.a0;
import z4.c0;
import z4.e;
import z4.w;
import z4.y;

public final class j implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f2582a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FileItem f2583b;

    public j(MainActivity mainActivity, FileItem fileItem) {
        this.f2582a = mainActivity;
        this.f2583b = fileItem;
    }

    public final void a(d5.j jVar, IOException iOException) {
        o.m(jVar, "call");
        this.f2582a.o("Failed to fetch file information from the server");
    }

    public final void b(d5.j jVar, a0 a0Var) {
        Throwable th;
        a0 a0Var2 = a0Var;
        o.m(jVar, "call");
        int i3 = a0Var2.f5959g;
        if (200 <= i3 && 299 >= i3) {
            String str = null;
            c0 c0Var = a0Var2.f5962j;
            if (c0Var != null) {
                i e6 = c0Var.e();
                try {
                    String A = e6.A(c.p(e6, c0Var.b()));
                    v.l(e6, (Throwable) null);
                    str = A;
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    v.l(e6, th);
                    throw th3;
                }
            }
            DecryptionItem decryptionItem = (DecryptionItem) new n().a(str, new MainActivity$downloadAndDisplayPdf$1$onResponse$fileType$1().f2105b);
            boolean b6 = decryptionItem.b();
            MainActivity mainActivity = this.f2582a;
            if (!b6) {
                mainActivity.o("Failed to fetch file information from the server");
                return;
            }
            int i6 = MainActivity.A;
            mainActivity.getClass();
            w wVar = new w();
            y yVar = new y();
            StringBuilder sb = new StringBuilder("http://");
            sb.append(l.f3485d);
            sb.append(':');
            sb.append(l.f3486e);
            m mVar = new m(v.E(130, 130, 153, 10, 107, 150, 176, 243, 175, 167, 21, 124, 33, 132, 221, 227));
            String string = mainActivity.getString(R.string.download_path);
            o.l(string, "getString(R.string.download_path)");
            sb.append(mVar.a(string));
            sb.append(decryptionItem.c());
            yVar.e(sb.toString());
            m mVar2 = new m(v.E(242, 90, 182, 126, 98, 130, 73, 158, 179, 228, 252, 119, 74, 45, 169, 127));
            String string2 = mainActivity.getString(R.string.user_agent);
            o.l(string2, "getString(R.string.user_agent)");
            yVar.a("User-Agent", mVar2.a(string2));
            m mVar3 = new m(v.E(161, 239, 215, 17, 227, 215, 183, 129, 55, 123, 66, 109, 147, 253, 60, 1));
            String string3 = mainActivity.getString(R.string.authorization);
            o.l(string3, "getString(R.string.authorization)");
            yVar.a("Authorization", mVar3.a(string3));
            new d5.j(wVar, yVar.b(), false).e(new k(mainActivity, this.f2583b, decryptionItem));
            return;
        }
        throw new IOException("Unexpected code " + a0Var2);
    }
}
