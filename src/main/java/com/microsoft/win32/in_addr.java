// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct in_addr {
 *     union  S_un;
 * };
 * }
 */
public class in_addr {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("s_b1"),
                Constants$root.C_CHAR$LAYOUT.withName("s_b2"),
                Constants$root.C_CHAR$LAYOUT.withName("s_b3"),
                Constants$root.C_CHAR$LAYOUT.withName("s_b4")
            ).withName("S_un_b"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("s_w1"),
                Constants$root.C_SHORT$LAYOUT.withName("s_w2")
            ).withName("S_un_w"),
            Constants$root.C_LONG$LAYOUT.withName("S_addr")
        ).withName("S_un")
    ).withName("in_addr");
    public static MemoryLayout $LAYOUT() {
        return in_addr.$struct$LAYOUT;
    }
    /**
     * {@snippet :
     * union {
     *     struct  S_un_b;
     *     struct  S_un_w;
     *     ULONG S_addr;
     * };
     * }
     */
    public static final class S_un {

        // Suppresses default constructor, ensuring non-instantiability.
        private S_un() {}
        static final UnionLayout S_un$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("s_b1"),
                Constants$root.C_CHAR$LAYOUT.withName("s_b2"),
                Constants$root.C_CHAR$LAYOUT.withName("s_b3"),
                Constants$root.C_CHAR$LAYOUT.withName("s_b4")
            ).withName("S_un_b"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("s_w1"),
                Constants$root.C_SHORT$LAYOUT.withName("s_w2")
            ).withName("S_un_w"),
            Constants$root.C_LONG$LAYOUT.withName("S_addr")
        );
        public static MemoryLayout $LAYOUT() {
            return S_un.S_un$union$LAYOUT;
        }
        /**
         * {@snippet :
         * struct {
         *     UCHAR s_b1;
         *     UCHAR s_b2;
         *     UCHAR s_b3;
         *     UCHAR s_b4;
         * };
         * }
         */
        public static final class S_un_b {

            // Suppresses default constructor, ensuring non-instantiability.
            private S_un_b() {}
            static final StructLayout S_un$S_un_b$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("s_b1"),
                Constants$root.C_CHAR$LAYOUT.withName("s_b2"),
                Constants$root.C_CHAR$LAYOUT.withName("s_b3"),
                Constants$root.C_CHAR$LAYOUT.withName("s_b4")
            );
            public static MemoryLayout $LAYOUT() {
                return S_un_b.S_un$S_un_b$struct$LAYOUT;
            }
            static final VarHandle s_b1$VH = S_un$S_un_b$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("s_b1"));
            public static VarHandle s_b1$VH() {
                return S_un_b.s_b1$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * UCHAR s_b1;
             * }
             */
            public static byte s_b1$get(MemorySegment seg) {
                return (byte)S_un_b.s_b1$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * UCHAR s_b1;
             * }
             */
            public static void s_b1$set(MemorySegment seg, byte x) {
                S_un_b.s_b1$VH.set(seg, x);
            }
            public static byte s_b1$get(MemorySegment seg, long index) {
                return (byte)S_un_b.s_b1$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void s_b1$set(MemorySegment seg, long index, byte x) {
                S_un_b.s_b1$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle s_b2$VH = S_un$S_un_b$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("s_b2"));
            public static VarHandle s_b2$VH() {
                return S_un_b.s_b2$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * UCHAR s_b2;
             * }
             */
            public static byte s_b2$get(MemorySegment seg) {
                return (byte)S_un_b.s_b2$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * UCHAR s_b2;
             * }
             */
            public static void s_b2$set(MemorySegment seg, byte x) {
                S_un_b.s_b2$VH.set(seg, x);
            }
            public static byte s_b2$get(MemorySegment seg, long index) {
                return (byte)S_un_b.s_b2$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void s_b2$set(MemorySegment seg, long index, byte x) {
                S_un_b.s_b2$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle s_b3$VH = S_un$S_un_b$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("s_b3"));
            public static VarHandle s_b3$VH() {
                return S_un_b.s_b3$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * UCHAR s_b3;
             * }
             */
            public static byte s_b3$get(MemorySegment seg) {
                return (byte)S_un_b.s_b3$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * UCHAR s_b3;
             * }
             */
            public static void s_b3$set(MemorySegment seg, byte x) {
                S_un_b.s_b3$VH.set(seg, x);
            }
            public static byte s_b3$get(MemorySegment seg, long index) {
                return (byte)S_un_b.s_b3$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void s_b3$set(MemorySegment seg, long index, byte x) {
                S_un_b.s_b3$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle s_b4$VH = S_un$S_un_b$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("s_b4"));
            public static VarHandle s_b4$VH() {
                return S_un_b.s_b4$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * UCHAR s_b4;
             * }
             */
            public static byte s_b4$get(MemorySegment seg) {
                return (byte)S_un_b.s_b4$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * UCHAR s_b4;
             * }
             */
            public static void s_b4$set(MemorySegment seg, byte x) {
                S_un_b.s_b4$VH.set(seg, x);
            }
            public static byte s_b4$get(MemorySegment seg, long index) {
                return (byte)S_un_b.s_b4$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void s_b4$set(MemorySegment seg, long index, byte x) {
                S_un_b.s_b4$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
        }

        public static MemorySegment S_un_b$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        /**
         * {@snippet :
         * struct {
         *     USHORT s_w1;
         *     USHORT s_w2;
         * };
         * }
         */
        public static final class S_un_w {

            // Suppresses default constructor, ensuring non-instantiability.
            private S_un_w() {}
            static final StructLayout S_un$S_un_w$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("s_w1"),
                Constants$root.C_SHORT$LAYOUT.withName("s_w2")
            );
            public static MemoryLayout $LAYOUT() {
                return S_un_w.S_un$S_un_w$struct$LAYOUT;
            }
            static final VarHandle s_w1$VH = S_un$S_un_w$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("s_w1"));
            public static VarHandle s_w1$VH() {
                return S_un_w.s_w1$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * USHORT s_w1;
             * }
             */
            public static short s_w1$get(MemorySegment seg) {
                return (short)S_un_w.s_w1$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * USHORT s_w1;
             * }
             */
            public static void s_w1$set(MemorySegment seg, short x) {
                S_un_w.s_w1$VH.set(seg, x);
            }
            public static short s_w1$get(MemorySegment seg, long index) {
                return (short)S_un_w.s_w1$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void s_w1$set(MemorySegment seg, long index, short x) {
                S_un_w.s_w1$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle s_w2$VH = S_un$S_un_w$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("s_w2"));
            public static VarHandle s_w2$VH() {
                return S_un_w.s_w2$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * USHORT s_w2;
             * }
             */
            public static short s_w2$get(MemorySegment seg) {
                return (short)S_un_w.s_w2$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * USHORT s_w2;
             * }
             */
            public static void s_w2$set(MemorySegment seg, short x) {
                S_un_w.s_w2$VH.set(seg, x);
            }
            public static short s_w2$get(MemorySegment seg, long index) {
                return (short)S_un_w.s_w2$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void s_w2$set(MemorySegment seg, long index, short x) {
                S_un_w.s_w2$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
        }

        public static MemorySegment S_un_w$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        static final VarHandle S_addr$VH = S_un$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("S_addr"));
        public static VarHandle S_addr$VH() {
            return S_un.S_addr$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * ULONG S_addr;
         * }
         */
        public static int S_addr$get(MemorySegment seg) {
            return (int)S_un.S_addr$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * ULONG S_addr;
         * }
         */
        public static void S_addr$set(MemorySegment seg, int x) {
            S_un.S_addr$VH.set(seg, x);
        }
        public static int S_addr$get(MemorySegment seg, long index) {
            return (int)S_un.S_addr$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void S_addr$set(MemorySegment seg, long index, int x) {
            S_un.S_addr$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment S_un$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

