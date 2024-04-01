package e2;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w0.c;
import y1.f;
import y1.i;

public final class z implements v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2555a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2556b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2557c;

    public z(Resources resources, v vVar) {
        this.f2557c = resources;
        this.f2556b = vVar;
    }

    public final boolean a(Object obj) {
        switch (this.f2555a) {
            case 0:
                for (v a6 : (List) this.f2556b) {
                    if (a6.a(obj)) {
                        return true;
                    }
                }
                return false;
            default:
                Integer num = (Integer) obj;
                return true;
        }
    }

    public final u b(Object obj, int i3, int i6, i iVar) {
        Uri uri;
        u b6;
        int i7 = this.f2555a;
        Object obj2 = this.f2557c;
        Object obj3 = this.f2556b;
        switch (i7) {
            case 0:
                List list = (List) obj3;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                f fVar = null;
                for (int i8 = 0; i8 < size; i8++) {
                    v vVar = (v) list.get(i8);
                    if (vVar.a(obj) && (b6 = vVar.b(obj, i3, i6, iVar)) != null) {
                        arrayList.add(b6.f2546c);
                        fVar = b6.f2544a;
                    }
                }
                if (arrayList.isEmpty() || fVar == null) {
                    return null;
                }
                return new u(fVar, new y(arrayList, (c) obj2));
            default:
                Integer num = (Integer) obj;
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) obj2).getResourcePackageName(num.intValue()) + '/' + ((Resources) obj2).getResourceTypeName(num.intValue()) + '/' + ((Resources) obj2).getResourceEntryName(num.intValue()));
                } catch (Resources.NotFoundException e6) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num, e6);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((v) obj3).b(uri, i3, i6, iVar);
        }
    }

    public final String toString() {
        switch (this.f2555a) {
            case 0:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((List) this.f2556b).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public z(ArrayList arrayList, c cVar) {
        this.f2556b = arrayList;
        this.f2557c = cVar;
    }
}
