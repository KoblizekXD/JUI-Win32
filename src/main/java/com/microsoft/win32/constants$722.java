// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$722 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$722() {}
    static final FunctionDescriptor CryptGetDefaultProviderA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGetDefaultProviderA$MH = RuntimeHelper.downcallHandle(
        "CryptGetDefaultProviderA",
        constants$722.CryptGetDefaultProviderA$FUNC
    );
    static final FunctionDescriptor CryptGetDefaultProviderW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGetDefaultProviderW$MH = RuntimeHelper.downcallHandle(
        "CryptGetDefaultProviderW",
        constants$722.CryptGetDefaultProviderW$FUNC
    );
    static final FunctionDescriptor CryptEnumProviderTypesA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptEnumProviderTypesA$MH = RuntimeHelper.downcallHandle(
        "CryptEnumProviderTypesA",
        constants$722.CryptEnumProviderTypesA$FUNC
    );
    static final FunctionDescriptor CryptEnumProviderTypesW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptEnumProviderTypesW$MH = RuntimeHelper.downcallHandle(
        "CryptEnumProviderTypesW",
        constants$722.CryptEnumProviderTypesW$FUNC
    );
    static final FunctionDescriptor CryptEnumProvidersA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptEnumProvidersA$MH = RuntimeHelper.downcallHandle(
        "CryptEnumProvidersA",
        constants$722.CryptEnumProvidersA$FUNC
    );
    static final FunctionDescriptor CryptEnumProvidersW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptEnumProvidersW$MH = RuntimeHelper.downcallHandle(
        "CryptEnumProvidersW",
        constants$722.CryptEnumProvidersW$FUNC
    );
}


