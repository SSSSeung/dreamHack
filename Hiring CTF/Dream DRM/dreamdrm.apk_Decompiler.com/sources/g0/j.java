package g0;

import java.util.Arrays;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2817a;

    /* renamed from: b  reason: collision with root package name */
    public int f2818b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f2819c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f2820d = 0;

    /* renamed from: e  reason: collision with root package name */
    public float f2821e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2822f = false;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f2823g = new float[9];

    /* renamed from: h  reason: collision with root package name */
    public final float[] f2824h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    public c[] f2825i = new c[16];

    /* renamed from: j  reason: collision with root package name */
    public int f2826j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f2827k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f2828l;

    public j(int i3) {
        this.f2828l = i3;
    }

    public final void a(c cVar) {
        int i3 = 0;
        while (true) {
            int i6 = this.f2826j;
            if (i3 >= i6) {
                c[] cVarArr = this.f2825i;
                if (i6 >= cVarArr.length) {
                    this.f2825i = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                c[] cVarArr2 = this.f2825i;
                int i7 = this.f2826j;
                cVarArr2[i7] = cVar;
                this.f2826j = i7 + 1;
                return;
            } else if (this.f2825i[i3] != cVar) {
                i3++;
            } else {
                return;
            }
        }
    }

    public final void b(c cVar) {
        int i3 = this.f2826j;
        int i6 = 0;
        while (i6 < i3) {
            if (this.f2825i[i6] == cVar) {
                while (i6 < i3 - 1) {
                    c[] cVarArr = this.f2825i;
                    int i7 = i6 + 1;
                    cVarArr[i6] = cVarArr[i7];
                    i6 = i7;
                }
                this.f2826j--;
                return;
            }
            i6++;
        }
    }

    public final void c() {
        this.f2828l = 5;
        this.f2820d = 0;
        this.f2818b = -1;
        this.f2819c = -1;
        this.f2821e = 0.0f;
        this.f2822f = false;
        int i3 = this.f2826j;
        for (int i6 = 0; i6 < i3; i6++) {
            this.f2825i[i6] = null;
        }
        this.f2826j = 0;
        this.f2827k = 0;
        this.f2817a = false;
        Arrays.fill(this.f2824h, 0.0f);
    }

    public final void d(c cVar) {
        int i3 = this.f2826j;
        for (int i6 = 0; i6 < i3; i6++) {
            this.f2825i[i6].i(cVar, false);
        }
        this.f2826j = 0;
    }

    public final String toString() {
        return "" + this.f2818b;
    }
}
