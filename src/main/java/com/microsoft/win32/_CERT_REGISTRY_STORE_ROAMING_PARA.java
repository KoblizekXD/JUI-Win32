// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_REGISTRY_STORE_ROAMING_PARA {
 *     HKEY hKey;
 *     LPWSTR pwszStoreDirectory;
 * };
 * }
 */
public class _CERT_REGISTRY_STORE_ROAMING_PARA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("hKey"),
        Constants$root.C_POINTER$LAYOUT.withName("pwszStoreDirectory")
    ).withName("_CERT_REGISTRY_STORE_ROAMING_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CERT_REGISTRY_STORE_ROAMING_PARA.$struct$LAYOUT;
    }
    static final VarHandle hKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hKey"));
    public static VarHandle hKey$VH() {
        return _CERT_REGISTRY_STORE_ROAMING_PARA.hKey$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HKEY hKey;
     * }
     */
    public static MemorySegment hKey$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CERT_REGISTRY_STORE_ROAMING_PARA.hKey$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HKEY hKey;
     * }
     */
    public static void hKey$set(MemorySegment seg, MemorySegment x) {
        _CERT_REGISTRY_STORE_ROAMING_PARA.hKey$VH.set(seg, x);
    }
    public static MemorySegment hKey$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CERT_REGISTRY_STORE_ROAMING_PARA.hKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hKey$set(MemorySegment seg, long index, MemorySegment x) {
        _CERT_REGISTRY_STORE_ROAMING_PARA.hKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwszStoreDirectory$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pwszStoreDirectory"));
    public static VarHandle pwszStoreDirectory$VH() {
        return _CERT_REGISTRY_STORE_ROAMING_PARA.pwszStoreDirectory$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pwszStoreDirectory;
     * }
     */
    public static MemorySegment pwszStoreDirectory$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CERT_REGISTRY_STORE_ROAMING_PARA.pwszStoreDirectory$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pwszStoreDirectory;
     * }
     */
    public static void pwszStoreDirectory$set(MemorySegment seg, MemorySegment x) {
        _CERT_REGISTRY_STORE_ROAMING_PARA.pwszStoreDirectory$VH.set(seg, x);
    }
    public static MemorySegment pwszStoreDirectory$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CERT_REGISTRY_STORE_ROAMING_PARA.pwszStoreDirectory$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszStoreDirectory$set(MemorySegment seg, long index, MemorySegment x) {
        _CERT_REGISTRY_STORE_ROAMING_PARA.pwszStoreDirectory$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


