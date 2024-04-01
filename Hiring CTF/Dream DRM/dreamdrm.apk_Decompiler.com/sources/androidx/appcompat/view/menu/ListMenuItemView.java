package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.m3;
import com.theori.dreamdrm.R;
import d.a;
import h.d0;
import h.q;
import java.util.WeakHashMap;
import x0.u0;

public class ListMenuItemView extends LinearLayout implements d0, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: d  reason: collision with root package name */
    public q f365d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f366e;

    /* renamed from: f  reason: collision with root package name */
    public RadioButton f367f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f368g;

    /* renamed from: h  reason: collision with root package name */
    public CheckBox f369h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f370i;

    /* renamed from: j  reason: collision with root package name */
    public ImageView f371j;

    /* renamed from: k  reason: collision with root package name */
    public ImageView f372k;

    /* renamed from: l  reason: collision with root package name */
    public LinearLayout f373l;

    /* renamed from: m  reason: collision with root package name */
    public final Drawable f374m;

    /* renamed from: n  reason: collision with root package name */
    public final int f375n;

    /* renamed from: o  reason: collision with root package name */
    public final Context f376o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f377p;

    /* renamed from: q  reason: collision with root package name */
    public final Drawable f378q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f379r;

    /* renamed from: s  reason: collision with root package name */
    public LayoutInflater f380s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f381t;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3 m6 = m3.m(getContext(), attributeSet, a.f2130r, R.attr.listMenuViewStyle);
        this.f374m = m6.e(5);
        this.f375n = m6.i(1, -1);
        this.f377p = m6.a(7, false);
        this.f376o = context;
        this.f378q = m6.e(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f379r = obtainStyledAttributes.hasValue(0);
        m6.o();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f380s == null) {
            this.f380s = LayoutInflater.from(getContext());
        }
        return this.f380s;
    }

    private void setSubMenuArrowVisible(boolean z5) {
        ImageView imageView = this.f371j;
        if (imageView != null) {
            imageView.setVisibility(z5 ? 0 : 8);
        }
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f372k;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f372k.getLayoutParams();
            rect.top = this.f372k.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (r0 == false) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(h.q r11) {
        /*
            r10 = this;
            r10.f365d = r11
            boolean r0 = r11.isVisible()
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L_0x000d
            r0 = r1
            goto L_0x000e
        L_0x000d:
            r0 = r2
        L_0x000e:
            r10.setVisibility(r0)
            java.lang.CharSequence r0 = r11.f3200e
            r10.setTitle(r0)
            boolean r0 = r11.isCheckable()
            r10.setCheckable(r0)
            h.o r0 = r11.f3209n
            boolean r3 = r0.o()
            r4 = 1
            if (r3 == 0) goto L_0x0035
            boolean r3 = r0.n()
            if (r3 == 0) goto L_0x002f
            char r3 = r11.f3205j
            goto L_0x0031
        L_0x002f:
            char r3 = r11.f3203h
        L_0x0031:
            if (r3 == 0) goto L_0x0035
            r3 = r4
            goto L_0x0036
        L_0x0035:
            r3 = r1
        L_0x0036:
            r0.n()
            if (r3 == 0) goto L_0x0058
            h.q r0 = r10.f365d
            h.o r3 = r0.f3209n
            boolean r5 = r3.o()
            if (r5 == 0) goto L_0x0054
            boolean r3 = r3.n()
            if (r3 == 0) goto L_0x004e
            char r0 = r0.f3205j
            goto L_0x0050
        L_0x004e:
            char r0 = r0.f3203h
        L_0x0050:
            if (r0 == 0) goto L_0x0054
            r0 = r4
            goto L_0x0055
        L_0x0054:
            r0 = r1
        L_0x0055:
            if (r0 == 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r1 = r2
        L_0x0059:
            if (r1 != 0) goto L_0x0109
            android.widget.TextView r0 = r10.f370i
            h.q r3 = r10.f365d
            h.o r5 = r3.f3209n
            boolean r5 = r5.n()
            if (r5 == 0) goto L_0x006a
            char r5 = r3.f3205j
            goto L_0x006c
        L_0x006a:
            char r5 = r3.f3203h
        L_0x006c:
            if (r5 != 0) goto L_0x0072
            java.lang.String r2 = ""
            goto L_0x0106
        L_0x0072:
            h.o r6 = r3.f3209n
            android.content.Context r7 = r6.f3170a
            android.content.res.Resources r7 = r7.getResources()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.Context r9 = r6.f3170a
            android.view.ViewConfiguration r9 = android.view.ViewConfiguration.get(r9)
            boolean r9 = r9.hasPermanentMenuKey()
            if (r9 == 0) goto L_0x0095
            r9 = 2131689489(0x7f0f0011, float:1.9007995E38)
            java.lang.String r9 = r7.getString(r9)
            r8.append(r9)
        L_0x0095:
            boolean r6 = r6.n()
            if (r6 == 0) goto L_0x009e
            int r3 = r3.f3206k
            goto L_0x00a0
        L_0x009e:
            int r3 = r3.f3204i
        L_0x00a0:
            r6 = 2131689485(0x7f0f000d, float:1.9007987E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 65536(0x10000, float:9.18355E-41)
            h.q.c(r8, r3, r9, r6)
            r6 = 2131689481(0x7f0f0009, float:1.9007979E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 4096(0x1000, float:5.74E-42)
            h.q.c(r8, r3, r9, r6)
            r6 = 2131689480(0x7f0f0008, float:1.9007977E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 2
            h.q.c(r8, r3, r9, r6)
            r6 = 2131689486(0x7f0f000e, float:1.9007989E38)
            java.lang.String r6 = r7.getString(r6)
            h.q.c(r8, r3, r4, r6)
            r4 = 2131689488(0x7f0f0010, float:1.9007993E38)
            java.lang.String r4 = r7.getString(r4)
            r6 = 4
            h.q.c(r8, r3, r6, r4)
            r4 = 2131689484(0x7f0f000c, float:1.9007985E38)
            java.lang.String r4 = r7.getString(r4)
            h.q.c(r8, r3, r2, r4)
            if (r5 == r2) goto L_0x00f8
            r2 = 10
            if (r5 == r2) goto L_0x00f4
            r2 = 32
            if (r5 == r2) goto L_0x00f0
            r8.append(r5)
            goto L_0x0102
        L_0x00f0:
            r2 = 2131689487(0x7f0f000f, float:1.900799E38)
            goto L_0x00fb
        L_0x00f4:
            r2 = 2131689483(0x7f0f000b, float:1.9007983E38)
            goto L_0x00fb
        L_0x00f8:
            r2 = 2131689482(0x7f0f000a, float:1.900798E38)
        L_0x00fb:
            java.lang.String r2 = r7.getString(r2)
            r8.append(r2)
        L_0x0102:
            java.lang.String r2 = r8.toString()
        L_0x0106:
            r0.setText(r2)
        L_0x0109:
            android.widget.TextView r0 = r10.f370i
            int r0 = r0.getVisibility()
            if (r0 == r1) goto L_0x0116
            android.widget.TextView r0 = r10.f370i
            r0.setVisibility(r1)
        L_0x0116:
            android.graphics.drawable.Drawable r0 = r11.getIcon()
            r10.setIcon(r0)
            boolean r0 = r11.isEnabled()
            r10.setEnabled(r0)
            boolean r0 = r11.hasSubMenu()
            r10.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r11 = r11.f3212q
            r10.setContentDescription(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.d(h.q):void");
    }

    public q getItemData() {
        return this.f365d;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = u0.f5622a;
        x0.d0.q(this, this.f374m);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f368g = textView;
        int i3 = this.f375n;
        if (i3 != -1) {
            textView.setTextAppearance(this.f376o, i3);
        }
        this.f370i = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f371j = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f378q);
        }
        this.f372k = (ImageView) findViewById(R.id.group_divider);
        this.f373l = (LinearLayout) findViewById(R.id.content);
    }

    public final void onMeasure(int i3, int i6) {
        if (this.f366e != null && this.f377p) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f366e.getLayoutParams();
            int i7 = layoutParams.height;
            if (i7 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i7;
            }
        }
        super.onMeasure(i3, i6);
    }

    public void setCheckable(boolean z5) {
        View view;
        CompoundButton compoundButton;
        if (z5 || this.f367f != null || this.f369h != null) {
            if ((this.f365d.f3218x & 4) != 0) {
                if (this.f367f == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
                    this.f367f = radioButton;
                    LinearLayout linearLayout = this.f373l;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f367f;
                view = this.f369h;
            } else {
                if (this.f369h == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                    this.f369h = checkBox;
                    LinearLayout linearLayout2 = this.f373l;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f369h;
                view = this.f367f;
            }
            if (z5) {
                compoundButton.setChecked(this.f365d.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.f369h;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.f367f;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z5) {
        CompoundButton compoundButton;
        if ((this.f365d.f3218x & 4) != 0) {
            if (this.f367f == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
                this.f367f = radioButton;
                LinearLayout linearLayout = this.f373l;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f367f;
        } else {
            if (this.f369h == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                this.f369h = checkBox;
                LinearLayout linearLayout2 = this.f373l;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f369h;
        }
        compoundButton.setChecked(z5);
    }

    public void setForceShowIcon(boolean z5) {
        this.f381t = z5;
        this.f377p = z5;
    }

    public void setGroupDividerEnabled(boolean z5) {
        ImageView imageView = this.f372k;
        if (imageView != null) {
            imageView.setVisibility((this.f379r || !z5) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f365d.f3209n.getClass();
        boolean z5 = this.f381t;
        if (z5 || this.f377p) {
            ImageView imageView = this.f366e;
            if (imageView != null || drawable != null || this.f377p) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
                    this.f366e = imageView2;
                    LinearLayout linearLayout = this.f373l;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.f377p) {
                    ImageView imageView3 = this.f366e;
                    if (!z5) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f366e.getVisibility() != 0) {
                        this.f366e.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f366e.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i3;
        if (charSequence != null) {
            this.f368g.setText(charSequence);
            if (this.f368g.getVisibility() != 0) {
                textView = this.f368g;
                i3 = 0;
            } else {
                return;
            }
        } else {
            i3 = 8;
            if (this.f368g.getVisibility() != 8) {
                textView = this.f368g;
            } else {
                return;
            }
        }
        textView.setVisibility(i3);
    }
}
