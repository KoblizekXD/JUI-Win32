// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TOKEN_USER_CLAIMS {
 *     PCLAIMS_BLOB UserClaims;
 * };
 * }
 */
public class _TOKEN_USER_CLAIMS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("UserClaims")
    ).withName("_TOKEN_USER_CLAIMS");
    public static MemoryLayout $LAYOUT() {
        return _TOKEN_USER_CLAIMS.$struct$LAYOUT;
    }
    static final VarHandle UserClaims$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UserClaims"));
    public static VarHandle UserClaims$VH() {
        return _TOKEN_USER_CLAIMS.UserClaims$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCLAIMS_BLOB UserClaims;
     * }
     */
    public static MemorySegment UserClaims$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_TOKEN_USER_CLAIMS.UserClaims$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCLAIMS_BLOB UserClaims;
     * }
     */
    public static void UserClaims$set(MemorySegment seg, MemorySegment x) {
        _TOKEN_USER_CLAIMS.UserClaims$VH.set(seg, x);
    }
    public static MemorySegment UserClaims$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_TOKEN_USER_CLAIMS.UserClaims$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UserClaims$set(MemorySegment seg, long index, MemorySegment x) {
        _TOKEN_USER_CLAIMS.UserClaims$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


