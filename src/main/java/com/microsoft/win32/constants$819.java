// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$819 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$819() {}
    static final FunctionDescriptor NdrServerContextMarshall$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrServerContextMarshall$MH = RuntimeHelper.downcallHandle(
        "NdrServerContextMarshall",
        constants$819.NdrServerContextMarshall$FUNC
    );
    static final FunctionDescriptor NdrServerContextNewMarshall$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrServerContextNewMarshall$MH = RuntimeHelper.downcallHandle(
        "NdrServerContextNewMarshall",
        constants$819.NdrServerContextNewMarshall$FUNC
    );
    static final FunctionDescriptor NdrSimpleTypeUnmarshall$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle NdrSimpleTypeUnmarshall$MH = RuntimeHelper.downcallHandle(
        "NdrSimpleTypeUnmarshall",
        constants$819.NdrSimpleTypeUnmarshall$FUNC
    );
    static final FunctionDescriptor NdrCsArrayUnmarshall$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle NdrCsArrayUnmarshall$MH = RuntimeHelper.downcallHandle(
        "NdrCsArrayUnmarshall",
        constants$819.NdrCsArrayUnmarshall$FUNC
    );
    static final FunctionDescriptor NdrCsTagUnmarshall$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle NdrCsTagUnmarshall$MH = RuntimeHelper.downcallHandle(
        "NdrCsTagUnmarshall",
        constants$819.NdrCsTagUnmarshall$FUNC
    );
    static final FunctionDescriptor NdrRangeUnmarshall$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle NdrRangeUnmarshall$MH = RuntimeHelper.downcallHandle(
        "NdrRangeUnmarshall",
        constants$819.NdrRangeUnmarshall$FUNC
    );
}


