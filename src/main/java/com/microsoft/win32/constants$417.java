// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$417 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$417() {}
    static final FunctionDescriptor GetClassInfoExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClassInfoExW$MH = RuntimeHelper.downcallHandle(
        "GetClassInfoExW",
        constants$417.GetClassInfoExW$FUNC
    );
    static final FunctionDescriptor PREGISTERCLASSNAMEW$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PREGISTERCLASSNAMEW_UP$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PREGISTERCLASSNAMEW_UP$MH = RuntimeHelper.upcallHandle(PREGISTERCLASSNAMEW.class, "apply", constants$417.PREGISTERCLASSNAMEW_UP$FUNC);
    static final FunctionDescriptor PREGISTERCLASSNAMEW_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PREGISTERCLASSNAMEW_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$417.PREGISTERCLASSNAMEW_DOWN$FUNC
    );
    static final FunctionDescriptor CreateWindowExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateWindowExA$MH = RuntimeHelper.downcallHandle(
        "CreateWindowExA",
        constants$417.CreateWindowExA$FUNC
    );
    static final FunctionDescriptor CreateWindowExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateWindowExW$MH = RuntimeHelper.downcallHandle(
        "CreateWindowExW",
        constants$417.CreateWindowExW$FUNC
    );
    static final FunctionDescriptor IsWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsWindow$MH = RuntimeHelper.downcallHandle(
        "IsWindow",
        constants$417.IsWindow$FUNC
    );
}

