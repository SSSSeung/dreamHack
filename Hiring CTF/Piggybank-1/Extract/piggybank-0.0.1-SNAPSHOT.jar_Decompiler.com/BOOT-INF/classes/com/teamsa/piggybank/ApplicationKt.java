package com.teamsa.piggybank;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.SpringApplication;

@Metadata(
   mv = {1, 9, 0},
   k = 2,
   xi = 48,
   d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"},
   d2 = {"main", "", "args", "", "", "([Ljava/lang/String;)V", "piggybank"}
)
@SourceDebugExtension({"SMAP\nApplication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Application.kt\ncom/teamsa/piggybank/ApplicationKt\n+ 2 SpringApplicationExtensions.kt\norg/springframework/boot/SpringApplicationExtensionsKt\n*L\n1#1,76:1\n35#2:77\n*S KotlinDebug\n*F\n+ 1 Application.kt\ncom/teamsa/piggybank/ApplicationKt\n*L\n75#1:77\n*E\n"})
public final class ApplicationKt {
   public static final void main(@NotNull String[] args) {
      Intrinsics.checkNotNullParameter(args, "args");
      String[] args$iv = (String[])Arrays.copyOf(args, args.length);
      int $i$f$runApplication = false;
      Intrinsics.checkNotNullExpressionValue(SpringApplication.run(Application.class, (String[])Arrays.copyOf(args$iv, args$iv.length)), "run(T::class.java, *args)");
   }
}
