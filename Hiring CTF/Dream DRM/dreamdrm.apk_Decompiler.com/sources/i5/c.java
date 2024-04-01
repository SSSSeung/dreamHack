package i5;

import b1.o;
import c5.f;
import g5.g;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import z4.w;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArraySet f3609a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    public static final Map f3610b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<w> cls = w.class;
        Package packageR = cls.getPackage();
        String name = packageR != null ? packageR.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(cls.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(g.class.getName(), "okhttp.Http2");
        linkedHashMap.put(f.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap.size();
        f3610b = size != 0 ? size != 1 ? new LinkedHashMap(linkedHashMap) : o.Z(linkedHashMap) : g4.o.f2907d;
    }
}
