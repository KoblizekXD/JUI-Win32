// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$721 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$721() {}
    static final FunctionDescriptor CryptVerifySignatureA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptVerifySignatureA$MH = RuntimeHelper.downcallHandle(
        "CryptVerifySignatureA",
        constants$721.CryptVerifySignatureA$FUNC
    );
    static final FunctionDescriptor CryptVerifySignatureW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptVerifySignatureW$MH = RuntimeHelper.downcallHandle(
        "CryptVerifySignatureW",
        constants$721.CryptVerifySignatureW$FUNC
    );
    static final FunctionDescriptor CryptSetProviderA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptSetProviderA$MH = RuntimeHelper.downcallHandle(
        "CryptSetProviderA",
        constants$721.CryptSetProviderA$FUNC
    );
    static final FunctionDescriptor CryptSetProviderW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptSetProviderW$MH = RuntimeHelper.downcallHandle(
        "CryptSetProviderW",
        constants$721.CryptSetProviderW$FUNC
    );
    static final FunctionDescriptor CryptSetProviderExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptSetProviderExA$MH = RuntimeHelper.downcallHandle(
        "CryptSetProviderExA",
        constants$721.CryptSetProviderExA$FUNC
    );
    static final FunctionDescriptor CryptSetProviderExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptSetProviderExW$MH = RuntimeHelper.downcallHandle(
        "CryptSetProviderExW",
        constants$721.CryptSetProviderExW$FUNC
    );
}

