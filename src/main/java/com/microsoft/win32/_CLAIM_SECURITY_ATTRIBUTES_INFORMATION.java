// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CLAIM_SECURITY_ATTRIBUTES_INFORMATION {
 *     WORD Version;
 *     WORD Reserved;
 *     DWORD AttributeCount;
 *     union  Attribute;
 * };
 * }
 */
public class _CLAIM_SECURITY_ATTRIBUTES_INFORMATION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Version"),
        Constants$root.C_SHORT$LAYOUT.withName("Reserved"),
        Constants$root.C_LONG$LAYOUT.withName("AttributeCount"),
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pAttributeV1")
        ).withName("Attribute")
    ).withName("_CLAIM_SECURITY_ATTRIBUTES_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _CLAIM_SECURITY_ATTRIBUTES_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _CLAIM_SECURITY_ATTRIBUTES_INFORMATION.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Version;
     * }
     */
    public static short Version$get(MemorySegment seg) {
        return (short)_CLAIM_SECURITY_ATTRIBUTES_INFORMATION.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, short x) {
        _CLAIM_SECURITY_ATTRIBUTES_INFORMATION.Version$VH.set(seg, x);
    }
    public static short Version$get(MemorySegment seg, long index) {
        return (short)_CLAIM_SECURITY_ATTRIBUTES_INFORMATION.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, short x) {
        _CLAIM_SECURITY_ATTRIBUTES_INFORMATION.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _CLAIM_SECURITY_ATTRIBUTES_INFORMATION.Reserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Reserved;
     * }
     */
    public static short Reserved$get(MemorySegment seg) {
        return (short)_CLAIM_SECURITY_ATTRIBUTES_INFORMATION.Reserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, short x) {
        _CLAIM_SECURITY_ATTRIBUTES_INFORMATION.Reserved$VH.set(seg, x);
    }
    public static short Reserved$get(MemorySegment seg, long index) {
        return (short)_CLAIM_SECURITY_ATTRIBUTES_INFORMATION.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, short x) {
        _CLAIM_SECURITY_ATTRIBUTES_INFORMATION.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AttributeCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AttributeCount"));
    public static VarHandle AttributeCount$VH() {
        return _CLAIM_SECURITY_ATTRIBUTES_INFORMATION.AttributeCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD AttributeCount;
     * }
     */
    public static int AttributeCount$get(MemorySegment seg) {
        return (int)_CLAIM_SECURITY_ATTRIBUTES_INFORMATION.AttributeCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD AttributeCount;
     * }
     */
    public static void AttributeCount$set(MemorySegment seg, int x) {
        _CLAIM_SECURITY_ATTRIBUTES_INFORMATION.AttributeCount$VH.set(seg, x);
    }
    public static int AttributeCount$get(MemorySegment seg, long index) {
        return (int)_CLAIM_SECURITY_ATTRIBUTES_INFORMATION.AttributeCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AttributeCount$set(MemorySegment seg, long index, int x) {
        _CLAIM_SECURITY_ATTRIBUTES_INFORMATION.AttributeCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union {
     *     PCLAIM_SECURITY_ATTRIBUTE_V1 pAttributeV1;
     * };
     * }
     */
    public static final class Attribute {

        // Suppresses default constructor, ensuring non-instantiability.
        private Attribute() {}
        static final UnionLayout Attribute$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pAttributeV1")
        );
        public static MemoryLayout $LAYOUT() {
            return Attribute.Attribute$union$LAYOUT;
        }
        static final VarHandle pAttributeV1$VH = Attribute$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pAttributeV1"));
        public static VarHandle pAttributeV1$VH() {
            return Attribute.pAttributeV1$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * PCLAIM_SECURITY_ATTRIBUTE_V1 pAttributeV1;
         * }
         */
        public static MemorySegment pAttributeV1$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)Attribute.pAttributeV1$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * PCLAIM_SECURITY_ATTRIBUTE_V1 pAttributeV1;
         * }
         */
        public static void pAttributeV1$set(MemorySegment seg, MemorySegment x) {
            Attribute.pAttributeV1$VH.set(seg, x);
        }
        public static MemorySegment pAttributeV1$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)Attribute.pAttributeV1$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void pAttributeV1$set(MemorySegment seg, long index, MemorySegment x) {
            Attribute.pAttributeV1$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment Attribute$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


