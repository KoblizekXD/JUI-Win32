// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1153 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1153() {}
    static final FunctionDescriptor CopyStgMedium$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CopyStgMedium$MH = RuntimeHelper.downcallHandle(
        "CopyStgMedium",
        constants$1153.CopyStgMedium$FUNC
    );
    static final FunctionDescriptor CopyBindInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CopyBindInfo$MH = RuntimeHelper.downcallHandle(
        "CopyBindInfo",
        constants$1153.CopyBindInfo$FUNC
    );
    static final FunctionDescriptor ReleaseBindInfo$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReleaseBindInfo$MH = RuntimeHelper.downcallHandle(
        "ReleaseBindInfo",
        constants$1153.ReleaseBindInfo$FUNC
    );
    static final FunctionDescriptor IEGetUserPrivateNamespaceName$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle IEGetUserPrivateNamespaceName$MH = RuntimeHelper.downcallHandle(
        "IEGetUserPrivateNamespaceName",
        constants$1153.IEGetUserPrivateNamespaceName$FUNC
    );
    static final FunctionDescriptor CoInternetCreateSecurityManager$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CoInternetCreateSecurityManager$MH = RuntimeHelper.downcallHandle(
        "CoInternetCreateSecurityManager",
        constants$1153.CoInternetCreateSecurityManager$FUNC
    );
    static final FunctionDescriptor CoInternetCreateZoneManager$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CoInternetCreateZoneManager$MH = RuntimeHelper.downcallHandle(
        "CoInternetCreateZoneManager",
        constants$1153.CoInternetCreateZoneManager$FUNC
    );
}


