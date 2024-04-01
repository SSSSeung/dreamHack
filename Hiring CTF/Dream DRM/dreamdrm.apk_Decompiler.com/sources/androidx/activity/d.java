package androidx.activity;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f280d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f281e;

    public /* synthetic */ d(int i3, Object obj) {
        this.f280d = i3;
        this.f281e = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            java.lang.Object r0 = r15.f281e
            int r1 = r15.f280d
            r2 = 2
            r3 = 0
            r4 = 0
            r5 = 1
            switch(r1) {
                case 0: goto L_0x012c;
                case 1: goto L_0x0120;
                case 2: goto L_0x011a;
                case 3: goto L_0x000b;
                case 4: goto L_0x006d;
                case 5: goto L_0x005b;
                case 6: goto L_0x0035;
                case 7: goto L_0x000b;
                case 8: goto L_0x0013;
                case 9: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0132
        L_0x000d:
            s3.d r0 = (s3.d) r0
            r0.t(r5)
            return
        L_0x0013:
            c3.d r0 = (c3.d) r0
            r0.f1632c = r4
            l0.a r1 = r0.f1634e
            com.google.android.material.sidesheet.SideSheetBehavior r1 = (com.google.android.material.sidesheet.SideSheetBehavior) r1
            f1.d r3 = r1.f2002i
            if (r3 == 0) goto L_0x002b
            boolean r3 = r3.g()
            if (r3 == 0) goto L_0x002b
            int r1 = r0.f1631b
            r0.a(r1)
            goto L_0x0034
        L_0x002b:
            int r3 = r1.f2001h
            if (r3 != r2) goto L_0x0034
            int r0 = r0.f1631b
            r1.s(r0)
        L_0x0034:
            return
        L_0x0035:
            androidx.lifecycle.e0 r0 = (androidx.lifecycle.e0) r0
            androidx.lifecycle.e0 r1 = androidx.lifecycle.e0.f1351l
            java.lang.String r1 = "this$0"
            b1.o.m(r0, r1)
            int r1 = r0.f1353e
            androidx.lifecycle.t r2 = r0.f1357i
            if (r1 != 0) goto L_0x004b
            r0.f1354f = r5
            androidx.lifecycle.l r1 = androidx.lifecycle.l.ON_PAUSE
            r2.x(r1)
        L_0x004b:
            int r1 = r0.f1352d
            if (r1 != 0) goto L_0x005a
            boolean r1 = r0.f1354f
            if (r1 == 0) goto L_0x005a
            androidx.lifecycle.l r1 = androidx.lifecycle.l.ON_STOP
            r2.x(r1)
            r0.f1355g = r5
        L_0x005a:
            return
        L_0x005b:
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            java.lang.String r2 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r1.showSoftInput(r0, r4)
            return
        L_0x006d:
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r1 = n0.b.f4213a
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L_0x0119
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r1 < r6) goto L_0x0084
            java.lang.Class r1 = n0.d.f4220a
            r0.recreate()
            goto L_0x0108
        L_0x0084:
            java.lang.Class r6 = n0.d.f4220a
            r6 = 27
            r7 = 26
            if (r1 == r7) goto L_0x0091
            if (r1 != r6) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r8 = r4
            goto L_0x0092
        L_0x0091:
            r8 = r5
        L_0x0092:
            java.lang.reflect.Method r9 = n0.d.f4225f
            if (r8 == 0) goto L_0x009a
            if (r9 != 0) goto L_0x009a
            goto L_0x0114
        L_0x009a:
            java.lang.reflect.Method r8 = n0.d.f4224e
            if (r8 != 0) goto L_0x00a4
            java.lang.reflect.Method r8 = n0.d.f4223d
            if (r8 != 0) goto L_0x00a4
            goto L_0x0114
        L_0x00a4:
            java.lang.reflect.Field r8 = n0.d.f4222c     // Catch:{ all -> 0x0114 }
            java.lang.Object r8 = r8.get(r0)     // Catch:{ all -> 0x0114 }
            if (r8 != 0) goto L_0x00ad
            goto L_0x0114
        L_0x00ad:
            java.lang.reflect.Field r10 = n0.d.f4221b     // Catch:{ all -> 0x0114 }
            java.lang.Object r10 = r10.get(r0)     // Catch:{ all -> 0x0114 }
            if (r10 != 0) goto L_0x00b6
            goto L_0x0114
        L_0x00b6:
            android.app.Application r11 = r0.getApplication()     // Catch:{ all -> 0x0114 }
            n0.c r12 = new n0.c     // Catch:{ all -> 0x0114 }
            r12.<init>(r0)     // Catch:{ all -> 0x0114 }
            r11.registerActivityLifecycleCallbacks(r12)     // Catch:{ all -> 0x0114 }
            android.os.Handler r13 = n0.d.f4226g
            androidx.appcompat.widget.j r14 = new androidx.appcompat.widget.j     // Catch:{ all -> 0x0114 }
            r14.<init>((java.lang.Object) r12, (java.lang.Object) r8, (int) r5)     // Catch:{ all -> 0x0114 }
            r13.post(r14)     // Catch:{ all -> 0x0114 }
            if (r1 == r7) goto L_0x00d3
            if (r1 != r6) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            r1 = r4
            goto L_0x00d4
        L_0x00d3:
            r1 = r5
        L_0x00d4:
            if (r1 == 0) goto L_0x00fd
            r1 = 9
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x010a }
            r1[r4] = r8     // Catch:{ all -> 0x010a }
            r1[r5] = r3     // Catch:{ all -> 0x010a }
            r1[r2] = r3     // Catch:{ all -> 0x010a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x010a }
            r7 = 3
            r1[r7] = r6     // Catch:{ all -> 0x010a }
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x010a }
            r7 = 4
            r1[r7] = r6     // Catch:{ all -> 0x010a }
            r7 = 5
            r1[r7] = r3     // Catch:{ all -> 0x010a }
            r7 = 6
            r1[r7] = r3     // Catch:{ all -> 0x010a }
            r3 = 7
            r1[r3] = r6     // Catch:{ all -> 0x010a }
            r3 = 8
            r1[r3] = r6     // Catch:{ all -> 0x010a }
            r9.invoke(r10, r1)     // Catch:{ all -> 0x010a }
            goto L_0x0100
        L_0x00fd:
            r0.recreate()     // Catch:{ all -> 0x010a }
        L_0x0100:
            androidx.appcompat.widget.j r1 = new androidx.appcompat.widget.j     // Catch:{ all -> 0x0114 }
            r1.<init>((java.lang.Object) r11, (java.lang.Object) r12, (int) r2)     // Catch:{ all -> 0x0114 }
            r13.post(r1)     // Catch:{ all -> 0x0114 }
        L_0x0108:
            r4 = r5
            goto L_0x0114
        L_0x010a:
            r1 = move-exception
            androidx.appcompat.widget.j r3 = new androidx.appcompat.widget.j     // Catch:{ all -> 0x0114 }
            r3.<init>((java.lang.Object) r11, (java.lang.Object) r12, (int) r2)     // Catch:{ all -> 0x0114 }
            r13.post(r3)     // Catch:{ all -> 0x0114 }
            throw r1     // Catch:{ all -> 0x0114 }
        L_0x0114:
            if (r4 != 0) goto L_0x0119
            r0.recreate()
        L_0x0119:
            return
        L_0x011a:
            androidx.activity.o r0 = (androidx.activity.o) r0
            androidx.activity.o.a(r0)
            return
        L_0x0120:
            androidx.activity.m r0 = (androidx.activity.m) r0
            java.lang.Runnable r1 = r0.f296e
            if (r1 == 0) goto L_0x012b
            r1.run()
            r0.f296e = r3
        L_0x012b:
            return
        L_0x012c:
            androidx.activity.n r0 = (androidx.activity.n) r0
            r0.invalidateOptionsMenu()
            return
        L_0x0132:
            s3.k r0 = (s3.k) r0
            android.widget.AutoCompleteTextView r1 = r0.f4976h
            boolean r1 = r1.isPopupShowing()
            r0.t(r1)
            r0.f4981m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.d.run():void");
    }
}
