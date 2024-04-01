package z3;

import java.util.TimeZone;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f5944a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i3, char c6) {
        return i3 < str.length() && str.charAt(i3) == c6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e5 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ca A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01d2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date b(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            r1 = r17
            r2 = r18
            int r0 = r18.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            int r3 = r0 + 4
            int r0 = c(r0, r3, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r4 = 45
            boolean r5 = a(r1, r3, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r5 == 0) goto L_0x0018
            int r3 = r3 + 1
        L_0x0018:
            int r5 = r3 + 2
            int r3 = c(r3, r5, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            boolean r6 = a(r1, r5, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r6 == 0) goto L_0x0026
            int r5 = r5 + 1
        L_0x0026:
            int r6 = r5 + 2
            int r5 = c(r5, r6, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r7 = 84
            boolean r7 = a(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r8 = 0
            r9 = 1
            if (r7 != 0) goto L_0x004d
            int r10 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r10 > r6) goto L_0x004d
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            int r3 = r3 - r9
            r4.<init>(r0, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r4.setLenient(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r2.setIndex(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.util.Date r0 = r4.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            return r0
        L_0x004d:
            r10 = 2
            r11 = 43
            r12 = 90
            if (r7 == 0) goto L_0x00d9
            int r6 = r6 + 1
            int r7 = r6 + 2
            int r6 = c(r6, r7, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r13 = 58
            boolean r14 = a(r1, r7, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r14 == 0) goto L_0x0066
            int r7 = r7 + 1
        L_0x0066:
            int r14 = r7 + 2
            int r7 = c(r7, r14, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            boolean r13 = a(r1, r14, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r13 == 0) goto L_0x0074
            int r14 = r14 + 1
        L_0x0074:
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r13 <= r14) goto L_0x00d6
            char r13 = r1.charAt(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r13 == r12) goto L_0x00d6
            if (r13 == r11) goto L_0x00d6
            if (r13 == r4) goto L_0x00d6
            int r13 = r14 + 2
            int r14 = c(r14, r13, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r15 = 59
            if (r14 <= r15) goto L_0x0094
            r15 = 63
            if (r14 >= r15) goto L_0x0094
            r14 = 59
        L_0x0094:
            r15 = 46
            boolean r15 = a(r1, r13, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r15 == 0) goto L_0x00d4
            int r13 = r13 + 1
            int r15 = r13 + 1
        L_0x00a0:
            int r8 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r15 >= r8) goto L_0x00b8
            char r8 = r1.charAt(r15)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r4 = 48
            if (r8 < r4) goto L_0x00bd
            r4 = 57
            if (r8 <= r4) goto L_0x00b3
            goto L_0x00bd
        L_0x00b3:
            int r15 = r15 + 1
            r4 = 45
            goto L_0x00a0
        L_0x00b8:
            int r4 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r15 = r4
        L_0x00bd:
            int r4 = r13 + 3
            int r4 = java.lang.Math.min(r15, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            int r8 = c(r13, r4, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            int r4 = r4 - r13
            if (r4 == r9) goto L_0x00d0
            if (r4 == r10) goto L_0x00cd
            goto L_0x00d2
        L_0x00cd:
            int r8 = r8 * 10
            goto L_0x00d2
        L_0x00d0:
            int r8 = r8 * 100
        L_0x00d2:
            r13 = r15
            goto L_0x00df
        L_0x00d4:
            r8 = 0
            goto L_0x00df
        L_0x00d6:
            r4 = r6
            r6 = r14
            goto L_0x00db
        L_0x00d9:
            r4 = 0
            r7 = 0
        L_0x00db:
            r13 = r6
            r8 = 0
            r14 = 0
            r6 = r4
        L_0x00df:
            int r4 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r4 <= r13) goto L_0x01ca
            char r4 = r1.charAt(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r15 = 5
            java.util.TimeZone r16 = f5944a
            if (r4 != r12) goto L_0x00f3
            int r13 = r13 + r9
        L_0x00ef:
            r4 = r16
            goto L_0x019a
        L_0x00f3:
            if (r4 == r11) goto L_0x0116
            r11 = 45
            if (r4 != r11) goto L_0x00fa
            goto L_0x0116
        L_0x00fa:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r5 = "Invalid time zone indicator '"
            r3.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
        L_0x0116:
            java.lang.String r4 = r1.substring(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            int r11 = r4.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r11 < r15) goto L_0x0121
            goto L_0x0132
        L_0x0121:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r11.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r11.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r4 = "00"
            r11.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r4 = r11.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
        L_0x0132:
            int r11 = r4.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            int r13 = r13 + r11
            java.lang.String r11 = "+0000"
            boolean r11 = r11.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r11 != 0) goto L_0x00ef
            java.lang.String r11 = "+00:00"
            boolean r11 = r11.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r11 == 0) goto L_0x0148
            goto L_0x00ef
        L_0x0148:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r11.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r12 = "GMT"
            r11.append(r12)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r11.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r4 = r11.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.util.TimeZone r16 = java.util.TimeZone.getTimeZone(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r11 = r16.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            boolean r12 = r11.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r12 != 0) goto L_0x00ef
            java.lang.String r12 = ":"
            java.lang.String r15 = ""
            java.lang.String r11 = r11.replace(r12, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            boolean r11 = r11.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r11 == 0) goto L_0x0177
            goto L_0x00ef
        L_0x0177:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r5 = "Mismatching time zone indicator: "
            r3.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r4 = r16.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
        L_0x019a:
            java.util.GregorianCalendar r11 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r11.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r4 = 0
            r11.setLenient(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r11.set(r9, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            int r3 = r3 - r9
            r11.set(r10, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r0 = 5
            r11.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r0 = 11
            r11.set(r0, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r0 = 12
            r11.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r0 = 13
            r11.set(r0, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r0 = 14
            r11.set(r0, r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r2.setIndex(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.util.Date r0 = r11.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            return r0
        L_0x01ca:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
        L_0x01d2:
            r0 = move-exception
            goto L_0x01d7
        L_0x01d4:
            r0 = move-exception
            goto L_0x01d7
        L_0x01d6:
            r0 = move-exception
        L_0x01d7:
            if (r1 != 0) goto L_0x01db
            r1 = 0
            goto L_0x01ee
        L_0x01db:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\""
            r3.<init>(r4)
            r3.append(r1)
            r1 = 34
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L_0x01ee:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01fa
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0215
        L_0x01fa:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "("
            r3.<init>(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x0215:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to parse date ["
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r18.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(int i3, int i6, String str) {
        int i7;
        int i8;
        if (i3 < 0 || i6 > str.length() || i3 > i6) {
            throw new NumberFormatException(str);
        }
        if (i3 < i6) {
            i8 = i3 + 1;
            int digit = Character.digit(str.charAt(i3), 10);
            if (digit >= 0) {
                i7 = -digit;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i3, i6));
            }
        } else {
            i7 = 0;
            i8 = i3;
        }
        while (i8 < i6) {
            int i9 = i8 + 1;
            int digit2 = Character.digit(str.charAt(i8), 10);
            if (digit2 >= 0) {
                i7 = (i7 * 10) - digit2;
                i8 = i9;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i3, i6));
            }
        }
        return -i7;
    }
}
