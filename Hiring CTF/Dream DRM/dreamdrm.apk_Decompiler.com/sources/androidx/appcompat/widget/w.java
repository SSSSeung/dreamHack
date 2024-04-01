package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import b1.o;
import b1.v;
import com.theori.dreamdrm.R;
import f4.c;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import n0.b;
import q0.a;
import x0.a1;
import z4.r;
import z4.t;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f818a;

    /* renamed from: b  reason: collision with root package name */
    public Object f819b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f820c;

    /* renamed from: d  reason: collision with root package name */
    public final Serializable f821d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f822e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f823f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f824g;

    /* JADX WARNING: type inference failed for: r1v2, types: [int[], java.io.Serializable] */
    public w() {
        this.f818a = 0;
        this.f819b = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f820c = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f821d = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.f822e = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f823f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f824g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static boolean a(int[] iArr, int i3) {
        for (int i6 : iArr) {
            if (i6 == i3) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i3) {
        int c6 = t3.c(context, R.attr.colorControlHighlight);
        int b6 = t3.b(context, R.attr.colorButtonNormal);
        return new ColorStateList(new int[][]{t3.f793b, t3.f795d, t3.f794c, t3.f797f}, new int[]{b6, a.b(c6, i3), a.b(c6, i3), i3});
    }

    public static void d(Drawable drawable, int i3, PorterDuff.Mode mode) {
        int[] iArr = v1.f812a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = x.f842b;
        }
        mutate.setColorFilter(x.c(i3, mode));
    }

    public final ColorStateList c(Context context, int i3) {
        if (i3 == R.drawable.abc_edit_text_material) {
            return b.a(context, R.color.abc_tint_edittext);
        }
        if (i3 == R.drawable.abc_switch_track_mtrl_alpha) {
            return b.a(context, R.color.abc_tint_switch_track);
        }
        if (i3 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList d6 = t3.d(context, R.attr.colorSwitchThumbNormal);
            if (d6 == null || !d6.isStateful()) {
                iArr[0] = t3.f793b;
                iArr2[0] = t3.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = t3.f796e;
                iArr2[1] = t3.c(context, R.attr.colorControlActivated);
                iArr[2] = t3.f797f;
                iArr2[2] = t3.c(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = t3.f793b;
                iArr[0] = iArr3;
                iArr2[0] = d6.getColorForState(iArr3, 0);
                iArr[1] = t3.f796e;
                iArr2[1] = t3.c(context, R.attr.colorControlActivated);
                iArr[2] = t3.f797f;
                iArr2[2] = d6.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i3 == R.drawable.abc_btn_default_mtrl_shape) {
            return b(context, t3.c(context, R.attr.colorButtonNormal));
        } else {
            if (i3 == R.drawable.abc_btn_borderless_material) {
                return b(context, 0);
            }
            if (i3 == R.drawable.abc_btn_colored_material) {
                return b(context, t3.c(context, R.attr.colorAccent));
            }
            if (i3 == R.drawable.abc_spinner_mtrl_am_alpha || i3 == R.drawable.abc_spinner_textfield_background_material) {
                return b.a(context, R.color.abc_tint_spinner);
            }
            if (a((int[]) this.f820c, i3)) {
                return t3.d(context, R.attr.colorControlNormal);
            }
            if (a((int[]) this.f823f, i3)) {
                return b.a(context, R.color.abc_tint_default);
            }
            if (a((int[]) this.f824g, i3)) {
                return b.a(context, R.color.abc_tint_btn_checkable);
            }
            if (i3 == R.drawable.abc_seekbar_thumb_material) {
                return b.a(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
    }

    public final String toString() {
        switch (this.f818a) {
            case 1:
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.f821d);
                sb.append(", url=");
                sb.append((t) this.f820c);
                r rVar = (r) this.f822e;
                if (rVar.f6060d.length / 2 != 0) {
                    sb.append(", headers=[");
                    Iterator it = rVar.iterator();
                    int i3 = 0;
                    while (true) {
                        a1 a1Var = (a1) it;
                        if (a1Var.hasNext()) {
                            Object next = a1Var.next();
                            int i6 = i3 + 1;
                            if (i3 >= 0) {
                                c cVar = (c) next;
                                String str = (String) cVar.f2676d;
                                String str2 = (String) cVar.f2677e;
                                if (i3 > 0) {
                                    sb.append(", ");
                                }
                                sb.append(str);
                                sb.append(':');
                                sb.append(str2);
                                i3 = i6;
                            } else {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                        } else {
                            sb.append(']');
                        }
                    }
                }
                Map map = (Map) this.f824g;
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                String sb2 = sb.toString();
                o.l(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public w(t tVar, String str, r rVar, v vVar, Map map) {
        this.f818a = 1;
        o.m(str, "method");
        this.f820c = tVar;
        this.f821d = str;
        this.f822e = rVar;
        this.f823f = vVar;
        this.f824g = map;
    }
}
