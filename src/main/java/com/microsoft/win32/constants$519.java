// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$519 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$519() {}
    static final FunctionDescriptor GetDurationFormatEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetDurationFormatEx$MH = RuntimeHelper.downcallHandle(
        "GetDurationFormatEx",
        constants$519.GetDurationFormatEx$FUNC
    );
    static final FunctionDescriptor LOCALE_ENUMPROCA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor LOCALE_ENUMPROCA_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LOCALE_ENUMPROCA_UP$MH = RuntimeHelper.upcallHandle(LOCALE_ENUMPROCA.class, "apply", constants$519.LOCALE_ENUMPROCA_UP$FUNC);
    static final FunctionDescriptor LOCALE_ENUMPROCA_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LOCALE_ENUMPROCA_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$519.LOCALE_ENUMPROCA_DOWN$FUNC
    );
    static final FunctionDescriptor LOCALE_ENUMPROCW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor LOCALE_ENUMPROCW_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LOCALE_ENUMPROCW_UP$MH = RuntimeHelper.upcallHandle(LOCALE_ENUMPROCW.class, "apply", constants$519.LOCALE_ENUMPROCW_UP$FUNC);
    static final FunctionDescriptor LOCALE_ENUMPROCW_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LOCALE_ENUMPROCW_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$519.LOCALE_ENUMPROCW_DOWN$FUNC
    );
    static final FunctionDescriptor LANGUAGEGROUP_ENUMPROCA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor LANGUAGEGROUP_ENUMPROCA_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LANGUAGEGROUP_ENUMPROCA_UP$MH = RuntimeHelper.upcallHandle(LANGUAGEGROUP_ENUMPROCA.class, "apply", constants$519.LANGUAGEGROUP_ENUMPROCA_UP$FUNC);
}


