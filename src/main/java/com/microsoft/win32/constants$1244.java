// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1244 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1244() {}
    static final FunctionDescriptor ReplaceTextW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReplaceTextW$MH = RuntimeHelper.downcallHandle(
        "ReplaceTextW",
        constants$1244.ReplaceTextW$FUNC
    );
    static final FunctionDescriptor LPCFHOOKPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor LPCFHOOKPROC_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPCFHOOKPROC_UP$MH = RuntimeHelper.upcallHandle(LPCFHOOKPROC.class, "apply", constants$1244.LPCFHOOKPROC_UP$FUNC);
    static final FunctionDescriptor LPCFHOOKPROC_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPCFHOOKPROC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1244.LPCFHOOKPROC_DOWN$FUNC
    );
    static final FunctionDescriptor ChooseFontA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ChooseFontA$MH = RuntimeHelper.downcallHandle(
        "ChooseFontA",
        constants$1244.ChooseFontA$FUNC
    );
    static final FunctionDescriptor ChooseFontW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ChooseFontW$MH = RuntimeHelper.downcallHandle(
        "ChooseFontW",
        constants$1244.ChooseFontW$FUNC
    );
    static final FunctionDescriptor LPPRINTHOOKPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor LPPRINTHOOKPROC_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPPRINTHOOKPROC_UP$MH = RuntimeHelper.upcallHandle(LPPRINTHOOKPROC.class, "apply", constants$1244.LPPRINTHOOKPROC_UP$FUNC);
}

