// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$918 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$918() {}
    static final FunctionDescriptor atexit$x0$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor atexit$x0_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle atexit$x0_UP$MH = RuntimeHelper.upcallHandle(atexit$x0.class, "apply", constants$918.atexit$x0_UP$FUNC);
    static final FunctionDescriptor atexit$x0_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle atexit$x0_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$918.atexit$x0_DOWN$FUNC
    );
    static final FunctionDescriptor atexit$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atexit$MH = RuntimeHelper.downcallHandle(
        "atexit",
        constants$918.atexit$FUNC
    );
    static final FunctionDescriptor _onexit$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _onexit$MH = RuntimeHelper.downcallHandle(
        "_onexit",
        constants$918._onexit$FUNC
    );
    static final FunctionDescriptor at_quick_exit$x0$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor at_quick_exit$x0_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle at_quick_exit$x0_UP$MH = RuntimeHelper.upcallHandle(at_quick_exit$x0.class, "apply", constants$918.at_quick_exit$x0_UP$FUNC);
    static final FunctionDescriptor at_quick_exit$x0_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle at_quick_exit$x0_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$918.at_quick_exit$x0_DOWN$FUNC
    );
}


