// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$733 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$733() {}
    static final FunctionDescriptor PFN_NCRYPT_FREE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PFN_NCRYPT_FREE_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_NCRYPT_FREE_UP$MH = RuntimeHelper.upcallHandle(PFN_NCRYPT_FREE.class, "apply", constants$733.PFN_NCRYPT_FREE_UP$FUNC);
    static final FunctionDescriptor PFN_NCRYPT_FREE_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_NCRYPT_FREE_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$733.PFN_NCRYPT_FREE_DOWN$FUNC
    );
    static final FunctionDescriptor NCryptOpenStorageProvider$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NCryptOpenStorageProvider$MH = RuntimeHelper.downcallHandle(
        "NCryptOpenStorageProvider",
        constants$733.NCryptOpenStorageProvider$FUNC
    );
    static final FunctionDescriptor NCryptEnumAlgorithms$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NCryptEnumAlgorithms$MH = RuntimeHelper.downcallHandle(
        "NCryptEnumAlgorithms",
        constants$733.NCryptEnumAlgorithms$FUNC
    );
    static final FunctionDescriptor NCryptIsAlgSupported$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NCryptIsAlgSupported$MH = RuntimeHelper.downcallHandle(
        "NCryptIsAlgSupported",
        constants$733.NCryptIsAlgSupported$FUNC
    );
    static final FunctionDescriptor NCryptEnumKeys$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NCryptEnumKeys$MH = RuntimeHelper.downcallHandle(
        "NCryptEnumKeys",
        constants$733.NCryptEnumKeys$FUNC
    );
}


