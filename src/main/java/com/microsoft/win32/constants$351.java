// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$351 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$351() {}
    static final FunctionDescriptor AddFontResourceExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddFontResourceExA$MH = RuntimeHelper.downcallHandle(
        "AddFontResourceExA",
        constants$351.AddFontResourceExA$FUNC
    );
    static final FunctionDescriptor AddFontResourceExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddFontResourceExW$MH = RuntimeHelper.downcallHandle(
        "AddFontResourceExW",
        constants$351.AddFontResourceExW$FUNC
    );
    static final FunctionDescriptor RemoveFontResourceExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RemoveFontResourceExA$MH = RuntimeHelper.downcallHandle(
        "RemoveFontResourceExA",
        constants$351.RemoveFontResourceExA$FUNC
    );
    static final FunctionDescriptor RemoveFontResourceExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RemoveFontResourceExW$MH = RuntimeHelper.downcallHandle(
        "RemoveFontResourceExW",
        constants$351.RemoveFontResourceExW$FUNC
    );
    static final FunctionDescriptor AddFontMemResourceEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddFontMemResourceEx$MH = RuntimeHelper.downcallHandle(
        "AddFontMemResourceEx",
        constants$351.AddFontMemResourceEx$FUNC
    );
    static final FunctionDescriptor RemoveFontMemResourceEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RemoveFontMemResourceEx$MH = RuntimeHelper.downcallHandle(
        "RemoveFontMemResourceEx",
        constants$351.RemoveFontMemResourceEx$FUNC
    );
}


