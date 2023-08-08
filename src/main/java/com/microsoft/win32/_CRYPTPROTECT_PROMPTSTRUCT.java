// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPTPROTECT_PROMPTSTRUCT {
 *     DWORD cbSize;
 *     DWORD dwPromptFlags;
 *     HWND hwndApp;
 *     LPCWSTR szPrompt;
 * };
 * }
 */
public class _CRYPTPROTECT_PROMPTSTRUCT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwPromptFlags"),
        Constants$root.C_POINTER$LAYOUT.withName("hwndApp"),
        Constants$root.C_POINTER$LAYOUT.withName("szPrompt")
    ).withName("_CRYPTPROTECT_PROMPTSTRUCT");
    public static MemoryLayout $LAYOUT() {
        return _CRYPTPROTECT_PROMPTSTRUCT.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CRYPTPROTECT_PROMPTSTRUCT.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CRYPTPROTECT_PROMPTSTRUCT.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _CRYPTPROTECT_PROMPTSTRUCT.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CRYPTPROTECT_PROMPTSTRUCT.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CRYPTPROTECT_PROMPTSTRUCT.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPromptFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwPromptFlags"));
    public static VarHandle dwPromptFlags$VH() {
        return _CRYPTPROTECT_PROMPTSTRUCT.dwPromptFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwPromptFlags;
     * }
     */
    public static int dwPromptFlags$get(MemorySegment seg) {
        return (int)_CRYPTPROTECT_PROMPTSTRUCT.dwPromptFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwPromptFlags;
     * }
     */
    public static void dwPromptFlags$set(MemorySegment seg, int x) {
        _CRYPTPROTECT_PROMPTSTRUCT.dwPromptFlags$VH.set(seg, x);
    }
    public static int dwPromptFlags$get(MemorySegment seg, long index) {
        return (int)_CRYPTPROTECT_PROMPTSTRUCT.dwPromptFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPromptFlags$set(MemorySegment seg, long index, int x) {
        _CRYPTPROTECT_PROMPTSTRUCT.dwPromptFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndApp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndApp"));
    public static VarHandle hwndApp$VH() {
        return _CRYPTPROTECT_PROMPTSTRUCT.hwndApp$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwndApp;
     * }
     */
    public static MemorySegment hwndApp$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRYPTPROTECT_PROMPTSTRUCT.hwndApp$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwndApp;
     * }
     */
    public static void hwndApp$set(MemorySegment seg, MemorySegment x) {
        _CRYPTPROTECT_PROMPTSTRUCT.hwndApp$VH.set(seg, x);
    }
    public static MemorySegment hwndApp$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRYPTPROTECT_PROMPTSTRUCT.hwndApp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndApp$set(MemorySegment seg, long index, MemorySegment x) {
        _CRYPTPROTECT_PROMPTSTRUCT.hwndApp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle szPrompt$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("szPrompt"));
    public static VarHandle szPrompt$VH() {
        return _CRYPTPROTECT_PROMPTSTRUCT.szPrompt$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR szPrompt;
     * }
     */
    public static MemorySegment szPrompt$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRYPTPROTECT_PROMPTSTRUCT.szPrompt$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR szPrompt;
     * }
     */
    public static void szPrompt$set(MemorySegment seg, MemorySegment x) {
        _CRYPTPROTECT_PROMPTSTRUCT.szPrompt$VH.set(seg, x);
    }
    public static MemorySegment szPrompt$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRYPTPROTECT_PROMPTSTRUCT.szPrompt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void szPrompt$set(MemorySegment seg, long index, MemorySegment x) {
        _CRYPTPROTECT_PROMPTSTRUCT.szPrompt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

