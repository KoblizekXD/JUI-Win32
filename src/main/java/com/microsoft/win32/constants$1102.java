// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1102 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1102() {}
    static final FunctionDescriptor HACCEL_UserSize64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HACCEL_UserSize64$MH = RuntimeHelper.downcallHandle(
        "HACCEL_UserSize64",
        constants$1102.HACCEL_UserSize64$FUNC
    );
    static final FunctionDescriptor HACCEL_UserMarshal64$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HACCEL_UserMarshal64$MH = RuntimeHelper.downcallHandle(
        "HACCEL_UserMarshal64",
        constants$1102.HACCEL_UserMarshal64$FUNC
    );
    static final FunctionDescriptor HACCEL_UserUnmarshal64$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HACCEL_UserUnmarshal64$MH = RuntimeHelper.downcallHandle(
        "HACCEL_UserUnmarshal64",
        constants$1102.HACCEL_UserUnmarshal64$FUNC
    );
    static final FunctionDescriptor HACCEL_UserFree64$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HACCEL_UserFree64$MH = RuntimeHelper.downcallHandle(
        "HACCEL_UserFree64",
        constants$1102.HACCEL_UserFree64$FUNC
    );
    static final FunctionDescriptor HGLOBAL_UserSize64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HGLOBAL_UserSize64$MH = RuntimeHelper.downcallHandle(
        "HGLOBAL_UserSize64",
        constants$1102.HGLOBAL_UserSize64$FUNC
    );
    static final FunctionDescriptor HGLOBAL_UserMarshal64$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HGLOBAL_UserMarshal64$MH = RuntimeHelper.downcallHandle(
        "HGLOBAL_UserMarshal64",
        constants$1102.HGLOBAL_UserMarshal64$FUNC
    );
}


