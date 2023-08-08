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
 *     unsigned char* UserName;
 *     unsigned char* ComputerName;
 *     unsigned short Privilege;
 *     unsigned long AuthFlags;
 * };
 * }
 */
public class RPC_CLIENT_INFORMATION1 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("UserName"),
        Constants$root.C_POINTER$LAYOUT.withName("ComputerName"),
        Constants$root.C_SHORT$LAYOUT.withName("Privilege"),
        MemoryLayout.paddingLayout(16),
        Constants$root.C_LONG$LAYOUT.withName("AuthFlags")
    );
    public static MemoryLayout $LAYOUT() {
        return RPC_CLIENT_INFORMATION1.$struct$LAYOUT;
    }
    static final VarHandle UserName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UserName"));
    public static VarHandle UserName$VH() {
        return RPC_CLIENT_INFORMATION1.UserName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* UserName;
     * }
     */
    public static MemorySegment UserName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)RPC_CLIENT_INFORMATION1.UserName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* UserName;
     * }
     */
    public static void UserName$set(MemorySegment seg, MemorySegment x) {
        RPC_CLIENT_INFORMATION1.UserName$VH.set(seg, x);
    }
    public static MemorySegment UserName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)RPC_CLIENT_INFORMATION1.UserName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UserName$set(MemorySegment seg, long index, MemorySegment x) {
        RPC_CLIENT_INFORMATION1.UserName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ComputerName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ComputerName"));
    public static VarHandle ComputerName$VH() {
        return RPC_CLIENT_INFORMATION1.ComputerName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* ComputerName;
     * }
     */
    public static MemorySegment ComputerName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)RPC_CLIENT_INFORMATION1.ComputerName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* ComputerName;
     * }
     */
    public static void ComputerName$set(MemorySegment seg, MemorySegment x) {
        RPC_CLIENT_INFORMATION1.ComputerName$VH.set(seg, x);
    }
    public static MemorySegment ComputerName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)RPC_CLIENT_INFORMATION1.ComputerName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ComputerName$set(MemorySegment seg, long index, MemorySegment x) {
        RPC_CLIENT_INFORMATION1.ComputerName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Privilege$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Privilege"));
    public static VarHandle Privilege$VH() {
        return RPC_CLIENT_INFORMATION1.Privilege$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short Privilege;
     * }
     */
    public static short Privilege$get(MemorySegment seg) {
        return (short)RPC_CLIENT_INFORMATION1.Privilege$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short Privilege;
     * }
     */
    public static void Privilege$set(MemorySegment seg, short x) {
        RPC_CLIENT_INFORMATION1.Privilege$VH.set(seg, x);
    }
    public static short Privilege$get(MemorySegment seg, long index) {
        return (short)RPC_CLIENT_INFORMATION1.Privilege$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Privilege$set(MemorySegment seg, long index, short x) {
        RPC_CLIENT_INFORMATION1.Privilege$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AuthFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AuthFlags"));
    public static VarHandle AuthFlags$VH() {
        return RPC_CLIENT_INFORMATION1.AuthFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long AuthFlags;
     * }
     */
    public static int AuthFlags$get(MemorySegment seg) {
        return (int)RPC_CLIENT_INFORMATION1.AuthFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long AuthFlags;
     * }
     */
    public static void AuthFlags$set(MemorySegment seg, int x) {
        RPC_CLIENT_INFORMATION1.AuthFlags$VH.set(seg, x);
    }
    public static int AuthFlags$get(MemorySegment seg, long index) {
        return (int)RPC_CLIENT_INFORMATION1.AuthFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AuthFlags$set(MemorySegment seg, long index, int x) {
        RPC_CLIENT_INFORMATION1.AuthFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

