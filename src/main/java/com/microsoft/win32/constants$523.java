// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$523 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$523() {}
    static final FunctionDescriptor LANGUAGEGROUP_ENUMPROCW_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LANGUAGEGROUP_ENUMPROCW_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$523.LANGUAGEGROUP_ENUMPROCW_DOWN$FUNC
    );
    static final FunctionDescriptor LANGGROUPLOCALE_ENUMPROCW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor LANGGROUPLOCALE_ENUMPROCW_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LANGGROUPLOCALE_ENUMPROCW_UP$MH = RuntimeHelper.upcallHandle(LANGGROUPLOCALE_ENUMPROCW.class, "apply", constants$523.LANGGROUPLOCALE_ENUMPROCW_UP$FUNC);
    static final FunctionDescriptor LANGGROUPLOCALE_ENUMPROCW_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LANGGROUPLOCALE_ENUMPROCW_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$523.LANGGROUPLOCALE_ENUMPROCW_DOWN$FUNC
    );
    static final FunctionDescriptor UILANGUAGE_ENUMPROCW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor UILANGUAGE_ENUMPROCW_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle UILANGUAGE_ENUMPROCW_UP$MH = RuntimeHelper.upcallHandle(UILANGUAGE_ENUMPROCW.class, "apply", constants$523.UILANGUAGE_ENUMPROCW_UP$FUNC);
    static final FunctionDescriptor UILANGUAGE_ENUMPROCW_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle UILANGUAGE_ENUMPROCW_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$523.UILANGUAGE_ENUMPROCW_DOWN$FUNC
    );
    static final FunctionDescriptor CODEPAGE_ENUMPROCW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor CODEPAGE_ENUMPROCW_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CODEPAGE_ENUMPROCW_UP$MH = RuntimeHelper.upcallHandle(CODEPAGE_ENUMPROCW.class, "apply", constants$523.CODEPAGE_ENUMPROCW_UP$FUNC);
}

