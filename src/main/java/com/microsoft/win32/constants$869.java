// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$869 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$869() {}
    static final FunctionDescriptor LPOCNCONNPROCW_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPOCNCONNPROCW_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$869.LPOCNCONNPROCW_DOWN$FUNC
    );
    static final FunctionDescriptor LPOCNCHKPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor LPOCNCHKPROC_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPOCNCHKPROC_UP$MH = RuntimeHelper.upcallHandle(LPOCNCHKPROC.class, "apply", constants$869.LPOCNCHKPROC_UP$FUNC);
    static final FunctionDescriptor LPOCNCHKPROC_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPOCNCHKPROC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$869.LPOCNCHKPROC_DOWN$FUNC
    );
    static final FunctionDescriptor LPOCNDSCPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor LPOCNDSCPROC_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPOCNDSCPROC_UP$MH = RuntimeHelper.upcallHandle(LPOCNDSCPROC.class, "apply", constants$869.LPOCNDSCPROC_UP$FUNC);
    static final FunctionDescriptor LPOCNDSCPROC_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPOCNDSCPROC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$869.LPOCNDSCPROC_DOWN$FUNC
    );
    static final FunctionDescriptor SCardUIDlgSelectCardA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardUIDlgSelectCardA$MH = RuntimeHelper.downcallHandle(
        "SCardUIDlgSelectCardA",
        constants$869.SCardUIDlgSelectCardA$FUNC
    );
}


