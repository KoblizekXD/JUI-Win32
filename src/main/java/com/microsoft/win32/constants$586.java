// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$586 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$586() {}
    static final FunctionDescriptor WNetEnumResourceA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetEnumResourceA$MH = RuntimeHelper.downcallHandle(
        "WNetEnumResourceA",
        constants$586.WNetEnumResourceA$FUNC
    );
    static final FunctionDescriptor WNetEnumResourceW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetEnumResourceW$MH = RuntimeHelper.downcallHandle(
        "WNetEnumResourceW",
        constants$586.WNetEnumResourceW$FUNC
    );
    static final FunctionDescriptor WNetCloseEnum$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetCloseEnum$MH = RuntimeHelper.downcallHandle(
        "WNetCloseEnum",
        constants$586.WNetCloseEnum$FUNC
    );
    static final FunctionDescriptor WNetGetResourceParentA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetGetResourceParentA$MH = RuntimeHelper.downcallHandle(
        "WNetGetResourceParentA",
        constants$586.WNetGetResourceParentA$FUNC
    );
    static final FunctionDescriptor WNetGetResourceParentW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetGetResourceParentW$MH = RuntimeHelper.downcallHandle(
        "WNetGetResourceParentW",
        constants$586.WNetGetResourceParentW$FUNC
    );
    static final FunctionDescriptor WNetGetResourceInformationA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetGetResourceInformationA$MH = RuntimeHelper.downcallHandle(
        "WNetGetResourceInformationA",
        constants$586.WNetGetResourceInformationA$FUNC
    );
}


