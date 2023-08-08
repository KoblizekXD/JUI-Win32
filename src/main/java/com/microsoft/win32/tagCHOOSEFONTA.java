// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagCHOOSEFONTA {
 *     DWORD lStructSize;
 *     HWND hwndOwner;
 *     HDC hDC;
 *     LPLOGFONTA lpLogFont;
 *     INT iPointSize;
 *     DWORD Flags;
 *     COLORREF rgbColors;
 *     LPARAM lCustData;
 *     LPCFHOOKPROC lpfnHook;
 *     LPCSTR lpTemplateName;
 *     HINSTANCE hInstance;
 *     LPSTR lpszStyle;
 *     WORD nFontType;
 *     WORD ___MISSING_ALIGNMENT__;
 *     INT nSizeMin;
 *     INT nSizeMax;
 * };
 * }
 */
public class tagCHOOSEFONTA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("lStructSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hwndOwner"),
        Constants$root.C_POINTER$LAYOUT.withName("hDC"),
        Constants$root.C_POINTER$LAYOUT.withName("lpLogFont"),
        Constants$root.C_LONG$LAYOUT.withName("iPointSize"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("rgbColors"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("lCustData"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnHook"),
        Constants$root.C_POINTER$LAYOUT.withName("lpTemplateName"),
        Constants$root.C_POINTER$LAYOUT.withName("hInstance"),
        Constants$root.C_POINTER$LAYOUT.withName("lpszStyle"),
        Constants$root.C_SHORT$LAYOUT.withName("nFontType"),
        Constants$root.C_SHORT$LAYOUT.withName("___MISSING_ALIGNMENT__"),
        Constants$root.C_LONG$LAYOUT.withName("nSizeMin"),
        Constants$root.C_LONG$LAYOUT.withName("nSizeMax"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagCHOOSEFONTA");
    public static MemoryLayout $LAYOUT() {
        return tagCHOOSEFONTA.$struct$LAYOUT;
    }
    static final VarHandle lStructSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lStructSize"));
    public static VarHandle lStructSize$VH() {
        return tagCHOOSEFONTA.lStructSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD lStructSize;
     * }
     */
    public static int lStructSize$get(MemorySegment seg) {
        return (int)tagCHOOSEFONTA.lStructSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD lStructSize;
     * }
     */
    public static void lStructSize$set(MemorySegment seg, int x) {
        tagCHOOSEFONTA.lStructSize$VH.set(seg, x);
    }
    public static int lStructSize$get(MemorySegment seg, long index) {
        return (int)tagCHOOSEFONTA.lStructSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lStructSize$set(MemorySegment seg, long index, int x) {
        tagCHOOSEFONTA.lStructSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndOwner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndOwner"));
    public static VarHandle hwndOwner$VH() {
        return tagCHOOSEFONTA.hwndOwner$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwndOwner;
     * }
     */
    public static MemorySegment hwndOwner$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagCHOOSEFONTA.hwndOwner$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwndOwner;
     * }
     */
    public static void hwndOwner$set(MemorySegment seg, MemorySegment x) {
        tagCHOOSEFONTA.hwndOwner$VH.set(seg, x);
    }
    public static MemorySegment hwndOwner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagCHOOSEFONTA.hwndOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemorySegment x) {
        tagCHOOSEFONTA.hwndOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hDC$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hDC"));
    public static VarHandle hDC$VH() {
        return tagCHOOSEFONTA.hDC$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HDC hDC;
     * }
     */
    public static MemorySegment hDC$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagCHOOSEFONTA.hDC$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HDC hDC;
     * }
     */
    public static void hDC$set(MemorySegment seg, MemorySegment x) {
        tagCHOOSEFONTA.hDC$VH.set(seg, x);
    }
    public static MemorySegment hDC$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagCHOOSEFONTA.hDC$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hDC$set(MemorySegment seg, long index, MemorySegment x) {
        tagCHOOSEFONTA.hDC$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpLogFont$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpLogFont"));
    public static VarHandle lpLogFont$VH() {
        return tagCHOOSEFONTA.lpLogFont$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPLOGFONTA lpLogFont;
     * }
     */
    public static MemorySegment lpLogFont$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagCHOOSEFONTA.lpLogFont$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPLOGFONTA lpLogFont;
     * }
     */
    public static void lpLogFont$set(MemorySegment seg, MemorySegment x) {
        tagCHOOSEFONTA.lpLogFont$VH.set(seg, x);
    }
    public static MemorySegment lpLogFont$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagCHOOSEFONTA.lpLogFont$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpLogFont$set(MemorySegment seg, long index, MemorySegment x) {
        tagCHOOSEFONTA.lpLogFont$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iPointSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iPointSize"));
    public static VarHandle iPointSize$VH() {
        return tagCHOOSEFONTA.iPointSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * INT iPointSize;
     * }
     */
    public static int iPointSize$get(MemorySegment seg) {
        return (int)tagCHOOSEFONTA.iPointSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * INT iPointSize;
     * }
     */
    public static void iPointSize$set(MemorySegment seg, int x) {
        tagCHOOSEFONTA.iPointSize$VH.set(seg, x);
    }
    public static int iPointSize$get(MemorySegment seg, long index) {
        return (int)tagCHOOSEFONTA.iPointSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iPointSize$set(MemorySegment seg, long index, int x) {
        tagCHOOSEFONTA.iPointSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return tagCHOOSEFONTA.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)tagCHOOSEFONTA.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        tagCHOOSEFONTA.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)tagCHOOSEFONTA.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        tagCHOOSEFONTA.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgbColors$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgbColors"));
    public static VarHandle rgbColors$VH() {
        return tagCHOOSEFONTA.rgbColors$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * COLORREF rgbColors;
     * }
     */
    public static int rgbColors$get(MemorySegment seg) {
        return (int)tagCHOOSEFONTA.rgbColors$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * COLORREF rgbColors;
     * }
     */
    public static void rgbColors$set(MemorySegment seg, int x) {
        tagCHOOSEFONTA.rgbColors$VH.set(seg, x);
    }
    public static int rgbColors$get(MemorySegment seg, long index) {
        return (int)tagCHOOSEFONTA.rgbColors$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgbColors$set(MemorySegment seg, long index, int x) {
        tagCHOOSEFONTA.rgbColors$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lCustData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lCustData"));
    public static VarHandle lCustData$VH() {
        return tagCHOOSEFONTA.lCustData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPARAM lCustData;
     * }
     */
    public static long lCustData$get(MemorySegment seg) {
        return (long)tagCHOOSEFONTA.lCustData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPARAM lCustData;
     * }
     */
    public static void lCustData$set(MemorySegment seg, long x) {
        tagCHOOSEFONTA.lCustData$VH.set(seg, x);
    }
    public static long lCustData$get(MemorySegment seg, long index) {
        return (long)tagCHOOSEFONTA.lCustData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lCustData$set(MemorySegment seg, long index, long x) {
        tagCHOOSEFONTA.lCustData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfnHook$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnHook"));
    public static VarHandle lpfnHook$VH() {
        return tagCHOOSEFONTA.lpfnHook$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCFHOOKPROC lpfnHook;
     * }
     */
    public static MemorySegment lpfnHook$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagCHOOSEFONTA.lpfnHook$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCFHOOKPROC lpfnHook;
     * }
     */
    public static void lpfnHook$set(MemorySegment seg, MemorySegment x) {
        tagCHOOSEFONTA.lpfnHook$VH.set(seg, x);
    }
    public static MemorySegment lpfnHook$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagCHOOSEFONTA.lpfnHook$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnHook$set(MemorySegment seg, long index, MemorySegment x) {
        tagCHOOSEFONTA.lpfnHook$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPCFHOOKPROC lpfnHook(MemorySegment segment, SegmentScope scope) {
        return LPCFHOOKPROC.ofAddress(lpfnHook$get(segment), scope);
    }
    static final VarHandle lpTemplateName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpTemplateName"));
    public static VarHandle lpTemplateName$VH() {
        return tagCHOOSEFONTA.lpTemplateName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCSTR lpTemplateName;
     * }
     */
    public static MemorySegment lpTemplateName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagCHOOSEFONTA.lpTemplateName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCSTR lpTemplateName;
     * }
     */
    public static void lpTemplateName$set(MemorySegment seg, MemorySegment x) {
        tagCHOOSEFONTA.lpTemplateName$VH.set(seg, x);
    }
    public static MemorySegment lpTemplateName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagCHOOSEFONTA.lpTemplateName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpTemplateName$set(MemorySegment seg, long index, MemorySegment x) {
        tagCHOOSEFONTA.lpTemplateName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hInstance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hInstance"));
    public static VarHandle hInstance$VH() {
        return tagCHOOSEFONTA.hInstance$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HINSTANCE hInstance;
     * }
     */
    public static MemorySegment hInstance$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagCHOOSEFONTA.hInstance$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HINSTANCE hInstance;
     * }
     */
    public static void hInstance$set(MemorySegment seg, MemorySegment x) {
        tagCHOOSEFONTA.hInstance$VH.set(seg, x);
    }
    public static MemorySegment hInstance$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagCHOOSEFONTA.hInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemorySegment x) {
        tagCHOOSEFONTA.hInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszStyle"));
    public static VarHandle lpszStyle$VH() {
        return tagCHOOSEFONTA.lpszStyle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpszStyle;
     * }
     */
    public static MemorySegment lpszStyle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagCHOOSEFONTA.lpszStyle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpszStyle;
     * }
     */
    public static void lpszStyle$set(MemorySegment seg, MemorySegment x) {
        tagCHOOSEFONTA.lpszStyle$VH.set(seg, x);
    }
    public static MemorySegment lpszStyle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagCHOOSEFONTA.lpszStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszStyle$set(MemorySegment seg, long index, MemorySegment x) {
        tagCHOOSEFONTA.lpszStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nFontType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nFontType"));
    public static VarHandle nFontType$VH() {
        return tagCHOOSEFONTA.nFontType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD nFontType;
     * }
     */
    public static short nFontType$get(MemorySegment seg) {
        return (short)tagCHOOSEFONTA.nFontType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD nFontType;
     * }
     */
    public static void nFontType$set(MemorySegment seg, short x) {
        tagCHOOSEFONTA.nFontType$VH.set(seg, x);
    }
    public static short nFontType$get(MemorySegment seg, long index) {
        return (short)tagCHOOSEFONTA.nFontType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nFontType$set(MemorySegment seg, long index, short x) {
        tagCHOOSEFONTA.nFontType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ___MISSING_ALIGNMENT__$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("___MISSING_ALIGNMENT__"));
    public static VarHandle ___MISSING_ALIGNMENT__$VH() {
        return tagCHOOSEFONTA.___MISSING_ALIGNMENT__$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD ___MISSING_ALIGNMENT__;
     * }
     */
    public static short ___MISSING_ALIGNMENT__$get(MemorySegment seg) {
        return (short)tagCHOOSEFONTA.___MISSING_ALIGNMENT__$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD ___MISSING_ALIGNMENT__;
     * }
     */
    public static void ___MISSING_ALIGNMENT__$set(MemorySegment seg, short x) {
        tagCHOOSEFONTA.___MISSING_ALIGNMENT__$VH.set(seg, x);
    }
    public static short ___MISSING_ALIGNMENT__$get(MemorySegment seg, long index) {
        return (short)tagCHOOSEFONTA.___MISSING_ALIGNMENT__$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ___MISSING_ALIGNMENT__$set(MemorySegment seg, long index, short x) {
        tagCHOOSEFONTA.___MISSING_ALIGNMENT__$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nSizeMin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nSizeMin"));
    public static VarHandle nSizeMin$VH() {
        return tagCHOOSEFONTA.nSizeMin$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * INT nSizeMin;
     * }
     */
    public static int nSizeMin$get(MemorySegment seg) {
        return (int)tagCHOOSEFONTA.nSizeMin$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * INT nSizeMin;
     * }
     */
    public static void nSizeMin$set(MemorySegment seg, int x) {
        tagCHOOSEFONTA.nSizeMin$VH.set(seg, x);
    }
    public static int nSizeMin$get(MemorySegment seg, long index) {
        return (int)tagCHOOSEFONTA.nSizeMin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nSizeMin$set(MemorySegment seg, long index, int x) {
        tagCHOOSEFONTA.nSizeMin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nSizeMax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nSizeMax"));
    public static VarHandle nSizeMax$VH() {
        return tagCHOOSEFONTA.nSizeMax$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * INT nSizeMax;
     * }
     */
    public static int nSizeMax$get(MemorySegment seg) {
        return (int)tagCHOOSEFONTA.nSizeMax$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * INT nSizeMax;
     * }
     */
    public static void nSizeMax$set(MemorySegment seg, int x) {
        tagCHOOSEFONTA.nSizeMax$VH.set(seg, x);
    }
    public static int nSizeMax$get(MemorySegment seg, long index) {
        return (int)tagCHOOSEFONTA.nSizeMax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nSizeMax$set(MemorySegment seg, long index, int x) {
        tagCHOOSEFONTA.nSizeMax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

