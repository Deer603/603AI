package androidx.webkit.internal;

import java.net.URLConnection;

/* JADX INFO: loaded from: classes4.dex */
class MimeUtil {
    MimeUtil() {
    }

    public static String getMimeFromFileName(String fileName) {
        if (fileName != null) goto L5;
        return null;
    L5:
        String mimeType = URLConnection.guessContentTypeFromName(fileName);
        if (mimeType == null) goto L9;
        return mimeType;
    L9:
        return guessHardcodedMime(fileName);
    }

    private static String guessHardcodedMime(String fileName) {
        byte r0 = 46;
        int finalFullStop = fileName.lastIndexOf(46);
        if (finalFullStop != (-1)) goto L5;
        return null;
    L5:
        String extension = fileName.substring(finalFullStop + 1).toLowerCase();
        switch(extension.hashCode()) {
            case 3315: goto L156;
            case 3401: goto L153;
            case 97669: goto L150;
            case 98819: goto L147;
            case 102340: goto L144;
            case 103649: goto L141;
            case 104085: goto L138;
            case 105441: goto L135;
            case 106458: goto L132;
            case 106479: goto L129;
            case 108089: goto L126;
            case 108150: goto L123;
            case 108272: goto L120;
            case 108273: goto L117;
            case 108324: goto L114;
            case 109961: goto L111;
            case 109967: goto L108;
            case 109973: goto L105;
            case 109982: goto L102;
            case 110834: goto L99;
            case 111030: goto L96;
            case 111145: goto L93;
            case 114276: goto L90;
            case 114791: goto L87;
            case 114833: goto L84;
            case 117484: goto L81;
            case 118660: goto L78;
            case 118807: goto L75;
            case 120609: goto L72;
            case 3000872: goto L69;
            case 3145576: goto L66;
            case 3213227: goto L63;
            case 3259225: goto L60;
            case 3268712: goto L57;
            case 3271912: goto L54;
            case 3358085: goto L51;
            case 3418175: goto L48;
            case 3529614: goto L45;
            case 3542678: goto L42;
            case 3559925: goto L39;
            case 3642020: goto L36;
            case 3645337: goto L33;
            case 3645340: goto L30;
            case 3655064: goto L27;
            case 3678569: goto L24;
            case 96488848: goto L21;
            case 103877016: goto L18;
            case 106703064: goto L15;
            case 109418142: goto L12;
            case 114035747: goto L9;
            default: goto L158;
        };
    L158:
        r0 = -1;
    L159:
        switch(r0) {
            case 0: goto L219;
            case 1: goto L217;
            case 2: goto L217;
            case 3: goto L215;
            case 4: goto L213;
            case 5: goto L211;
            case 6: goto L211;
            case 7: goto L211;
            case 8: goto L209;
            case 9: goto L207;
            case 10: goto L207;
            case 11: goto L207;
            case 12: goto L205;
            case 13: goto L203;
            case 14: goto L201;
            case 15: goto L199;
            case 16: goto L199;
            case 17: goto L199;
            case 18: goto L199;
            case 19: goto L199;
            case 20: goto L197;
            case 21: goto L195;
            case 22: goto L193;
            case 23: goto L193;
            case 24: goto L191;
            case 25: goto L189;
            case 26: goto L189;
            case 27: goto L187;
            case 28: goto L185;
            case 29: goto L185;
            case 30: goto L185;
            case 31: goto L185;
            case 32: goto L185;
            case 33: goto L183;
            case 34: goto L183;
            case 35: goto L181;
            case 36: goto L179;
            case 37: goto L179;
            case 38: goto L177;
            case 39: goto L177;
            case 40: goto L175;
            case 41: goto L173;
            case 42: goto L171;
            case 43: goto L171;
            case 44: goto L169;
            case 45: goto L167;
            case 46: goto L165;
            case 47: goto L163;
            case 48: goto L161;
            case 49: goto L161;
            default: goto L160;
        };
    L160:
        return null;
    L161:
        return "image/tiff";
    L163:
        return "image/bmp";
    L165:
        return "application/zip";
    L167:
        return "application/pdf";
    L169:
        return "application/json";
    L171:
        return "application/gzip";
    L173:
        return "application/font-woff";
    L175:
        return "image/x-icon";
    L177:
        return "video/ogg";
    L179:
        return "video/mp4";
    L181:
        return "text/xml";
    L183:
        return "text/javascript";
    L185:
        return "text/html";
    L187:
        return "text/css";
    L189:
        return "multipart/related";
    L191:
        return "image/webp";
    L193:
        return "image/svg+xml";
    L195:
        return "image/apng";
    L197:
        return "image/png";
    L199:
        return "image/jpeg";
    L201:
        return "image/gif";
    L203:
        return "audio/x-m4a";
    L205:
        return "audio/wav";
    L207:
        return "audio/ogg";
    L209:
        return "audio/flac";
    L211:
        return "application/xhtml+xml";
    L213:
        return "application/wasm";
    L215:
        return "audio/mpeg";
    L217:
        return "video/mpeg";
    L219:
        return "video/webm";
    L9:
        if (extension.equals("xhtml") == false) goto L221;
        r0 = 5;
        goto L159
    L221:
        r0 = -1;
        goto L159
    L12:
        if (extension.equals("shtml") == false) goto L222;
        r0 = 30;
        goto L159
    L222:
        r0 = -1;
        goto L159
    L15:
        if (extension.equals("pjpeg") == false) goto L223;
        r0 = 18;
        goto L159
    L223:
        r0 = -1;
        goto L159
    L18:
        if (extension.equals("mhtml") == false) goto L224;
        r0 = 26;
        goto L159
    L224:
        r0 = -1;
        goto L159
    L21:
        if (extension.equals("ehtml") == false) goto L225;
        r0 = 32;
        goto L159
    L225:
        r0 = -1;
        goto L159
    L24:
        if (extension.equals("xhtm") == false) goto L226;
        r0 = 7;
        goto L159
    L226:
        r0 = -1;
        goto L159
    L27:
        if (extension.equals("woff") == false) goto L227;
        r0 = 41;
        goto L159
    L227:
        r0 = -1;
        goto L159
    L30:
        if (extension.equals("webp") == false) goto L228;
        r0 = 24;
        goto L159
    L228:
        r0 = -1;
        goto L159
    L33:
        if (extension.equals("webm") == false) goto L229;
        r0 = 0;
        goto L159
    L229:
        r0 = -1;
        goto L159
    L36:
        if (extension.equals("wasm") == false) goto L230;
        r0 = 4;
        goto L159
    L230:
        r0 = -1;
        goto L159
    L39:
        if (extension.equals("tiff") == false) goto L231;
        r0 = 48;
        goto L159
    L231:
        r0 = -1;
        goto L159
    L42:
        if (extension.equals("svgz") == false) goto L232;
        r0 = 23;
        goto L159
    L232:
        r0 = -1;
        goto L159
    L45:
        if (extension.equals("shtm") == false) goto L233;
        r0 = 31;
        goto L159
    L233:
        r0 = -1;
        goto L159
    L48:
        if (extension.equals("opus") == false) goto L234;
        r0 = 11;
        goto L159
    L234:
        r0 = -1;
        goto L159
    L51:
        if (extension.equals("mpeg") == false) goto L235;
        r0 = 1;
        goto L159
    L235:
        r0 = -1;
        goto L159
    L54:
        if (extension.equals("json") == false) goto L236;
        r0 = 44;
        goto L159
    L236:
        r0 = -1;
        goto L159
    L57:
        if (extension.equals("jpeg") == false) goto L237;
        r0 = 15;
        goto L159
    L237:
        r0 = -1;
        goto L159
    L60:
        if (extension.equals("jfif") == false) goto L238;
        r0 = 17;
        goto L159
    L238:
        r0 = -1;
        goto L159
    L63:
        if (extension.equals("html") == false) goto L239;
        r0 = 28;
        goto L159
    L239:
        r0 = -1;
        goto L159
    L66:
        if (extension.equals("flac") == false) goto L240;
        r0 = 8;
        goto L159
    L240:
        r0 = -1;
        goto L159
    L69:
        if (extension.equals("apng") == false) goto L241;
        r0 = 21;
        goto L159
    L241:
        r0 = -1;
        goto L159
    L72:
        if (extension.equals("zip") == true) goto L159;
        r0 = -1;
        goto L159
    L75:
        if (extension.equals("xml") == false) goto L243;
        r0 = 35;
        goto L159
    L243:
        r0 = -1;
        goto L159
    L78:
        if (extension.equals("xht") == false) goto L244;
        r0 = 6;
        goto L159
    L244:
        r0 = -1;
        goto L159
    L81:
        if (extension.equals("wav") == false) goto L245;
        r0 = 12;
        goto L159
    L245:
        r0 = -1;
        goto L159
    L84:
        if (extension.equals("tif") == false) goto L246;
        r0 = 49;
        goto L159
    L246:
        r0 = -1;
        goto L159
    L87:
        if (extension.equals("tgz") == false) goto L247;
        r0 = 43;
        goto L159
    L247:
        r0 = -1;
        goto L159
    L90:
        if (extension.equals("svg") == false) goto L248;
        r0 = 22;
        goto L159
    L248:
        r0 = -1;
        goto L159
    L93:
        if (extension.equals("png") == false) goto L249;
        r0 = 20;
        goto L159
    L249:
        r0 = -1;
        goto L159
    L96:
        if (extension.equals("pjp") == false) goto L250;
        r0 = 19;
        goto L159
    L250:
        r0 = -1;
        goto L159
    L99:
        if (extension.equals("pdf") == false) goto L251;
        r0 = 45;
        goto L159
    L251:
        r0 = -1;
        goto L159
    L102:
        if (extension.equals("ogv") == false) goto L252;
        r0 = 38;
        goto L159
    L252:
        r0 = -1;
        goto L159
    L105:
        if (extension.equals("ogm") == false) goto L253;
        r0 = 39;
        goto L159
    L253:
        r0 = -1;
        goto L159
    L108:
        if (extension.equals("ogg") == false) goto L254;
        r0 = 9;
        goto L159
    L254:
        r0 = -1;
        goto L159
    L111:
        if (extension.equals("oga") == false) goto L255;
        r0 = 10;
        goto L159
    L255:
        r0 = -1;
        goto L159
    L114:
        if (extension.equals("mpg") == false) goto L256;
        r0 = 2;
        goto L159
    L256:
        r0 = -1;
        goto L159
    L117:
        if (extension.equals("mp4") == false) goto L257;
        r0 = 36;
        goto L159
    L257:
        r0 = -1;
        goto L159
    L120:
        if (extension.equals("mp3") == false) goto L258;
        r0 = 3;
        goto L159
    L258:
        r0 = -1;
        goto L159
    L123:
        if (extension.equals("mjs") == false) goto L259;
        r0 = 34;
        goto L159
    L259:
        r0 = -1;
        goto L159
    L126:
        if (extension.equals("mht") == false) goto L260;
        r0 = 25;
        goto L159
    L260:
        r0 = -1;
        goto L159
    L129:
        if (extension.equals("m4v") == false) goto L261;
        r0 = 37;
        goto L159
    L261:
        r0 = -1;
        goto L159
    L132:
        if (extension.equals("m4a") == false) goto L262;
        r0 = 13;
        goto L159
    L262:
        r0 = -1;
        goto L159
    L135:
        if (extension.equals("jpg") == false) goto L263;
        r0 = 16;
        goto L159
    L263:
        r0 = -1;
        goto L159
    L138:
        if (extension.equals("ico") == false) goto L264;
        r0 = 40;
        goto L159
    L264:
        r0 = -1;
        goto L159
    L141:
        if (extension.equals("htm") == false) goto L265;
        r0 = 29;
        goto L159
    L265:
        r0 = -1;
        goto L159
    L144:
        if (extension.equals("gif") == false) goto L266;
        r0 = 14;
        goto L159
    L266:
        r0 = -1;
        goto L159
    L147:
        if (extension.equals("css") == false) goto L267;
        r0 = 27;
        goto L159
    L267:
        r0 = -1;
        goto L159
    L150:
        if (extension.equals("bmp") == false) goto L268;
        r0 = 47;
        goto L159
    L268:
        r0 = -1;
        goto L159
    L153:
        if (extension.equals("js") == false) goto L269;
        r0 = 33;
        goto L159
    L269:
        r0 = -1;
        goto L159
    L156:
        if (extension.equals("gz") == false) goto L270;
        r0 = 42;
        goto L159
    L270:
        r0 = -1;
        goto L159
    }
}
