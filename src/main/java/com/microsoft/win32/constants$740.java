// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$740 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$740() {}
    static final FunctionDescriptor CryptDecodeObjectEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptDecodeObjectEx$MH = RuntimeHelper.downcallHandle(
        "CryptDecodeObjectEx",
        constants$740.CryptDecodeObjectEx$FUNC
    );
    static final FunctionDescriptor CryptDecodeObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptDecodeObject$MH = RuntimeHelper.downcallHandle(
        "CryptDecodeObject",
        constants$740.CryptDecodeObject$FUNC
    );
    static final FunctionDescriptor CryptInstallOIDFunctionAddress$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptInstallOIDFunctionAddress$MH = RuntimeHelper.downcallHandle(
        "CryptInstallOIDFunctionAddress",
        constants$740.CryptInstallOIDFunctionAddress$FUNC
    );
    static final FunctionDescriptor CryptInitOIDFunctionSet$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptInitOIDFunctionSet$MH = RuntimeHelper.downcallHandle(
        "CryptInitOIDFunctionSet",
        constants$740.CryptInitOIDFunctionSet$FUNC
    );
    static final FunctionDescriptor CryptGetOIDFunctionAddress$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGetOIDFunctionAddress$MH = RuntimeHelper.downcallHandle(
        "CryptGetOIDFunctionAddress",
        constants$740.CryptGetOIDFunctionAddress$FUNC
    );
    static final FunctionDescriptor CryptGetDefaultOIDDllList$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGetDefaultOIDDllList$MH = RuntimeHelper.downcallHandle(
        "CryptGetDefaultOIDDllList",
        constants$740.CryptGetDefaultOIDDllList$FUNC
    );
}

