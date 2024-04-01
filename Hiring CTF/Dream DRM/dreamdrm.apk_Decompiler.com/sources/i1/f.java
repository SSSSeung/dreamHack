package i1;

import a2.m;
import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

public final class f {
    public static final byte[] A = {87, 69, 66, 80};
    public static final byte[] B = {69, 88, 73, 70};
    public static final String[] C = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] D = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] E = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final d F = new d(273, 3, "StripOffsets");
    public static final d[][] G;
    public static final d[] H = {new d(330, 4, "SubIFDPointer"), new d(34665, 4, "ExifIFDPointer"), new d(34853, 4, "GPSInfoIFDPointer"), new d(40965, 4, "InteroperabilityIFDPointer"), new d(8224, 1, "CameraSettingsIFDPointer"), new d(8256, 1, "ImageProcessingIFDPointer")};
    public static final HashMap[] I = new HashMap[10];
    public static final HashMap[] J = new HashMap[10];
    public static final HashSet K = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    public static final HashMap L = new HashMap();
    public static final Charset M;
    public static final byte[] N;
    public static final byte[] O;

    /* renamed from: m  reason: collision with root package name */
    public static final boolean f3572m = Log.isLoggable("ExifInterface", 3);

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f3573n = {8, 8, 8};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f3574o = {8};

    /* renamed from: p  reason: collision with root package name */
    public static final byte[] f3575p = {-1, -40, -1};

    /* renamed from: q  reason: collision with root package name */
    public static final byte[] f3576q = {102, 116, 121, 112};

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f3577r = {109, 105, 102, 49};

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f3578s = {104, 101, 105, 99};

    /* renamed from: t  reason: collision with root package name */
    public static final byte[] f3579t = {79, 76, 89, 77, 80, 0};

    /* renamed from: u  reason: collision with root package name */
    public static final byte[] f3580u = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f3581v = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] w = {101, 88, 73, 102};

    /* renamed from: x  reason: collision with root package name */
    public static final byte[] f3582x = {73, 72, 68, 82};

    /* renamed from: y  reason: collision with root package name */
    public static final byte[] f3583y = {73, 69, 78, 68};

    /* renamed from: z  reason: collision with root package name */
    public static final byte[] f3584z = {82, 73, 70, 70};

    /* renamed from: a  reason: collision with root package name */
    public final FileDescriptor f3585a;

    /* renamed from: b  reason: collision with root package name */
    public final AssetManager.AssetInputStream f3586b;

    /* renamed from: c  reason: collision with root package name */
    public int f3587c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap[] f3588d;

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f3589e;

    /* renamed from: f  reason: collision with root package name */
    public ByteOrder f3590f = ByteOrder.BIG_ENDIAN;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3591g;

    /* renamed from: h  reason: collision with root package name */
    public int f3592h;

    /* renamed from: i  reason: collision with root package name */
    public int f3593i;

    /* renamed from: j  reason: collision with root package name */
    public int f3594j;

    /* renamed from: k  reason: collision with root package name */
    public int f3595k;

    /* renamed from: l  reason: collision with root package name */
    public int f3596l;

    static {
        Arrays.asList(new Integer[]{1, 6, 3, 8});
        Arrays.asList(new Integer[]{2, 7, 4, 5});
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        "XMP ".getBytes(Charset.defaultCharset());
        d[] dVarArr = {new d(254, 4, "NewSubfileType"), new d(255, 4, "SubfileType"), new d(256, "ImageWidth"), new d(257, "ImageLength"), new d(258, 3, "BitsPerSample"), new d(259, 3, "Compression"), new d(262, 3, "PhotometricInterpretation"), new d(270, 2, "ImageDescription"), new d(271, 2, "Make"), new d(272, 2, "Model"), new d(273, "StripOffsets"), new d(274, 3, "Orientation"), new d(277, 3, "SamplesPerPixel"), new d(278, "RowsPerStrip"), new d(279, "StripByteCounts"), new d(282, 5, "XResolution"), new d(283, 5, "YResolution"), new d(284, 3, "PlanarConfiguration"), new d(296, 3, "ResolutionUnit"), new d(301, 3, "TransferFunction"), new d(305, 2, "Software"), new d(306, 2, "DateTime"), new d(315, 2, "Artist"), new d(318, 5, "WhitePoint"), new d(319, 5, "PrimaryChromaticities"), new d(330, 4, "SubIFDPointer"), new d(513, 4, "JPEGInterchangeFormat"), new d(514, 4, "JPEGInterchangeFormatLength"), new d(529, 5, "YCbCrCoefficients"), new d(530, 3, "YCbCrSubSampling"), new d(531, 3, "YCbCrPositioning"), new d(532, 5, "ReferenceBlackWhite"), new d(33432, 2, "Copyright"), new d(34665, 4, "ExifIFDPointer"), new d(34853, 4, "GPSInfoIFDPointer"), new d(4, 4, "SensorTopBorder"), new d(5, 4, "SensorLeftBorder"), new d(6, 4, "SensorBottomBorder"), new d(7, 4, "SensorRightBorder"), new d(23, 3, "ISO"), new d(46, 7, "JpgFromRaw"), new d(700, 1, "Xmp")};
        G = new d[][]{dVarArr, new d[]{new d(33434, 5, "ExposureTime"), new d(33437, 5, "FNumber"), new d(34850, 3, "ExposureProgram"), new d(34852, 2, "SpectralSensitivity"), new d(34855, 3, "PhotographicSensitivity"), new d(34856, 7, "OECF"), new d(34864, 3, "SensitivityType"), new d(34865, 4, "StandardOutputSensitivity"), new d(34866, 4, "RecommendedExposureIndex"), new d(34867, 4, "ISOSpeed"), new d(34868, 4, "ISOSpeedLatitudeyyy"), new d(34869, 4, "ISOSpeedLatitudezzz"), new d(36864, 2, "ExifVersion"), new d(36867, 2, "DateTimeOriginal"), new d(36868, 2, "DateTimeDigitized"), new d(36880, 2, "OffsetTime"), new d(36881, 2, "OffsetTimeOriginal"), new d(36882, 2, "OffsetTimeDigitized"), new d(37121, 7, "ComponentsConfiguration"), new d(37122, 5, "CompressedBitsPerPixel"), new d(37377, 10, "ShutterSpeedValue"), new d(37378, 5, "ApertureValue"), new d(37379, 10, "BrightnessValue"), new d(37380, 10, "ExposureBiasValue"), new d(37381, 5, "MaxApertureValue"), new d(37382, 5, "SubjectDistance"), new d(37383, 3, "MeteringMode"), new d(37384, 3, "LightSource"), new d(37385, 3, "Flash"), new d(37386, 5, "FocalLength"), new d(37396, 3, "SubjectArea"), new d(37500, 7, "MakerNote"), new d(37510, 7, "UserComment"), new d(37520, 2, "SubSecTime"), new d(37521, 2, "SubSecTimeOriginal"), new d(37522, 2, "SubSecTimeDigitized"), new d(40960, 7, "FlashpixVersion"), new d(40961, 3, "ColorSpace"), new d(40962, "PixelXDimension"), new d(40963, "PixelYDimension"), new d(40964, 2, "RelatedSoundFile"), new d(40965, 4, "InteroperabilityIFDPointer"), new d(41483, 5, "FlashEnergy"), new d(41484, 7, "SpatialFrequencyResponse"), new d(41486, 5, "FocalPlaneXResolution"), new d(41487, 5, "FocalPlaneYResolution"), new d(41488, 3, "FocalPlaneResolutionUnit"), new d(41492, 3, "SubjectLocation"), new d(41493, 5, "ExposureIndex"), new d(41495, 3, "SensingMethod"), new d(41728, 7, "FileSource"), new d(41729, 7, "SceneType"), new d(41730, 7, "CFAPattern"), new d(41985, 3, "CustomRendered"), new d(41986, 3, "ExposureMode"), new d(41987, 3, "WhiteBalance"), new d(41988, 5, "DigitalZoomRatio"), new d(41989, 3, "FocalLengthIn35mmFilm"), new d(41990, 3, "SceneCaptureType"), new d(41991, 3, "GainControl"), new d(41992, 3, "Contrast"), new d(41993, 3, "Saturation"), new d(41994, 3, "Sharpness"), new d(41995, 7, "DeviceSettingDescription"), new d(41996, 3, "SubjectDistanceRange"), new d(42016, 2, "ImageUniqueID"), new d(42032, 2, "CameraOwnerName"), new d(42033, 2, "BodySerialNumber"), new d(42034, 5, "LensSpecification"), new d(42035, 2, "LensMake"), new d(42036, 2, "LensModel"), new d(42240, 5, "Gamma"), new d(50706, 1, "DNGVersion"), new d(50720, "DefaultCropSize")}, new d[]{new d(0, 1, "GPSVersionID"), new d(1, 2, "GPSLatitudeRef"), new d(2, 5, "GPSLatitude"), new d(3, 2, "GPSLongitudeRef"), new d(4, 5, "GPSLongitude"), new d(5, 1, "GPSAltitudeRef"), new d(6, 5, "GPSAltitude"), new d(7, 5, "GPSTimeStamp"), new d(8, 2, "GPSSatellites"), new d(9, 2, "GPSStatus"), new d(10, 2, "GPSMeasureMode"), new d(11, 5, "GPSDOP"), new d(12, 2, "GPSSpeedRef"), new d(13, 5, "GPSSpeed"), new d(14, 2, "GPSTrackRef"), new d(15, 5, "GPSTrack"), new d(16, 2, "GPSImgDirectionRef"), new d(17, 5, "GPSImgDirection"), new d(18, 2, "GPSMapDatum"), new d(19, 2, "GPSDestLatitudeRef"), new d(20, 5, "GPSDestLatitude"), new d(21, 2, "GPSDestLongitudeRef"), new d(22, 5, "GPSDestLongitude"), new d(23, 2, "GPSDestBearingRef"), new d(24, 5, "GPSDestBearing"), new d(25, 2, "GPSDestDistanceRef"), new d(26, 5, "GPSDestDistance"), new d(27, 7, "GPSProcessingMethod"), new d(28, 7, "GPSAreaInformation"), new d(29, 2, "GPSDateStamp"), new d(30, 3, "GPSDifferential"), new d(31, 5, "GPSHPositioningError")}, new d[]{new d(1, 2, "InteroperabilityIndex")}, new d[]{new d(254, 4, "NewSubfileType"), new d(255, 4, "SubfileType"), new d(256, "ThumbnailImageWidth"), new d(257, "ThumbnailImageLength"), new d(258, 3, "BitsPerSample"), new d(259, 3, "Compression"), new d(262, 3, "PhotometricInterpretation"), new d(270, 2, "ImageDescription"), new d(271, 2, "Make"), new d(272, 2, "Model"), new d(273, "StripOffsets"), new d(274, 3, "ThumbnailOrientation"), new d(277, 3, "SamplesPerPixel"), new d(278, "RowsPerStrip"), new d(279, "StripByteCounts"), new d(282, 5, "XResolution"), new d(283, 5, "YResolution"), new d(284, 3, "PlanarConfiguration"), new d(296, 3, "ResolutionUnit"), new d(301, 3, "TransferFunction"), new d(305, 2, "Software"), new d(306, 2, "DateTime"), new d(315, 2, "Artist"), new d(318, 5, "WhitePoint"), new d(319, 5, "PrimaryChromaticities"), new d(330, 4, "SubIFDPointer"), new d(513, 4, "JPEGInterchangeFormat"), new d(514, 4, "JPEGInterchangeFormatLength"), new d(529, 5, "YCbCrCoefficients"), new d(530, 3, "YCbCrSubSampling"), new d(531, 3, "YCbCrPositioning"), new d(532, 5, "ReferenceBlackWhite"), new d(33432, 2, "Copyright"), new d(34665, 4, "ExifIFDPointer"), new d(34853, 4, "GPSInfoIFDPointer"), new d(50706, 1, "DNGVersion"), new d(50720, "DefaultCropSize")}, dVarArr, new d[]{new d(256, 7, "ThumbnailImage"), new d(8224, 4, "CameraSettingsIFDPointer"), new d(8256, 4, "ImageProcessingIFDPointer")}, new d[]{new d(257, 4, "PreviewImageStart"), new d(258, 4, "PreviewImageLength")}, new d[]{new d(4371, 3, "AspectFrame")}, new d[]{new d(55, 3, "ColorSpace")}};
        Charset forName = Charset.forName("US-ASCII");
        M = forName;
        N = "Exif\u0000\u0000".getBytes(forName);
        O = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        int i3 = 0;
        while (true) {
            d[][] dVarArr2 = G;
            if (i3 < dVarArr2.length) {
                I[i3] = new HashMap();
                J[i3] = new HashMap();
                for (d dVar : dVarArr2[i3]) {
                    I[i3].put(Integer.valueOf(dVar.f3566a), dVar);
                    J[i3].put(dVar.f3567b, dVar);
                }
                i3++;
            } else {
                HashMap hashMap = L;
                d[] dVarArr3 = H;
                hashMap.put(Integer.valueOf(dVarArr3[0].f3566a), 5);
                hashMap.put(Integer.valueOf(dVarArr3[1].f3566a), 1);
                hashMap.put(Integer.valueOf(dVarArr3[2].f3566a), 2);
                hashMap.put(Integer.valueOf(dVarArr3[3].f3566a), 3);
                hashMap.put(Integer.valueOf(dVarArr3[4].f3566a), 7);
                hashMap.put(Integer.valueOf(dVarArr3[5].f3566a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    public f(InputStream inputStream) {
        boolean z5;
        d[][] dVarArr = G;
        this.f3588d = new HashMap[dVarArr.length];
        this.f3589e = new HashSet(dVarArr.length);
        if (inputStream != null) {
            boolean z6 = inputStream instanceof AssetManager.AssetInputStream;
            FileDescriptor fileDescriptor = null;
            boolean z7 = f3572m;
            if (z6) {
                this.f3586b = (AssetManager.AssetInputStream) inputStream;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        Os.lseek(fileInputStream.getFD(), 0, OsConstants.SEEK_CUR);
                        z5 = true;
                    } catch (Exception unused) {
                        if (z7) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                        z5 = false;
                    }
                    if (z5) {
                        this.f3586b = null;
                        fileDescriptor = fileInputStream.getFD();
                    }
                }
                this.f3586b = null;
            }
            this.f3585a = fileDescriptor;
            int i3 = 0;
            while (i3 < dVarArr.length) {
                try {
                    this.f3588d[i3] = new HashMap();
                    i3++;
                } catch (IOException e6) {
                    if (z7) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e6);
                    }
                    a();
                    if (!z7) {
                        return;
                    }
                } catch (Throwable th) {
                    a();
                    if (z7) {
                        r();
                    }
                    throw th;
                }
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f3587c = h(bufferedInputStream);
            b bVar = new b((InputStream) bufferedInputStream);
            switch (this.f3587c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    l(bVar);
                    break;
                case 4:
                    g(bVar, 0, 0);
                    break;
                case 7:
                    i(bVar);
                    break;
                case 9:
                    k(bVar);
                    break;
                case 10:
                    m(bVar);
                    break;
                case 12:
                    f(bVar);
                    break;
                case 13:
                    j(bVar);
                    break;
                case 14:
                    n(bVar);
                    break;
            }
            v(bVar);
            a();
            if (!z7) {
                return;
            }
            r();
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i3 = 0; i3 < bArr.length; i3++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i3])}));
        }
        return sb.toString();
    }

    public static long[] c(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i3 = 0; i3 < iArr.length; i3++) {
                jArr[i3] = (long) iArr[i3];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static ByteOrder s(b bVar) {
        short readShort = bVar.readShort();
        boolean z5 = f3572m;
        if (readShort == 18761) {
            if (z5) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (z5) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    public final void a() {
        String d6 = d("DateTimeOriginal");
        HashMap[] hashMapArr = this.f3588d;
        if (d6 != null && d("DateTime") == null) {
            hashMapArr[0].put("DateTime", c.a(d6));
        }
        if (d("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.b(0, this.f3590f));
        }
        if (d("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.b(0, this.f3590f));
        }
        if (d("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.b(0, this.f3590f));
        }
        if (d("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.b(0, this.f3590f));
        }
    }

    public final String d(String str) {
        String str2;
        c e6 = e(str);
        if (e6 != null) {
            if (!K.contains(str)) {
                return e6.g(this.f3590f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i3 = e6.f3563a;
                if (i3 == 5 || i3 == 10) {
                    e[] eVarArr = (e[]) e6.h(this.f3590f);
                    if (eVarArr == null || eVarArr.length != 3) {
                        str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr);
                    } else {
                        e eVar = eVarArr[0];
                        e eVar2 = eVarArr[1];
                        e eVar3 = eVarArr[2];
                        return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) eVar.f3570a) / ((float) eVar.f3571b))), Integer.valueOf((int) (((float) eVar2.f3570a) / ((float) eVar2.f3571b))), Integer.valueOf((int) (((float) eVar3.f3570a) / ((float) eVar3.f3571b)))});
                    }
                } else {
                    str2 = m.g("GPS Timestamp format is not rational. format=", i3);
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(e6.e(this.f3590f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c e(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f3572m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i3 = 0; i3 < G.length; i3++) {
            c cVar = (c) this.f3588d[i3].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void f(b bVar) {
        String str;
        String str2;
        String str3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new a(bVar));
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            if ("yes".equals(extractMetadata3)) {
                str3 = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str3 = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            HashMap[] hashMapArr = this.f3588d;
            if (str3 != null) {
                hashMapArr[0].put("ImageWidth", c.d(Integer.parseInt(str3), this.f3590f));
            }
            if (str2 != null) {
                hashMapArr[0].put("ImageLength", c.d(Integer.parseInt(str2), this.f3590f));
            }
            if (str != null) {
                int parseInt = Integer.parseInt(str);
                hashMapArr[0].put("Orientation", c.d(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f3590f));
            }
            if (!(extractMetadata == null || extractMetadata2 == null)) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.b((long) parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i3 = parseInt2 + 6;
                        int i6 = parseInt3 - 6;
                        if (Arrays.equals(bArr, N)) {
                            byte[] bArr2 = new byte[i6];
                            if (bVar.read(bArr2) == i6) {
                                this.f3592h = i3;
                                t(bArr2, 0);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            if (f3572m) {
                Log.d("ExifInterface", "Heif meta: " + str3 + "x" + str2 + ", rotation " + str);
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0194 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00e3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(i1.b r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            java.lang.String r4 = "ExifInterface"
            boolean r5 = f3572m
            if (r5 == 0) goto L_0x001f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "getJpegAttributes starting with: "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r4, r6)
        L_0x001f:
            java.nio.ByteOrder r6 = java.nio.ByteOrder.BIG_ENDIAN
            r1.f3560e = r6
            long r6 = (long) r2
            r1.b(r6)
            byte r6 = r17.readByte()
            r7 = -1
            java.lang.String r8 = "Invalid marker: "
            if (r6 != r7) goto L_0x01d7
            r9 = 1
            int r2 = r2 + r9
            byte r10 = r17.readByte()
            r11 = -40
            if (r10 != r11) goto L_0x01bf
            int r2 = r2 + r9
        L_0x003b:
            byte r6 = r17.readByte()
            if (r6 != r7) goto L_0x01a5
            int r2 = r2 + r9
            byte r6 = r17.readByte()
            if (r5 == 0) goto L_0x005f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Found JPEG segment indicator: "
            r8.<init>(r10)
            r10 = r6 & 255(0xff, float:3.57E-43)
            java.lang.String r10 = java.lang.Integer.toHexString(r10)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r4, r8)
        L_0x005f:
            int r2 = r2 + r9
            r8 = -39
            if (r6 == r8) goto L_0x01a0
            r8 = -38
            if (r6 != r8) goto L_0x006a
            goto L_0x01a0
        L_0x006a:
            int r8 = r17.readUnsignedShort()
            r10 = -2
            int r8 = r8 + r10
            int r2 = r2 + 2
            if (r5 == 0) goto L_0x009a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "JPEG segment: "
            r11.<init>(r12)
            r12 = r6 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r12 = " (length: "
            r11.append(r12)
            int r12 = r8 + 2
            r11.append(r12)
            java.lang.String r12 = ")"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.util.Log.d(r4, r11)
        L_0x009a:
            java.lang.String r11 = "Invalid length"
            if (r8 < 0) goto L_0x019a
            r12 = 0
            r13 = -31
            java.util.HashMap[] r14 = r0.f3588d
            if (r6 == r13) goto L_0x0116
            if (r6 == r10) goto L_0x00eb
            switch(r6) {
                case -64: goto L_0x00b4;
                case -63: goto L_0x00b4;
                case -62: goto L_0x00b4;
                case -61: goto L_0x00b4;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            switch(r6) {
                case -59: goto L_0x00b4;
                case -58: goto L_0x00b4;
                case -57: goto L_0x00b4;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            switch(r6) {
                case -55: goto L_0x00b4;
                case -54: goto L_0x00b4;
                case -53: goto L_0x00b4;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            switch(r6) {
                case -51: goto L_0x00b4;
                case -50: goto L_0x00b4;
                case -49: goto L_0x00b4;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            goto L_0x00e0
        L_0x00b4:
            int r6 = r1.skipBytes(r9)
            if (r6 != r9) goto L_0x00e3
            r6 = r14[r3]
            int r10 = r17.readUnsignedShort()
            long r12 = (long) r10
            java.nio.ByteOrder r10 = r0.f3590f
            i1.c r10 = i1.c.b(r12, r10)
            java.lang.String r12 = "ImageLength"
            r6.put(r12, r10)
            r6 = r14[r3]
            int r10 = r17.readUnsignedShort()
            long r12 = (long) r10
            java.nio.ByteOrder r10 = r0.f3590f
            i1.c r10 = i1.c.b(r12, r10)
            java.lang.String r12 = "ImageWidth"
            r6.put(r12, r10)
            int r8 = r8 + -5
        L_0x00e0:
            r13 = r9
            goto L_0x017f
        L_0x00e3:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid SOFx"
            r1.<init>(r2)
            throw r1
        L_0x00eb:
            byte[] r6 = new byte[r8]
            int r10 = r1.read(r6)
            if (r10 != r8) goto L_0x010e
            java.lang.String r8 = "UserComment"
            java.lang.String r10 = r0.d(r8)
            if (r10 != 0) goto L_0x010b
            r10 = r14[r9]
            java.lang.String r13 = new java.lang.String
            java.nio.charset.Charset r14 = M
            r13.<init>(r6, r14)
            i1.c r6 = i1.c.a(r13)
            r10.put(r8, r6)
        L_0x010b:
            r13 = r9
            goto L_0x017e
        L_0x010e:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x0116:
            byte[] r6 = new byte[r8]
            r1.readFully(r6)
            int r10 = r2 + r8
            byte[] r13 = N
            if (r13 != 0) goto L_0x0123
        L_0x0121:
            r7 = r12
            goto L_0x0137
        L_0x0123:
            int r15 = r13.length
            if (r8 >= r15) goto L_0x0127
            goto L_0x0121
        L_0x0127:
            r15 = r12
        L_0x0128:
            int r7 = r13.length
            if (r15 >= r7) goto L_0x0136
            byte r7 = r6[r15]
            byte r9 = r13[r15]
            if (r7 == r9) goto L_0x0132
            goto L_0x0121
        L_0x0132:
            int r15 = r15 + 1
            r9 = 1
            goto L_0x0128
        L_0x0136:
            r7 = 1
        L_0x0137:
            if (r7 == 0) goto L_0x0146
            int r7 = r13.length
            int r2 = r2 + r7
            int r7 = r13.length
            byte[] r6 = java.util.Arrays.copyOfRange(r6, r7, r8)
            r0.f3592h = r2
            r0.t(r6, r3)
            goto L_0x017c
        L_0x0146:
            byte[] r2 = O
            if (r2 != 0) goto L_0x014c
        L_0x014a:
            r7 = r12
            goto L_0x015f
        L_0x014c:
            int r7 = r2.length
            if (r8 >= r7) goto L_0x0150
            goto L_0x014a
        L_0x0150:
            r7 = r12
        L_0x0151:
            int r9 = r2.length
            if (r7 >= r9) goto L_0x015e
            byte r9 = r6[r7]
            byte r13 = r2[r7]
            if (r9 == r13) goto L_0x015b
            goto L_0x014a
        L_0x015b:
            int r7 = r7 + 1
            goto L_0x0151
        L_0x015e:
            r7 = 1
        L_0x015f:
            if (r7 == 0) goto L_0x017c
            int r7 = r2.length
            int r2 = r2.length
            byte[] r2 = java.util.Arrays.copyOfRange(r6, r2, r8)
            java.lang.String r6 = "Xmp"
            java.lang.String r7 = r0.d(r6)
            if (r7 != 0) goto L_0x017c
            r7 = r14[r12]
            i1.c r8 = new i1.c
            int r9 = r2.length
            r13 = 1
            r8.<init>(r2, r13, r9, r12)
            r7.put(r6, r8)
            goto L_0x017d
        L_0x017c:
            r13 = 1
        L_0x017d:
            r2 = r10
        L_0x017e:
            r8 = r12
        L_0x017f:
            if (r8 < 0) goto L_0x0194
            int r6 = r1.skipBytes(r8)
            if (r6 != r8) goto L_0x018c
            int r2 = r2 + r8
            r9 = r13
            r7 = -1
            goto L_0x003b
        L_0x018c:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid JPEG segment"
            r1.<init>(r2)
            throw r1
        L_0x0194:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r11)
            throw r1
        L_0x019a:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r11)
            throw r1
        L_0x01a0:
            java.nio.ByteOrder r2 = r0.f3590f
            r1.f3560e = r2
            return
        L_0x01a5:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid marker:"
            r2.<init>(r3)
            r3 = r6 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01bf:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r8)
            r3 = r6 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01d7:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r8)
            r3 = r6 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.f.g(i1.b, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cf, code lost:
        if (r8 == null) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0143 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8 A[Catch:{ all -> 0x0188 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x010f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0111 A[SYNTHETIC, Splitter:B:99:0x0111] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int h(java.io.BufferedInputStream r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = 5000(0x1388, float:7.006E-42)
            r0.mark(r2)
            byte[] r3 = new byte[r2]
            r0.read(r3)
            r18.reset()
            r4 = 0
            r0 = r4
        L_0x0013:
            byte[] r5 = f3575p
            int r6 = r5.length
            if (r0 >= r6) goto L_0x0023
            byte r6 = r3[r0]
            byte r5 = r5[r0]
            if (r6 == r5) goto L_0x0020
            r0 = r4
            goto L_0x0024
        L_0x0020:
            int r0 = r0 + 1
            goto L_0x0013
        L_0x0023:
            r0 = 1
        L_0x0024:
            r5 = 4
            if (r0 == 0) goto L_0x0028
            return r5
        L_0x0028:
            java.lang.String r0 = "FUJIFILMCCD-RAW"
            java.nio.charset.Charset r6 = java.nio.charset.Charset.defaultCharset()
            byte[] r0 = r0.getBytes(r6)
            r6 = r4
        L_0x0033:
            int r8 = r0.length
            if (r6 >= r8) goto L_0x0041
            byte r8 = r3[r6]
            byte r9 = r0[r6]
            if (r8 == r9) goto L_0x003e
            r0 = r4
            goto L_0x0042
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0033
        L_0x0041:
            r0 = 1
        L_0x0042:
            if (r0 == 0) goto L_0x0047
            r0 = 9
            return r0
        L_0x0047:
            i1.b r8 = new i1.b     // Catch:{ Exception -> 0x00c2, all -> 0x00be }
            r8.<init>((byte[]) r3)     // Catch:{ Exception -> 0x00c2, all -> 0x00be }
            int r0 = r8.readInt()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            long r9 = (long) r0     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            byte[] r0 = new byte[r5]     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r8.read(r0)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            byte[] r11 = f3576q     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            boolean r0 = java.util.Arrays.equals(r0, r11)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r0 != 0) goto L_0x0060
            goto L_0x00d1
        L_0x0060:
            r11 = 1
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r13 = 8
            if (r0 != 0) goto L_0x0074
            long r9 = r8.readLong()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r15 = 16
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
            goto L_0x00d1
        L_0x0074:
            r15 = r13
        L_0x0075:
            long r6 = (long) r2     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x007b
            r9 = r6
        L_0x007b:
            long r9 = r9 - r15
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0081
            goto L_0x00d1
        L_0x0081:
            byte[] r0 = new byte[r5]     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r6 = 0
            r2 = r4
            r13 = r2
        L_0x0087:
            r14 = 4
            long r14 = r9 / r14
            int r14 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x00d1
            int r14 = r8.read(r0)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r14 == r5) goto L_0x0096
            goto L_0x00d1
        L_0x0096:
            int r14 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r14 != 0) goto L_0x009b
            goto L_0x00b7
        L_0x009b:
            byte[] r14 = f3577r     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            boolean r14 = java.util.Arrays.equals(r0, r14)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r14 == 0) goto L_0x00a5
            r2 = 1
            goto L_0x00ae
        L_0x00a5:
            byte[] r14 = f3578s     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            boolean r14 = java.util.Arrays.equals(r0, r14)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r14 == 0) goto L_0x00ae
            r13 = 1
        L_0x00ae:
            if (r2 == 0) goto L_0x00b7
            if (r13 == 0) goto L_0x00b7
            r8.close()
            r0 = 1
            goto L_0x00d5
        L_0x00b7:
            long r6 = r6 + r11
            goto L_0x0087
        L_0x00b9:
            r0 = move-exception
            goto L_0x018b
        L_0x00bc:
            r0 = move-exception
            goto L_0x00c4
        L_0x00be:
            r0 = move-exception
            r6 = 0
            goto L_0x018a
        L_0x00c2:
            r0 = move-exception
            r8 = 0
        L_0x00c4:
            boolean r2 = f3572m     // Catch:{ all -> 0x0188 }
            if (r2 == 0) goto L_0x00cf
            java.lang.String r2 = "ExifInterface"
            java.lang.String r6 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r6, r0)     // Catch:{ all -> 0x0188 }
        L_0x00cf:
            if (r8 == 0) goto L_0x00d4
        L_0x00d1:
            r8.close()
        L_0x00d4:
            r0 = r4
        L_0x00d5:
            if (r0 == 0) goto L_0x00da
            r0 = 12
            return r0
        L_0x00da:
            i1.b r2 = new i1.b     // Catch:{ Exception -> 0x0106, all -> 0x00fe }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x0106, all -> 0x00fe }
            java.nio.ByteOrder r0 = s(r2)     // Catch:{ Exception -> 0x0107, all -> 0x00fb }
            r1.f3590f = r0     // Catch:{ Exception -> 0x0107, all -> 0x00fb }
            r2.f3560e = r0     // Catch:{ Exception -> 0x0107, all -> 0x00fb }
            short r0 = r2.readShort()     // Catch:{ Exception -> 0x0107, all -> 0x00fb }
            r6 = 20306(0x4f52, float:2.8455E-41)
            if (r0 == r6) goto L_0x00f6
            r6 = 21330(0x5352, float:2.989E-41)
            if (r0 != r6) goto L_0x00f4
            goto L_0x00f6
        L_0x00f4:
            r0 = r4
            goto L_0x00f7
        L_0x00f6:
            r0 = 1
        L_0x00f7:
            r2.close()
            goto L_0x010d
        L_0x00fb:
            r0 = move-exception
            r6 = r2
            goto L_0x0100
        L_0x00fe:
            r0 = move-exception
            r6 = 0
        L_0x0100:
            if (r6 == 0) goto L_0x0105
            r6.close()
        L_0x0105:
            throw r0
        L_0x0106:
            r2 = 0
        L_0x0107:
            if (r2 == 0) goto L_0x010c
            r2.close()
        L_0x010c:
            r0 = r4
        L_0x010d:
            if (r0 == 0) goto L_0x0111
            r0 = 7
            return r0
        L_0x0111:
            i1.b r2 = new i1.b     // Catch:{ Exception -> 0x013a, all -> 0x0132 }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x013a, all -> 0x0132 }
            java.nio.ByteOrder r0 = s(r2)     // Catch:{ Exception -> 0x0130, all -> 0x012d }
            r1.f3590f = r0     // Catch:{ Exception -> 0x0130, all -> 0x012d }
            r2.f3560e = r0     // Catch:{ Exception -> 0x0130, all -> 0x012d }
            short r0 = r2.readShort()     // Catch:{ Exception -> 0x0130, all -> 0x012d }
            r6 = 85
            if (r0 != r6) goto L_0x0128
            r0 = 1
            goto L_0x0129
        L_0x0128:
            r0 = r4
        L_0x0129:
            r2.close()
            goto L_0x0141
        L_0x012d:
            r0 = move-exception
            r6 = r2
            goto L_0x0134
        L_0x0130:
            r6 = r2
            goto L_0x013b
        L_0x0132:
            r0 = move-exception
            r6 = 0
        L_0x0134:
            if (r6 == 0) goto L_0x0139
            r6.close()
        L_0x0139:
            throw r0
        L_0x013a:
            r6 = 0
        L_0x013b:
            if (r6 == 0) goto L_0x0140
            r6.close()
        L_0x0140:
            r0 = r4
        L_0x0141:
            if (r0 == 0) goto L_0x0146
            r0 = 10
            return r0
        L_0x0146:
            r0 = r4
        L_0x0147:
            byte[] r2 = f3581v
            int r6 = r2.length
            if (r0 >= r6) goto L_0x0157
            byte r6 = r3[r0]
            byte r2 = r2[r0]
            if (r6 == r2) goto L_0x0154
            r0 = r4
            goto L_0x0158
        L_0x0154:
            int r0 = r0 + 1
            goto L_0x0147
        L_0x0157:
            r0 = 1
        L_0x0158:
            if (r0 == 0) goto L_0x015d
            r0 = 13
            return r0
        L_0x015d:
            r0 = r4
        L_0x015e:
            byte[] r2 = f3584z
            int r6 = r2.length
            if (r0 >= r6) goto L_0x016d
            byte r6 = r3[r0]
            byte r2 = r2[r0]
            if (r6 == r2) goto L_0x016a
            goto L_0x017c
        L_0x016a:
            int r0 = r0 + 1
            goto L_0x015e
        L_0x016d:
            r0 = r4
        L_0x016e:
            byte[] r6 = A
            int r7 = r6.length
            if (r0 >= r7) goto L_0x0181
            int r7 = r2.length
            int r7 = r7 + r0
            int r7 = r7 + r5
            byte r7 = r3[r7]
            byte r6 = r6[r0]
            if (r7 == r6) goto L_0x017e
        L_0x017c:
            r7 = r4
            goto L_0x0182
        L_0x017e:
            int r0 = r0 + 1
            goto L_0x016e
        L_0x0181:
            r7 = 1
        L_0x0182:
            if (r7 == 0) goto L_0x0187
            r0 = 14
            return r0
        L_0x0187:
            return r4
        L_0x0188:
            r0 = move-exception
            r6 = r8
        L_0x018a:
            r8 = r6
        L_0x018b:
            if (r8 == 0) goto L_0x0190
            r8.close()
        L_0x0190:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.f.h(java.io.BufferedInputStream):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(i1.b r7) {
        /*
            r6 = this;
            r6.l(r7)
            java.util.HashMap[] r7 = r6.f3588d
            r0 = 1
            r1 = r7[r0]
            java.lang.String r2 = "MakerNote"
            java.lang.Object r1 = r1.get(r2)
            i1.c r1 = (i1.c) r1
            if (r1 == 0) goto L_0x00da
            i1.b r2 = new i1.b
            byte[] r1 = r1.f3565c
            r2.<init>((byte[]) r1)
            java.nio.ByteOrder r1 = r6.f3590f
            r2.f3560e = r1
            byte[] r1 = f3579t
            int r3 = r1.length
            byte[] r3 = new byte[r3]
            r2.readFully(r3)
            r4 = 0
            r2.b(r4)
            byte[] r4 = f3580u
            int r5 = r4.length
            byte[] r5 = new byte[r5]
            r2.readFully(r5)
            boolean r1 = java.util.Arrays.equals(r3, r1)
            if (r1 == 0) goto L_0x003b
            r3 = 8
            goto L_0x0043
        L_0x003b:
            boolean r1 = java.util.Arrays.equals(r5, r4)
            if (r1 == 0) goto L_0x0046
            r3 = 12
        L_0x0043:
            r2.b(r3)
        L_0x0046:
            r1 = 6
            r6.u(r2, r1)
            r1 = 7
            r2 = r7[r1]
            java.lang.String r3 = "PreviewImageStart"
            java.lang.Object r2 = r2.get(r3)
            i1.c r2 = (i1.c) r2
            r1 = r7[r1]
            java.lang.String r3 = "PreviewImageLength"
            java.lang.Object r1 = r1.get(r3)
            i1.c r1 = (i1.c) r1
            if (r2 == 0) goto L_0x0072
            if (r1 == 0) goto L_0x0072
            r3 = 5
            r4 = r7[r3]
            java.lang.String r5 = "JPEGInterchangeFormat"
            r4.put(r5, r2)
            r2 = r7[r3]
            java.lang.String r3 = "JPEGInterchangeFormatLength"
            r2.put(r3, r1)
        L_0x0072:
            r1 = 8
            r1 = r7[r1]
            java.lang.String r2 = "AspectFrame"
            java.lang.Object r1 = r1.get(r2)
            i1.c r1 = (i1.c) r1
            if (r1 == 0) goto L_0x00da
            java.nio.ByteOrder r2 = r6.f3590f
            java.io.Serializable r1 = r1.h(r2)
            int[] r1 = (int[]) r1
            if (r1 == 0) goto L_0x00c3
            int r2 = r1.length
            r3 = 4
            if (r2 == r3) goto L_0x008f
            goto L_0x00c3
        L_0x008f:
            r2 = 2
            r2 = r1[r2]
            r3 = 0
            r4 = r1[r3]
            if (r2 <= r4) goto L_0x00da
            r5 = 3
            r5 = r1[r5]
            r1 = r1[r0]
            if (r5 <= r1) goto L_0x00da
            int r2 = r2 - r4
            int r2 = r2 + r0
            int r5 = r5 - r1
            int r5 = r5 + r0
            if (r2 >= r5) goto L_0x00a8
            int r2 = r2 + r5
            int r5 = r2 - r5
            int r2 = r2 - r5
        L_0x00a8:
            java.nio.ByteOrder r0 = r6.f3590f
            i1.c r0 = i1.c.d(r2, r0)
            java.nio.ByteOrder r1 = r6.f3590f
            i1.c r1 = i1.c.d(r5, r1)
            r2 = r7[r3]
            java.lang.String r4 = "ImageWidth"
            r2.put(r4, r0)
            r7 = r7[r3]
            java.lang.String r0 = "ImageLength"
            r7.put(r0, r1)
            goto L_0x00da
        L_0x00c3:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid aspect frame values. frame="
            r7.<init>(r0)
            java.lang.String r0 = java.util.Arrays.toString(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r7)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.f.i(i1.b):void");
    }

    public final void j(b bVar) {
        if (f3572m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f3560e = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f3581v;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i3 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i6 = i3 + 4;
                    if (i6 == 16) {
                        if (!Arrays.equals(bArr2, f3582x)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, f3583y)) {
                        if (Arrays.equals(bArr2, w)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f3592h = i6;
                                    t(bArr3, 0);
                                    y();
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                        }
                        int i7 = readInt + 4;
                        bVar.skipBytes(i7);
                        length = i6 + i7;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void k(b bVar) {
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i3 = ByteBuffer.wrap(bArr).getInt();
        int i6 = ByteBuffer.wrap(bArr2).getInt();
        g(bVar, i3, 5);
        bVar.b((long) i6);
        bVar.f3560e = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        boolean z5 = f3572m;
        if (z5) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i7 = 0; i7 < readInt; i7++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == F.f3566a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c d6 = c.d(readShort, this.f3590f);
                c d7 = c.d(readShort2, this.f3590f);
                HashMap[] hashMapArr = this.f3588d;
                hashMapArr[0].put("ImageLength", d6);
                hashMapArr[0].put("ImageWidth", d7);
                if (z5) {
                    Log.d("ExifInterface", "Updated to length: " + readShort + ", width: " + readShort2);
                    return;
                }
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    public final void l(b bVar) {
        q(bVar, bVar.available());
        u(bVar, 0);
        x(bVar, 0);
        x(bVar, 5);
        x(bVar, 4);
        y();
        if (this.f3587c == 8) {
            HashMap[] hashMapArr = this.f3588d;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                b bVar2 = new b(cVar.f3565c);
                bVar2.f3560e = this.f3590f;
                bVar2.b(6);
                u(bVar2, 9);
                c cVar2 = (c) hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void m(b bVar) {
        l(bVar);
        HashMap[] hashMapArr = this.f3588d;
        if (((c) hashMapArr[0].get("JpgFromRaw")) != null) {
            g(bVar, this.f3596l, 5);
        }
        c cVar = (c) hashMapArr[0].get("ISO");
        c cVar2 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar != null && cVar2 == null) {
            hashMapArr[1].put("PhotographicSensitivity", cVar);
        }
    }

    public final void n(b bVar) {
        if (f3572m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f3560e = ByteOrder.LITTLE_ENDIAN;
        bVar.skipBytes(f3584z.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(A.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    int readInt2 = bVar.readInt();
                    int i3 = skipBytes + 4 + 4;
                    if (Arrays.equals(B, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (bVar.read(bArr2) == readInt2) {
                            this.f3592h = i3;
                            t(bArr2, 0);
                            this.f3592h = i3;
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i6 = i3 + readInt2;
                    if (i6 != readInt) {
                        if (i6 <= readInt) {
                            int skipBytes2 = bVar.skipBytes(readInt2);
                            if (skipBytes2 == readInt2) {
                                skipBytes = i3 + skipBytes2;
                            } else {
                                throw new IOException("Encountered WebP file with invalid chunk size");
                            }
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void o(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int f6 = cVar.f(this.f3590f);
            int f7 = cVar2.f(this.f3590f);
            if (this.f3587c == 7) {
                f6 += this.f3593i;
            }
            int min = Math.min(f7, bVar.f3561f - f6);
            if (f6 > 0 && min > 0) {
                int i3 = this.f3592h + f6;
                if (this.f3586b == null && this.f3585a == null) {
                    bVar.b((long) i3);
                    bVar.readFully(new byte[min]);
                }
            }
            if (f3572m) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + f6 + ", length: " + min);
            }
        }
    }

    public final boolean p(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.f(this.f3590f) <= 512 && cVar2.f(this.f3590f) <= 512;
    }

    public final void q(b bVar, int i3) {
        ByteOrder s5 = s(bVar);
        this.f3590f = s5;
        bVar.f3560e = s5;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i6 = this.f3587c;
        if (i6 == 7 || i6 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt < 8 || readInt >= i3) {
                throw new IOException(m.g("Invalid first Ifd offset: ", readInt));
            }
            int i7 = readInt - 8;
            if (i7 > 0 && bVar.skipBytes(i7) != i7) {
                throw new IOException(m.g("Couldn't jump to first Ifd: ", i7));
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    public final void r() {
        int i3 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f3588d;
            if (i3 < hashMapArr.length) {
                Log.d("ExifInterface", "The size of tag group[" + i3 + "]: " + hashMapArr[i3].size());
                for (Map.Entry entry : hashMapArr[i3].entrySet()) {
                    c cVar = (c) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.g(this.f3590f) + "'");
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public final void t(byte[] bArr, int i3) {
        b bVar = new b(bArr);
        q(bVar, bArr.length);
        u(bVar, i3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(i1.b r30, int r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            int r3 = r1.f3562g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.HashSet r4 = r0.f3589e
            r4.add(r3)
            int r3 = r1.f3562g
            r5 = 2
            int r3 = r3 + r5
            int r6 = r1.f3561f
            if (r3 <= r6) goto L_0x001a
            return
        L_0x001a:
            short r3 = r30.readShort()
            boolean r7 = f3572m
            java.lang.String r8 = "ExifInterface"
            if (r7 == 0) goto L_0x0035
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "numberOfDirectoryEntry: "
            r9.<init>(r10)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r8, r9)
        L_0x0035:
            int r9 = r1.f3562g
            int r10 = r3 * 12
            int r10 = r10 + r9
            if (r10 > r6) goto L_0x03e0
            if (r3 > 0) goto L_0x0040
            goto L_0x03e0
        L_0x0040:
            r11 = r1
            r10 = 0
        L_0x0042:
            java.util.HashMap[] r14 = r0.f3588d
            if (r10 >= r3) goto L_0x0371
            int r13 = r30.readUnsignedShort()
            int r5 = r30.readUnsignedShort()
            int r15 = r30.readInt()
            int r9 = r11.f3562g
            r21 = r13
            long r12 = (long) r9
            r22 = 4
            long r12 = r12 + r22
            java.util.HashMap[] r9 = I
            r9 = r9[r2]
            r24 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            java.lang.Object r3 = r9.get(r3)
            i1.d r3 = (i1.d) r3
            if (r7 == 0) goto L_0x00a6
            r9 = 5
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Integer r20 = java.lang.Integer.valueOf(r31)
            r19 = 0
            r9[r19] = r20
            java.lang.Integer r20 = java.lang.Integer.valueOf(r21)
            r18 = 1
            r9[r18] = r20
            r20 = r10
            if (r3 == 0) goto L_0x0087
            java.lang.String r10 = r3.f3567b
            goto L_0x0088
        L_0x0087:
            r10 = 0
        L_0x0088:
            r17 = 2
            r9[r17] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r25 = 3
            r9[r25] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            r16 = 4
            r9[r16] = r10
            java.lang.String r10 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            android.util.Log.d(r8, r9)
            goto L_0x00a8
        L_0x00a6:
            r20 = r10
        L_0x00a8:
            if (r3 != 0) goto L_0x00c8
            if (r7 == 0) goto L_0x00c0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Skip the tag entry since tag number is not defined: "
            r9.<init>(r10)
            r10 = r21
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r8, r9)
            goto L_0x00c2
        L_0x00c0:
            r10 = r21
        L_0x00c2:
            r21 = r4
            r27 = r10
            goto L_0x0169
        L_0x00c8:
            r10 = r21
            if (r5 <= 0) goto L_0x0152
            int[] r9 = D
            r21 = r4
            int r4 = r9.length
            if (r5 < r4) goto L_0x00d5
            goto L_0x0154
        L_0x00d5:
            int r4 = r3.f3568c
            r27 = r10
            r10 = 7
            if (r4 == r10) goto L_0x0107
            if (r5 != r10) goto L_0x00df
            goto L_0x0107
        L_0x00df:
            if (r4 == r5) goto L_0x0107
            int r10 = r3.f3569d
            if (r10 != r5) goto L_0x00e6
            goto L_0x0107
        L_0x00e6:
            r1 = 4
            if (r4 == r1) goto L_0x00eb
            if (r10 != r1) goto L_0x00ef
        L_0x00eb:
            r1 = 3
            if (r5 != r1) goto L_0x00ef
            goto L_0x0107
        L_0x00ef:
            r1 = 9
            if (r4 == r1) goto L_0x00f5
            if (r10 != r1) goto L_0x00fa
        L_0x00f5:
            r1 = 8
            if (r5 != r1) goto L_0x00fa
            goto L_0x0107
        L_0x00fa:
            r1 = 12
            if (r4 == r1) goto L_0x0100
            if (r10 != r1) goto L_0x0105
        L_0x0100:
            r1 = 11
            if (r5 != r1) goto L_0x0105
            goto L_0x0107
        L_0x0105:
            r1 = 0
            goto L_0x0108
        L_0x0107:
            r1 = 1
        L_0x0108:
            if (r1 != 0) goto L_0x0125
            if (r7 == 0) goto L_0x0169
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Skip the tag entry since data format ("
            r1.<init>(r4)
            java.lang.String[] r4 = C
            r4 = r4[r5]
            r1.append(r4)
            java.lang.String r4 = ") is unexpected for tag: "
            r1.append(r4)
            java.lang.String r4 = r3.f3567b
            r1.append(r4)
            goto L_0x0162
        L_0x0125:
            r1 = 7
            if (r5 != r1) goto L_0x0129
            r5 = r4
        L_0x0129:
            long r1 = (long) r15
            r4 = r9[r5]
            long r9 = (long) r4
            long r1 = r1 * r9
            r9 = 0
            int r4 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x013e
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x013c
            goto L_0x013e
        L_0x013c:
            r4 = 1
            goto L_0x016c
        L_0x013e:
            if (r7 == 0) goto L_0x016b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r9 = "Skip the tag entry since the number of components is invalid: "
            r4.<init>(r9)
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r8, r4)
            goto L_0x016b
        L_0x0152:
            r21 = r4
        L_0x0154:
            r27 = r10
            if (r7 == 0) goto L_0x0169
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Skip the tag entry since data format is invalid: "
            r1.<init>(r2)
            r1.append(r5)
        L_0x0162:
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r8, r1)
        L_0x0169:
            r1 = 0
        L_0x016b:
            r4 = 0
        L_0x016c:
            if (r4 != 0) goto L_0x0177
            r11.b(r12)
            r12 = r30
            r13 = r21
            goto L_0x0365
        L_0x0177:
            int r4 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            java.lang.String r9 = "Compression"
            if (r4 <= 0) goto L_0x0231
            int r4 = r30.readInt()
            if (r7 == 0) goto L_0x0194
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "seek to data offset: "
            r10.<init>(r11)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r8, r10)
        L_0x0194:
            int r10 = r0.f3587c
            r11 = 7
            if (r10 != r11) goto L_0x01f0
            java.lang.String r10 = r3.f3567b
            java.lang.String r11 = "MakerNote"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x01a6
            r0.f3593i = r4
            goto L_0x01eb
        L_0x01a6:
            r10 = 6
            r11 = r31
            if (r11 != r10) goto L_0x01eb
            java.lang.String r10 = "ThumbnailImage"
            java.lang.String r11 = r3.f3567b
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x01eb
            r0.f3594j = r4
            r0.f3595k = r15
            java.nio.ByteOrder r10 = r0.f3590f
            r11 = 6
            i1.c r10 = i1.c.d(r11, r10)
            int r11 = r0.f3594j
            r22 = r12
            long r11 = (long) r11
            java.nio.ByteOrder r13 = r0.f3590f
            i1.c r11 = i1.c.b(r11, r13)
            int r12 = r0.f3595k
            long r12 = (long) r12
            r26 = r15
            java.nio.ByteOrder r15 = r0.f3590f
            i1.c r12 = i1.c.b(r12, r15)
            r13 = 4
            r15 = r14[r13]
            r15.put(r9, r10)
            r10 = r14[r13]
            java.lang.String r15 = "JPEGInterchangeFormat"
            r10.put(r15, r11)
            r10 = r14[r13]
            java.lang.String r11 = "JPEGInterchangeFormatLength"
            r10.put(r11, r12)
            goto L_0x0204
        L_0x01eb:
            r22 = r12
            r26 = r15
            goto L_0x0204
        L_0x01f0:
            r22 = r12
            r26 = r15
            r11 = 10
            if (r10 != r11) goto L_0x0204
            java.lang.String r10 = "JpgFromRaw"
            java.lang.String r11 = r3.f3567b
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0204
            r0.f3596l = r4
        L_0x0204:
            long r10 = (long) r4
            long r12 = r10 + r1
            r28 = r14
            long r14 = (long) r6
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 > 0) goto L_0x0215
            r12 = r30
            r12.b(r10)
            r11 = r12
            goto L_0x0239
        L_0x0215:
            r12 = r30
            if (r7 == 0) goto L_0x022a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Skip the tag entry since data offset is invalid: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r8, r1)
        L_0x022a:
            r11 = r12
            r13 = r21
        L_0x022d:
            r14 = r22
            goto L_0x0362
        L_0x0231:
            r22 = r12
            r28 = r14
            r26 = r15
            r12 = r30
        L_0x0239:
            java.util.HashMap r4 = L
            java.lang.Integer r10 = java.lang.Integer.valueOf(r27)
            java.lang.Object r4 = r4.get(r10)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r7 == 0) goto L_0x0260
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r13 = "nextIfdType: "
            r10.<init>(r13)
            r10.append(r4)
            java.lang.String r13 = " byteCount: "
            r10.append(r13)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r8, r10)
        L_0x0260:
            if (r4 == 0) goto L_0x0301
            r10 = 3
            if (r5 == r10) goto L_0x028d
            r1 = 4
            if (r5 == r1) goto L_0x0281
            r1 = 8
            if (r5 == r1) goto L_0x027c
            r1 = 9
            if (r5 == r1) goto L_0x0277
            r1 = 13
            if (r5 == r1) goto L_0x0277
            r1 = -1
            goto L_0x0292
        L_0x0277:
            int r1 = r30.readInt()
            goto L_0x0291
        L_0x027c:
            short r1 = r30.readShort()
            goto L_0x0291
        L_0x0281:
            int r1 = r30.readInt()
            long r1 = (long) r1
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r9
            goto L_0x0292
        L_0x028d:
            int r1 = r30.readUnsignedShort()
        L_0x0291:
            long r1 = (long) r1
        L_0x0292:
            r10 = 2
            if (r7 == 0) goto L_0x02ac
            java.lang.Object[] r5 = new java.lang.Object[r10]
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            r13 = 0
            r5[r13] = r9
            java.lang.String r3 = r3.f3567b
            r9 = 1
            r5[r9] = r3
            java.lang.String r3 = "Offset: %d, tagName: %s"
            java.lang.String r3 = java.lang.String.format(r3, r5)
            android.util.Log.d(r8, r3)
        L_0x02ac:
            r13 = 0
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x02ea
            long r13 = (long) r6
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x02ea
            int r3 = (int) r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r13 = r21
            boolean r3 = r13.contains(r3)
            if (r3 != 0) goto L_0x02d0
            r11.b(r1)
            int r1 = r4.intValue()
            r0.u(r11, r1)
            goto L_0x022d
        L_0x02d0:
            if (r7 == 0) goto L_0x022d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Skip jump into the IFD since it has already been read: IfdType "
            r3.<init>(r5)
            r3.append(r4)
            java.lang.String r4 = " (at "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ")"
            r3.append(r1)
            goto L_0x02f8
        L_0x02ea:
            r13 = r21
            if (r7 == 0) goto L_0x022d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Skip jump into the IFD since its offset is invalid: "
            r3.<init>(r4)
            r3.append(r1)
        L_0x02f8:
            java.lang.String r1 = r3.toString()
            android.util.Log.d(r8, r1)
            goto L_0x022d
        L_0x0301:
            r13 = r21
            r14 = r22
            r10 = 2
            int r1 = (int) r1
            byte[] r1 = new byte[r1]
            r11.readFully(r1)
            i1.c r2 = new i1.c
            r4 = r26
            r10 = 0
            r2.<init>(r1, r5, r4, r10)
            r1 = r28[r31]
            java.lang.String r4 = r3.f3567b
            r1.put(r4, r2)
            java.lang.String r1 = "DNGVersion"
            java.lang.String r3 = r3.f3567b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0328
            r1 = 3
            r0.f3587c = r1
        L_0x0328:
            java.lang.String r1 = "Make"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0338
            java.lang.String r1 = "Model"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0346
        L_0x0338:
            java.nio.ByteOrder r1 = r0.f3590f
            java.lang.String r1 = r2.g(r1)
            java.lang.String r4 = "PENTAX"
            boolean r1 = r1.contains(r4)
            if (r1 != 0) goto L_0x0357
        L_0x0346:
            boolean r1 = r9.equals(r3)
            if (r1 == 0) goto L_0x035b
            java.nio.ByteOrder r1 = r0.f3590f
            int r1 = r2.f(r1)
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r1 != r2) goto L_0x035b
        L_0x0357:
            r1 = 8
            r0.f3587c = r1
        L_0x035b:
            int r1 = r11.f3562g
            long r1 = (long) r1
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0365
        L_0x0362:
            r11.b(r14)
        L_0x0365:
            int r10 = r20 + 1
            short r10 = (short) r10
            r2 = r31
            r1 = r12
            r4 = r13
            r3 = r24
            r5 = 2
            goto L_0x0042
        L_0x0371:
            r12 = r1
            r13 = r4
            r28 = r14
            int r1 = r11.f3562g
            r2 = 4
            int r1 = r1 + r2
            if (r1 > r6) goto L_0x03e0
            int r1 = r30.readInt()
            if (r7 == 0) goto L_0x0394
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "nextIfdOffset: %d"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            android.util.Log.d(r8, r2)
        L_0x0394:
            long r2 = (long) r1
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x03cd
            if (r1 >= r6) goto L_0x03cd
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            boolean r4 = r13.contains(r4)
            if (r4 != 0) goto L_0x03c3
            r11.b(r2)
            r1 = 4
            r2 = r28[r1]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x03b5
        L_0x03b3:
            r12 = r1
            goto L_0x03bf
        L_0x03b5:
            r1 = 5
            r2 = r28[r1]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x03e0
            goto L_0x03b3
        L_0x03bf:
            r0.u(r11, r12)
            goto L_0x03e0
        L_0x03c3:
            if (r7 == 0) goto L_0x03e0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r2.<init>(r3)
            goto L_0x03d6
        L_0x03cd:
            if (r7 == 0) goto L_0x03e0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r2.<init>(r3)
        L_0x03d6:
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.d(r8, r1)
        L_0x03e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.f.u(i1.b, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(i1.b r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.HashMap[] r2 = r0.f3588d
            r3 = 4
            r2 = r2[r3]
            java.lang.String r3 = "Compression"
            java.lang.Object r3 = r2.get(r3)
            i1.c r3 = (i1.c) r3
            if (r3 == 0) goto L_0x010a
            java.nio.ByteOrder r4 = r0.f3590f
            int r3 = r3.f(r4)
            r4 = 1
            r5 = 6
            if (r3 == r4) goto L_0x0024
            if (r3 == r5) goto L_0x010a
            r6 = 7
            if (r3 == r6) goto L_0x0024
            goto L_0x010d
        L_0x0024:
            java.lang.String r3 = "BitsPerSample"
            java.lang.Object r3 = r2.get(r3)
            i1.c r3 = (i1.c) r3
            java.lang.String r6 = "ExifInterface"
            r7 = 0
            if (r3 == 0) goto L_0x006b
            java.nio.ByteOrder r8 = r0.f3590f
            java.io.Serializable r3 = r3.h(r8)
            int[] r3 = (int[]) r3
            int[] r8 = f3573n
            boolean r9 = java.util.Arrays.equals(r8, r3)
            if (r9 == 0) goto L_0x0042
            goto L_0x0069
        L_0x0042:
            int r9 = r0.f3587c
            r10 = 3
            if (r9 != r10) goto L_0x006b
            java.lang.String r9 = "PhotometricInterpretation"
            java.lang.Object r9 = r2.get(r9)
            i1.c r9 = (i1.c) r9
            if (r9 == 0) goto L_0x006b
            java.nio.ByteOrder r10 = r0.f3590f
            int r9 = r9.f(r10)
            if (r9 != r4) goto L_0x0061
            int[] r10 = f3574o
            boolean r10 = java.util.Arrays.equals(r3, r10)
            if (r10 != 0) goto L_0x0069
        L_0x0061:
            if (r9 != r5) goto L_0x006b
            boolean r3 = java.util.Arrays.equals(r3, r8)
            if (r3 == 0) goto L_0x006b
        L_0x0069:
            r3 = r4
            goto L_0x0075
        L_0x006b:
            boolean r3 = f3572m
            if (r3 == 0) goto L_0x0074
            java.lang.String r3 = "Unsupported data type value"
            android.util.Log.d(r6, r3)
        L_0x0074:
            r3 = r7
        L_0x0075:
            if (r3 == 0) goto L_0x010d
            java.lang.String r3 = "StripOffsets"
            java.lang.Object r3 = r2.get(r3)
            i1.c r3 = (i1.c) r3
            java.lang.String r5 = "StripByteCounts"
            java.lang.Object r2 = r2.get(r5)
            i1.c r2 = (i1.c) r2
            if (r3 == 0) goto L_0x010d
            if (r2 == 0) goto L_0x010d
            java.nio.ByteOrder r5 = r0.f3590f
            java.io.Serializable r3 = r3.h(r5)
            long[] r3 = c(r3)
            java.nio.ByteOrder r5 = r0.f3590f
            java.io.Serializable r2 = r2.h(r5)
            long[] r2 = c(r2)
            if (r3 == 0) goto L_0x0104
            int r5 = r3.length
            if (r5 != 0) goto L_0x00a5
            goto L_0x0104
        L_0x00a5:
            if (r2 == 0) goto L_0x0101
            int r5 = r2.length
            if (r5 != 0) goto L_0x00ab
            goto L_0x0101
        L_0x00ab:
            int r5 = r3.length
            int r8 = r2.length
            if (r5 == r8) goto L_0x00b2
            java.lang.String r1 = "stripOffsets and stripByteCounts should have same length."
            goto L_0x0106
        L_0x00b2:
            int r5 = r2.length
            r8 = 0
            r10 = r7
        L_0x00b6:
            if (r10 >= r5) goto L_0x00be
            r11 = r2[r10]
            long r8 = r8 + r11
            int r10 = r10 + 1
            goto L_0x00b6
        L_0x00be:
            int r5 = (int) r8
            byte[] r5 = new byte[r5]
            r0.f3591g = r4
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x00c6:
            int r11 = r3.length
            if (r8 >= r11) goto L_0x00fa
            r11 = r3[r8]
            int r11 = (int) r11
            r12 = r2[r8]
            int r12 = (int) r12
            int r13 = r3.length
            int r13 = r13 - r4
            if (r8 >= r13) goto L_0x00e0
            int r13 = r11 + r12
            long r13 = (long) r13
            int r15 = r8 + 1
            r15 = r3[r15]
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L_0x00e0
            r0.f3591g = r7
        L_0x00e0:
            int r11 = r11 - r9
            if (r11 >= 0) goto L_0x00e8
            java.lang.String r13 = "Invalid strip offset value"
            android.util.Log.d(r6, r13)
        L_0x00e8:
            long r13 = (long) r11
            r1.b(r13)
            int r9 = r9 + r11
            byte[] r11 = new byte[r12]
            r1.read(r11)
            int r9 = r9 + r12
            java.lang.System.arraycopy(r11, r7, r5, r10, r12)
            int r10 = r10 + r12
            int r8 = r8 + 1
            goto L_0x00c6
        L_0x00fa:
            boolean r1 = r0.f3591g
            if (r1 == 0) goto L_0x010d
            r1 = r3[r7]
            goto L_0x010d
        L_0x0101:
            java.lang.String r1 = "stripByteCounts should not be null or have zero length."
            goto L_0x0106
        L_0x0104:
            java.lang.String r1 = "stripOffsets should not be null or have zero length."
        L_0x0106:
            android.util.Log.w(r6, r1)
            goto L_0x010d
        L_0x010a:
            r0.o(r1, r2)
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.f.v(i1.b):void");
    }

    public final void w(int i3, int i6) {
        String str;
        HashMap[] hashMapArr = this.f3588d;
        boolean isEmpty = hashMapArr[i3].isEmpty();
        boolean z5 = f3572m;
        if (!isEmpty && !hashMapArr[i6].isEmpty()) {
            c cVar = (c) hashMapArr[i3].get("ImageLength");
            c cVar2 = (c) hashMapArr[i3].get("ImageWidth");
            c cVar3 = (c) hashMapArr[i6].get("ImageLength");
            c cVar4 = (c) hashMapArr[i6].get("ImageWidth");
            if (cVar == null || cVar2 == null) {
                if (z5) {
                    str = "First image does not contain valid size information";
                } else {
                    return;
                }
            } else if (cVar3 != null && cVar4 != null) {
                int f6 = cVar.f(this.f3590f);
                int f7 = cVar2.f(this.f3590f);
                int f8 = cVar3.f(this.f3590f);
                int f9 = cVar4.f(this.f3590f);
                if (f6 < f8 && f7 < f9) {
                    HashMap hashMap = hashMapArr[i3];
                    hashMapArr[i3] = hashMapArr[i6];
                    hashMapArr[i6] = hashMap;
                    return;
                }
                return;
            } else if (z5) {
                str = "Second image does not contain valid size information";
            } else {
                return;
            }
            Log.d("ExifInterface", str);
        } else if (z5) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void x(b bVar, int i3) {
        c cVar;
        StringBuilder sb;
        String str;
        c cVar2;
        c cVar3;
        HashMap[] hashMapArr = this.f3588d;
        c cVar4 = (c) hashMapArr[i3].get("DefaultCropSize");
        c cVar5 = (c) hashMapArr[i3].get("SensorTopBorder");
        c cVar6 = (c) hashMapArr[i3].get("SensorLeftBorder");
        c cVar7 = (c) hashMapArr[i3].get("SensorBottomBorder");
        c cVar8 = (c) hashMapArr[i3].get("SensorRightBorder");
        if (cVar4 != null) {
            if (cVar4.f3563a == 5) {
                e[] eVarArr = (e[]) cVar4.h(this.f3590f);
                if (eVarArr == null || eVarArr.length != 2) {
                    sb = new StringBuilder("Invalid crop size values. cropSize=");
                    str = Arrays.toString(eVarArr);
                    sb.append(str);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                cVar3 = c.c(eVarArr[0], this.f3590f);
                cVar2 = c.c(eVarArr[1], this.f3590f);
            } else {
                int[] iArr = (int[]) cVar4.h(this.f3590f);
                if (iArr == null || iArr.length != 2) {
                    sb = new StringBuilder("Invalid crop size values. cropSize=");
                    str = Arrays.toString(iArr);
                    sb.append(str);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                cVar3 = c.d(iArr[0], this.f3590f);
                cVar2 = c.d(iArr[1], this.f3590f);
            }
            hashMapArr[i3].put("ImageWidth", cVar3);
            hashMapArr[i3].put("ImageLength", cVar2);
        } else if (cVar5 == null || cVar6 == null || cVar7 == null || cVar8 == null) {
            c cVar9 = (c) hashMapArr[i3].get("ImageLength");
            c cVar10 = (c) hashMapArr[i3].get("ImageWidth");
            if ((cVar9 == null || cVar10 == null) && (cVar = (c) hashMapArr[i3].get("JPEGInterchangeFormat")) != null) {
                g(bVar, cVar.f(this.f3590f), i3);
            }
        } else {
            int f6 = cVar5.f(this.f3590f);
            int f7 = cVar7.f(this.f3590f);
            int f8 = cVar8.f(this.f3590f);
            int f9 = cVar6.f(this.f3590f);
            if (f7 > f6 && f8 > f9) {
                c d6 = c.d(f7 - f6, this.f3590f);
                c d7 = c.d(f8 - f9, this.f3590f);
                hashMapArr[i3].put("ImageLength", d6);
                hashMapArr[i3].put("ImageWidth", d7);
            }
        }
    }

    public final void y() {
        w(0, 5);
        w(0, 4);
        w(5, 4);
        HashMap[] hashMapArr = this.f3588d;
        c cVar = (c) hashMapArr[1].get("PixelXDimension");
        c cVar2 = (c) hashMapArr[1].get("PixelYDimension");
        if (!(cVar == null || cVar2 == null)) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && p(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!p(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }
}
