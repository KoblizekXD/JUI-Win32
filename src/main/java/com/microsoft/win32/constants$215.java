// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$215 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$215() {}
    static final FunctionDescriptor RemoveDllDirectory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RemoveDllDirectory$MH = RuntimeHelper.downcallHandle(
        "RemoveDllDirectory",
        constants$215.RemoveDllDirectory$FUNC
    );
    static final FunctionDescriptor SetDefaultDllDirectories$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetDefaultDllDirectories$MH = RuntimeHelper.downcallHandle(
        "SetDefaultDllDirectories",
        constants$215.SetDefaultDllDirectories$FUNC
    );
    static final FunctionDescriptor EnumResourceLanguagesExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle EnumResourceLanguagesExA$MH = RuntimeHelper.downcallHandle(
        "EnumResourceLanguagesExA",
        constants$215.EnumResourceLanguagesExA$FUNC
    );
    static final FunctionDescriptor EnumResourceLanguagesExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle EnumResourceLanguagesExW$MH = RuntimeHelper.downcallHandle(
        "EnumResourceLanguagesExW",
        constants$215.EnumResourceLanguagesExW$FUNC
    );
    static final FunctionDescriptor EnumResourceNamesExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle EnumResourceNamesExA$MH = RuntimeHelper.downcallHandle(
        "EnumResourceNamesExA",
        constants$215.EnumResourceNamesExA$FUNC
    );
    static final FunctionDescriptor EnumResourceNamesExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle EnumResourceNamesExW$MH = RuntimeHelper.downcallHandle(
        "EnumResourceNamesExW",
        constants$215.EnumResourceNamesExW$FUNC
    );
}


