// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$308 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$308() {}
    static final FunctionDescriptor VerifyVersionInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle VerifyVersionInfoW$MH = RuntimeHelper.downcallHandle(
        "VerifyVersionInfoW",
        constants$308.VerifyVersionInfoW$FUNC
    );
    static final FunctionDescriptor SystemTimeToTzSpecificLocalTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SystemTimeToTzSpecificLocalTime$MH = RuntimeHelper.downcallHandle(
        "SystemTimeToTzSpecificLocalTime",
        constants$308.SystemTimeToTzSpecificLocalTime$FUNC
    );
    static final FunctionDescriptor TzSpecificLocalTimeToSystemTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TzSpecificLocalTimeToSystemTime$MH = RuntimeHelper.downcallHandle(
        "TzSpecificLocalTimeToSystemTime",
        constants$308.TzSpecificLocalTimeToSystemTime$FUNC
    );
    static final FunctionDescriptor FileTimeToSystemTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FileTimeToSystemTime$MH = RuntimeHelper.downcallHandle(
        "FileTimeToSystemTime",
        constants$308.FileTimeToSystemTime$FUNC
    );
    static final FunctionDescriptor SystemTimeToFileTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SystemTimeToFileTime$MH = RuntimeHelper.downcallHandle(
        "SystemTimeToFileTime",
        constants$308.SystemTimeToFileTime$FUNC
    );
    static final FunctionDescriptor GetTimeZoneInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTimeZoneInformation$MH = RuntimeHelper.downcallHandle(
        "GetTimeZoneInformation",
        constants$308.GetTimeZoneInformation$FUNC
    );
}

