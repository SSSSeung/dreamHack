package g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import androidx.appcompat.widget.m3;
import androidx.appcompat.widget.v1;
import d.a;
import h.r;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public final class l extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f2759e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class[] f2760f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f2761a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f2762b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f2763c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2764d;

    static {
        Class[] clsArr = {Context.class};
        f2759e = clsArr;
        f2760f = clsArr;
    }

    public l(Context context) {
        super(context);
        this.f2763c = context;
        Object[] objArr = {context};
        this.f2761a = objArr;
        this.f2762b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i3;
        r rVar;
        ColorStateList colorStateList;
        AttributeSet attributeSet2 = attributeSet;
        k kVar = new k(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i3 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlResourceParser xmlResourceParser2 = xmlResourceParser;
            }
        }
        boolean z5 = false;
        boolean z6 = false;
        String str = null;
        while (!z5) {
            if (eventType != 1) {
                Menu menu2 = kVar.f2734a;
                if (eventType != i3) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z6 && name2.equals(str)) {
                            XmlResourceParser xmlResourceParser3 = xmlResourceParser;
                            z6 = false;
                            str = null;
                            eventType = xmlResourceParser.next();
                            i3 = 2;
                        } else if (name2.equals("group")) {
                            kVar.f2735b = 0;
                            kVar.f2736c = 0;
                            kVar.f2737d = 0;
                            kVar.f2738e = 0;
                            kVar.f2739f = true;
                            kVar.f2740g = true;
                        } else if (name2.equals("item")) {
                            if (!kVar.f2741h) {
                                r rVar2 = kVar.f2758z;
                                if (rVar2 == null || !rVar2.f3221a.hasSubMenu()) {
                                    kVar.f2741h = true;
                                    kVar.b(menu2.add(kVar.f2735b, kVar.f2742i, kVar.f2743j, kVar.f2744k));
                                } else {
                                    kVar.f2741h = true;
                                    kVar.b(menu2.addSubMenu(kVar.f2735b, kVar.f2742i, kVar.f2743j, kVar.f2744k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z5 = true;
                        }
                    }
                } else if (!z6) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    l lVar = kVar.E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = lVar.f2763c.obtainStyledAttributes(attributeSet2, a.f2128p);
                        kVar.f2735b = obtainStyledAttributes.getResourceId(1, 0);
                        kVar.f2736c = obtainStyledAttributes.getInt(3, 0);
                        kVar.f2737d = obtainStyledAttributes.getInt(4, 0);
                        kVar.f2738e = obtainStyledAttributes.getInt(5, 0);
                        kVar.f2739f = obtainStyledAttributes.getBoolean(2, true);
                        kVar.f2740g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = lVar.f2763c;
                            m3 m3Var = new m3(context, context.obtainStyledAttributes(attributeSet2, a.f2129q));
                            kVar.f2742i = m3Var.i(2, 0);
                            kVar.f2743j = (m3Var.h(5, kVar.f2736c) & -65536) | (m3Var.h(6, kVar.f2737d) & 65535);
                            kVar.f2744k = m3Var.k(7);
                            kVar.f2745l = m3Var.k(8);
                            kVar.f2746m = m3Var.i(0, 0);
                            String j6 = m3Var.j(9);
                            kVar.f2747n = j6 == null ? 0 : j6.charAt(0);
                            kVar.f2748o = m3Var.h(16, 4096);
                            String j7 = m3Var.j(10);
                            kVar.f2749p = j7 == null ? 0 : j7.charAt(0);
                            kVar.f2750q = m3Var.h(20, 4096);
                            kVar.f2751r = m3Var.l(11) ? m3Var.a(11, false) : kVar.f2738e;
                            kVar.f2752s = m3Var.a(3, false);
                            kVar.f2753t = m3Var.a(4, kVar.f2739f);
                            kVar.f2754u = m3Var.a(1, kVar.f2740g);
                            kVar.f2755v = m3Var.h(21, -1);
                            kVar.f2757y = m3Var.j(12);
                            kVar.w = m3Var.i(13, 0);
                            kVar.f2756x = m3Var.j(15);
                            String j8 = m3Var.j(14);
                            boolean z7 = j8 != null;
                            if (z7 && kVar.w == 0 && kVar.f2756x == null) {
                                rVar = (r) kVar.a(j8, f2760f, lVar.f2762b);
                            } else {
                                if (z7) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                rVar = null;
                            }
                            kVar.f2758z = rVar;
                            kVar.A = m3Var.k(17);
                            kVar.B = m3Var.k(22);
                            if (m3Var.l(19)) {
                                kVar.D = v1.b(m3Var.h(19, -1), kVar.D);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                kVar.D = null;
                            }
                            if (m3Var.l(18)) {
                                kVar.C = m3Var.b(18);
                            } else {
                                kVar.C = colorStateList;
                            }
                            m3Var.o();
                            kVar.f2741h = false;
                            XmlResourceParser xmlResourceParser4 = xmlResourceParser;
                        } else if (name3.equals("menu")) {
                            kVar.f2741h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(kVar.f2735b, kVar.f2742i, kVar.f2743j, kVar.f2744k);
                            kVar.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet2, addSubMenu);
                        } else {
                            XmlResourceParser xmlResourceParser5 = xmlResourceParser;
                            str = name3;
                            z6 = true;
                        }
                        eventType = xmlResourceParser.next();
                        i3 = 2;
                    }
                }
                XmlResourceParser xmlResourceParser6 = xmlResourceParser;
                eventType = xmlResourceParser.next();
                i3 = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public final void inflate(int i3, Menu menu) {
        if (!(menu instanceof s0.a)) {
            super.inflate(i3, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f2763c.getResources().getLayout(i3);
            b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e6) {
            throw new InflateException("Error inflating menu XML", e6);
        } catch (IOException e7) {
            throw new InflateException("Error inflating menu XML", e7);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
