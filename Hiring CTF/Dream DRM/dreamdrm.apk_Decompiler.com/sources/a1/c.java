package a1;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import e.n0;
import x0.d;
import x0.e;
import x0.f;
import x0.u0;

public final class c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f15a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(InputConnection inputConnection, b bVar) {
        super(inputConnection, false);
        this.f15a = bVar;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        Bundle bundle2;
        n0 n0Var = inputContentInfo == null ? null : new n0(17, (Object) new n0((Object) inputContentInfo));
        View view = (View) this.f15a.f14a;
        boolean z5 = false;
        if ((i3 & 1) != 0) {
            try {
                n0Var.e();
                Parcelable parcelable = (Parcelable) ((d) n0Var.f2403e).u();
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e6) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e6);
            }
        } else {
            bundle2 = bundle;
        }
        ClipData clipData = new ClipData(n0Var.s(), new ClipData.Item(n0Var.w()));
        e dVar = Build.VERSION.SDK_INT >= 31 ? new d(clipData, 2) : new f(clipData, 2);
        dVar.c(n0Var.j());
        dVar.b(bundle2);
        if (u0.h(view, dVar.a()) == null) {
            z5 = true;
        }
        if (z5) {
            return true;
        }
        return super.commitContent(inputContentInfo, i3, bundle);
    }

    public final boolean performPrivateCommand(String str, Bundle bundle) {
        return super.performPrivateCommand(str, bundle);
    }
}
