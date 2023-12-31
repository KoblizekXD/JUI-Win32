// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union {
 *     USN_RECORD_COMMON_HEADER Header;
 *     USN_RECORD_V2 V2;
 *     USN_RECORD_V3 V3;
 *     USN_RECORD_V4 V4;
 * };
 * }
 */
public class USN_RECORD_UNION {

    static final UnionLayout $union$LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("RecordLength"),
            Constants$root.C_SHORT$LAYOUT.withName("MajorVersion"),
            Constants$root.C_SHORT$LAYOUT.withName("MinorVersion")
        ).withName("Header"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("RecordLength"),
            Constants$root.C_SHORT$LAYOUT.withName("MajorVersion"),
            Constants$root.C_SHORT$LAYOUT.withName("MinorVersion"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("FileReferenceNumber"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("ParentFileReferenceNumber"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Usn"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                    Constants$root.C_LONG$LAYOUT.withName("HighPart")
                ).withName("$anon$0"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                    Constants$root.C_LONG$LAYOUT.withName("HighPart")
                ).withName("u"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
            ).withName("TimeStamp"),
            Constants$root.C_LONG$LAYOUT.withName("Reason"),
            Constants$root.C_LONG$LAYOUT.withName("SourceInfo"),
            Constants$root.C_LONG$LAYOUT.withName("SecurityId"),
            Constants$root.C_LONG$LAYOUT.withName("FileAttributes"),
            Constants$root.C_SHORT$LAYOUT.withName("FileNameLength"),
            Constants$root.C_SHORT$LAYOUT.withName("FileNameOffset"),
            MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("FileName"),
            MemoryLayout.paddingLayout(16)
        ).withName("V2"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("RecordLength"),
            Constants$root.C_SHORT$LAYOUT.withName("MajorVersion"),
            Constants$root.C_SHORT$LAYOUT.withName("MinorVersion"),
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("Identifier")
            ).withName("FileReferenceNumber"),
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("Identifier")
            ).withName("ParentFileReferenceNumber"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Usn"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                    Constants$root.C_LONG$LAYOUT.withName("HighPart")
                ).withName("$anon$0"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                    Constants$root.C_LONG$LAYOUT.withName("HighPart")
                ).withName("u"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
            ).withName("TimeStamp"),
            Constants$root.C_LONG$LAYOUT.withName("Reason"),
            Constants$root.C_LONG$LAYOUT.withName("SourceInfo"),
            Constants$root.C_LONG$LAYOUT.withName("SecurityId"),
            Constants$root.C_LONG$LAYOUT.withName("FileAttributes"),
            Constants$root.C_SHORT$LAYOUT.withName("FileNameLength"),
            Constants$root.C_SHORT$LAYOUT.withName("FileNameOffset"),
            MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("FileName"),
            MemoryLayout.paddingLayout(16)
        ).withName("V3"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("RecordLength"),
                Constants$root.C_SHORT$LAYOUT.withName("MajorVersion"),
                Constants$root.C_SHORT$LAYOUT.withName("MinorVersion")
            ).withName("Header"),
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("Identifier")
            ).withName("FileReferenceNumber"),
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("Identifier")
            ).withName("ParentFileReferenceNumber"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Usn"),
            Constants$root.C_LONG$LAYOUT.withName("Reason"),
            Constants$root.C_LONG$LAYOUT.withName("SourceInfo"),
            Constants$root.C_LONG$LAYOUT.withName("RemainingExtents"),
            Constants$root.C_SHORT$LAYOUT.withName("NumberOfExtents"),
            Constants$root.C_SHORT$LAYOUT.withName("ExtentSize"),
            MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("Offset"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("Length")
            )).withName("Extents")
        ).withName("V4")
    );
    public static MemoryLayout $LAYOUT() {
        return USN_RECORD_UNION.$union$LAYOUT;
    }
    public static MemorySegment Header$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment V2$slice(MemorySegment seg) {
        return seg.asSlice(0, 64);
    }
    public static MemorySegment V3$slice(MemorySegment seg) {
        return seg.asSlice(0, 80);
    }
    public static MemorySegment V4$slice(MemorySegment seg) {
        return seg.asSlice(0, 80);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


