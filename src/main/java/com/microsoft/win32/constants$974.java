// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$974 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$974() {}
    static final StructLayout CLSID_CCDComboBox$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDComboBox$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_CCDComboBox", constants$974.CLSID_CCDComboBox$LAYOUT);
    static final StructLayout CLSID_CCDTextBox$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDTextBox$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_CCDTextBox", constants$974.CLSID_CCDTextBox$LAYOUT);
    static final StructLayout CLSID_CCDCheckBox$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDCheckBox$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_CCDCheckBox", constants$974.CLSID_CCDCheckBox$LAYOUT);
    static final StructLayout CLSID_CCDLabel$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDLabel$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_CCDLabel", constants$974.CLSID_CCDLabel$LAYOUT);
    static final StructLayout CLSID_CCDOptionButton$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDOptionButton$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_CCDOptionButton", constants$974.CLSID_CCDOptionButton$LAYOUT);
    static final StructLayout CLSID_CCDListBox$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDListBox$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_CCDListBox", constants$974.CLSID_CCDListBox$LAYOUT);
}


