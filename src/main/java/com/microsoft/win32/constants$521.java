// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$521 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$521() {}
    static final FunctionDescriptor CODEPAGE_ENUMPROCA_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CODEPAGE_ENUMPROCA_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$521.CODEPAGE_ENUMPROCA_DOWN$FUNC
    );
    static final FunctionDescriptor DATEFMT_ENUMPROCA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor DATEFMT_ENUMPROCA_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DATEFMT_ENUMPROCA_UP$MH = RuntimeHelper.upcallHandle(DATEFMT_ENUMPROCA.class, "apply", constants$521.DATEFMT_ENUMPROCA_UP$FUNC);
    static final FunctionDescriptor DATEFMT_ENUMPROCA_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DATEFMT_ENUMPROCA_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$521.DATEFMT_ENUMPROCA_DOWN$FUNC
    );
    static final FunctionDescriptor DATEFMT_ENUMPROCEXA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor DATEFMT_ENUMPROCEXA_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DATEFMT_ENUMPROCEXA_UP$MH = RuntimeHelper.upcallHandle(DATEFMT_ENUMPROCEXA.class, "apply", constants$521.DATEFMT_ENUMPROCEXA_UP$FUNC);
    static final FunctionDescriptor DATEFMT_ENUMPROCEXA_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DATEFMT_ENUMPROCEXA_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$521.DATEFMT_ENUMPROCEXA_DOWN$FUNC
    );
    static final FunctionDescriptor TIMEFMT_ENUMPROCA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor TIMEFMT_ENUMPROCA_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TIMEFMT_ENUMPROCA_UP$MH = RuntimeHelper.upcallHandle(TIMEFMT_ENUMPROCA.class, "apply", constants$521.TIMEFMT_ENUMPROCA_UP$FUNC);
}


