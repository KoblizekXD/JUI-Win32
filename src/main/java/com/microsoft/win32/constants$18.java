// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$18 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$18() {}
    static final FunctionDescriptor memset$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle memset$MH = RuntimeHelper.downcallHandle(
        "memset",
        constants$18.memset$FUNC
    );
    static final FunctionDescriptor strchr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle strchr$MH = RuntimeHelper.downcallHandle(
        "strchr",
        constants$18.strchr$FUNC
    );
    static final FunctionDescriptor strrchr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle strrchr$MH = RuntimeHelper.downcallHandle(
        "strrchr",
        constants$18.strrchr$FUNC
    );
    static final FunctionDescriptor strstr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strstr$MH = RuntimeHelper.downcallHandle(
        "strstr",
        constants$18.strstr$FUNC
    );
    static final FunctionDescriptor wcschr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle wcschr$MH = RuntimeHelper.downcallHandle(
        "wcschr",
        constants$18.wcschr$FUNC
    );
    static final FunctionDescriptor wcsrchr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle wcsrchr$MH = RuntimeHelper.downcallHandle(
        "wcsrchr",
        constants$18.wcsrchr$FUNC
    );
}

