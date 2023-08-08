// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _JOBOBJECT_SECURITY_LIMIT_INFORMATION {
 *     DWORD SecurityLimitFlags;
 *     HANDLE JobToken;
 *     PTOKEN_GROUPS SidsToDisable;
 *     PTOKEN_PRIVILEGES PrivilegesToDelete;
 *     PTOKEN_GROUPS RestrictedSids;
 * };
 * }
 */
public class _JOBOBJECT_SECURITY_LIMIT_INFORMATION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("SecurityLimitFlags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("JobToken"),
        Constants$root.C_POINTER$LAYOUT.withName("SidsToDisable"),
        Constants$root.C_POINTER$LAYOUT.withName("PrivilegesToDelete"),
        Constants$root.C_POINTER$LAYOUT.withName("RestrictedSids")
    ).withName("_JOBOBJECT_SECURITY_LIMIT_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _JOBOBJECT_SECURITY_LIMIT_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle SecurityLimitFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SecurityLimitFlags"));
    public static VarHandle SecurityLimitFlags$VH() {
        return _JOBOBJECT_SECURITY_LIMIT_INFORMATION.SecurityLimitFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SecurityLimitFlags;
     * }
     */
    public static int SecurityLimitFlags$get(MemorySegment seg) {
        return (int)_JOBOBJECT_SECURITY_LIMIT_INFORMATION.SecurityLimitFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SecurityLimitFlags;
     * }
     */
    public static void SecurityLimitFlags$set(MemorySegment seg, int x) {
        _JOBOBJECT_SECURITY_LIMIT_INFORMATION.SecurityLimitFlags$VH.set(seg, x);
    }
    public static int SecurityLimitFlags$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_SECURITY_LIMIT_INFORMATION.SecurityLimitFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SecurityLimitFlags$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_SECURITY_LIMIT_INFORMATION.SecurityLimitFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle JobToken$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("JobToken"));
    public static VarHandle JobToken$VH() {
        return _JOBOBJECT_SECURITY_LIMIT_INFORMATION.JobToken$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE JobToken;
     * }
     */
    public static MemorySegment JobToken$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOBOBJECT_SECURITY_LIMIT_INFORMATION.JobToken$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE JobToken;
     * }
     */
    public static void JobToken$set(MemorySegment seg, MemorySegment x) {
        _JOBOBJECT_SECURITY_LIMIT_INFORMATION.JobToken$VH.set(seg, x);
    }
    public static MemorySegment JobToken$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOBOBJECT_SECURITY_LIMIT_INFORMATION.JobToken$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void JobToken$set(MemorySegment seg, long index, MemorySegment x) {
        _JOBOBJECT_SECURITY_LIMIT_INFORMATION.JobToken$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SidsToDisable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SidsToDisable"));
    public static VarHandle SidsToDisable$VH() {
        return _JOBOBJECT_SECURITY_LIMIT_INFORMATION.SidsToDisable$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PTOKEN_GROUPS SidsToDisable;
     * }
     */
    public static MemorySegment SidsToDisable$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOBOBJECT_SECURITY_LIMIT_INFORMATION.SidsToDisable$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PTOKEN_GROUPS SidsToDisable;
     * }
     */
    public static void SidsToDisable$set(MemorySegment seg, MemorySegment x) {
        _JOBOBJECT_SECURITY_LIMIT_INFORMATION.SidsToDisable$VH.set(seg, x);
    }
    public static MemorySegment SidsToDisable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOBOBJECT_SECURITY_LIMIT_INFORMATION.SidsToDisable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SidsToDisable$set(MemorySegment seg, long index, MemorySegment x) {
        _JOBOBJECT_SECURITY_LIMIT_INFORMATION.SidsToDisable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PrivilegesToDelete$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PrivilegesToDelete"));
    public static VarHandle PrivilegesToDelete$VH() {
        return _JOBOBJECT_SECURITY_LIMIT_INFORMATION.PrivilegesToDelete$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PTOKEN_PRIVILEGES PrivilegesToDelete;
     * }
     */
    public static MemorySegment PrivilegesToDelete$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOBOBJECT_SECURITY_LIMIT_INFORMATION.PrivilegesToDelete$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PTOKEN_PRIVILEGES PrivilegesToDelete;
     * }
     */
    public static void PrivilegesToDelete$set(MemorySegment seg, MemorySegment x) {
        _JOBOBJECT_SECURITY_LIMIT_INFORMATION.PrivilegesToDelete$VH.set(seg, x);
    }
    public static MemorySegment PrivilegesToDelete$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOBOBJECT_SECURITY_LIMIT_INFORMATION.PrivilegesToDelete$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PrivilegesToDelete$set(MemorySegment seg, long index, MemorySegment x) {
        _JOBOBJECT_SECURITY_LIMIT_INFORMATION.PrivilegesToDelete$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RestrictedSids$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RestrictedSids"));
    public static VarHandle RestrictedSids$VH() {
        return _JOBOBJECT_SECURITY_LIMIT_INFORMATION.RestrictedSids$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PTOKEN_GROUPS RestrictedSids;
     * }
     */
    public static MemorySegment RestrictedSids$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOBOBJECT_SECURITY_LIMIT_INFORMATION.RestrictedSids$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PTOKEN_GROUPS RestrictedSids;
     * }
     */
    public static void RestrictedSids$set(MemorySegment seg, MemorySegment x) {
        _JOBOBJECT_SECURITY_LIMIT_INFORMATION.RestrictedSids$VH.set(seg, x);
    }
    public static MemorySegment RestrictedSids$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOBOBJECT_SECURITY_LIMIT_INFORMATION.RestrictedSids$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RestrictedSids$set(MemorySegment seg, long index, MemorySegment x) {
        _JOBOBJECT_SECURITY_LIMIT_INFORMATION.RestrictedSids$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

