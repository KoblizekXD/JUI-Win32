// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$120 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$120() {}
    static final FunctionDescriptor FindFirstVolumeW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FindFirstVolumeW$MH = RuntimeHelper.downcallHandle(
        "FindFirstVolumeW",
        constants$120.FindFirstVolumeW$FUNC
    );
    static final FunctionDescriptor FindNextChangeNotification$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindNextChangeNotification$MH = RuntimeHelper.downcallHandle(
        "FindNextChangeNotification",
        constants$120.FindNextChangeNotification$FUNC
    );
    static final FunctionDescriptor FindNextFileA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindNextFileA$MH = RuntimeHelper.downcallHandle(
        "FindNextFileA",
        constants$120.FindNextFileA$FUNC
    );
    static final FunctionDescriptor FindNextFileW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindNextFileW$MH = RuntimeHelper.downcallHandle(
        "FindNextFileW",
        constants$120.FindNextFileW$FUNC
    );
    static final FunctionDescriptor FindNextVolumeW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FindNextVolumeW$MH = RuntimeHelper.downcallHandle(
        "FindNextVolumeW",
        constants$120.FindNextVolumeW$FUNC
    );
    static final FunctionDescriptor FindVolumeClose$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindVolumeClose$MH = RuntimeHelper.downcallHandle(
        "FindVolumeClose",
        constants$120.FindVolumeClose$FUNC
    );
}


