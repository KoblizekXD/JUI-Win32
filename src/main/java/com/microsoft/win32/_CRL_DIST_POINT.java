// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRL_DIST_POINT {
 *     CRL_DIST_POINT_NAME DistPointName;
 *     CRYPT_BIT_BLOB ReasonFlags;
 *     CERT_ALT_NAME_INFO CRLIssuer;
 * };
 * }
 */
public class _CRL_DIST_POINT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwDistPointNameChoice"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("cAltEntry"),
                    MemoryLayout.paddingLayout(32),
                    Constants$root.C_POINTER$LAYOUT.withName("rgAltEntry")
                ).withName("FullName")
            ).withName("$anon$0")
        ).withName("DistPointName"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData"),
            Constants$root.C_LONG$LAYOUT.withName("cUnusedBits"),
            MemoryLayout.paddingLayout(32)
        ).withName("ReasonFlags"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cAltEntry"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("rgAltEntry")
        ).withName("CRLIssuer")
    ).withName("_CRL_DIST_POINT");
    public static MemoryLayout $LAYOUT() {
        return _CRL_DIST_POINT.$struct$LAYOUT;
    }
    public static MemorySegment DistPointName$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    public static MemorySegment ReasonFlags$slice(MemorySegment seg) {
        return seg.asSlice(24, 24);
    }
    public static MemorySegment CRLIssuer$slice(MemorySegment seg) {
        return seg.asSlice(48, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

