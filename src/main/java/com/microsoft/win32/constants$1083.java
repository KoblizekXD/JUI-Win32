// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1083 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1083() {}
    static final FunctionDescriptor GetHGlobalFromILockBytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetHGlobalFromILockBytes$MH = RuntimeHelper.downcallHandle(
        "GetHGlobalFromILockBytes",
        constants$1083.GetHGlobalFromILockBytes$FUNC
    );
    static final FunctionDescriptor CreateILockBytesOnHGlobal$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateILockBytesOnHGlobal$MH = RuntimeHelper.downcallHandle(
        "CreateILockBytesOnHGlobal",
        constants$1083.CreateILockBytesOnHGlobal$FUNC
    );
    static final FunctionDescriptor GetConvertStg$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetConvertStg$MH = RuntimeHelper.downcallHandle(
        "GetConvertStg",
        constants$1083.GetConvertStg$FUNC
    );
    static final FunctionDescriptor CoBuildVersion$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CoBuildVersion$MH = RuntimeHelper.downcallHandle(
        "CoBuildVersion",
        constants$1083.CoBuildVersion$FUNC
    );
    static final FunctionDescriptor CoInitialize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoInitialize$MH = RuntimeHelper.downcallHandle(
        "CoInitialize",
        constants$1083.CoInitialize$FUNC
    );
    static final FunctionDescriptor CoRegisterMallocSpy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoRegisterMallocSpy$MH = RuntimeHelper.downcallHandle(
        "CoRegisterMallocSpy",
        constants$1083.CoRegisterMallocSpy$FUNC
    );
}

