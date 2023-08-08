// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _tagRemBINDINFO {
 *     ULONG cbSize;
 *     LPWSTR szExtraInfo;
 *     DWORD grfBindInfoF;
 *     DWORD dwBindVerb;
 *     LPWSTR szCustomVerb;
 *     DWORD cbstgmedData;
 *     DWORD dwOptions;
 *     DWORD dwOptionsFlags;
 *     DWORD dwCodePage;
 *     REMSECURITY_ATTRIBUTES securityAttributes;
 *     IID iid;
 *     IUnknown* pUnk;
 *     DWORD dwReserved;
 * };
 * }
 */
public class _tagRemBINDINFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("szExtraInfo"),
        Constants$root.C_LONG$LAYOUT.withName("grfBindInfoF"),
        Constants$root.C_LONG$LAYOUT.withName("dwBindVerb"),
        Constants$root.C_POINTER$LAYOUT.withName("szCustomVerb"),
        Constants$root.C_LONG$LAYOUT.withName("cbstgmedData"),
        Constants$root.C_LONG$LAYOUT.withName("dwOptions"),
        Constants$root.C_LONG$LAYOUT.withName("dwOptionsFlags"),
        Constants$root.C_LONG$LAYOUT.withName("dwCodePage"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("nLength"),
            Constants$root.C_LONG$LAYOUT.withName("lpSecurityDescriptor"),
            Constants$root.C_LONG$LAYOUT.withName("bInheritHandle")
        ).withName("securityAttributes"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("iid"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pUnk"),
        Constants$root.C_LONG$LAYOUT.withName("dwReserved"),
        MemoryLayout.paddingLayout(32)
    ).withName("_tagRemBINDINFO");
    public static MemoryLayout $LAYOUT() {
        return _tagRemBINDINFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _tagRemBINDINFO.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_tagRemBINDINFO.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _tagRemBINDINFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_tagRemBINDINFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _tagRemBINDINFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle szExtraInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("szExtraInfo"));
    public static VarHandle szExtraInfo$VH() {
        return _tagRemBINDINFO.szExtraInfo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR szExtraInfo;
     * }
     */
    public static MemorySegment szExtraInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_tagRemBINDINFO.szExtraInfo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR szExtraInfo;
     * }
     */
    public static void szExtraInfo$set(MemorySegment seg, MemorySegment x) {
        _tagRemBINDINFO.szExtraInfo$VH.set(seg, x);
    }
    public static MemorySegment szExtraInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_tagRemBINDINFO.szExtraInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void szExtraInfo$set(MemorySegment seg, long index, MemorySegment x) {
        _tagRemBINDINFO.szExtraInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle grfBindInfoF$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("grfBindInfoF"));
    public static VarHandle grfBindInfoF$VH() {
        return _tagRemBINDINFO.grfBindInfoF$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD grfBindInfoF;
     * }
     */
    public static int grfBindInfoF$get(MemorySegment seg) {
        return (int)_tagRemBINDINFO.grfBindInfoF$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD grfBindInfoF;
     * }
     */
    public static void grfBindInfoF$set(MemorySegment seg, int x) {
        _tagRemBINDINFO.grfBindInfoF$VH.set(seg, x);
    }
    public static int grfBindInfoF$get(MemorySegment seg, long index) {
        return (int)_tagRemBINDINFO.grfBindInfoF$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void grfBindInfoF$set(MemorySegment seg, long index, int x) {
        _tagRemBINDINFO.grfBindInfoF$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwBindVerb$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwBindVerb"));
    public static VarHandle dwBindVerb$VH() {
        return _tagRemBINDINFO.dwBindVerb$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwBindVerb;
     * }
     */
    public static int dwBindVerb$get(MemorySegment seg) {
        return (int)_tagRemBINDINFO.dwBindVerb$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwBindVerb;
     * }
     */
    public static void dwBindVerb$set(MemorySegment seg, int x) {
        _tagRemBINDINFO.dwBindVerb$VH.set(seg, x);
    }
    public static int dwBindVerb$get(MemorySegment seg, long index) {
        return (int)_tagRemBINDINFO.dwBindVerb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwBindVerb$set(MemorySegment seg, long index, int x) {
        _tagRemBINDINFO.dwBindVerb$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle szCustomVerb$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("szCustomVerb"));
    public static VarHandle szCustomVerb$VH() {
        return _tagRemBINDINFO.szCustomVerb$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR szCustomVerb;
     * }
     */
    public static MemorySegment szCustomVerb$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_tagRemBINDINFO.szCustomVerb$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR szCustomVerb;
     * }
     */
    public static void szCustomVerb$set(MemorySegment seg, MemorySegment x) {
        _tagRemBINDINFO.szCustomVerb$VH.set(seg, x);
    }
    public static MemorySegment szCustomVerb$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_tagRemBINDINFO.szCustomVerb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void szCustomVerb$set(MemorySegment seg, long index, MemorySegment x) {
        _tagRemBINDINFO.szCustomVerb$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbstgmedData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbstgmedData"));
    public static VarHandle cbstgmedData$VH() {
        return _tagRemBINDINFO.cbstgmedData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbstgmedData;
     * }
     */
    public static int cbstgmedData$get(MemorySegment seg) {
        return (int)_tagRemBINDINFO.cbstgmedData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbstgmedData;
     * }
     */
    public static void cbstgmedData$set(MemorySegment seg, int x) {
        _tagRemBINDINFO.cbstgmedData$VH.set(seg, x);
    }
    public static int cbstgmedData$get(MemorySegment seg, long index) {
        return (int)_tagRemBINDINFO.cbstgmedData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbstgmedData$set(MemorySegment seg, long index, int x) {
        _tagRemBINDINFO.cbstgmedData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwOptions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwOptions"));
    public static VarHandle dwOptions$VH() {
        return _tagRemBINDINFO.dwOptions$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwOptions;
     * }
     */
    public static int dwOptions$get(MemorySegment seg) {
        return (int)_tagRemBINDINFO.dwOptions$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwOptions;
     * }
     */
    public static void dwOptions$set(MemorySegment seg, int x) {
        _tagRemBINDINFO.dwOptions$VH.set(seg, x);
    }
    public static int dwOptions$get(MemorySegment seg, long index) {
        return (int)_tagRemBINDINFO.dwOptions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOptions$set(MemorySegment seg, long index, int x) {
        _tagRemBINDINFO.dwOptions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwOptionsFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwOptionsFlags"));
    public static VarHandle dwOptionsFlags$VH() {
        return _tagRemBINDINFO.dwOptionsFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwOptionsFlags;
     * }
     */
    public static int dwOptionsFlags$get(MemorySegment seg) {
        return (int)_tagRemBINDINFO.dwOptionsFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwOptionsFlags;
     * }
     */
    public static void dwOptionsFlags$set(MemorySegment seg, int x) {
        _tagRemBINDINFO.dwOptionsFlags$VH.set(seg, x);
    }
    public static int dwOptionsFlags$get(MemorySegment seg, long index) {
        return (int)_tagRemBINDINFO.dwOptionsFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOptionsFlags$set(MemorySegment seg, long index, int x) {
        _tagRemBINDINFO.dwOptionsFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwCodePage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCodePage"));
    public static VarHandle dwCodePage$VH() {
        return _tagRemBINDINFO.dwCodePage$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwCodePage;
     * }
     */
    public static int dwCodePage$get(MemorySegment seg) {
        return (int)_tagRemBINDINFO.dwCodePage$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwCodePage;
     * }
     */
    public static void dwCodePage$set(MemorySegment seg, int x) {
        _tagRemBINDINFO.dwCodePage$VH.set(seg, x);
    }
    public static int dwCodePage$get(MemorySegment seg, long index) {
        return (int)_tagRemBINDINFO.dwCodePage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCodePage$set(MemorySegment seg, long index, int x) {
        _tagRemBINDINFO.dwCodePage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment securityAttributes$slice(MemorySegment seg) {
        return seg.asSlice(48, 12);
    }
    public static MemorySegment iid$slice(MemorySegment seg) {
        return seg.asSlice(60, 16);
    }
    static final VarHandle pUnk$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pUnk"));
    public static VarHandle pUnk$VH() {
        return _tagRemBINDINFO.pUnk$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * IUnknown* pUnk;
     * }
     */
    public static MemorySegment pUnk$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_tagRemBINDINFO.pUnk$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * IUnknown* pUnk;
     * }
     */
    public static void pUnk$set(MemorySegment seg, MemorySegment x) {
        _tagRemBINDINFO.pUnk$VH.set(seg, x);
    }
    public static MemorySegment pUnk$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_tagRemBINDINFO.pUnk$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pUnk$set(MemorySegment seg, long index, MemorySegment x) {
        _tagRemBINDINFO.pUnk$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReserved"));
    public static VarHandle dwReserved$VH() {
        return _tagRemBINDINFO.dwReserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwReserved;
     * }
     */
    public static int dwReserved$get(MemorySegment seg) {
        return (int)_tagRemBINDINFO.dwReserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwReserved;
     * }
     */
    public static void dwReserved$set(MemorySegment seg, int x) {
        _tagRemBINDINFO.dwReserved$VH.set(seg, x);
    }
    public static int dwReserved$get(MemorySegment seg, long index) {
        return (int)_tagRemBINDINFO.dwReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved$set(MemorySegment seg, long index, int x) {
        _tagRemBINDINFO.dwReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

