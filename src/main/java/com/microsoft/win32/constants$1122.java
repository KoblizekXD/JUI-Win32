// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1122 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1122() {}
    static final FunctionDescriptor MkParseDisplayNameEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MkParseDisplayNameEx$MH = RuntimeHelper.downcallHandle(
        "MkParseDisplayNameEx",
        constants$1122.MkParseDisplayNameEx$FUNC
    );
    static final FunctionDescriptor RegisterBindStatusCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterBindStatusCallback$MH = RuntimeHelper.downcallHandle(
        "RegisterBindStatusCallback",
        constants$1122.RegisterBindStatusCallback$FUNC
    );
    static final FunctionDescriptor RevokeBindStatusCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RevokeBindStatusCallback$MH = RuntimeHelper.downcallHandle(
        "RevokeBindStatusCallback",
        constants$1122.RevokeBindStatusCallback$FUNC
    );
    static final FunctionDescriptor GetClassFileOrMime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClassFileOrMime$MH = RuntimeHelper.downcallHandle(
        "GetClassFileOrMime",
        constants$1122.GetClassFileOrMime$FUNC
    );
    static final FunctionDescriptor IsValidURL$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsValidURL$MH = RuntimeHelper.downcallHandle(
        "IsValidURL",
        constants$1122.IsValidURL$FUNC
    );
    static final FunctionDescriptor CoGetClassObjectFromURL$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoGetClassObjectFromURL$MH = RuntimeHelper.downcallHandle(
        "CoGetClassObjectFromURL",
        constants$1122.CoGetClassObjectFromURL$FUNC
    );
}


