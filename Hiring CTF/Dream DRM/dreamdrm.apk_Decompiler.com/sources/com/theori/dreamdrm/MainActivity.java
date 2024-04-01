package com.theori.dreamdrm;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import e.d;
import e.h;
import e.k0;
import e.l;
import e4.f;
import e4.g;

public final class MainActivity extends l implements f {
    public static final /* synthetic */ int A = 0;

    /* renamed from: y  reason: collision with root package name */
    public RecyclerView f2111y;

    /* renamed from: z  reason: collision with root package name */
    public g f2112z;

    static {
        System.loadLibrary("native-lib");
    }

    public final native boolean decrypt(String str, String str2);

    public final void o(String str) {
        runOnUiThread(new k0(this, 3, str));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        View inflate = LayoutInflater.from(this).inflate(R.layout.dialog_host_port, (ViewGroup) null);
        h hVar = new h((Context) this);
        Object obj = hVar.f2376e;
        ((d) obj).f2298m = inflate;
        e4.h hVar2 = new e4.h((EditText) inflate.findViewById(R.id.editTextHost), (EditText) inflate.findViewById(R.id.editTextPort), this);
        d dVar = (d) obj;
        dVar.f2292g = "Go";
        dVar.f2293h = hVar2;
        ((d) obj).f2294i = false;
        hVar.a().show();
    }
}
