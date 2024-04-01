package a2;

public final class a0 implements Appendable {

    /* renamed from: d  reason: collision with root package name */
    public final Appendable f16d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17e = true;

    public a0(Appendable appendable) {
        this.f16d = appendable;
    }

    public final Appendable append(char c6) {
        boolean z5 = this.f17e;
        Appendable appendable = this.f16d;
        boolean z6 = false;
        if (z5) {
            this.f17e = false;
            appendable.append("  ");
        }
        if (c6 == 10) {
            z6 = true;
        }
        this.f17e = z6;
        appendable.append(c6);
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    public final Appendable append(CharSequence charSequence, int i3, int i6) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z5 = this.f17e;
        Appendable appendable = this.f16d;
        boolean z6 = false;
        if (z5) {
            this.f17e = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i6 - 1) == 10) {
            z6 = true;
        }
        this.f17e = z6;
        appendable.append(charSequence, i3, i6);
        return this;
    }
}
