// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$225 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$225() {}
    static final FunctionDescriptor GetAclInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetAclInformation$MH = RuntimeHelper.downcallHandle(
        "GetAclInformation",
        constants$225.GetAclInformation$FUNC
    );
    static final FunctionDescriptor GetFileSecurityW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFileSecurityW$MH = RuntimeHelper.downcallHandle(
        "GetFileSecurityW",
        constants$225.GetFileSecurityW$FUNC
    );
    static final FunctionDescriptor GetKernelObjectSecurity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetKernelObjectSecurity$MH = RuntimeHelper.downcallHandle(
        "GetKernelObjectSecurity",
        constants$225.GetKernelObjectSecurity$FUNC
    );
    static final FunctionDescriptor GetLengthSid$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLengthSid$MH = RuntimeHelper.downcallHandle(
        "GetLengthSid",
        constants$225.GetLengthSid$FUNC
    );
    static final FunctionDescriptor GetPrivateObjectSecurity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPrivateObjectSecurity$MH = RuntimeHelper.downcallHandle(
        "GetPrivateObjectSecurity",
        constants$225.GetPrivateObjectSecurity$FUNC
    );
    static final FunctionDescriptor GetSecurityDescriptorControl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSecurityDescriptorControl$MH = RuntimeHelper.downcallHandle(
        "GetSecurityDescriptorControl",
        constants$225.GetSecurityDescriptorControl$FUNC
    );
}


