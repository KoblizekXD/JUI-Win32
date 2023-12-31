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
 *     HWND hwndOwner;
 *     SCARDCONTEXT hSCardContext;
 *     LPWSTR lpstrGroupNames;
 *     DWORD nMaxGroupNames;
 *     LPWSTR lpstrCardNames;
 *     DWORD nMaxCardNames;
 *     LPCGUID rgguidInterfaces;
 *     DWORD cguidInterfaces;
 *     LPWSTR lpstrRdr;
 *     DWORD nMaxRdr;
 *     LPWSTR lpstrCard;
 *     DWORD nMaxCard;
 *     LPCWSTR lpstrTitle;
 *     DWORD dwFlags;
 *     LPVOID pvUserData;
 *     DWORD dwShareMode;
 *     DWORD dwPreferredProtocols;
 *     DWORD dwActiveProtocol;
 *     LPOCNCONNPROCW lpfnConnect;
 *     LPOCNCHKPROC lpfnCheck;
 *     LPOCNDSCPROC lpfnDisconnect;
 *     SCARDHANDLE hCardHandle;
 * };
 * }
 */
public class OPENCARDNAMEW {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwStructSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hwndOwner"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("hSCardContext"),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrGroupNames"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxGroupNames"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrCardNames"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxCardNames"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgguidInterfaces"),
        Constants$root.C_LONG$LAYOUT.withName("cguidInterfaces"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrRdr"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxRdr"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrCard"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxCard"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrTitle"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pvUserData"),
        Constants$root.C_LONG$LAYOUT.withName("dwShareMode"),
        Constants$root.C_LONG$LAYOUT.withName("dwPreferredProtocols"),
        Constants$root.C_LONG$LAYOUT.withName("dwActiveProtocol"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnConnect"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnCheck"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnDisconnect"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("hCardHandle")
    );
    public static MemoryLayout $LAYOUT() {
        return OPENCARDNAMEW.$struct$LAYOUT;
    }
    static final VarHandle dwStructSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStructSize"));
    public static VarHandle dwStructSize$VH() {
        return OPENCARDNAMEW.dwStructSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwStructSize;
     * }
     */
    public static int dwStructSize$get(MemorySegment seg) {
        return (int)OPENCARDNAMEW.dwStructSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwStructSize;
     * }
     */
    public static void dwStructSize$set(MemorySegment seg, int x) {
        OPENCARDNAMEW.dwStructSize$VH.set(seg, x);
    }
    public static int dwStructSize$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEW.dwStructSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStructSize$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEW.dwStructSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndOwner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndOwner"));
    public static VarHandle hwndOwner$VH() {
        return OPENCARDNAMEW.hwndOwner$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwndOwner;
     * }
     */
    public static MemorySegment hwndOwner$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.hwndOwner$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwndOwner;
     * }
     */
    public static void hwndOwner$set(MemorySegment seg, MemorySegment x) {
        OPENCARDNAMEW.hwndOwner$VH.set(seg, x);
    }
    public static MemorySegment hwndOwner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.hwndOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemorySegment x) {
        OPENCARDNAMEW.hwndOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hSCardContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hSCardContext"));
    public static VarHandle hSCardContext$VH() {
        return OPENCARDNAMEW.hSCardContext$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SCARDCONTEXT hSCardContext;
     * }
     */
    public static long hSCardContext$get(MemorySegment seg) {
        return (long)OPENCARDNAMEW.hSCardContext$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SCARDCONTEXT hSCardContext;
     * }
     */
    public static void hSCardContext$set(MemorySegment seg, long x) {
        OPENCARDNAMEW.hSCardContext$VH.set(seg, x);
    }
    public static long hSCardContext$get(MemorySegment seg, long index) {
        return (long)OPENCARDNAMEW.hSCardContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hSCardContext$set(MemorySegment seg, long index, long x) {
        OPENCARDNAMEW.hSCardContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrGroupNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrGroupNames"));
    public static VarHandle lpstrGroupNames$VH() {
        return OPENCARDNAMEW.lpstrGroupNames$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR lpstrGroupNames;
     * }
     */
    public static MemorySegment lpstrGroupNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.lpstrGroupNames$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR lpstrGroupNames;
     * }
     */
    public static void lpstrGroupNames$set(MemorySegment seg, MemorySegment x) {
        OPENCARDNAMEW.lpstrGroupNames$VH.set(seg, x);
    }
    public static MemorySegment lpstrGroupNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.lpstrGroupNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrGroupNames$set(MemorySegment seg, long index, MemorySegment x) {
        OPENCARDNAMEW.lpstrGroupNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxGroupNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxGroupNames"));
    public static VarHandle nMaxGroupNames$VH() {
        return OPENCARDNAMEW.nMaxGroupNames$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nMaxGroupNames;
     * }
     */
    public static int nMaxGroupNames$get(MemorySegment seg) {
        return (int)OPENCARDNAMEW.nMaxGroupNames$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nMaxGroupNames;
     * }
     */
    public static void nMaxGroupNames$set(MemorySegment seg, int x) {
        OPENCARDNAMEW.nMaxGroupNames$VH.set(seg, x);
    }
    public static int nMaxGroupNames$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEW.nMaxGroupNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxGroupNames$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEW.nMaxGroupNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrCardNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrCardNames"));
    public static VarHandle lpstrCardNames$VH() {
        return OPENCARDNAMEW.lpstrCardNames$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR lpstrCardNames;
     * }
     */
    public static MemorySegment lpstrCardNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.lpstrCardNames$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR lpstrCardNames;
     * }
     */
    public static void lpstrCardNames$set(MemorySegment seg, MemorySegment x) {
        OPENCARDNAMEW.lpstrCardNames$VH.set(seg, x);
    }
    public static MemorySegment lpstrCardNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.lpstrCardNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrCardNames$set(MemorySegment seg, long index, MemorySegment x) {
        OPENCARDNAMEW.lpstrCardNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxCardNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxCardNames"));
    public static VarHandle nMaxCardNames$VH() {
        return OPENCARDNAMEW.nMaxCardNames$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nMaxCardNames;
     * }
     */
    public static int nMaxCardNames$get(MemorySegment seg) {
        return (int)OPENCARDNAMEW.nMaxCardNames$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nMaxCardNames;
     * }
     */
    public static void nMaxCardNames$set(MemorySegment seg, int x) {
        OPENCARDNAMEW.nMaxCardNames$VH.set(seg, x);
    }
    public static int nMaxCardNames$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEW.nMaxCardNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxCardNames$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEW.nMaxCardNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgguidInterfaces$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgguidInterfaces"));
    public static VarHandle rgguidInterfaces$VH() {
        return OPENCARDNAMEW.rgguidInterfaces$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCGUID rgguidInterfaces;
     * }
     */
    public static MemorySegment rgguidInterfaces$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.rgguidInterfaces$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCGUID rgguidInterfaces;
     * }
     */
    public static void rgguidInterfaces$set(MemorySegment seg, MemorySegment x) {
        OPENCARDNAMEW.rgguidInterfaces$VH.set(seg, x);
    }
    public static MemorySegment rgguidInterfaces$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.rgguidInterfaces$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgguidInterfaces$set(MemorySegment seg, long index, MemorySegment x) {
        OPENCARDNAMEW.rgguidInterfaces$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cguidInterfaces$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cguidInterfaces"));
    public static VarHandle cguidInterfaces$VH() {
        return OPENCARDNAMEW.cguidInterfaces$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cguidInterfaces;
     * }
     */
    public static int cguidInterfaces$get(MemorySegment seg) {
        return (int)OPENCARDNAMEW.cguidInterfaces$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cguidInterfaces;
     * }
     */
    public static void cguidInterfaces$set(MemorySegment seg, int x) {
        OPENCARDNAMEW.cguidInterfaces$VH.set(seg, x);
    }
    public static int cguidInterfaces$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEW.cguidInterfaces$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cguidInterfaces$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEW.cguidInterfaces$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrRdr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrRdr"));
    public static VarHandle lpstrRdr$VH() {
        return OPENCARDNAMEW.lpstrRdr$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR lpstrRdr;
     * }
     */
    public static MemorySegment lpstrRdr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.lpstrRdr$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR lpstrRdr;
     * }
     */
    public static void lpstrRdr$set(MemorySegment seg, MemorySegment x) {
        OPENCARDNAMEW.lpstrRdr$VH.set(seg, x);
    }
    public static MemorySegment lpstrRdr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.lpstrRdr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrRdr$set(MemorySegment seg, long index, MemorySegment x) {
        OPENCARDNAMEW.lpstrRdr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxRdr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxRdr"));
    public static VarHandle nMaxRdr$VH() {
        return OPENCARDNAMEW.nMaxRdr$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nMaxRdr;
     * }
     */
    public static int nMaxRdr$get(MemorySegment seg) {
        return (int)OPENCARDNAMEW.nMaxRdr$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nMaxRdr;
     * }
     */
    public static void nMaxRdr$set(MemorySegment seg, int x) {
        OPENCARDNAMEW.nMaxRdr$VH.set(seg, x);
    }
    public static int nMaxRdr$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEW.nMaxRdr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxRdr$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEW.nMaxRdr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrCard$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrCard"));
    public static VarHandle lpstrCard$VH() {
        return OPENCARDNAMEW.lpstrCard$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR lpstrCard;
     * }
     */
    public static MemorySegment lpstrCard$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.lpstrCard$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR lpstrCard;
     * }
     */
    public static void lpstrCard$set(MemorySegment seg, MemorySegment x) {
        OPENCARDNAMEW.lpstrCard$VH.set(seg, x);
    }
    public static MemorySegment lpstrCard$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.lpstrCard$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrCard$set(MemorySegment seg, long index, MemorySegment x) {
        OPENCARDNAMEW.lpstrCard$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxCard$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxCard"));
    public static VarHandle nMaxCard$VH() {
        return OPENCARDNAMEW.nMaxCard$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nMaxCard;
     * }
     */
    public static int nMaxCard$get(MemorySegment seg) {
        return (int)OPENCARDNAMEW.nMaxCard$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nMaxCard;
     * }
     */
    public static void nMaxCard$set(MemorySegment seg, int x) {
        OPENCARDNAMEW.nMaxCard$VH.set(seg, x);
    }
    public static int nMaxCard$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEW.nMaxCard$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxCard$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEW.nMaxCard$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrTitle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrTitle"));
    public static VarHandle lpstrTitle$VH() {
        return OPENCARDNAMEW.lpstrTitle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR lpstrTitle;
     * }
     */
    public static MemorySegment lpstrTitle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.lpstrTitle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR lpstrTitle;
     * }
     */
    public static void lpstrTitle$set(MemorySegment seg, MemorySegment x) {
        OPENCARDNAMEW.lpstrTitle$VH.set(seg, x);
    }
    public static MemorySegment lpstrTitle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.lpstrTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrTitle$set(MemorySegment seg, long index, MemorySegment x) {
        OPENCARDNAMEW.lpstrTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return OPENCARDNAMEW.dwFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)OPENCARDNAMEW.dwFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        OPENCARDNAMEW.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEW.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEW.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvUserData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvUserData"));
    public static VarHandle pvUserData$VH() {
        return OPENCARDNAMEW.pvUserData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPVOID pvUserData;
     * }
     */
    public static MemorySegment pvUserData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.pvUserData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPVOID pvUserData;
     * }
     */
    public static void pvUserData$set(MemorySegment seg, MemorySegment x) {
        OPENCARDNAMEW.pvUserData$VH.set(seg, x);
    }
    public static MemorySegment pvUserData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.pvUserData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvUserData$set(MemorySegment seg, long index, MemorySegment x) {
        OPENCARDNAMEW.pvUserData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwShareMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwShareMode"));
    public static VarHandle dwShareMode$VH() {
        return OPENCARDNAMEW.dwShareMode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwShareMode;
     * }
     */
    public static int dwShareMode$get(MemorySegment seg) {
        return (int)OPENCARDNAMEW.dwShareMode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwShareMode;
     * }
     */
    public static void dwShareMode$set(MemorySegment seg, int x) {
        OPENCARDNAMEW.dwShareMode$VH.set(seg, x);
    }
    public static int dwShareMode$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEW.dwShareMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwShareMode$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEW.dwShareMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPreferredProtocols$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwPreferredProtocols"));
    public static VarHandle dwPreferredProtocols$VH() {
        return OPENCARDNAMEW.dwPreferredProtocols$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwPreferredProtocols;
     * }
     */
    public static int dwPreferredProtocols$get(MemorySegment seg) {
        return (int)OPENCARDNAMEW.dwPreferredProtocols$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwPreferredProtocols;
     * }
     */
    public static void dwPreferredProtocols$set(MemorySegment seg, int x) {
        OPENCARDNAMEW.dwPreferredProtocols$VH.set(seg, x);
    }
    public static int dwPreferredProtocols$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEW.dwPreferredProtocols$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPreferredProtocols$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEW.dwPreferredProtocols$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwActiveProtocol$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwActiveProtocol"));
    public static VarHandle dwActiveProtocol$VH() {
        return OPENCARDNAMEW.dwActiveProtocol$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwActiveProtocol;
     * }
     */
    public static int dwActiveProtocol$get(MemorySegment seg) {
        return (int)OPENCARDNAMEW.dwActiveProtocol$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwActiveProtocol;
     * }
     */
    public static void dwActiveProtocol$set(MemorySegment seg, int x) {
        OPENCARDNAMEW.dwActiveProtocol$VH.set(seg, x);
    }
    public static int dwActiveProtocol$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEW.dwActiveProtocol$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwActiveProtocol$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEW.dwActiveProtocol$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfnConnect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnConnect"));
    public static VarHandle lpfnConnect$VH() {
        return OPENCARDNAMEW.lpfnConnect$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPOCNCONNPROCW lpfnConnect;
     * }
     */
    public static MemorySegment lpfnConnect$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.lpfnConnect$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPOCNCONNPROCW lpfnConnect;
     * }
     */
    public static void lpfnConnect$set(MemorySegment seg, MemorySegment x) {
        OPENCARDNAMEW.lpfnConnect$VH.set(seg, x);
    }
    public static MemorySegment lpfnConnect$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.lpfnConnect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnConnect$set(MemorySegment seg, long index, MemorySegment x) {
        OPENCARDNAMEW.lpfnConnect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOCNCONNPROCW lpfnConnect(MemorySegment segment, SegmentScope scope) {
        return LPOCNCONNPROCW.ofAddress(lpfnConnect$get(segment), scope);
    }
    static final VarHandle lpfnCheck$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnCheck"));
    public static VarHandle lpfnCheck$VH() {
        return OPENCARDNAMEW.lpfnCheck$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPOCNCHKPROC lpfnCheck;
     * }
     */
    public static MemorySegment lpfnCheck$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.lpfnCheck$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPOCNCHKPROC lpfnCheck;
     * }
     */
    public static void lpfnCheck$set(MemorySegment seg, MemorySegment x) {
        OPENCARDNAMEW.lpfnCheck$VH.set(seg, x);
    }
    public static MemorySegment lpfnCheck$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.lpfnCheck$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnCheck$set(MemorySegment seg, long index, MemorySegment x) {
        OPENCARDNAMEW.lpfnCheck$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOCNCHKPROC lpfnCheck(MemorySegment segment, SegmentScope scope) {
        return LPOCNCHKPROC.ofAddress(lpfnCheck$get(segment), scope);
    }
    static final VarHandle lpfnDisconnect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnDisconnect"));
    public static VarHandle lpfnDisconnect$VH() {
        return OPENCARDNAMEW.lpfnDisconnect$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPOCNDSCPROC lpfnDisconnect;
     * }
     */
    public static MemorySegment lpfnDisconnect$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.lpfnDisconnect$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPOCNDSCPROC lpfnDisconnect;
     * }
     */
    public static void lpfnDisconnect$set(MemorySegment seg, MemorySegment x) {
        OPENCARDNAMEW.lpfnDisconnect$VH.set(seg, x);
    }
    public static MemorySegment lpfnDisconnect$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)OPENCARDNAMEW.lpfnDisconnect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnDisconnect$set(MemorySegment seg, long index, MemorySegment x) {
        OPENCARDNAMEW.lpfnDisconnect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOCNDSCPROC lpfnDisconnect(MemorySegment segment, SegmentScope scope) {
        return LPOCNDSCPROC.ofAddress(lpfnDisconnect$get(segment), scope);
    }
    static final VarHandle hCardHandle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hCardHandle"));
    public static VarHandle hCardHandle$VH() {
        return OPENCARDNAMEW.hCardHandle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SCARDHANDLE hCardHandle;
     * }
     */
    public static long hCardHandle$get(MemorySegment seg) {
        return (long)OPENCARDNAMEW.hCardHandle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SCARDHANDLE hCardHandle;
     * }
     */
    public static void hCardHandle$set(MemorySegment seg, long x) {
        OPENCARDNAMEW.hCardHandle$VH.set(seg, x);
    }
    public static long hCardHandle$get(MemorySegment seg, long index) {
        return (long)OPENCARDNAMEW.hCardHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCardHandle$set(MemorySegment seg, long index, long x) {
        OPENCARDNAMEW.hCardHandle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


