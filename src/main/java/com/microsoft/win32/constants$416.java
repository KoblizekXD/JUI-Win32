// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$416 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$416() {}
    static final FunctionDescriptor UnregisterClassW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnregisterClassW$MH = RuntimeHelper.downcallHandle(
        "UnregisterClassW",
        constants$416.UnregisterClassW$FUNC
    );
    static final FunctionDescriptor GetClassInfoA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClassInfoA$MH = RuntimeHelper.downcallHandle(
        "GetClassInfoA",
        constants$416.GetClassInfoA$FUNC
    );
    static final FunctionDescriptor GetClassInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClassInfoW$MH = RuntimeHelper.downcallHandle(
        "GetClassInfoW",
        constants$416.GetClassInfoW$FUNC
    );
    static final FunctionDescriptor RegisterClassExA$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterClassExA$MH = RuntimeHelper.downcallHandle(
        "RegisterClassExA",
        constants$416.RegisterClassExA$FUNC
    );
    static final FunctionDescriptor RegisterClassExW$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterClassExW$MH = RuntimeHelper.downcallHandle(
        "RegisterClassExW",
        constants$416.RegisterClassExW$FUNC
    );
    static final FunctionDescriptor GetClassInfoExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClassInfoExA$MH = RuntimeHelper.downcallHandle(
        "GetClassInfoExA",
        constants$416.GetClassInfoExA$FUNC
    );
}


