// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$813 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$813() {}
    static final FunctionDescriptor CS_TYPE_LOCAL_SIZE_ROUTINE_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CS_TYPE_LOCAL_SIZE_ROUTINE_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$813.CS_TYPE_LOCAL_SIZE_ROUTINE_DOWN$FUNC
    );
    static final FunctionDescriptor CS_TYPE_TO_NETCS_ROUTINE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor CS_TYPE_TO_NETCS_ROUTINE_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CS_TYPE_TO_NETCS_ROUTINE_UP$MH = RuntimeHelper.upcallHandle(CS_TYPE_TO_NETCS_ROUTINE.class, "apply", constants$813.CS_TYPE_TO_NETCS_ROUTINE_UP$FUNC);
    static final FunctionDescriptor CS_TYPE_TO_NETCS_ROUTINE_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CS_TYPE_TO_NETCS_ROUTINE_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$813.CS_TYPE_TO_NETCS_ROUTINE_DOWN$FUNC
    );
    static final FunctionDescriptor CS_TYPE_FROM_NETCS_ROUTINE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor CS_TYPE_FROM_NETCS_ROUTINE_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CS_TYPE_FROM_NETCS_ROUTINE_UP$MH = RuntimeHelper.upcallHandle(CS_TYPE_FROM_NETCS_ROUTINE.class, "apply", constants$813.CS_TYPE_FROM_NETCS_ROUTINE_UP$FUNC);
    static final FunctionDescriptor CS_TYPE_FROM_NETCS_ROUTINE_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CS_TYPE_FROM_NETCS_ROUTINE_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$813.CS_TYPE_FROM_NETCS_ROUTINE_DOWN$FUNC
    );
    static final FunctionDescriptor CS_TAG_GETTING_ROUTINE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor CS_TAG_GETTING_ROUTINE_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CS_TAG_GETTING_ROUTINE_UP$MH = RuntimeHelper.upcallHandle(CS_TAG_GETTING_ROUTINE.class, "apply", constants$813.CS_TAG_GETTING_ROUTINE_UP$FUNC);
}


