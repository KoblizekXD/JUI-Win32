// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$131 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$131() {}
    static final FunctionDescriptor GetCompressedFileSizeW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCompressedFileSizeW$MH = RuntimeHelper.downcallHandle(
        "GetCompressedFileSizeW",
        constants$131.GetCompressedFileSizeW$FUNC
    );
    static final FunctionDescriptor FindFirstStreamW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FindFirstStreamW$MH = RuntimeHelper.downcallHandle(
        "FindFirstStreamW",
        constants$131.FindFirstStreamW$FUNC
    );
    static final FunctionDescriptor FindNextStreamW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindNextStreamW$MH = RuntimeHelper.downcallHandle(
        "FindNextStreamW",
        constants$131.FindNextStreamW$FUNC
    );
    static final FunctionDescriptor AreFileApisANSI$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle AreFileApisANSI$MH = RuntimeHelper.downcallHandle(
        "AreFileApisANSI",
        constants$131.AreFileApisANSI$FUNC
    );
    static final FunctionDescriptor GetTempPathA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTempPathA$MH = RuntimeHelper.downcallHandle(
        "GetTempPathA",
        constants$131.GetTempPathA$FUNC
    );
    static final FunctionDescriptor FindFirstFileNameW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindFirstFileNameW$MH = RuntimeHelper.downcallHandle(
        "FindFirstFileNameW",
        constants$131.FindFirstFileNameW$FUNC
    );
}


