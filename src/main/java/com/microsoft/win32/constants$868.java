// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$868 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$868() {}
    static final FunctionDescriptor SCardControl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardControl$MH = RuntimeHelper.downcallHandle(
        "SCardControl",
        constants$868.SCardControl$FUNC
    );
    static final FunctionDescriptor SCardGetAttrib$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardGetAttrib$MH = RuntimeHelper.downcallHandle(
        "SCardGetAttrib",
        constants$868.SCardGetAttrib$FUNC
    );
    static final FunctionDescriptor SCardSetAttrib$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardSetAttrib$MH = RuntimeHelper.downcallHandle(
        "SCardSetAttrib",
        constants$868.SCardSetAttrib$FUNC
    );
    static final FunctionDescriptor LPOCNCONNPROCA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor LPOCNCONNPROCA_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPOCNCONNPROCA_UP$MH = RuntimeHelper.upcallHandle(LPOCNCONNPROCA.class, "apply", constants$868.LPOCNCONNPROCA_UP$FUNC);
    static final FunctionDescriptor LPOCNCONNPROCA_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPOCNCONNPROCA_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$868.LPOCNCONNPROCA_DOWN$FUNC
    );
    static final FunctionDescriptor LPOCNCONNPROCW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor LPOCNCONNPROCW_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPOCNCONNPROCW_UP$MH = RuntimeHelper.upcallHandle(LPOCNCONNPROCW.class, "apply", constants$868.LPOCNCONNPROCW_UP$FUNC);
}

