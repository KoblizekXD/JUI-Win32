// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CLAIM_SECURITY_ATTRIBUTE_V1 {
 *     PWSTR Name;
 *     WORD ValueType;
 *     WORD Reserved;
 *     DWORD Flags;
 *     DWORD ValueCount;
 *     union  Values;
 * };
 * }
 */
public class _CLAIM_SECURITY_ATTRIBUTE_V1 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("Name"),
        Constants$root.C_SHORT$LAYOUT.withName("ValueType"),
        Constants$root.C_SHORT$LAYOUT.withName("Reserved"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("ValueCount"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pInt64"),
            Constants$root.C_POINTER$LAYOUT.withName("pUint64"),
            Constants$root.C_POINTER$LAYOUT.withName("ppString"),
            Constants$root.C_POINTER$LAYOUT.withName("pFqbn"),
            Constants$root.C_POINTER$LAYOUT.withName("pOctetString")
        ).withName("Values")
    ).withName("_CLAIM_SECURITY_ATTRIBUTE_V1");
    public static MemoryLayout $LAYOUT() {
        return _CLAIM_SECURITY_ATTRIBUTE_V1.$struct$LAYOUT;
    }
    static final VarHandle Name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Name"));
    public static VarHandle Name$VH() {
        return _CLAIM_SECURITY_ATTRIBUTE_V1.Name$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PWSTR Name;
     * }
     */
    public static MemorySegment Name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CLAIM_SECURITY_ATTRIBUTE_V1.Name$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PWSTR Name;
     * }
     */
    public static void Name$set(MemorySegment seg, MemorySegment x) {
        _CLAIM_SECURITY_ATTRIBUTE_V1.Name$VH.set(seg, x);
    }
    public static MemorySegment Name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CLAIM_SECURITY_ATTRIBUTE_V1.Name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Name$set(MemorySegment seg, long index, MemorySegment x) {
        _CLAIM_SECURITY_ATTRIBUTE_V1.Name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ValueType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ValueType"));
    public static VarHandle ValueType$VH() {
        return _CLAIM_SECURITY_ATTRIBUTE_V1.ValueType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD ValueType;
     * }
     */
    public static short ValueType$get(MemorySegment seg) {
        return (short)_CLAIM_SECURITY_ATTRIBUTE_V1.ValueType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD ValueType;
     * }
     */
    public static void ValueType$set(MemorySegment seg, short x) {
        _CLAIM_SECURITY_ATTRIBUTE_V1.ValueType$VH.set(seg, x);
    }
    public static short ValueType$get(MemorySegment seg, long index) {
        return (short)_CLAIM_SECURITY_ATTRIBUTE_V1.ValueType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ValueType$set(MemorySegment seg, long index, short x) {
        _CLAIM_SECURITY_ATTRIBUTE_V1.ValueType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _CLAIM_SECURITY_ATTRIBUTE_V1.Reserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Reserved;
     * }
     */
    public static short Reserved$get(MemorySegment seg) {
        return (short)_CLAIM_SECURITY_ATTRIBUTE_V1.Reserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, short x) {
        _CLAIM_SECURITY_ATTRIBUTE_V1.Reserved$VH.set(seg, x);
    }
    public static short Reserved$get(MemorySegment seg, long index) {
        return (short)_CLAIM_SECURITY_ATTRIBUTE_V1.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, short x) {
        _CLAIM_SECURITY_ATTRIBUTE_V1.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _CLAIM_SECURITY_ATTRIBUTE_V1.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_CLAIM_SECURITY_ATTRIBUTE_V1.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _CLAIM_SECURITY_ATTRIBUTE_V1.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_CLAIM_SECURITY_ATTRIBUTE_V1.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _CLAIM_SECURITY_ATTRIBUTE_V1.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ValueCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ValueCount"));
    public static VarHandle ValueCount$VH() {
        return _CLAIM_SECURITY_ATTRIBUTE_V1.ValueCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ValueCount;
     * }
     */
    public static int ValueCount$get(MemorySegment seg) {
        return (int)_CLAIM_SECURITY_ATTRIBUTE_V1.ValueCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ValueCount;
     * }
     */
    public static void ValueCount$set(MemorySegment seg, int x) {
        _CLAIM_SECURITY_ATTRIBUTE_V1.ValueCount$VH.set(seg, x);
    }
    public static int ValueCount$get(MemorySegment seg, long index) {
        return (int)_CLAIM_SECURITY_ATTRIBUTE_V1.ValueCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ValueCount$set(MemorySegment seg, long index, int x) {
        _CLAIM_SECURITY_ATTRIBUTE_V1.ValueCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union {
     *     PLONG64 pInt64;
     *     PDWORD64 pUint64;
     *     PWSTR* ppString;
     *     PCLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE pFqbn;
     *     PCLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE pOctetString;
     * };
     * }
     */
    public static final class Values {

        // Suppresses default constructor, ensuring non-instantiability.
        private Values() {}
        static final UnionLayout Values$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pInt64"),
            Constants$root.C_POINTER$LAYOUT.withName("pUint64"),
            Constants$root.C_POINTER$LAYOUT.withName("ppString"),
            Constants$root.C_POINTER$LAYOUT.withName("pFqbn"),
            Constants$root.C_POINTER$LAYOUT.withName("pOctetString")
        );
        public static MemoryLayout $LAYOUT() {
            return Values.Values$union$LAYOUT;
        }
        static final VarHandle pInt64$VH = Values$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pInt64"));
        public static VarHandle pInt64$VH() {
            return Values.pInt64$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * PLONG64 pInt64;
         * }
         */
        public static MemorySegment pInt64$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)Values.pInt64$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * PLONG64 pInt64;
         * }
         */
        public static void pInt64$set(MemorySegment seg, MemorySegment x) {
            Values.pInt64$VH.set(seg, x);
        }
        public static MemorySegment pInt64$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)Values.pInt64$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void pInt64$set(MemorySegment seg, long index, MemorySegment x) {
            Values.pInt64$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle pUint64$VH = Values$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pUint64"));
        public static VarHandle pUint64$VH() {
            return Values.pUint64$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * PDWORD64 pUint64;
         * }
         */
        public static MemorySegment pUint64$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)Values.pUint64$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * PDWORD64 pUint64;
         * }
         */
        public static void pUint64$set(MemorySegment seg, MemorySegment x) {
            Values.pUint64$VH.set(seg, x);
        }
        public static MemorySegment pUint64$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)Values.pUint64$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void pUint64$set(MemorySegment seg, long index, MemorySegment x) {
            Values.pUint64$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle ppString$VH = Values$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ppString"));
        public static VarHandle ppString$VH() {
            return Values.ppString$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * PWSTR* ppString;
         * }
         */
        public static MemorySegment ppString$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)Values.ppString$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * PWSTR* ppString;
         * }
         */
        public static void ppString$set(MemorySegment seg, MemorySegment x) {
            Values.ppString$VH.set(seg, x);
        }
        public static MemorySegment ppString$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)Values.ppString$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void ppString$set(MemorySegment seg, long index, MemorySegment x) {
            Values.ppString$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle pFqbn$VH = Values$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pFqbn"));
        public static VarHandle pFqbn$VH() {
            return Values.pFqbn$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * PCLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE pFqbn;
         * }
         */
        public static MemorySegment pFqbn$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)Values.pFqbn$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * PCLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE pFqbn;
         * }
         */
        public static void pFqbn$set(MemorySegment seg, MemorySegment x) {
            Values.pFqbn$VH.set(seg, x);
        }
        public static MemorySegment pFqbn$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)Values.pFqbn$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void pFqbn$set(MemorySegment seg, long index, MemorySegment x) {
            Values.pFqbn$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle pOctetString$VH = Values$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pOctetString"));
        public static VarHandle pOctetString$VH() {
            return Values.pOctetString$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * PCLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE pOctetString;
         * }
         */
        public static MemorySegment pOctetString$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)Values.pOctetString$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * PCLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE pOctetString;
         * }
         */
        public static void pOctetString$set(MemorySegment seg, MemorySegment x) {
            Values.pOctetString$VH.set(seg, x);
        }
        public static MemorySegment pOctetString$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)Values.pOctetString$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void pOctetString$set(MemorySegment seg, long index, MemorySegment x) {
            Values.pOctetString$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment Values$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


