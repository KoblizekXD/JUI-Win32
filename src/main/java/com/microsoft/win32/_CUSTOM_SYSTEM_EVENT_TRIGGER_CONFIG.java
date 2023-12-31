// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG {
 *     DWORD Size;
 *     PCWSTR TriggerId;
 * };
 * }
 */
public class _CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("TriggerId")
    ).withName("_CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG");
    public static MemoryLayout $LAYOUT() {
        return _CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TriggerId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TriggerId"));
    public static VarHandle TriggerId$VH() {
        return _CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG.TriggerId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCWSTR TriggerId;
     * }
     */
    public static MemorySegment TriggerId$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG.TriggerId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCWSTR TriggerId;
     * }
     */
    public static void TriggerId$set(MemorySegment seg, MemorySegment x) {
        _CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG.TriggerId$VH.set(seg, x);
    }
    public static MemorySegment TriggerId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG.TriggerId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TriggerId$set(MemorySegment seg, long index, MemorySegment x) {
        _CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG.TriggerId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


