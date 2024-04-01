package j0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import y.d;

public final class n {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f3772d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    public static final SparseIntArray f3773e;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f3774a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3775b = true;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f3776c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3773e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(101, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(103, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    public static int[] c(Barrier barrier, String str) {
        int i3;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i6 = 0;
        int i7 = 0;
        while (i6 < split.length) {
            String trim = split[i6].trim();
            Object obj = null;
            try {
                i3 = q.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i3 = 0;
            }
            if (i3 == 0) {
                i3 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i3 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f934p) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.f934p.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i3 = ((Integer) obj).intValue();
                }
            }
            iArr[i7] = i3;
            i6++;
            i7++;
        }
        return i7 != split.length ? Arrays.copyOf(iArr, i7) : iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e3, code lost:
        r6.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0378, code lost:
        r4.append(java.lang.Integer.toHexString(r3));
        r4.append("   ");
        r4.append(r9.get(r3));
        android.util.Log.w("ConstraintSet", r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0392, code lost:
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static j0.i d(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            j0.i r0 = new j0.i
            r0.<init>()
            int[] r1 = j0.r.f3777a
            android.content.res.TypedArray r13 = r13.obtainStyledAttributes(r14, r1)
            int r14 = r13.getIndexCount()
            r1 = 0
            r2 = r1
        L_0x0011:
            if (r2 >= r14) goto L_0x0396
            int r3 = r13.getIndex(r2)
            r4 = 1
            j0.l r5 = r0.f3711b
            j0.k r6 = r0.f3712c
            j0.m r7 = r0.f3714e
            j0.j r8 = r0.f3713d
            if (r3 == r4) goto L_0x0036
            r9 = 23
            if (r9 == r3) goto L_0x0036
            r9 = 24
            if (r9 == r3) goto L_0x0036
            r6.getClass()
            r8.getClass()
            r5.getClass()
            r7.getClass()
        L_0x0036:
            android.util.SparseIntArray r9 = f3773e
            int r10 = r9.get(r3)
            r11 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r12 = "ConstraintSet"
            switch(r10) {
                case 1: goto L_0x036f;
                case 2: goto L_0x0366;
                case 3: goto L_0x035d;
                case 4: goto L_0x0354;
                case 5: goto L_0x034d;
                case 6: goto L_0x0344;
                case 7: goto L_0x033b;
                case 8: goto L_0x0332;
                case 9: goto L_0x0329;
                case 10: goto L_0x0320;
                case 11: goto L_0x0316;
                case 12: goto L_0x030c;
                case 13: goto L_0x0302;
                case 14: goto L_0x02f8;
                case 15: goto L_0x02ee;
                case 16: goto L_0x02e4;
                case 17: goto L_0x02da;
                case 18: goto L_0x02d0;
                case 19: goto L_0x02c6;
                case 20: goto L_0x02bc;
                case 21: goto L_0x02b2;
                case 22: goto L_0x02a4;
                case 23: goto L_0x029a;
                case 24: goto L_0x0290;
                case 25: goto L_0x0286;
                case 26: goto L_0x027c;
                case 27: goto L_0x0272;
                case 28: goto L_0x0268;
                case 29: goto L_0x025e;
                case 30: goto L_0x0254;
                case 31: goto L_0x024a;
                case 32: goto L_0x0240;
                case 33: goto L_0x0236;
                case 34: goto L_0x022c;
                case 35: goto L_0x0222;
                case 36: goto L_0x0218;
                case 37: goto L_0x020e;
                case 38: goto L_0x0204;
                case 39: goto L_0x01fa;
                case 40: goto L_0x01f0;
                case 41: goto L_0x01e6;
                case 42: goto L_0x01dc;
                case 43: goto L_0x01d2;
                case 44: goto L_0x01c6;
                case 45: goto L_0x01bc;
                case 46: goto L_0x01b2;
                case 47: goto L_0x01a8;
                case 48: goto L_0x019e;
                case 49: goto L_0x0194;
                case 50: goto L_0x018a;
                case 51: goto L_0x0180;
                case 52: goto L_0x0176;
                case 53: goto L_0x016c;
                case 54: goto L_0x0162;
                case 55: goto L_0x0158;
                case 56: goto L_0x014e;
                case 57: goto L_0x0144;
                case 58: goto L_0x013a;
                case 59: goto L_0x0130;
                case 60: goto L_0x0126;
                case 61: goto L_0x011c;
                case 62: goto L_0x0112;
                case 63: goto L_0x0108;
                case 64: goto L_0x00fe;
                case 65: goto L_0x00e8;
                case 66: goto L_0x00e0;
                case 67: goto L_0x00d6;
                case 68: goto L_0x00cc;
                case 69: goto L_0x00c4;
                case 70: goto L_0x00bc;
                case 71: goto L_0x00b5;
                case 72: goto L_0x00ab;
                case 73: goto L_0x00a1;
                case 74: goto L_0x0099;
                case 75: goto L_0x008f;
                case 76: goto L_0x0085;
                case 77: goto L_0x007d;
                case 78: goto L_0x0073;
                case 79: goto L_0x0069;
                case 80: goto L_0x005f;
                case 81: goto L_0x0055;
                case 82: goto L_0x004c;
                default: goto L_0x0043;
            }
        L_0x0043:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unknown attribute 0x"
            r4.<init>(r5)
            goto L_0x0378
        L_0x004c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "unused attribute 0x"
            r4.<init>(r5)
            goto L_0x0378
        L_0x0055:
            boolean r4 = r8.f3731h0
            boolean r3 = r13.getBoolean(r3, r4)
            r8.f3731h0 = r3
            goto L_0x0392
        L_0x005f:
            boolean r4 = r8.f3729g0
            boolean r3 = r13.getBoolean(r3, r4)
            r8.f3729g0 = r3
            goto L_0x0392
        L_0x0069:
            float r4 = r6.f3753c
            float r3 = r13.getFloat(r3, r4)
            r6.f3753c = r3
            goto L_0x0392
        L_0x0073:
            int r4 = r5.f3756b
            int r3 = r13.getInt(r3, r4)
            r5.f3756b = r3
            goto L_0x0392
        L_0x007d:
            java.lang.String r3 = r13.getString(r3)
            r8.f0 = r3
            goto L_0x0392
        L_0x0085:
            int r4 = r6.f3752b
            int r3 = r13.getInt(r3, r4)
            r6.f3752b = r3
            goto L_0x0392
        L_0x008f:
            boolean r4 = r8.f3733i0
            boolean r3 = r13.getBoolean(r3, r4)
            r8.f3733i0 = r3
            goto L_0x0392
        L_0x0099:
            java.lang.String r3 = r13.getString(r3)
            r8.f3726e0 = r3
            goto L_0x0392
        L_0x00a1:
            int r4 = r8.f3720b0
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.f3720b0 = r3
            goto L_0x0392
        L_0x00ab:
            int r4 = r8.f3718a0
            int r3 = r13.getInt(r3, r4)
            r8.f3718a0 = r3
            goto L_0x0392
        L_0x00b5:
            java.lang.String r3 = "CURRENTLY UNSUPPORTED"
            android.util.Log.e(r12, r3)
            goto L_0x0392
        L_0x00bc:
            float r3 = r13.getFloat(r3, r11)
            r8.Z = r3
            goto L_0x0392
        L_0x00c4:
            float r3 = r13.getFloat(r3, r11)
            r8.Y = r3
            goto L_0x0392
        L_0x00cc:
            float r4 = r5.f3758d
            float r3 = r13.getFloat(r3, r4)
            r5.f3758d = r3
            goto L_0x0392
        L_0x00d6:
            float r4 = r6.f3754d
            float r3 = r13.getFloat(r3, r4)
            r6.f3754d = r3
            goto L_0x0392
        L_0x00e0:
            r13.getInt(r3, r1)
        L_0x00e3:
            r6.getClass()
            goto L_0x0392
        L_0x00e8:
            android.util.TypedValue r4 = r13.peekValue(r3)
            int r4 = r4.type
            r5 = 3
            if (r4 != r5) goto L_0x00f5
            r13.getString(r3)
            goto L_0x00e3
        L_0x00f5:
            java.lang.String[] r4 = b1.v.f1537d
            int r3 = r13.getInteger(r3, r1)
            r3 = r4[r3]
            goto L_0x00e3
        L_0x00fe:
            int r4 = r6.f3751a
            int r3 = f(r13, r3, r4)
            r6.f3751a = r3
            goto L_0x0392
        L_0x0108:
            float r4 = r8.f3748y
            float r3 = r13.getFloat(r3, r4)
            r8.f3748y = r3
            goto L_0x0392
        L_0x0112:
            int r4 = r8.f3747x
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.f3747x = r3
            goto L_0x0392
        L_0x011c:
            int r4 = r8.w
            int r3 = f(r13, r3, r4)
            r8.w = r3
            goto L_0x0392
        L_0x0126:
            float r4 = r7.f3760a
            float r3 = r13.getFloat(r3, r4)
            r7.f3760a = r3
            goto L_0x0392
        L_0x0130:
            int r4 = r8.X
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.X = r3
            goto L_0x0392
        L_0x013a:
            int r4 = r8.W
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.W = r3
            goto L_0x0392
        L_0x0144:
            int r4 = r8.V
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.V = r3
            goto L_0x0392
        L_0x014e:
            int r4 = r8.U
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.U = r3
            goto L_0x0392
        L_0x0158:
            int r4 = r8.T
            int r3 = r13.getInt(r3, r4)
            r8.T = r3
            goto L_0x0392
        L_0x0162:
            int r4 = r8.S
            int r3 = r13.getInt(r3, r4)
            r8.S = r3
            goto L_0x0392
        L_0x016c:
            float r4 = r7.f3769j
            float r3 = r13.getDimension(r3, r4)
            r7.f3769j = r3
            goto L_0x0392
        L_0x0176:
            float r4 = r7.f3768i
            float r3 = r13.getDimension(r3, r4)
            r7.f3768i = r3
            goto L_0x0392
        L_0x0180:
            float r4 = r7.f3767h
            float r3 = r13.getDimension(r3, r4)
            r7.f3767h = r3
            goto L_0x0392
        L_0x018a:
            float r4 = r7.f3766g
            float r3 = r13.getDimension(r3, r4)
            r7.f3766g = r3
            goto L_0x0392
        L_0x0194:
            float r4 = r7.f3765f
            float r3 = r13.getDimension(r3, r4)
            r7.f3765f = r3
            goto L_0x0392
        L_0x019e:
            float r4 = r7.f3764e
            float r3 = r13.getFloat(r3, r4)
            r7.f3764e = r3
            goto L_0x0392
        L_0x01a8:
            float r4 = r7.f3763d
            float r3 = r13.getFloat(r3, r4)
            r7.f3763d = r3
            goto L_0x0392
        L_0x01b2:
            float r4 = r7.f3762c
            float r3 = r13.getFloat(r3, r4)
            r7.f3762c = r3
            goto L_0x0392
        L_0x01bc:
            float r4 = r7.f3761b
            float r3 = r13.getFloat(r3, r4)
            r7.f3761b = r3
            goto L_0x0392
        L_0x01c6:
            r7.f3770k = r4
            float r4 = r7.f3771l
            float r3 = r13.getDimension(r3, r4)
            r7.f3771l = r3
            goto L_0x0392
        L_0x01d2:
            float r4 = r5.f3757c
            float r3 = r13.getFloat(r3, r4)
            r5.f3757c = r3
            goto L_0x0392
        L_0x01dc:
            int r4 = r8.R
            int r3 = r13.getInt(r3, r4)
            r8.R = r3
            goto L_0x0392
        L_0x01e6:
            int r4 = r8.Q
            int r3 = r13.getInt(r3, r4)
            r8.Q = r3
            goto L_0x0392
        L_0x01f0:
            float r4 = r8.O
            float r3 = r13.getFloat(r3, r4)
            r8.O = r3
            goto L_0x0392
        L_0x01fa:
            float r4 = r8.P
            float r3 = r13.getFloat(r3, r4)
            r8.P = r3
            goto L_0x0392
        L_0x0204:
            int r4 = r0.f3710a
            int r3 = r13.getResourceId(r3, r4)
            r0.f3710a = r3
            goto L_0x0392
        L_0x020e:
            float r4 = r8.f3745u
            float r3 = r13.getFloat(r3, r4)
            r8.f3745u = r3
            goto L_0x0392
        L_0x0218:
            int r4 = r8.f3735k
            int r3 = f(r13, r3, r4)
            r8.f3735k = r3
            goto L_0x0392
        L_0x0222:
            int r4 = r8.f3736l
            int r3 = f(r13, r3, r4)
            r8.f3736l = r3
            goto L_0x0392
        L_0x022c:
            int r4 = r8.E
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.E = r3
            goto L_0x0392
        L_0x0236:
            int r4 = r8.f3741q
            int r3 = f(r13, r3, r4)
            r8.f3741q = r3
            goto L_0x0392
        L_0x0240:
            int r4 = r8.f3740p
            int r3 = f(r13, r3, r4)
            r8.f3740p = r3
            goto L_0x0392
        L_0x024a:
            int r4 = r8.H
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.H = r3
            goto L_0x0392
        L_0x0254:
            int r4 = r8.f3734j
            int r3 = f(r13, r3, r4)
            r8.f3734j = r3
            goto L_0x0392
        L_0x025e:
            int r4 = r8.f3732i
            int r3 = f(r13, r3, r4)
            r8.f3732i = r3
            goto L_0x0392
        L_0x0268:
            int r4 = r8.D
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.D = r3
            goto L_0x0392
        L_0x0272:
            int r4 = r8.B
            int r3 = r13.getInt(r3, r4)
            r8.B = r3
            goto L_0x0392
        L_0x027c:
            int r4 = r8.f3730h
            int r3 = f(r13, r3, r4)
            r8.f3730h = r3
            goto L_0x0392
        L_0x0286:
            int r4 = r8.f3728g
            int r3 = f(r13, r3, r4)
            r8.f3728g = r3
            goto L_0x0392
        L_0x0290:
            int r4 = r8.C
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.C = r3
            goto L_0x0392
        L_0x029a:
            int r4 = r8.f3719b
            int r3 = r13.getLayoutDimension(r3, r4)
            r8.f3719b = r3
            goto L_0x0392
        L_0x02a4:
            int r4 = r5.f3755a
            int r3 = r13.getInt(r3, r4)
            int[] r4 = f3772d
            r3 = r4[r3]
            r5.f3755a = r3
            goto L_0x0392
        L_0x02b2:
            int r4 = r8.f3721c
            int r3 = r13.getLayoutDimension(r3, r4)
            r8.f3721c = r3
            goto L_0x0392
        L_0x02bc:
            float r4 = r8.f3744t
            float r3 = r13.getFloat(r3, r4)
            r8.f3744t = r3
            goto L_0x0392
        L_0x02c6:
            float r4 = r8.f3727f
            float r3 = r13.getFloat(r3, r4)
            r8.f3727f = r3
            goto L_0x0392
        L_0x02d0:
            int r4 = r8.f3725e
            int r3 = r13.getDimensionPixelOffset(r3, r4)
            r8.f3725e = r3
            goto L_0x0392
        L_0x02da:
            int r4 = r8.f3723d
            int r3 = r13.getDimensionPixelOffset(r3, r4)
            r8.f3723d = r3
            goto L_0x0392
        L_0x02e4:
            int r4 = r8.J
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.J = r3
            goto L_0x0392
        L_0x02ee:
            int r4 = r8.N
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.N = r3
            goto L_0x0392
        L_0x02f8:
            int r4 = r8.K
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.K = r3
            goto L_0x0392
        L_0x0302:
            int r4 = r8.I
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.I = r3
            goto L_0x0392
        L_0x030c:
            int r4 = r8.M
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.M = r3
            goto L_0x0392
        L_0x0316:
            int r4 = r8.L
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.L = r3
            goto L_0x0392
        L_0x0320:
            int r4 = r8.f3742r
            int r3 = f(r13, r3, r4)
            r8.f3742r = r3
            goto L_0x0392
        L_0x0329:
            int r4 = r8.f3743s
            int r3 = f(r13, r3, r4)
            r8.f3743s = r3
            goto L_0x0392
        L_0x0332:
            int r4 = r8.G
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.G = r3
            goto L_0x0392
        L_0x033b:
            int r4 = r8.A
            int r3 = r13.getDimensionPixelOffset(r3, r4)
            r8.A = r3
            goto L_0x0392
        L_0x0344:
            int r4 = r8.f3749z
            int r3 = r13.getDimensionPixelOffset(r3, r4)
            r8.f3749z = r3
            goto L_0x0392
        L_0x034d:
            java.lang.String r3 = r13.getString(r3)
            r8.f3746v = r3
            goto L_0x0392
        L_0x0354:
            int r4 = r8.f3737m
            int r3 = f(r13, r3, r4)
            r8.f3737m = r3
            goto L_0x0392
        L_0x035d:
            int r4 = r8.f3738n
            int r3 = f(r13, r3, r4)
            r8.f3738n = r3
            goto L_0x0392
        L_0x0366:
            int r4 = r8.F
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.F = r3
            goto L_0x0392
        L_0x036f:
            int r4 = r8.f3739o
            int r3 = f(r13, r3, r4)
            r8.f3739o = r3
            goto L_0x0392
        L_0x0378:
            java.lang.String r5 = java.lang.Integer.toHexString(r3)
            r4.append(r5)
            java.lang.String r5 = "   "
            r4.append(r5)
            int r3 = r9.get(r3)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r12, r3)
        L_0x0392:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0396:
            r13.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.n.d(android.content.Context, android.util.AttributeSet):j0.i");
    }

    public static int f(TypedArray typedArray, int i3, int i6) {
        int resourceId = typedArray.getResourceId(i3, i6);
        return resourceId == -1 ? typedArray.getInt(i3, -1) : resourceId;
    }

    public final void a(ConstraintLayout constraintLayout) {
        int i3;
        Iterator it;
        StringBuilder sb;
        String str;
        n nVar = this;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f3776c;
        HashSet hashSet = new HashSet(hashMap.keySet());
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = constraintLayout2.getChildAt(i6);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                sb2.append(str);
                Log.w("ConstraintSet", sb2.toString());
            } else if (nVar.f3775b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (hashMap.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    i iVar = (i) hashMap.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        iVar.f3713d.f3722c0 = 1;
                    }
                    int i7 = iVar.f3713d.f3722c0;
                    if (i7 != -1 && i7 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        j jVar = iVar.f3713d;
                        barrier.setType(jVar.f3718a0);
                        barrier.setMargin(jVar.f3720b0);
                        barrier.setAllowsGoneWidget(jVar.f3733i0);
                        int[] iArr = jVar.f3724d0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str2 = jVar.f3726e0;
                            if (str2 != null) {
                                int[] c6 = c(barrier, str2);
                                jVar.f3724d0 = c6;
                                barrier.setReferencedIds(c6);
                            }
                        }
                    }
                    d dVar = (d) childAt.getLayoutParams();
                    dVar.a();
                    iVar.a(dVar);
                    HashMap hashMap2 = iVar.f3715f;
                    Class<?> cls = childAt.getClass();
                    Iterator it2 = hashMap2.keySet().iterator();
                    while (it2.hasNext()) {
                        String str3 = (String) it2.next();
                        a aVar = (a) hashMap2.get(str3);
                        int i8 = childCount;
                        HashMap hashMap3 = hashMap2;
                        String str4 = "set" + str3;
                        try {
                            switch (d.b(aVar.f3644a)) {
                                case 0:
                                    it = it2;
                                    cls.getMethod(str4, new Class[]{Integer.TYPE}).invoke(childAt, new Object[]{Integer.valueOf(aVar.f3645b)});
                                    break;
                                case 1:
                                    it = it2;
                                    cls.getMethod(str4, new Class[]{Float.TYPE}).invoke(childAt, new Object[]{Float.valueOf(aVar.f3646c)});
                                    break;
                                case 2:
                                    it = it2;
                                    cls.getMethod(str4, new Class[]{Integer.TYPE}).invoke(childAt, new Object[]{Integer.valueOf(aVar.f3649f)});
                                    break;
                                case 3:
                                    it = it2;
                                    Method method = cls.getMethod(str4, new Class[]{Drawable.class});
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(aVar.f3649f);
                                    method.invoke(childAt, new Object[]{colorDrawable});
                                    break;
                                case 4:
                                    it = it2;
                                    cls.getMethod(str4, new Class[]{CharSequence.class}).invoke(childAt, new Object[]{aVar.f3647d});
                                    break;
                                case 5:
                                    it = it2;
                                    cls.getMethod(str4, new Class[]{Boolean.TYPE}).invoke(childAt, new Object[]{Boolean.valueOf(aVar.f3648e)});
                                    break;
                                case 6:
                                    it = it2;
                                    try {
                                        cls.getMethod(str4, new Class[]{Float.TYPE}).invoke(childAt, new Object[]{Float.valueOf(aVar.f3646c)});
                                    } catch (NoSuchMethodException e6) {
                                        e = e6;
                                        Log.e("TransitionLayout", e.getMessage());
                                        Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str4);
                                        childCount = i8;
                                        hashMap2 = hashMap3;
                                        it2 = it;
                                    } catch (IllegalAccessException e7) {
                                        e = e7;
                                        sb = new StringBuilder(" Custom Attribute \"");
                                        sb.append(str3);
                                        sb.append("\" not found on ");
                                        sb.append(cls.getName());
                                        Log.e("TransitionLayout", sb.toString());
                                        e.printStackTrace();
                                        childCount = i8;
                                        hashMap2 = hashMap3;
                                        it2 = it;
                                    } catch (InvocationTargetException e8) {
                                        e = e8;
                                        sb = new StringBuilder(" Custom Attribute \"");
                                        sb.append(str3);
                                        sb.append("\" not found on ");
                                        sb.append(cls.getName());
                                        Log.e("TransitionLayout", sb.toString());
                                        e.printStackTrace();
                                        childCount = i8;
                                        hashMap2 = hashMap3;
                                        it2 = it;
                                    }
                                default:
                                    it = it2;
                                    break;
                            }
                        } catch (NoSuchMethodException e9) {
                            e = e9;
                            it = it2;
                            Log.e("TransitionLayout", e.getMessage());
                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str4);
                            childCount = i8;
                            hashMap2 = hashMap3;
                            it2 = it;
                        } catch (IllegalAccessException e10) {
                            e = e10;
                            it = it2;
                            sb = new StringBuilder(" Custom Attribute \"");
                            sb.append(str3);
                            sb.append("\" not found on ");
                            sb.append(cls.getName());
                            Log.e("TransitionLayout", sb.toString());
                            e.printStackTrace();
                            childCount = i8;
                            hashMap2 = hashMap3;
                            it2 = it;
                        } catch (InvocationTargetException e11) {
                            e = e11;
                            it = it2;
                            sb = new StringBuilder(" Custom Attribute \"");
                            sb.append(str3);
                            sb.append("\" not found on ");
                            sb.append(cls.getName());
                            Log.e("TransitionLayout", sb.toString());
                            e.printStackTrace();
                            childCount = i8;
                            hashMap2 = hashMap3;
                            it2 = it;
                        }
                    }
                    i3 = childCount;
                    childAt.setLayoutParams(dVar);
                    l lVar = iVar.f3711b;
                    if (lVar.f3756b == 0) {
                        childAt.setVisibility(lVar.f3755a);
                    }
                    childAt.setAlpha(lVar.f3757c);
                    m mVar = iVar.f3714e;
                    childAt.setRotation(mVar.f3760a);
                    childAt.setRotationX(mVar.f3761b);
                    childAt.setRotationY(mVar.f3762c);
                    childAt.setScaleX(mVar.f3763d);
                    childAt.setScaleY(mVar.f3764e);
                    if (!Float.isNaN(mVar.f3765f)) {
                        childAt.setPivotX(mVar.f3765f);
                    }
                    if (!Float.isNaN(mVar.f3766g)) {
                        childAt.setPivotY(mVar.f3766g);
                    }
                    childAt.setTranslationX(mVar.f3767h);
                    childAt.setTranslationY(mVar.f3768i);
                    childAt.setTranslationZ(mVar.f3769j);
                    if (mVar.f3770k) {
                        childAt.setElevation(mVar.f3771l);
                    }
                } else {
                    i3 = childCount;
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
                i6++;
                nVar = this;
                childCount = i3;
            }
            i3 = childCount;
            i6++;
            nVar = this;
            childCount = i3;
        }
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            Integer num = (Integer) it3.next();
            i iVar2 = (i) hashMap.get(num);
            j jVar2 = iVar2.f3713d;
            int i9 = jVar2.f3722c0;
            if (i9 != -1 && i9 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = jVar2.f3724d0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str5 = jVar2.f3726e0;
                    if (str5 != null) {
                        int[] c7 = c(barrier2, str5);
                        jVar2.f3724d0 = c7;
                        barrier2.setReferencedIds(c7);
                    }
                }
                barrier2.setType(jVar2.f3718a0);
                barrier2.setMargin(jVar2.f3720b0);
                int i10 = ConstraintLayout.f921s;
                d dVar2 = new d();
                barrier2.g();
                iVar2.a(dVar2);
                constraintLayout2.addView(barrier2, dVar2);
            }
            if (jVar2.f3717a) {
                p pVar = new p(constraintLayout.getContext());
                pVar.setId(num.intValue());
                int i11 = ConstraintLayout.f921s;
                d dVar3 = new d();
                iVar2.a(dVar3);
                constraintLayout2.addView(pVar, dVar3);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i3;
        a aVar;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f3776c;
        hashMap.clear();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = constraintLayout.getChildAt(i6);
            d dVar = (d) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!nVar.f3775b || id != -1) {
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new i());
                }
                i iVar = (i) hashMap.get(Integer.valueOf(id));
                HashMap hashMap2 = nVar.f3774a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    a aVar2 = (a) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            aVar = new a(aVar2, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                            i3 = childCount;
                        } else {
                            i3 = childCount;
                            try {
                                aVar = new a(aVar2, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0]));
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e6) {
                                e = e6;
                                e.printStackTrace();
                                childCount = i3;
                            }
                        }
                        hashMap3.put(str, aVar);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
                        e = e7;
                        i3 = childCount;
                        e.printStackTrace();
                        childCount = i3;
                    }
                    childCount = i3;
                }
                int i7 = childCount;
                iVar.f3715f = hashMap3;
                iVar.f3710a = id;
                int i8 = dVar.f3663d;
                j jVar = iVar.f3713d;
                jVar.f3728g = i8;
                jVar.f3730h = dVar.f3665e;
                jVar.f3732i = dVar.f3667f;
                jVar.f3734j = dVar.f3668g;
                jVar.f3735k = dVar.f3670h;
                jVar.f3736l = dVar.f3672i;
                jVar.f3737m = dVar.f3674j;
                jVar.f3738n = dVar.f3676k;
                jVar.f3739o = dVar.f3678l;
                jVar.f3740p = dVar.f3682p;
                jVar.f3741q = dVar.f3683q;
                jVar.f3742r = dVar.f3684r;
                jVar.f3743s = dVar.f3685s;
                jVar.f3744t = dVar.f3691z;
                jVar.f3745u = dVar.A;
                jVar.f3746v = dVar.B;
                jVar.w = dVar.f3679m;
                jVar.f3747x = dVar.f3680n;
                jVar.f3748y = dVar.f3681o;
                jVar.f3749z = dVar.P;
                jVar.A = dVar.Q;
                jVar.B = dVar.R;
                jVar.f3727f = dVar.f3661c;
                jVar.f3723d = dVar.f3657a;
                jVar.f3725e = dVar.f3659b;
                jVar.f3719b = dVar.width;
                jVar.f3721c = dVar.height;
                jVar.C = dVar.leftMargin;
                jVar.D = dVar.rightMargin;
                jVar.E = dVar.topMargin;
                jVar.F = dVar.bottomMargin;
                jVar.O = dVar.E;
                jVar.P = dVar.D;
                jVar.R = dVar.G;
                jVar.Q = dVar.F;
                jVar.f3729g0 = dVar.S;
                jVar.f3731h0 = dVar.T;
                jVar.S = dVar.H;
                jVar.T = dVar.I;
                jVar.U = dVar.L;
                jVar.V = dVar.M;
                jVar.W = dVar.J;
                jVar.X = dVar.K;
                jVar.Y = dVar.N;
                jVar.Z = dVar.O;
                jVar.f0 = dVar.U;
                jVar.J = dVar.f3687u;
                jVar.L = dVar.w;
                jVar.I = dVar.f3686t;
                jVar.K = dVar.f3688v;
                jVar.N = dVar.f3689x;
                jVar.M = dVar.f3690y;
                jVar.G = dVar.getMarginEnd();
                jVar.H = dVar.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = iVar.f3711b;
                lVar.f3755a = visibility;
                lVar.f3757c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = iVar.f3714e;
                mVar.f3760a = rotation;
                mVar.f3761b = childAt.getRotationX();
                mVar.f3762c = childAt.getRotationY();
                mVar.f3763d = childAt.getScaleX();
                mVar.f3764e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                    mVar.f3765f = pivotX;
                    mVar.f3766g = pivotY;
                }
                mVar.f3767h = childAt.getTranslationX();
                mVar.f3768i = childAt.getTranslationY();
                mVar.f3769j = childAt.getTranslationZ();
                if (mVar.f3770k) {
                    mVar.f3771l = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    jVar.f3733i0 = barrier.f920l.f3233g0;
                    jVar.f3724d0 = barrier.getReferencedIds();
                    jVar.f3718a0 = barrier.getType();
                    jVar.f3720b0 = barrier.getMargin();
                }
                i6++;
                nVar = this;
                childCount = i7;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final void e(Context context, int i3) {
        XmlResourceParser xml = context.getResources().getXml(i3);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    i d6 = d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        d6.f3713d.f3717a = true;
                    }
                    this.f3776c.put(Integer.valueOf(d6.f3710a), d6);
                }
            }
        } catch (XmlPullParserException e6) {
            e6.printStackTrace();
        } catch (IOException e7) {
            e7.printStackTrace();
        }
    }
}
