// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$266 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$266() {}
    static final FunctionDescriptor _hread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _hread$MH = RuntimeHelper.downcallHandle(
        "_hread",
        constants$266._hread$FUNC
    );
    static final FunctionDescriptor _hwrite$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _hwrite$MH = RuntimeHelper.downcallHandle(
        "_hwrite",
        constants$266._hwrite$FUNC
    );
    static final FunctionDescriptor _lclose$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _lclose$MH = RuntimeHelper.downcallHandle(
        "_lclose",
        constants$266._lclose$FUNC
    );
    static final FunctionDescriptor _llseek$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _llseek$MH = RuntimeHelper.downcallHandle(
        "_llseek",
        constants$266._llseek$FUNC
    );
    static final FunctionDescriptor IsTextUnicode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsTextUnicode$MH = RuntimeHelper.downcallHandle(
        "IsTextUnicode",
        constants$266.IsTextUnicode$FUNC
    );
    static final FunctionDescriptor BackupRead$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BackupRead$MH = RuntimeHelper.downcallHandle(
        "BackupRead",
        constants$266.BackupRead$FUNC
    );
}

