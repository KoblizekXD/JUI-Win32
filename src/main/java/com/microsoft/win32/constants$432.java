// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$432 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$432() {}
    static final FunctionDescriptor RemoveClipboardFormatListener$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RemoveClipboardFormatListener$MH = RuntimeHelper.downcallHandle(
        "RemoveClipboardFormatListener",
        constants$432.RemoveClipboardFormatListener$FUNC
    );
    static final FunctionDescriptor GetUpdatedClipboardFormats$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUpdatedClipboardFormats$MH = RuntimeHelper.downcallHandle(
        "GetUpdatedClipboardFormats",
        constants$432.GetUpdatedClipboardFormats$FUNC
    );
    static final FunctionDescriptor CharToOemA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CharToOemA$MH = RuntimeHelper.downcallHandle(
        "CharToOemA",
        constants$432.CharToOemA$FUNC
    );
    static final FunctionDescriptor CharToOemW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CharToOemW$MH = RuntimeHelper.downcallHandle(
        "CharToOemW",
        constants$432.CharToOemW$FUNC
    );
    static final FunctionDescriptor OemToCharA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OemToCharA$MH = RuntimeHelper.downcallHandle(
        "OemToCharA",
        constants$432.OemToCharA$FUNC
    );
    static final FunctionDescriptor OemToCharW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OemToCharW$MH = RuntimeHelper.downcallHandle(
        "OemToCharW",
        constants$432.OemToCharW$FUNC
    );
}


