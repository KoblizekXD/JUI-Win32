// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$259 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$259() {}
    static final FunctionDescriptor GetSystemDEPPolicy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetSystemDEPPolicy$MH = RuntimeHelper.downcallHandle(
        "GetSystemDEPPolicy",
        constants$259.GetSystemDEPPolicy$FUNC
    );
    static final FunctionDescriptor GetSystemRegistryQuota$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemRegistryQuota$MH = RuntimeHelper.downcallHandle(
        "GetSystemRegistryQuota",
        constants$259.GetSystemRegistryQuota$FUNC
    );
    static final FunctionDescriptor FileTimeToDosDateTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FileTimeToDosDateTime$MH = RuntimeHelper.downcallHandle(
        "FileTimeToDosDateTime",
        constants$259.FileTimeToDosDateTime$FUNC
    );
    static final FunctionDescriptor DosDateTimeToFileTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DosDateTimeToFileTime$MH = RuntimeHelper.downcallHandle(
        "DosDateTimeToFileTime",
        constants$259.DosDateTimeToFileTime$FUNC
    );
    static final FunctionDescriptor FormatMessageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FormatMessageA$MH = RuntimeHelper.downcallHandle(
        "FormatMessageA",
        constants$259.FormatMessageA$FUNC
    );
    static final FunctionDescriptor FormatMessageW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FormatMessageW$MH = RuntimeHelper.downcallHandle(
        "FormatMessageW",
        constants$259.FormatMessageW$FUNC
    );
}


