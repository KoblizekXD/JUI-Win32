// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1264 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1264() {}
    static final FunctionDescriptor IMCENUMPROC_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle IMCENUMPROC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1264.IMCENUMPROC_DOWN$FUNC
    );
    static final FunctionDescriptor ImmInstallIMEA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ImmInstallIMEA$MH = RuntimeHelper.downcallHandle(
        "ImmInstallIMEA",
        constants$1264.ImmInstallIMEA$FUNC
    );
    static final FunctionDescriptor ImmInstallIMEW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ImmInstallIMEW$MH = RuntimeHelper.downcallHandle(
        "ImmInstallIMEW",
        constants$1264.ImmInstallIMEW$FUNC
    );
    static final FunctionDescriptor ImmGetDefaultIMEWnd$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ImmGetDefaultIMEWnd$MH = RuntimeHelper.downcallHandle(
        "ImmGetDefaultIMEWnd",
        constants$1264.ImmGetDefaultIMEWnd$FUNC
    );
    static final FunctionDescriptor ImmGetDescriptionA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ImmGetDescriptionA$MH = RuntimeHelper.downcallHandle(
        "ImmGetDescriptionA",
        constants$1264.ImmGetDescriptionA$FUNC
    );
    static final FunctionDescriptor ImmGetDescriptionW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ImmGetDescriptionW$MH = RuntimeHelper.downcallHandle(
        "ImmGetDescriptionW",
        constants$1264.ImmGetDescriptionW$FUNC
    );
}

