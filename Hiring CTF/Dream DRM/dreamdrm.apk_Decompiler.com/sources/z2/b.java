package z2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import k.j;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final j f5937a = new j();

    /* renamed from: b  reason: collision with root package name */
    public final j f5938b = new j();

    public static b a(Context context, int i3) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i3);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e6) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i3), e6);
            return null;
        }
    }

    public static b b(ArrayList arrayList) {
        b bVar = new b();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Animator animator = (Animator) arrayList.get(i3);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                bVar.f5938b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = a.f5934b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = a.f5935c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = a.f5936d;
                }
                c cVar = new c(startDelay, duration, interpolator);
                cVar.f5942d = objectAnimator.getRepeatCount();
                cVar.f5943e = objectAnimator.getRepeatMode();
                bVar.f5937a.put(propertyName, cVar);
                i3++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f5937a.equals(((b) obj).f5937a);
    }

    public final int hashCode() {
        return this.f5937a.hashCode();
    }

    public final String toString() {
        return "\n" + b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f5937a + "}\n";
    }
}
