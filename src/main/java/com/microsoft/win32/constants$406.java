// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$406 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$406() {}
    static final FunctionDescriptor DrawFrameControl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DrawFrameControl$MH = RuntimeHelper.downcallHandle(
        "DrawFrameControl",
        constants$406.DrawFrameControl$FUNC
    );
    static final FunctionDescriptor DrawCaption$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DrawCaption$MH = RuntimeHelper.downcallHandle(
        "DrawCaption",
        constants$406.DrawCaption$FUNC
    );
    static final FunctionDescriptor DrawAnimatedRects$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DrawAnimatedRects$MH = RuntimeHelper.downcallHandle(
        "DrawAnimatedRects",
        constants$406.DrawAnimatedRects$FUNC
    );
    static final FunctionDescriptor GetMessageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetMessageA$MH = RuntimeHelper.downcallHandle(
        "GetMessageA",
        constants$406.GetMessageA$FUNC
    );
    static final FunctionDescriptor GetMessageW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetMessageW$MH = RuntimeHelper.downcallHandle(
        "GetMessageW",
        constants$406.GetMessageW$FUNC
    );
    static final FunctionDescriptor TranslateMessage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TranslateMessage$MH = RuntimeHelper.downcallHandle(
        "TranslateMessage",
        constants$406.TranslateMessage$FUNC
    );
}


