// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _JOBOBJECT_BASIC_UI_RESTRICTIONS {
 *     DWORD UIRestrictionsClass;
 * };
 * }
 */
public class _JOBOBJECT_BASIC_UI_RESTRICTIONS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("UIRestrictionsClass")
    ).withName("_JOBOBJECT_BASIC_UI_RESTRICTIONS");
    public static MemoryLayout $LAYOUT() {
        return _JOBOBJECT_BASIC_UI_RESTRICTIONS.$struct$LAYOUT;
    }
    static final VarHandle UIRestrictionsClass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UIRestrictionsClass"));
    public static VarHandle UIRestrictionsClass$VH() {
        return _JOBOBJECT_BASIC_UI_RESTRICTIONS.UIRestrictionsClass$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD UIRestrictionsClass;
     * }
     */
    public static int UIRestrictionsClass$get(MemorySegment seg) {
        return (int)_JOBOBJECT_BASIC_UI_RESTRICTIONS.UIRestrictionsClass$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD UIRestrictionsClass;
     * }
     */
    public static void UIRestrictionsClass$set(MemorySegment seg, int x) {
        _JOBOBJECT_BASIC_UI_RESTRICTIONS.UIRestrictionsClass$VH.set(seg, x);
    }
    public static int UIRestrictionsClass$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_BASIC_UI_RESTRICTIONS.UIRestrictionsClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UIRestrictionsClass$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_BASIC_UI_RESTRICTIONS.UIRestrictionsClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


