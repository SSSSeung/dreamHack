package v3;

public enum h implements i {
    ;

    public static String b(String str, char c6) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c6);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char charAt = str.charAt(i3);
            if (!Character.isLetter(charAt)) {
                i3++;
            } else if (Character.isUpperCase(charAt)) {
                return str;
            } else {
                char upperCase = Character.toUpperCase(charAt);
                if (i3 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i3) + upperCase + str.substring(i3 + 1);
            }
        }
        return str;
    }
}
