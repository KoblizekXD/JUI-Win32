// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$706 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$706() {}
    static final FunctionDescriptor SHSetUnreadMailCountW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHSetUnreadMailCountW$MH = RuntimeHelper.downcallHandle(
        "SHSetUnreadMailCountW",
        constants$706.SHSetUnreadMailCountW$FUNC
    );
    static final FunctionDescriptor SHTestTokenMembership$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SHTestTokenMembership$MH = RuntimeHelper.downcallHandle(
        "SHTestTokenMembership",
        constants$706.SHTestTokenMembership$FUNC
    );
    static final FunctionDescriptor SHGetImageList$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHGetImageList$MH = RuntimeHelper.downcallHandle(
        "SHGetImageList",
        constants$706.SHGetImageList$FUNC
    );
    static final FunctionDescriptor PFNCANSHAREFOLDERW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PFNCANSHAREFOLDERW_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNCANSHAREFOLDERW_UP$MH = RuntimeHelper.upcallHandle(PFNCANSHAREFOLDERW.class, "apply", constants$706.PFNCANSHAREFOLDERW_UP$FUNC);
    static final FunctionDescriptor PFNCANSHAREFOLDERW_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNCANSHAREFOLDERW_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$706.PFNCANSHAREFOLDERW_DOWN$FUNC
    );
    static final FunctionDescriptor PFNSHOWSHAREFOLDERUIW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PFNSHOWSHAREFOLDERUIW_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNSHOWSHAREFOLDERUIW_UP$MH = RuntimeHelper.upcallHandle(PFNSHOWSHAREFOLDERUIW.class, "apply", constants$706.PFNSHOWSHAREFOLDERUIW_UP$FUNC);
}


