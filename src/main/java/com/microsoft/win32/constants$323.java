// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$323 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$323() {}
    static final FunctionDescriptor GetThreadEnabledXStateFeatures$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle GetThreadEnabledXStateFeatures$MH = RuntimeHelper.downcallHandle(
        "GetThreadEnabledXStateFeatures",
        constants$323.GetThreadEnabledXStateFeatures$FUNC
    );
    static final FunctionDescriptor EnableProcessOptionalXStateFeatures$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnableProcessOptionalXStateFeatures$MH = RuntimeHelper.downcallHandle(
        "EnableProcessOptionalXStateFeatures",
        constants$323.EnableProcessOptionalXStateFeatures$FUNC
    );
    static final FunctionDescriptor EnableThreadProfiling$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnableThreadProfiling$MH = RuntimeHelper.downcallHandle(
        "EnableThreadProfiling",
        constants$323.EnableThreadProfiling$FUNC
    );
    static final FunctionDescriptor DisableThreadProfiling$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DisableThreadProfiling$MH = RuntimeHelper.downcallHandle(
        "DisableThreadProfiling",
        constants$323.DisableThreadProfiling$FUNC
    );
    static final FunctionDescriptor QueryThreadProfiling$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryThreadProfiling$MH = RuntimeHelper.downcallHandle(
        "QueryThreadProfiling",
        constants$323.QueryThreadProfiling$FUNC
    );
    static final FunctionDescriptor ReadThreadProfilingData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadThreadProfilingData$MH = RuntimeHelper.downcallHandle(
        "ReadThreadProfilingData",
        constants$323.ReadThreadProfilingData$FUNC
    );
}


