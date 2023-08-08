// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STREAM_INFORMATION_ENTRY {
 *     DWORD Version;
 *     DWORD Flags;
 *     union _StreamInformation StreamInformation;
 * };
 * }
 */
public class _STREAM_INFORMATION_ENTRY {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Class"),
                Constants$root.C_LONG$LAYOUT.withName("Flags")
            ).withName("DesiredStorageClass"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("Length"),
                Constants$root.C_SHORT$LAYOUT.withName("Flags"),
                Constants$root.C_LONG$LAYOUT.withName("Reserved"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("Vdl")
            ).withName("DataStream"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("Length"),
                Constants$root.C_SHORT$LAYOUT.withName("Flags"),
                Constants$root.C_LONG$LAYOUT.withName("ReparseDataSize"),
                Constants$root.C_LONG$LAYOUT.withName("ReparseDataOffset")
            ).withName("Reparse"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("Length"),
                Constants$root.C_SHORT$LAYOUT.withName("Flags"),
                Constants$root.C_LONG$LAYOUT.withName("EaSize"),
                Constants$root.C_LONG$LAYOUT.withName("EaInformationOffset")
            ).withName("Ea")
        ).withName("StreamInformation")
    ).withName("_STREAM_INFORMATION_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _STREAM_INFORMATION_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STREAM_INFORMATION_ENTRY.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_STREAM_INFORMATION_ENTRY.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _STREAM_INFORMATION_ENTRY.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STREAM_INFORMATION_ENTRY.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STREAM_INFORMATION_ENTRY.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _STREAM_INFORMATION_ENTRY.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_STREAM_INFORMATION_ENTRY.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _STREAM_INFORMATION_ENTRY.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_STREAM_INFORMATION_ENTRY.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _STREAM_INFORMATION_ENTRY.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union _StreamInformation {
     *     struct _DesiredStorageClass DesiredStorageClass;
     *     struct _DataStream DataStream;
     *     struct _Reparse Reparse;
     *     struct _Ea Ea;
     * };
     * }
     */
    public static final class _StreamInformation {

        // Suppresses default constructor, ensuring non-instantiability.
        private _StreamInformation() {}
        static final UnionLayout _StreamInformation$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Class"),
                Constants$root.C_LONG$LAYOUT.withName("Flags")
            ).withName("DesiredStorageClass"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("Length"),
                Constants$root.C_SHORT$LAYOUT.withName("Flags"),
                Constants$root.C_LONG$LAYOUT.withName("Reserved"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("Vdl")
            ).withName("DataStream"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("Length"),
                Constants$root.C_SHORT$LAYOUT.withName("Flags"),
                Constants$root.C_LONG$LAYOUT.withName("ReparseDataSize"),
                Constants$root.C_LONG$LAYOUT.withName("ReparseDataOffset")
            ).withName("Reparse"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("Length"),
                Constants$root.C_SHORT$LAYOUT.withName("Flags"),
                Constants$root.C_LONG$LAYOUT.withName("EaSize"),
                Constants$root.C_LONG$LAYOUT.withName("EaInformationOffset")
            ).withName("Ea")
        ).withName("_StreamInformation");
        public static MemoryLayout $LAYOUT() {
            return _StreamInformation._StreamInformation$union$LAYOUT;
        }
        /**
         * {@snippet :
         * struct _DesiredStorageClass {
         *     FILE_STORAGE_TIER_CLASS Class;
         *     DWORD Flags;
         * };
         * }
         */
        public static final class _DesiredStorageClass {

            // Suppresses default constructor, ensuring non-instantiability.
            private _DesiredStorageClass() {}
            static final StructLayout _StreamInformation$_DesiredStorageClass$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Class"),
                Constants$root.C_LONG$LAYOUT.withName("Flags")
            ).withName("_DesiredStorageClass");
            public static MemoryLayout $LAYOUT() {
                return _DesiredStorageClass._StreamInformation$_DesiredStorageClass$struct$LAYOUT;
            }
            static final VarHandle Class$VH = _StreamInformation$_DesiredStorageClass$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Class"));
            public static VarHandle Class$VH() {
                return _DesiredStorageClass.Class$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * FILE_STORAGE_TIER_CLASS Class;
             * }
             */
            public static int Class$get(MemorySegment seg) {
                return (int)_DesiredStorageClass.Class$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * FILE_STORAGE_TIER_CLASS Class;
             * }
             */
            public static void Class$set(MemorySegment seg, int x) {
                _DesiredStorageClass.Class$VH.set(seg, x);
            }
            public static int Class$get(MemorySegment seg, long index) {
                return (int)_DesiredStorageClass.Class$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Class$set(MemorySegment seg, long index, int x) {
                _DesiredStorageClass.Class$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle Flags$VH = _StreamInformation$_DesiredStorageClass$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
            public static VarHandle Flags$VH() {
                return _DesiredStorageClass.Flags$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD Flags;
             * }
             */
            public static int Flags$get(MemorySegment seg) {
                return (int)_DesiredStorageClass.Flags$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD Flags;
             * }
             */
            public static void Flags$set(MemorySegment seg, int x) {
                _DesiredStorageClass.Flags$VH.set(seg, x);
            }
            public static int Flags$get(MemorySegment seg, long index) {
                return (int)_DesiredStorageClass.Flags$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(MemorySegment seg, long index, int x) {
                _DesiredStorageClass.Flags$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
        }

        public static MemorySegment DesiredStorageClass$slice(MemorySegment seg) {
            return seg.asSlice(0, 8);
        }
        /**
         * {@snippet :
         * struct _DataStream {
         *     WORD Length;
         *     WORD Flags;
         *     DWORD Reserved;
         *     DWORDLONG Vdl;
         * };
         * }
         */
        public static final class _DataStream {

            // Suppresses default constructor, ensuring non-instantiability.
            private _DataStream() {}
            static final StructLayout _StreamInformation$_DataStream$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("Length"),
                Constants$root.C_SHORT$LAYOUT.withName("Flags"),
                Constants$root.C_LONG$LAYOUT.withName("Reserved"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("Vdl")
            ).withName("_DataStream");
            public static MemoryLayout $LAYOUT() {
                return _DataStream._StreamInformation$_DataStream$struct$LAYOUT;
            }
            static final VarHandle Length$VH = _StreamInformation$_DataStream$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
            public static VarHandle Length$VH() {
                return _DataStream.Length$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * WORD Length;
             * }
             */
            public static short Length$get(MemorySegment seg) {
                return (short)_DataStream.Length$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * WORD Length;
             * }
             */
            public static void Length$set(MemorySegment seg, short x) {
                _DataStream.Length$VH.set(seg, x);
            }
            public static short Length$get(MemorySegment seg, long index) {
                return (short)_DataStream.Length$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Length$set(MemorySegment seg, long index, short x) {
                _DataStream.Length$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle Flags$VH = _StreamInformation$_DataStream$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
            public static VarHandle Flags$VH() {
                return _DataStream.Flags$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * WORD Flags;
             * }
             */
            public static short Flags$get(MemorySegment seg) {
                return (short)_DataStream.Flags$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * WORD Flags;
             * }
             */
            public static void Flags$set(MemorySegment seg, short x) {
                _DataStream.Flags$VH.set(seg, x);
            }
            public static short Flags$get(MemorySegment seg, long index) {
                return (short)_DataStream.Flags$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(MemorySegment seg, long index, short x) {
                _DataStream.Flags$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle Reserved$VH = _StreamInformation$_DataStream$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
            public static VarHandle Reserved$VH() {
                return _DataStream.Reserved$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD Reserved;
             * }
             */
            public static int Reserved$get(MemorySegment seg) {
                return (int)_DataStream.Reserved$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD Reserved;
             * }
             */
            public static void Reserved$set(MemorySegment seg, int x) {
                _DataStream.Reserved$VH.set(seg, x);
            }
            public static int Reserved$get(MemorySegment seg, long index) {
                return (int)_DataStream.Reserved$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Reserved$set(MemorySegment seg, long index, int x) {
                _DataStream.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle Vdl$VH = _StreamInformation$_DataStream$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Vdl"));
            public static VarHandle Vdl$VH() {
                return _DataStream.Vdl$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORDLONG Vdl;
             * }
             */
            public static long Vdl$get(MemorySegment seg) {
                return (long)_DataStream.Vdl$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORDLONG Vdl;
             * }
             */
            public static void Vdl$set(MemorySegment seg, long x) {
                _DataStream.Vdl$VH.set(seg, x);
            }
            public static long Vdl$get(MemorySegment seg, long index) {
                return (long)_DataStream.Vdl$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Vdl$set(MemorySegment seg, long index, long x) {
                _DataStream.Vdl$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
        }

        public static MemorySegment DataStream$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        /**
         * {@snippet :
         * struct _Reparse {
         *     WORD Length;
         *     WORD Flags;
         *     DWORD ReparseDataSize;
         *     DWORD ReparseDataOffset;
         * };
         * }
         */
        public static final class _Reparse {

            // Suppresses default constructor, ensuring non-instantiability.
            private _Reparse() {}
            static final StructLayout _StreamInformation$_Reparse$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("Length"),
                Constants$root.C_SHORT$LAYOUT.withName("Flags"),
                Constants$root.C_LONG$LAYOUT.withName("ReparseDataSize"),
                Constants$root.C_LONG$LAYOUT.withName("ReparseDataOffset")
            ).withName("_Reparse");
            public static MemoryLayout $LAYOUT() {
                return _Reparse._StreamInformation$_Reparse$struct$LAYOUT;
            }
            static final VarHandle Length$VH = _StreamInformation$_Reparse$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
            public static VarHandle Length$VH() {
                return _Reparse.Length$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * WORD Length;
             * }
             */
            public static short Length$get(MemorySegment seg) {
                return (short)_Reparse.Length$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * WORD Length;
             * }
             */
            public static void Length$set(MemorySegment seg, short x) {
                _Reparse.Length$VH.set(seg, x);
            }
            public static short Length$get(MemorySegment seg, long index) {
                return (short)_Reparse.Length$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Length$set(MemorySegment seg, long index, short x) {
                _Reparse.Length$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle Flags$VH = _StreamInformation$_Reparse$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
            public static VarHandle Flags$VH() {
                return _Reparse.Flags$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * WORD Flags;
             * }
             */
            public static short Flags$get(MemorySegment seg) {
                return (short)_Reparse.Flags$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * WORD Flags;
             * }
             */
            public static void Flags$set(MemorySegment seg, short x) {
                _Reparse.Flags$VH.set(seg, x);
            }
            public static short Flags$get(MemorySegment seg, long index) {
                return (short)_Reparse.Flags$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(MemorySegment seg, long index, short x) {
                _Reparse.Flags$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle ReparseDataSize$VH = _StreamInformation$_Reparse$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReparseDataSize"));
            public static VarHandle ReparseDataSize$VH() {
                return _Reparse.ReparseDataSize$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD ReparseDataSize;
             * }
             */
            public static int ReparseDataSize$get(MemorySegment seg) {
                return (int)_Reparse.ReparseDataSize$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD ReparseDataSize;
             * }
             */
            public static void ReparseDataSize$set(MemorySegment seg, int x) {
                _Reparse.ReparseDataSize$VH.set(seg, x);
            }
            public static int ReparseDataSize$get(MemorySegment seg, long index) {
                return (int)_Reparse.ReparseDataSize$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void ReparseDataSize$set(MemorySegment seg, long index, int x) {
                _Reparse.ReparseDataSize$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle ReparseDataOffset$VH = _StreamInformation$_Reparse$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReparseDataOffset"));
            public static VarHandle ReparseDataOffset$VH() {
                return _Reparse.ReparseDataOffset$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD ReparseDataOffset;
             * }
             */
            public static int ReparseDataOffset$get(MemorySegment seg) {
                return (int)_Reparse.ReparseDataOffset$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD ReparseDataOffset;
             * }
             */
            public static void ReparseDataOffset$set(MemorySegment seg, int x) {
                _Reparse.ReparseDataOffset$VH.set(seg, x);
            }
            public static int ReparseDataOffset$get(MemorySegment seg, long index) {
                return (int)_Reparse.ReparseDataOffset$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void ReparseDataOffset$set(MemorySegment seg, long index, int x) {
                _Reparse.ReparseDataOffset$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
        }

        public static MemorySegment Reparse$slice(MemorySegment seg) {
            return seg.asSlice(0, 12);
        }
        /**
         * {@snippet :
         * struct _Ea {
         *     WORD Length;
         *     WORD Flags;
         *     DWORD EaSize;
         *     DWORD EaInformationOffset;
         * };
         * }
         */
        public static final class _Ea {

            // Suppresses default constructor, ensuring non-instantiability.
            private _Ea() {}
            static final StructLayout _StreamInformation$_Ea$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("Length"),
                Constants$root.C_SHORT$LAYOUT.withName("Flags"),
                Constants$root.C_LONG$LAYOUT.withName("EaSize"),
                Constants$root.C_LONG$LAYOUT.withName("EaInformationOffset")
            ).withName("_Ea");
            public static MemoryLayout $LAYOUT() {
                return _Ea._StreamInformation$_Ea$struct$LAYOUT;
            }
            static final VarHandle Length$VH = _StreamInformation$_Ea$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
            public static VarHandle Length$VH() {
                return _Ea.Length$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * WORD Length;
             * }
             */
            public static short Length$get(MemorySegment seg) {
                return (short)_Ea.Length$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * WORD Length;
             * }
             */
            public static void Length$set(MemorySegment seg, short x) {
                _Ea.Length$VH.set(seg, x);
            }
            public static short Length$get(MemorySegment seg, long index) {
                return (short)_Ea.Length$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Length$set(MemorySegment seg, long index, short x) {
                _Ea.Length$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle Flags$VH = _StreamInformation$_Ea$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
            public static VarHandle Flags$VH() {
                return _Ea.Flags$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * WORD Flags;
             * }
             */
            public static short Flags$get(MemorySegment seg) {
                return (short)_Ea.Flags$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * WORD Flags;
             * }
             */
            public static void Flags$set(MemorySegment seg, short x) {
                _Ea.Flags$VH.set(seg, x);
            }
            public static short Flags$get(MemorySegment seg, long index) {
                return (short)_Ea.Flags$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(MemorySegment seg, long index, short x) {
                _Ea.Flags$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle EaSize$VH = _StreamInformation$_Ea$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EaSize"));
            public static VarHandle EaSize$VH() {
                return _Ea.EaSize$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD EaSize;
             * }
             */
            public static int EaSize$get(MemorySegment seg) {
                return (int)_Ea.EaSize$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD EaSize;
             * }
             */
            public static void EaSize$set(MemorySegment seg, int x) {
                _Ea.EaSize$VH.set(seg, x);
            }
            public static int EaSize$get(MemorySegment seg, long index) {
                return (int)_Ea.EaSize$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void EaSize$set(MemorySegment seg, long index, int x) {
                _Ea.EaSize$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle EaInformationOffset$VH = _StreamInformation$_Ea$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EaInformationOffset"));
            public static VarHandle EaInformationOffset$VH() {
                return _Ea.EaInformationOffset$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD EaInformationOffset;
             * }
             */
            public static int EaInformationOffset$get(MemorySegment seg) {
                return (int)_Ea.EaInformationOffset$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD EaInformationOffset;
             * }
             */
            public static void EaInformationOffset$set(MemorySegment seg, int x) {
                _Ea.EaInformationOffset$VH.set(seg, x);
            }
            public static int EaInformationOffset$get(MemorySegment seg, long index) {
                return (int)_Ea.EaInformationOffset$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void EaInformationOffset$set(MemorySegment seg, long index, int x) {
                _Ea.EaInformationOffset$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
        }

        public static MemorySegment Ea$slice(MemorySegment seg) {
            return seg.asSlice(0, 12);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment StreamInformation$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

