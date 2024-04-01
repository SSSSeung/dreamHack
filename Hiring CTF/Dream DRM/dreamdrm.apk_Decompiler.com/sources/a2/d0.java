package a2;

import androidx.appcompat.widget.a0;
import b1.o;
import com.bumptech.glide.load.data.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w0.c;
import y1.i;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final c f31a;

    /* renamed from: b  reason: collision with root package name */
    public final List f32b;

    /* renamed from: c  reason: collision with root package name */
    public final String f33c;

    public d0(Class cls, Class cls2, Class cls3, List list, androidx.activity.result.c cVar) {
        this.f31a = cVar;
        if (!list.isEmpty()) {
            this.f32b = list;
            this.f33c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final f0 a(int i3, int i6, a0 a0Var, i iVar, g gVar) {
        f0 f0Var;
        c cVar = this.f31a;
        Object b6 = cVar.b();
        o.i(b6);
        List list = (List) b6;
        try {
            List list2 = this.f32b;
            int size = list2.size();
            f0Var = null;
            for (int i7 = 0; i7 < size; i7++) {
                f0Var = ((o) list2.get(i7)).a(i3, i6, a0Var, iVar, gVar);
                if (f0Var != null) {
                    break;
                }
            }
        } catch (b0 e6) {
            list.add(e6);
        } catch (Throwable th) {
            cVar.a(list);
            throw th;
        }
        if (f0Var != null) {
            cVar.a(list);
            return f0Var;
        }
        throw new b0(this.f33c, new ArrayList(list));
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f32b.toArray()) + '}';
    }
}
