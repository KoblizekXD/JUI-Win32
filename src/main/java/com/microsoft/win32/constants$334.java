// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$334 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$334() {}
    static final FunctionDescriptor DeleteDC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteDC$MH = RuntimeHelper.downcallHandle(
        "DeleteDC",
        constants$334.DeleteDC$FUNC
    );
    static final FunctionDescriptor DeleteMetaFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteMetaFile$MH = RuntimeHelper.downcallHandle(
        "DeleteMetaFile",
        constants$334.DeleteMetaFile$FUNC
    );
    static final FunctionDescriptor DeleteObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteObject$MH = RuntimeHelper.downcallHandle(
        "DeleteObject",
        constants$334.DeleteObject$FUNC
    );
    static final FunctionDescriptor DescribePixelFormat$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DescribePixelFormat$MH = RuntimeHelper.downcallHandle(
        "DescribePixelFormat",
        constants$334.DescribePixelFormat$FUNC
    );
    static final FunctionDescriptor LPFNDEVMODE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor LPFNDEVMODE_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LPFNDEVMODE_UP$MH = RuntimeHelper.upcallHandle(LPFNDEVMODE.class, "apply", constants$334.LPFNDEVMODE_UP$FUNC);
    static final FunctionDescriptor LPFNDEVMODE_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LPFNDEVMODE_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$334.LPFNDEVMODE_DOWN$FUNC
    );
}

