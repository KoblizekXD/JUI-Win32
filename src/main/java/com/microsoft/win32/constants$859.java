// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$859 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$859() {}
    static final FunctionDescriptor SCardReleaseContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SCardReleaseContext$MH = RuntimeHelper.downcallHandle(
        "SCardReleaseContext",
        constants$859.SCardReleaseContext$FUNC
    );
    static final FunctionDescriptor SCardIsValidContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SCardIsValidContext$MH = RuntimeHelper.downcallHandle(
        "SCardIsValidContext",
        constants$859.SCardIsValidContext$FUNC
    );
    static final FunctionDescriptor SCardListReaderGroupsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardListReaderGroupsA$MH = RuntimeHelper.downcallHandle(
        "SCardListReaderGroupsA",
        constants$859.SCardListReaderGroupsA$FUNC
    );
    static final FunctionDescriptor SCardListReaderGroupsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardListReaderGroupsW$MH = RuntimeHelper.downcallHandle(
        "SCardListReaderGroupsW",
        constants$859.SCardListReaderGroupsW$FUNC
    );
    static final FunctionDescriptor SCardListReadersA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardListReadersA$MH = RuntimeHelper.downcallHandle(
        "SCardListReadersA",
        constants$859.SCardListReadersA$FUNC
    );
    static final FunctionDescriptor SCardListReadersW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardListReadersW$MH = RuntimeHelper.downcallHandle(
        "SCardListReadersW",
        constants$859.SCardListReadersW$FUNC
    );
}

