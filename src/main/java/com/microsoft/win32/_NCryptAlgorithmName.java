// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _NCryptAlgorithmName {
 *     LPWSTR pszName;
 *     DWORD dwClass;
 *     DWORD dwAlgOperations;
 *     DWORD dwFlags;
 * };
 * }
 */
public class _NCryptAlgorithmName {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszName"),
        Constants$root.C_LONG$LAYOUT.withName("dwClass"),
        Constants$root.C_LONG$LAYOUT.withName("dwAlgOperations"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        MemoryLayout.paddingLayout(32)
    ).withName("_NCryptAlgorithmName");
    public static MemoryLayout $LAYOUT() {
        return _NCryptAlgorithmName.$struct$LAYOUT;
    }
    static final VarHandle pszName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszName"));
    public static VarHandle pszName$VH() {
        return _NCryptAlgorithmName.pszName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pszName;
     * }
     */
    public static MemorySegment pszName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_NCryptAlgorithmName.pszName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pszName;
     * }
     */
    public static void pszName$set(MemorySegment seg, MemorySegment x) {
        _NCryptAlgorithmName.pszName$VH.set(seg, x);
    }
    public static MemorySegment pszName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_NCryptAlgorithmName.pszName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszName$set(MemorySegment seg, long index, MemorySegment x) {
        _NCryptAlgorithmName.pszName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwClass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwClass"));
    public static VarHandle dwClass$VH() {
        return _NCryptAlgorithmName.dwClass$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwClass;
     * }
     */
    public static int dwClass$get(MemorySegment seg) {
        return (int)_NCryptAlgorithmName.dwClass$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwClass;
     * }
     */
    public static void dwClass$set(MemorySegment seg, int x) {
        _NCryptAlgorithmName.dwClass$VH.set(seg, x);
    }
    public static int dwClass$get(MemorySegment seg, long index) {
        return (int)_NCryptAlgorithmName.dwClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwClass$set(MemorySegment seg, long index, int x) {
        _NCryptAlgorithmName.dwClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwAlgOperations$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwAlgOperations"));
    public static VarHandle dwAlgOperations$VH() {
        return _NCryptAlgorithmName.dwAlgOperations$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwAlgOperations;
     * }
     */
    public static int dwAlgOperations$get(MemorySegment seg) {
        return (int)_NCryptAlgorithmName.dwAlgOperations$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwAlgOperations;
     * }
     */
    public static void dwAlgOperations$set(MemorySegment seg, int x) {
        _NCryptAlgorithmName.dwAlgOperations$VH.set(seg, x);
    }
    public static int dwAlgOperations$get(MemorySegment seg, long index) {
        return (int)_NCryptAlgorithmName.dwAlgOperations$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAlgOperations$set(MemorySegment seg, long index, int x) {
        _NCryptAlgorithmName.dwAlgOperations$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _NCryptAlgorithmName.dwFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_NCryptAlgorithmName.dwFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        _NCryptAlgorithmName.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_NCryptAlgorithmName.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _NCryptAlgorithmName.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

