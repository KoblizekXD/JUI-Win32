// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$734 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$734() {}
    static final FunctionDescriptor NCryptEnumStorageProviders$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NCryptEnumStorageProviders$MH = RuntimeHelper.downcallHandle(
        "NCryptEnumStorageProviders",
        constants$734.NCryptEnumStorageProviders$FUNC
    );
    static final FunctionDescriptor NCryptFreeBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NCryptFreeBuffer$MH = RuntimeHelper.downcallHandle(
        "NCryptFreeBuffer",
        constants$734.NCryptFreeBuffer$FUNC
    );
    static final FunctionDescriptor NCryptOpenKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NCryptOpenKey$MH = RuntimeHelper.downcallHandle(
        "NCryptOpenKey",
        constants$734.NCryptOpenKey$FUNC
    );
    static final FunctionDescriptor NCryptCreatePersistedKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NCryptCreatePersistedKey$MH = RuntimeHelper.downcallHandle(
        "NCryptCreatePersistedKey",
        constants$734.NCryptCreatePersistedKey$FUNC
    );
    static final FunctionDescriptor NCryptGetProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NCryptGetProperty$MH = RuntimeHelper.downcallHandle(
        "NCryptGetProperty",
        constants$734.NCryptGetProperty$FUNC
    );
    static final FunctionDescriptor NCryptSetProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NCryptSetProperty$MH = RuntimeHelper.downcallHandle(
        "NCryptSetProperty",
        constants$734.NCryptSetProperty$FUNC
    );
}


