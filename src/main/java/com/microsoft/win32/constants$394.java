// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$394 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$394() {}
    static final FunctionDescriptor DRAWSTATEPROC_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DRAWSTATEPROC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$394.DRAWSTATEPROC_DOWN$FUNC
    );
    static final FunctionDescriptor PROPENUMPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PROPENUMPROC_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PROPENUMPROC_UP$MH = RuntimeHelper.upcallHandle(PROPENUMPROC.class, "apply", constants$394.PROPENUMPROC_UP$FUNC);
    static final FunctionDescriptor PROPENUMPROC_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PROPENUMPROC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$394.PROPENUMPROC_DOWN$FUNC
    );
    static final FunctionDescriptor PROPENUMPROCEX$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor PROPENUMPROCEX_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle PROPENUMPROCEX_UP$MH = RuntimeHelper.upcallHandle(PROPENUMPROCEX.class, "apply", constants$394.PROPENUMPROCEX_UP$FUNC);
    static final FunctionDescriptor PROPENUMPROCEX_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle PROPENUMPROCEX_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$394.PROPENUMPROCEX_DOWN$FUNC
    );
    static final FunctionDescriptor EDITWORDBREAKPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor EDITWORDBREAKPROC_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EDITWORDBREAKPROC_UP$MH = RuntimeHelper.upcallHandle(EDITWORDBREAKPROC.class, "apply", constants$394.EDITWORDBREAKPROC_UP$FUNC);
}


