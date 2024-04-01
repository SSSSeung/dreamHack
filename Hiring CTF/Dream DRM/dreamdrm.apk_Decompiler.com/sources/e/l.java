package e;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.e4;
import androidx.appcompat.widget.h4;
import androidx.appcompat.widget.w2;
import androidx.appcompat.widget.x;
import androidx.fragment.app.v;
import b1.o;
import com.theori.dreamdrm.R;
import g.n;
import java.util.ArrayList;
import k.d;
import n0.b;
import n0.h;
import o0.a;

public abstract class l extends v implements m {

    /* renamed from: x  reason: collision with root package name */
    public e0 f2395x;

    public l() {
        this.f302h.f4898b.c("androidx:appcompat", new j(0, this));
        j(new k(this));
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n();
        m().a(view, layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x01e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void attachBaseContext(android.content.Context r11) {
        /*
            r10 = this;
            e.q r0 = r10.m()
            e.e0 r0 = (e.e0) r0
            r1 = 1
            r0.S = r1
            int r2 = r0.W
            r3 = -100
            if (r2 == r3) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            int r2 = e.q.f2411e
        L_0x0012:
            int r0 = r0.D(r11, r2)
            boolean r2 = e.q.f(r11)
            if (r2 == 0) goto L_0x007f
            boolean r2 = e.q.f(r11)
            if (r2 != 0) goto L_0x0023
            goto L_0x007f
        L_0x0023:
            boolean r2 = t0.b.a()
            if (r2 == 0) goto L_0x0038
            boolean r2 = e.q.f2415i
            if (r2 != 0) goto L_0x007f
            e.l0 r2 = e.q.f2410d
            e.n r3 = new e.n
            r3.<init>(r11)
            r2.execute(r3)
            goto L_0x007f
        L_0x0038:
            java.lang.Object r2 = e.q.f2418l
            monitor-enter(r2)
            t0.g r3 = e.q.f2412f     // Catch:{ all -> 0x007c }
            if (r3 != 0) goto L_0x0061
            t0.g r3 = e.q.f2413g     // Catch:{ all -> 0x007c }
            if (r3 != 0) goto L_0x004d
            java.lang.String r3 = com.bumptech.glide.c.C(r11)     // Catch:{ all -> 0x007c }
            t0.g r3 = t0.g.a(r3)     // Catch:{ all -> 0x007c }
            e.q.f2413g = r3     // Catch:{ all -> 0x007c }
        L_0x004d:
            t0.g r3 = e.q.f2413g     // Catch:{ all -> 0x007c }
            t0.h r3 = r3.f5087a     // Catch:{ all -> 0x007c }
            t0.i r3 = (t0.i) r3     // Catch:{ all -> 0x007c }
            android.os.LocaleList r3 = r3.f5088a     // Catch:{ all -> 0x007c }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x007c }
            if (r3 == 0) goto L_0x005c
            goto L_0x007a
        L_0x005c:
            t0.g r3 = e.q.f2413g     // Catch:{ all -> 0x007c }
            e.q.f2412f = r3     // Catch:{ all -> 0x007c }
            goto L_0x007a
        L_0x0061:
            t0.g r4 = e.q.f2413g     // Catch:{ all -> 0x007c }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x007c }
            if (r3 != 0) goto L_0x007a
            t0.g r3 = e.q.f2412f     // Catch:{ all -> 0x007c }
            e.q.f2413g = r3     // Catch:{ all -> 0x007c }
            t0.h r3 = r3.f5087a     // Catch:{ all -> 0x007c }
            t0.i r3 = (t0.i) r3     // Catch:{ all -> 0x007c }
            android.os.LocaleList r3 = r3.f5088a     // Catch:{ all -> 0x007c }
            java.lang.String r3 = r3.toLanguageTags()     // Catch:{ all -> 0x007c }
            com.bumptech.glide.c.A(r11, r3)     // Catch:{ all -> 0x007c }
        L_0x007a:
            monitor-exit(r2)     // Catch:{ all -> 0x007c }
            goto L_0x007f
        L_0x007c:
            r11 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007c }
            throw r11
        L_0x007f:
            t0.g r2 = e.e0.q(r11)
            boolean r3 = e.e0.f2321o0
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x0099
            boolean r3 = r11 instanceof android.view.ContextThemeWrapper
            if (r3 == 0) goto L_0x0099
            android.content.res.Configuration r3 = e.e0.u(r11, r0, r2, r5, r4)
            r6 = r11
            android.view.ContextThemeWrapper r6 = (android.view.ContextThemeWrapper) r6     // Catch:{ IllegalStateException -> 0x0099 }
            r6.applyOverrideConfiguration(r3)     // Catch:{ IllegalStateException -> 0x0099 }
            goto L_0x0233
        L_0x0099:
            boolean r3 = r11 instanceof g.f
            if (r3 == 0) goto L_0x00a9
            android.content.res.Configuration r3 = e.e0.u(r11, r0, r2, r5, r4)
            r6 = r11
            g.f r6 = (g.f) r6     // Catch:{ IllegalStateException -> 0x00a9 }
            r6.a(r3)     // Catch:{ IllegalStateException -> 0x00a9 }
            goto L_0x0233
        L_0x00a9:
            boolean r3 = e.e0.f2320n0
            if (r3 != 0) goto L_0x00af
            goto L_0x0233
        L_0x00af:
            android.content.res.Configuration r3 = new android.content.res.Configuration
            r3.<init>()
            r6 = -1
            r3.uiMode = r6
            r6 = 0
            r3.fontScale = r6
            android.content.Context r3 = r11.createConfigurationContext(r3)
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            android.content.res.Resources r7 = r11.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r8 = r7.uiMode
            r3.uiMode = r8
            boolean r8 = r3.equals(r7)
            if (r8 != 0) goto L_0x01cd
            android.content.res.Configuration r8 = new android.content.res.Configuration
            r8.<init>()
            r8.fontScale = r6
            int r6 = r3.diff(r7)
            if (r6 != 0) goto L_0x00e7
            goto L_0x01ce
        L_0x00e7:
            float r6 = r3.fontScale
            float r9 = r7.fontScale
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x00f1
            r8.fontScale = r9
        L_0x00f1:
            int r6 = r3.mcc
            int r9 = r7.mcc
            if (r6 == r9) goto L_0x00f9
            r8.mcc = r9
        L_0x00f9:
            int r6 = r3.mnc
            int r9 = r7.mnc
            if (r6 == r9) goto L_0x0101
            r8.mnc = r9
        L_0x0101:
            e.v.a(r3, r7, r8)
            int r6 = r3.touchscreen
            int r9 = r7.touchscreen
            if (r6 == r9) goto L_0x010c
            r8.touchscreen = r9
        L_0x010c:
            int r6 = r3.keyboard
            int r9 = r7.keyboard
            if (r6 == r9) goto L_0x0114
            r8.keyboard = r9
        L_0x0114:
            int r6 = r3.keyboardHidden
            int r9 = r7.keyboardHidden
            if (r6 == r9) goto L_0x011c
            r8.keyboardHidden = r9
        L_0x011c:
            int r6 = r3.navigation
            int r9 = r7.navigation
            if (r6 == r9) goto L_0x0124
            r8.navigation = r9
        L_0x0124:
            int r6 = r3.navigationHidden
            int r9 = r7.navigationHidden
            if (r6 == r9) goto L_0x012c
            r8.navigationHidden = r9
        L_0x012c:
            int r6 = r3.orientation
            int r9 = r7.orientation
            if (r6 == r9) goto L_0x0134
            r8.orientation = r9
        L_0x0134:
            int r6 = r3.screenLayout
            r6 = r6 & 15
            int r9 = r7.screenLayout
            r9 = r9 & 15
            if (r6 == r9) goto L_0x0143
            int r6 = r8.screenLayout
            r6 = r6 | r9
            r8.screenLayout = r6
        L_0x0143:
            int r6 = r3.screenLayout
            r6 = r6 & 192(0xc0, float:2.69E-43)
            int r9 = r7.screenLayout
            r9 = r9 & 192(0xc0, float:2.69E-43)
            if (r6 == r9) goto L_0x0152
            int r6 = r8.screenLayout
            r6 = r6 | r9
            r8.screenLayout = r6
        L_0x0152:
            int r6 = r3.screenLayout
            r6 = r6 & 48
            int r9 = r7.screenLayout
            r9 = r9 & 48
            if (r6 == r9) goto L_0x0161
            int r6 = r8.screenLayout
            r6 = r6 | r9
            r8.screenLayout = r6
        L_0x0161:
            int r6 = r3.screenLayout
            r6 = r6 & 768(0x300, float:1.076E-42)
            int r9 = r7.screenLayout
            r9 = r9 & 768(0x300, float:1.076E-42)
            if (r6 == r9) goto L_0x0170
            int r6 = r8.screenLayout
            r6 = r6 | r9
            r8.screenLayout = r6
        L_0x0170:
            int r6 = r3.colorMode
            r6 = r6 & 3
            int r9 = r7.colorMode
            r9 = r9 & 3
            if (r6 == r9) goto L_0x017f
            int r6 = r8.colorMode
            r6 = r6 | r9
            r8.colorMode = r6
        L_0x017f:
            int r6 = r3.colorMode
            r6 = r6 & 12
            int r9 = r7.colorMode
            r9 = r9 & 12
            if (r6 == r9) goto L_0x018e
            int r6 = r8.colorMode
            r6 = r6 | r9
            r8.colorMode = r6
        L_0x018e:
            int r6 = r3.uiMode
            r6 = r6 & 15
            int r9 = r7.uiMode
            r9 = r9 & 15
            if (r6 == r9) goto L_0x019d
            int r6 = r8.uiMode
            r6 = r6 | r9
            r8.uiMode = r6
        L_0x019d:
            int r6 = r3.uiMode
            r6 = r6 & 48
            int r9 = r7.uiMode
            r9 = r9 & 48
            if (r6 == r9) goto L_0x01ac
            int r6 = r8.uiMode
            r6 = r6 | r9
            r8.uiMode = r6
        L_0x01ac:
            int r6 = r3.screenWidthDp
            int r9 = r7.screenWidthDp
            if (r6 == r9) goto L_0x01b4
            r8.screenWidthDp = r9
        L_0x01b4:
            int r6 = r3.screenHeightDp
            int r9 = r7.screenHeightDp
            if (r6 == r9) goto L_0x01bc
            r8.screenHeightDp = r9
        L_0x01bc:
            int r6 = r3.smallestScreenWidthDp
            int r9 = r7.smallestScreenWidthDp
            if (r6 == r9) goto L_0x01c4
            r8.smallestScreenWidthDp = r9
        L_0x01c4:
            int r3 = r3.densityDpi
            int r6 = r7.densityDpi
            if (r3 == r6) goto L_0x01ce
            r8.densityDpi = r6
            goto L_0x01ce
        L_0x01cd:
            r8 = r5
        L_0x01ce:
            android.content.res.Configuration r0 = e.e0.u(r11, r0, r2, r8, r1)
            g.f r2 = new g.f
            r3 = 2131755553(0x7f100221, float:1.9141989E38)
            r2.<init>((android.content.Context) r11, (int) r3)
            r2.a(r0)
            android.content.res.Resources$Theme r11 = r11.getTheme()     // Catch:{ NullPointerException -> 0x01e5 }
            if (r11 == 0) goto L_0x01e5
            r11 = r1
            goto L_0x01e6
        L_0x01e5:
            r11 = r4
        L_0x01e6:
            if (r11 == 0) goto L_0x0232
            android.content.res.Resources$Theme r11 = r2.getTheme()
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r0 < r3) goto L_0x01f6
            p0.o.a(r11)
            goto L_0x0232
        L_0x01f6:
            java.lang.Object r0 = p0.n.f4408a
            monitor-enter(r0)
            boolean r3 = p0.n.f4410c     // Catch:{ all -> 0x022f }
            if (r3 != 0) goto L_0x0217
            java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
            java.lang.String r6 = "rebase"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x020d }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x020d }
            p0.n.f4409b = r3     // Catch:{ NoSuchMethodException -> 0x020d }
            r3.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x020d }
            goto L_0x0215
        L_0x020d:
            r3 = move-exception
            java.lang.String r6 = "ResourcesCompat"
            java.lang.String r7 = "Failed to retrieve rebase() method"
            android.util.Log.i(r6, r7, r3)     // Catch:{ all -> 0x022f }
        L_0x0215:
            p0.n.f4410c = r1     // Catch:{ all -> 0x022f }
        L_0x0217:
            java.lang.reflect.Method r1 = p0.n.f4409b     // Catch:{ all -> 0x022f }
            if (r1 == 0) goto L_0x022d
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException -> 0x0223, InvocationTargetException -> 0x0221 }
            r1.invoke(r11, r3)     // Catch:{ IllegalAccessException -> 0x0223, InvocationTargetException -> 0x0221 }
            goto L_0x022d
        L_0x0221:
            r11 = move-exception
            goto L_0x0224
        L_0x0223:
            r11 = move-exception
        L_0x0224:
            java.lang.String r1 = "ResourcesCompat"
            java.lang.String r3 = "Failed to invoke rebase() method via reflection"
            android.util.Log.i(r1, r3, r11)     // Catch:{ all -> 0x022f }
            p0.n.f4409b = r5     // Catch:{ all -> 0x022f }
        L_0x022d:
            monitor-exit(r0)     // Catch:{ all -> 0x022f }
            goto L_0x0232
        L_0x022f:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x022f }
            throw r11
        L_0x0232:
            r11 = r2
        L_0x0233:
            super.attachBaseContext(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.l.attachBaseContext(android.content.Context):void");
    }

    public final void c() {
    }

    public final void closeOptionsMenu() {
        ((e0) m()).C();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((e0) m()).C();
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void f() {
    }

    public final View findViewById(int i3) {
        e0 e0Var = (e0) m();
        e0Var.x();
        return e0Var.f2334o.findViewById(i3);
    }

    public final void g() {
    }

    public final MenuInflater getMenuInflater() {
        e0 e0Var = (e0) m();
        if (e0Var.f2338s == null) {
            e0Var.C();
            s0 s0Var = e0Var.f2337r;
            e0Var.f2338s = new g.l(s0Var != null ? s0Var.p() : e0Var.f2333n);
        }
        return e0Var.f2338s;
    }

    public final Resources getResources() {
        int i3 = h4.f628a;
        return super.getResources();
    }

    public final void invalidateOptionsMenu() {
        m().e();
    }

    public final q m() {
        if (this.f2395x == null) {
            l0 l0Var = q.f2410d;
            this.f2395x = new e0(this, (Window) null, this, this);
        }
        return this.f2395x;
    }

    public final void n() {
        View decorView = getWindow().getDecorView();
        o.m(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        o.m(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        o.m(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        o.m(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e0 e0Var = (e0) m();
        if (e0Var.J && e0Var.D) {
            e0Var.C();
            s0 s0Var = e0Var.f2337r;
            if (s0Var != null) {
                s0Var.s(s0Var.f2430g.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        x a6 = x.a();
        Context context = e0Var.f2333n;
        synchronized (a6) {
            w2 w2Var = a6.f844a;
            synchronized (w2Var) {
                d dVar = (d) w2Var.f838b.get(context);
                if (dVar != null) {
                    dVar.a();
                }
            }
        }
        e0Var.V = new Configuration(e0Var.f2333n.getResources().getConfiguration());
        e0Var.o(false, false);
    }

    public final void onContentChanged() {
    }

    public final void onDestroy() {
        super.onDestroy();
        m().h();
    }

    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        return super.onKeyDown(i3, keyEvent);
    }

    public final boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        Intent intent;
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        e0 e0Var = (e0) m();
        e0Var.C();
        s0 s0Var = e0Var.f2337r;
        if (menuItem.getItemId() != 16908332 || s0Var == null || (((e4) s0Var.f2434k).f563b & 4) == 0) {
            return false;
        }
        Intent l6 = com.bumptech.glide.d.l(this);
        if (l6 == null) {
            return false;
        }
        if (h.c(this, l6)) {
            ArrayList arrayList = new ArrayList();
            Intent l7 = com.bumptech.glide.d.l(this);
            if (l7 == null) {
                l7 = com.bumptech.glide.d.l(this);
            }
            if (l7 != null) {
                ComponentName component = l7.getComponent();
                if (component == null) {
                    component = l7.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                while (true) {
                    try {
                        String m6 = com.bumptech.glide.d.m(this, component);
                        if (m6 == null) {
                            intent = null;
                        } else {
                            ComponentName componentName = new ComponentName(component.getPackageName(), m6);
                            intent = com.bumptech.glide.d.m(this, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
                        }
                        if (intent == null) {
                            break;
                        }
                        arrayList.add(size, intent);
                        component = intent.getComponent();
                    } catch (PackageManager.NameNotFoundException e6) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e6);
                    }
                }
                arrayList.add(l7);
            }
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                Object obj = b.f4213a;
                a.a(this, intentArr, (Bundle) null);
                try {
                    n0.a.a(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            h.b(this, l6);
            return true;
        }
    }

    public final boolean onMenuOpened(int i3, Menu menu) {
        return super.onMenuOpened(i3, menu);
    }

    public final void onPanelClosed(int i3, Menu menu) {
        super.onPanelClosed(i3, menu);
    }

    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((e0) m()).x();
    }

    public final void onPostResume() {
        super.onPostResume();
        e0 e0Var = (e0) m();
        e0Var.C();
        s0 s0Var = e0Var.f2337r;
        if (s0Var != null) {
            s0Var.f2448z = true;
        }
    }

    public final void onStart() {
        super.onStart();
        ((e0) m()).o(true, false);
    }

    public final void onStop() {
        super.onStop();
        e0 e0Var = (e0) m();
        e0Var.C();
        s0 s0Var = e0Var.f2337r;
        if (s0Var != null) {
            s0Var.f2448z = false;
            n nVar = s0Var.f2447y;
            if (nVar != null) {
                nVar.a();
            }
        }
    }

    public final void onTitleChanged(CharSequence charSequence, int i3) {
        super.onTitleChanged(charSequence, i3);
        m().n(charSequence);
    }

    public final void openOptionsMenu() {
        ((e0) m()).C();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void setContentView(int i3) {
        n();
        m().k(i3);
    }

    public final void setTheme(int i3) {
        super.setTheme(i3);
        ((e0) m()).X = i3;
    }

    public void setContentView(View view) {
        n();
        m().l(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n();
        m().m(view, layoutParams);
    }
}
