// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPTNET_URL_CACHE_RESPONSE_INFO {
 *     DWORD cbSize;
 *     WORD wResponseType;
 *     WORD wResponseFlags;
 *     FILETIME LastModifiedTime;
 *     DWORD dwMaxAge;
 *     LPCWSTR pwszETag;
 *     DWORD dwProxyId;
 * };
 * }
 */
public class _CRYPTNET_URL_CACHE_RESPONSE_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_SHORT$LAYOUT.withName("wResponseType"),
        Constants$root.C_SHORT$LAYOUT.withName("wResponseFlags"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwLowDateTime"),
            Constants$root.C_LONG$LAYOUT.withName("dwHighDateTime")
        ).withName("LastModifiedTime"),
        Constants$root.C_LONG$LAYOUT.withName("dwMaxAge"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pwszETag"),
        Constants$root.C_LONG$LAYOUT.withName("dwProxyId"),
        MemoryLayout.paddingLayout(32)
    ).withName("_CRYPTNET_URL_CACHE_RESPONSE_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CRYPTNET_URL_CACHE_RESPONSE_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CRYPTNET_URL_CACHE_RESPONSE_INFO.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CRYPTNET_URL_CACHE_RESPONSE_INFO.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _CRYPTNET_URL_CACHE_RESPONSE_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CRYPTNET_URL_CACHE_RESPONSE_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CRYPTNET_URL_CACHE_RESPONSE_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wResponseType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wResponseType"));
    public static VarHandle wResponseType$VH() {
        return _CRYPTNET_URL_CACHE_RESPONSE_INFO.wResponseType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wResponseType;
     * }
     */
    public static short wResponseType$get(MemorySegment seg) {
        return (short)_CRYPTNET_URL_CACHE_RESPONSE_INFO.wResponseType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wResponseType;
     * }
     */
    public static void wResponseType$set(MemorySegment seg, short x) {
        _CRYPTNET_URL_CACHE_RESPONSE_INFO.wResponseType$VH.set(seg, x);
    }
    public static short wResponseType$get(MemorySegment seg, long index) {
        return (short)_CRYPTNET_URL_CACHE_RESPONSE_INFO.wResponseType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wResponseType$set(MemorySegment seg, long index, short x) {
        _CRYPTNET_URL_CACHE_RESPONSE_INFO.wResponseType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wResponseFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wResponseFlags"));
    public static VarHandle wResponseFlags$VH() {
        return _CRYPTNET_URL_CACHE_RESPONSE_INFO.wResponseFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wResponseFlags;
     * }
     */
    public static short wResponseFlags$get(MemorySegment seg) {
        return (short)_CRYPTNET_URL_CACHE_RESPONSE_INFO.wResponseFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wResponseFlags;
     * }
     */
    public static void wResponseFlags$set(MemorySegment seg, short x) {
        _CRYPTNET_URL_CACHE_RESPONSE_INFO.wResponseFlags$VH.set(seg, x);
    }
    public static short wResponseFlags$get(MemorySegment seg, long index) {
        return (short)_CRYPTNET_URL_CACHE_RESPONSE_INFO.wResponseFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wResponseFlags$set(MemorySegment seg, long index, short x) {
        _CRYPTNET_URL_CACHE_RESPONSE_INFO.wResponseFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment LastModifiedTime$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final VarHandle dwMaxAge$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMaxAge"));
    public static VarHandle dwMaxAge$VH() {
        return _CRYPTNET_URL_CACHE_RESPONSE_INFO.dwMaxAge$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwMaxAge;
     * }
     */
    public static int dwMaxAge$get(MemorySegment seg) {
        return (int)_CRYPTNET_URL_CACHE_RESPONSE_INFO.dwMaxAge$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwMaxAge;
     * }
     */
    public static void dwMaxAge$set(MemorySegment seg, int x) {
        _CRYPTNET_URL_CACHE_RESPONSE_INFO.dwMaxAge$VH.set(seg, x);
    }
    public static int dwMaxAge$get(MemorySegment seg, long index) {
        return (int)_CRYPTNET_URL_CACHE_RESPONSE_INFO.dwMaxAge$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMaxAge$set(MemorySegment seg, long index, int x) {
        _CRYPTNET_URL_CACHE_RESPONSE_INFO.dwMaxAge$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwszETag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pwszETag"));
    public static VarHandle pwszETag$VH() {
        return _CRYPTNET_URL_CACHE_RESPONSE_INFO.pwszETag$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR pwszETag;
     * }
     */
    public static MemorySegment pwszETag$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRYPTNET_URL_CACHE_RESPONSE_INFO.pwszETag$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR pwszETag;
     * }
     */
    public static void pwszETag$set(MemorySegment seg, MemorySegment x) {
        _CRYPTNET_URL_CACHE_RESPONSE_INFO.pwszETag$VH.set(seg, x);
    }
    public static MemorySegment pwszETag$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRYPTNET_URL_CACHE_RESPONSE_INFO.pwszETag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszETag$set(MemorySegment seg, long index, MemorySegment x) {
        _CRYPTNET_URL_CACHE_RESPONSE_INFO.pwszETag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwProxyId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwProxyId"));
    public static VarHandle dwProxyId$VH() {
        return _CRYPTNET_URL_CACHE_RESPONSE_INFO.dwProxyId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwProxyId;
     * }
     */
    public static int dwProxyId$get(MemorySegment seg) {
        return (int)_CRYPTNET_URL_CACHE_RESPONSE_INFO.dwProxyId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwProxyId;
     * }
     */
    public static void dwProxyId$set(MemorySegment seg, int x) {
        _CRYPTNET_URL_CACHE_RESPONSE_INFO.dwProxyId$VH.set(seg, x);
    }
    public static int dwProxyId$get(MemorySegment seg, long index) {
        return (int)_CRYPTNET_URL_CACHE_RESPONSE_INFO.dwProxyId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProxyId$set(MemorySegment seg, long index, int x) {
        _CRYPTNET_URL_CACHE_RESPONSE_INFO.dwProxyId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


