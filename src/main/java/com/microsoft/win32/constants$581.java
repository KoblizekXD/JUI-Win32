// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$581 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$581() {}
    static final FunctionDescriptor CheckForHiberboot$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle CheckForHiberboot$MH = RuntimeHelper.downcallHandle(
        "CheckForHiberboot",
        constants$581.CheckForHiberboot$FUNC
    );
    static final FunctionDescriptor RegSaveKeyExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegSaveKeyExA$MH = RuntimeHelper.downcallHandle(
        "RegSaveKeyExA",
        constants$581.RegSaveKeyExA$FUNC
    );
    static final FunctionDescriptor RegSaveKeyExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegSaveKeyExW$MH = RuntimeHelper.downcallHandle(
        "RegSaveKeyExW",
        constants$581.RegSaveKeyExW$FUNC
    );
    static final FunctionDescriptor WNetAddConnectionA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetAddConnectionA$MH = RuntimeHelper.downcallHandle(
        "WNetAddConnectionA",
        constants$581.WNetAddConnectionA$FUNC
    );
    static final FunctionDescriptor WNetAddConnectionW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetAddConnectionW$MH = RuntimeHelper.downcallHandle(
        "WNetAddConnectionW",
        constants$581.WNetAddConnectionW$FUNC
    );
    static final FunctionDescriptor WNetAddConnection2A$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WNetAddConnection2A$MH = RuntimeHelper.downcallHandle(
        "WNetAddConnection2A",
        constants$581.WNetAddConnection2A$FUNC
    );
}

