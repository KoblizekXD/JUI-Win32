// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$715 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$715() {}
    static final FunctionDescriptor WSAAsyncGetServByName$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAAsyncGetServByName$MH = RuntimeHelper.downcallHandle(
        "WSAAsyncGetServByName",
        constants$715.WSAAsyncGetServByName$FUNC
    );
    static final FunctionDescriptor WSAAsyncGetServByPort$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAAsyncGetServByPort$MH = RuntimeHelper.downcallHandle(
        "WSAAsyncGetServByPort",
        constants$715.WSAAsyncGetServByPort$FUNC
    );
    static final FunctionDescriptor WSAAsyncGetProtoByName$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAAsyncGetProtoByName$MH = RuntimeHelper.downcallHandle(
        "WSAAsyncGetProtoByName",
        constants$715.WSAAsyncGetProtoByName$FUNC
    );
    static final FunctionDescriptor WSAAsyncGetProtoByNumber$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAAsyncGetProtoByNumber$MH = RuntimeHelper.downcallHandle(
        "WSAAsyncGetProtoByNumber",
        constants$715.WSAAsyncGetProtoByNumber$FUNC
    );
    static final FunctionDescriptor WSAAsyncGetHostByName$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAAsyncGetHostByName$MH = RuntimeHelper.downcallHandle(
        "WSAAsyncGetHostByName",
        constants$715.WSAAsyncGetHostByName$FUNC
    );
    static final FunctionDescriptor WSAAsyncGetHostByAddr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAAsyncGetHostByAddr$MH = RuntimeHelper.downcallHandle(
        "WSAAsyncGetHostByAddr",
        constants$715.WSAAsyncGetHostByAddr$FUNC
    );
}


