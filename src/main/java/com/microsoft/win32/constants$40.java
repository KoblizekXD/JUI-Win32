// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$40 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$40() {}
    static final FunctionDescriptor PEXCEPTION_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PEXCEPTION_ROUTINE_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PEXCEPTION_ROUTINE_UP$MH = RuntimeHelper.upcallHandle(PEXCEPTION_ROUTINE.class, "apply", constants$40.PEXCEPTION_ROUTINE_UP$FUNC);
    static final FunctionDescriptor PEXCEPTION_ROUTINE_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PEXCEPTION_ROUTINE_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$40.PEXCEPTION_ROUTINE_DOWN$FUNC
    );
    static final FunctionDescriptor _bittest$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _bittest$MH = RuntimeHelper.downcallHandle(
        "_bittest",
        constants$40._bittest$FUNC
    );
    static final FunctionDescriptor _bittestandcomplement$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _bittestandcomplement$MH = RuntimeHelper.downcallHandle(
        "_bittestandcomplement",
        constants$40._bittestandcomplement$FUNC
    );
    static final FunctionDescriptor _bittestandset$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _bittestandset$MH = RuntimeHelper.downcallHandle(
        "_bittestandset",
        constants$40._bittestandset$FUNC
    );
    static final FunctionDescriptor _bittestandreset$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _bittestandreset$MH = RuntimeHelper.downcallHandle(
        "_bittestandreset",
        constants$40._bittestandreset$FUNC
    );
}


