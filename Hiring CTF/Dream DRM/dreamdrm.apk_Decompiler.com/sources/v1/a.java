package v1;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k.b;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f5379a;

    /* renamed from: b  reason: collision with root package name */
    public final b f5380b;

    /* renamed from: c  reason: collision with root package name */
    public final b f5381c;

    public a(b bVar, b bVar2, b bVar3) {
        this.f5379a = bVar;
        this.f5380b = bVar2;
        this.f5381c = bVar3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        b bVar = this.f5381c;
        Class cls2 = (Class) bVar.getOrDefault(name, (Object) null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        bVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        b bVar = this.f5379a;
        Method method = (Method) bVar.getOrDefault(str, (Object) null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Class<a> cls = a.class;
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        bVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        b bVar = this.f5380b;
        Method method = (Method) bVar.getOrDefault(name, (Object) null);
        if (method != null) {
            return method;
        }
        Class b6 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b6.getDeclaredMethod("write", new Class[]{cls, a.class});
        bVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i3);

    public final int f(int i3, int i6) {
        return !e(i6) ? i3 : ((b) this).f5383e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i3) {
        if (!e(i3)) {
            return parcelable;
        }
        return ((b) this).f5383e.readParcelable(b.class.getClassLoader());
    }

    public final c h() {
        String readString = ((b) this).f5383e.readString();
        if (readString == null) {
            return null;
        }
        b a6 = a();
        try {
            return (c) c(readString).invoke((Object) null, new Object[]{a6});
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e6);
        } catch (InvocationTargetException e7) {
            if (e7.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e7.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e9);
        }
    }

    public abstract void i(int i3);

    public final void j(int i3, int i6) {
        i(i6);
        ((b) this).f5383e.writeInt(i3);
    }

    public final void k(Parcelable parcelable, int i3) {
        i(i3);
        ((b) this).f5383e.writeParcelable(parcelable, 0);
    }

    public final void l(c cVar) {
        if (cVar == null) {
            ((b) this).f5383e.writeString((String) null);
            return;
        }
        try {
            ((b) this).f5383e.writeString(b(cVar.getClass()).getName());
            b a6 = a();
            try {
                d(cVar.getClass()).invoke((Object) null, new Object[]{cVar, a6});
                int i3 = a6.f5387i;
                if (i3 >= 0) {
                    int i6 = a6.f5382d.get(i3);
                    Parcel parcel = a6.f5383e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i6);
                    parcel.writeInt(dataPosition - i6);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e6);
            } catch (InvocationTargetException e7) {
                if (e7.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e7.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
            } catch (NoSuchMethodException e8) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
            } catch (ClassNotFoundException e9) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e9);
            }
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e10);
        }
    }
}
