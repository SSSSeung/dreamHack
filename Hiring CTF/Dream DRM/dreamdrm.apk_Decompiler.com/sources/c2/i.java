package c2;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f1617a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1618b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1619c;

    public i(h hVar) {
        Context context = hVar.f1613a;
        ActivityManager activityManager = hVar.f1614b;
        int i3 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f1619c = i3;
        int round = Math.round(((float) (activityManager.getMemoryClass() * 1024 * 1024)) * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) hVar.f1615c.f2403e;
        float f6 = (float) (displayMetrics.widthPixels * displayMetrics.heightPixels * 4);
        float f7 = hVar.f1616d;
        int round2 = Math.round(f6 * f7);
        int round3 = Math.round(f6 * 2.0f);
        int i6 = round - i3;
        int i7 = round3 + round2;
        if (i7 <= i6) {
            this.f1618b = round3;
            this.f1617a = round2;
        } else {
            float f8 = ((float) i6) / (f7 + 2.0f);
            this.f1618b = Math.round(2.0f * f8);
            this.f1617a = Math.round(f8 * f7);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context, (long) this.f1618b));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context, (long) this.f1617a));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context, (long) i3));
            sb.append(", memory class limited? ");
            sb.append(i7 > round);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context, (long) round));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }
}
