// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_POLICY_QUALIFIER_USER_NOTICE {
 *     CERT_POLICY_QUALIFIER_NOTICE_REFERENCE* pNoticeReference;
 *     LPWSTR pszDisplayText;
 * };
 * }
 */
public class _CERT_POLICY_QUALIFIER_USER_NOTICE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pNoticeReference"),
        Constants$root.C_POINTER$LAYOUT.withName("pszDisplayText")
    ).withName("_CERT_POLICY_QUALIFIER_USER_NOTICE");
    public static MemoryLayout $LAYOUT() {
        return _CERT_POLICY_QUALIFIER_USER_NOTICE.$struct$LAYOUT;
    }
    static final VarHandle pNoticeReference$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pNoticeReference"));
    public static VarHandle pNoticeReference$VH() {
        return _CERT_POLICY_QUALIFIER_USER_NOTICE.pNoticeReference$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * CERT_POLICY_QUALIFIER_NOTICE_REFERENCE* pNoticeReference;
     * }
     */
    public static MemorySegment pNoticeReference$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CERT_POLICY_QUALIFIER_USER_NOTICE.pNoticeReference$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * CERT_POLICY_QUALIFIER_NOTICE_REFERENCE* pNoticeReference;
     * }
     */
    public static void pNoticeReference$set(MemorySegment seg, MemorySegment x) {
        _CERT_POLICY_QUALIFIER_USER_NOTICE.pNoticeReference$VH.set(seg, x);
    }
    public static MemorySegment pNoticeReference$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CERT_POLICY_QUALIFIER_USER_NOTICE.pNoticeReference$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pNoticeReference$set(MemorySegment seg, long index, MemorySegment x) {
        _CERT_POLICY_QUALIFIER_USER_NOTICE.pNoticeReference$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszDisplayText$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszDisplayText"));
    public static VarHandle pszDisplayText$VH() {
        return _CERT_POLICY_QUALIFIER_USER_NOTICE.pszDisplayText$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pszDisplayText;
     * }
     */
    public static MemorySegment pszDisplayText$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CERT_POLICY_QUALIFIER_USER_NOTICE.pszDisplayText$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pszDisplayText;
     * }
     */
    public static void pszDisplayText$set(MemorySegment seg, MemorySegment x) {
        _CERT_POLICY_QUALIFIER_USER_NOTICE.pszDisplayText$VH.set(seg, x);
    }
    public static MemorySegment pszDisplayText$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CERT_POLICY_QUALIFIER_USER_NOTICE.pszDisplayText$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszDisplayText$set(MemorySegment seg, long index, MemorySegment x) {
        _CERT_POLICY_QUALIFIER_USER_NOTICE.pszDisplayText$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


