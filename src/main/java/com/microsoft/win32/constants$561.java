// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$561 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$561() {}
    static final FunctionDescriptor GetConsoleAliasesW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetConsoleAliasesW$MH = RuntimeHelper.downcallHandle(
        "GetConsoleAliasesW",
        constants$561.GetConsoleAliasesW$FUNC
    );
    static final FunctionDescriptor GetConsoleAliasExesA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetConsoleAliasExesA$MH = RuntimeHelper.downcallHandle(
        "GetConsoleAliasExesA",
        constants$561.GetConsoleAliasExesA$FUNC
    );
    static final FunctionDescriptor GetConsoleAliasExesW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetConsoleAliasExesW$MH = RuntimeHelper.downcallHandle(
        "GetConsoleAliasExesW",
        constants$561.GetConsoleAliasExesW$FUNC
    );
    static final FunctionDescriptor ExpungeConsoleCommandHistoryA$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ExpungeConsoleCommandHistoryA$MH = RuntimeHelper.downcallHandle(
        "ExpungeConsoleCommandHistoryA",
        constants$561.ExpungeConsoleCommandHistoryA$FUNC
    );
    static final FunctionDescriptor ExpungeConsoleCommandHistoryW$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ExpungeConsoleCommandHistoryW$MH = RuntimeHelper.downcallHandle(
        "ExpungeConsoleCommandHistoryW",
        constants$561.ExpungeConsoleCommandHistoryW$FUNC
    );
    static final FunctionDescriptor SetConsoleNumberOfCommandsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetConsoleNumberOfCommandsA$MH = RuntimeHelper.downcallHandle(
        "SetConsoleNumberOfCommandsA",
        constants$561.SetConsoleNumberOfCommandsA$FUNC
    );
}


