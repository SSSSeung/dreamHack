package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import b1.o;
import l.a;
import l.b;
import l.c;
import l.e;
import l.f;
import p1.y0;
import q3.d;
import s3.a0;

public final class n3 implements Parcelable.ClassLoaderCreator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f689a;

    public /* synthetic */ n3(int i3) {
        this.f689a = i3;
    }

    public static b a(Parcel parcel, ClassLoader classLoader) {
        e eVar;
        o.m(parcel, "parcel");
        if (classLoader == null) {
            classLoader = n3.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            eVar = a.f4047a;
        } else if (readInt == 1) {
            eVar = f.f4051a;
        } else if (readInt == 2) {
            eVar = c.f4048a;
        } else {
            throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
        }
        return new b(readValue, eVar);
    }

    public final Object createFromParcel(Parcel parcel) {
        switch (this.f689a) {
            case 0:
                return new o3(parcel, (ClassLoader) null);
            case 1:
                return new d4(parcel, (ClassLoader) null);
            case 2:
                o.m(parcel, "parcel");
                return a(parcel, (ClassLoader) null);
            case 3:
                return new l0.f(parcel, (ClassLoader) null);
            case 4:
                if (parcel.readParcelable((ClassLoader) null) == null) {
                    return e1.b.f2482e;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                return new y0(parcel, (ClassLoader) null);
            case 6:
                return new a3.b(parcel, (ClassLoader) null);
            case 7:
                return new c3.c(parcel, (ClassLoader) null);
            case 8:
                return new d3.b(parcel, (ClassLoader) null);
            case 9:
                return new k3.a(parcel, (ClassLoader) null);
            case 10:
                return new d(parcel, (ClassLoader) null);
            default:
                return new a0(parcel, (ClassLoader) null);
        }
    }

    public final Object[] newArray(int i3) {
        switch (this.f689a) {
            case 0:
                return new o3[i3];
            case 1:
                return new d4[i3];
            case 2:
                return new b[i3];
            case 3:
                return new l0.f[i3];
            case 4:
                return new e1.b[i3];
            case 5:
                return new y0[i3];
            case 6:
                return new a3.b[i3];
            case 7:
                return new c3.c[i3];
            case 8:
                return new d3.b[i3];
            case 9:
                return new k3.a[i3];
            case 10:
                return new d[i3];
            default:
                return new a0[i3];
        }
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f689a) {
            case 0:
                return new o3(parcel, classLoader);
            case 1:
                return new d4(parcel, classLoader);
            case 2:
                return a(parcel, classLoader);
            case 3:
                return new l0.f(parcel, classLoader);
            case 4:
                if (parcel.readParcelable(classLoader) == null) {
                    return e1.b.f2482e;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                return new y0(parcel, classLoader);
            case 6:
                return new a3.b(parcel, classLoader);
            case 7:
                return new c3.c(parcel, classLoader);
            case 8:
                return new d3.b(parcel, classLoader);
            case 9:
                return new k3.a(parcel, classLoader);
            case 10:
                return new d(parcel, classLoader);
            default:
                return new a0(parcel, classLoader);
        }
    }
}
