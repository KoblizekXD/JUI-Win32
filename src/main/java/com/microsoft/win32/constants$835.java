// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$835 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$835() {}
    static final FunctionDescriptor NdrServerInitialize$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrServerInitialize$MH = RuntimeHelper.downcallHandle(
        "NdrServerInitialize",
        constants$835.NdrServerInitialize$FUNC
    );
    static final FunctionDescriptor NdrServerInitializeUnmarshall$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrServerInitializeUnmarshall$MH = RuntimeHelper.downcallHandle(
        "NdrServerInitializeUnmarshall",
        constants$835.NdrServerInitializeUnmarshall$FUNC
    );
    static final FunctionDescriptor NdrServerInitializeMarshall$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrServerInitializeMarshall$MH = RuntimeHelper.downcallHandle(
        "NdrServerInitializeMarshall",
        constants$835.NdrServerInitializeMarshall$FUNC
    );
    static final FunctionDescriptor NdrGetBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrGetBuffer$MH = RuntimeHelper.downcallHandle(
        "NdrGetBuffer",
        constants$835.NdrGetBuffer$FUNC
    );
    static final FunctionDescriptor NdrNsGetBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrNsGetBuffer$MH = RuntimeHelper.downcallHandle(
        "NdrNsGetBuffer",
        constants$835.NdrNsGetBuffer$FUNC
    );
    static final FunctionDescriptor NdrSendReceive$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrSendReceive$MH = RuntimeHelper.downcallHandle(
        "NdrSendReceive",
        constants$835.NdrSendReceive$FUNC
    );
}


