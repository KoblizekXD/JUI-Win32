// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$904 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$904() {}
    static final FunctionDescriptor realloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle realloc$MH = RuntimeHelper.downcallHandle(
        "realloc",
        constants$904.realloc$FUNC
    );
    static final FunctionDescriptor _recalloc_base$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _recalloc_base$MH = RuntimeHelper.downcallHandle(
        "_recalloc_base",
        constants$904._recalloc_base$FUNC
    );
    static final FunctionDescriptor _recalloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _recalloc$MH = RuntimeHelper.downcallHandle(
        "_recalloc",
        constants$904._recalloc$FUNC
    );
    static final FunctionDescriptor _aligned_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _aligned_free$MH = RuntimeHelper.downcallHandle(
        "_aligned_free",
        constants$904._aligned_free$FUNC
    );
    static final FunctionDescriptor _aligned_malloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _aligned_malloc$MH = RuntimeHelper.downcallHandle(
        "_aligned_malloc",
        constants$904._aligned_malloc$FUNC
    );
    static final FunctionDescriptor _aligned_offset_malloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _aligned_offset_malloc$MH = RuntimeHelper.downcallHandle(
        "_aligned_offset_malloc",
        constants$904._aligned_offset_malloc$FUNC
    );
}


