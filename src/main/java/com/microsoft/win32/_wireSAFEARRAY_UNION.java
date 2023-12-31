// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _wireSAFEARRAY_UNION {
 *     ULONG sfType;
 *     union __MIDL_IOleAutomationTypes_0001 u;
 * };
 * }
 */
public class _wireSAFEARRAY_UNION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("sfType"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Size"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("aBstr")
            ).withName("BstrStr"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Size"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("apUnknown")
            ).withName("UnknownStr"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Size"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("apDispatch")
            ).withName("DispatchStr"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Size"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("aVariant")
            ).withName("VariantStr"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Size"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("aRecord")
            ).withName("RecordStr"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Size"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("apUnknown"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Data1"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
                ).withName("iid")
            ).withName("HaveIidStr"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("clSize"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pData")
            ).withName("ByteStr"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("clSize"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pData")
            ).withName("WordStr"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("clSize"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pData")
            ).withName("LongStr"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("clSize"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pData")
            ).withName("HyperStr")
        ).withName("u")
    ).withName("_wireSAFEARRAY_UNION");
    public static MemoryLayout $LAYOUT() {
        return _wireSAFEARRAY_UNION.$struct$LAYOUT;
    }
    static final VarHandle sfType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sfType"));
    public static VarHandle sfType$VH() {
        return _wireSAFEARRAY_UNION.sfType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG sfType;
     * }
     */
    public static int sfType$get(MemorySegment seg) {
        return (int)_wireSAFEARRAY_UNION.sfType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG sfType;
     * }
     */
    public static void sfType$set(MemorySegment seg, int x) {
        _wireSAFEARRAY_UNION.sfType$VH.set(seg, x);
    }
    public static int sfType$get(MemorySegment seg, long index) {
        return (int)_wireSAFEARRAY_UNION.sfType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sfType$set(MemorySegment seg, long index, int x) {
        _wireSAFEARRAY_UNION.sfType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union __MIDL_IOleAutomationTypes_0001 {
     *     SAFEARR_BSTR BstrStr;
     *     SAFEARR_UNKNOWN UnknownStr;
     *     SAFEARR_DISPATCH DispatchStr;
     *     SAFEARR_VARIANT VariantStr;
     *     SAFEARR_BRECORD RecordStr;
     *     SAFEARR_HAVEIID HaveIidStr;
     *     BYTE_SIZEDARR ByteStr;
     *     WORD_SIZEDARR WordStr;
     *     DWORD_SIZEDARR LongStr;
     *     HYPER_SIZEDARR HyperStr;
     * };
     * }
     */
    public static final class __MIDL_IOleAutomationTypes_0001 {

        // Suppresses default constructor, ensuring non-instantiability.
        private __MIDL_IOleAutomationTypes_0001() {}
        static final UnionLayout __MIDL_IOleAutomationTypes_0001$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Size"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("aBstr")
            ).withName("BstrStr"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Size"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("apUnknown")
            ).withName("UnknownStr"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Size"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("apDispatch")
            ).withName("DispatchStr"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Size"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("aVariant")
            ).withName("VariantStr"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Size"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("aRecord")
            ).withName("RecordStr"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Size"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("apUnknown"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Data1"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
                ).withName("iid")
            ).withName("HaveIidStr"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("clSize"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pData")
            ).withName("ByteStr"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("clSize"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pData")
            ).withName("WordStr"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("clSize"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pData")
            ).withName("LongStr"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("clSize"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pData")
            ).withName("HyperStr")
        ).withName("__MIDL_IOleAutomationTypes_0001");
        public static MemoryLayout $LAYOUT() {
            return __MIDL_IOleAutomationTypes_0001.__MIDL_IOleAutomationTypes_0001$union$LAYOUT;
        }
        public static MemorySegment BstrStr$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static MemorySegment UnknownStr$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static MemorySegment DispatchStr$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static MemorySegment VariantStr$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static MemorySegment RecordStr$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static MemorySegment HaveIidStr$slice(MemorySegment seg) {
            return seg.asSlice(0, 32);
        }
        public static MemorySegment ByteStr$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static MemorySegment WordStr$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static MemorySegment LongStr$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static MemorySegment HyperStr$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment u$slice(MemorySegment seg) {
        return seg.asSlice(8, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


