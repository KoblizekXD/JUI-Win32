// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1252 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1252() {}
    static final FunctionDescriptor HANDLER_FUNCTION$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor HANDLER_FUNCTION_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle HANDLER_FUNCTION_UP$MH = RuntimeHelper.upcallHandle(HANDLER_FUNCTION.class, "apply", constants$1252.HANDLER_FUNCTION_UP$FUNC);
    static final FunctionDescriptor HANDLER_FUNCTION_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle HANDLER_FUNCTION_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1252.HANDLER_FUNCTION_DOWN$FUNC
    );
    static final FunctionDescriptor HANDLER_FUNCTION_EX$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor HANDLER_FUNCTION_EX_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HANDLER_FUNCTION_EX_UP$MH = RuntimeHelper.upcallHandle(HANDLER_FUNCTION_EX.class, "apply", constants$1252.HANDLER_FUNCTION_EX_UP$FUNC);
    static final FunctionDescriptor HANDLER_FUNCTION_EX_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HANDLER_FUNCTION_EX_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1252.HANDLER_FUNCTION_EX_DOWN$FUNC
    );
    static final FunctionDescriptor LPHANDLER_FUNCTION$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor LPHANDLER_FUNCTION_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LPHANDLER_FUNCTION_UP$MH = RuntimeHelper.upcallHandle(LPHANDLER_FUNCTION.class, "apply", constants$1252.LPHANDLER_FUNCTION_UP$FUNC);
    static final FunctionDescriptor LPHANDLER_FUNCTION_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LPHANDLER_FUNCTION_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1252.LPHANDLER_FUNCTION_DOWN$FUNC
    );
}


