// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$230 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$230() {}
    static final FunctionDescriptor MakeSelfRelativeSD$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MakeSelfRelativeSD$MH = RuntimeHelper.downcallHandle(
        "MakeSelfRelativeSD",
        constants$230.MakeSelfRelativeSD$FUNC
    );
    static final FunctionDescriptor MapGenericMask$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MapGenericMask$MH = RuntimeHelper.downcallHandle(
        "MapGenericMask",
        constants$230.MapGenericMask$FUNC
    );
    static final FunctionDescriptor ObjectCloseAuditAlarmW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ObjectCloseAuditAlarmW$MH = RuntimeHelper.downcallHandle(
        "ObjectCloseAuditAlarmW",
        constants$230.ObjectCloseAuditAlarmW$FUNC
    );
    static final FunctionDescriptor ObjectDeleteAuditAlarmW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ObjectDeleteAuditAlarmW$MH = RuntimeHelper.downcallHandle(
        "ObjectDeleteAuditAlarmW",
        constants$230.ObjectDeleteAuditAlarmW$FUNC
    );
    static final FunctionDescriptor ObjectOpenAuditAlarmW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ObjectOpenAuditAlarmW$MH = RuntimeHelper.downcallHandle(
        "ObjectOpenAuditAlarmW",
        constants$230.ObjectOpenAuditAlarmW$FUNC
    );
    static final FunctionDescriptor ObjectPrivilegeAuditAlarmW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ObjectPrivilegeAuditAlarmW$MH = RuntimeHelper.downcallHandle(
        "ObjectPrivilegeAuditAlarmW",
        constants$230.ObjectPrivilegeAuditAlarmW$FUNC
    );
}


