// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$261 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$261() {}
    static final FunctionDescriptor DecryptFileA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DecryptFileA$MH = RuntimeHelper.downcallHandle(
        "DecryptFileA",
        constants$261.DecryptFileA$FUNC
    );
    static final FunctionDescriptor DecryptFileW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DecryptFileW$MH = RuntimeHelper.downcallHandle(
        "DecryptFileW",
        constants$261.DecryptFileW$FUNC
    );
    static final FunctionDescriptor FileEncryptionStatusA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FileEncryptionStatusA$MH = RuntimeHelper.downcallHandle(
        "FileEncryptionStatusA",
        constants$261.FileEncryptionStatusA$FUNC
    );
    static final FunctionDescriptor FileEncryptionStatusW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FileEncryptionStatusW$MH = RuntimeHelper.downcallHandle(
        "FileEncryptionStatusW",
        constants$261.FileEncryptionStatusW$FUNC
    );
    static final FunctionDescriptor PFE_EXPORT_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor PFE_EXPORT_FUNC_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFE_EXPORT_FUNC_UP$MH = RuntimeHelper.upcallHandle(PFE_EXPORT_FUNC.class, "apply", constants$261.PFE_EXPORT_FUNC_UP$FUNC);
    static final FunctionDescriptor PFE_EXPORT_FUNC_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFE_EXPORT_FUNC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$261.PFE_EXPORT_FUNC_DOWN$FUNC
    );
}


