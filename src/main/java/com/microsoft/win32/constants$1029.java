// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1029 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1029() {}
    static final FunctionDescriptor STGMEDIUM_UserFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle STGMEDIUM_UserFree$MH = RuntimeHelper.downcallHandle(
        "STGMEDIUM_UserFree",
        constants$1029.STGMEDIUM_UserFree$FUNC
    );
    static final FunctionDescriptor ASYNC_STGMEDIUM_UserSize64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ASYNC_STGMEDIUM_UserSize64$MH = RuntimeHelper.downcallHandle(
        "ASYNC_STGMEDIUM_UserSize64",
        constants$1029.ASYNC_STGMEDIUM_UserSize64$FUNC
    );
    static final FunctionDescriptor ASYNC_STGMEDIUM_UserMarshal64$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ASYNC_STGMEDIUM_UserMarshal64$MH = RuntimeHelper.downcallHandle(
        "ASYNC_STGMEDIUM_UserMarshal64",
        constants$1029.ASYNC_STGMEDIUM_UserMarshal64$FUNC
    );
    static final FunctionDescriptor ASYNC_STGMEDIUM_UserUnmarshal64$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ASYNC_STGMEDIUM_UserUnmarshal64$MH = RuntimeHelper.downcallHandle(
        "ASYNC_STGMEDIUM_UserUnmarshal64",
        constants$1029.ASYNC_STGMEDIUM_UserUnmarshal64$FUNC
    );
    static final FunctionDescriptor ASYNC_STGMEDIUM_UserFree64$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ASYNC_STGMEDIUM_UserFree64$MH = RuntimeHelper.downcallHandle(
        "ASYNC_STGMEDIUM_UserFree64",
        constants$1029.ASYNC_STGMEDIUM_UserFree64$FUNC
    );
    static final FunctionDescriptor CLIPFORMAT_UserSize64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CLIPFORMAT_UserSize64$MH = RuntimeHelper.downcallHandle(
        "CLIPFORMAT_UserSize64",
        constants$1029.CLIPFORMAT_UserSize64$FUNC
    );
}


