// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PROPSHEETPAGEA_V3 {
 *     DWORD dwSize;
 *     DWORD dwFlags;
 *     HINSTANCE hInstance;
 *     union {
 *         LPCSTR pszTemplate;
 *         PROPSHEETPAGE_RESOURCE pResource;
 *     };
 *     union {
 *         HICON hIcon;
 *         LPCSTR pszIcon;
 *     };
 *     LPCSTR pszTitle;
 *     DLGPROC pfnDlgProc;
 *     LPARAM lParam;
 *     LPFNPSPCALLBACKA pfnCallback;
 *     UINT* pcRefParent;
 *     LPCSTR pszHeaderTitle;
 *     LPCSTR pszHeaderSubTitle;
 *     HANDLE hActCtx;
 * };
 * }
 */
public class _PROPSHEETPAGEA_V3 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_POINTER$LAYOUT.withName("hInstance"),
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pszTemplate"),
            Constants$root.C_POINTER$LAYOUT.withName("pResource")
        ).withName("$anon$0"),
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("hIcon"),
            Constants$root.C_POINTER$LAYOUT.withName("pszIcon")
        ).withName("$anon$1"),
        Constants$root.C_POINTER$LAYOUT.withName("pszTitle"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnDlgProc"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("lParam"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnCallback"),
        Constants$root.C_POINTER$LAYOUT.withName("pcRefParent"),
        Constants$root.C_POINTER$LAYOUT.withName("pszHeaderTitle"),
        Constants$root.C_POINTER$LAYOUT.withName("pszHeaderSubTitle"),
        Constants$root.C_POINTER$LAYOUT.withName("hActCtx")
    ).withName("_PROPSHEETPAGEA_V3");
    public static MemoryLayout $LAYOUT() {
        return _PROPSHEETPAGEA_V3.$struct$LAYOUT;
    }
    static final VarHandle dwSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSize"));
    public static VarHandle dwSize$VH() {
        return _PROPSHEETPAGEA_V3.dwSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSize;
     * }
     */
    public static int dwSize$get(MemorySegment seg) {
        return (int)_PROPSHEETPAGEA_V3.dwSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSize;
     * }
     */
    public static void dwSize$set(MemorySegment seg, int x) {
        _PROPSHEETPAGEA_V3.dwSize$VH.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)_PROPSHEETPAGEA_V3.dwSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        _PROPSHEETPAGEA_V3.dwSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _PROPSHEETPAGEA_V3.dwFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_PROPSHEETPAGEA_V3.dwFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        _PROPSHEETPAGEA_V3.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_PROPSHEETPAGEA_V3.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _PROPSHEETPAGEA_V3.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hInstance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hInstance"));
    public static VarHandle hInstance$VH() {
        return _PROPSHEETPAGEA_V3.hInstance$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HINSTANCE hInstance;
     * }
     */
    public static MemorySegment hInstance$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.hInstance$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HINSTANCE hInstance;
     * }
     */
    public static void hInstance$set(MemorySegment seg, MemorySegment x) {
        _PROPSHEETPAGEA_V3.hInstance$VH.set(seg, x);
    }
    public static MemorySegment hInstance$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.hInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemorySegment x) {
        _PROPSHEETPAGEA_V3.hInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszTemplate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pszTemplate"));
    public static VarHandle pszTemplate$VH() {
        return _PROPSHEETPAGEA_V3.pszTemplate$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCSTR pszTemplate;
     * }
     */
    public static MemorySegment pszTemplate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.pszTemplate$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCSTR pszTemplate;
     * }
     */
    public static void pszTemplate$set(MemorySegment seg, MemorySegment x) {
        _PROPSHEETPAGEA_V3.pszTemplate$VH.set(seg, x);
    }
    public static MemorySegment pszTemplate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.pszTemplate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszTemplate$set(MemorySegment seg, long index, MemorySegment x) {
        _PROPSHEETPAGEA_V3.pszTemplate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pResource$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pResource"));
    public static VarHandle pResource$VH() {
        return _PROPSHEETPAGEA_V3.pResource$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PROPSHEETPAGE_RESOURCE pResource;
     * }
     */
    public static MemorySegment pResource$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.pResource$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PROPSHEETPAGE_RESOURCE pResource;
     * }
     */
    public static void pResource$set(MemorySegment seg, MemorySegment x) {
        _PROPSHEETPAGEA_V3.pResource$VH.set(seg, x);
    }
    public static MemorySegment pResource$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.pResource$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pResource$set(MemorySegment seg, long index, MemorySegment x) {
        _PROPSHEETPAGEA_V3.pResource$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hIcon$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("hIcon"));
    public static VarHandle hIcon$VH() {
        return _PROPSHEETPAGEA_V3.hIcon$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HICON hIcon;
     * }
     */
    public static MemorySegment hIcon$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.hIcon$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HICON hIcon;
     * }
     */
    public static void hIcon$set(MemorySegment seg, MemorySegment x) {
        _PROPSHEETPAGEA_V3.hIcon$VH.set(seg, x);
    }
    public static MemorySegment hIcon$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.hIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hIcon$set(MemorySegment seg, long index, MemorySegment x) {
        _PROPSHEETPAGEA_V3.hIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszIcon$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("pszIcon"));
    public static VarHandle pszIcon$VH() {
        return _PROPSHEETPAGEA_V3.pszIcon$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCSTR pszIcon;
     * }
     */
    public static MemorySegment pszIcon$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.pszIcon$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCSTR pszIcon;
     * }
     */
    public static void pszIcon$set(MemorySegment seg, MemorySegment x) {
        _PROPSHEETPAGEA_V3.pszIcon$VH.set(seg, x);
    }
    public static MemorySegment pszIcon$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.pszIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszIcon$set(MemorySegment seg, long index, MemorySegment x) {
        _PROPSHEETPAGEA_V3.pszIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszTitle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszTitle"));
    public static VarHandle pszTitle$VH() {
        return _PROPSHEETPAGEA_V3.pszTitle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCSTR pszTitle;
     * }
     */
    public static MemorySegment pszTitle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.pszTitle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCSTR pszTitle;
     * }
     */
    public static void pszTitle$set(MemorySegment seg, MemorySegment x) {
        _PROPSHEETPAGEA_V3.pszTitle$VH.set(seg, x);
    }
    public static MemorySegment pszTitle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.pszTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszTitle$set(MemorySegment seg, long index, MemorySegment x) {
        _PROPSHEETPAGEA_V3.pszTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfnDlgProc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnDlgProc"));
    public static VarHandle pfnDlgProc$VH() {
        return _PROPSHEETPAGEA_V3.pfnDlgProc$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DLGPROC pfnDlgProc;
     * }
     */
    public static MemorySegment pfnDlgProc$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.pfnDlgProc$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DLGPROC pfnDlgProc;
     * }
     */
    public static void pfnDlgProc$set(MemorySegment seg, MemorySegment x) {
        _PROPSHEETPAGEA_V3.pfnDlgProc$VH.set(seg, x);
    }
    public static MemorySegment pfnDlgProc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.pfnDlgProc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnDlgProc$set(MemorySegment seg, long index, MemorySegment x) {
        _PROPSHEETPAGEA_V3.pfnDlgProc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static DLGPROC pfnDlgProc(MemorySegment segment, SegmentScope scope) {
        return DLGPROC.ofAddress(pfnDlgProc$get(segment), scope);
    }
    static final VarHandle lParam$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lParam"));
    public static VarHandle lParam$VH() {
        return _PROPSHEETPAGEA_V3.lParam$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPARAM lParam;
     * }
     */
    public static long lParam$get(MemorySegment seg) {
        return (long)_PROPSHEETPAGEA_V3.lParam$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPARAM lParam;
     * }
     */
    public static void lParam$set(MemorySegment seg, long x) {
        _PROPSHEETPAGEA_V3.lParam$VH.set(seg, x);
    }
    public static long lParam$get(MemorySegment seg, long index) {
        return (long)_PROPSHEETPAGEA_V3.lParam$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lParam$set(MemorySegment seg, long index, long x) {
        _PROPSHEETPAGEA_V3.lParam$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfnCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnCallback"));
    public static VarHandle pfnCallback$VH() {
        return _PROPSHEETPAGEA_V3.pfnCallback$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPFNPSPCALLBACKA pfnCallback;
     * }
     */
    public static MemorySegment pfnCallback$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.pfnCallback$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPFNPSPCALLBACKA pfnCallback;
     * }
     */
    public static void pfnCallback$set(MemorySegment seg, MemorySegment x) {
        _PROPSHEETPAGEA_V3.pfnCallback$VH.set(seg, x);
    }
    public static MemorySegment pfnCallback$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.pfnCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnCallback$set(MemorySegment seg, long index, MemorySegment x) {
        _PROPSHEETPAGEA_V3.pfnCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPFNPSPCALLBACKA pfnCallback(MemorySegment segment, SegmentScope scope) {
        return LPFNPSPCALLBACKA.ofAddress(pfnCallback$get(segment), scope);
    }
    static final VarHandle pcRefParent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pcRefParent"));
    public static VarHandle pcRefParent$VH() {
        return _PROPSHEETPAGEA_V3.pcRefParent$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT* pcRefParent;
     * }
     */
    public static MemorySegment pcRefParent$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.pcRefParent$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT* pcRefParent;
     * }
     */
    public static void pcRefParent$set(MemorySegment seg, MemorySegment x) {
        _PROPSHEETPAGEA_V3.pcRefParent$VH.set(seg, x);
    }
    public static MemorySegment pcRefParent$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.pcRefParent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pcRefParent$set(MemorySegment seg, long index, MemorySegment x) {
        _PROPSHEETPAGEA_V3.pcRefParent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszHeaderTitle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszHeaderTitle"));
    public static VarHandle pszHeaderTitle$VH() {
        return _PROPSHEETPAGEA_V3.pszHeaderTitle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCSTR pszHeaderTitle;
     * }
     */
    public static MemorySegment pszHeaderTitle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.pszHeaderTitle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCSTR pszHeaderTitle;
     * }
     */
    public static void pszHeaderTitle$set(MemorySegment seg, MemorySegment x) {
        _PROPSHEETPAGEA_V3.pszHeaderTitle$VH.set(seg, x);
    }
    public static MemorySegment pszHeaderTitle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.pszHeaderTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszHeaderTitle$set(MemorySegment seg, long index, MemorySegment x) {
        _PROPSHEETPAGEA_V3.pszHeaderTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszHeaderSubTitle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszHeaderSubTitle"));
    public static VarHandle pszHeaderSubTitle$VH() {
        return _PROPSHEETPAGEA_V3.pszHeaderSubTitle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCSTR pszHeaderSubTitle;
     * }
     */
    public static MemorySegment pszHeaderSubTitle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.pszHeaderSubTitle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCSTR pszHeaderSubTitle;
     * }
     */
    public static void pszHeaderSubTitle$set(MemorySegment seg, MemorySegment x) {
        _PROPSHEETPAGEA_V3.pszHeaderSubTitle$VH.set(seg, x);
    }
    public static MemorySegment pszHeaderSubTitle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.pszHeaderSubTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszHeaderSubTitle$set(MemorySegment seg, long index, MemorySegment x) {
        _PROPSHEETPAGEA_V3.pszHeaderSubTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hActCtx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hActCtx"));
    public static VarHandle hActCtx$VH() {
        return _PROPSHEETPAGEA_V3.hActCtx$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE hActCtx;
     * }
     */
    public static MemorySegment hActCtx$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.hActCtx$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE hActCtx;
     * }
     */
    public static void hActCtx$set(MemorySegment seg, MemorySegment x) {
        _PROPSHEETPAGEA_V3.hActCtx$VH.set(seg, x);
    }
    public static MemorySegment hActCtx$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PROPSHEETPAGEA_V3.hActCtx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hActCtx$set(MemorySegment seg, long index, MemorySegment x) {
        _PROPSHEETPAGEA_V3.hActCtx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


