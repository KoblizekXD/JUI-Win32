// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$823 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$823() {}
    static final FunctionDescriptor NdrXmitOrRepAsUnmarshall$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle NdrXmitOrRepAsUnmarshall$MH = RuntimeHelper.downcallHandle(
        "NdrXmitOrRepAsUnmarshall",
        constants$823.NdrXmitOrRepAsUnmarshall$FUNC
    );
    static final FunctionDescriptor NdrUserMarshalUnmarshall$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle NdrUserMarshalUnmarshall$MH = RuntimeHelper.downcallHandle(
        "NdrUserMarshalUnmarshall",
        constants$823.NdrUserMarshalUnmarshall$FUNC
    );
    static final FunctionDescriptor NdrInterfacePointerUnmarshall$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle NdrInterfacePointerUnmarshall$MH = RuntimeHelper.downcallHandle(
        "NdrInterfacePointerUnmarshall",
        constants$823.NdrInterfacePointerUnmarshall$FUNC
    );
    static final FunctionDescriptor NdrClientContextUnmarshall$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrClientContextUnmarshall$MH = RuntimeHelper.downcallHandle(
        "NdrClientContextUnmarshall",
        constants$823.NdrClientContextUnmarshall$FUNC
    );
    static final FunctionDescriptor NdrServerContextUnmarshall$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrServerContextUnmarshall$MH = RuntimeHelper.downcallHandle(
        "NdrServerContextUnmarshall",
        constants$823.NdrServerContextUnmarshall$FUNC
    );
    static final FunctionDescriptor NdrContextHandleInitialize$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrContextHandleInitialize$MH = RuntimeHelper.downcallHandle(
        "NdrContextHandleInitialize",
        constants$823.NdrContextHandleInitialize$FUNC
    );
}

