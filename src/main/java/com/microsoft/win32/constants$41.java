// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$41 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$41() {}
    static final FunctionDescriptor _interlockedbittestandset$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _interlockedbittestandset$MH = RuntimeHelper.downcallHandle(
        "_interlockedbittestandset",
        constants$41._interlockedbittestandset$FUNC
    );
    static final FunctionDescriptor _interlockedbittestandreset$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _interlockedbittestandreset$MH = RuntimeHelper.downcallHandle(
        "_interlockedbittestandreset",
        constants$41._interlockedbittestandreset$FUNC
    );
    static final FunctionDescriptor _bittest64$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _bittest64$MH = RuntimeHelper.downcallHandle(
        "_bittest64",
        constants$41._bittest64$FUNC
    );
    static final FunctionDescriptor _bittestandcomplement64$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _bittestandcomplement64$MH = RuntimeHelper.downcallHandle(
        "_bittestandcomplement64",
        constants$41._bittestandcomplement64$FUNC
    );
    static final FunctionDescriptor _bittestandset64$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _bittestandset64$MH = RuntimeHelper.downcallHandle(
        "_bittestandset64",
        constants$41._bittestandset64$FUNC
    );
    static final FunctionDescriptor _bittestandreset64$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _bittestandreset64$MH = RuntimeHelper.downcallHandle(
        "_bittestandreset64",
        constants$41._bittestandreset64$FUNC
    );
}


