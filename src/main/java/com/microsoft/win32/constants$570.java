// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$570 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$570() {}
    static final FunctionDescriptor RegDisableReflectionKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegDisableReflectionKey$MH = RuntimeHelper.downcallHandle(
        "RegDisableReflectionKey",
        constants$570.RegDisableReflectionKey$FUNC
    );
    static final FunctionDescriptor RegEnableReflectionKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegEnableReflectionKey$MH = RuntimeHelper.downcallHandle(
        "RegEnableReflectionKey",
        constants$570.RegEnableReflectionKey$FUNC
    );
    static final FunctionDescriptor RegQueryReflectionKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegQueryReflectionKey$MH = RuntimeHelper.downcallHandle(
        "RegQueryReflectionKey",
        constants$570.RegQueryReflectionKey$FUNC
    );
    static final FunctionDescriptor RegDeleteValueA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegDeleteValueA$MH = RuntimeHelper.downcallHandle(
        "RegDeleteValueA",
        constants$570.RegDeleteValueA$FUNC
    );
    static final FunctionDescriptor RegDeleteValueW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegDeleteValueW$MH = RuntimeHelper.downcallHandle(
        "RegDeleteValueW",
        constants$570.RegDeleteValueW$FUNC
    );
    static final FunctionDescriptor RegEnumKeyA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegEnumKeyA$MH = RuntimeHelper.downcallHandle(
        "RegEnumKeyA",
        constants$570.RegEnumKeyA$FUNC
    );
}


