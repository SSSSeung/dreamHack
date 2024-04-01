package com.teamsa.piggybank;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:flag.properties"})
@ConfigurationProperties(
   prefix = "flag"
)
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0097\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"},
   d2 = {"Lcom/teamsa/piggybank/FlagProperties;", "", "flag", "", "(Ljava/lang/String;)V", "getFlag", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "piggybank"}
)
public class FlagProperties {
   @NotNull
   private final String flag;

   public FlagProperties(@Value("${flag}") @NotNull String flag) {
      Intrinsics.checkNotNullParameter(flag, "flag");
      super();
      this.flag = flag;
   }

   @NotNull
   public String getFlag() {
      return this.flag;
   }

   @NotNull
   public final String component1() {
      return this.getFlag();
   }

   @NotNull
   public final FlagProperties copy(@Value("${flag}") @NotNull String flag) {
      Intrinsics.checkNotNullParameter(flag, "flag");
      return new FlagProperties(flag);
   }

   // $FF: synthetic method
   public static FlagProperties copy$default(FlagProperties var0, String var1, int var2, Object var3) {
      if (var3 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
      } else {
         if ((var2 & 1) != 0) {
            var1 = var0.getFlag();
         }

         return var0.copy(var1);
      }
   }

   @NotNull
   public String toString() {
      return "FlagProperties(flag=" + this.getFlag() + ")";
   }

   public int hashCode() {
      return this.getFlag().hashCode();
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof FlagProperties)) {
         return false;
      } else {
         FlagProperties var2 = (FlagProperties)other;
         return Intrinsics.areEqual(this.getFlag(), var2.getFlag());
      }
   }
}
