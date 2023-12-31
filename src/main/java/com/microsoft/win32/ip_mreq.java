// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct ip_mreq {
 *     struct in_addr imr_multiaddr;
 *     struct in_addr imr_interface;
 * };
 * }
 */
public class ip_mreq {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_CHAR$LAYOUT.withName("s_b1"),
                    Constants$root.C_CHAR$LAYOUT.withName("s_b2"),
                    Constants$root.C_CHAR$LAYOUT.withName("s_b3"),
                    Constants$root.C_CHAR$LAYOUT.withName("s_b4")
                ).withName("S_un_b"),
                MemoryLayout.structLayout(
                    Constants$root.C_SHORT$LAYOUT.withName("s_w1"),
                    Constants$root.C_SHORT$LAYOUT.withName("s_w2")
                ).withName("S_un_w"),
                Constants$root.C_LONG$LAYOUT.withName("S_addr")
            ).withName("S_un")
        ).withName("imr_multiaddr"),
        MemoryLayout.structLayout(
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_CHAR$LAYOUT.withName("s_b1"),
                    Constants$root.C_CHAR$LAYOUT.withName("s_b2"),
                    Constants$root.C_CHAR$LAYOUT.withName("s_b3"),
                    Constants$root.C_CHAR$LAYOUT.withName("s_b4")
                ).withName("S_un_b"),
                MemoryLayout.structLayout(
                    Constants$root.C_SHORT$LAYOUT.withName("s_w1"),
                    Constants$root.C_SHORT$LAYOUT.withName("s_w2")
                ).withName("S_un_w"),
                Constants$root.C_LONG$LAYOUT.withName("S_addr")
            ).withName("S_un")
        ).withName("imr_interface")
    ).withName("ip_mreq");
    public static MemoryLayout $LAYOUT() {
        return ip_mreq.$struct$LAYOUT;
    }
    public static MemorySegment imr_multiaddr$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static MemorySegment imr_interface$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


