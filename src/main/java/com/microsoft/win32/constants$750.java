// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$750 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$750() {}
    static final FunctionDescriptor PFN_CMSG_IMPORT_MAIL_LIST$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PFN_CMSG_IMPORT_MAIL_LIST_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CMSG_IMPORT_MAIL_LIST_UP$MH = RuntimeHelper.upcallHandle(PFN_CMSG_IMPORT_MAIL_LIST.class, "apply", constants$750.PFN_CMSG_IMPORT_MAIL_LIST_UP$FUNC);
    static final FunctionDescriptor PFN_CMSG_IMPORT_MAIL_LIST_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CMSG_IMPORT_MAIL_LIST_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$750.PFN_CMSG_IMPORT_MAIL_LIST_DOWN$FUNC
    );
    static final FunctionDescriptor PFN_CMSG_CNG_IMPORT_KEY_TRANS$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PFN_CMSG_CNG_IMPORT_KEY_TRANS_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CMSG_CNG_IMPORT_KEY_TRANS_UP$MH = RuntimeHelper.upcallHandle(PFN_CMSG_CNG_IMPORT_KEY_TRANS.class, "apply", constants$750.PFN_CMSG_CNG_IMPORT_KEY_TRANS_UP$FUNC);
    static final FunctionDescriptor PFN_CMSG_CNG_IMPORT_KEY_TRANS_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CMSG_CNG_IMPORT_KEY_TRANS_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$750.PFN_CMSG_CNG_IMPORT_KEY_TRANS_DOWN$FUNC
    );
    static final FunctionDescriptor PFN_CMSG_CNG_IMPORT_KEY_AGREE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PFN_CMSG_CNG_IMPORT_KEY_AGREE_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CMSG_CNG_IMPORT_KEY_AGREE_UP$MH = RuntimeHelper.upcallHandle(PFN_CMSG_CNG_IMPORT_KEY_AGREE.class, "apply", constants$750.PFN_CMSG_CNG_IMPORT_KEY_AGREE_UP$FUNC);
    static final FunctionDescriptor PFN_CMSG_CNG_IMPORT_KEY_AGREE_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CMSG_CNG_IMPORT_KEY_AGREE_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$750.PFN_CMSG_CNG_IMPORT_KEY_AGREE_DOWN$FUNC
    );
}


