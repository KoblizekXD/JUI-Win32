// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$70 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$70() {}
    static final StructLayout GUID_SYSTEM_BUTTON_SUBGROUP$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_SYSTEM_BUTTON_SUBGROUP$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_SYSTEM_BUTTON_SUBGROUP", constants$70.GUID_SYSTEM_BUTTON_SUBGROUP$LAYOUT);
    static final StructLayout GUID_POWERBUTTON_ACTION$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_POWERBUTTON_ACTION$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_POWERBUTTON_ACTION", constants$70.GUID_POWERBUTTON_ACTION$LAYOUT);
    static final StructLayout GUID_SLEEPBUTTON_ACTION$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_SLEEPBUTTON_ACTION$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_SLEEPBUTTON_ACTION", constants$70.GUID_SLEEPBUTTON_ACTION$LAYOUT);
    static final StructLayout GUID_USERINTERFACEBUTTON_ACTION$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_USERINTERFACEBUTTON_ACTION$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_USERINTERFACEBUTTON_ACTION", constants$70.GUID_USERINTERFACEBUTTON_ACTION$LAYOUT);
    static final StructLayout GUID_LIDCLOSE_ACTION$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_LIDCLOSE_ACTION$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_LIDCLOSE_ACTION", constants$70.GUID_LIDCLOSE_ACTION$LAYOUT);
    static final StructLayout GUID_LIDOPEN_POWERSTATE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_LIDOPEN_POWERSTATE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_LIDOPEN_POWERSTATE", constants$70.GUID_LIDOPEN_POWERSTATE$LAYOUT);
}


