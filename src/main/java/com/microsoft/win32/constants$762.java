// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$762 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$762() {}
    static final FunctionDescriptor CertSetCertificateContextPropertiesFromCTLEntry$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertSetCertificateContextPropertiesFromCTLEntry$MH = RuntimeHelper.downcallHandle(
        "CertSetCertificateContextPropertiesFromCTLEntry",
        constants$762.CertSetCertificateContextPropertiesFromCTLEntry$FUNC
    );
    static final FunctionDescriptor CertGetCRLFromStore$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertGetCRLFromStore$MH = RuntimeHelper.downcallHandle(
        "CertGetCRLFromStore",
        constants$762.CertGetCRLFromStore$FUNC
    );
    static final FunctionDescriptor CertEnumCRLsInStore$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertEnumCRLsInStore$MH = RuntimeHelper.downcallHandle(
        "CertEnumCRLsInStore",
        constants$762.CertEnumCRLsInStore$FUNC
    );
    static final FunctionDescriptor CertFindCRLInStore$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFindCRLInStore$MH = RuntimeHelper.downcallHandle(
        "CertFindCRLInStore",
        constants$762.CertFindCRLInStore$FUNC
    );
    static final FunctionDescriptor CertDuplicateCRLContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertDuplicateCRLContext$MH = RuntimeHelper.downcallHandle(
        "CertDuplicateCRLContext",
        constants$762.CertDuplicateCRLContext$FUNC
    );
    static final FunctionDescriptor CertCreateCRLContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertCreateCRLContext$MH = RuntimeHelper.downcallHandle(
        "CertCreateCRLContext",
        constants$762.CertCreateCRLContext$FUNC
    );
}


