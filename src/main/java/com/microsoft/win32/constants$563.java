// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$563 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$563() {}
    static final FunctionDescriptor VerFindFileA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VerFindFileA$MH = RuntimeHelper.downcallHandle(
        "VerFindFileA",
        constants$563.VerFindFileA$FUNC
    );
    static final FunctionDescriptor VerFindFileW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VerFindFileW$MH = RuntimeHelper.downcallHandle(
        "VerFindFileW",
        constants$563.VerFindFileW$FUNC
    );
    static final FunctionDescriptor VerInstallFileA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VerInstallFileA$MH = RuntimeHelper.downcallHandle(
        "VerInstallFileA",
        constants$563.VerInstallFileA$FUNC
    );
    static final FunctionDescriptor VerInstallFileW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VerInstallFileW$MH = RuntimeHelper.downcallHandle(
        "VerInstallFileW",
        constants$563.VerInstallFileW$FUNC
    );
    static final FunctionDescriptor GetFileVersionInfoSizeA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFileVersionInfoSizeA$MH = RuntimeHelper.downcallHandle(
        "GetFileVersionInfoSizeA",
        constants$563.GetFileVersionInfoSizeA$FUNC
    );
    static final FunctionDescriptor GetFileVersionInfoSizeW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFileVersionInfoSizeW$MH = RuntimeHelper.downcallHandle(
        "GetFileVersionInfoSizeW",
        constants$563.GetFileVersionInfoSizeW$FUNC
    );
}


