// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CTL_FIND_SUBJECT_PARA {
 *     DWORD cbSize;
 *     PCTL_FIND_USAGE_PARA pUsagePara;
 *     DWORD dwSubjectType;
 *     void* pvSubject;
 * };
 * }
 */
public class _CTL_FIND_SUBJECT_PARA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pUsagePara"),
        Constants$root.C_LONG$LAYOUT.withName("dwSubjectType"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pvSubject")
    ).withName("_CTL_FIND_SUBJECT_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CTL_FIND_SUBJECT_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CTL_FIND_SUBJECT_PARA.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CTL_FIND_SUBJECT_PARA.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _CTL_FIND_SUBJECT_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CTL_FIND_SUBJECT_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CTL_FIND_SUBJECT_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pUsagePara$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pUsagePara"));
    public static VarHandle pUsagePara$VH() {
        return _CTL_FIND_SUBJECT_PARA.pUsagePara$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCTL_FIND_USAGE_PARA pUsagePara;
     * }
     */
    public static MemorySegment pUsagePara$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CTL_FIND_SUBJECT_PARA.pUsagePara$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCTL_FIND_USAGE_PARA pUsagePara;
     * }
     */
    public static void pUsagePara$set(MemorySegment seg, MemorySegment x) {
        _CTL_FIND_SUBJECT_PARA.pUsagePara$VH.set(seg, x);
    }
    public static MemorySegment pUsagePara$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CTL_FIND_SUBJECT_PARA.pUsagePara$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pUsagePara$set(MemorySegment seg, long index, MemorySegment x) {
        _CTL_FIND_SUBJECT_PARA.pUsagePara$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSubjectType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSubjectType"));
    public static VarHandle dwSubjectType$VH() {
        return _CTL_FIND_SUBJECT_PARA.dwSubjectType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSubjectType;
     * }
     */
    public static int dwSubjectType$get(MemorySegment seg) {
        return (int)_CTL_FIND_SUBJECT_PARA.dwSubjectType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSubjectType;
     * }
     */
    public static void dwSubjectType$set(MemorySegment seg, int x) {
        _CTL_FIND_SUBJECT_PARA.dwSubjectType$VH.set(seg, x);
    }
    public static int dwSubjectType$get(MemorySegment seg, long index) {
        return (int)_CTL_FIND_SUBJECT_PARA.dwSubjectType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSubjectType$set(MemorySegment seg, long index, int x) {
        _CTL_FIND_SUBJECT_PARA.dwSubjectType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvSubject$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvSubject"));
    public static VarHandle pvSubject$VH() {
        return _CTL_FIND_SUBJECT_PARA.pvSubject$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pvSubject;
     * }
     */
    public static MemorySegment pvSubject$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CTL_FIND_SUBJECT_PARA.pvSubject$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pvSubject;
     * }
     */
    public static void pvSubject$set(MemorySegment seg, MemorySegment x) {
        _CTL_FIND_SUBJECT_PARA.pvSubject$VH.set(seg, x);
    }
    public static MemorySegment pvSubject$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CTL_FIND_SUBJECT_PARA.pvSubject$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvSubject$set(MemorySegment seg, long index, MemorySegment x) {
        _CTL_FIND_SUBJECT_PARA.pvSubject$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


