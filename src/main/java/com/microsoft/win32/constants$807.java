// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$807 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$807() {}
    static final FunctionDescriptor NDR_RUNDOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor NDR_RUNDOWN_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NDR_RUNDOWN_UP$MH = RuntimeHelper.upcallHandle(NDR_RUNDOWN.class, "apply", constants$807.NDR_RUNDOWN_UP$FUNC);
    static final FunctionDescriptor NDR_RUNDOWN_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NDR_RUNDOWN_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$807.NDR_RUNDOWN_DOWN$FUNC
    );
    static final FunctionDescriptor NDR_NOTIFY_ROUTINE$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor NDR_NOTIFY_ROUTINE_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle NDR_NOTIFY_ROUTINE_UP$MH = RuntimeHelper.upcallHandle(NDR_NOTIFY_ROUTINE.class, "apply", constants$807.NDR_NOTIFY_ROUTINE_UP$FUNC);
    static final FunctionDescriptor NDR_NOTIFY_ROUTINE_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle NDR_NOTIFY_ROUTINE_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$807.NDR_NOTIFY_ROUTINE_DOWN$FUNC
    );
    static final FunctionDescriptor NDR_NOTIFY2_ROUTINE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_CHAR$LAYOUT
    );
    static final FunctionDescriptor NDR_NOTIFY2_ROUTINE_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle NDR_NOTIFY2_ROUTINE_UP$MH = RuntimeHelper.upcallHandle(NDR_NOTIFY2_ROUTINE.class, "apply", constants$807.NDR_NOTIFY2_ROUTINE_UP$FUNC);
    static final FunctionDescriptor NDR_NOTIFY2_ROUTINE_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle NDR_NOTIFY2_ROUTINE_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$807.NDR_NOTIFY2_ROUTINE_DOWN$FUNC
    );
}


