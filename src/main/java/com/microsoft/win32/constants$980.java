// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$980 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$980() {}
    static final FunctionDescriptor CoUninitialize$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle CoUninitialize$MH = RuntimeHelper.downcallHandle(
        "CoUninitialize",
        constants$980.CoUninitialize$FUNC
    );
    static final FunctionDescriptor CoGetCurrentProcess$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CoGetCurrentProcess$MH = RuntimeHelper.downcallHandle(
        "CoGetCurrentProcess",
        constants$980.CoGetCurrentProcess$FUNC
    );
    static final FunctionDescriptor CoInitializeEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CoInitializeEx$MH = RuntimeHelper.downcallHandle(
        "CoInitializeEx",
        constants$980.CoInitializeEx$FUNC
    );
    static final FunctionDescriptor CoGetCallerTID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoGetCallerTID$MH = RuntimeHelper.downcallHandle(
        "CoGetCallerTID",
        constants$980.CoGetCallerTID$FUNC
    );
    static final FunctionDescriptor CoGetCurrentLogicalThreadId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoGetCurrentLogicalThreadId$MH = RuntimeHelper.downcallHandle(
        "CoGetCurrentLogicalThreadId",
        constants$980.CoGetCurrentLogicalThreadId$FUNC
    );
    static final FunctionDescriptor CoGetContextToken$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoGetContextToken$MH = RuntimeHelper.downcallHandle(
        "CoGetContextToken",
        constants$980.CoGetContextToken$FUNC
    );
}


