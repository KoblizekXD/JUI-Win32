// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _WOW64_LDT_ENTRY {
 *     WORD LimitLow;
 *     WORD BaseLow;
 *     union  HighWord;
 * };
 * }
 */
public class _WOW64_LDT_ENTRY {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("LimitLow"),
        Constants$root.C_SHORT$LAYOUT.withName("BaseLow"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("BaseMid"),
                Constants$root.C_CHAR$LAYOUT.withName("Flags1"),
                Constants$root.C_CHAR$LAYOUT.withName("Flags2"),
                Constants$root.C_CHAR$LAYOUT.withName("BaseHi")
            ).withName("Bytes"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(32)
            ).withName("Bits")
        ).withName("HighWord")
    ).withName("_WOW64_LDT_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _WOW64_LDT_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle LimitLow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LimitLow"));
    public static VarHandle LimitLow$VH() {
        return _WOW64_LDT_ENTRY.LimitLow$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD LimitLow;
     * }
     */
    public static short LimitLow$get(MemorySegment seg) {
        return (short)_WOW64_LDT_ENTRY.LimitLow$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD LimitLow;
     * }
     */
    public static void LimitLow$set(MemorySegment seg, short x) {
        _WOW64_LDT_ENTRY.LimitLow$VH.set(seg, x);
    }
    public static short LimitLow$get(MemorySegment seg, long index) {
        return (short)_WOW64_LDT_ENTRY.LimitLow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LimitLow$set(MemorySegment seg, long index, short x) {
        _WOW64_LDT_ENTRY.LimitLow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BaseLow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BaseLow"));
    public static VarHandle BaseLow$VH() {
        return _WOW64_LDT_ENTRY.BaseLow$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD BaseLow;
     * }
     */
    public static short BaseLow$get(MemorySegment seg) {
        return (short)_WOW64_LDT_ENTRY.BaseLow$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD BaseLow;
     * }
     */
    public static void BaseLow$set(MemorySegment seg, short x) {
        _WOW64_LDT_ENTRY.BaseLow$VH.set(seg, x);
    }
    public static short BaseLow$get(MemorySegment seg, long index) {
        return (short)_WOW64_LDT_ENTRY.BaseLow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BaseLow$set(MemorySegment seg, long index, short x) {
        _WOW64_LDT_ENTRY.BaseLow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union {
     *     struct  Bytes;
     *     struct  Bits;
     * };
     * }
     */
    public static final class HighWord {

        // Suppresses default constructor, ensuring non-instantiability.
        private HighWord() {}
        static final UnionLayout HighWord$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("BaseMid"),
                Constants$root.C_CHAR$LAYOUT.withName("Flags1"),
                Constants$root.C_CHAR$LAYOUT.withName("Flags2"),
                Constants$root.C_CHAR$LAYOUT.withName("BaseHi")
            ).withName("Bytes"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(32)
            ).withName("Bits")
        );
        public static MemoryLayout $LAYOUT() {
            return HighWord.HighWord$union$LAYOUT;
        }
        /**
         * {@snippet :
         * struct {
         *     BYTE BaseMid;
         *     BYTE Flags1;
         *     BYTE Flags2;
         *     BYTE BaseHi;
         * };
         * }
         */
        public static final class Bytes {

            // Suppresses default constructor, ensuring non-instantiability.
            private Bytes() {}
            static final StructLayout HighWord$Bytes$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("BaseMid"),
                Constants$root.C_CHAR$LAYOUT.withName("Flags1"),
                Constants$root.C_CHAR$LAYOUT.withName("Flags2"),
                Constants$root.C_CHAR$LAYOUT.withName("BaseHi")
            );
            public static MemoryLayout $LAYOUT() {
                return Bytes.HighWord$Bytes$struct$LAYOUT;
            }
            static final VarHandle BaseMid$VH = HighWord$Bytes$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BaseMid"));
            public static VarHandle BaseMid$VH() {
                return Bytes.BaseMid$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE BaseMid;
             * }
             */
            public static byte BaseMid$get(MemorySegment seg) {
                return (byte)Bytes.BaseMid$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE BaseMid;
             * }
             */
            public static void BaseMid$set(MemorySegment seg, byte x) {
                Bytes.BaseMid$VH.set(seg, x);
            }
            public static byte BaseMid$get(MemorySegment seg, long index) {
                return (byte)Bytes.BaseMid$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void BaseMid$set(MemorySegment seg, long index, byte x) {
                Bytes.BaseMid$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle Flags1$VH = HighWord$Bytes$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags1"));
            public static VarHandle Flags1$VH() {
                return Bytes.Flags1$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE Flags1;
             * }
             */
            public static byte Flags1$get(MemorySegment seg) {
                return (byte)Bytes.Flags1$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE Flags1;
             * }
             */
            public static void Flags1$set(MemorySegment seg, byte x) {
                Bytes.Flags1$VH.set(seg, x);
            }
            public static byte Flags1$get(MemorySegment seg, long index) {
                return (byte)Bytes.Flags1$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Flags1$set(MemorySegment seg, long index, byte x) {
                Bytes.Flags1$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle Flags2$VH = HighWord$Bytes$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags2"));
            public static VarHandle Flags2$VH() {
                return Bytes.Flags2$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE Flags2;
             * }
             */
            public static byte Flags2$get(MemorySegment seg) {
                return (byte)Bytes.Flags2$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE Flags2;
             * }
             */
            public static void Flags2$set(MemorySegment seg, byte x) {
                Bytes.Flags2$VH.set(seg, x);
            }
            public static byte Flags2$get(MemorySegment seg, long index) {
                return (byte)Bytes.Flags2$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Flags2$set(MemorySegment seg, long index, byte x) {
                Bytes.Flags2$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle BaseHi$VH = HighWord$Bytes$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BaseHi"));
            public static VarHandle BaseHi$VH() {
                return Bytes.BaseHi$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE BaseHi;
             * }
             */
            public static byte BaseHi$get(MemorySegment seg) {
                return (byte)Bytes.BaseHi$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE BaseHi;
             * }
             */
            public static void BaseHi$set(MemorySegment seg, byte x) {
                Bytes.BaseHi$VH.set(seg, x);
            }
            public static byte BaseHi$get(MemorySegment seg, long index) {
                return (byte)Bytes.BaseHi$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void BaseHi$set(MemorySegment seg, long index, byte x) {
                Bytes.BaseHi$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
        }

        public static MemorySegment Bytes$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        /**
         * {@snippet :
         * struct {
         *              *     DWORD BaseMid;
         *     DWORD Type;
         *     DWORD Dpl;
         *     DWORD Pres;
         *     DWORD LimitHi;
         *     DWORD Sys;
         *     DWORD Reserved_0;
         *     DWORD Default_Big;
         *     DWORD Granularity;
         *     DWORD BaseHi;
         * };
         * }
         */
        public static final class Bits {

            // Suppresses default constructor, ensuring non-instantiability.
            private Bits() {}
            static final StructLayout HighWord$Bits$struct$LAYOUT = MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(32)
            );
            public static MemoryLayout $LAYOUT() {
                return Bits.HighWord$Bits$struct$LAYOUT;
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
        }

        public static MemorySegment Bits$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment HighWord$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


