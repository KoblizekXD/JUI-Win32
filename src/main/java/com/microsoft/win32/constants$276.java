// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$276 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$276() {}
    static final FunctionDescriptor GetProfileIntW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetProfileIntW$MH = RuntimeHelper.downcallHandle(
        "GetProfileIntW",
        constants$276.GetProfileIntW$FUNC
    );
    static final FunctionDescriptor GetProfileStringA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetProfileStringA$MH = RuntimeHelper.downcallHandle(
        "GetProfileStringA",
        constants$276.GetProfileStringA$FUNC
    );
    static final FunctionDescriptor GetProfileStringW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetProfileStringW$MH = RuntimeHelper.downcallHandle(
        "GetProfileStringW",
        constants$276.GetProfileStringW$FUNC
    );
    static final FunctionDescriptor WriteProfileStringA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WriteProfileStringA$MH = RuntimeHelper.downcallHandle(
        "WriteProfileStringA",
        constants$276.WriteProfileStringA$FUNC
    );
    static final FunctionDescriptor WriteProfileStringW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WriteProfileStringW$MH = RuntimeHelper.downcallHandle(
        "WriteProfileStringW",
        constants$276.WriteProfileStringW$FUNC
    );
    static final FunctionDescriptor GetProfileSectionA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetProfileSectionA$MH = RuntimeHelper.downcallHandle(
        "GetProfileSectionA",
        constants$276.GetProfileSectionA$FUNC
    );
}


