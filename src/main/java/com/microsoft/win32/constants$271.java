// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$271 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$271() {}
    static final FunctionDescriptor SetFirmwareEnvironmentVariableExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetFirmwareEnvironmentVariableExW$MH = RuntimeHelper.downcallHandle(
        "SetFirmwareEnvironmentVariableExW",
        constants$271.SetFirmwareEnvironmentVariableExW$FUNC
    );
    static final FunctionDescriptor GetFirmwareType$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFirmwareType$MH = RuntimeHelper.downcallHandle(
        "GetFirmwareType",
        constants$271.GetFirmwareType$FUNC
    );
    static final FunctionDescriptor IsNativeVhdBoot$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsNativeVhdBoot$MH = RuntimeHelper.downcallHandle(
        "IsNativeVhdBoot",
        constants$271.IsNativeVhdBoot$FUNC
    );
    static final FunctionDescriptor FindResourceA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindResourceA$MH = RuntimeHelper.downcallHandle(
        "FindResourceA",
        constants$271.FindResourceA$FUNC
    );
    static final FunctionDescriptor FindResourceExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle FindResourceExA$MH = RuntimeHelper.downcallHandle(
        "FindResourceExA",
        constants$271.FindResourceExA$FUNC
    );
    static final FunctionDescriptor EnumResourceTypesA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumResourceTypesA$MH = RuntimeHelper.downcallHandle(
        "EnumResourceTypesA",
        constants$271.EnumResourceTypesA$FUNC
    );
}


