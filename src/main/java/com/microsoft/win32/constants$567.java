// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$567 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$567() {}
    static final FunctionDescriptor RegDisablePredefinedCache$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle RegDisablePredefinedCache$MH = RuntimeHelper.downcallHandle(
        "RegDisablePredefinedCache",
        constants$567.RegDisablePredefinedCache$FUNC
    );
    static final FunctionDescriptor RegDisablePredefinedCacheEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle RegDisablePredefinedCacheEx$MH = RuntimeHelper.downcallHandle(
        "RegDisablePredefinedCacheEx",
        constants$567.RegDisablePredefinedCacheEx$FUNC
    );
    static final FunctionDescriptor RegConnectRegistryA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegConnectRegistryA$MH = RuntimeHelper.downcallHandle(
        "RegConnectRegistryA",
        constants$567.RegConnectRegistryA$FUNC
    );
    static final FunctionDescriptor RegConnectRegistryW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegConnectRegistryW$MH = RuntimeHelper.downcallHandle(
        "RegConnectRegistryW",
        constants$567.RegConnectRegistryW$FUNC
    );
    static final FunctionDescriptor RegConnectRegistryExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegConnectRegistryExA$MH = RuntimeHelper.downcallHandle(
        "RegConnectRegistryExA",
        constants$567.RegConnectRegistryExA$FUNC
    );
    static final FunctionDescriptor RegConnectRegistryExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegConnectRegistryExW$MH = RuntimeHelper.downcallHandle(
        "RegConnectRegistryExW",
        constants$567.RegConnectRegistryExW$FUNC
    );
}

