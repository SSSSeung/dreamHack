package p1;

public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    public int f4438a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f4439b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f4440c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f4441d = 1;

    /* renamed from: e  reason: collision with root package name */
    public int f4442e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4443f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4444g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4445h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4446i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4447j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4448k = false;

    /* renamed from: l  reason: collision with root package name */
    public int f4449l;

    /* renamed from: m  reason: collision with root package name */
    public long f4450m;

    /* renamed from: n  reason: collision with root package name */
    public int f4451n;

    public final void a(int i3) {
        if ((this.f4441d & i3) == 0) {
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i3) + " but it is " + Integer.toBinaryString(this.f4441d));
        }
    }

    public final int b() {
        return this.f4444g ? this.f4439b - this.f4440c : this.f4442e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f4438a + ", mData=null, mItemCount=" + this.f4442e + ", mIsMeasuring=" + this.f4446i + ", mPreviousLayoutItemCount=" + this.f4439b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4440c + ", mStructureChanged=" + this.f4443f + ", mInPreLayout=" + this.f4444g + ", mRunSimpleAnimations=" + this.f4447j + ", mRunPredictiveAnimations=" + this.f4448k + '}';
    }
}
