// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$727 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$727() {}
    static final FunctionDescriptor BCryptSecretAgreement$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptSecretAgreement$MH = RuntimeHelper.downcallHandle(
        "BCryptSecretAgreement",
        constants$727.BCryptSecretAgreement$FUNC
    );
    static final FunctionDescriptor BCryptDeriveKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptDeriveKey$MH = RuntimeHelper.downcallHandle(
        "BCryptDeriveKey",
        constants$727.BCryptDeriveKey$FUNC
    );
    static final FunctionDescriptor BCryptKeyDerivation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptKeyDerivation$MH = RuntimeHelper.downcallHandle(
        "BCryptKeyDerivation",
        constants$727.BCryptKeyDerivation$FUNC
    );
    static final FunctionDescriptor BCryptCreateHash$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptCreateHash$MH = RuntimeHelper.downcallHandle(
        "BCryptCreateHash",
        constants$727.BCryptCreateHash$FUNC
    );
    static final FunctionDescriptor BCryptHashData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptHashData$MH = RuntimeHelper.downcallHandle(
        "BCryptHashData",
        constants$727.BCryptHashData$FUNC
    );
    static final FunctionDescriptor BCryptFinishHash$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptFinishHash$MH = RuntimeHelper.downcallHandle(
        "BCryptFinishHash",
        constants$727.BCryptFinishHash$FUNC
    );
}

