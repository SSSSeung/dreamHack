package z4;

import a5.c;
import b1.o;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import v4.i;

public final class t {

    /* renamed from: j  reason: collision with root package name */
    public static final char[] f6069j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6070a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6071b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6072c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6073d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6074e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6075f;

    /* renamed from: g  reason: collision with root package name */
    public final List f6076g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6077h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6078i;

    static {
        new n
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 ? I:z4.n) =  call: z4.n.<init>():void type: CONSTRUCTOR in method: z4.t.<clinit>():void, dex: classes.dex
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
            z4.n r0 = new z4.n
            r0.<init>()
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            f6069j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.t.<clinit>():void");
    }

    public t(String str, String str2, String str3, String str4, int i3, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f6071b = str;
        this.f6072c = str2;
        this.f6073d = str3;
        this.f6074e = str4;
        this.f6075f = i3;
        this.f6076g = arrayList2;
        this.f6077h = str5;
        this.f6078i = str6;
        this.f6070a = o.c(str, "https");
    }

    public final String a() {
        if (this.f6073d.length() == 0) {
            return "";
        }
        String str = this.f6078i;
        int X = i.X(str, ':', this.f6071b.length() + 3, false, 4) + 1;
        int X2 = i.X(str, '@', 0, false, 6);
        if (str != null) {
            String substring = str.substring(X, X2);
            o.l(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final String b() {
        String str = this.f6078i;
        int X = i.X(str, '/', this.f6071b.length() + 3, false, 4);
        String substring = str.substring(X, c.e(str, "?#", X, str.length()));
        o.l(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        String str = this.f6078i;
        int X = i.X(str, '/', this.f6071b.length() + 3, false, 4);
        int e6 = c.e(str, "?#", X, str.length());
        ArrayList arrayList = new ArrayList();
        while (X < e6) {
            int i3 = X + 1;
            int d6 = c.d(str, '/', i3, e6);
            String substring = str.substring(i3, d6);
            o.l(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            X = d6;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f6076g == null) {
            return null;
        }
        String str = this.f6078i;
        int X = i.X(str, '?', 0, false, 6) + 1;
        String substring = str.substring(X, c.d(str, '#', X, str.length()));
        o.l(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f6072c.length() == 0) {
            return "";
        }
        int length = this.f6071b.length() + 3;
        String str = this.f6078i;
        int e6 = c.e(str, ":@", length, str.length());
        if (str != null) {
            String substring = str.substring(length, e6);
            o.l(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t) && o.c(((t) obj).f6078i, this.f6078i);
    }

    public final String f() {
        s sVar;
        try {
            sVar = new s();
            sVar.d(this, "/...");
        } catch (IllegalArgumentException unused) {
            sVar = null;
        }
        o.k(sVar);
        sVar.f6062b = n.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        sVar.f6063c = n.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return sVar.a().f6078i;
    }

    public final URI g() {
        String str;
        String str2;
        s sVar = new s();
        String str3 = this.f6071b;
        sVar.f6061a = str3;
        sVar.f6062b = e();
        sVar.f6063c = a();
        sVar.f6064d = this.f6074e;
        int b6 = n.b(str3);
        int i3 = this.f6075f;
        if (i3 == b6) {
            i3 = -1;
        }
        sVar.f6065e = i3;
        ArrayList arrayList = sVar.f6066f;
        arrayList.clear();
        arrayList.addAll(c());
        sVar.c(d());
        String str4 = null;
        if (this.f6077h == null) {
            str = null;
        } else {
            String str5 = this.f6078i;
            int X = i.X(str5, '#', 0, false, 6) + 1;
            if (str5 != null) {
                str = str5.substring(X);
                o.l(str, "(this as java.lang.String).substring(startIndex)");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        sVar.f6068h = str;
        String str6 = sVar.f6064d;
        if (str6 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            o.l(compile, "compile(pattern)");
            str2 = compile.matcher(str6).replaceAll("");
            o.l(str2, "nativePattern.matcher(in…).replaceAll(replacement)");
        } else {
            str2 = null;
        }
        sVar.f6064d = str2;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.set(i6, n.a((String) arrayList.get(i6), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = sVar.f6067g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                String str7 = (String) arrayList2.get(i7);
                arrayList2.set(i7, str7 != null ? n.a(str7, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str8 = sVar.f6068h;
        if (str8 != null) {
            str4 = n.a(str8, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163);
        }
        sVar.f6068h = str4;
        String sVar2 = sVar.toString();
        try {
            return new URI(sVar2);
        } catch (URISyntaxException e6) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                o.l(compile2, "compile(pattern)");
                String replaceAll = compile2.matcher(sVar2).replaceAll("");
                o.l(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                URI create = URI.create(replaceAll);
                o.l(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e6);
            }
        }
    }

    public final int hashCode() {
        return this.f6078i.hashCode();
    }

    public final String toString() {
        return this.f6078i;
    }
}
