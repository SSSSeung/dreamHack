package w1;

import java.io.File;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f5432a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f5433b;

    /* renamed from: c  reason: collision with root package name */
    public final File[] f5434c;

    /* renamed from: d  reason: collision with root package name */
    public final File[] f5435d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5436e;

    /* renamed from: f  reason: collision with root package name */
    public c f5437f;

    /* renamed from: g  reason: collision with root package name */
    public long f5438g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ f f5439h;

    public d(f fVar, String str) {
        this.f5439h = fVar;
        this.f5432a = str;
        int i3 = fVar.f5451j;
        this.f5433b = new long[i3];
        this.f5434c = new File[i3];
        this.f5435d = new File[i3];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i6 = 0; i6 < fVar.f5451j; i6++) {
            sb.append(i6);
            File[] fileArr = this.f5434c;
            String sb2 = sb.toString();
            File file = fVar.f5445d;
            fileArr[i6] = new File(file, sb2);
            sb.append(".tmp");
            this.f5435d[i6] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (long append : this.f5433b) {
            sb.append(' ');
            sb.append(append);
        }
        return sb.toString();
    }
}
