// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SID {
 *     BYTE Revision;
 *     BYTE SubAuthorityCount;
 *     SID_IDENTIFIER_AUTHORITY IdentifierAuthority;
 *     DWORD SubAuthority[1];
 * };
 * }
 */
public class _SID {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("Revision"),
        Constants$root.C_CHAR$LAYOUT.withName("SubAuthorityCount"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(6, Constants$root.C_CHAR$LAYOUT).withName("Value")
        ).withName("IdentifierAuthority"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("SubAuthority")
    ).withName("_SID");
    public static MemoryLayout $LAYOUT() {
        return _SID.$struct$LAYOUT;
    }
    static final VarHandle Revision$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Revision"));
    public static VarHandle Revision$VH() {
        return _SID.Revision$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE Revision;
     * }
     */
    public static byte Revision$get(MemorySegment seg) {
        return (byte)_SID.Revision$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE Revision;
     * }
     */
    public static void Revision$set(MemorySegment seg, byte x) {
        _SID.Revision$VH.set(seg, x);
    }
    public static byte Revision$get(MemorySegment seg, long index) {
        return (byte)_SID.Revision$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Revision$set(MemorySegment seg, long index, byte x) {
        _SID.Revision$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SubAuthorityCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SubAuthorityCount"));
    public static VarHandle SubAuthorityCount$VH() {
        return _SID.SubAuthorityCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE SubAuthorityCount;
     * }
     */
    public static byte SubAuthorityCount$get(MemorySegment seg) {
        return (byte)_SID.SubAuthorityCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE SubAuthorityCount;
     * }
     */
    public static void SubAuthorityCount$set(MemorySegment seg, byte x) {
        _SID.SubAuthorityCount$VH.set(seg, x);
    }
    public static byte SubAuthorityCount$get(MemorySegment seg, long index) {
        return (byte)_SID.SubAuthorityCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SubAuthorityCount$set(MemorySegment seg, long index, byte x) {
        _SID.SubAuthorityCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment IdentifierAuthority$slice(MemorySegment seg) {
        return seg.asSlice(2, 6);
    }
    public static MemorySegment SubAuthority$slice(MemorySegment seg) {
        return seg.asSlice(8, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


