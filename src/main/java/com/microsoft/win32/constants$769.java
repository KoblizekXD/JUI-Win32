// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$769 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$769() {}
    static final FunctionDescriptor PFN_CERT_CREATE_CONTEXT_SORT_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PFN_CERT_CREATE_CONTEXT_SORT_FUNC_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_CREATE_CONTEXT_SORT_FUNC_UP$MH = RuntimeHelper.upcallHandle(PFN_CERT_CREATE_CONTEXT_SORT_FUNC.class, "apply", constants$769.PFN_CERT_CREATE_CONTEXT_SORT_FUNC_UP$FUNC);
    static final FunctionDescriptor PFN_CERT_CREATE_CONTEXT_SORT_FUNC_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_CREATE_CONTEXT_SORT_FUNC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$769.PFN_CERT_CREATE_CONTEXT_SORT_FUNC_DOWN$FUNC
    );
    static final FunctionDescriptor CertCreateContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertCreateContext$MH = RuntimeHelper.downcallHandle(
        "CertCreateContext",
        constants$769.CertCreateContext$FUNC
    );
    static final FunctionDescriptor CertRegisterSystemStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertRegisterSystemStore$MH = RuntimeHelper.downcallHandle(
        "CertRegisterSystemStore",
        constants$769.CertRegisterSystemStore$FUNC
    );
    static final FunctionDescriptor CertRegisterPhysicalStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertRegisterPhysicalStore$MH = RuntimeHelper.downcallHandle(
        "CertRegisterPhysicalStore",
        constants$769.CertRegisterPhysicalStore$FUNC
    );
    static final FunctionDescriptor CertUnregisterSystemStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertUnregisterSystemStore$MH = RuntimeHelper.downcallHandle(
        "CertUnregisterSystemStore",
        constants$769.CertUnregisterSystemStore$FUNC
    );
}

