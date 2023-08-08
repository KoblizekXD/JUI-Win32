// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct __NCRYPT_UI_POLICY {
 *     DWORD dwVersion;
 *     DWORD dwFlags;
 *     LPCWSTR pszCreationTitle;
 *     LPCWSTR pszFriendlyName;
 *     LPCWSTR pszDescription;
 * };
 * }
 */
public class __NCRYPT_UI_POLICY {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwVersion"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_POINTER$LAYOUT.withName("pszCreationTitle"),
        Constants$root.C_POINTER$LAYOUT.withName("pszFriendlyName"),
        Constants$root.C_POINTER$LAYOUT.withName("pszDescription")
    ).withName("__NCRYPT_UI_POLICY");
    public static MemoryLayout $LAYOUT() {
        return __NCRYPT_UI_POLICY.$struct$LAYOUT;
    }
    static final VarHandle dwVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    public static VarHandle dwVersion$VH() {
        return __NCRYPT_UI_POLICY.dwVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwVersion;
     * }
     */
    public static int dwVersion$get(MemorySegment seg) {
        return (int)__NCRYPT_UI_POLICY.dwVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwVersion;
     * }
     */
    public static void dwVersion$set(MemorySegment seg, int x) {
        __NCRYPT_UI_POLICY.dwVersion$VH.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)__NCRYPT_UI_POLICY.dwVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        __NCRYPT_UI_POLICY.dwVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return __NCRYPT_UI_POLICY.dwFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)__NCRYPT_UI_POLICY.dwFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        __NCRYPT_UI_POLICY.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)__NCRYPT_UI_POLICY.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        __NCRYPT_UI_POLICY.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszCreationTitle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszCreationTitle"));
    public static VarHandle pszCreationTitle$VH() {
        return __NCRYPT_UI_POLICY.pszCreationTitle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR pszCreationTitle;
     * }
     */
    public static MemorySegment pszCreationTitle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)__NCRYPT_UI_POLICY.pszCreationTitle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR pszCreationTitle;
     * }
     */
    public static void pszCreationTitle$set(MemorySegment seg, MemorySegment x) {
        __NCRYPT_UI_POLICY.pszCreationTitle$VH.set(seg, x);
    }
    public static MemorySegment pszCreationTitle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)__NCRYPT_UI_POLICY.pszCreationTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszCreationTitle$set(MemorySegment seg, long index, MemorySegment x) {
        __NCRYPT_UI_POLICY.pszCreationTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszFriendlyName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszFriendlyName"));
    public static VarHandle pszFriendlyName$VH() {
        return __NCRYPT_UI_POLICY.pszFriendlyName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR pszFriendlyName;
     * }
     */
    public static MemorySegment pszFriendlyName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)__NCRYPT_UI_POLICY.pszFriendlyName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR pszFriendlyName;
     * }
     */
    public static void pszFriendlyName$set(MemorySegment seg, MemorySegment x) {
        __NCRYPT_UI_POLICY.pszFriendlyName$VH.set(seg, x);
    }
    public static MemorySegment pszFriendlyName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)__NCRYPT_UI_POLICY.pszFriendlyName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszFriendlyName$set(MemorySegment seg, long index, MemorySegment x) {
        __NCRYPT_UI_POLICY.pszFriendlyName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszDescription$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszDescription"));
    public static VarHandle pszDescription$VH() {
        return __NCRYPT_UI_POLICY.pszDescription$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR pszDescription;
     * }
     */
    public static MemorySegment pszDescription$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)__NCRYPT_UI_POLICY.pszDescription$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR pszDescription;
     * }
     */
    public static void pszDescription$set(MemorySegment seg, MemorySegment x) {
        __NCRYPT_UI_POLICY.pszDescription$VH.set(seg, x);
    }
    public static MemorySegment pszDescription$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)__NCRYPT_UI_POLICY.pszDescription$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszDescription$set(MemorySegment seg, long index, MemorySegment x) {
        __NCRYPT_UI_POLICY.pszDescription$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

