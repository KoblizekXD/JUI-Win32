// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$536 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$536() {}
    static final FunctionDescriptor SetUserGeoName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetUserGeoName$MH = RuntimeHelper.downcallHandle(
        "SetUserGeoName",
        constants$536.SetUserGeoName$FUNC
    );
    static final FunctionDescriptor ConvertDefaultLocale$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ConvertDefaultLocale$MH = RuntimeHelper.downcallHandle(
        "ConvertDefaultLocale",
        constants$536.ConvertDefaultLocale$FUNC
    );
    static final FunctionDescriptor GetSystemDefaultUILanguage$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT);
    static final MethodHandle GetSystemDefaultUILanguage$MH = RuntimeHelper.downcallHandle(
        "GetSystemDefaultUILanguage",
        constants$536.GetSystemDefaultUILanguage$FUNC
    );
    static final FunctionDescriptor GetThreadLocale$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetThreadLocale$MH = RuntimeHelper.downcallHandle(
        "GetThreadLocale",
        constants$536.GetThreadLocale$FUNC
    );
    static final FunctionDescriptor SetThreadLocale$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadLocale$MH = RuntimeHelper.downcallHandle(
        "SetThreadLocale",
        constants$536.SetThreadLocale$FUNC
    );
    static final FunctionDescriptor GetUserDefaultUILanguage$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT);
    static final MethodHandle GetUserDefaultUILanguage$MH = RuntimeHelper.downcallHandle(
        "GetUserDefaultUILanguage",
        constants$536.GetUserDefaultUILanguage$FUNC
    );
}


