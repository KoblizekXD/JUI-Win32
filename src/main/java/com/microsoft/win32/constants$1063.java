// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1063 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1063() {}
    static final FunctionDescriptor BSTR_UserUnmarshal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BSTR_UserUnmarshal$MH = RuntimeHelper.downcallHandle(
        "BSTR_UserUnmarshal",
        constants$1063.BSTR_UserUnmarshal$FUNC
    );
    static final FunctionDescriptor BSTR_UserFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BSTR_UserFree$MH = RuntimeHelper.downcallHandle(
        "BSTR_UserFree",
        constants$1063.BSTR_UserFree$FUNC
    );
    static final FunctionDescriptor CLEANLOCALSTORAGE_UserSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CLEANLOCALSTORAGE_UserSize$MH = RuntimeHelper.downcallHandle(
        "CLEANLOCALSTORAGE_UserSize",
        constants$1063.CLEANLOCALSTORAGE_UserSize$FUNC
    );
    static final FunctionDescriptor CLEANLOCALSTORAGE_UserMarshal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CLEANLOCALSTORAGE_UserMarshal$MH = RuntimeHelper.downcallHandle(
        "CLEANLOCALSTORAGE_UserMarshal",
        constants$1063.CLEANLOCALSTORAGE_UserMarshal$FUNC
    );
    static final FunctionDescriptor CLEANLOCALSTORAGE_UserUnmarshal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CLEANLOCALSTORAGE_UserUnmarshal$MH = RuntimeHelper.downcallHandle(
        "CLEANLOCALSTORAGE_UserUnmarshal",
        constants$1063.CLEANLOCALSTORAGE_UserUnmarshal$FUNC
    );
    static final FunctionDescriptor CLEANLOCALSTORAGE_UserFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CLEANLOCALSTORAGE_UserFree$MH = RuntimeHelper.downcallHandle(
        "CLEANLOCALSTORAGE_UserFree",
        constants$1063.CLEANLOCALSTORAGE_UserFree$FUNC
    );
}


