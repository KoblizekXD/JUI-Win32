// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$428 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$428() {}
    static final FunctionDescriptor GetDialogDpiChangeBehavior$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDialogDpiChangeBehavior$MH = RuntimeHelper.downcallHandle(
        "GetDialogDpiChangeBehavior",
        constants$428.GetDialogDpiChangeBehavior$FUNC
    );
    static final FunctionDescriptor CallMsgFilterA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CallMsgFilterA$MH = RuntimeHelper.downcallHandle(
        "CallMsgFilterA",
        constants$428.CallMsgFilterA$FUNC
    );
    static final FunctionDescriptor CallMsgFilterW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CallMsgFilterW$MH = RuntimeHelper.downcallHandle(
        "CallMsgFilterW",
        constants$428.CallMsgFilterW$FUNC
    );
    static final FunctionDescriptor OpenClipboard$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenClipboard$MH = RuntimeHelper.downcallHandle(
        "OpenClipboard",
        constants$428.OpenClipboard$FUNC
    );
    static final FunctionDescriptor CloseClipboard$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CloseClipboard$MH = RuntimeHelper.downcallHandle(
        "CloseClipboard",
        constants$428.CloseClipboard$FUNC
    );
    static final FunctionDescriptor GetClipboardSequenceNumber$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetClipboardSequenceNumber$MH = RuntimeHelper.downcallHandle(
        "GetClipboardSequenceNumber",
        constants$428.GetClipboardSequenceNumber$FUNC
    );
}


