// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1201 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1201() {}
    static final FunctionDescriptor VarBoolFromDate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBoolFromDate$MH = RuntimeHelper.downcallHandle(
        "VarBoolFromDate",
        constants$1201.VarBoolFromDate$FUNC
    );
    static final FunctionDescriptor VarBoolFromCy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Lo"),
                Constants$root.C_LONG$LAYOUT.withName("Hi")
            ).withName("$anon$0"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("int64")
        ).withName("tagCY"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBoolFromCy$MH = RuntimeHelper.downcallHandle(
        "VarBoolFromCy",
        constants$1201.VarBoolFromCy$FUNC
    );
    static final FunctionDescriptor VarBoolFromStr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBoolFromStr$MH = RuntimeHelper.downcallHandle(
        "VarBoolFromStr",
        constants$1201.VarBoolFromStr$FUNC
    );
    static final FunctionDescriptor VarBoolFromDisp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBoolFromDisp$MH = RuntimeHelper.downcallHandle(
        "VarBoolFromDisp",
        constants$1201.VarBoolFromDisp$FUNC
    );
    static final FunctionDescriptor VarBoolFromI1$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBoolFromI1$MH = RuntimeHelper.downcallHandle(
        "VarBoolFromI1",
        constants$1201.VarBoolFromI1$FUNC
    );
    static final FunctionDescriptor VarBoolFromUI2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBoolFromUI2$MH = RuntimeHelper.downcallHandle(
        "VarBoolFromUI2",
        constants$1201.VarBoolFromUI2$FUNC
    );
}


