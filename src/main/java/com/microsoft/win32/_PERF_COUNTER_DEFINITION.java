// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PERF_COUNTER_DEFINITION {
 *     DWORD ByteLength;
 *     DWORD CounterNameTitleIndex;
 *     DWORD CounterNameTitle;
 *     DWORD CounterHelpTitleIndex;
 *     DWORD CounterHelpTitle;
 *     LONG DefaultScale;
 *     DWORD DetailLevel;
 *     DWORD CounterType;
 *     DWORD CounterSize;
 *     DWORD CounterOffset;
 * };
 * }
 */
public class _PERF_COUNTER_DEFINITION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ByteLength"),
        Constants$root.C_LONG$LAYOUT.withName("CounterNameTitleIndex"),
        Constants$root.C_LONG$LAYOUT.withName("CounterNameTitle"),
        Constants$root.C_LONG$LAYOUT.withName("CounterHelpTitleIndex"),
        Constants$root.C_LONG$LAYOUT.withName("CounterHelpTitle"),
        Constants$root.C_LONG$LAYOUT.withName("DefaultScale"),
        Constants$root.C_LONG$LAYOUT.withName("DetailLevel"),
        Constants$root.C_LONG$LAYOUT.withName("CounterType"),
        Constants$root.C_LONG$LAYOUT.withName("CounterSize"),
        Constants$root.C_LONG$LAYOUT.withName("CounterOffset")
    ).withName("_PERF_COUNTER_DEFINITION");
    public static MemoryLayout $LAYOUT() {
        return _PERF_COUNTER_DEFINITION.$struct$LAYOUT;
    }
    static final VarHandle ByteLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ByteLength"));
    public static VarHandle ByteLength$VH() {
        return _PERF_COUNTER_DEFINITION.ByteLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ByteLength;
     * }
     */
    public static int ByteLength$get(MemorySegment seg) {
        return (int)_PERF_COUNTER_DEFINITION.ByteLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ByteLength;
     * }
     */
    public static void ByteLength$set(MemorySegment seg, int x) {
        _PERF_COUNTER_DEFINITION.ByteLength$VH.set(seg, x);
    }
    public static int ByteLength$get(MemorySegment seg, long index) {
        return (int)_PERF_COUNTER_DEFINITION.ByteLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ByteLength$set(MemorySegment seg, long index, int x) {
        _PERF_COUNTER_DEFINITION.ByteLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CounterNameTitleIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CounterNameTitleIndex"));
    public static VarHandle CounterNameTitleIndex$VH() {
        return _PERF_COUNTER_DEFINITION.CounterNameTitleIndex$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD CounterNameTitleIndex;
     * }
     */
    public static int CounterNameTitleIndex$get(MemorySegment seg) {
        return (int)_PERF_COUNTER_DEFINITION.CounterNameTitleIndex$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD CounterNameTitleIndex;
     * }
     */
    public static void CounterNameTitleIndex$set(MemorySegment seg, int x) {
        _PERF_COUNTER_DEFINITION.CounterNameTitleIndex$VH.set(seg, x);
    }
    public static int CounterNameTitleIndex$get(MemorySegment seg, long index) {
        return (int)_PERF_COUNTER_DEFINITION.CounterNameTitleIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CounterNameTitleIndex$set(MemorySegment seg, long index, int x) {
        _PERF_COUNTER_DEFINITION.CounterNameTitleIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CounterNameTitle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CounterNameTitle"));
    public static VarHandle CounterNameTitle$VH() {
        return _PERF_COUNTER_DEFINITION.CounterNameTitle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD CounterNameTitle;
     * }
     */
    public static int CounterNameTitle$get(MemorySegment seg) {
        return (int)_PERF_COUNTER_DEFINITION.CounterNameTitle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD CounterNameTitle;
     * }
     */
    public static void CounterNameTitle$set(MemorySegment seg, int x) {
        _PERF_COUNTER_DEFINITION.CounterNameTitle$VH.set(seg, x);
    }
    public static int CounterNameTitle$get(MemorySegment seg, long index) {
        return (int)_PERF_COUNTER_DEFINITION.CounterNameTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CounterNameTitle$set(MemorySegment seg, long index, int x) {
        _PERF_COUNTER_DEFINITION.CounterNameTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CounterHelpTitleIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CounterHelpTitleIndex"));
    public static VarHandle CounterHelpTitleIndex$VH() {
        return _PERF_COUNTER_DEFINITION.CounterHelpTitleIndex$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD CounterHelpTitleIndex;
     * }
     */
    public static int CounterHelpTitleIndex$get(MemorySegment seg) {
        return (int)_PERF_COUNTER_DEFINITION.CounterHelpTitleIndex$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD CounterHelpTitleIndex;
     * }
     */
    public static void CounterHelpTitleIndex$set(MemorySegment seg, int x) {
        _PERF_COUNTER_DEFINITION.CounterHelpTitleIndex$VH.set(seg, x);
    }
    public static int CounterHelpTitleIndex$get(MemorySegment seg, long index) {
        return (int)_PERF_COUNTER_DEFINITION.CounterHelpTitleIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CounterHelpTitleIndex$set(MemorySegment seg, long index, int x) {
        _PERF_COUNTER_DEFINITION.CounterHelpTitleIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CounterHelpTitle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CounterHelpTitle"));
    public static VarHandle CounterHelpTitle$VH() {
        return _PERF_COUNTER_DEFINITION.CounterHelpTitle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD CounterHelpTitle;
     * }
     */
    public static int CounterHelpTitle$get(MemorySegment seg) {
        return (int)_PERF_COUNTER_DEFINITION.CounterHelpTitle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD CounterHelpTitle;
     * }
     */
    public static void CounterHelpTitle$set(MemorySegment seg, int x) {
        _PERF_COUNTER_DEFINITION.CounterHelpTitle$VH.set(seg, x);
    }
    public static int CounterHelpTitle$get(MemorySegment seg, long index) {
        return (int)_PERF_COUNTER_DEFINITION.CounterHelpTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CounterHelpTitle$set(MemorySegment seg, long index, int x) {
        _PERF_COUNTER_DEFINITION.CounterHelpTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DefaultScale$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DefaultScale"));
    public static VarHandle DefaultScale$VH() {
        return _PERF_COUNTER_DEFINITION.DefaultScale$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG DefaultScale;
     * }
     */
    public static int DefaultScale$get(MemorySegment seg) {
        return (int)_PERF_COUNTER_DEFINITION.DefaultScale$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG DefaultScale;
     * }
     */
    public static void DefaultScale$set(MemorySegment seg, int x) {
        _PERF_COUNTER_DEFINITION.DefaultScale$VH.set(seg, x);
    }
    public static int DefaultScale$get(MemorySegment seg, long index) {
        return (int)_PERF_COUNTER_DEFINITION.DefaultScale$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DefaultScale$set(MemorySegment seg, long index, int x) {
        _PERF_COUNTER_DEFINITION.DefaultScale$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DetailLevel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DetailLevel"));
    public static VarHandle DetailLevel$VH() {
        return _PERF_COUNTER_DEFINITION.DetailLevel$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DetailLevel;
     * }
     */
    public static int DetailLevel$get(MemorySegment seg) {
        return (int)_PERF_COUNTER_DEFINITION.DetailLevel$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DetailLevel;
     * }
     */
    public static void DetailLevel$set(MemorySegment seg, int x) {
        _PERF_COUNTER_DEFINITION.DetailLevel$VH.set(seg, x);
    }
    public static int DetailLevel$get(MemorySegment seg, long index) {
        return (int)_PERF_COUNTER_DEFINITION.DetailLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DetailLevel$set(MemorySegment seg, long index, int x) {
        _PERF_COUNTER_DEFINITION.DetailLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CounterType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CounterType"));
    public static VarHandle CounterType$VH() {
        return _PERF_COUNTER_DEFINITION.CounterType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD CounterType;
     * }
     */
    public static int CounterType$get(MemorySegment seg) {
        return (int)_PERF_COUNTER_DEFINITION.CounterType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD CounterType;
     * }
     */
    public static void CounterType$set(MemorySegment seg, int x) {
        _PERF_COUNTER_DEFINITION.CounterType$VH.set(seg, x);
    }
    public static int CounterType$get(MemorySegment seg, long index) {
        return (int)_PERF_COUNTER_DEFINITION.CounterType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CounterType$set(MemorySegment seg, long index, int x) {
        _PERF_COUNTER_DEFINITION.CounterType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CounterSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CounterSize"));
    public static VarHandle CounterSize$VH() {
        return _PERF_COUNTER_DEFINITION.CounterSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD CounterSize;
     * }
     */
    public static int CounterSize$get(MemorySegment seg) {
        return (int)_PERF_COUNTER_DEFINITION.CounterSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD CounterSize;
     * }
     */
    public static void CounterSize$set(MemorySegment seg, int x) {
        _PERF_COUNTER_DEFINITION.CounterSize$VH.set(seg, x);
    }
    public static int CounterSize$get(MemorySegment seg, long index) {
        return (int)_PERF_COUNTER_DEFINITION.CounterSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CounterSize$set(MemorySegment seg, long index, int x) {
        _PERF_COUNTER_DEFINITION.CounterSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CounterOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CounterOffset"));
    public static VarHandle CounterOffset$VH() {
        return _PERF_COUNTER_DEFINITION.CounterOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD CounterOffset;
     * }
     */
    public static int CounterOffset$get(MemorySegment seg) {
        return (int)_PERF_COUNTER_DEFINITION.CounterOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD CounterOffset;
     * }
     */
    public static void CounterOffset$set(MemorySegment seg, int x) {
        _PERF_COUNTER_DEFINITION.CounterOffset$VH.set(seg, x);
    }
    public static int CounterOffset$get(MemorySegment seg, long index) {
        return (int)_PERF_COUNTER_DEFINITION.CounterOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CounterOffset$set(MemorySegment seg, long index, int x) {
        _PERF_COUNTER_DEFINITION.CounterOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


