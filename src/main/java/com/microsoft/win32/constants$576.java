// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$576 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$576() {}
    static final FunctionDescriptor RegSaveKeyW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegSaveKeyW$MH = RuntimeHelper.downcallHandle(
        "RegSaveKeyW",
        constants$576.RegSaveKeyW$FUNC
    );
    static final FunctionDescriptor RegSetKeySecurity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegSetKeySecurity$MH = RuntimeHelper.downcallHandle(
        "RegSetKeySecurity",
        constants$576.RegSetKeySecurity$FUNC
    );
    static final FunctionDescriptor RegSetValueA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegSetValueA$MH = RuntimeHelper.downcallHandle(
        "RegSetValueA",
        constants$576.RegSetValueA$FUNC
    );
    static final FunctionDescriptor RegSetValueW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegSetValueW$MH = RuntimeHelper.downcallHandle(
        "RegSetValueW",
        constants$576.RegSetValueW$FUNC
    );
    static final FunctionDescriptor RegSetValueExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegSetValueExA$MH = RuntimeHelper.downcallHandle(
        "RegSetValueExA",
        constants$576.RegSetValueExA$FUNC
    );
    static final FunctionDescriptor RegSetValueExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegSetValueExW$MH = RuntimeHelper.downcallHandle(
        "RegSetValueExW",
        constants$576.RegSetValueExW$FUNC
    );
}

