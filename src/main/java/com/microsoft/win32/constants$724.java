// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$724 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$724() {}
    static final FunctionDescriptor BCryptEnumProviders$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptEnumProviders$MH = RuntimeHelper.downcallHandle(
        "BCryptEnumProviders",
        constants$724.BCryptEnumProviders$FUNC
    );
    static final FunctionDescriptor BCryptGetProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptGetProperty$MH = RuntimeHelper.downcallHandle(
        "BCryptGetProperty",
        constants$724.BCryptGetProperty$FUNC
    );
    static final FunctionDescriptor BCryptSetProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptSetProperty$MH = RuntimeHelper.downcallHandle(
        "BCryptSetProperty",
        constants$724.BCryptSetProperty$FUNC
    );
    static final FunctionDescriptor BCryptCloseAlgorithmProvider$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptCloseAlgorithmProvider$MH = RuntimeHelper.downcallHandle(
        "BCryptCloseAlgorithmProvider",
        constants$724.BCryptCloseAlgorithmProvider$FUNC
    );
    static final FunctionDescriptor BCryptFreeBuffer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BCryptFreeBuffer$MH = RuntimeHelper.downcallHandle(
        "BCryptFreeBuffer",
        constants$724.BCryptFreeBuffer$FUNC
    );
    static final FunctionDescriptor BCryptGenerateSymmetricKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptGenerateSymmetricKey$MH = RuntimeHelper.downcallHandle(
        "BCryptGenerateSymmetricKey",
        constants$724.BCryptGenerateSymmetricKey$FUNC
    );
}


