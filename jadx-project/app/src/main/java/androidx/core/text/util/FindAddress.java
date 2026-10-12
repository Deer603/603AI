package androidx.core.text.util;

import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
class FindAddress {
    private static final String HOUSE_COMPONENT = "(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)";
    private static final String HOUSE_END = "(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";
    private static final String HOUSE_POST_DELIM = ",\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final String HOUSE_PRE_DELIM = ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final int MAX_ADDRESS_LINES = 5;
    private static final int MAX_ADDRESS_WORDS = 14;
    private static final int MAX_LOCATION_NAME_DISTANCE = 5;
    private static final int MIN_ADDRESS_WORDS = 4;
    private static final String NL = "\n\u000b\f\r\u0085\u2028\u2029";
    private static final String SP = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000";
    private static final String WORD_DELIM = ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final String WORD_END = "(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";
    private static final String WS = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final int kMaxAddressNameWordLength = 25;
    private static final Pattern sHouseNumberRe = null;
    private static final Pattern sLocationNameRe = null;
    private static final Pattern sStateRe = null;
    private static final ZipRange[] sStateZipCodeRanges = null;
    private static final Pattern sSuffixedNumberRe = null;
    private static final Pattern sWordRe = null;
    private static final Pattern sZipCodeRe = null;

    private static class ZipRange {
        int mException1;
        int mException2;
        int mHigh;
        int mLow;

        ZipRange(int low, int high, int exception1, int exception2) {
            this.mLow = low;
            this.mHigh = high;
            this.mException1 = exception1;
            this.mException2 = exception2;
        }

        boolean matches(String zipCode) {
            int prefix = Integer.parseInt(zipCode.substring(0, 2));
            if (this.mLow > prefix) goto L7;
            if (prefix > this.mHigh) goto L7;
        L10:
            return true;
        L7:
            if (prefix == this.mException1) goto L10;
            if (prefix == this.mException2) goto L10;
            return false;
        }
    }

