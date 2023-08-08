// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STORAGE_OPERATIONAL_REASON {
 *     DWORD Version;
 *     DWORD Size;
 *     STORAGE_OPERATIONAL_STATUS_REASON Reason;
 *     union  RawBytes;
 * };
 * }
 */
public class _STORAGE_OPERATIONAL_REASON {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("Reason"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("SenseKey"),
                Constants$root.C_CHAR$LAYOUT.withName("ASC"),
                Constants$root.C_CHAR$LAYOUT.withName("ASCQ"),
                Constants$root.C_CHAR$LAYOUT.withName("Reserved")
            ).withName("ScsiSenseKey"),
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("CriticalHealth"),
                MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("ModuleHealth"),
                Constants$root.C_CHAR$LAYOUT.withName("ErrorThresholdStatus")
            ).withName("NVDIMM_N"),
            Constants$root.C_LONG$LAYOUT.withName("AsUlong")
        ).withName("RawBytes")
    ).withName("_STORAGE_OPERATIONAL_REASON");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_OPERATIONAL_REASON.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_OPERATIONAL_REASON.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_OPERATIONAL_REASON.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _STORAGE_OPERATIONAL_REASON.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_OPERATIONAL_REASON.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_OPERATIONAL_REASON.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_OPERATIONAL_REASON.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_OPERATIONAL_REASON.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _STORAGE_OPERATIONAL_REASON.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_OPERATIONAL_REASON.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_OPERATIONAL_REASON.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reason$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reason"));
    public static VarHandle Reason$VH() {
        return _STORAGE_OPERATIONAL_REASON.Reason$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * STORAGE_OPERATIONAL_STATUS_REASON Reason;
     * }
     */
    public static int Reason$get(MemorySegment seg) {
        return (int)_STORAGE_OPERATIONAL_REASON.Reason$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * STORAGE_OPERATIONAL_STATUS_REASON Reason;
     * }
     */
    public static void Reason$set(MemorySegment seg, int x) {
        _STORAGE_OPERATIONAL_REASON.Reason$VH.set(seg, x);
    }
    public static int Reason$get(MemorySegment seg, long index) {
        return (int)_STORAGE_OPERATIONAL_REASON.Reason$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reason$set(MemorySegment seg, long index, int x) {
        _STORAGE_OPERATIONAL_REASON.Reason$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union {
     *     struct  ScsiSenseKey;
     *     struct  NVDIMM_N;
     *     DWORD AsUlong;
     * };
     * }
     */
    public static final class RawBytes {

        // Suppresses default constructor, ensuring non-instantiability.
        private RawBytes() {}
        static final UnionLayout RawBytes$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("SenseKey"),
                Constants$root.C_CHAR$LAYOUT.withName("ASC"),
                Constants$root.C_CHAR$LAYOUT.withName("ASCQ"),
                Constants$root.C_CHAR$LAYOUT.withName("Reserved")
            ).withName("ScsiSenseKey"),
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("CriticalHealth"),
                MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("ModuleHealth"),
                Constants$root.C_CHAR$LAYOUT.withName("ErrorThresholdStatus")
            ).withName("NVDIMM_N"),
            Constants$root.C_LONG$LAYOUT.withName("AsUlong")
        );
        public static MemoryLayout $LAYOUT() {
            return RawBytes.RawBytes$union$LAYOUT;
        }
        /**
         * {@snippet :
         * struct {
         *     BYTE SenseKey;
         *     BYTE ASC;
         *     BYTE ASCQ;
         *     BYTE Reserved;
         * };
         * }
         */
        public static final class ScsiSenseKey {

            // Suppresses default constructor, ensuring non-instantiability.
            private ScsiSenseKey() {}
            static final StructLayout RawBytes$ScsiSenseKey$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("SenseKey"),
                Constants$root.C_CHAR$LAYOUT.withName("ASC"),
                Constants$root.C_CHAR$LAYOUT.withName("ASCQ"),
                Constants$root.C_CHAR$LAYOUT.withName("Reserved")
            );
            public static MemoryLayout $LAYOUT() {
                return ScsiSenseKey.RawBytes$ScsiSenseKey$struct$LAYOUT;
            }
            static final VarHandle SenseKey$VH = RawBytes$ScsiSenseKey$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SenseKey"));
            public static VarHandle SenseKey$VH() {
                return ScsiSenseKey.SenseKey$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE SenseKey;
             * }
             */
            public static byte SenseKey$get(MemorySegment seg) {
                return (byte)ScsiSenseKey.SenseKey$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE SenseKey;
             * }
             */
            public static void SenseKey$set(MemorySegment seg, byte x) {
                ScsiSenseKey.SenseKey$VH.set(seg, x);
            }
            public static byte SenseKey$get(MemorySegment seg, long index) {
                return (byte)ScsiSenseKey.SenseKey$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void SenseKey$set(MemorySegment seg, long index, byte x) {
                ScsiSenseKey.SenseKey$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle ASC$VH = RawBytes$ScsiSenseKey$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ASC"));
            public static VarHandle ASC$VH() {
                return ScsiSenseKey.ASC$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE ASC;
             * }
             */
            public static byte ASC$get(MemorySegment seg) {
                return (byte)ScsiSenseKey.ASC$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE ASC;
             * }
             */
            public static void ASC$set(MemorySegment seg, byte x) {
                ScsiSenseKey.ASC$VH.set(seg, x);
            }
            public static byte ASC$get(MemorySegment seg, long index) {
                return (byte)ScsiSenseKey.ASC$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void ASC$set(MemorySegment seg, long index, byte x) {
                ScsiSenseKey.ASC$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle ASCQ$VH = RawBytes$ScsiSenseKey$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ASCQ"));
            public static VarHandle ASCQ$VH() {
                return ScsiSenseKey.ASCQ$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE ASCQ;
             * }
             */
            public static byte ASCQ$get(MemorySegment seg) {
                return (byte)ScsiSenseKey.ASCQ$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE ASCQ;
             * }
             */
            public static void ASCQ$set(MemorySegment seg, byte x) {
                ScsiSenseKey.ASCQ$VH.set(seg, x);
            }
            public static byte ASCQ$get(MemorySegment seg, long index) {
                return (byte)ScsiSenseKey.ASCQ$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void ASCQ$set(MemorySegment seg, long index, byte x) {
                ScsiSenseKey.ASCQ$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle Reserved$VH = RawBytes$ScsiSenseKey$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
            public static VarHandle Reserved$VH() {
                return ScsiSenseKey.Reserved$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE Reserved;
             * }
             */
            public static byte Reserved$get(MemorySegment seg) {
                return (byte)ScsiSenseKey.Reserved$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE Reserved;
             * }
             */
            public static void Reserved$set(MemorySegment seg, byte x) {
                ScsiSenseKey.Reserved$VH.set(seg, x);
            }
            public static byte Reserved$get(MemorySegment seg, long index) {
                return (byte)ScsiSenseKey.Reserved$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Reserved$set(MemorySegment seg, long index, byte x) {
                ScsiSenseKey.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
        }

        public static MemorySegment ScsiSenseKey$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        /**
         * {@snippet :
         * struct {
         *     BYTE CriticalHealth;
         *     BYTE ModuleHealth[2];
         *     BYTE ErrorThresholdStatus;
         * };
         * }
         */
        public static final class NVDIMM_N {

            // Suppresses default constructor, ensuring non-instantiability.
            private NVDIMM_N() {}
            static final StructLayout RawBytes$NVDIMM_N$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("CriticalHealth"),
                MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("ModuleHealth"),
                Constants$root.C_CHAR$LAYOUT.withName("ErrorThresholdStatus")
            );
            public static MemoryLayout $LAYOUT() {
                return NVDIMM_N.RawBytes$NVDIMM_N$struct$LAYOUT;
            }
            static final VarHandle CriticalHealth$VH = RawBytes$NVDIMM_N$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CriticalHealth"));
            public static VarHandle CriticalHealth$VH() {
                return NVDIMM_N.CriticalHealth$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE CriticalHealth;
             * }
             */
            public static byte CriticalHealth$get(MemorySegment seg) {
                return (byte)NVDIMM_N.CriticalHealth$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE CriticalHealth;
             * }
             */
            public static void CriticalHealth$set(MemorySegment seg, byte x) {
                NVDIMM_N.CriticalHealth$VH.set(seg, x);
            }
            public static byte CriticalHealth$get(MemorySegment seg, long index) {
                return (byte)NVDIMM_N.CriticalHealth$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void CriticalHealth$set(MemorySegment seg, long index, byte x) {
                NVDIMM_N.CriticalHealth$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static MemorySegment ModuleHealth$slice(MemorySegment seg) {
                return seg.asSlice(1, 2);
            }
            static final VarHandle ErrorThresholdStatus$VH = RawBytes$NVDIMM_N$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ErrorThresholdStatus"));
            public static VarHandle ErrorThresholdStatus$VH() {
                return NVDIMM_N.ErrorThresholdStatus$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE ErrorThresholdStatus;
             * }
             */
            public static byte ErrorThresholdStatus$get(MemorySegment seg) {
                return (byte)NVDIMM_N.ErrorThresholdStatus$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE ErrorThresholdStatus;
             * }
             */
            public static void ErrorThresholdStatus$set(MemorySegment seg, byte x) {
                NVDIMM_N.ErrorThresholdStatus$VH.set(seg, x);
            }
            public static byte ErrorThresholdStatus$get(MemorySegment seg, long index) {
                return (byte)NVDIMM_N.ErrorThresholdStatus$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void ErrorThresholdStatus$set(MemorySegment seg, long index, byte x) {
                NVDIMM_N.ErrorThresholdStatus$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
        }

        public static MemorySegment NVDIMM_N$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        static final VarHandle AsUlong$VH = RawBytes$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AsUlong"));
        public static VarHandle AsUlong$VH() {
            return RawBytes.AsUlong$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD AsUlong;
         * }
         */
        public static int AsUlong$get(MemorySegment seg) {
            return (int)RawBytes.AsUlong$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD AsUlong;
         * }
         */
        public static void AsUlong$set(MemorySegment seg, int x) {
            RawBytes.AsUlong$VH.set(seg, x);
        }
        public static int AsUlong$get(MemorySegment seg, long index) {
            return (int)RawBytes.AsUlong$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void AsUlong$set(MemorySegment seg, long index, int x) {
            RawBytes.AsUlong$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment RawBytes$slice(MemorySegment seg) {
        return seg.asSlice(12, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


