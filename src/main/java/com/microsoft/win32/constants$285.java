// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$285 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$285() {}
    static final FunctionDescriptor DeleteFileTransactedW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteFileTransactedW$MH = RuntimeHelper.downcallHandle(
        "DeleteFileTransactedW",
        constants$285.DeleteFileTransactedW$FUNC
    );
    static final FunctionDescriptor CheckNameLegalDOS8Dot3A$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CheckNameLegalDOS8Dot3A$MH = RuntimeHelper.downcallHandle(
        "CheckNameLegalDOS8Dot3A",
        constants$285.CheckNameLegalDOS8Dot3A$FUNC
    );
    static final FunctionDescriptor CheckNameLegalDOS8Dot3W$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CheckNameLegalDOS8Dot3W$MH = RuntimeHelper.downcallHandle(
        "CheckNameLegalDOS8Dot3W",
        constants$285.CheckNameLegalDOS8Dot3W$FUNC
    );
    static final FunctionDescriptor FindFirstFileTransactedA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindFirstFileTransactedA$MH = RuntimeHelper.downcallHandle(
        "FindFirstFileTransactedA",
        constants$285.FindFirstFileTransactedA$FUNC
    );
    static final FunctionDescriptor FindFirstFileTransactedW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindFirstFileTransactedW$MH = RuntimeHelper.downcallHandle(
        "FindFirstFileTransactedW",
        constants$285.FindFirstFileTransactedW$FUNC
    );
    static final FunctionDescriptor CopyFileA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CopyFileA$MH = RuntimeHelper.downcallHandle(
        "CopyFileA",
        constants$285.CopyFileA$FUNC
    );
}


