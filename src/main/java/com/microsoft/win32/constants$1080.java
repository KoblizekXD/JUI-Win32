// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1080 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1080() {}
    static final FunctionDescriptor StgCreateDocfile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StgCreateDocfile$MH = RuntimeHelper.downcallHandle(
        "StgCreateDocfile",
        constants$1080.StgCreateDocfile$FUNC
    );
    static final FunctionDescriptor StgCreateDocfileOnILockBytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StgCreateDocfileOnILockBytes$MH = RuntimeHelper.downcallHandle(
        "StgCreateDocfileOnILockBytes",
        constants$1080.StgCreateDocfileOnILockBytes$FUNC
    );
    static final FunctionDescriptor StgOpenStorage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StgOpenStorage$MH = RuntimeHelper.downcallHandle(
        "StgOpenStorage",
        constants$1080.StgOpenStorage$FUNC
    );
    static final FunctionDescriptor StgOpenStorageOnILockBytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StgOpenStorageOnILockBytes$MH = RuntimeHelper.downcallHandle(
        "StgOpenStorageOnILockBytes",
        constants$1080.StgOpenStorageOnILockBytes$FUNC
    );
    static final FunctionDescriptor StgIsStorageFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StgIsStorageFile$MH = RuntimeHelper.downcallHandle(
        "StgIsStorageFile",
        constants$1080.StgIsStorageFile$FUNC
    );
    static final FunctionDescriptor StgIsStorageILockBytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StgIsStorageILockBytes$MH = RuntimeHelper.downcallHandle(
        "StgIsStorageILockBytes",
        constants$1080.StgIsStorageILockBytes$FUNC
    );
}

