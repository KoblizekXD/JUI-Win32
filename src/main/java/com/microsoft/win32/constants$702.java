// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$702 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$702() {}
    static final FunctionDescriptor Shell_NotifyIconGetRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Shell_NotifyIconGetRect$MH = RuntimeHelper.downcallHandle(
        "Shell_NotifyIconGetRect",
        constants$702.Shell_NotifyIconGetRect$FUNC
    );
    static final FunctionDescriptor SHGetFileInfoA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SHGetFileInfoA$MH = RuntimeHelper.downcallHandle(
        "SHGetFileInfoA",
        constants$702.SHGetFileInfoA$FUNC
    );
    static final FunctionDescriptor SHGetFileInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SHGetFileInfoW$MH = RuntimeHelper.downcallHandle(
        "SHGetFileInfoW",
        constants$702.SHGetFileInfoW$FUNC
    );
    static final FunctionDescriptor SHGetStockIconInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHGetStockIconInfo$MH = RuntimeHelper.downcallHandle(
        "SHGetStockIconInfo",
        constants$702.SHGetStockIconInfo$FUNC
    );
    static final FunctionDescriptor SHGetDiskFreeSpaceExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHGetDiskFreeSpaceExA$MH = RuntimeHelper.downcallHandle(
        "SHGetDiskFreeSpaceExA",
        constants$702.SHGetDiskFreeSpaceExA$FUNC
    );
    static final FunctionDescriptor SHGetDiskFreeSpaceExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHGetDiskFreeSpaceExW$MH = RuntimeHelper.downcallHandle(
        "SHGetDiskFreeSpaceExW",
        constants$702.SHGetDiskFreeSpaceExW$FUNC
    );
}


