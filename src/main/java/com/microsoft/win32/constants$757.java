// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$757 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$757() {}
    static final FunctionDescriptor PFN_CERT_STORE_PROV_FREE_FIND_CERT_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_FREE_FIND_CERT_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$757.PFN_CERT_STORE_PROV_FREE_FIND_CERT_DOWN$FUNC
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_GET_CERT_PROPERTY$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_GET_CERT_PROPERTY_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_GET_CERT_PROPERTY_UP$MH = RuntimeHelper.upcallHandle(PFN_CERT_STORE_PROV_GET_CERT_PROPERTY.class, "apply", constants$757.PFN_CERT_STORE_PROV_GET_CERT_PROPERTY_UP$FUNC);
    static final FunctionDescriptor PFN_CERT_STORE_PROV_GET_CERT_PROPERTY_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_GET_CERT_PROPERTY_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$757.PFN_CERT_STORE_PROV_GET_CERT_PROPERTY_DOWN$FUNC
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_FIND_CRL$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_FIND_CRL_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_FIND_CRL_UP$MH = RuntimeHelper.upcallHandle(PFN_CERT_STORE_PROV_FIND_CRL.class, "apply", constants$757.PFN_CERT_STORE_PROV_FIND_CRL_UP$FUNC);
    static final FunctionDescriptor PFN_CERT_STORE_PROV_FIND_CRL_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_FIND_CRL_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$757.PFN_CERT_STORE_PROV_FIND_CRL_DOWN$FUNC
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_FREE_FIND_CRL$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_FREE_FIND_CRL_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_FREE_FIND_CRL_UP$MH = RuntimeHelper.upcallHandle(PFN_CERT_STORE_PROV_FREE_FIND_CRL.class, "apply", constants$757.PFN_CERT_STORE_PROV_FREE_FIND_CRL_UP$FUNC);
}

