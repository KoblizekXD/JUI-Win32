// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$243 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$243() {}
    static final FunctionDescriptor LocalUnlock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalUnlock$MH = RuntimeHelper.downcallHandle(
        "LocalUnlock",
        constants$243.LocalUnlock$FUNC
    );
    static final FunctionDescriptor LocalSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalSize$MH = RuntimeHelper.downcallHandle(
        "LocalSize",
        constants$243.LocalSize$FUNC
    );
    static final FunctionDescriptor LocalFlags$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalFlags$MH = RuntimeHelper.downcallHandle(
        "LocalFlags",
        constants$243.LocalFlags$FUNC
    );
    static final FunctionDescriptor LocalFree$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalFree$MH = RuntimeHelper.downcallHandle(
        "LocalFree",
        constants$243.LocalFree$FUNC
    );
    static final FunctionDescriptor LocalShrink$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LocalShrink$MH = RuntimeHelper.downcallHandle(
        "LocalShrink",
        constants$243.LocalShrink$FUNC
    );
    static final FunctionDescriptor LocalCompact$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LocalCompact$MH = RuntimeHelper.downcallHandle(
        "LocalCompact",
        constants$243.LocalCompact$FUNC
    );
}


