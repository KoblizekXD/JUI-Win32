// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$865 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$865() {}
    static final FunctionDescriptor SCardLocateCardsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardLocateCardsW$MH = RuntimeHelper.downcallHandle(
        "SCardLocateCardsW",
        constants$865.SCardLocateCardsW$FUNC
    );
    static final FunctionDescriptor SCardLocateCardsByATRA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardLocateCardsByATRA$MH = RuntimeHelper.downcallHandle(
        "SCardLocateCardsByATRA",
        constants$865.SCardLocateCardsByATRA$FUNC
    );
    static final FunctionDescriptor SCardLocateCardsByATRW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardLocateCardsByATRW$MH = RuntimeHelper.downcallHandle(
        "SCardLocateCardsByATRW",
        constants$865.SCardLocateCardsByATRW$FUNC
    );
    static final FunctionDescriptor SCardGetStatusChangeA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardGetStatusChangeA$MH = RuntimeHelper.downcallHandle(
        "SCardGetStatusChangeA",
        constants$865.SCardGetStatusChangeA$FUNC
    );
    static final FunctionDescriptor SCardGetStatusChangeW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardGetStatusChangeW$MH = RuntimeHelper.downcallHandle(
        "SCardGetStatusChangeW",
        constants$865.SCardGetStatusChangeW$FUNC
    );
    static final FunctionDescriptor SCardCancel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SCardCancel$MH = RuntimeHelper.downcallHandle(
        "SCardCancel",
        constants$865.SCardCancel$FUNC
    );
}


