package androidx.webkit.internal;

import androidx.webkit.UserAgentMetadata;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class UserAgentMetadataInternal {
    private static final String ARCHITECTURE = "ARCHITECTURE";
    private static final String BITNESS = "BITNESS";
    private static final int BRAND_VERSION_LENGTH = 3;
    private static final String BRAND_VERSION_LIST = "BRAND_VERSION_LIST";
    private static final String FULL_VERSION = "FULL_VERSION";
    private static final String MOBILE = "MOBILE";
    private static final String MODEL = "MODEL";
    private static final String PLATFORM = "PLATFORM";
    private static final String PLATFORM_VERSION = "PLATFORM_VERSION";
    private static final String WOW64 = "WOW64";

    public UserAgentMetadataInternal() {
    }

    static Map<String, Object> convertUserAgentMetadataToMap(UserAgentMetadata uaMetadata) {
        Map<String, Object> item = new HashMap();
        item.put(BRAND_VERSION_LIST, getBrandVersionArray(uaMetadata.getBrandVersionList()));
        item.put(FULL_VERSION, uaMetadata.getFullVersion());
        item.put(PLATFORM, uaMetadata.getPlatform());
        item.put(PLATFORM_VERSION, uaMetadata.getPlatformVersion());
        item.put(ARCHITECTURE, uaMetadata.getArchitecture());
        item.put(MODEL, uaMetadata.getModel());
        item.put(MOBILE, Boolean.valueOf(uaMetadata.isMobile()));
        item.put(BITNESS, Integer.valueOf(uaMetadata.getBitness()));
        item.put(WOW64, Boolean.valueOf(uaMetadata.isWow64()));
        return item;
    }

    private static String[][] getBrandVersionArray(List<UserAgentMetadata.BrandVersion> brandVersionList) {
        if (brandVersionList != null) goto L4;
        return null;
    L4:
        if (brandVersionList.isEmpty() == true) goto L14;
        String[][] brandVersionArray = (String[][]) Array.newInstance(String.class, new int[]{brandVersionList.size(), 3});
        int i = 0;
    L8:
        if (i >= brandVersionList.size()) goto L10;
        brandVersionArray[i][0] = brandVersionList.get(i).getBrand();
        brandVersionArray[i][1] = brandVersionList.get(i).getMajorVersion();
        brandVersionArray[i][2] = brandVersionList.get(i).getFullVersion();
        i = i + 1;
        goto L8
    L10:
        return brandVersionArray;
    L14:
        return null;
    }

    static UserAgentMetadata getUserAgentMetadataFromMap(Map<String, Object> uaMetadataMap) {
        UserAgentMetadata.Builder builder = new UserAgentMetadata.Builder();
        Object brandVersionValue = uaMetadataMap.get(BRAND_VERSION_LIST);
        if (brandVersionValue == null) goto L8;
        String[][] overrideBrandVersionList = (String[][]) brandVersionValue;
        List<UserAgentMetadata.BrandVersion> brandVersionList = new ArrayList();
        int r4 = overrideBrandVersionList.length;
        int r6 = 0;
    L5:
        if (r6 >= r4) goto L7;
        String[] brandVersionInfo = overrideBrandVersionList[r6];
        brandVersionList.add(new UserAgentMetadata.BrandVersion.Builder().setBrand(brandVersionInfo[0]).setMajorVersion(brandVersionInfo[1]).setFullVersion(brandVersionInfo[2]).build());
        r6 = r6 + 1;
        goto L5
    L7:
        builder.setBrandVersionList(brandVersionList);
    L8:
        String fullVersion = (String) uaMetadataMap.get(FULL_VERSION);
        if (fullVersion == null) goto L11;
        builder.setFullVersion(fullVersion);
    L11:
        String platform = (String) uaMetadataMap.get(PLATFORM);
        if (platform == null) goto L14;
        builder.setPlatform(platform);
    L14:
        String platformVersion = (String) uaMetadataMap.get(PLATFORM_VERSION);
        if (platformVersion == null) goto L17;
        builder.setPlatformVersion(platformVersion);
    L17:
        String architecture = (String) uaMetadataMap.get(ARCHITECTURE);
        if (architecture == null) goto L20;
        builder.setArchitecture(architecture);
    L20:
        String model = (String) uaMetadataMap.get(MODEL);
        if (model == null) goto L23;
        builder.setModel(model);
    L23:
        Boolean isMobile = (Boolean) uaMetadataMap.get(MOBILE);
        if (isMobile == null) goto L26;
        builder.setMobile(isMobile.booleanValue());
    L26:
        Integer bitness = (Integer) uaMetadataMap.get(BITNESS);
        if (bitness == null) goto L29;
        builder.setBitness(bitness.intValue());
    L29:
        Boolean isWow64 = (Boolean) uaMetadataMap.get(WOW64);
        if (isWow64 == null) goto L33;
        builder.setWow64(isWow64.booleanValue());
    L33:
        return builder.build();
    }
}
