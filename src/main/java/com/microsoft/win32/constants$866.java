// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$866 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$866() {}
    static final FunctionDescriptor SCardConnectA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardConnectA$MH = RuntimeHelper.downcallHandle(
        "SCardConnectA",
        constants$866.SCardConnectA$FUNC
    );
    static final FunctionDescriptor SCardConnectW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardConnectW$MH = RuntimeHelper.downcallHandle(
        "SCardConnectW",
        constants$866.SCardConnectW$FUNC
    );
    static final FunctionDescriptor SCardReconnect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardReconnect$MH = RuntimeHelper.downcallHandle(
        "SCardReconnect",
        constants$866.SCardReconnect$FUNC
    );
    static final FunctionDescriptor SCardDisconnect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardDisconnect$MH = RuntimeHelper.downcallHandle(
        "SCardDisconnect",
        constants$866.SCardDisconnect$FUNC
    );
    static final FunctionDescriptor SCardBeginTransaction$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SCardBeginTransaction$MH = RuntimeHelper.downcallHandle(
        "SCardBeginTransaction",
        constants$866.SCardBeginTransaction$FUNC
    );
    static final FunctionDescriptor SCardEndTransaction$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardEndTransaction$MH = RuntimeHelper.downcallHandle(
        "SCardEndTransaction",
        constants$866.SCardEndTransaction$FUNC
    );
}


