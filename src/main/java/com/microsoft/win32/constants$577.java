// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$577 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$577() {}
    static final FunctionDescriptor RegUnLoadKeyA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegUnLoadKeyA$MH = RuntimeHelper.downcallHandle(
        "RegUnLoadKeyA",
        constants$577.RegUnLoadKeyA$FUNC
    );
    static final FunctionDescriptor RegUnLoadKeyW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegUnLoadKeyW$MH = RuntimeHelper.downcallHandle(
        "RegUnLoadKeyW",
        constants$577.RegUnLoadKeyW$FUNC
    );
    static final FunctionDescriptor RegDeleteKeyValueA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegDeleteKeyValueA$MH = RuntimeHelper.downcallHandle(
        "RegDeleteKeyValueA",
        constants$577.RegDeleteKeyValueA$FUNC
    );
    static final FunctionDescriptor RegDeleteKeyValueW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegDeleteKeyValueW$MH = RuntimeHelper.downcallHandle(
        "RegDeleteKeyValueW",
        constants$577.RegDeleteKeyValueW$FUNC
    );
    static final FunctionDescriptor RegSetKeyValueA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegSetKeyValueA$MH = RuntimeHelper.downcallHandle(
        "RegSetKeyValueA",
        constants$577.RegSetKeyValueA$FUNC
    );
    static final FunctionDescriptor RegSetKeyValueW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegSetKeyValueW$MH = RuntimeHelper.downcallHandle(
        "RegSetKeyValueW",
        constants$577.RegSetKeyValueW$FUNC
    );
}

