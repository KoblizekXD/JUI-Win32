// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     DWORD dwShareMode;
 *     DWORD dwPreferredProtocols;
 *     READER_SEL_REQUEST_MATCH_TYPE MatchType;
 *     union {
 *         struct  ReaderAndContainerParameter;
 *         struct  SerialNumberParameter;
 *     };
 * };
 * }
 */
public class READER_SEL_REQUEST {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwShareMode"),
        Constants$root.C_LONG$LAYOUT.withName("dwPreferredProtocols"),
        Constants$root.C_LONG$LAYOUT.withName("MatchType"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbReaderNameOffset"),
                Constants$root.C_LONG$LAYOUT.withName("cchReaderNameLength"),
                Constants$root.C_LONG$LAYOUT.withName("cbContainerNameOffset"),
                Constants$root.C_LONG$LAYOUT.withName("cchContainerNameLength"),
                Constants$root.C_LONG$LAYOUT.withName("dwDesiredCardModuleVersion"),
                Constants$root.C_LONG$LAYOUT.withName("dwCspFlags")
            ).withName("ReaderAndContainerParameter"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbSerialNumberOffset"),
                Constants$root.C_LONG$LAYOUT.withName("cbSerialNumberLength"),
                Constants$root.C_LONG$LAYOUT.withName("dwDesiredCardModuleVersion")
            ).withName("SerialNumberParameter")
        ).withName("$anon$0")
    );
    public static MemoryLayout $LAYOUT() {
        return READER_SEL_REQUEST.$struct$LAYOUT;
    }
    static final VarHandle dwShareMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwShareMode"));
    public static VarHandle dwShareMode$VH() {
        return READER_SEL_REQUEST.dwShareMode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwShareMode;
     * }
     */
    public static int dwShareMode$get(MemorySegment seg) {
        return (int)READER_SEL_REQUEST.dwShareMode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwShareMode;
     * }
     */
    public static void dwShareMode$set(MemorySegment seg, int x) {
        READER_SEL_REQUEST.dwShareMode$VH.set(seg, x);
    }
    public static int dwShareMode$get(MemorySegment seg, long index) {
        return (int)READER_SEL_REQUEST.dwShareMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwShareMode$set(MemorySegment seg, long index, int x) {
        READER_SEL_REQUEST.dwShareMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPreferredProtocols$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwPreferredProtocols"));
    public static VarHandle dwPreferredProtocols$VH() {
        return READER_SEL_REQUEST.dwPreferredProtocols$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwPreferredProtocols;
     * }
     */
    public static int dwPreferredProtocols$get(MemorySegment seg) {
        return (int)READER_SEL_REQUEST.dwPreferredProtocols$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwPreferredProtocols;
     * }
     */
    public static void dwPreferredProtocols$set(MemorySegment seg, int x) {
        READER_SEL_REQUEST.dwPreferredProtocols$VH.set(seg, x);
    }
    public static int dwPreferredProtocols$get(MemorySegment seg, long index) {
        return (int)READER_SEL_REQUEST.dwPreferredProtocols$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPreferredProtocols$set(MemorySegment seg, long index, int x) {
        READER_SEL_REQUEST.dwPreferredProtocols$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MatchType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MatchType"));
    public static VarHandle MatchType$VH() {
        return READER_SEL_REQUEST.MatchType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * READER_SEL_REQUEST_MATCH_TYPE MatchType;
     * }
     */
    public static int MatchType$get(MemorySegment seg) {
        return (int)READER_SEL_REQUEST.MatchType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * READER_SEL_REQUEST_MATCH_TYPE MatchType;
     * }
     */
    public static void MatchType$set(MemorySegment seg, int x) {
        READER_SEL_REQUEST.MatchType$VH.set(seg, x);
    }
    public static int MatchType$get(MemorySegment seg, long index) {
        return (int)READER_SEL_REQUEST.MatchType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MatchType$set(MemorySegment seg, long index, int x) {
        READER_SEL_REQUEST.MatchType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * struct {
     *     DWORD cbReaderNameOffset;
     *     DWORD cchReaderNameLength;
     *     DWORD cbContainerNameOffset;
     *     DWORD cchContainerNameLength;
     *     DWORD dwDesiredCardModuleVersion;
     *     DWORD dwCspFlags;
     * };
     * }
     */
    public static final class ReaderAndContainerParameter {

        // Suppresses default constructor, ensuring non-instantiability.
        private ReaderAndContainerParameter() {}
        static final StructLayout ReaderAndContainerParameter$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbReaderNameOffset"),
            Constants$root.C_LONG$LAYOUT.withName("cchReaderNameLength"),
            Constants$root.C_LONG$LAYOUT.withName("cbContainerNameOffset"),
            Constants$root.C_LONG$LAYOUT.withName("cchContainerNameLength"),
            Constants$root.C_LONG$LAYOUT.withName("dwDesiredCardModuleVersion"),
            Constants$root.C_LONG$LAYOUT.withName("dwCspFlags")
        );
        public static MemoryLayout $LAYOUT() {
            return ReaderAndContainerParameter.ReaderAndContainerParameter$struct$LAYOUT;
        }
        static final VarHandle cbReaderNameOffset$VH = ReaderAndContainerParameter$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbReaderNameOffset"));
        public static VarHandle cbReaderNameOffset$VH() {
            return ReaderAndContainerParameter.cbReaderNameOffset$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD cbReaderNameOffset;
         * }
         */
        public static int cbReaderNameOffset$get(MemorySegment seg) {
            return (int)ReaderAndContainerParameter.cbReaderNameOffset$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD cbReaderNameOffset;
         * }
         */
        public static void cbReaderNameOffset$set(MemorySegment seg, int x) {
            ReaderAndContainerParameter.cbReaderNameOffset$VH.set(seg, x);
        }
        public static int cbReaderNameOffset$get(MemorySegment seg, long index) {
            return (int)ReaderAndContainerParameter.cbReaderNameOffset$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void cbReaderNameOffset$set(MemorySegment seg, long index, int x) {
            ReaderAndContainerParameter.cbReaderNameOffset$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle cchReaderNameLength$VH = ReaderAndContainerParameter$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cchReaderNameLength"));
        public static VarHandle cchReaderNameLength$VH() {
            return ReaderAndContainerParameter.cchReaderNameLength$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD cchReaderNameLength;
         * }
         */
        public static int cchReaderNameLength$get(MemorySegment seg) {
            return (int)ReaderAndContainerParameter.cchReaderNameLength$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD cchReaderNameLength;
         * }
         */
        public static void cchReaderNameLength$set(MemorySegment seg, int x) {
            ReaderAndContainerParameter.cchReaderNameLength$VH.set(seg, x);
        }
        public static int cchReaderNameLength$get(MemorySegment seg, long index) {
            return (int)ReaderAndContainerParameter.cchReaderNameLength$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void cchReaderNameLength$set(MemorySegment seg, long index, int x) {
            ReaderAndContainerParameter.cchReaderNameLength$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle cbContainerNameOffset$VH = ReaderAndContainerParameter$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbContainerNameOffset"));
        public static VarHandle cbContainerNameOffset$VH() {
            return ReaderAndContainerParameter.cbContainerNameOffset$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD cbContainerNameOffset;
         * }
         */
        public static int cbContainerNameOffset$get(MemorySegment seg) {
            return (int)ReaderAndContainerParameter.cbContainerNameOffset$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD cbContainerNameOffset;
         * }
         */
        public static void cbContainerNameOffset$set(MemorySegment seg, int x) {
            ReaderAndContainerParameter.cbContainerNameOffset$VH.set(seg, x);
        }
        public static int cbContainerNameOffset$get(MemorySegment seg, long index) {
            return (int)ReaderAndContainerParameter.cbContainerNameOffset$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void cbContainerNameOffset$set(MemorySegment seg, long index, int x) {
            ReaderAndContainerParameter.cbContainerNameOffset$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle cchContainerNameLength$VH = ReaderAndContainerParameter$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cchContainerNameLength"));
        public static VarHandle cchContainerNameLength$VH() {
            return ReaderAndContainerParameter.cchContainerNameLength$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD cchContainerNameLength;
         * }
         */
        public static int cchContainerNameLength$get(MemorySegment seg) {
            return (int)ReaderAndContainerParameter.cchContainerNameLength$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD cchContainerNameLength;
         * }
         */
        public static void cchContainerNameLength$set(MemorySegment seg, int x) {
            ReaderAndContainerParameter.cchContainerNameLength$VH.set(seg, x);
        }
        public static int cchContainerNameLength$get(MemorySegment seg, long index) {
            return (int)ReaderAndContainerParameter.cchContainerNameLength$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void cchContainerNameLength$set(MemorySegment seg, long index, int x) {
            ReaderAndContainerParameter.cchContainerNameLength$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle dwDesiredCardModuleVersion$VH = ReaderAndContainerParameter$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDesiredCardModuleVersion"));
        public static VarHandle dwDesiredCardModuleVersion$VH() {
            return ReaderAndContainerParameter.dwDesiredCardModuleVersion$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD dwDesiredCardModuleVersion;
         * }
         */
        public static int dwDesiredCardModuleVersion$get(MemorySegment seg) {
            return (int)ReaderAndContainerParameter.dwDesiredCardModuleVersion$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD dwDesiredCardModuleVersion;
         * }
         */
        public static void dwDesiredCardModuleVersion$set(MemorySegment seg, int x) {
            ReaderAndContainerParameter.dwDesiredCardModuleVersion$VH.set(seg, x);
        }
        public static int dwDesiredCardModuleVersion$get(MemorySegment seg, long index) {
            return (int)ReaderAndContainerParameter.dwDesiredCardModuleVersion$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void dwDesiredCardModuleVersion$set(MemorySegment seg, long index, int x) {
            ReaderAndContainerParameter.dwDesiredCardModuleVersion$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle dwCspFlags$VH = ReaderAndContainerParameter$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCspFlags"));
        public static VarHandle dwCspFlags$VH() {
            return ReaderAndContainerParameter.dwCspFlags$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD dwCspFlags;
         * }
         */
        public static int dwCspFlags$get(MemorySegment seg) {
            return (int)ReaderAndContainerParameter.dwCspFlags$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD dwCspFlags;
         * }
         */
        public static void dwCspFlags$set(MemorySegment seg, int x) {
            ReaderAndContainerParameter.dwCspFlags$VH.set(seg, x);
        }
        public static int dwCspFlags$get(MemorySegment seg, long index) {
            return (int)ReaderAndContainerParameter.dwCspFlags$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void dwCspFlags$set(MemorySegment seg, long index, int x) {
            ReaderAndContainerParameter.dwCspFlags$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment ReaderAndContainerParameter$slice(MemorySegment seg) {
        return seg.asSlice(12, 24);
    }
    /**
     * {@snippet :
     * struct {
     *     DWORD cbSerialNumberOffset;
     *     DWORD cbSerialNumberLength;
     *     DWORD dwDesiredCardModuleVersion;
     * };
     * }
     */
    public static final class SerialNumberParameter {

        // Suppresses default constructor, ensuring non-instantiability.
        private SerialNumberParameter() {}
        static final StructLayout SerialNumberParameter$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbSerialNumberOffset"),
            Constants$root.C_LONG$LAYOUT.withName("cbSerialNumberLength"),
            Constants$root.C_LONG$LAYOUT.withName("dwDesiredCardModuleVersion")
        );
        public static MemoryLayout $LAYOUT() {
            return SerialNumberParameter.SerialNumberParameter$struct$LAYOUT;
        }
        static final VarHandle cbSerialNumberOffset$VH = SerialNumberParameter$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSerialNumberOffset"));
        public static VarHandle cbSerialNumberOffset$VH() {
            return SerialNumberParameter.cbSerialNumberOffset$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD cbSerialNumberOffset;
         * }
         */
        public static int cbSerialNumberOffset$get(MemorySegment seg) {
            return (int)SerialNumberParameter.cbSerialNumberOffset$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD cbSerialNumberOffset;
         * }
         */
        public static void cbSerialNumberOffset$set(MemorySegment seg, int x) {
            SerialNumberParameter.cbSerialNumberOffset$VH.set(seg, x);
        }
        public static int cbSerialNumberOffset$get(MemorySegment seg, long index) {
            return (int)SerialNumberParameter.cbSerialNumberOffset$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void cbSerialNumberOffset$set(MemorySegment seg, long index, int x) {
            SerialNumberParameter.cbSerialNumberOffset$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle cbSerialNumberLength$VH = SerialNumberParameter$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSerialNumberLength"));
        public static VarHandle cbSerialNumberLength$VH() {
            return SerialNumberParameter.cbSerialNumberLength$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD cbSerialNumberLength;
         * }
         */
        public static int cbSerialNumberLength$get(MemorySegment seg) {
            return (int)SerialNumberParameter.cbSerialNumberLength$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD cbSerialNumberLength;
         * }
         */
        public static void cbSerialNumberLength$set(MemorySegment seg, int x) {
            SerialNumberParameter.cbSerialNumberLength$VH.set(seg, x);
        }
        public static int cbSerialNumberLength$get(MemorySegment seg, long index) {
            return (int)SerialNumberParameter.cbSerialNumberLength$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void cbSerialNumberLength$set(MemorySegment seg, long index, int x) {
            SerialNumberParameter.cbSerialNumberLength$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle dwDesiredCardModuleVersion$VH = SerialNumberParameter$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDesiredCardModuleVersion"));
        public static VarHandle dwDesiredCardModuleVersion$VH() {
            return SerialNumberParameter.dwDesiredCardModuleVersion$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD dwDesiredCardModuleVersion;
         * }
         */
        public static int dwDesiredCardModuleVersion$get(MemorySegment seg) {
            return (int)SerialNumberParameter.dwDesiredCardModuleVersion$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD dwDesiredCardModuleVersion;
         * }
         */
        public static void dwDesiredCardModuleVersion$set(MemorySegment seg, int x) {
            SerialNumberParameter.dwDesiredCardModuleVersion$VH.set(seg, x);
        }
        public static int dwDesiredCardModuleVersion$get(MemorySegment seg, long index) {
            return (int)SerialNumberParameter.dwDesiredCardModuleVersion$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void dwDesiredCardModuleVersion$set(MemorySegment seg, long index, int x) {
            SerialNumberParameter.dwDesiredCardModuleVersion$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment SerialNumberParameter$slice(MemorySegment seg) {
        return seg.asSlice(12, 12);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


