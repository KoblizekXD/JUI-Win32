// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$493 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$493() {}
    static final FunctionDescriptor LookupIconIdFromDirectory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LookupIconIdFromDirectory$MH = RuntimeHelper.downcallHandle(
        "LookupIconIdFromDirectory",
        constants$493.LookupIconIdFromDirectory$FUNC
    );
    static final FunctionDescriptor LookupIconIdFromDirectoryEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LookupIconIdFromDirectoryEx$MH = RuntimeHelper.downcallHandle(
        "LookupIconIdFromDirectoryEx",
        constants$493.LookupIconIdFromDirectoryEx$FUNC
    );
    static final FunctionDescriptor CreateIconFromResource$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateIconFromResource$MH = RuntimeHelper.downcallHandle(
        "CreateIconFromResource",
        constants$493.CreateIconFromResource$FUNC
    );
    static final FunctionDescriptor CreateIconFromResourceEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateIconFromResourceEx$MH = RuntimeHelper.downcallHandle(
        "CreateIconFromResourceEx",
        constants$493.CreateIconFromResourceEx$FUNC
    );
    static final FunctionDescriptor SetThreadCursorCreationScaling$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadCursorCreationScaling$MH = RuntimeHelper.downcallHandle(
        "SetThreadCursorCreationScaling",
        constants$493.SetThreadCursorCreationScaling$FUNC
    );
    static final FunctionDescriptor LoadImageA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LoadImageA$MH = RuntimeHelper.downcallHandle(
        "LoadImageA",
        constants$493.LoadImageA$FUNC
    );
}

