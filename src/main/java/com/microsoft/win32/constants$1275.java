// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1275 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1275() {}
    static final FunctionDescriptor ImmGetImeMenuItemsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ImmGetImeMenuItemsW$MH = RuntimeHelper.downcallHandle(
        "ImmGetImeMenuItemsW",
        constants$1275.ImmGetImeMenuItemsW$FUNC
    );
    static final FunctionDescriptor ImmDisableTextFrameService$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ImmDisableTextFrameService$MH = RuntimeHelper.downcallHandle(
        "ImmDisableTextFrameService",
        constants$1275.ImmDisableTextFrameService$FUNC
    );
    static final FunctionDescriptor ImmDisableLegacyIME$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle ImmDisableLegacyIME$MH = RuntimeHelper.downcallHandle(
        "ImmDisableLegacyIME",
        constants$1275.ImmDisableLegacyIME$FUNC
    );
    static final MemorySegment NULL$ADDR = MemorySegment.ofAddress(0L);
    static final MemorySegment __FILEW__$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("C");
    static final MemorySegment OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK_EXPORT_NAME$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("OutOfProcessFunctionTableCallback");
}

