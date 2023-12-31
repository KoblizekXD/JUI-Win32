// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     DWORD dwStructSize;
 *     LPSTR lpstrGroupNames;
 *     DWORD nMaxGroupNames;
 *     LPCGUID rgguidInterfaces;
 *     DWORD cguidInterfaces;
 *     LPSTR lpstrCardNames;
 *     DWORD nMaxCardNames;
 *     LPOCNCHKPROC lpfnCheck;
 *     LPOCNCONNPROCA lpfnConnect;
 *     LPOCNDSCPROC lpfnDisconnect;
 *     LPVOID pvUserData;
 *     DWORD dwShareMode;
 *     DWORD dwPreferredProtocols;
 * };
 * }
 */
public class OPENCARD_SEARCH_CRITERIAA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwStructSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrGroupNames"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxGroupNames"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgguidInterfaces"),
        Constants$root.C_LONG$LAYOUT.withName("cguidInterfaces"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrCardNames"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxCardNames"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnCheck"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnConnect"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnDisconnect"),
        Constants$root.C_POINTER$LAYOUT.withName("pvUserData"),
        Constants$root.C_LONG$LAYOUT.withName("dwShareMode"),
        Constants$root.C_LONG$LAYOUT.withName("dwPreferredProtocols")
    );
    public static MemoryLayout $LAYOUT() {
        return OPENCARD_SEARCH_CRITERIAA.$struct$LAYOUT;
    }
    static final VarHandle dwStructSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStructSize"));
    public static VarHandle dwStructSize$VH() {
        return OPENCARD_SEARCH_CRITERIAA.dwStructSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwStructSize;
     * }
     */
    public static int dwStructSize$get(MemorySegment seg) {
        return (int)OPENCARD_SEARCH_CRITERIAA.dwStructSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwStructSize;
     * }
     */
    public static void dwStructSize$set(MemorySegment seg, int x) {
        OPENCARD_SEARCH_CRITERIAA.dwStructSize$VH.set(seg, x);
    }
    public static int dwStructSize$get(MemorySegment seg, long index) {
        return (int)OPENCARD_SEARCH_CRITERIAA.dwStructSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStructSize$set(MemorySegment seg, long index, int x) {
        OPENCARD_SEARCH_CRITERIAA.dwStructSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrGroupNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrGroupNames"));
    public static VarHandle lpstrGroupNames$VH() {
        return OPENCARD_SEARCH_CRITERIAA.lpstrGroupNames$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpstrGroupNames;
     * }
     */
    public static MemorySegment lpstrGroupNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)OPENCARD_SEARCH_CRITERIAA.lpstrGroupNames$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpstrGroupNames;
     * }
     */
    public static void lpstrGroupNames$set(MemorySegment seg, MemorySegment x) {
        OPENCARD_SEARCH_CRITERIAA.lpstrGroupNames$VH.set(seg, x);
    }
    public static MemorySegment lpstrGroupNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)OPENCARD_SEARCH_CRITERIAA.lpstrGroupNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrGroupNames$set(MemorySegment seg, long index, MemorySegment x) {
        OPENCARD_SEARCH_CRITERIAA.lpstrGroupNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxGroupNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxGroupNames"));
    public static VarHandle nMaxGroupNames$VH() {
        return OPENCARD_SEARCH_CRITERIAA.nMaxGroupNames$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nMaxGroupNames;
     * }
     */
    public static int nMaxGroupNames$get(MemorySegment seg) {
        return (int)OPENCARD_SEARCH_CRITERIAA.nMaxGroupNames$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nMaxGroupNames;
     * }
     */
    public static void nMaxGroupNames$set(MemorySegment seg, int x) {
        OPENCARD_SEARCH_CRITERIAA.nMaxGroupNames$VH.set(seg, x);
    }
    public static int nMaxGroupNames$get(MemorySegment seg, long index) {
        return (int)OPENCARD_SEARCH_CRITERIAA.nMaxGroupNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxGroupNames$set(MemorySegment seg, long index, int x) {
        OPENCARD_SEARCH_CRITERIAA.nMaxGroupNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgguidInterfaces$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgguidInterfaces"));
    public static VarHandle rgguidInterfaces$VH() {
        return OPENCARD_SEARCH_CRITERIAA.rgguidInterfaces$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCGUID rgguidInterfaces;
     * }
     */
    public static MemorySegment rgguidInterfaces$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)OPENCARD_SEARCH_CRITERIAA.rgguidInterfaces$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCGUID rgguidInterfaces;
     * }
     */
    public static void rgguidInterfaces$set(MemorySegment seg, MemorySegment x) {
        OPENCARD_SEARCH_CRITERIAA.rgguidInterfaces$VH.set(seg, x);
    }
    public static MemorySegment rgguidInterfaces$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)OPENCARD_SEARCH_CRITERIAA.rgguidInterfaces$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgguidInterfaces$set(MemorySegment seg, long index, MemorySegment x) {
        OPENCARD_SEARCH_CRITERIAA.rgguidInterfaces$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cguidInterfaces$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cguidInterfaces"));
    public static VarHandle cguidInterfaces$VH() {
        return OPENCARD_SEARCH_CRITERIAA.cguidInterfaces$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cguidInterfaces;
     * }
     */
    public static int cguidInterfaces$get(MemorySegment seg) {
        return (int)OPENCARD_SEARCH_CRITERIAA.cguidInterfaces$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cguidInterfaces;
     * }
     */
    public static void cguidInterfaces$set(MemorySegment seg, int x) {
        OPENCARD_SEARCH_CRITERIAA.cguidInterfaces$VH.set(seg, x);
    }
    public static int cguidInterfaces$get(MemorySegment seg, long index) {
        return (int)OPENCARD_SEARCH_CRITERIAA.cguidInterfaces$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cguidInterfaces$set(MemorySegment seg, long index, int x) {
        OPENCARD_SEARCH_CRITERIAA.cguidInterfaces$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrCardNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrCardNames"));
    public static VarHandle lpstrCardNames$VH() {
        return OPENCARD_SEARCH_CRITERIAA.lpstrCardNames$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpstrCardNames;
     * }
     */
    public static MemorySegment lpstrCardNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)OPENCARD_SEARCH_CRITERIAA.lpstrCardNames$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpstrCardNames;
     * }
     */
    public static void lpstrCardNames$set(MemorySegment seg, MemorySegment x) {
        OPENCARD_SEARCH_CRITERIAA.lpstrCardNames$VH.set(seg, x);
    }
    public static MemorySegment lpstrCardNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)OPENCARD_SEARCH_CRITERIAA.lpstrCardNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrCardNames$set(MemorySegment seg, long index, MemorySegment x) {
        OPENCARD_SEARCH_CRITERIAA.lpstrCardNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxCardNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxCardNames"));
    public static VarHandle nMaxCardNames$VH() {
        return OPENCARD_SEARCH_CRITERIAA.nMaxCardNames$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nMaxCardNames;
     * }
     */
    public static int nMaxCardNames$get(MemorySegment seg) {
        return (int)OPENCARD_SEARCH_CRITERIAA.nMaxCardNames$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nMaxCardNames;
     * }
     */
    public static void nMaxCardNames$set(MemorySegment seg, int x) {
        OPENCARD_SEARCH_CRITERIAA.nMaxCardNames$VH.set(seg, x);
    }
    public static int nMaxCardNames$get(MemorySegment seg, long index) {
        return (int)OPENCARD_SEARCH_CRITERIAA.nMaxCardNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxCardNames$set(MemorySegment seg, long index, int x) {
        OPENCARD_SEARCH_CRITERIAA.nMaxCardNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfnCheck$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnCheck"));
    public static VarHandle lpfnCheck$VH() {
        return OPENCARD_SEARCH_CRITERIAA.lpfnCheck$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPOCNCHKPROC lpfnCheck;
     * }
     */
    public static MemorySegment lpfnCheck$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)OPENCARD_SEARCH_CRITERIAA.lpfnCheck$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPOCNCHKPROC lpfnCheck;
     * }
     */
    public static void lpfnCheck$set(MemorySegment seg, MemorySegment x) {
        OPENCARD_SEARCH_CRITERIAA.lpfnCheck$VH.set(seg, x);
    }
    public static MemorySegment lpfnCheck$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)OPENCARD_SEARCH_CRITERIAA.lpfnCheck$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnCheck$set(MemorySegment seg, long index, MemorySegment x) {
        OPENCARD_SEARCH_CRITERIAA.lpfnCheck$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOCNCHKPROC lpfnCheck(MemorySegment segment, SegmentScope scope) {
        return LPOCNCHKPROC.ofAddress(lpfnCheck$get(segment), scope);
    }
    static final VarHandle lpfnConnect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnConnect"));
    public static VarHandle lpfnConnect$VH() {
        return OPENCARD_SEARCH_CRITERIAA.lpfnConnect$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPOCNCONNPROCA lpfnConnect;
     * }
     */
    public static MemorySegment lpfnConnect$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)OPENCARD_SEARCH_CRITERIAA.lpfnConnect$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPOCNCONNPROCA lpfnConnect;
     * }
     */
    public static void lpfnConnect$set(MemorySegment seg, MemorySegment x) {
        OPENCARD_SEARCH_CRITERIAA.lpfnConnect$VH.set(seg, x);
    }
    public static MemorySegment lpfnConnect$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)OPENCARD_SEARCH_CRITERIAA.lpfnConnect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnConnect$set(MemorySegment seg, long index, MemorySegment x) {
        OPENCARD_SEARCH_CRITERIAA.lpfnConnect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOCNCONNPROCA lpfnConnect(MemorySegment segment, SegmentScope scope) {
        return LPOCNCONNPROCA.ofAddress(lpfnConnect$get(segment), scope);
    }
    static final VarHandle lpfnDisconnect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnDisconnect"));
    public static VarHandle lpfnDisconnect$VH() {
        return OPENCARD_SEARCH_CRITERIAA.lpfnDisconnect$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPOCNDSCPROC lpfnDisconnect;
     * }
     */
    public static MemorySegment lpfnDisconnect$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)OPENCARD_SEARCH_CRITERIAA.lpfnDisconnect$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPOCNDSCPROC lpfnDisconnect;
     * }
     */
    public static void lpfnDisconnect$set(MemorySegment seg, MemorySegment x) {
        OPENCARD_SEARCH_CRITERIAA.lpfnDisconnect$VH.set(seg, x);
    }
    public static MemorySegment lpfnDisconnect$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)OPENCARD_SEARCH_CRITERIAA.lpfnDisconnect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnDisconnect$set(MemorySegment seg, long index, MemorySegment x) {
        OPENCARD_SEARCH_CRITERIAA.lpfnDisconnect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOCNDSCPROC lpfnDisconnect(MemorySegment segment, SegmentScope scope) {
        return LPOCNDSCPROC.ofAddress(lpfnDisconnect$get(segment), scope);
    }
    static final VarHandle pvUserData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvUserData"));
    public static VarHandle pvUserData$VH() {
        return OPENCARD_SEARCH_CRITERIAA.pvUserData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPVOID pvUserData;
     * }
     */
    public static MemorySegment pvUserData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)OPENCARD_SEARCH_CRITERIAA.pvUserData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPVOID pvUserData;
     * }
     */
    public static void pvUserData$set(MemorySegment seg, MemorySegment x) {
        OPENCARD_SEARCH_CRITERIAA.pvUserData$VH.set(seg, x);
    }
    public static MemorySegment pvUserData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)OPENCARD_SEARCH_CRITERIAA.pvUserData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvUserData$set(MemorySegment seg, long index, MemorySegment x) {
        OPENCARD_SEARCH_CRITERIAA.pvUserData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwShareMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwShareMode"));
    public static VarHandle dwShareMode$VH() {
        return OPENCARD_SEARCH_CRITERIAA.dwShareMode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwShareMode;
     * }
     */
    public static int dwShareMode$get(MemorySegment seg) {
        return (int)OPENCARD_SEARCH_CRITERIAA.dwShareMode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwShareMode;
     * }
     */
    public static void dwShareMode$set(MemorySegment seg, int x) {
        OPENCARD_SEARCH_CRITERIAA.dwShareMode$VH.set(seg, x);
    }
    public static int dwShareMode$get(MemorySegment seg, long index) {
        return (int)OPENCARD_SEARCH_CRITERIAA.dwShareMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwShareMode$set(MemorySegment seg, long index, int x) {
        OPENCARD_SEARCH_CRITERIAA.dwShareMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPreferredProtocols$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwPreferredProtocols"));
    public static VarHandle dwPreferredProtocols$VH() {
        return OPENCARD_SEARCH_CRITERIAA.dwPreferredProtocols$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwPreferredProtocols;
     * }
     */
    public static int dwPreferredProtocols$get(MemorySegment seg) {
        return (int)OPENCARD_SEARCH_CRITERIAA.dwPreferredProtocols$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwPreferredProtocols;
     * }
     */
    public static void dwPreferredProtocols$set(MemorySegment seg, int x) {
        OPENCARD_SEARCH_CRITERIAA.dwPreferredProtocols$VH.set(seg, x);
    }
    public static int dwPreferredProtocols$get(MemorySegment seg, long index) {
        return (int)OPENCARD_SEARCH_CRITERIAA.dwPreferredProtocols$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPreferredProtocols$set(MemorySegment seg, long index, int x) {
        OPENCARD_SEARCH_CRITERIAA.dwPreferredProtocols$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


