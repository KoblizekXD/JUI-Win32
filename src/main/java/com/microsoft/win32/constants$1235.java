// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1235 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1235() {}
    static final FunctionDescriptor DoDragDrop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DoDragDrop$MH = RuntimeHelper.downcallHandle(
        "DoDragDrop",
        constants$1235.DoDragDrop$FUNC
    );
    static final FunctionDescriptor OleSetClipboard$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleSetClipboard$MH = RuntimeHelper.downcallHandle(
        "OleSetClipboard",
        constants$1235.OleSetClipboard$FUNC
    );
    static final FunctionDescriptor OleGetClipboard$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleGetClipboard$MH = RuntimeHelper.downcallHandle(
        "OleGetClipboard",
        constants$1235.OleGetClipboard$FUNC
    );
    static final FunctionDescriptor OleGetClipboardWithEnterpriseInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleGetClipboardWithEnterpriseInfo$MH = RuntimeHelper.downcallHandle(
        "OleGetClipboardWithEnterpriseInfo",
        constants$1235.OleGetClipboardWithEnterpriseInfo$FUNC
    );
    static final FunctionDescriptor OleFlushClipboard$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle OleFlushClipboard$MH = RuntimeHelper.downcallHandle(
        "OleFlushClipboard",
        constants$1235.OleFlushClipboard$FUNC
    );
    static final FunctionDescriptor OleIsCurrentClipboard$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleIsCurrentClipboard$MH = RuntimeHelper.downcallHandle(
        "OleIsCurrentClipboard",
        constants$1235.OleIsCurrentClipboard$FUNC
    );
}


