// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _RPC_BINDING_HANDLE_TEMPLATE_V1_W {
 *     unsigned long Version;
 *     unsigned long Flags;
 *     unsigned long ProtocolSequence;
 *     unsigned short* NetworkAddress;
 *     unsigned short* StringEndpoint;
 *     union  u1;
 *     UUID ObjectUuid;
 * };
 * }
 */
public class _RPC_BINDING_HANDLE_TEMPLATE_V1_W {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("ProtocolSequence"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("NetworkAddress"),
        Constants$root.C_POINTER$LAYOUT.withName("StringEndpoint"),
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("Reserved")
        ).withName("u1"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("ObjectUuid")
    ).withName("_RPC_BINDING_HANDLE_TEMPLATE_V1_W");
    public static MemoryLayout $LAYOUT() {
        return _RPC_BINDING_HANDLE_TEMPLATE_V1_W.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _RPC_BINDING_HANDLE_TEMPLATE_V1_W.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_RPC_BINDING_HANDLE_TEMPLATE_V1_W.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _RPC_BINDING_HANDLE_TEMPLATE_V1_W.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_RPC_BINDING_HANDLE_TEMPLATE_V1_W.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _RPC_BINDING_HANDLE_TEMPLATE_V1_W.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _RPC_BINDING_HANDLE_TEMPLATE_V1_W.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_RPC_BINDING_HANDLE_TEMPLATE_V1_W.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _RPC_BINDING_HANDLE_TEMPLATE_V1_W.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_RPC_BINDING_HANDLE_TEMPLATE_V1_W.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _RPC_BINDING_HANDLE_TEMPLATE_V1_W.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProtocolSequence$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProtocolSequence"));
    public static VarHandle ProtocolSequence$VH() {
        return _RPC_BINDING_HANDLE_TEMPLATE_V1_W.ProtocolSequence$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long ProtocolSequence;
     * }
     */
    public static int ProtocolSequence$get(MemorySegment seg) {
        return (int)_RPC_BINDING_HANDLE_TEMPLATE_V1_W.ProtocolSequence$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long ProtocolSequence;
     * }
     */
    public static void ProtocolSequence$set(MemorySegment seg, int x) {
        _RPC_BINDING_HANDLE_TEMPLATE_V1_W.ProtocolSequence$VH.set(seg, x);
    }
    public static int ProtocolSequence$get(MemorySegment seg, long index) {
        return (int)_RPC_BINDING_HANDLE_TEMPLATE_V1_W.ProtocolSequence$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProtocolSequence$set(MemorySegment seg, long index, int x) {
        _RPC_BINDING_HANDLE_TEMPLATE_V1_W.ProtocolSequence$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NetworkAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NetworkAddress"));
    public static VarHandle NetworkAddress$VH() {
        return _RPC_BINDING_HANDLE_TEMPLATE_V1_W.NetworkAddress$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short* NetworkAddress;
     * }
     */
    public static MemorySegment NetworkAddress$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_RPC_BINDING_HANDLE_TEMPLATE_V1_W.NetworkAddress$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short* NetworkAddress;
     * }
     */
    public static void NetworkAddress$set(MemorySegment seg, MemorySegment x) {
        _RPC_BINDING_HANDLE_TEMPLATE_V1_W.NetworkAddress$VH.set(seg, x);
    }
    public static MemorySegment NetworkAddress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_RPC_BINDING_HANDLE_TEMPLATE_V1_W.NetworkAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NetworkAddress$set(MemorySegment seg, long index, MemorySegment x) {
        _RPC_BINDING_HANDLE_TEMPLATE_V1_W.NetworkAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StringEndpoint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StringEndpoint"));
    public static VarHandle StringEndpoint$VH() {
        return _RPC_BINDING_HANDLE_TEMPLATE_V1_W.StringEndpoint$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short* StringEndpoint;
     * }
     */
    public static MemorySegment StringEndpoint$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_RPC_BINDING_HANDLE_TEMPLATE_V1_W.StringEndpoint$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short* StringEndpoint;
     * }
     */
    public static void StringEndpoint$set(MemorySegment seg, MemorySegment x) {
        _RPC_BINDING_HANDLE_TEMPLATE_V1_W.StringEndpoint$VH.set(seg, x);
    }
    public static MemorySegment StringEndpoint$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_RPC_BINDING_HANDLE_TEMPLATE_V1_W.StringEndpoint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StringEndpoint$set(MemorySegment seg, long index, MemorySegment x) {
        _RPC_BINDING_HANDLE_TEMPLATE_V1_W.StringEndpoint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union {
     *     unsigned short* Reserved;
     * };
     * }
     */
    public static final class u1 {

        // Suppresses default constructor, ensuring non-instantiability.
        private u1() {}
        static final UnionLayout u1$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("Reserved")
        );
        public static MemoryLayout $LAYOUT() {
            return u1.u1$union$LAYOUT;
        }
        static final VarHandle Reserved$VH = u1$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
        public static VarHandle Reserved$VH() {
            return u1.Reserved$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * unsigned short* Reserved;
         * }
         */
        public static MemorySegment Reserved$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)u1.Reserved$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * unsigned short* Reserved;
         * }
         */
        public static void Reserved$set(MemorySegment seg, MemorySegment x) {
            u1.Reserved$VH.set(seg, x);
        }
        public static MemorySegment Reserved$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)u1.Reserved$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void Reserved$set(MemorySegment seg, long index, MemorySegment x) {
            u1.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment u1$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    public static MemorySegment ObjectUuid$slice(MemorySegment seg) {
        return seg.asSlice(40, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


