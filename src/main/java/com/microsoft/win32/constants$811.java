// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$811 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$811() {}
    static final FunctionDescriptor XMIT_HELPER_ROUTINE_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XMIT_HELPER_ROUTINE_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$811.XMIT_HELPER_ROUTINE_DOWN$FUNC
    );
    static final FunctionDescriptor USER_MARSHAL_SIZING_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor USER_MARSHAL_SIZING_ROUTINE_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle USER_MARSHAL_SIZING_ROUTINE_UP$MH = RuntimeHelper.upcallHandle(USER_MARSHAL_SIZING_ROUTINE.class, "apply", constants$811.USER_MARSHAL_SIZING_ROUTINE_UP$FUNC);
    static final FunctionDescriptor USER_MARSHAL_SIZING_ROUTINE_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle USER_MARSHAL_SIZING_ROUTINE_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$811.USER_MARSHAL_SIZING_ROUTINE_DOWN$FUNC
    );
    static final FunctionDescriptor USER_MARSHAL_MARSHALLING_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor USER_MARSHAL_MARSHALLING_ROUTINE_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle USER_MARSHAL_MARSHALLING_ROUTINE_UP$MH = RuntimeHelper.upcallHandle(USER_MARSHAL_MARSHALLING_ROUTINE.class, "apply", constants$811.USER_MARSHAL_MARSHALLING_ROUTINE_UP$FUNC);
    static final FunctionDescriptor USER_MARSHAL_MARSHALLING_ROUTINE_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle USER_MARSHAL_MARSHALLING_ROUTINE_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$811.USER_MARSHAL_MARSHALLING_ROUTINE_DOWN$FUNC
    );
    static final FunctionDescriptor USER_MARSHAL_UNMARSHALLING_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor USER_MARSHAL_UNMARSHALLING_ROUTINE_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle USER_MARSHAL_UNMARSHALLING_ROUTINE_UP$MH = RuntimeHelper.upcallHandle(USER_MARSHAL_UNMARSHALLING_ROUTINE.class, "apply", constants$811.USER_MARSHAL_UNMARSHALLING_ROUTINE_UP$FUNC);
}

