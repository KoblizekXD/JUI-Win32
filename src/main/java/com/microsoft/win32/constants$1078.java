// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1078 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1078() {}
    static final FunctionDescriptor LPSAFEARRAY_UserSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPSAFEARRAY_UserSize$MH = RuntimeHelper.downcallHandle(
        "LPSAFEARRAY_UserSize",
        constants$1078.LPSAFEARRAY_UserSize$FUNC
    );
    static final FunctionDescriptor LPSAFEARRAY_UserMarshal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPSAFEARRAY_UserMarshal$MH = RuntimeHelper.downcallHandle(
        "LPSAFEARRAY_UserMarshal",
        constants$1078.LPSAFEARRAY_UserMarshal$FUNC
    );
    static final FunctionDescriptor LPSAFEARRAY_UserUnmarshal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPSAFEARRAY_UserUnmarshal$MH = RuntimeHelper.downcallHandle(
        "LPSAFEARRAY_UserUnmarshal",
        constants$1078.LPSAFEARRAY_UserUnmarshal$FUNC
    );
    static final FunctionDescriptor LPSAFEARRAY_UserFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPSAFEARRAY_UserFree$MH = RuntimeHelper.downcallHandle(
        "LPSAFEARRAY_UserFree",
        constants$1078.LPSAFEARRAY_UserFree$FUNC
    );
    static final FunctionDescriptor LPSAFEARRAY_UserSize64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPSAFEARRAY_UserSize64$MH = RuntimeHelper.downcallHandle(
        "LPSAFEARRAY_UserSize64",
        constants$1078.LPSAFEARRAY_UserSize64$FUNC
    );
    static final FunctionDescriptor LPSAFEARRAY_UserMarshal64$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPSAFEARRAY_UserMarshal64$MH = RuntimeHelper.downcallHandle(
        "LPSAFEARRAY_UserMarshal64",
        constants$1078.LPSAFEARRAY_UserMarshal64$FUNC
    );
}

