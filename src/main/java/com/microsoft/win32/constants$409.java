// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$409 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$409() {}
    static final FunctionDescriptor GetUnpredictedMessagePos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetUnpredictedMessagePos$MH = RuntimeHelper.downcallHandle(
        "GetUnpredictedMessagePos",
        constants$409.GetUnpredictedMessagePos$FUNC
    );
    static final FunctionDescriptor IsWow64Message$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle IsWow64Message$MH = RuntimeHelper.downcallHandle(
        "IsWow64Message",
        constants$409.IsWow64Message$FUNC
    );
    static final FunctionDescriptor SetMessageExtraInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SetMessageExtraInfo$MH = RuntimeHelper.downcallHandle(
        "SetMessageExtraInfo",
        constants$409.SetMessageExtraInfo$FUNC
    );
    static final FunctionDescriptor SendMessageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SendMessageA$MH = RuntimeHelper.downcallHandle(
        "SendMessageA",
        constants$409.SendMessageA$FUNC
    );
    static final FunctionDescriptor SendMessageW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SendMessageW$MH = RuntimeHelper.downcallHandle(
        "SendMessageW",
        constants$409.SendMessageW$FUNC
    );
    static final FunctionDescriptor SendMessageTimeoutA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SendMessageTimeoutA$MH = RuntimeHelper.downcallHandle(
        "SendMessageTimeoutA",
        constants$409.SendMessageTimeoutA$FUNC
    );
}


