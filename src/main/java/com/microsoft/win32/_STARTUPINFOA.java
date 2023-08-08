// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STARTUPINFOA {
 *     DWORD cb;
 *     LPSTR lpReserved;
 *     LPSTR lpDesktop;
 *     LPSTR lpTitle;
 *     DWORD dwX;
 *     DWORD dwY;
 *     DWORD dwXSize;
 *     DWORD dwYSize;
 *     DWORD dwXCountChars;
 *     DWORD dwYCountChars;
 *     DWORD dwFillAttribute;
 *     DWORD dwFlags;
 *     WORD wShowWindow;
 *     WORD cbReserved2;
 *     LPBYTE lpReserved2;
 *     HANDLE hStdInput;
 *     HANDLE hStdOutput;
 *     HANDLE hStdError;
 * };
 * }
 */
public class _STARTUPINFOA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cb"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpReserved"),
        Constants$root.C_POINTER$LAYOUT.withName("lpDesktop"),
        Constants$root.C_POINTER$LAYOUT.withName("lpTitle"),
        Constants$root.C_LONG$LAYOUT.withName("dwX"),
        Constants$root.C_LONG$LAYOUT.withName("dwY"),
        Constants$root.C_LONG$LAYOUT.withName("dwXSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwYSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwXCountChars"),
        Constants$root.C_LONG$LAYOUT.withName("dwYCountChars"),
        Constants$root.C_LONG$LAYOUT.withName("dwFillAttribute"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_SHORT$LAYOUT.withName("wShowWindow"),
        Constants$root.C_SHORT$LAYOUT.withName("cbReserved2"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpReserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("hStdInput"),
        Constants$root.C_POINTER$LAYOUT.withName("hStdOutput"),
        Constants$root.C_POINTER$LAYOUT.withName("hStdError")
    ).withName("_STARTUPINFOA");
    public static MemoryLayout $LAYOUT() {
        return _STARTUPINFOA.$struct$LAYOUT;
    }
    static final VarHandle cb$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cb"));
    public static VarHandle cb$VH() {
        return _STARTUPINFOA.cb$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cb;
     * }
     */
    public static int cb$get(MemorySegment seg) {
        return (int)_STARTUPINFOA.cb$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cb;
     * }
     */
    public static void cb$set(MemorySegment seg, int x) {
        _STARTUPINFOA.cb$VH.set(seg, x);
    }
    public static int cb$get(MemorySegment seg, long index) {
        return (int)_STARTUPINFOA.cb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cb$set(MemorySegment seg, long index, int x) {
        _STARTUPINFOA.cb$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpReserved"));
    public static VarHandle lpReserved$VH() {
        return _STARTUPINFOA.lpReserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpReserved;
     * }
     */
    public static MemorySegment lpReserved$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_STARTUPINFOA.lpReserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpReserved;
     * }
     */
    public static void lpReserved$set(MemorySegment seg, MemorySegment x) {
        _STARTUPINFOA.lpReserved$VH.set(seg, x);
    }
    public static MemorySegment lpReserved$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_STARTUPINFOA.lpReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpReserved$set(MemorySegment seg, long index, MemorySegment x) {
        _STARTUPINFOA.lpReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpDesktop$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpDesktop"));
    public static VarHandle lpDesktop$VH() {
        return _STARTUPINFOA.lpDesktop$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpDesktop;
     * }
     */
    public static MemorySegment lpDesktop$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_STARTUPINFOA.lpDesktop$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpDesktop;
     * }
     */
    public static void lpDesktop$set(MemorySegment seg, MemorySegment x) {
        _STARTUPINFOA.lpDesktop$VH.set(seg, x);
    }
    public static MemorySegment lpDesktop$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_STARTUPINFOA.lpDesktop$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpDesktop$set(MemorySegment seg, long index, MemorySegment x) {
        _STARTUPINFOA.lpDesktop$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpTitle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpTitle"));
    public static VarHandle lpTitle$VH() {
        return _STARTUPINFOA.lpTitle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpTitle;
     * }
     */
    public static MemorySegment lpTitle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_STARTUPINFOA.lpTitle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpTitle;
     * }
     */
    public static void lpTitle$set(MemorySegment seg, MemorySegment x) {
        _STARTUPINFOA.lpTitle$VH.set(seg, x);
    }
    public static MemorySegment lpTitle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_STARTUPINFOA.lpTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpTitle$set(MemorySegment seg, long index, MemorySegment x) {
        _STARTUPINFOA.lpTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwX$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwX"));
    public static VarHandle dwX$VH() {
        return _STARTUPINFOA.dwX$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwX;
     * }
     */
    public static int dwX$get(MemorySegment seg) {
        return (int)_STARTUPINFOA.dwX$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwX;
     * }
     */
    public static void dwX$set(MemorySegment seg, int x) {
        _STARTUPINFOA.dwX$VH.set(seg, x);
    }
    public static int dwX$get(MemorySegment seg, long index) {
        return (int)_STARTUPINFOA.dwX$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwX$set(MemorySegment seg, long index, int x) {
        _STARTUPINFOA.dwX$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwY$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwY"));
    public static VarHandle dwY$VH() {
        return _STARTUPINFOA.dwY$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwY;
     * }
     */
    public static int dwY$get(MemorySegment seg) {
        return (int)_STARTUPINFOA.dwY$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwY;
     * }
     */
    public static void dwY$set(MemorySegment seg, int x) {
        _STARTUPINFOA.dwY$VH.set(seg, x);
    }
    public static int dwY$get(MemorySegment seg, long index) {
        return (int)_STARTUPINFOA.dwY$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwY$set(MemorySegment seg, long index, int x) {
        _STARTUPINFOA.dwY$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwXSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwXSize"));
    public static VarHandle dwXSize$VH() {
        return _STARTUPINFOA.dwXSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwXSize;
     * }
     */
    public static int dwXSize$get(MemorySegment seg) {
        return (int)_STARTUPINFOA.dwXSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwXSize;
     * }
     */
    public static void dwXSize$set(MemorySegment seg, int x) {
        _STARTUPINFOA.dwXSize$VH.set(seg, x);
    }
    public static int dwXSize$get(MemorySegment seg, long index) {
        return (int)_STARTUPINFOA.dwXSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwXSize$set(MemorySegment seg, long index, int x) {
        _STARTUPINFOA.dwXSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwYSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwYSize"));
    public static VarHandle dwYSize$VH() {
        return _STARTUPINFOA.dwYSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwYSize;
     * }
     */
    public static int dwYSize$get(MemorySegment seg) {
        return (int)_STARTUPINFOA.dwYSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwYSize;
     * }
     */
    public static void dwYSize$set(MemorySegment seg, int x) {
        _STARTUPINFOA.dwYSize$VH.set(seg, x);
    }
    public static int dwYSize$get(MemorySegment seg, long index) {
        return (int)_STARTUPINFOA.dwYSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwYSize$set(MemorySegment seg, long index, int x) {
        _STARTUPINFOA.dwYSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwXCountChars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwXCountChars"));
    public static VarHandle dwXCountChars$VH() {
        return _STARTUPINFOA.dwXCountChars$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwXCountChars;
     * }
     */
    public static int dwXCountChars$get(MemorySegment seg) {
        return (int)_STARTUPINFOA.dwXCountChars$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwXCountChars;
     * }
     */
    public static void dwXCountChars$set(MemorySegment seg, int x) {
        _STARTUPINFOA.dwXCountChars$VH.set(seg, x);
    }
    public static int dwXCountChars$get(MemorySegment seg, long index) {
        return (int)_STARTUPINFOA.dwXCountChars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwXCountChars$set(MemorySegment seg, long index, int x) {
        _STARTUPINFOA.dwXCountChars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwYCountChars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwYCountChars"));
    public static VarHandle dwYCountChars$VH() {
        return _STARTUPINFOA.dwYCountChars$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwYCountChars;
     * }
     */
    public static int dwYCountChars$get(MemorySegment seg) {
        return (int)_STARTUPINFOA.dwYCountChars$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwYCountChars;
     * }
     */
    public static void dwYCountChars$set(MemorySegment seg, int x) {
        _STARTUPINFOA.dwYCountChars$VH.set(seg, x);
    }
    public static int dwYCountChars$get(MemorySegment seg, long index) {
        return (int)_STARTUPINFOA.dwYCountChars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwYCountChars$set(MemorySegment seg, long index, int x) {
        _STARTUPINFOA.dwYCountChars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFillAttribute$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFillAttribute"));
    public static VarHandle dwFillAttribute$VH() {
        return _STARTUPINFOA.dwFillAttribute$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFillAttribute;
     * }
     */
    public static int dwFillAttribute$get(MemorySegment seg) {
        return (int)_STARTUPINFOA.dwFillAttribute$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFillAttribute;
     * }
     */
    public static void dwFillAttribute$set(MemorySegment seg, int x) {
        _STARTUPINFOA.dwFillAttribute$VH.set(seg, x);
    }
    public static int dwFillAttribute$get(MemorySegment seg, long index) {
        return (int)_STARTUPINFOA.dwFillAttribute$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFillAttribute$set(MemorySegment seg, long index, int x) {
        _STARTUPINFOA.dwFillAttribute$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _STARTUPINFOA.dwFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_STARTUPINFOA.dwFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        _STARTUPINFOA.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_STARTUPINFOA.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _STARTUPINFOA.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wShowWindow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wShowWindow"));
    public static VarHandle wShowWindow$VH() {
        return _STARTUPINFOA.wShowWindow$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wShowWindow;
     * }
     */
    public static short wShowWindow$get(MemorySegment seg) {
        return (short)_STARTUPINFOA.wShowWindow$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wShowWindow;
     * }
     */
    public static void wShowWindow$set(MemorySegment seg, short x) {
        _STARTUPINFOA.wShowWindow$VH.set(seg, x);
    }
    public static short wShowWindow$get(MemorySegment seg, long index) {
        return (short)_STARTUPINFOA.wShowWindow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wShowWindow$set(MemorySegment seg, long index, short x) {
        _STARTUPINFOA.wShowWindow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbReserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbReserved2"));
    public static VarHandle cbReserved2$VH() {
        return _STARTUPINFOA.cbReserved2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD cbReserved2;
     * }
     */
    public static short cbReserved2$get(MemorySegment seg) {
        return (short)_STARTUPINFOA.cbReserved2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD cbReserved2;
     * }
     */
    public static void cbReserved2$set(MemorySegment seg, short x) {
        _STARTUPINFOA.cbReserved2$VH.set(seg, x);
    }
    public static short cbReserved2$get(MemorySegment seg, long index) {
        return (short)_STARTUPINFOA.cbReserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbReserved2$set(MemorySegment seg, long index, short x) {
        _STARTUPINFOA.cbReserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpReserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpReserved2"));
    public static VarHandle lpReserved2$VH() {
        return _STARTUPINFOA.lpReserved2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPBYTE lpReserved2;
     * }
     */
    public static MemorySegment lpReserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_STARTUPINFOA.lpReserved2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPBYTE lpReserved2;
     * }
     */
    public static void lpReserved2$set(MemorySegment seg, MemorySegment x) {
        _STARTUPINFOA.lpReserved2$VH.set(seg, x);
    }
    public static MemorySegment lpReserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_STARTUPINFOA.lpReserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpReserved2$set(MemorySegment seg, long index, MemorySegment x) {
        _STARTUPINFOA.lpReserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hStdInput$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hStdInput"));
    public static VarHandle hStdInput$VH() {
        return _STARTUPINFOA.hStdInput$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE hStdInput;
     * }
     */
    public static MemorySegment hStdInput$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_STARTUPINFOA.hStdInput$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE hStdInput;
     * }
     */
    public static void hStdInput$set(MemorySegment seg, MemorySegment x) {
        _STARTUPINFOA.hStdInput$VH.set(seg, x);
    }
    public static MemorySegment hStdInput$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_STARTUPINFOA.hStdInput$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hStdInput$set(MemorySegment seg, long index, MemorySegment x) {
        _STARTUPINFOA.hStdInput$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hStdOutput$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hStdOutput"));
    public static VarHandle hStdOutput$VH() {
        return _STARTUPINFOA.hStdOutput$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE hStdOutput;
     * }
     */
    public static MemorySegment hStdOutput$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_STARTUPINFOA.hStdOutput$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE hStdOutput;
     * }
     */
    public static void hStdOutput$set(MemorySegment seg, MemorySegment x) {
        _STARTUPINFOA.hStdOutput$VH.set(seg, x);
    }
    public static MemorySegment hStdOutput$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_STARTUPINFOA.hStdOutput$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hStdOutput$set(MemorySegment seg, long index, MemorySegment x) {
        _STARTUPINFOA.hStdOutput$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hStdError$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hStdError"));
    public static VarHandle hStdError$VH() {
        return _STARTUPINFOA.hStdError$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE hStdError;
     * }
     */
    public static MemorySegment hStdError$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_STARTUPINFOA.hStdError$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE hStdError;
     * }
     */
    public static void hStdError$set(MemorySegment seg, MemorySegment x) {
        _STARTUPINFOA.hStdError$VH.set(seg, x);
    }
    public static MemorySegment hStdError$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_STARTUPINFOA.hStdError$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hStdError$set(MemorySegment seg, long index, MemorySegment x) {
        _STARTUPINFOA.hStdError$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

