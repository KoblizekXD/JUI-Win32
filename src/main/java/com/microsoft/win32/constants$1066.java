// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1066 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1066() {}
    static final FunctionDescriptor VARIANT_UserSize64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VARIANT_UserSize64$MH = RuntimeHelper.downcallHandle(
        "VARIANT_UserSize64",
        constants$1066.VARIANT_UserSize64$FUNC
    );
    static final FunctionDescriptor VARIANT_UserMarshal64$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VARIANT_UserMarshal64$MH = RuntimeHelper.downcallHandle(
        "VARIANT_UserMarshal64",
        constants$1066.VARIANT_UserMarshal64$FUNC
    );
    static final FunctionDescriptor VARIANT_UserUnmarshal64$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VARIANT_UserUnmarshal64$MH = RuntimeHelper.downcallHandle(
        "VARIANT_UserUnmarshal64",
        constants$1066.VARIANT_UserUnmarshal64$FUNC
    );
    static final FunctionDescriptor VARIANT_UserFree64$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VARIANT_UserFree64$MH = RuntimeHelper.downcallHandle(
        "VARIANT_UserFree64",
        constants$1066.VARIANT_UserFree64$FUNC
    );
    static final FunctionDescriptor IDispatch_Invoke_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IDispatch_Invoke_Proxy$MH = RuntimeHelper.downcallHandle(
        "IDispatch_Invoke_Proxy",
        constants$1066.IDispatch_Invoke_Proxy$FUNC
    );
    static final FunctionDescriptor IDispatch_Invoke_Stub$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IDispatch_Invoke_Stub$MH = RuntimeHelper.downcallHandle(
        "IDispatch_Invoke_Stub",
        constants$1066.IDispatch_Invoke_Stub$FUNC
    );
}