    static {
        sStateZipCodeRanges = new ZipRange[]{new ZipRange(99, 99, -1, -1), new ZipRange(35, 36, -1, -1), new ZipRange(71, 72, -1, -1), new ZipRange(96, 96, -1, -1), new ZipRange(85, 86, -1, -1), new ZipRange(90, 96, -1, -1), new ZipRange(80, 81, -1, -1), new ZipRange(6, 6, -1, -1), new ZipRange(20, 20, -1, -1), new ZipRange(19, 19, -1, -1), new ZipRange(32, 34, -1, -1), new ZipRange(96, 96, -1, -1), new ZipRange(30, 31, -1, -1), new ZipRange(96, 96, -1, -1), new ZipRange(96, 96, -1, -1), new ZipRange(50, 52, -1, -1), new ZipRange(83, 83, -1, -1), new ZipRange(60, 62, -1, -1), new ZipRange(46, 47, -1, -1), new ZipRange(66, 67, 73, -1), new ZipRange(40, 42, -1, -1), new ZipRange(70, 71, -1, -1), new ZipRange(1, 2, -1, -1), new ZipRange(20, 21, -1, -1), new ZipRange(3, 4, -1, -1), new ZipRange(96, 96, -1, -1), new ZipRange(48, 49, -1, -1), new ZipRange(55, 56, -1, -1), new ZipRange(63, 65, -1, -1), new ZipRange(96, 96, -1, -1), new ZipRange(38, 39, -1, -1), new ZipRange(55, 56, -1, -1), new ZipRange(27, 28, -1, -1), new ZipRange(58, 58, -1, -1), new ZipRange(68, 69, -1, -1), new ZipRange(3, 4, -1, -1), new ZipRange(7, 8, -1, -1), new ZipRange(87, 88, 86, -1), new ZipRange(88, 89, 96, -1), new ZipRange(10, 14, 0, 6), new ZipRange(43, 45, -1, -1), new ZipRange(73, 74, -1, -1), new ZipRange(97, 97, -1, -1), new ZipRange(15, 19, -1, -1), new ZipRange(6, 6, 0, 9), new ZipRange(96, 96, -1, -1), new ZipRange(2, 2, -1, -1), new ZipRange(29, 29, -1, -1), new ZipRange(57, 57, -1, -1), new ZipRange(37, 38, -1, -1), new ZipRange(75, 79, 87, 88), new ZipRange(84, 84, -1, -1), new ZipRange(22, 24, 20, -1), new ZipRange(6, 9, -1, -1), new ZipRange(5, 5, -1, -1), new ZipRange(98, 99, -1, -1), new ZipRange(53, 54, -1, -1), new ZipRange(24, 26, -1, -1), new ZipRange(82, 83, -1, -1)};
        sWordRe = Pattern.compile("[^,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]+(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
        sHouseNumberRe = Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
        sStateRe = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+states[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mariana[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(nd|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(ne|nebraska)|(nh|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+hampshire)|(nj|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+jersey)|(nm|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mexico)|(nv|nevada)|(ny|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+rico)|(pw|palau)|(ri|rhode[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+island)|(sc|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(sd|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+virginia)|(wy|wyoming))(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
        sLocationNameRe = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
        sSuffixedNumberRe = Pattern.compile("([0-9]+)(st|nd|rd|th)", 2);
        sZipCodeRe = Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
    }

    private static boolean checkHouseNumber(String houseNumber) {
        int digitCount = 0;
        int i = 0;
    L4:
        if (i >= houseNumber.length()) goto L10;
        if (Character.isDigit(houseNumber.charAt(i)) == false) goto L8;
        digitCount = digitCount + 1;
    L8:
        i = i + 1;
        goto L4
    L10:
        if (digitCount <= 5) goto L12;
        return false;
    L12:
        Matcher suffixMatcher = sSuffixedNumberRe.matcher(houseNumber);
        if (suffixMatcher.find() == false) goto L39;
        int num = Integer.parseInt(suffixMatcher.group(1));
        if (num != 0) goto L17;
        return false;
    L17:
        String suffix = suffixMatcher.group(2).toLowerCase(Locale.getDefault());
        String r5 = "th";
        switch((num % 10)) {
            case 1: goto L34;
            case 2: goto L28;
            case 3: goto L22;
            default: goto L20;
        };
    L20:
        return suffix.equals("th");
    L22:
        if ((num % 100) == 13) goto L26;
        r5 = "rd";
    L26:
        return suffix.equals(r5);
    L28:
        if ((num % 100) == 12) goto L32;
        r5 = "nd";
    L32:
        return suffix.equals(r5);
    L34:
        if ((num % 100) == 11) goto L38;
        r5 = "st";
    L38:
        return suffix.equals(r5);
    L39:
        return true;
    }

    public static MatchResult matchHouseNumber(String content, int offset) {
        if (offset > 0) goto L5;
    L7:
        Matcher matcher = sHouseNumberRe.matcher(content).region(offset, content.length());
        if (matcher.lookingAt() == false) goto L12;
        MatchResult matchResult = matcher.toMatchResult();
        if (checkHouseNumber(matchResult.group(0)) == false) goto L12;
        return matchResult;
    L12:
        return null;
    L5:
        if (HOUSE_PRE_DELIM.indexOf(content.charAt(offset - 1)) != (-1)) goto L7;
        return null;
    }

    public static MatchResult matchState(String content, int offset) {
        if (offset > 0) goto L5;
    L7:
        Matcher stateMatcher = sStateRe.matcher(content).region(offset, content.length());
        if (stateMatcher.lookingAt() == true) goto L10;
        return null;
    L10:
        return stateMatcher.toMatchResult();
    L5:
        if (WORD_DELIM.indexOf(content.charAt(offset - 1)) != (-1)) goto L7;
        return null;
    }

    private static boolean isValidZipCode(String zipCode, MatchResult stateMatch) {
        if (stateMatch != null) goto L5;
        return false;
    L5:
        int stateIndex = stateMatch.groupCount();
    L6:
        if (stateIndex <= 0) goto L12;
        int stateIndex2 = stateIndex - 1;
        if (stateMatch.group(stateIndex) != null) goto L9;
        stateIndex = stateIndex2;
        goto L6
    L9:
        stateIndex = stateIndex2;
    L12:
        if (sZipCodeRe.matcher(zipCode).matches() == true) goto L14;
        return false;
    L14:
        if (sStateZipCodeRanges[stateIndex].matches(zipCode) == false) goto L21;
        return true;
    L21:
        return false;
    }

    public static boolean isValidZipCode(String zipCode, String state) {
        return isValidZipCode(zipCode, matchState(state, 0));
    }

    public static boolean isValidZipCode(String zipCode) {
        return sZipCodeRe.matcher(zipCode).matches();
    }

    public static boolean isValidLocationName(String location) {
        return sLocationNameRe.matcher(location).matches();
    }

    private static int attemptMatch(String content, MatchResult houseNumberMatch) {
        int restartPos = -1;
        int nonZipMatch = -1;
        int it = houseNumberMatch.end();
        int numLines = 1;
        boolean consecutiveHouseNumbers = true;
        boolean foundLocationName = false;
        int wordCount = 1;
        String lastWord = "";
        Matcher matcher = sWordRe.matcher(content);
    L4:
        if (it >= content.length()) goto L58;
        if (matcher.find(it) == false) goto L8;
        if ((matcher.end() - matcher.start()) > 25) goto L12;
    L14:
        if (it >= matcher.start()) goto L20;
        int it2 = it + 1;
        if (NL.indexOf(content.charAt(it)) == (-1)) goto L18;
        numLines = numLines + 1;
    L18:
        it = it2;
        goto L14
    L20:
        if (numLines > 5) goto L58;
        wordCount = wordCount + 1;
        if (wordCount > 14) goto L58;
        if (matchHouseNumber(content, it) == null) goto L34;
        if (consecutiveHouseNumbers == true) goto L29;
    L32:
        if (restartPos != (-1)) goto L57;
        restartPos = it;
    L57:
        lastWord = matcher.group(0);
        it = matcher.end();
        goto L4
    L29:
        if (numLines <= 1) goto L32;
        return -it;
    L34:
        consecutiveHouseNumbers = false;
        if (isValidLocationName(matcher.group(0)) == false) goto L37;
        foundLocationName = true;
        goto L57
    L37:
        if (wordCount != 5) goto L40;
        if (foundLocationName == true) goto L40;
        it = matcher.end();
    L40:
        if (foundLocationName == false) goto L57;
        if (wordCount <= 4) goto L57;
        MatchResult stateMatch = matchState(content, it);
        if (stateMatch == null) goto L57;
        if (lastWord.equals("et") == true) goto L48;
    L50:
        Matcher zipMatcher = sWordRe.matcher(content);
        if (zipMatcher.find(stateMatch.end()) == true) goto L53;
        nonZipMatch = stateMatch.end();
        goto L57
    L53:
        if (isValidZipCode(zipMatcher.group(0), stateMatch) == false) goto L57;
        return zipMatcher.end();
    L48:
        if (stateMatch.group(0).equals("al") == false) goto L50;
        it = stateMatch.end();
        goto L58
    L12:
        return -matcher.end();
    L8:
        return -content.length();
    L58:
        if (nonZipMatch <= 0) goto L60;
        return nonZipMatch;
    L60:
        if (restartPos <= 0) goto L62;
        int r9 = restartPos;
    L64:
        return -r9;
    L62:
        r9 = it;
        goto L64
    }

    static String findAddress(String content) {
        Matcher houseNumberMatcher = sHouseNumberRe.matcher(content);
        int start = 0;
    L4:
        if (houseNumberMatcher.find(start) == false) goto L13;
        if (checkHouseNumber(houseNumberMatcher.group(0)) == true) goto L7;
        start = houseNumberMatcher.end();
        goto L4
    L7:
        int start2 = houseNumberMatcher.start();
        int end = attemptMatch(content, houseNumberMatcher);
        if (end > 0) goto L10;
        start = -end;
        goto L4
    L10:
        return content.substring(start2, end);
    L13:
        return null;
    }

    private FindAddress() {
    }
}
