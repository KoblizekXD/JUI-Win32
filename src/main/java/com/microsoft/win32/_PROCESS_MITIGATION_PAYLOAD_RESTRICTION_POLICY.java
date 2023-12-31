// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY {
 *     union {
 *         DWORD Flags;
 *         struct {
 *              *             DWORD EnableExportAddressFilter;
 *             DWORD AuditExportAddressFilter;
 *             DWORD EnableExportAddressFilterPlus;
 *             DWORD AuditExportAddressFilterPlus;
 *             DWORD EnableImportAddressFilter;
 *             DWORD AuditImportAddressFilter;
 *             DWORD EnableRopStackPivot;
 *             DWORD AuditRopStackPivot;
 *             DWORD EnableRopCallerCheck;
 *             DWORD AuditRopCallerCheck;
 *             DWORD EnableRopSimExec;
 *             DWORD AuditRopSimExec;
 *             DWORD ReservedFlags;
 *         };
 *     };
 * };
 * }
 */
public class _PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("Flags"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(32)
            ).withName("$anon$0")
        ).withName("$anon$0")
    ).withName("_PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY");
    public static MemoryLayout $LAYOUT() {
        return _PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY.$struct$LAYOUT;
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


