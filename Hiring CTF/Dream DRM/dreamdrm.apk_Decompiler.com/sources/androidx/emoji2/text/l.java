package androidx.emoji2.text;

import a.d;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k.c;
import w4.p;

public final class l {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f1011i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static volatile l f1012j;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f1013a;

    /* renamed from: b  reason: collision with root package name */
    public final c f1014b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1015c = 3;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f1016d;

    /* renamed from: e  reason: collision with root package name */
    public final g f1017e;

    /* renamed from: f  reason: collision with root package name */
    public final k f1018f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1019g;

    /* renamed from: h  reason: collision with root package name */
    public final e f1020h;

    public l(m mVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1013a = reentrantReadWriteLock;
        this.f1018f = mVar.f1008a;
        int i3 = mVar.f1009b;
        this.f1019g = i3;
        this.f1020h = mVar.f1010c;
        this.f1016d = new Handler(Looper.getMainLooper());
        this.f1014b = new c();
        g gVar = new g(this);
        this.f1017e = gVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i3 == 0) {
            try {
                this.f1015c = 0;
            } catch (Throwable th) {
                this.f1013a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                this.f1018f.a(new f(gVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static l a() {
        l lVar;
        synchronized (f1011i) {
            lVar = f1012j;
            if (!(lVar != null)) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return lVar;
    }

    public final int b() {
        this.f1013a.readLock().lock();
        try {
            return this.f1015c;
        } finally {
            this.f1013a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z5 = true;
        if (this.f1019g == 1) {
            if (b() != 1) {
                z5 = false;
            }
            if (!z5) {
                this.f1013a.writeLock().lock();
                try {
                    if (this.f1015c != 0) {
                        this.f1015c = 0;
                        this.f1013a.writeLock().unlock();
                        g gVar = this.f1017e;
                        Object obj = gVar.f2403e;
                        try {
                            ((l) obj).f1018f.a(new f(gVar));
                        } catch (Throwable th) {
                            ((l) obj).d(th);
                        }
                    }
                } finally {
                    this.f1013a.writeLock().unlock();
                }
            }
        } else {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
    }

    /* JADX INFO: finally extract failed */
    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1013a.writeLock().lock();
        try {
            this.f1015c = 2;
            arrayList.addAll(this.f1014b);
            this.f1014b.clear();
            this.f1013a.writeLock().unlock();
            this.f1016d.post(new d(arrayList, this.f1015c, th));
        } catch (Throwable th2) {
            this.f1013a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f1013a.writeLock().lock();
        try {
            this.f1015c = 1;
            arrayList.addAll(this.f1014b);
            this.f1014b.clear();
            this.f1013a.writeLock().unlock();
            this.f1016d.post(new d(this.f1015c, arrayList));
        } catch (Throwable th) {
            this.f1013a.writeLock().unlock();
            throw th;
        }
    }

    public final CharSequence f(int i3, int i6, CharSequence charSequence) {
        boolean z5 = true;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        } else if (i3 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        } else if (i6 >= 0) {
            p.b("start should be <= than end", i3 <= i6);
            if (charSequence == null) {
                return null;
            }
            p.b("start should be < than charSequence length", i3 <= charSequence.length());
            if (i6 > charSequence.length()) {
                z5 = false;
            }
            p.b("end should be < than charSequence length", z5);
            return (charSequence.length() == 0 || i3 == i6) ? charSequence : this.f1017e.H(charSequence, i3, i6, false);
        } else {
            throw new IllegalArgumentException("end cannot be negative");
        }
    }

    public final void g(j jVar) {
        if (jVar != null) {
            this.f1013a.writeLock().lock();
            try {
                if (this.f1015c != 1) {
                    if (this.f1015c != 2) {
                        this.f1014b.add(jVar);
                    }
                }
                this.f1016d.post(new d(jVar, this.f1015c));
            } finally {
                this.f1013a.writeLock().unlock();
            }
        } else {
            throw new NullPointerException("initCallback cannot be null");
        }
    }
}
