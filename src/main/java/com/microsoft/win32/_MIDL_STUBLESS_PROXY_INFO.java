// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _MIDL_STUBLESS_PROXY_INFO {
 *     PMIDL_STUB_DESC pStubDesc;
 *     PFORMAT_STRING ProcFormatString;
 *     unsigned short* FormatStringOffset;
 *     PRPC_SYNTAX_IDENTIFIER pTransferSyntax;
 *     ULONG_PTR nCount;
 *     PMIDL_SYNTAX_INFO pSyntaxInfo;
 * };
 * }
 */
public class _MIDL_STUBLESS_PROXY_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pStubDesc"),
        Constants$root.C_POINTER$LAYOUT.withName("ProcFormatString"),
        Constants$root.C_POINTER$LAYOUT.withName("FormatStringOffset"),
        Constants$root.C_POINTER$LAYOUT.withName("pTransferSyntax"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("nCount"),
        Constants$root.C_POINTER$LAYOUT.withName("pSyntaxInfo")
    ).withName("_MIDL_STUBLESS_PROXY_INFO");
    public static MemoryLayout $LAYOUT() {
        return _MIDL_STUBLESS_PROXY_INFO.$struct$LAYOUT;
    }
    static final VarHandle pStubDesc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pStubDesc"));
    public static VarHandle pStubDesc$VH() {
        return _MIDL_STUBLESS_PROXY_INFO.pStubDesc$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PMIDL_STUB_DESC pStubDesc;
     * }
     */
    public static MemorySegment pStubDesc$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_MIDL_STUBLESS_PROXY_INFO.pStubDesc$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PMIDL_STUB_DESC pStubDesc;
     * }
     */
    public static void pStubDesc$set(MemorySegment seg, MemorySegment x) {
        _MIDL_STUBLESS_PROXY_INFO.pStubDesc$VH.set(seg, x);
    }
    public static MemorySegment pStubDesc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_MIDL_STUBLESS_PROXY_INFO.pStubDesc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pStubDesc$set(MemorySegment seg, long index, MemorySegment x) {
        _MIDL_STUBLESS_PROXY_INFO.pStubDesc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProcFormatString$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProcFormatString"));
    public static VarHandle ProcFormatString$VH() {
        return _MIDL_STUBLESS_PROXY_INFO.ProcFormatString$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PFORMAT_STRING ProcFormatString;
     * }
     */
    public static MemorySegment ProcFormatString$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_MIDL_STUBLESS_PROXY_INFO.ProcFormatString$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PFORMAT_STRING ProcFormatString;
     * }
     */
    public static void ProcFormatString$set(MemorySegment seg, MemorySegment x) {
        _MIDL_STUBLESS_PROXY_INFO.ProcFormatString$VH.set(seg, x);
    }
    public static MemorySegment ProcFormatString$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_MIDL_STUBLESS_PROXY_INFO.ProcFormatString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcFormatString$set(MemorySegment seg, long index, MemorySegment x) {
        _MIDL_STUBLESS_PROXY_INFO.ProcFormatString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FormatStringOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FormatStringOffset"));
    public static VarHandle FormatStringOffset$VH() {
        return _MIDL_STUBLESS_PROXY_INFO.FormatStringOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short* FormatStringOffset;
     * }
     */
    public static MemorySegment FormatStringOffset$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_MIDL_STUBLESS_PROXY_INFO.FormatStringOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short* FormatStringOffset;
     * }
     */
    public static void FormatStringOffset$set(MemorySegment seg, MemorySegment x) {
        _MIDL_STUBLESS_PROXY_INFO.FormatStringOffset$VH.set(seg, x);
    }
    public static MemorySegment FormatStringOffset$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_MIDL_STUBLESS_PROXY_INFO.FormatStringOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FormatStringOffset$set(MemorySegment seg, long index, MemorySegment x) {
        _MIDL_STUBLESS_PROXY_INFO.FormatStringOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pTransferSyntax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pTransferSyntax"));
    public static VarHandle pTransferSyntax$VH() {
        return _MIDL_STUBLESS_PROXY_INFO.pTransferSyntax$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PRPC_SYNTAX_IDENTIFIER pTransferSyntax;
     * }
     */
    public static MemorySegment pTransferSyntax$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_MIDL_STUBLESS_PROXY_INFO.pTransferSyntax$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PRPC_SYNTAX_IDENTIFIER pTransferSyntax;
     * }
     */
    public static void pTransferSyntax$set(MemorySegment seg, MemorySegment x) {
        _MIDL_STUBLESS_PROXY_INFO.pTransferSyntax$VH.set(seg, x);
    }
    public static MemorySegment pTransferSyntax$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_MIDL_STUBLESS_PROXY_INFO.pTransferSyntax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pTransferSyntax$set(MemorySegment seg, long index, MemorySegment x) {
        _MIDL_STUBLESS_PROXY_INFO.pTransferSyntax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nCount"));
    public static VarHandle nCount$VH() {
        return _MIDL_STUBLESS_PROXY_INFO.nCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG_PTR nCount;
     * }
     */
    public static long nCount$get(MemorySegment seg) {
        return (long)_MIDL_STUBLESS_PROXY_INFO.nCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG_PTR nCount;
     * }
     */
    public static void nCount$set(MemorySegment seg, long x) {
        _MIDL_STUBLESS_PROXY_INFO.nCount$VH.set(seg, x);
    }
    public static long nCount$get(MemorySegment seg, long index) {
        return (long)_MIDL_STUBLESS_PROXY_INFO.nCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nCount$set(MemorySegment seg, long index, long x) {
        _MIDL_STUBLESS_PROXY_INFO.nCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pSyntaxInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pSyntaxInfo"));
    public static VarHandle pSyntaxInfo$VH() {
        return _MIDL_STUBLESS_PROXY_INFO.pSyntaxInfo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PMIDL_SYNTAX_INFO pSyntaxInfo;
     * }
     */
    public static MemorySegment pSyntaxInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_MIDL_STUBLESS_PROXY_INFO.pSyntaxInfo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PMIDL_SYNTAX_INFO pSyntaxInfo;
     * }
     */
    public static void pSyntaxInfo$set(MemorySegment seg, MemorySegment x) {
        _MIDL_STUBLESS_PROXY_INFO.pSyntaxInfo$VH.set(seg, x);
    }
    public static MemorySegment pSyntaxInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_MIDL_STUBLESS_PROXY_INFO.pSyntaxInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pSyntaxInfo$set(MemorySegment seg, long index, MemorySegment x) {
        _MIDL_STUBLESS_PROXY_INFO.pSyntaxInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

