// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$531 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$531() {}
    static final FunctionDescriptor IsDBCSLeadByte$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle IsDBCSLeadByte$MH = RuntimeHelper.downcallHandle(
        "IsDBCSLeadByte",
        constants$531.IsDBCSLeadByte$FUNC
    );
    static final FunctionDescriptor IsDBCSLeadByteEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle IsDBCSLeadByteEx$MH = RuntimeHelper.downcallHandle(
        "IsDBCSLeadByteEx",
        constants$531.IsDBCSLeadByteEx$FUNC
    );
    static final FunctionDescriptor LocaleNameToLCID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LocaleNameToLCID$MH = RuntimeHelper.downcallHandle(
        "LocaleNameToLCID",
        constants$531.LocaleNameToLCID$FUNC
    );
    static final FunctionDescriptor LCIDToLocaleName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LCIDToLocaleName$MH = RuntimeHelper.downcallHandle(
        "LCIDToLocaleName",
        constants$531.LCIDToLocaleName$FUNC
    );
    static final FunctionDescriptor GetDurationFormat$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetDurationFormat$MH = RuntimeHelper.downcallHandle(
        "GetDurationFormat",
        constants$531.GetDurationFormat$FUNC
    );
    static final FunctionDescriptor GetNumberFormatA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetNumberFormatA$MH = RuntimeHelper.downcallHandle(
        "GetNumberFormatA",
        constants$531.GetNumberFormatA$FUNC
    );
}

