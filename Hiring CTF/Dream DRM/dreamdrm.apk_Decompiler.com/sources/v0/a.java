package v0;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f5356e = new byte[1792];

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f5357a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5358b;

    /* renamed from: c  reason: collision with root package name */
    public int f5359c;

    /* renamed from: d  reason: collision with root package name */
    public char f5360d;

    static {
        for (int i3 = 0; i3 < 1792; i3++) {
            f5356e[i3] = Character.getDirectionality(i3);
        }
    }

    public a(CharSequence charSequence) {
        this.f5357a = charSequence;
        this.f5358b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f5357a;
        char charAt = charSequence.charAt(this.f5359c - 1);
        this.f5360d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f5359c);
            this.f5359c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f5359c--;
        char c6 = this.f5360d;
        return c6 < 1792 ? f5356e[c6] : Character.getDirectionality(c6);
    }
}
