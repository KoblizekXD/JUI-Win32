// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$545 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$545() {}
    static final FunctionDescriptor LCMapStringEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LCMapStringEx$MH = RuntimeHelper.downcallHandle(
        "LCMapStringEx",
        constants$545.LCMapStringEx$FUNC
    );
    static final FunctionDescriptor IsValidLocaleName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsValidLocaleName$MH = RuntimeHelper.downcallHandle(
        "IsValidLocaleName",
        constants$545.IsValidLocaleName$FUNC
    );
    static final FunctionDescriptor CALINFO_ENUMPROCEXEX$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor CALINFO_ENUMPROCEXEX_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle CALINFO_ENUMPROCEXEX_UP$MH = RuntimeHelper.upcallHandle(CALINFO_ENUMPROCEXEX.class, "apply", constants$545.CALINFO_ENUMPROCEXEX_UP$FUNC);
    static final FunctionDescriptor CALINFO_ENUMPROCEXEX_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle CALINFO_ENUMPROCEXEX_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$545.CALINFO_ENUMPROCEXEX_DOWN$FUNC
    );
    static final FunctionDescriptor EnumCalendarInfoExEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumCalendarInfoExEx$MH = RuntimeHelper.downcallHandle(
        "EnumCalendarInfoExEx",
        constants$545.EnumCalendarInfoExEx$FUNC
    );
    static final FunctionDescriptor DATEFMT_ENUMPROCEXEX$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor DATEFMT_ENUMPROCEXEX_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle DATEFMT_ENUMPROCEXEX_UP$MH = RuntimeHelper.upcallHandle(DATEFMT_ENUMPROCEXEX.class, "apply", constants$545.DATEFMT_ENUMPROCEXEX_UP$FUNC);
}

