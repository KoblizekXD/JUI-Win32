// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$473 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$473() {}
    static final FunctionDescriptor MessageBoxA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MessageBoxA$MH = RuntimeHelper.downcallHandle(
        "MessageBoxA",
        constants$473.MessageBoxA$FUNC
    );
    static final FunctionDescriptor MessageBoxW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MessageBoxW$MH = RuntimeHelper.downcallHandle(
        "MessageBoxW",
        constants$473.MessageBoxW$FUNC
    );
    static final FunctionDescriptor MessageBoxExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle MessageBoxExA$MH = RuntimeHelper.downcallHandle(
        "MessageBoxExA",
        constants$473.MessageBoxExA$FUNC
    );
    static final FunctionDescriptor MessageBoxExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle MessageBoxExW$MH = RuntimeHelper.downcallHandle(
        "MessageBoxExW",
        constants$473.MessageBoxExW$FUNC
    );
    static final FunctionDescriptor MSGBOXCALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor MSGBOXCALLBACK_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MSGBOXCALLBACK_UP$MH = RuntimeHelper.upcallHandle(MSGBOXCALLBACK.class, "apply", constants$473.MSGBOXCALLBACK_UP$FUNC);
    static final FunctionDescriptor MSGBOXCALLBACK_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MSGBOXCALLBACK_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$473.MSGBOXCALLBACK_DOWN$FUNC
    );
}

