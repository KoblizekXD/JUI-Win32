// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$281 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$281() {}
    static final FunctionDescriptor SetDllDirectoryW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetDllDirectoryW$MH = RuntimeHelper.downcallHandle(
        "SetDllDirectoryW",
        constants$281.SetDllDirectoryW$FUNC
    );
    static final FunctionDescriptor GetDllDirectoryA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDllDirectoryA$MH = RuntimeHelper.downcallHandle(
        "GetDllDirectoryA",
        constants$281.GetDllDirectoryA$FUNC
    );
    static final FunctionDescriptor GetDllDirectoryW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDllDirectoryW$MH = RuntimeHelper.downcallHandle(
        "GetDllDirectoryW",
        constants$281.GetDllDirectoryW$FUNC
    );
    static final FunctionDescriptor SetSearchPathMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetSearchPathMode$MH = RuntimeHelper.downcallHandle(
        "SetSearchPathMode",
        constants$281.SetSearchPathMode$FUNC
    );
    static final FunctionDescriptor CreateDirectoryExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateDirectoryExA$MH = RuntimeHelper.downcallHandle(
        "CreateDirectoryExA",
        constants$281.CreateDirectoryExA$FUNC
    );
    static final FunctionDescriptor CreateDirectoryExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateDirectoryExW$MH = RuntimeHelper.downcallHandle(
        "CreateDirectoryExW",
        constants$281.CreateDirectoryExW$FUNC
    );
}

