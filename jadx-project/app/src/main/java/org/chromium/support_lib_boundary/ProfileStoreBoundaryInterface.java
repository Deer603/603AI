package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.jspecify.annotations.NullMarked;

/* JADX INFO: loaded from: classes4.dex */
@NullMarked
public interface ProfileStoreBoundaryInterface {
    boolean deleteProfile(String r1);

    List<String> getAllProfileNames();

    InvocationHandler getOrCreateProfile(String r1);

    InvocationHandler getProfile(String r1);
}
