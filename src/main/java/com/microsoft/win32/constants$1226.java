// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1226 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1226() {}
    static final FunctionDescriptor LoadTypeLibEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadTypeLibEx$MH = RuntimeHelper.downcallHandle(
        "LoadTypeLibEx",
        constants$1226.LoadTypeLibEx$FUNC
    );
    static final FunctionDescriptor LoadRegTypeLib$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadRegTypeLib$MH = RuntimeHelper.downcallHandle(
        "LoadRegTypeLib",
        constants$1226.LoadRegTypeLib$FUNC
    );
    static final FunctionDescriptor QueryPathOfRegTypeLib$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryPathOfRegTypeLib$MH = RuntimeHelper.downcallHandle(
        "QueryPathOfRegTypeLib",
        constants$1226.QueryPathOfRegTypeLib$FUNC
    );
    static final FunctionDescriptor RegisterTypeLib$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterTypeLib$MH = RuntimeHelper.downcallHandle(
        "RegisterTypeLib",
        constants$1226.RegisterTypeLib$FUNC
    );
    static final FunctionDescriptor UnRegisterTypeLib$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle UnRegisterTypeLib$MH = RuntimeHelper.downcallHandle(
        "UnRegisterTypeLib",
        constants$1226.UnRegisterTypeLib$FUNC
    );
    static final FunctionDescriptor RegisterTypeLibForUser$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterTypeLibForUser$MH = RuntimeHelper.downcallHandle(
        "RegisterTypeLibForUser",
        constants$1226.RegisterTypeLibForUser$FUNC
    );
}


