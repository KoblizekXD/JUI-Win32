// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$511 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$511() {}
    static final FunctionDescriptor RealGetWindowClassA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RealGetWindowClassA$MH = RuntimeHelper.downcallHandle(
        "RealGetWindowClassA",
        constants$511.RealGetWindowClassA$FUNC
    );
    static final FunctionDescriptor RealGetWindowClassW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RealGetWindowClassW$MH = RuntimeHelper.downcallHandle(
        "RealGetWindowClassW",
        constants$511.RealGetWindowClassW$FUNC
    );
    static final FunctionDescriptor GetAltTabInfoA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetAltTabInfoA$MH = RuntimeHelper.downcallHandle(
        "GetAltTabInfoA",
        constants$511.GetAltTabInfoA$FUNC
    );
    static final FunctionDescriptor GetAltTabInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetAltTabInfoW$MH = RuntimeHelper.downcallHandle(
        "GetAltTabInfoW",
        constants$511.GetAltTabInfoW$FUNC
    );
    static final FunctionDescriptor GetListBoxInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetListBoxInfo$MH = RuntimeHelper.downcallHandle(
        "GetListBoxInfo",
        constants$511.GetListBoxInfo$FUNC
    );
    static final FunctionDescriptor LockWorkStation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle LockWorkStation$MH = RuntimeHelper.downcallHandle(
        "LockWorkStation",
        constants$511.LockWorkStation$FUNC
    );
}

