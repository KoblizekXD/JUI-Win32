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
 *     WORD Revision;
 *     union  Flags;
 *     DWORD PolicyCount;
 *     PROCESSOR_IDLESTATE_INFO Policy[3];
 * };
 * }
 */
public class PROCESSOR_IDLESTATE_POLICY {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Revision"),
        MemoryLayout.unionLayout(
            Constants$root.C_SHORT$LAYOUT.withName("AsWORD"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(16)
            ).withName("$anon$0")
        ).withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("PolicyCount"),
        MemoryLayout.sequenceLayout(3, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("TimeCheck"),
            Constants$root.C_CHAR$LAYOUT.withName("DemotePercent"),
            Constants$root.C_CHAR$LAYOUT.withName("PromotePercent"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("Spare")
        )).withName("Policy")
    );
    public static MemoryLayout $LAYOUT() {
        return PROCESSOR_IDLESTATE_POLICY.$struct$LAYOUT;
    }
    static final VarHandle Revision$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Revision"));
    public static VarHandle Revision$VH() {
        return PROCESSOR_IDLESTATE_POLICY.Revision$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Revision;
     * }
     */
    public static short Revision$get(MemorySegment seg) {
        return (short)PROCESSOR_IDLESTATE_POLICY.Revision$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Revision;
     * }
     */
    public static void Revision$set(MemorySegment seg, short x) {
        PROCESSOR_IDLESTATE_POLICY.Revision$VH.set(seg, x);
    }
    public static short Revision$get(MemorySegment seg, long index) {
        return (short)PROCESSOR_IDLESTATE_POLICY.Revision$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Revision$set(MemorySegment seg, long index, short x) {
        PROCESSOR_IDLESTATE_POLICY.Revision$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union {
     *     WORD AsWORD;
     *     struct {
     *              *         WORD AllowScaling;
     *         WORD Disabled;
     *         WORD Reserved;
     *     };
     * };
     * }
     */
    public static final class Flags {

        // Suppresses default constructor, ensuring non-instantiability.
        private Flags() {}
        static final UnionLayout Flags$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_SHORT$LAYOUT.withName("AsWORD"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(16)
            ).withName("$anon$0")
        );
        public static MemoryLayout $LAYOUT() {
            return Flags.Flags$union$LAYOUT;
        }
        static final VarHandle AsWORD$VH = Flags$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AsWORD"));
        public static VarHandle AsWORD$VH() {
            return Flags.AsWORD$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * WORD AsWORD;
         * }
         */
        public static short AsWORD$get(MemorySegment seg) {
            return (short)Flags.AsWORD$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * WORD AsWORD;
         * }
         */
        public static void AsWORD$set(MemorySegment seg, short x) {
            Flags.AsWORD$VH.set(seg, x);
        }
        public static short AsWORD$get(MemorySegment seg, long index) {
            return (short)Flags.AsWORD$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void AsWORD$set(MemorySegment seg, long index, short x) {
            Flags.AsWORD$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment Flags$slice(MemorySegment seg) {
        return seg.asSlice(2, 2);
    }
    static final VarHandle PolicyCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PolicyCount"));
    public static VarHandle PolicyCount$VH() {
        return PROCESSOR_IDLESTATE_POLICY.PolicyCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD PolicyCount;
     * }
     */
    public static int PolicyCount$get(MemorySegment seg) {
        return (int)PROCESSOR_IDLESTATE_POLICY.PolicyCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD PolicyCount;
     * }
     */
    public static void PolicyCount$set(MemorySegment seg, int x) {
        PROCESSOR_IDLESTATE_POLICY.PolicyCount$VH.set(seg, x);
    }
    public static int PolicyCount$get(MemorySegment seg, long index) {
        return (int)PROCESSOR_IDLESTATE_POLICY.PolicyCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PolicyCount$set(MemorySegment seg, long index, int x) {
        PROCESSOR_IDLESTATE_POLICY.PolicyCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Policy$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

