// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$707 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$707() {}
    static final FunctionDescriptor PFNSHOWSHAREFOLDERUIW_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNSHOWSHAREFOLDERUIW_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$707.PFNSHOWSHAREFOLDERUIW_DOWN$FUNC
    );
    static final FunctionDescriptor InitNetworkAddressControl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle InitNetworkAddressControl$MH = RuntimeHelper.downcallHandle(
        "InitNetworkAddressControl",
        constants$707.InitNetworkAddressControl$FUNC
    );
    static final FunctionDescriptor SHGetDriveMedia$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHGetDriveMedia$MH = RuntimeHelper.downcallHandle(
        "SHGetDriveMedia",
        constants$707.SHGetDriveMedia$FUNC
    );
    static final FunctionDescriptor PM_OPEN_PROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PM_OPEN_PROC_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PM_OPEN_PROC_UP$MH = RuntimeHelper.upcallHandle(PM_OPEN_PROC.class, "apply", constants$707.PM_OPEN_PROC_UP$FUNC);
    static final FunctionDescriptor PM_OPEN_PROC_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PM_OPEN_PROC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$707.PM_OPEN_PROC_DOWN$FUNC
    );
    static final FunctionDescriptor PM_COLLECT_PROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PM_COLLECT_PROC_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PM_COLLECT_PROC_UP$MH = RuntimeHelper.upcallHandle(PM_COLLECT_PROC.class, "apply", constants$707.PM_COLLECT_PROC_UP$FUNC);
}


