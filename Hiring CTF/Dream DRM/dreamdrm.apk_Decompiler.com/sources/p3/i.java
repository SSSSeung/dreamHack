package p3;

import com.bumptech.glide.d;

public final class i extends d {
    public final void h(float f6, float f7, u uVar) {
        uVar.d(f7 * f6, 180.0f, 90.0f);
        float f8 = f7 * 2.0f * f6;
        q qVar = new q(0.0f, 0.0f, f8, f8);
        qVar.f4837f = 180.0f;
        qVar.f4838g = 90.0f;
        uVar.f4850g.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.f4851h.add(oVar);
        uVar.f4848e = 270.0f;
        float f9 = (f8 + 0.0f) * 0.5f;
        float f10 = (f8 - 0.0f) / 2.0f;
        double d6 = (double) 270.0f;
        uVar.f4846c = (((float) Math.cos(Math.toRadians(d6))) * f10) + f9;
        uVar.f4847d = (f10 * ((float) Math.sin(Math.toRadians(d6)))) + f9;
    }
}
