// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagOFNA {
 *     DWORD lStructSize;
 *     HWND hwndOwner;
 *     HINSTANCE hInstance;
 *     LPCSTR lpstrFilter;
 *     LPSTR lpstrCustomFilter;
 *     DWORD nMaxCustFilter;
 *     DWORD nFilterIndex;
 *     LPSTR lpstrFile;
 *     DWORD nMaxFile;
 *     LPSTR lpstrFileTitle;
 *     DWORD nMaxFileTitle;
 *     LPCSTR lpstrInitialDir;
 *     LPCSTR lpstrTitle;
 *     DWORD Flags;
 *     WORD nFileOffset;
 *     WORD nFileExtension;
 *     LPCSTR lpstrDefExt;
 *     LPARAM lCustData;
 *     LPOFNHOOKPROC lpfnHook;
 *     LPCSTR lpTemplateName;
 *     void* pvReserved;
 *     DWORD dwReserved;
 *     DWORD FlagsEx;
 * };
 * }
 */
public class tagOFNA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("lStructSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hwndOwner"),
        Constants$root.C_POINTER$LAYOUT.withName("hInstance"),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrFilter"),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrCustomFilter"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxCustFilter"),
        Constants$root.C_LONG$LAYOUT.withName("nFilterIndex"),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrFile"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxFile"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrFileTitle"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxFileTitle"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrInitialDir"),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrTitle"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_SHORT$LAYOUT.withName("nFileOffset"),
        Constants$root.C_SHORT$LAYOUT.withName("nFileExtension"),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrDefExt"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("lCustData"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnHook"),
        Constants$root.C_POINTER$LAYOUT.withName("lpTemplateName"),
        Constants$root.C_POINTER$LAYOUT.withName("pvReserved"),
        Constants$root.C_LONG$LAYOUT.withName("dwReserved"),
        Constants$root.C_LONG$LAYOUT.withName("FlagsEx")
    ).withName("tagOFNA");
    public static MemoryLayout $LAYOUT() {
        return tagOFNA.$struct$LAYOUT;
    }
    static final VarHandle lStructSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lStructSize"));
    public static VarHandle lStructSize$VH() {
        return tagOFNA.lStructSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD lStructSize;
     * }
     */
    public static int lStructSize$get(MemorySegment seg) {
        return (int)tagOFNA.lStructSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD lStructSize;
     * }
     */
    public static void lStructSize$set(MemorySegment seg, int x) {
        tagOFNA.lStructSize$VH.set(seg, x);
    }
    public static int lStructSize$get(MemorySegment seg, long index) {
        return (int)tagOFNA.lStructSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lStructSize$set(MemorySegment seg, long index, int x) {
        tagOFNA.lStructSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndOwner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndOwner"));
    public static VarHandle hwndOwner$VH() {
        return tagOFNA.hwndOwner$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwndOwner;
     * }
     */
    public static MemorySegment hwndOwner$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagOFNA.hwndOwner$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwndOwner;
     * }
     */
    public static void hwndOwner$set(MemorySegment seg, MemorySegment x) {
        tagOFNA.hwndOwner$VH.set(seg, x);
    }
    public static MemorySegment hwndOwner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagOFNA.hwndOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemorySegment x) {
        tagOFNA.hwndOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hInstance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hInstance"));
    public static VarHandle hInstance$VH() {
        return tagOFNA.hInstance$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HINSTANCE hInstance;
     * }
     */
    public static MemorySegment hInstance$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagOFNA.hInstance$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HINSTANCE hInstance;
     * }
     */
    public static void hInstance$set(MemorySegment seg, MemorySegment x) {
        tagOFNA.hInstance$VH.set(seg, x);
    }
    public static MemorySegment hInstance$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagOFNA.hInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemorySegment x) {
        tagOFNA.hInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrFilter$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrFilter"));
    public static VarHandle lpstrFilter$VH() {
        return tagOFNA.lpstrFilter$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCSTR lpstrFilter;
     * }
     */
    public static MemorySegment lpstrFilter$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagOFNA.lpstrFilter$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCSTR lpstrFilter;
     * }
     */
    public static void lpstrFilter$set(MemorySegment seg, MemorySegment x) {
        tagOFNA.lpstrFilter$VH.set(seg, x);
    }
    public static MemorySegment lpstrFilter$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagOFNA.lpstrFilter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrFilter$set(MemorySegment seg, long index, MemorySegment x) {
        tagOFNA.lpstrFilter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrCustomFilter$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrCustomFilter"));
    public static VarHandle lpstrCustomFilter$VH() {
        return tagOFNA.lpstrCustomFilter$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpstrCustomFilter;
     * }
     */
    public static MemorySegment lpstrCustomFilter$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagOFNA.lpstrCustomFilter$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpstrCustomFilter;
     * }
     */
    public static void lpstrCustomFilter$set(MemorySegment seg, MemorySegment x) {
        tagOFNA.lpstrCustomFilter$VH.set(seg, x);
    }
    public static MemorySegment lpstrCustomFilter$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagOFNA.lpstrCustomFilter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrCustomFilter$set(MemorySegment seg, long index, MemorySegment x) {
        tagOFNA.lpstrCustomFilter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxCustFilter$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxCustFilter"));
    public static VarHandle nMaxCustFilter$VH() {
        return tagOFNA.nMaxCustFilter$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nMaxCustFilter;
     * }
     */
    public static int nMaxCustFilter$get(MemorySegment seg) {
        return (int)tagOFNA.nMaxCustFilter$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nMaxCustFilter;
     * }
     */
    public static void nMaxCustFilter$set(MemorySegment seg, int x) {
        tagOFNA.nMaxCustFilter$VH.set(seg, x);
    }
    public static int nMaxCustFilter$get(MemorySegment seg, long index) {
        return (int)tagOFNA.nMaxCustFilter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxCustFilter$set(MemorySegment seg, long index, int x) {
        tagOFNA.nMaxCustFilter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nFilterIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nFilterIndex"));
    public static VarHandle nFilterIndex$VH() {
        return tagOFNA.nFilterIndex$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nFilterIndex;
     * }
     */
    public static int nFilterIndex$get(MemorySegment seg) {
        return (int)tagOFNA.nFilterIndex$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nFilterIndex;
     * }
     */
    public static void nFilterIndex$set(MemorySegment seg, int x) {
        tagOFNA.nFilterIndex$VH.set(seg, x);
    }
    public static int nFilterIndex$get(MemorySegment seg, long index) {
        return (int)tagOFNA.nFilterIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nFilterIndex$set(MemorySegment seg, long index, int x) {
        tagOFNA.nFilterIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrFile"));
    public static VarHandle lpstrFile$VH() {
        return tagOFNA.lpstrFile$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpstrFile;
     * }
     */
    public static MemorySegment lpstrFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagOFNA.lpstrFile$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpstrFile;
     * }
     */
    public static void lpstrFile$set(MemorySegment seg, MemorySegment x) {
        tagOFNA.lpstrFile$VH.set(seg, x);
    }
    public static MemorySegment lpstrFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagOFNA.lpstrFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrFile$set(MemorySegment seg, long index, MemorySegment x) {
        tagOFNA.lpstrFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxFile"));
    public static VarHandle nMaxFile$VH() {
        return tagOFNA.nMaxFile$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nMaxFile;
     * }
     */
    public static int nMaxFile$get(MemorySegment seg) {
        return (int)tagOFNA.nMaxFile$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nMaxFile;
     * }
     */
    public static void nMaxFile$set(MemorySegment seg, int x) {
        tagOFNA.nMaxFile$VH.set(seg, x);
    }
    public static int nMaxFile$get(MemorySegment seg, long index) {
        return (int)tagOFNA.nMaxFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxFile$set(MemorySegment seg, long index, int x) {
        tagOFNA.nMaxFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrFileTitle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrFileTitle"));
    public static VarHandle lpstrFileTitle$VH() {
        return tagOFNA.lpstrFileTitle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpstrFileTitle;
     * }
     */
    public static MemorySegment lpstrFileTitle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagOFNA.lpstrFileTitle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpstrFileTitle;
     * }
     */
    public static void lpstrFileTitle$set(MemorySegment seg, MemorySegment x) {
        tagOFNA.lpstrFileTitle$VH.set(seg, x);
    }
    public static MemorySegment lpstrFileTitle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagOFNA.lpstrFileTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrFileTitle$set(MemorySegment seg, long index, MemorySegment x) {
        tagOFNA.lpstrFileTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxFileTitle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxFileTitle"));
    public static VarHandle nMaxFileTitle$VH() {
        return tagOFNA.nMaxFileTitle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nMaxFileTitle;
     * }
     */
    public static int nMaxFileTitle$get(MemorySegment seg) {
        return (int)tagOFNA.nMaxFileTitle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nMaxFileTitle;
     * }
     */
    public static void nMaxFileTitle$set(MemorySegment seg, int x) {
        tagOFNA.nMaxFileTitle$VH.set(seg, x);
    }
    public static int nMaxFileTitle$get(MemorySegment seg, long index) {
        return (int)tagOFNA.nMaxFileTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxFileTitle$set(MemorySegment seg, long index, int x) {
        tagOFNA.nMaxFileTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrInitialDir$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrInitialDir"));
    public static VarHandle lpstrInitialDir$VH() {
        return tagOFNA.lpstrInitialDir$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCSTR lpstrInitialDir;
     * }
     */
    public static MemorySegment lpstrInitialDir$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagOFNA.lpstrInitialDir$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCSTR lpstrInitialDir;
     * }
     */
    public static void lpstrInitialDir$set(MemorySegment seg, MemorySegment x) {
        tagOFNA.lpstrInitialDir$VH.set(seg, x);
    }
    public static MemorySegment lpstrInitialDir$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagOFNA.lpstrInitialDir$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrInitialDir$set(MemorySegment seg, long index, MemorySegment x) {
        tagOFNA.lpstrInitialDir$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrTitle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrTitle"));
    public static VarHandle lpstrTitle$VH() {
        return tagOFNA.lpstrTitle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCSTR lpstrTitle;
     * }
     */
    public static MemorySegment lpstrTitle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagOFNA.lpstrTitle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCSTR lpstrTitle;
     * }
     */
    public static void lpstrTitle$set(MemorySegment seg, MemorySegment x) {
        tagOFNA.lpstrTitle$VH.set(seg, x);
    }
    public static MemorySegment lpstrTitle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagOFNA.lpstrTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrTitle$set(MemorySegment seg, long index, MemorySegment x) {
        tagOFNA.lpstrTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return tagOFNA.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)tagOFNA.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        tagOFNA.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)tagOFNA.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        tagOFNA.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nFileOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nFileOffset"));
    public static VarHandle nFileOffset$VH() {
        return tagOFNA.nFileOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD nFileOffset;
     * }
     */
    public static short nFileOffset$get(MemorySegment seg) {
        return (short)tagOFNA.nFileOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD nFileOffset;
     * }
     */
    public static void nFileOffset$set(MemorySegment seg, short x) {
        tagOFNA.nFileOffset$VH.set(seg, x);
    }
    public static short nFileOffset$get(MemorySegment seg, long index) {
        return (short)tagOFNA.nFileOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nFileOffset$set(MemorySegment seg, long index, short x) {
        tagOFNA.nFileOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nFileExtension$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nFileExtension"));
    public static VarHandle nFileExtension$VH() {
        return tagOFNA.nFileExtension$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD nFileExtension;
     * }
     */
    public static short nFileExtension$get(MemorySegment seg) {
        return (short)tagOFNA.nFileExtension$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD nFileExtension;
     * }
     */
    public static void nFileExtension$set(MemorySegment seg, short x) {
        tagOFNA.nFileExtension$VH.set(seg, x);
    }
    public static short nFileExtension$get(MemorySegment seg, long index) {
        return (short)tagOFNA.nFileExtension$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nFileExtension$set(MemorySegment seg, long index, short x) {
        tagOFNA.nFileExtension$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrDefExt$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrDefExt"));
    public static VarHandle lpstrDefExt$VH() {
        return tagOFNA.lpstrDefExt$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCSTR lpstrDefExt;
     * }
     */
    public static MemorySegment lpstrDefExt$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagOFNA.lpstrDefExt$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCSTR lpstrDefExt;
     * }
     */
    public static void lpstrDefExt$set(MemorySegment seg, MemorySegment x) {
        tagOFNA.lpstrDefExt$VH.set(seg, x);
    }
    public static MemorySegment lpstrDefExt$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagOFNA.lpstrDefExt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrDefExt$set(MemorySegment seg, long index, MemorySegment x) {
        tagOFNA.lpstrDefExt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lCustData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lCustData"));
    public static VarHandle lCustData$VH() {
        return tagOFNA.lCustData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPARAM lCustData;
     * }
     */
    public static long lCustData$get(MemorySegment seg) {
        return (long)tagOFNA.lCustData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPARAM lCustData;
     * }
     */
    public static void lCustData$set(MemorySegment seg, long x) {
        tagOFNA.lCustData$VH.set(seg, x);
    }
    public static long lCustData$get(MemorySegment seg, long index) {
        return (long)tagOFNA.lCustData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lCustData$set(MemorySegment seg, long index, long x) {
        tagOFNA.lCustData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfnHook$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnHook"));
    public static VarHandle lpfnHook$VH() {
        return tagOFNA.lpfnHook$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPOFNHOOKPROC lpfnHook;
     * }
     */
    public static MemorySegment lpfnHook$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagOFNA.lpfnHook$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPOFNHOOKPROC lpfnHook;
     * }
     */
    public static void lpfnHook$set(MemorySegment seg, MemorySegment x) {
        tagOFNA.lpfnHook$VH.set(seg, x);
    }
    public static MemorySegment lpfnHook$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagOFNA.lpfnHook$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnHook$set(MemorySegment seg, long index, MemorySegment x) {
        tagOFNA.lpfnHook$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOFNHOOKPROC lpfnHook(MemorySegment segment, SegmentScope scope) {
        return LPOFNHOOKPROC.ofAddress(lpfnHook$get(segment), scope);
    }
    static final VarHandle lpTemplateName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpTemplateName"));
    public static VarHandle lpTemplateName$VH() {
        return tagOFNA.lpTemplateName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCSTR lpTemplateName;
     * }
     */
    public static MemorySegment lpTemplateName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagOFNA.lpTemplateName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCSTR lpTemplateName;
     * }
     */
    public static void lpTemplateName$set(MemorySegment seg, MemorySegment x) {
        tagOFNA.lpTemplateName$VH.set(seg, x);
    }
    public static MemorySegment lpTemplateName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagOFNA.lpTemplateName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpTemplateName$set(MemorySegment seg, long index, MemorySegment x) {
        tagOFNA.lpTemplateName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvReserved"));
    public static VarHandle pvReserved$VH() {
        return tagOFNA.pvReserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pvReserved;
     * }
     */
    public static MemorySegment pvReserved$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagOFNA.pvReserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pvReserved;
     * }
     */
    public static void pvReserved$set(MemorySegment seg, MemorySegment x) {
        tagOFNA.pvReserved$VH.set(seg, x);
    }
    public static MemorySegment pvReserved$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagOFNA.pvReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvReserved$set(MemorySegment seg, long index, MemorySegment x) {
        tagOFNA.pvReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReserved"));
    public static VarHandle dwReserved$VH() {
        return tagOFNA.dwReserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwReserved;
     * }
     */
    public static int dwReserved$get(MemorySegment seg) {
        return (int)tagOFNA.dwReserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwReserved;
     * }
     */
    public static void dwReserved$set(MemorySegment seg, int x) {
        tagOFNA.dwReserved$VH.set(seg, x);
    }
    public static int dwReserved$get(MemorySegment seg, long index) {
        return (int)tagOFNA.dwReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved$set(MemorySegment seg, long index, int x) {
        tagOFNA.dwReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FlagsEx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FlagsEx"));
    public static VarHandle FlagsEx$VH() {
        return tagOFNA.FlagsEx$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD FlagsEx;
     * }
     */
    public static int FlagsEx$get(MemorySegment seg) {
        return (int)tagOFNA.FlagsEx$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD FlagsEx;
     * }
     */
    public static void FlagsEx$set(MemorySegment seg, int x) {
        tagOFNA.FlagsEx$VH.set(seg, x);
    }
    public static int FlagsEx$get(MemorySegment seg, long index) {
        return (int)tagOFNA.FlagsEx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FlagsEx$set(MemorySegment seg, long index, int x) {
        tagOFNA.FlagsEx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

