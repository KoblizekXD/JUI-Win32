// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1245 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1245() {}
    static final FunctionDescriptor LPPRINTHOOKPROC_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPPRINTHOOKPROC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1245.LPPRINTHOOKPROC_DOWN$FUNC
    );
    static final FunctionDescriptor LPSETUPHOOKPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor LPSETUPHOOKPROC_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPSETUPHOOKPROC_UP$MH = RuntimeHelper.upcallHandle(LPSETUPHOOKPROC.class, "apply", constants$1245.LPSETUPHOOKPROC_UP$FUNC);
    static final FunctionDescriptor LPSETUPHOOKPROC_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPSETUPHOOKPROC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1245.LPSETUPHOOKPROC_DOWN$FUNC
    );
    static final FunctionDescriptor PrintDlgA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PrintDlgA$MH = RuntimeHelper.downcallHandle(
        "PrintDlgA",
        constants$1245.PrintDlgA$FUNC
    );
    static final FunctionDescriptor PrintDlgW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PrintDlgW$MH = RuntimeHelper.downcallHandle(
        "PrintDlgW",
        constants$1245.PrintDlgW$FUNC
    );
    static final FunctionDescriptor PrintDlgExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PrintDlgExA$MH = RuntimeHelper.downcallHandle(
        "PrintDlgExA",
        constants$1245.PrintDlgExA$FUNC
    );
}


