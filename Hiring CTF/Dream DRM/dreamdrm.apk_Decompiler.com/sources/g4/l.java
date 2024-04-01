package g4;

import b1.o;
import b1.v;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import o4.c;
import p.a;

public abstract class l extends k {
    public static final Object Y(Collection collection) {
        o.m(collection, "<this>");
        if (collection instanceof List) {
            List list = (List) collection;
            if (!list.isEmpty()) {
                return list.get(0);
            }
            throw new NoSuchElementException("List is empty.");
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final void Z(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, c cVar) {
        o.m(iterable, "<this>");
        o.m(charSequence, "separator");
        o.m(charSequence2, "prefix");
        o.m(charSequence3, "postfix");
        o.m(charSequence4, "truncated");
        sb.append(charSequence2);
        int i6 = 0;
        for (Object next : iterable) {
            i6++;
            if (i6 > 1) {
                sb.append(charSequence);
            }
            if (i3 >= 0 && i6 > i3) {
                break;
            }
            com.bumptech.glide.c.b(sb, next, cVar);
        }
        if (i3 >= 0 && i6 > i3) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String b0(Iterable iterable, String str, String str2, String str3, a aVar, int i3) {
        if ((i3 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i3 & 2) != 0 ? "" : str2;
        String str6 = (i3 & 4) != 0 ? "" : str3;
        int i6 = (i3 & 8) != 0 ? -1 : 0;
        String str7 = (i3 & 16) != 0 ? "..." : null;
        a aVar2 = (i3 & 32) != 0 ? null : aVar;
        o.m(iterable, "<this>");
        o.m(str4, "separator");
        o.m(str5, "prefix");
        o.m(str6, "postfix");
        o.m(str7, "truncated");
        StringBuilder sb = new StringBuilder();
        Z(iterable, sb, str4, str5, str6, i6, str7, aVar2);
        String sb2 = sb.toString();
        o.l(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final void c0(Iterable iterable, AbstractCollection abstractCollection) {
        o.m(iterable, "<this>");
        for (Object add : iterable) {
            abstractCollection.add(add);
        }
    }

    public static final List d0(Iterable iterable) {
        ArrayList arrayList;
        o.m(iterable, "<this>");
        boolean z5 = iterable instanceof Collection;
        if (z5) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return n.f2906d;
            }
            if (size != 1) {
                return new ArrayList(collection);
            }
            return v.D(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        if (z5) {
            arrayList = new ArrayList((Collection) iterable);
        } else {
            arrayList = new ArrayList();
            c0(iterable, arrayList);
        }
        return v.J(arrayList);
    }

    public static final Set e0(ArrayList arrayList) {
        o.m(arrayList, "<this>");
        p pVar = p.f2908d;
        int size = arrayList.size();
        if (size == 0) {
            return pVar;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(o.I(arrayList.size()));
            c0(arrayList, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(arrayList.get(0));
        o.l(singleton, "singleton(element)");
        return singleton;
    }
}
