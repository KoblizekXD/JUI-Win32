// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_DELAYLOAD_DESCRIPTOR {
 *     union  Attributes;
 *     DWORD DllNameRVA;
 *     DWORD ModuleHandleRVA;
 *     DWORD ImportAddressTableRVA;
 *     DWORD ImportNameTableRVA;
 *     DWORD BoundImportAddressTableRVA;
 *     DWORD UnloadInformationTableRVA;
 *     DWORD TimeDateStamp;
 * };
 * }
 */
public class _IMAGE_DELAYLOAD_DESCRIPTOR {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("AllAttributes"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(32)
            ).withName("$anon$0")
        ).withName("Attributes"),
        Constants$root.C_LONG$LAYOUT.withName("DllNameRVA"),
        Constants$root.C_LONG$LAYOUT.withName("ModuleHandleRVA"),
        Constants$root.C_LONG$LAYOUT.withName("ImportAddressTableRVA"),
        Constants$root.C_LONG$LAYOUT.withName("ImportNameTableRVA"),
        Constants$root.C_LONG$LAYOUT.withName("BoundImportAddressTableRVA"),
        Constants$root.C_LONG$LAYOUT.withName("UnloadInformationTableRVA"),
        Constants$root.C_LONG$LAYOUT.withName("TimeDateStamp")
    ).withName("_IMAGE_DELAYLOAD_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_DELAYLOAD_DESCRIPTOR.$struct$LAYOUT;
    }
    /**
     * {@snippet :
     * union {
     *     DWORD AllAttributes;
     *     struct {
     *              *         DWORD RvaBased;
     *         DWORD ReservedAttributes;
     *     };
     * };
     * }
     */
    public static final class Attributes {

        // Suppresses default constructor, ensuring non-instantiability.
        private Attributes() {}
        static final UnionLayout Attributes$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("AllAttributes"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(32)
            ).withName("$anon$0")
        );
        public static MemoryLayout $LAYOUT() {
            return Attributes.Attributes$union$LAYOUT;
        }
        static final VarHandle AllAttributes$VH = Attributes$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AllAttributes"));
        public static VarHandle AllAttributes$VH() {
            return Attributes.AllAttributes$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD AllAttributes;
         * }
         */
        public static int AllAttributes$get(MemorySegment seg) {
            return (int)Attributes.AllAttributes$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD AllAttributes;
         * }
         */
        public static void AllAttributes$set(MemorySegment seg, int x) {
            Attributes.AllAttributes$VH.set(seg, x);
        }
        public static int AllAttributes$get(MemorySegment seg, long index) {
            return (int)Attributes.AllAttributes$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void AllAttributes$set(MemorySegment seg, long index, int x) {
            Attributes.AllAttributes$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment Attributes$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    static final VarHandle DllNameRVA$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DllNameRVA"));
    public static VarHandle DllNameRVA$VH() {
        return _IMAGE_DELAYLOAD_DESCRIPTOR.DllNameRVA$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DllNameRVA;
     * }
     */
    public static int DllNameRVA$get(MemorySegment seg) {
        return (int)_IMAGE_DELAYLOAD_DESCRIPTOR.DllNameRVA$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DllNameRVA;
     * }
     */
    public static void DllNameRVA$set(MemorySegment seg, int x) {
        _IMAGE_DELAYLOAD_DESCRIPTOR.DllNameRVA$VH.set(seg, x);
    }
    public static int DllNameRVA$get(MemorySegment seg, long index) {
        return (int)_IMAGE_DELAYLOAD_DESCRIPTOR.DllNameRVA$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DllNameRVA$set(MemorySegment seg, long index, int x) {
        _IMAGE_DELAYLOAD_DESCRIPTOR.DllNameRVA$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ModuleHandleRVA$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ModuleHandleRVA"));
    public static VarHandle ModuleHandleRVA$VH() {
        return _IMAGE_DELAYLOAD_DESCRIPTOR.ModuleHandleRVA$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ModuleHandleRVA;
     * }
     */
    public static int ModuleHandleRVA$get(MemorySegment seg) {
        return (int)_IMAGE_DELAYLOAD_DESCRIPTOR.ModuleHandleRVA$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ModuleHandleRVA;
     * }
     */
    public static void ModuleHandleRVA$set(MemorySegment seg, int x) {
        _IMAGE_DELAYLOAD_DESCRIPTOR.ModuleHandleRVA$VH.set(seg, x);
    }
    public static int ModuleHandleRVA$get(MemorySegment seg, long index) {
        return (int)_IMAGE_DELAYLOAD_DESCRIPTOR.ModuleHandleRVA$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ModuleHandleRVA$set(MemorySegment seg, long index, int x) {
        _IMAGE_DELAYLOAD_DESCRIPTOR.ModuleHandleRVA$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ImportAddressTableRVA$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ImportAddressTableRVA"));
    public static VarHandle ImportAddressTableRVA$VH() {
        return _IMAGE_DELAYLOAD_DESCRIPTOR.ImportAddressTableRVA$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ImportAddressTableRVA;
     * }
     */
    public static int ImportAddressTableRVA$get(MemorySegment seg) {
        return (int)_IMAGE_DELAYLOAD_DESCRIPTOR.ImportAddressTableRVA$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ImportAddressTableRVA;
     * }
     */
    public static void ImportAddressTableRVA$set(MemorySegment seg, int x) {
        _IMAGE_DELAYLOAD_DESCRIPTOR.ImportAddressTableRVA$VH.set(seg, x);
    }
    public static int ImportAddressTableRVA$get(MemorySegment seg, long index) {
        return (int)_IMAGE_DELAYLOAD_DESCRIPTOR.ImportAddressTableRVA$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImportAddressTableRVA$set(MemorySegment seg, long index, int x) {
        _IMAGE_DELAYLOAD_DESCRIPTOR.ImportAddressTableRVA$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ImportNameTableRVA$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ImportNameTableRVA"));
    public static VarHandle ImportNameTableRVA$VH() {
        return _IMAGE_DELAYLOAD_DESCRIPTOR.ImportNameTableRVA$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ImportNameTableRVA;
     * }
     */
    public static int ImportNameTableRVA$get(MemorySegment seg) {
        return (int)_IMAGE_DELAYLOAD_DESCRIPTOR.ImportNameTableRVA$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ImportNameTableRVA;
     * }
     */
    public static void ImportNameTableRVA$set(MemorySegment seg, int x) {
        _IMAGE_DELAYLOAD_DESCRIPTOR.ImportNameTableRVA$VH.set(seg, x);
    }
    public static int ImportNameTableRVA$get(MemorySegment seg, long index) {
        return (int)_IMAGE_DELAYLOAD_DESCRIPTOR.ImportNameTableRVA$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImportNameTableRVA$set(MemorySegment seg, long index, int x) {
        _IMAGE_DELAYLOAD_DESCRIPTOR.ImportNameTableRVA$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BoundImportAddressTableRVA$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BoundImportAddressTableRVA"));
    public static VarHandle BoundImportAddressTableRVA$VH() {
        return _IMAGE_DELAYLOAD_DESCRIPTOR.BoundImportAddressTableRVA$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD BoundImportAddressTableRVA;
     * }
     */
    public static int BoundImportAddressTableRVA$get(MemorySegment seg) {
        return (int)_IMAGE_DELAYLOAD_DESCRIPTOR.BoundImportAddressTableRVA$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD BoundImportAddressTableRVA;
     * }
     */
    public static void BoundImportAddressTableRVA$set(MemorySegment seg, int x) {
        _IMAGE_DELAYLOAD_DESCRIPTOR.BoundImportAddressTableRVA$VH.set(seg, x);
    }
    public static int BoundImportAddressTableRVA$get(MemorySegment seg, long index) {
        return (int)_IMAGE_DELAYLOAD_DESCRIPTOR.BoundImportAddressTableRVA$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BoundImportAddressTableRVA$set(MemorySegment seg, long index, int x) {
        _IMAGE_DELAYLOAD_DESCRIPTOR.BoundImportAddressTableRVA$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UnloadInformationTableRVA$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UnloadInformationTableRVA"));
    public static VarHandle UnloadInformationTableRVA$VH() {
        return _IMAGE_DELAYLOAD_DESCRIPTOR.UnloadInformationTableRVA$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD UnloadInformationTableRVA;
     * }
     */
    public static int UnloadInformationTableRVA$get(MemorySegment seg) {
        return (int)_IMAGE_DELAYLOAD_DESCRIPTOR.UnloadInformationTableRVA$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD UnloadInformationTableRVA;
     * }
     */
    public static void UnloadInformationTableRVA$set(MemorySegment seg, int x) {
        _IMAGE_DELAYLOAD_DESCRIPTOR.UnloadInformationTableRVA$VH.set(seg, x);
    }
    public static int UnloadInformationTableRVA$get(MemorySegment seg, long index) {
        return (int)_IMAGE_DELAYLOAD_DESCRIPTOR.UnloadInformationTableRVA$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UnloadInformationTableRVA$set(MemorySegment seg, long index, int x) {
        _IMAGE_DELAYLOAD_DESCRIPTOR.UnloadInformationTableRVA$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TimeDateStamp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TimeDateStamp"));
    public static VarHandle TimeDateStamp$VH() {
        return _IMAGE_DELAYLOAD_DESCRIPTOR.TimeDateStamp$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TimeDateStamp;
     * }
     */
    public static int TimeDateStamp$get(MemorySegment seg) {
        return (int)_IMAGE_DELAYLOAD_DESCRIPTOR.TimeDateStamp$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TimeDateStamp;
     * }
     */
    public static void TimeDateStamp$set(MemorySegment seg, int x) {
        _IMAGE_DELAYLOAD_DESCRIPTOR.TimeDateStamp$VH.set(seg, x);
    }
    public static int TimeDateStamp$get(MemorySegment seg, long index) {
        return (int)_IMAGE_DELAYLOAD_DESCRIPTOR.TimeDateStamp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeDateStamp$set(MemorySegment seg, long index, int x) {
        _IMAGE_DELAYLOAD_DESCRIPTOR.TimeDateStamp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


