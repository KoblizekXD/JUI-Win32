// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$631 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$631() {}
    static final FunctionDescriptor joySetThreshold$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joySetThreshold$MH = RuntimeHelper.downcallHandle(
        "joySetThreshold",
        constants$631.joySetThreshold$FUNC
    );
    static final FunctionDescriptor joyConfigChanged$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joyConfigChanged$MH = RuntimeHelper.downcallHandle(
        "joyConfigChanged",
        constants$631.joyConfigChanged$FUNC
    );
    static final FunctionDescriptor Netbios$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Netbios$MH = RuntimeHelper.downcallHandle(
        "Netbios",
        constants$631.Netbios$FUNC
    );
    static final FunctionDescriptor RPC_OBJECT_INQ_FN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor RPC_OBJECT_INQ_FN_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RPC_OBJECT_INQ_FN_UP$MH = RuntimeHelper.upcallHandle(RPC_OBJECT_INQ_FN.class, "apply", constants$631.RPC_OBJECT_INQ_FN_UP$FUNC);
    static final FunctionDescriptor RPC_OBJECT_INQ_FN_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RPC_OBJECT_INQ_FN_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$631.RPC_OBJECT_INQ_FN_DOWN$FUNC
    );
    static final FunctionDescriptor RPC_IF_CALLBACK_FN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor RPC_IF_CALLBACK_FN_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RPC_IF_CALLBACK_FN_UP$MH = RuntimeHelper.upcallHandle(RPC_IF_CALLBACK_FN.class, "apply", constants$631.RPC_IF_CALLBACK_FN_UP$FUNC);
}

