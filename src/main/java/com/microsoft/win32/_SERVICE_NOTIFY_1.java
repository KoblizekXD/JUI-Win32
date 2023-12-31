// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SERVICE_NOTIFY_1 {
 *     DWORD dwVersion;
 *     PFN_SC_NOTIFY_CALLBACK pfnNotifyCallback;
 *     PVOID pContext;
 *     DWORD dwNotificationStatus;
 *     SERVICE_STATUS_PROCESS ServiceStatus;
 * };
 * }
 */
public class _SERVICE_NOTIFY_1 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwVersion"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pfnNotifyCallback"),
        Constants$root.C_POINTER$LAYOUT.withName("pContext"),
        Constants$root.C_LONG$LAYOUT.withName("dwNotificationStatus"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwServiceType"),
            Constants$root.C_LONG$LAYOUT.withName("dwCurrentState"),
            Constants$root.C_LONG$LAYOUT.withName("dwControlsAccepted"),
            Constants$root.C_LONG$LAYOUT.withName("dwWin32ExitCode"),
            Constants$root.C_LONG$LAYOUT.withName("dwServiceSpecificExitCode"),
            Constants$root.C_LONG$LAYOUT.withName("dwCheckPoint"),
            Constants$root.C_LONG$LAYOUT.withName("dwWaitHint"),
            Constants$root.C_LONG$LAYOUT.withName("dwProcessId"),
            Constants$root.C_LONG$LAYOUT.withName("dwServiceFlags")
        ).withName("ServiceStatus")
    ).withName("_SERVICE_NOTIFY_1");
    public static MemoryLayout $LAYOUT() {
        return _SERVICE_NOTIFY_1.$struct$LAYOUT;
    }
    static final VarHandle dwVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    public static VarHandle dwVersion$VH() {
        return _SERVICE_NOTIFY_1.dwVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwVersion;
     * }
     */
    public static int dwVersion$get(MemorySegment seg) {
        return (int)_SERVICE_NOTIFY_1.dwVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwVersion;
     * }
     */
    public static void dwVersion$set(MemorySegment seg, int x) {
        _SERVICE_NOTIFY_1.dwVersion$VH.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)_SERVICE_NOTIFY_1.dwVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        _SERVICE_NOTIFY_1.dwVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfnNotifyCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnNotifyCallback"));
    public static VarHandle pfnNotifyCallback$VH() {
        return _SERVICE_NOTIFY_1.pfnNotifyCallback$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PFN_SC_NOTIFY_CALLBACK pfnNotifyCallback;
     * }
     */
    public static MemorySegment pfnNotifyCallback$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SERVICE_NOTIFY_1.pfnNotifyCallback$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PFN_SC_NOTIFY_CALLBACK pfnNotifyCallback;
     * }
     */
    public static void pfnNotifyCallback$set(MemorySegment seg, MemorySegment x) {
        _SERVICE_NOTIFY_1.pfnNotifyCallback$VH.set(seg, x);
    }
    public static MemorySegment pfnNotifyCallback$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SERVICE_NOTIFY_1.pfnNotifyCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnNotifyCallback$set(MemorySegment seg, long index, MemorySegment x) {
        _SERVICE_NOTIFY_1.pfnNotifyCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_SC_NOTIFY_CALLBACK pfnNotifyCallback(MemorySegment segment, SegmentScope scope) {
        return PFN_SC_NOTIFY_CALLBACK.ofAddress(pfnNotifyCallback$get(segment), scope);
    }
    static final VarHandle pContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pContext"));
    public static VarHandle pContext$VH() {
        return _SERVICE_NOTIFY_1.pContext$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID pContext;
     * }
     */
    public static MemorySegment pContext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SERVICE_NOTIFY_1.pContext$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID pContext;
     * }
     */
    public static void pContext$set(MemorySegment seg, MemorySegment x) {
        _SERVICE_NOTIFY_1.pContext$VH.set(seg, x);
    }
    public static MemorySegment pContext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SERVICE_NOTIFY_1.pContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pContext$set(MemorySegment seg, long index, MemorySegment x) {
        _SERVICE_NOTIFY_1.pContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNotificationStatus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNotificationStatus"));
    public static VarHandle dwNotificationStatus$VH() {
        return _SERVICE_NOTIFY_1.dwNotificationStatus$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwNotificationStatus;
     * }
     */
    public static int dwNotificationStatus$get(MemorySegment seg) {
        return (int)_SERVICE_NOTIFY_1.dwNotificationStatus$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwNotificationStatus;
     * }
     */
    public static void dwNotificationStatus$set(MemorySegment seg, int x) {
        _SERVICE_NOTIFY_1.dwNotificationStatus$VH.set(seg, x);
    }
    public static int dwNotificationStatus$get(MemorySegment seg, long index) {
        return (int)_SERVICE_NOTIFY_1.dwNotificationStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNotificationStatus$set(MemorySegment seg, long index, int x) {
        _SERVICE_NOTIFY_1.dwNotificationStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ServiceStatus$slice(MemorySegment seg) {
        return seg.asSlice(28, 36);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


