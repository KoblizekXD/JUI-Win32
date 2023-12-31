// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _JOBOBJECT_BASIC_PROCESS_ID_LIST {
 *     DWORD NumberOfAssignedProcesses;
 *     DWORD NumberOfProcessIdsInList;
 *     ULONG_PTR ProcessIdList[1];
 * };
 * }
 */
public class _JOBOBJECT_BASIC_PROCESS_ID_LIST {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("NumberOfAssignedProcesses"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfProcessIdsInList"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_LONG_LONG$LAYOUT).withName("ProcessIdList")
    ).withName("_JOBOBJECT_BASIC_PROCESS_ID_LIST");
    public static MemoryLayout $LAYOUT() {
        return _JOBOBJECT_BASIC_PROCESS_ID_LIST.$struct$LAYOUT;
    }
    static final VarHandle NumberOfAssignedProcesses$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfAssignedProcesses"));
    public static VarHandle NumberOfAssignedProcesses$VH() {
        return _JOBOBJECT_BASIC_PROCESS_ID_LIST.NumberOfAssignedProcesses$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumberOfAssignedProcesses;
     * }
     */
    public static int NumberOfAssignedProcesses$get(MemorySegment seg) {
        return (int)_JOBOBJECT_BASIC_PROCESS_ID_LIST.NumberOfAssignedProcesses$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumberOfAssignedProcesses;
     * }
     */
    public static void NumberOfAssignedProcesses$set(MemorySegment seg, int x) {
        _JOBOBJECT_BASIC_PROCESS_ID_LIST.NumberOfAssignedProcesses$VH.set(seg, x);
    }
    public static int NumberOfAssignedProcesses$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_BASIC_PROCESS_ID_LIST.NumberOfAssignedProcesses$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfAssignedProcesses$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_BASIC_PROCESS_ID_LIST.NumberOfAssignedProcesses$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfProcessIdsInList$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfProcessIdsInList"));
    public static VarHandle NumberOfProcessIdsInList$VH() {
        return _JOBOBJECT_BASIC_PROCESS_ID_LIST.NumberOfProcessIdsInList$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumberOfProcessIdsInList;
     * }
     */
    public static int NumberOfProcessIdsInList$get(MemorySegment seg) {
        return (int)_JOBOBJECT_BASIC_PROCESS_ID_LIST.NumberOfProcessIdsInList$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumberOfProcessIdsInList;
     * }
     */
    public static void NumberOfProcessIdsInList$set(MemorySegment seg, int x) {
        _JOBOBJECT_BASIC_PROCESS_ID_LIST.NumberOfProcessIdsInList$VH.set(seg, x);
    }
    public static int NumberOfProcessIdsInList$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_BASIC_PROCESS_ID_LIST.NumberOfProcessIdsInList$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfProcessIdsInList$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_BASIC_PROCESS_ID_LIST.NumberOfProcessIdsInList$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ProcessIdList$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


