// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PRINTER_NOTIFY_INFO_DATA {
 *     WORD Type;
 *     WORD Field;
 *     DWORD Reserved;
 *     DWORD Id;
 *     union  NotifyData;
 * };
 * }
 */
public class _PRINTER_NOTIFY_INFO_DATA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Type"),
        Constants$root.C_SHORT$LAYOUT.withName("Field"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved"),
        Constants$root.C_LONG$LAYOUT.withName("Id"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_LONG$LAYOUT).withName("adwData"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbBuf"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pBuf")
            ).withName("Data")
        ).withName("NotifyData")
    ).withName("_PRINTER_NOTIFY_INFO_DATA");
    public static MemoryLayout $LAYOUT() {
        return _PRINTER_NOTIFY_INFO_DATA.$struct$LAYOUT;
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return _PRINTER_NOTIFY_INFO_DATA.Type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Type;
     * }
     */
    public static short Type$get(MemorySegment seg) {
        return (short)_PRINTER_NOTIFY_INFO_DATA.Type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Type;
     * }
     */
    public static void Type$set(MemorySegment seg, short x) {
        _PRINTER_NOTIFY_INFO_DATA.Type$VH.set(seg, x);
    }
    public static short Type$get(MemorySegment seg, long index) {
        return (short)_PRINTER_NOTIFY_INFO_DATA.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, short x) {
        _PRINTER_NOTIFY_INFO_DATA.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Field$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Field"));
    public static VarHandle Field$VH() {
        return _PRINTER_NOTIFY_INFO_DATA.Field$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Field;
     * }
     */
    public static short Field$get(MemorySegment seg) {
        return (short)_PRINTER_NOTIFY_INFO_DATA.Field$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Field;
     * }
     */
    public static void Field$set(MemorySegment seg, short x) {
        _PRINTER_NOTIFY_INFO_DATA.Field$VH.set(seg, x);
    }
    public static short Field$get(MemorySegment seg, long index) {
        return (short)_PRINTER_NOTIFY_INFO_DATA.Field$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Field$set(MemorySegment seg, long index, short x) {
        _PRINTER_NOTIFY_INFO_DATA.Field$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _PRINTER_NOTIFY_INFO_DATA.Reserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static int Reserved$get(MemorySegment seg) {
        return (int)_PRINTER_NOTIFY_INFO_DATA.Reserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, int x) {
        _PRINTER_NOTIFY_INFO_DATA.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_PRINTER_NOTIFY_INFO_DATA.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _PRINTER_NOTIFY_INFO_DATA.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Id"));
    public static VarHandle Id$VH() {
        return _PRINTER_NOTIFY_INFO_DATA.Id$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Id;
     * }
     */
    public static int Id$get(MemorySegment seg) {
        return (int)_PRINTER_NOTIFY_INFO_DATA.Id$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Id;
     * }
     */
    public static void Id$set(MemorySegment seg, int x) {
        _PRINTER_NOTIFY_INFO_DATA.Id$VH.set(seg, x);
    }
    public static int Id$get(MemorySegment seg, long index) {
        return (int)_PRINTER_NOTIFY_INFO_DATA.Id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Id$set(MemorySegment seg, long index, int x) {
        _PRINTER_NOTIFY_INFO_DATA.Id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union {
     *     DWORD adwData[2];
     *     struct  Data;
     * };
     * }
     */
    public static final class NotifyData {

        // Suppresses default constructor, ensuring non-instantiability.
        private NotifyData() {}
        static final UnionLayout NotifyData$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_LONG$LAYOUT).withName("adwData"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbBuf"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pBuf")
            ).withName("Data")
        );
        public static MemoryLayout $LAYOUT() {
            return NotifyData.NotifyData$union$LAYOUT;
        }
        public static MemorySegment adwData$slice(MemorySegment seg) {
            return seg.asSlice(0, 8);
        }
        /**
         * {@snippet :
         * struct {
         *     DWORD cbBuf;
         *     LPVOID pBuf;
         * };
         * }
         */
        public static final class Data {

            // Suppresses default constructor, ensuring non-instantiability.
            private Data() {}
            static final StructLayout NotifyData$Data$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbBuf"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pBuf")
            );
            public static MemoryLayout $LAYOUT() {
                return Data.NotifyData$Data$struct$LAYOUT;
            }
            static final VarHandle cbBuf$VH = NotifyData$Data$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbBuf"));
            public static VarHandle cbBuf$VH() {
                return Data.cbBuf$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD cbBuf;
             * }
             */
            public static int cbBuf$get(MemorySegment seg) {
                return (int)Data.cbBuf$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD cbBuf;
             * }
             */
            public static void cbBuf$set(MemorySegment seg, int x) {
                Data.cbBuf$VH.set(seg, x);
            }
            public static int cbBuf$get(MemorySegment seg, long index) {
                return (int)Data.cbBuf$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void cbBuf$set(MemorySegment seg, long index, int x) {
                Data.cbBuf$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle pBuf$VH = NotifyData$Data$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pBuf"));
            public static VarHandle pBuf$VH() {
                return Data.pBuf$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * LPVOID pBuf;
             * }
             */
            public static MemorySegment pBuf$get(MemorySegment seg) {
                return (java.lang.foreign.MemorySegment)Data.pBuf$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * LPVOID pBuf;
             * }
             */
            public static void pBuf$set(MemorySegment seg, MemorySegment x) {
                Data.pBuf$VH.set(seg, x);
            }
            public static MemorySegment pBuf$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemorySegment)Data.pBuf$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void pBuf$set(MemorySegment seg, long index, MemorySegment x) {
                Data.pBuf$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
        }

        public static MemorySegment Data$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment NotifyData$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


