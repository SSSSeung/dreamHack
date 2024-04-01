package q0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.appcompat.widget.n1;
import e.n0;
import java.io.IOException;
import java.io.InputStream;
import p0.f;
import u0.g;

public final class l extends n0 {
    public l() {
        super(10);
    }

    public static Font H(FontFamily fontFamily, int i3) {
        k.q();
        FontStyle l6 = k.l((i3 & 1) != 0 ? 700 : 400, (i3 & 2) != 0 ? 1 : 0);
        Font g6 = fontFamily.getFont(0);
        int I = I(l6, g6.getStyle());
        for (int i6 = 1; i6 < fontFamily.getSize(); i6++) {
            Font j6 = fontFamily.getFont(i6);
            int I2 = I(l6, j6.getStyle());
            if (I2 < I) {
                g6 = j6;
                I = I2;
            }
        }
        return g6;
    }

    public static int I(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final Typeface A(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Typeface B(Context context, Resources resources, int i3, String str, int i6) {
        try {
            n1.z();
            Font i7 = n1.d(resources, i3).build();
            n1.C();
            FontFamily k6 = n1.h(i7).build();
            n1.m();
            return n1.c(k6).setStyle(i7.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final g D(int i3, g[] gVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Typeface y(Context context, f fVar, Resources resources, int i3) {
        try {
            FontFamily.Builder builder = null;
            for (p0.g gVar : fVar.f4389a) {
                try {
                    n1.z();
                    Font i6 = n1.d(resources, gVar.f4395f).setWeight(gVar.f4391b).setSlant(gVar.f4392c ? 1 : 0).setTtcIndex(gVar.f4394e).setFontVariationSettings(gVar.f4393d).build();
                    if (builder == null) {
                        n1.C();
                        builder = n1.h(i6);
                    } else {
                        builder.addFont(i6);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily k6 = builder.build();
            n1.m();
            return n1.c(k6).setStyle(H(k6, i3).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    public final Typeface z(Context context, g[] gVarArr, int i3) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (g gVar : gVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(gVar.f5254a, "r", (CancellationSignal) null);
                    if (openFileDescriptor != null) {
                        n1.z();
                        Font i6 = n1.f(openFileDescriptor).setWeight(gVar.f5256c).setSlant(gVar.f5257d ? 1 : 0).setTtcIndex(gVar.f5255b).build();
                        if (builder == null) {
                            n1.C();
                            builder = n1.h(i6);
                        } else {
                            builder.addFont(i6);
                        }
                    } else if (openFileDescriptor == null) {
                    }
                    openFileDescriptor.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily k6 = builder.build();
            n1.m();
            return n1.c(k6).setStyle(H(k6, i3).getStyle()).build();
            throw th;
        } catch (Exception unused2) {
            return null;
        }
    }
}
