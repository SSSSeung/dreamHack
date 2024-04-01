package h1;

import android.widget.EditText;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f3356a;

    /* renamed from: b  reason: collision with root package name */
    public int f3357b;

    /* renamed from: c  reason: collision with root package name */
    public Object f3358c;

    public b() {
        this.f3358c = new Object[16];
    }

    public b(EditText editText) {
        this.f3356a = Integer.MAX_VALUE;
        this.f3357b = 0;
        if (editText != null) {
            this.f3358c = new a(editText);
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }

    public b(byte[] bArr, int i3, int i6) {
        this.f3358c = bArr;
        this.f3356a = i3;
        this.f3357b = i6;
    }
}
