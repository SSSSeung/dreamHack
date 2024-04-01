package g5;

import b1.o;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import l5.j;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final c[] f2971a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map f2972b;

    static {
        c cVar = new c(c.f2943i, "");
        j jVar = c.f2940f;
        j jVar2 = c.f2941g;
        j jVar3 = c.f2942h;
        j jVar4 = c.f2939e;
        c[] cVarArr = {cVar, new c(jVar, "GET"), new c(jVar, "POST"), new c(jVar2, "/"), new c(jVar2, "/index.html"), new c(jVar3, "http"), new c(jVar3, "https"), new c(jVar4, "200"), new c(jVar4, "204"), new c(jVar4, "206"), new c(jVar4, "304"), new c(jVar4, "400"), new c(jVar4, "404"), new c(jVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f2971a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i3 = 0; i3 < 61; i3++) {
            if (!linkedHashMap.containsKey(cVarArr[i3].f2945b)) {
                linkedHashMap.put(cVarArr[i3].f2945b, Integer.valueOf(i3));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        o.l(unmodifiableMap, "Collections.unmodifiableMap(result)");
        f2972b = unmodifiableMap;
    }

    public static void a(j jVar) {
        o.m(jVar, "name");
        int b6 = jVar.b();
        for (int i3 = 0; i3 < b6; i3++) {
            byte b7 = (byte) 65;
            byte b8 = (byte) 90;
            byte e6 = jVar.e(i3);
            if (b7 <= e6 && b8 >= e6) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(jVar.i()));
            }
        }
    }
}
