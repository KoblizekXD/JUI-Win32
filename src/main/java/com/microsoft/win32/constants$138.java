// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$138 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$138() {}
    static final FunctionDescriptor DuplicateHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DuplicateHandle$MH = RuntimeHelper.downcallHandle(
        "DuplicateHandle",
        constants$138.DuplicateHandle$FUNC
    );
    static final FunctionDescriptor CompareObjectHandles$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CompareObjectHandles$MH = RuntimeHelper.downcallHandle(
        "CompareObjectHandles",
        constants$138.CompareObjectHandles$FUNC
    );
    static final FunctionDescriptor GetHandleInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetHandleInformation$MH = RuntimeHelper.downcallHandle(
        "GetHandleInformation",
        constants$138.GetHandleInformation$FUNC
    );
    static final FunctionDescriptor SetHandleInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetHandleInformation$MH = RuntimeHelper.downcallHandle(
        "SetHandleInformation",
        constants$138.SetHandleInformation$FUNC
    );
    static final FunctionDescriptor PTOP_LEVEL_EXCEPTION_FILTER$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PTOP_LEVEL_EXCEPTION_FILTER_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PTOP_LEVEL_EXCEPTION_FILTER_UP$MH = RuntimeHelper.upcallHandle(PTOP_LEVEL_EXCEPTION_FILTER.class, "apply", constants$138.PTOP_LEVEL_EXCEPTION_FILTER_UP$FUNC);
    static final FunctionDescriptor PTOP_LEVEL_EXCEPTION_FILTER_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PTOP_LEVEL_EXCEPTION_FILTER_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$138.PTOP_LEVEL_EXCEPTION_FILTER_DOWN$FUNC
    );
}


