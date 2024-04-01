package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

public final class f extends ContextWrapper {

    /* renamed from: f  reason: collision with root package name */
    public static Configuration f2712f;

    /* renamed from: a  reason: collision with root package name */
    public int f2713a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f2714b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f2715c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f2716d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f2717e;

    public f(Context context, int i3) {
        super(context);
        this.f2713a = i3;
    }

    public final void a(Configuration configuration) {
        if (this.f2717e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f2716d == null) {
            this.f2716d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f2714b == null) {
            this.f2714b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2714b.setTo(theme);
            }
        }
        this.f2714b.applyStyle(this.f2713a, true);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Resources getResources() {
        Resources resources;
        if (this.f2717e == null) {
            Configuration configuration = this.f2716d;
            if (configuration != null) {
                if (f2712f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f2712f = configuration2;
                }
                if (!configuration.equals(f2712f)) {
                    resources = e.a(this, this.f2716d).getResources();
                    this.f2717e = resources;
                }
            }
            resources = super.getResources();
            this.f2717e = resources;
        }
        return this.f2717e;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2715c == null) {
            this.f2715c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2715c;
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f2714b;
        if (theme != null) {
            return theme;
        }
        if (this.f2713a == 0) {
            this.f2713a = 2131755554;
        }
        b();
        return this.f2714b;
    }

    public final void setTheme(int i3) {
        if (this.f2713a != i3) {
            this.f2713a = i3;
            b();
        }
    }

    public f(Context context, Resources.Theme theme) {
        super(context);
        this.f2714b = theme;
    }
}
