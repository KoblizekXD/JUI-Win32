// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1213 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1213() {}
    static final FunctionDescriptor VarDecFromI8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarDecFromI8$MH = RuntimeHelper.downcallHandle(
        "VarDecFromI8",
        constants$1213.VarDecFromI8$FUNC
    );
    static final FunctionDescriptor VarDecFromR4$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarDecFromR4$MH = RuntimeHelper.downcallHandle(
        "VarDecFromR4",
        constants$1213.VarDecFromR4$FUNC
    );
    static final FunctionDescriptor VarDecFromR8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarDecFromR8$MH = RuntimeHelper.downcallHandle(
        "VarDecFromR8",
        constants$1213.VarDecFromR8$FUNC
    );
    static final FunctionDescriptor VarDecFromDate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarDecFromDate$MH = RuntimeHelper.downcallHandle(
        "VarDecFromDate",
        constants$1213.VarDecFromDate$FUNC
    );
    static final FunctionDescriptor VarDecFromCy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Lo"),
                Constants$root.C_LONG$LAYOUT.withName("Hi")
            ).withName("$anon$0"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("int64")
        ).withName("tagCY"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarDecFromCy$MH = RuntimeHelper.downcallHandle(
        "VarDecFromCy",
        constants$1213.VarDecFromCy$FUNC
    );
    static final FunctionDescriptor VarDecFromStr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarDecFromStr$MH = RuntimeHelper.downcallHandle(
        "VarDecFromStr",
        constants$1213.VarDecFromStr$FUNC
    );
}


