// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$396 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$396() {}
    static final FunctionDescriptor WINSTAENUMPROCA_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WINSTAENUMPROCA_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$396.WINSTAENUMPROCA_DOWN$FUNC
    );
    static final FunctionDescriptor DESKTOPENUMPROCA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor DESKTOPENUMPROCA_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle DESKTOPENUMPROCA_UP$MH = RuntimeHelper.upcallHandle(DESKTOPENUMPROCA.class, "apply", constants$396.DESKTOPENUMPROCA_UP$FUNC);
    static final FunctionDescriptor DESKTOPENUMPROCA_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle DESKTOPENUMPROCA_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$396.DESKTOPENUMPROCA_DOWN$FUNC
    );
    static final FunctionDescriptor WINSTAENUMPROCW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor WINSTAENUMPROCW_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WINSTAENUMPROCW_UP$MH = RuntimeHelper.upcallHandle(WINSTAENUMPROCW.class, "apply", constants$396.WINSTAENUMPROCW_UP$FUNC);
    static final FunctionDescriptor WINSTAENUMPROCW_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WINSTAENUMPROCW_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$396.WINSTAENUMPROCW_DOWN$FUNC
    );
    static final FunctionDescriptor DESKTOPENUMPROCW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor DESKTOPENUMPROCW_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle DESKTOPENUMPROCW_UP$MH = RuntimeHelper.upcallHandle(DESKTOPENUMPROCW.class, "apply", constants$396.DESKTOPENUMPROCW_UP$FUNC);
}


