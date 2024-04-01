package z4;

import a2.m;
import a5.c;
import androidx.appcompat.widget.w;
import b1.o;
import b1.v;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import v4.i;
import w4.p;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public t f6113a;

    /* renamed from: b  reason: collision with root package name */
    public String f6114b;

    /* renamed from: c  reason: collision with root package name */
    public q f6115c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f6116d;

    public y() {
        this.f6116d = new LinkedHashMap();
        this.f6114b = "GET";
        this.f6115c = new q();
    }

    public final void a(String str, String str2) {
        q qVar = this.f6115c;
        qVar.getClass();
        p.e(str);
        p.h(str2, str);
        qVar.a(str, str2);
    }

    public final w b() {
        Map map;
        t tVar = this.f6113a;
        if (tVar != null) {
            String str = this.f6114b;
            r b6 = this.f6115c.b();
            byte[] bArr = c.f212a;
            LinkedHashMap linkedHashMap = this.f6116d;
            o.m(linkedHashMap, "$this$toImmutableMap");
            if (linkedHashMap.isEmpty()) {
                map = g4.o.f2907d;
            } else {
                map = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                o.l(map, "Collections.unmodifiableMap(LinkedHashMap(this))");
            }
            return new w(tVar, str, b6, (v) null, map);
        }
        throw new IllegalStateException("url == null".toString());
    }

    public final void c(String str, String str2) {
        o.m(str2, "value");
        q qVar = this.f6115c;
        qVar.getClass();
        p.e(str);
        p.h(str2, str);
        qVar.c(str);
        qVar.a(str, str2);
    }

    public final void d(String str, v vVar) {
        boolean z5 = false;
        if (str.length() > 0) {
            if (vVar == null) {
                if (o.c(str, "POST") || o.c(str, "PUT") || o.c(str, "PATCH") || o.c(str, "PROPPATCH") || o.c(str, "REPORT")) {
                    z5 = true;
                }
                if (!(!z5)) {
                    throw new IllegalArgumentException(m.i("method ", str, " must have a request body.").toString());
                }
            } else if (!o.L(str)) {
                throw new IllegalArgumentException(m.i("method ", str, " must not have a request body.").toString());
            }
            this.f6114b = str;
            return;
        }
        throw new IllegalArgumentException("method.isEmpty() == true".toString());
    }

    public final void e(String str) {
        String str2;
        String str3;
        o.m(str, "url");
        if (i.k0(str, "ws:", true)) {
            str2 = str.substring(3);
            o.l(str2, "(this as java.lang.String).substring(startIndex)");
            str3 = "http:";
        } else {
            if (i.k0(str, "wss:", true)) {
                str2 = str.substring(4);
                o.l(str2, "(this as java.lang.String).substring(startIndex)");
                str3 = "https:";
            }
            o.m(str, "$this$toHttpUrl");
            s sVar = new s();
            sVar.d((t) null, str);
            this.f6113a = sVar.a();
        }
        str = str3.concat(str2);
        o.m(str, "$this$toHttpUrl");
        s sVar2 = new s();
        sVar2.d((t) null, str);
        this.f6113a = sVar2.a();
    }

    public y(w wVar) {
        LinkedHashMap linkedHashMap;
        this.f6116d = new LinkedHashMap();
        this.f6113a = (t) wVar.f820c;
        this.f6114b = (String) wVar.f821d;
        Object obj = wVar.f823f;
        Map map = (Map) wVar.f824g;
        if (map.isEmpty()) {
            linkedHashMap = new LinkedHashMap();
        } else {
            o.m(map, "<this>");
            linkedHashMap = new LinkedHashMap(map);
        }
        this.f6116d = linkedHashMap;
        this.f6115c = ((r) wVar.f822e).c();
    }
}
