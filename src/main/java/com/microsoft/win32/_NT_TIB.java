// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _NT_TIB {
 *     struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList;
 *     PVOID StackBase;
 *     PVOID StackLimit;
 *     PVOID SubSystemTib;
 *     union {
 *         PVOID FiberData;
 *         DWORD Version;
 *     };
 *     PVOID ArbitraryUserPointer;
 *     struct _NT_TIB* Self;
 * };
 * }
 */
public class _NT_TIB {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ExceptionList"),
        Constants$root.C_POINTER$LAYOUT.withName("StackBase"),
        Constants$root.C_POINTER$LAYOUT.withName("StackLimit"),
        Constants$root.C_POINTER$LAYOUT.withName("SubSystemTib"),
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("FiberData"),
            Constants$root.C_LONG$LAYOUT.withName("Version")
        ).withName("$anon$0"),
        Constants$root.C_POINTER$LAYOUT.withName("ArbitraryUserPointer"),
        Constants$root.C_POINTER$LAYOUT.withName("Self")
    ).withName("_NT_TIB");
    public static MemoryLayout $LAYOUT() {
        return _NT_TIB.$struct$LAYOUT;
    }
    static final VarHandle ExceptionList$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExceptionList"));
    public static VarHandle ExceptionList$VH() {
        return _NT_TIB.ExceptionList$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList;
     * }
     */
    public static MemorySegment ExceptionList$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_NT_TIB.ExceptionList$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList;
     * }
     */
    public static void ExceptionList$set(MemorySegment seg, MemorySegment x) {
        _NT_TIB.ExceptionList$VH.set(seg, x);
    }
    public static MemorySegment ExceptionList$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_NT_TIB.ExceptionList$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExceptionList$set(MemorySegment seg, long index, MemorySegment x) {
        _NT_TIB.ExceptionList$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StackBase$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StackBase"));
    public static VarHandle StackBase$VH() {
        return _NT_TIB.StackBase$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID StackBase;
     * }
     */
    public static MemorySegment StackBase$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_NT_TIB.StackBase$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID StackBase;
     * }
     */
    public static void StackBase$set(MemorySegment seg, MemorySegment x) {
        _NT_TIB.StackBase$VH.set(seg, x);
    }
    public static MemorySegment StackBase$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_NT_TIB.StackBase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StackBase$set(MemorySegment seg, long index, MemorySegment x) {
        _NT_TIB.StackBase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StackLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StackLimit"));
    public static VarHandle StackLimit$VH() {
        return _NT_TIB.StackLimit$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID StackLimit;
     * }
     */
    public static MemorySegment StackLimit$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_NT_TIB.StackLimit$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID StackLimit;
     * }
     */
    public static void StackLimit$set(MemorySegment seg, MemorySegment x) {
        _NT_TIB.StackLimit$VH.set(seg, x);
    }
    public static MemorySegment StackLimit$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_NT_TIB.StackLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StackLimit$set(MemorySegment seg, long index, MemorySegment x) {
        _NT_TIB.StackLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SubSystemTib$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SubSystemTib"));
    public static VarHandle SubSystemTib$VH() {
        return _NT_TIB.SubSystemTib$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID SubSystemTib;
     * }
     */
    public static MemorySegment SubSystemTib$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_NT_TIB.SubSystemTib$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID SubSystemTib;
     * }
     */
    public static void SubSystemTib$set(MemorySegment seg, MemorySegment x) {
        _NT_TIB.SubSystemTib$VH.set(seg, x);
    }
    public static MemorySegment SubSystemTib$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_NT_TIB.SubSystemTib$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SubSystemTib$set(MemorySegment seg, long index, MemorySegment x) {
        _NT_TIB.SubSystemTib$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FiberData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("FiberData"));
    public static VarHandle FiberData$VH() {
        return _NT_TIB.FiberData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID FiberData;
     * }
     */
    public static MemorySegment FiberData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_NT_TIB.FiberData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID FiberData;
     * }
     */
    public static void FiberData$set(MemorySegment seg, MemorySegment x) {
        _NT_TIB.FiberData$VH.set(seg, x);
    }
    public static MemorySegment FiberData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_NT_TIB.FiberData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FiberData$set(MemorySegment seg, long index, MemorySegment x) {
        _NT_TIB.FiberData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _NT_TIB.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_NT_TIB.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _NT_TIB.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_NT_TIB.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _NT_TIB.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ArbitraryUserPointer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ArbitraryUserPointer"));
    public static VarHandle ArbitraryUserPointer$VH() {
        return _NT_TIB.ArbitraryUserPointer$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID ArbitraryUserPointer;
     * }
     */
    public static MemorySegment ArbitraryUserPointer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_NT_TIB.ArbitraryUserPointer$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID ArbitraryUserPointer;
     * }
     */
    public static void ArbitraryUserPointer$set(MemorySegment seg, MemorySegment x) {
        _NT_TIB.ArbitraryUserPointer$VH.set(seg, x);
    }
    public static MemorySegment ArbitraryUserPointer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_NT_TIB.ArbitraryUserPointer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ArbitraryUserPointer$set(MemorySegment seg, long index, MemorySegment x) {
        _NT_TIB.ArbitraryUserPointer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Self$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Self"));
    public static VarHandle Self$VH() {
        return _NT_TIB.Self$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _NT_TIB* Self;
     * }
     */
    public static MemorySegment Self$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_NT_TIB.Self$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _NT_TIB* Self;
     * }
     */
    public static void Self$set(MemorySegment seg, MemorySegment x) {
        _NT_TIB.Self$VH.set(seg, x);
    }
    public static MemorySegment Self$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_NT_TIB.Self$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Self$set(MemorySegment seg, long index, MemorySegment x) {
        _NT_TIB.Self$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


