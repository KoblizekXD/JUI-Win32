// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$723 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$723() {}
    static final FunctionDescriptor CryptContextAddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptContextAddRef$MH = RuntimeHelper.downcallHandle(
        "CryptContextAddRef",
        constants$723.CryptContextAddRef$FUNC
    );
    static final FunctionDescriptor CryptDuplicateKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptDuplicateKey$MH = RuntimeHelper.downcallHandle(
        "CryptDuplicateKey",
        constants$723.CryptDuplicateKey$FUNC
    );
    static final FunctionDescriptor CryptDuplicateHash$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptDuplicateHash$MH = RuntimeHelper.downcallHandle(
        "CryptDuplicateHash",
        constants$723.CryptDuplicateHash$FUNC
    );
    static final FunctionDescriptor GetEncSChannel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetEncSChannel$MH = RuntimeHelper.downcallHandle(
        "GetEncSChannel",
        constants$723.GetEncSChannel$FUNC
    );
    static final FunctionDescriptor BCryptOpenAlgorithmProvider$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptOpenAlgorithmProvider$MH = RuntimeHelper.downcallHandle(
        "BCryptOpenAlgorithmProvider",
        constants$723.BCryptOpenAlgorithmProvider$FUNC
    );
    static final FunctionDescriptor BCryptEnumAlgorithms$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptEnumAlgorithms$MH = RuntimeHelper.downcallHandle(
        "BCryptEnumAlgorithms",
        constants$723.BCryptEnumAlgorithms$FUNC
    );
}


