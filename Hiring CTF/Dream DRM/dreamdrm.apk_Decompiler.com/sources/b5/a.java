package b5;

import androidx.appcompat.widget.w;
import androidx.compose.ui.platform.e;
import b1.o;
import d5.j;
import e5.f;
import v4.i;
import z4.a0;
import z4.c;
import z4.c0;
import z4.n;
import z4.q;
import z4.r;
import z4.u;
import z4.x;
import z4.z;

public final class a implements u {
    static {
        new e
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 ? I:androidx.compose.ui.platform.e) =  call: androidx.compose.ui.platform.e.<init>():void type: CONSTRUCTOR in method: b5.a.<clinit>():void, dex: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v0 ?
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	... 29 more
            */
        /*
            androidx.compose.ui.platform.e r0 = new androidx.compose.ui.platform.e
            r0.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.a.<clinit>():void");
    }

    public final a0 a(f fVar) {
        r rVar;
        r rVar2;
        boolean z5;
        f fVar2 = fVar;
        System.currentTimeMillis();
        w wVar = fVar2.f2599f;
        o.m(wVar, "request");
        b bVar = new b(wVar, (a0) null);
        c cVar = (c) wVar.f819b;
        if (cVar == null) {
            int i3 = c.f5974n;
            cVar = com.bumptech.glide.e.q((r) wVar.f822e);
            wVar.f819b = cVar;
        }
        if (cVar.f5984j) {
            bVar = new b((w) null, (a0) null);
        }
        j jVar = fVar2.f2595b;
        j jVar2 = !(jVar instanceof j) ? null : jVar;
        if (jVar2 != null) {
            n nVar = jVar2.f2225e;
        }
        w wVar2 = bVar.f1596a;
        a0 a0Var = bVar.f1597b;
        if (wVar2 == null && a0Var == null) {
            z zVar = new z();
            zVar.f6117a = wVar;
            zVar.f6118b = x.f6106f;
            zVar.f6119c = 504;
            zVar.f6120d = "Unsatisfiable Request (only-if-cached)";
            zVar.f6123g = a5.c.f214c;
            zVar.f6127k = -1;
            zVar.f6128l = System.currentTimeMillis();
            a0 a6 = zVar.a();
            o.m(jVar, "call");
            return a6;
        } else if (wVar2 == null) {
            o.k(a0Var);
            z zVar2 = new z(a0Var);
            a0 k6 = e.k(a0Var);
            z.b("cacheResponse", k6);
            zVar2.f6125i = k6;
            a0 a7 = zVar2.a();
            o.m(jVar, "call");
            return a7;
        } else {
            if (a0Var != null) {
                o.m(jVar, "call");
            }
            a0 b6 = fVar2.b(wVar2);
            if (a0Var != null) {
                if (b6.f5959g == 304) {
                    z zVar3 = new z(a0Var);
                    q qVar = new q();
                    r rVar3 = a0Var.f5961i;
                    int length = rVar3.f6060d.length / 2;
                    int i6 = 0;
                    while (true) {
                        rVar = b6.f5961i;
                        if (i6 >= length) {
                            break;
                        }
                        String b7 = rVar3.b(i6);
                        String d6 = rVar3.d(i6);
                        if (i.T("Warning", b7)) {
                            rVar2 = rVar3;
                            z5 = false;
                            if (i.k0(d6, "1", false)) {
                                i6++;
                                rVar3 = rVar2;
                            }
                        } else {
                            rVar2 = rVar3;
                            z5 = false;
                        }
                        if (((i.T("Content-Length", b7) || i.T("Content-Encoding", b7) || i.T("Content-Type", b7)) ? true : z5) || !e.u(b7) || rVar.a(b7) == null) {
                            qVar.a(b7, d6);
                            i6++;
                            rVar3 = rVar2;
                        } else {
                            i6++;
                            rVar3 = rVar2;
                        }
                    }
                    int length2 = rVar.f6060d.length / 2;
                    for (int i7 = 0; i7 < length2; i7++) {
                        String b8 = rVar.b(i7);
                        if (!(i.T("Content-Length", b8) || i.T("Content-Encoding", b8) || i.T("Content-Type", b8)) && e.u(b8)) {
                            qVar.a(b8, rVar.d(i7));
                        }
                    }
                    zVar3.f6122f = qVar.b().c();
                    zVar3.f6127k = b6.f5966n;
                    zVar3.f6128l = b6.f5967o;
                    a0 k7 = e.k(a0Var);
                    z.b("cacheResponse", k7);
                    zVar3.f6125i = k7;
                    a0 k8 = e.k(b6);
                    z.b("networkResponse", k8);
                    zVar3.f6124h = k8;
                    zVar3.a();
                    c0 c0Var = b6.f5962j;
                    o.k(c0Var);
                    c0Var.close();
                    o.k((Object) null);
                    throw null;
                }
                c0 c0Var2 = a0Var.f5962j;
                if (c0Var2 != null) {
                    a5.c.b(c0Var2);
                }
            }
            z zVar4 = new z(b6);
            a0 k9 = e.k(a0Var);
            z.b("cacheResponse", k9);
            zVar4.f6125i = k9;
            a0 k10 = e.k(b6);
            z.b("networkResponse", k10);
            zVar4.f6124h = k10;
            return zVar4.a();
        }
    }
}
