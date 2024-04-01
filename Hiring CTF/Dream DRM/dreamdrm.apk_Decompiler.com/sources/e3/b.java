package e3;

import com.google.android.material.carousel.CarouselLayoutManager;

public final class b extends c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2560b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f2561c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, CarouselLayoutManager carouselLayoutManager, int i6) {
        super(i3);
        this.f2560b = i6;
        this.f2561c = carouselLayoutManager;
    }

    public final int a() {
        int i3 = this.f2560b;
        CarouselLayoutManager carouselLayoutManager = this.f2561c;
        switch (i3) {
            case 0:
                return carouselLayoutManager.f4609o;
            default:
                return carouselLayoutManager.f4609o - carouselLayoutManager.B();
        }
    }

    public final int b() {
        switch (this.f2560b) {
            case 0:
                return this.f2561c.C();
            default:
                return 0;
        }
    }

    public final int c() {
        int i3 = this.f2560b;
        CarouselLayoutManager carouselLayoutManager = this.f2561c;
        switch (i3) {
            case 0:
                return carouselLayoutManager.f4608n - carouselLayoutManager.D();
            default:
                return carouselLayoutManager.f4608n;
        }
    }

    public final int d() {
        switch (this.f2560b) {
            case 0:
                return 0;
            default:
                return this.f2561c.E();
        }
    }
}
