// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$761 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$761() {}
    static final FunctionDescriptor CertCreateCertificateContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertCreateCertificateContext$MH = RuntimeHelper.downcallHandle(
        "CertCreateCertificateContext",
        constants$761.CertCreateCertificateContext$FUNC
    );
    static final FunctionDescriptor CertFreeCertificateContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFreeCertificateContext$MH = RuntimeHelper.downcallHandle(
        "CertFreeCertificateContext",
        constants$761.CertFreeCertificateContext$FUNC
    );
    static final FunctionDescriptor CertSetCertificateContextProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertSetCertificateContextProperty$MH = RuntimeHelper.downcallHandle(
        "CertSetCertificateContextProperty",
        constants$761.CertSetCertificateContextProperty$FUNC
    );
    static final FunctionDescriptor CertGetCertificateContextProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertGetCertificateContextProperty$MH = RuntimeHelper.downcallHandle(
        "CertGetCertificateContextProperty",
        constants$761.CertGetCertificateContextProperty$FUNC
    );
    static final FunctionDescriptor CertEnumCertificateContextProperties$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertEnumCertificateContextProperties$MH = RuntimeHelper.downcallHandle(
        "CertEnumCertificateContextProperties",
        constants$761.CertEnumCertificateContextProperties$FUNC
    );
    static final FunctionDescriptor CertCreateCTLEntryFromCertificateContextProperties$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertCreateCTLEntryFromCertificateContextProperties$MH = RuntimeHelper.downcallHandle(
        "CertCreateCTLEntryFromCertificateContextProperties",
        constants$761.CertCreateCTLEntryFromCertificateContextProperties$FUNC
    );
}

