// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1037 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1037() {}
    static final FunctionDescriptor IStorage_OpenStream_Stub$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IStorage_OpenStream_Stub$MH = RuntimeHelper.downcallHandle(
        "IStorage_OpenStream_Stub",
        constants$1037.IStorage_OpenStream_Stub$FUNC
    );
    static final FunctionDescriptor IStorage_CopyTo_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IStorage_CopyTo_Proxy$MH = RuntimeHelper.downcallHandle(
        "IStorage_CopyTo_Proxy",
        constants$1037.IStorage_CopyTo_Proxy$FUNC
    );
    static final FunctionDescriptor IStorage_CopyTo_Stub$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IStorage_CopyTo_Stub$MH = RuntimeHelper.downcallHandle(
        "IStorage_CopyTo_Stub",
        constants$1037.IStorage_CopyTo_Stub$FUNC
    );
    static final FunctionDescriptor IStorage_EnumElements_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IStorage_EnumElements_Proxy$MH = RuntimeHelper.downcallHandle(
        "IStorage_EnumElements_Proxy",
        constants$1037.IStorage_EnumElements_Proxy$FUNC
    );
    static final FunctionDescriptor IStorage_EnumElements_Stub$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IStorage_EnumElements_Stub$MH = RuntimeHelper.downcallHandle(
        "IStorage_EnumElements_Stub",
        constants$1037.IStorage_EnumElements_Stub$FUNC
    );
    static final FunctionDescriptor ILockBytes_ReadAt_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("_ULARGE_INTEGER"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ILockBytes_ReadAt_Proxy$MH = RuntimeHelper.downcallHandle(
        "ILockBytes_ReadAt_Proxy",
        constants$1037.ILockBytes_ReadAt_Proxy$FUNC
    );
}


