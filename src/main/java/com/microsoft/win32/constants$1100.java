// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1100 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1100() {}
    static final FunctionDescriptor HGLOBAL_UserSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HGLOBAL_UserSize$MH = RuntimeHelper.downcallHandle(
        "HGLOBAL_UserSize",
        constants$1100.HGLOBAL_UserSize$FUNC
    );
    static final FunctionDescriptor HGLOBAL_UserMarshal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HGLOBAL_UserMarshal$MH = RuntimeHelper.downcallHandle(
        "HGLOBAL_UserMarshal",
        constants$1100.HGLOBAL_UserMarshal$FUNC
    );
    static final FunctionDescriptor HGLOBAL_UserUnmarshal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HGLOBAL_UserUnmarshal$MH = RuntimeHelper.downcallHandle(
        "HGLOBAL_UserUnmarshal",
        constants$1100.HGLOBAL_UserUnmarshal$FUNC
    );
    static final FunctionDescriptor HGLOBAL_UserFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HGLOBAL_UserFree$MH = RuntimeHelper.downcallHandle(
        "HGLOBAL_UserFree",
        constants$1100.HGLOBAL_UserFree$FUNC
    );
    static final FunctionDescriptor HMENU_UserSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HMENU_UserSize$MH = RuntimeHelper.downcallHandle(
        "HMENU_UserSize",
        constants$1100.HMENU_UserSize$FUNC
    );
    static final FunctionDescriptor HMENU_UserMarshal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HMENU_UserMarshal$MH = RuntimeHelper.downcallHandle(
        "HMENU_UserMarshal",
        constants$1100.HMENU_UserMarshal$FUNC
    );
}


