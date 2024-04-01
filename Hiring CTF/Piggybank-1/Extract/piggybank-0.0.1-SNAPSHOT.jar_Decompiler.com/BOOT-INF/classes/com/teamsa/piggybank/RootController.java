package com.teamsa.piggybank;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¨\u0006\u0007"},
   d2 = {"Lcom/teamsa/piggybank/RootController;", "", "()V", "index", "", "model", "Lorg/springframework/ui/Model;", "piggybank"}
)
public class RootController {
   @GetMapping({"/"})
   @NotNull
   public String index(@NotNull Model model) {
      Intrinsics.checkNotNullParameter(model, "model");
      return "index";
   }
}
