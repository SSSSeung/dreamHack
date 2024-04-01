package androidx.emoji2.text;

import android.content.Context;
import b1.o;
import com.bumptech.glide.d;
import com.bumptech.glide.e;
import com.theori.dreamdrm.MainActivity;
import e.h;
import e4.i;
import g.a;
import java.util.concurrent.ThreadPoolExecutor;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1022d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f1023e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f1024f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f1025g;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i3) {
        this.f1022d = i3;
        this.f1023e = obj;
        this.f1024f = obj2;
        this.f1025g = obj3;
    }

    public final void run() {
        switch (this.f1022d) {
            case 0:
                a aVar = (a) this.f1023e;
                d dVar = (d) this.f1024f;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1025g;
                aVar.getClass();
                try {
                    m j6 = e.j(aVar.f2709e);
                    if (j6 != null) {
                        u uVar = (u) j6.f1008a;
                        synchronized (uVar.f1046g) {
                            uVar.f1048i = threadPoolExecutor;
                        }
                        j6.f1008a.a(new o(dVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    dVar.s(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                MainActivity mainActivity = (MainActivity) this.f1023e;
                String str = (String) this.f1024f;
                String str2 = (String) this.f1025g;
                int i3 = MainActivity.A;
                o.m(mainActivity, "this$0");
                o.m(str, "$title");
                o.m(str2, "$msg");
                h hVar = new h((Context) mainActivity);
                Object obj = hVar.f2376e;
                ((e.d) obj).f2289d = str;
                ((e.d) obj).f2291f = str2;
                i iVar = new i(mainActivity);
                e.d dVar2 = (e.d) obj;
                dVar2.f2292g = "종료";
                dVar2.f2293h = iVar;
                ((e.d) obj).f2294i = false;
                hVar.a().show();
                return;
        }
    }
}
