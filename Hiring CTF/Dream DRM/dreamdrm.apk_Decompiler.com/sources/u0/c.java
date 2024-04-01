package u0;

import android.content.Context;
import androidx.appcompat.widget.r;
import java.util.concurrent.Callable;

public final class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5241a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f5242b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f5243c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ r f5244d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f5245e;

    public /* synthetic */ c(String str, Context context, r rVar, int i3, int i6) {
        this.f5241a = i6;
        this.f5242b = str;
        this.f5243c = context;
        this.f5244d = rVar;
        this.f5245e = i3;
    }

    public final e a() {
        int i3 = this.f5241a;
        Context context = this.f5243c;
        String str = this.f5242b;
        int i6 = this.f5245e;
        r rVar = this.f5244d;
        switch (i3) {
            case 0:
                return f.a(str, context, rVar, i6);
            default:
                try {
                    return f.a(str, context, rVar, i6);
                } catch (Throwable unused) {
                    return new e(-3);
                }
        }
    }

    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.f5241a) {
            case 0:
                return a();
            default:
                return a();
        }
    }
}
