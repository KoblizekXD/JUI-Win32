// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union _ULARGE_INTEGER {
 *     struct {
 *         DWORD LowPart;
 *         DWORD HighPart;
 *     };
 *     struct  u;
 *     ULONGLONG QuadPart;
 * };
 * }
 */
public class _ULARGE_INTEGER {

    static final UnionLayout $union$LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("LowPart"),
            Constants$root.C_LONG$LAYOUT.withName("HighPart")
        ).withName("$anon$0"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("LowPart"),
            Constants$root.C_LONG$LAYOUT.withName("HighPart")
        ).withName("u"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
    ).withName("_ULARGE_INTEGER");
    public static MemoryLayout $LAYOUT() {
        return _ULARGE_INTEGER.$union$LAYOUT;
    }
    static final VarHandle LowPart$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("LowPart"));
    public static VarHandle LowPart$VH() {
        return _ULARGE_INTEGER.LowPart$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD LowPart;
     * }
     */
    public static int LowPart$get(MemorySegment seg) {
        return (int)_ULARGE_INTEGER.LowPart$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD LowPart;
     * }
     */
    public static void LowPart$set(MemorySegment seg, int x) {
        _ULARGE_INTEGER.LowPart$VH.set(seg, x);
    }
    public static int LowPart$get(MemorySegment seg, long index) {
        return (int)_ULARGE_INTEGER.LowPart$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LowPart$set(MemorySegment seg, long index, int x) {
        _ULARGE_INTEGER.LowPart$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HighPart$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("HighPart"));
    public static VarHandle HighPart$VH() {
        return _ULARGE_INTEGER.HighPart$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD HighPart;
     * }
     */
    public static int HighPart$get(MemorySegment seg) {
        return (int)_ULARGE_INTEGER.HighPart$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD HighPart;
     * }
     */
    public static void HighPart$set(MemorySegment seg, int x) {
        _ULARGE_INTEGER.HighPart$VH.set(seg, x);
    }
    public static int HighPart$get(MemorySegment seg, long index) {
        return (int)_ULARGE_INTEGER.HighPart$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HighPart$set(MemorySegment seg, long index, int x) {
        _ULARGE_INTEGER.HighPart$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * struct {
     *     DWORD LowPart;
     *     DWORD HighPart;
     * };
     * }
     */
    public static final class u {

        // Suppresses default constructor, ensuring non-instantiability.
        private u() {}
        static final StructLayout u$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("LowPart"),
            Constants$root.C_LONG$LAYOUT.withName("HighPart")
        );
        public static MemoryLayout $LAYOUT() {
            return u.u$struct$LAYOUT;
        }
        static final VarHandle LowPart$VH = u$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LowPart"));
        public static VarHandle LowPart$VH() {
            return u.LowPart$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD LowPart;
         * }
         */
        public static int LowPart$get(MemorySegment seg) {
            return (int)u.LowPart$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD LowPart;
         * }
         */
        public static void LowPart$set(MemorySegment seg, int x) {
            u.LowPart$VH.set(seg, x);
        }
        public static int LowPart$get(MemorySegment seg, long index) {
            return (int)u.LowPart$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void LowPart$set(MemorySegment seg, long index, int x) {
            u.LowPart$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle HighPart$VH = u$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HighPart"));
        public static VarHandle HighPart$VH() {
            return u.HighPart$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD HighPart;
         * }
         */
        public static int HighPart$get(MemorySegment seg) {
            return (int)u.HighPart$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD HighPart;
         * }
         */
        public static void HighPart$set(MemorySegment seg, int x) {
            u.HighPart$VH.set(seg, x);
        }
        public static int HighPart$get(MemorySegment seg, long index) {
            return (int)u.HighPart$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void HighPart$set(MemorySegment seg, long index, int x) {
            u.HighPart$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment u$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle QuadPart$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QuadPart"));
    public static VarHandle QuadPart$VH() {
        return _ULARGE_INTEGER.QuadPart$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG QuadPart;
     * }
     */
    public static long QuadPart$get(MemorySegment seg) {
        return (long)_ULARGE_INTEGER.QuadPart$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG QuadPart;
     * }
     */
    public static void QuadPart$set(MemorySegment seg, long x) {
        _ULARGE_INTEGER.QuadPart$VH.set(seg, x);
    }
    public static long QuadPart$get(MemorySegment seg, long index) {
        return (long)_ULARGE_INTEGER.QuadPart$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QuadPart$set(MemorySegment seg, long index, long x) {
        _ULARGE_INTEGER.QuadPart$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


