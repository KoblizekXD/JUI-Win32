// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$439 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$439() {}
    static final FunctionDescriptor GetKeyboardType$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetKeyboardType$MH = RuntimeHelper.downcallHandle(
        "GetKeyboardType",
        constants$439.GetKeyboardType$FUNC
    );
    static final FunctionDescriptor ToAscii$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ToAscii$MH = RuntimeHelper.downcallHandle(
        "ToAscii",
        constants$439.ToAscii$FUNC
    );
    static final FunctionDescriptor ToAsciiEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ToAsciiEx$MH = RuntimeHelper.downcallHandle(
        "ToAsciiEx",
        constants$439.ToAsciiEx$FUNC
    );
    static final FunctionDescriptor ToUnicode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ToUnicode$MH = RuntimeHelper.downcallHandle(
        "ToUnicode",
        constants$439.ToUnicode$FUNC
    );
    static final FunctionDescriptor OemKeyScan$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle OemKeyScan$MH = RuntimeHelper.downcallHandle(
        "OemKeyScan",
        constants$439.OemKeyScan$FUNC
    );
    static final FunctionDescriptor VkKeyScanA$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle VkKeyScanA$MH = RuntimeHelper.downcallHandle(
        "VkKeyScanA",
        constants$439.VkKeyScanA$FUNC
    );
}


