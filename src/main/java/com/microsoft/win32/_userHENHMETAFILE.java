// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _userHENHMETAFILE {
 *     LONG fContext;
 *     union __MIDL_IWinTypes_0006 u;
 * };
 * }
 */
public class _userHENHMETAFILE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("fContext"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("hInproc"),
            Constants$root.C_POINTER$LAYOUT.withName("hRemote"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("hInproc64")
        ).withName("u")
    ).withName("_userHENHMETAFILE");
    public static MemoryLayout $LAYOUT() {
        return _userHENHMETAFILE.$struct$LAYOUT;
    }
    static final VarHandle fContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fContext"));
    public static VarHandle fContext$VH() {
        return _userHENHMETAFILE.fContext$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG fContext;
     * }
     */
    public static int fContext$get(MemorySegment seg) {
        return (int)_userHENHMETAFILE.fContext$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG fContext;
     * }
     */
    public static void fContext$set(MemorySegment seg, int x) {
        _userHENHMETAFILE.fContext$VH.set(seg, x);
    }
    public static int fContext$get(MemorySegment seg, long index) {
        return (int)_userHENHMETAFILE.fContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fContext$set(MemorySegment seg, long index, int x) {
        _userHENHMETAFILE.fContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union __MIDL_IWinTypes_0006 {
     *     LONG hInproc;
     *     BYTE_BLOB* hRemote;
     *     long long hInproc64;
     * };
     * }
     */
    public static final class __MIDL_IWinTypes_0006 {

        // Suppresses default constructor, ensuring non-instantiability.
        private __MIDL_IWinTypes_0006() {}
        static final UnionLayout __MIDL_IWinTypes_0006$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("hInproc"),
            Constants$root.C_POINTER$LAYOUT.withName("hRemote"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("hInproc64")
        ).withName("__MIDL_IWinTypes_0006");
        public static MemoryLayout $LAYOUT() {
            return __MIDL_IWinTypes_0006.__MIDL_IWinTypes_0006$union$LAYOUT;
        }
        static final VarHandle hInproc$VH = __MIDL_IWinTypes_0006$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hInproc"));
        public static VarHandle hInproc$VH() {
            return __MIDL_IWinTypes_0006.hInproc$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * LONG hInproc;
         * }
         */
        public static int hInproc$get(MemorySegment seg) {
            return (int)__MIDL_IWinTypes_0006.hInproc$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * LONG hInproc;
         * }
         */
        public static void hInproc$set(MemorySegment seg, int x) {
            __MIDL_IWinTypes_0006.hInproc$VH.set(seg, x);
        }
        public static int hInproc$get(MemorySegment seg, long index) {
            return (int)__MIDL_IWinTypes_0006.hInproc$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void hInproc$set(MemorySegment seg, long index, int x) {
            __MIDL_IWinTypes_0006.hInproc$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle hRemote$VH = __MIDL_IWinTypes_0006$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hRemote"));
        public static VarHandle hRemote$VH() {
            return __MIDL_IWinTypes_0006.hRemote$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * BYTE_BLOB* hRemote;
         * }
         */
        public static MemorySegment hRemote$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)__MIDL_IWinTypes_0006.hRemote$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * BYTE_BLOB* hRemote;
         * }
         */
        public static void hRemote$set(MemorySegment seg, MemorySegment x) {
            __MIDL_IWinTypes_0006.hRemote$VH.set(seg, x);
        }
        public static MemorySegment hRemote$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)__MIDL_IWinTypes_0006.hRemote$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void hRemote$set(MemorySegment seg, long index, MemorySegment x) {
            __MIDL_IWinTypes_0006.hRemote$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle hInproc64$VH = __MIDL_IWinTypes_0006$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hInproc64"));
        public static VarHandle hInproc64$VH() {
            return __MIDL_IWinTypes_0006.hInproc64$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * long long hInproc64;
         * }
         */
        public static long hInproc64$get(MemorySegment seg) {
            return (long)__MIDL_IWinTypes_0006.hInproc64$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * long long hInproc64;
         * }
         */
        public static void hInproc64$set(MemorySegment seg, long x) {
            __MIDL_IWinTypes_0006.hInproc64$VH.set(seg, x);
        }
        public static long hInproc64$get(MemorySegment seg, long index) {
            return (long)__MIDL_IWinTypes_0006.hInproc64$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void hInproc64$set(MemorySegment seg, long index, long x) {
            __MIDL_IWinTypes_0006.hInproc64$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment u$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


