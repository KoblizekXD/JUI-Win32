// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$744 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$744() {}
    static final FunctionDescriptor PFN_CMSG_STREAM_OUTPUT$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor PFN_CMSG_STREAM_OUTPUT_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFN_CMSG_STREAM_OUTPUT_UP$MH = RuntimeHelper.upcallHandle(PFN_CMSG_STREAM_OUTPUT.class, "apply", constants$744.PFN_CMSG_STREAM_OUTPUT_UP$FUNC);
    static final FunctionDescriptor PFN_CMSG_STREAM_OUTPUT_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFN_CMSG_STREAM_OUTPUT_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$744.PFN_CMSG_STREAM_OUTPUT_DOWN$FUNC
    );
    static final FunctionDescriptor CryptMsgOpenToEncode$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptMsgOpenToEncode$MH = RuntimeHelper.downcallHandle(
        "CryptMsgOpenToEncode",
        constants$744.CryptMsgOpenToEncode$FUNC
    );
    static final FunctionDescriptor CryptMsgCalculateEncodedLength$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptMsgCalculateEncodedLength$MH = RuntimeHelper.downcallHandle(
        "CryptMsgCalculateEncodedLength",
        constants$744.CryptMsgCalculateEncodedLength$FUNC
    );
    static final FunctionDescriptor CryptMsgOpenToDecode$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptMsgOpenToDecode$MH = RuntimeHelper.downcallHandle(
        "CryptMsgOpenToDecode",
        constants$744.CryptMsgOpenToDecode$FUNC
    );
    static final FunctionDescriptor CryptMsgDuplicate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptMsgDuplicate$MH = RuntimeHelper.downcallHandle(
        "CryptMsgDuplicate",
        constants$744.CryptMsgDuplicate$FUNC
    );
}


