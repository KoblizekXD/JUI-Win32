// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$232 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$232() {}
    static final FunctionDescriptor SetKernelObjectSecurity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetKernelObjectSecurity$MH = RuntimeHelper.downcallHandle(
        "SetKernelObjectSecurity",
        constants$232.SetKernelObjectSecurity$FUNC
    );
    static final FunctionDescriptor SetPrivateObjectSecurity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetPrivateObjectSecurity$MH = RuntimeHelper.downcallHandle(
        "SetPrivateObjectSecurity",
        constants$232.SetPrivateObjectSecurity$FUNC
    );
    static final FunctionDescriptor SetPrivateObjectSecurityEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetPrivateObjectSecurityEx$MH = RuntimeHelper.downcallHandle(
        "SetPrivateObjectSecurityEx",
        constants$232.SetPrivateObjectSecurityEx$FUNC
    );
    static final FunctionDescriptor SetSecurityAccessMask$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetSecurityAccessMask$MH = RuntimeHelper.downcallHandle(
        "SetSecurityAccessMask",
        constants$232.SetSecurityAccessMask$FUNC
    );
    static final FunctionDescriptor SetSecurityDescriptorControl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle SetSecurityDescriptorControl$MH = RuntimeHelper.downcallHandle(
        "SetSecurityDescriptorControl",
        constants$232.SetSecurityDescriptorControl$FUNC
    );
    static final FunctionDescriptor SetSecurityDescriptorDacl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetSecurityDescriptorDacl$MH = RuntimeHelper.downcallHandle(
        "SetSecurityDescriptorDacl",
        constants$232.SetSecurityDescriptorDacl$FUNC
    );
}

