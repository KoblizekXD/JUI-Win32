// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$213 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$213() {}
    static final FunctionDescriptor PGET_MODULE_HANDLE_EXW_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PGET_MODULE_HANDLE_EXW_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$213.PGET_MODULE_HANDLE_EXW_DOWN$FUNC
    );
    static final FunctionDescriptor GetModuleHandleExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetModuleHandleExA$MH = RuntimeHelper.downcallHandle(
        "GetModuleHandleExA",
        constants$213.GetModuleHandleExA$FUNC
    );
    static final FunctionDescriptor GetModuleHandleExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetModuleHandleExW$MH = RuntimeHelper.downcallHandle(
        "GetModuleHandleExW",
        constants$213.GetModuleHandleExW$FUNC
    );
    static final FunctionDescriptor GetProcAddress$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcAddress$MH = RuntimeHelper.downcallHandle(
        "GetProcAddress",
        constants$213.GetProcAddress$FUNC
    );
    static final FunctionDescriptor LoadLibraryExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LoadLibraryExA$MH = RuntimeHelper.downcallHandle(
        "LoadLibraryExA",
        constants$213.LoadLibraryExA$FUNC
    );
    static final FunctionDescriptor LoadLibraryExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LoadLibraryExW$MH = RuntimeHelper.downcallHandle(
        "LoadLibraryExW",
        constants$213.LoadLibraryExW$FUNC
    );
}


