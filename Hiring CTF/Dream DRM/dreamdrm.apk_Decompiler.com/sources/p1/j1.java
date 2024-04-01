package p1;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

public final class j1 {

    /* renamed from: a  reason: collision with root package name */
    public int f4533a;

    /* renamed from: b  reason: collision with root package name */
    public int f4534b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4535c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4536d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4537e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f4538f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f4539g;

    public j1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f4539g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f4533a = -1;
        this.f4534b = Integer.MIN_VALUE;
        this.f4535c = false;
        this.f4536d = false;
        this.f4537e = false;
        int[] iArr = this.f4538f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
