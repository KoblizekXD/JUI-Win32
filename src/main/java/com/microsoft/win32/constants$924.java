// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$924 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$924() {}
    static final FunctionDescriptor ldiv$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("quot"),
        Constants$root.C_LONG$LAYOUT.withName("rem")
    ).withName("_ldiv_t"),
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ldiv$MH = RuntimeHelper.downcallHandle(
        "ldiv",
        constants$924.ldiv$FUNC
    );
    static final FunctionDescriptor lldiv$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("quot"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("rem")
    ).withName("_lldiv_t"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle lldiv$MH = RuntimeHelper.downcallHandle(
        "lldiv",
        constants$924.lldiv$FUNC
    );
    static final FunctionDescriptor _lrotl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _lrotl$MH = RuntimeHelper.downcallHandle(
        "_lrotl",
        constants$924._lrotl$FUNC
    );
    static final FunctionDescriptor _lrotr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _lrotr$MH = RuntimeHelper.downcallHandle(
        "_lrotr",
        constants$924._lrotr$FUNC
    );
    static final FunctionDescriptor srand$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle srand$MH = RuntimeHelper.downcallHandle(
        "srand",
        constants$924.srand$FUNC
    );
    static final FunctionDescriptor rand$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle rand$MH = RuntimeHelper.downcallHandle(
        "rand",
        constants$924.rand$FUNC
    );
}


