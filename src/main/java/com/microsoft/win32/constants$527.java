// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$527 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$527() {}
    static final FunctionDescriptor FoldStringW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FoldStringW$MH = RuntimeHelper.downcallHandle(
        "FoldStringW",
        constants$527.FoldStringW$FUNC
    );
    static final FunctionDescriptor GetStringTypeExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetStringTypeExW$MH = RuntimeHelper.downcallHandle(
        "GetStringTypeExW",
        constants$527.GetStringTypeExW$FUNC
    );
    static final FunctionDescriptor GetStringTypeW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetStringTypeW$MH = RuntimeHelper.downcallHandle(
        "GetStringTypeW",
        constants$527.GetStringTypeW$FUNC
    );
    static final FunctionDescriptor MultiByteToWideChar$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MultiByteToWideChar$MH = RuntimeHelper.downcallHandle(
        "MultiByteToWideChar",
        constants$527.MultiByteToWideChar$FUNC
    );
    static final FunctionDescriptor WideCharToMultiByte$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WideCharToMultiByte$MH = RuntimeHelper.downcallHandle(
        "WideCharToMultiByte",
        constants$527.WideCharToMultiByte$FUNC
    );
    static final FunctionDescriptor IsValidCodePage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsValidCodePage$MH = RuntimeHelper.downcallHandle(
        "IsValidCodePage",
        constants$527.IsValidCodePage$FUNC
    );
}

