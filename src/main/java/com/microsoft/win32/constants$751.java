// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$751 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$751() {}
    static final FunctionDescriptor PFN_CMSG_CNG_IMPORT_CONTENT_ENCRYPT_KEY$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PFN_CMSG_CNG_IMPORT_CONTENT_ENCRYPT_KEY_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CMSG_CNG_IMPORT_CONTENT_ENCRYPT_KEY_UP$MH = RuntimeHelper.upcallHandle(PFN_CMSG_CNG_IMPORT_CONTENT_ENCRYPT_KEY.class, "apply", constants$751.PFN_CMSG_CNG_IMPORT_CONTENT_ENCRYPT_KEY_UP$FUNC);
    static final FunctionDescriptor PFN_CMSG_CNG_IMPORT_CONTENT_ENCRYPT_KEY_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CMSG_CNG_IMPORT_CONTENT_ENCRYPT_KEY_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$751.PFN_CMSG_CNG_IMPORT_CONTENT_ENCRYPT_KEY_DOWN$FUNC
    );
    static final FunctionDescriptor CertOpenStore$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertOpenStore$MH = RuntimeHelper.downcallHandle(
        "CertOpenStore",
        constants$751.CertOpenStore$FUNC
    );
    static final FunctionDescriptor PFN_CERT_DLL_OPEN_STORE_PROV_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PFN_CERT_DLL_OPEN_STORE_PROV_FUNC_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_DLL_OPEN_STORE_PROV_FUNC_UP$MH = RuntimeHelper.upcallHandle(PFN_CERT_DLL_OPEN_STORE_PROV_FUNC.class, "apply", constants$751.PFN_CERT_DLL_OPEN_STORE_PROV_FUNC_UP$FUNC);
    static final FunctionDescriptor PFN_CERT_DLL_OPEN_STORE_PROV_FUNC_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_DLL_OPEN_STORE_PROV_FUNC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$751.PFN_CERT_DLL_OPEN_STORE_PROV_FUNC_DOWN$FUNC
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_CLOSE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_CLOSE_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_CLOSE_UP$MH = RuntimeHelper.upcallHandle(PFN_CERT_STORE_PROV_CLOSE.class, "apply", constants$751.PFN_CERT_STORE_PROV_CLOSE_UP$FUNC);
}

