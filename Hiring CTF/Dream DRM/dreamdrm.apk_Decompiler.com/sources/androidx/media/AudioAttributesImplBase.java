package androidx.media;

import a2.m;
import java.util.Arrays;

class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f1407a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1408b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1409c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f1410d = -1;

    public final boolean equals(Object obj) {
        int i3;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f1408b != audioAttributesImplBase.f1408b) {
            return false;
        }
        int i6 = this.f1409c;
        int i7 = audioAttributesImplBase.f1409c;
        int i8 = audioAttributesImplBase.f1410d;
        if (i8 == -1) {
            int i9 = audioAttributesImplBase.f1407a;
            int i10 = AudioAttributesCompat.f1403b;
            if ((i7 & 1) != 1) {
                i3 = 4;
                if ((i7 & 4) != 4) {
                    switch (i9) {
                        case 2:
                            i3 = 0;
                            break;
                        case 3:
                            i3 = 8;
                            break;
                        case 4:
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i3 = 5;
                            break;
                        case 6:
                            i3 = 2;
                            break;
                        case 11:
                            i3 = 10;
                            break;
                        case 13:
                            i3 = 1;
                            break;
                        default:
                            i3 = 3;
                            break;
                    }
                } else {
                    i3 = 6;
                }
            } else {
                i3 = 7;
            }
        } else {
            i3 = i8;
        }
        if (i3 == 6) {
            i7 |= 4;
        } else if (i3 == 7) {
            i7 |= 1;
        }
        return i6 == (i7 & 273) && this.f1407a == audioAttributesImplBase.f1407a && this.f1410d == i8;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1408b), Integer.valueOf(this.f1409c), Integer.valueOf(this.f1407a), Integer.valueOf(this.f1410d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f1410d != -1) {
            sb.append(" stream=");
            sb.append(this.f1410d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i3 = this.f1407a;
        int i6 = AudioAttributesCompat.f1403b;
        switch (i3) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
            default:
                str = m.g("unknown usage ", i3);
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f1408b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f1409c).toUpperCase());
        return sb.toString();
    }
}
