// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CSV_QUERY_VOLUME_REDIRECT_STATE {
 *     DWORD MdsNodeId;
 *     DWORD DsNodeId;
 *     BOOLEAN IsDiskConnected;
 *     BOOLEAN ClusterEnableDirectIo;
 *     CSVFS_DISK_CONNECTIVITY DiskConnectivity;
 * };
 * }
 */
public class _CSV_QUERY_VOLUME_REDIRECT_STATE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("MdsNodeId"),
        Constants$root.C_LONG$LAYOUT.withName("DsNodeId"),
        Constants$root.C_CHAR$LAYOUT.withName("IsDiskConnected"),
        Constants$root.C_CHAR$LAYOUT.withName("ClusterEnableDirectIo"),
        MemoryLayout.paddingLayout(16),
        Constants$root.C_LONG$LAYOUT.withName("DiskConnectivity")
    ).withName("_CSV_QUERY_VOLUME_REDIRECT_STATE");
    public static MemoryLayout $LAYOUT() {
        return _CSV_QUERY_VOLUME_REDIRECT_STATE.$struct$LAYOUT;
    }
    static final VarHandle MdsNodeId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MdsNodeId"));
    public static VarHandle MdsNodeId$VH() {
        return _CSV_QUERY_VOLUME_REDIRECT_STATE.MdsNodeId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MdsNodeId;
     * }
     */
    public static int MdsNodeId$get(MemorySegment seg) {
        return (int)_CSV_QUERY_VOLUME_REDIRECT_STATE.MdsNodeId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MdsNodeId;
     * }
     */
    public static void MdsNodeId$set(MemorySegment seg, int x) {
        _CSV_QUERY_VOLUME_REDIRECT_STATE.MdsNodeId$VH.set(seg, x);
    }
    public static int MdsNodeId$get(MemorySegment seg, long index) {
        return (int)_CSV_QUERY_VOLUME_REDIRECT_STATE.MdsNodeId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MdsNodeId$set(MemorySegment seg, long index, int x) {
        _CSV_QUERY_VOLUME_REDIRECT_STATE.MdsNodeId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DsNodeId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DsNodeId"));
    public static VarHandle DsNodeId$VH() {
        return _CSV_QUERY_VOLUME_REDIRECT_STATE.DsNodeId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DsNodeId;
     * }
     */
    public static int DsNodeId$get(MemorySegment seg) {
        return (int)_CSV_QUERY_VOLUME_REDIRECT_STATE.DsNodeId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DsNodeId;
     * }
     */
    public static void DsNodeId$set(MemorySegment seg, int x) {
        _CSV_QUERY_VOLUME_REDIRECT_STATE.DsNodeId$VH.set(seg, x);
    }
    public static int DsNodeId$get(MemorySegment seg, long index) {
        return (int)_CSV_QUERY_VOLUME_REDIRECT_STATE.DsNodeId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DsNodeId$set(MemorySegment seg, long index, int x) {
        _CSV_QUERY_VOLUME_REDIRECT_STATE.DsNodeId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IsDiskConnected$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsDiskConnected"));
    public static VarHandle IsDiskConnected$VH() {
        return _CSV_QUERY_VOLUME_REDIRECT_STATE.IsDiskConnected$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN IsDiskConnected;
     * }
     */
    public static byte IsDiskConnected$get(MemorySegment seg) {
        return (byte)_CSV_QUERY_VOLUME_REDIRECT_STATE.IsDiskConnected$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN IsDiskConnected;
     * }
     */
    public static void IsDiskConnected$set(MemorySegment seg, byte x) {
        _CSV_QUERY_VOLUME_REDIRECT_STATE.IsDiskConnected$VH.set(seg, x);
    }
    public static byte IsDiskConnected$get(MemorySegment seg, long index) {
        return (byte)_CSV_QUERY_VOLUME_REDIRECT_STATE.IsDiskConnected$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsDiskConnected$set(MemorySegment seg, long index, byte x) {
        _CSV_QUERY_VOLUME_REDIRECT_STATE.IsDiskConnected$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ClusterEnableDirectIo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ClusterEnableDirectIo"));
    public static VarHandle ClusterEnableDirectIo$VH() {
        return _CSV_QUERY_VOLUME_REDIRECT_STATE.ClusterEnableDirectIo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN ClusterEnableDirectIo;
     * }
     */
    public static byte ClusterEnableDirectIo$get(MemorySegment seg) {
        return (byte)_CSV_QUERY_VOLUME_REDIRECT_STATE.ClusterEnableDirectIo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN ClusterEnableDirectIo;
     * }
     */
    public static void ClusterEnableDirectIo$set(MemorySegment seg, byte x) {
        _CSV_QUERY_VOLUME_REDIRECT_STATE.ClusterEnableDirectIo$VH.set(seg, x);
    }
    public static byte ClusterEnableDirectIo$get(MemorySegment seg, long index) {
        return (byte)_CSV_QUERY_VOLUME_REDIRECT_STATE.ClusterEnableDirectIo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ClusterEnableDirectIo$set(MemorySegment seg, long index, byte x) {
        _CSV_QUERY_VOLUME_REDIRECT_STATE.ClusterEnableDirectIo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DiskConnectivity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DiskConnectivity"));
    public static VarHandle DiskConnectivity$VH() {
        return _CSV_QUERY_VOLUME_REDIRECT_STATE.DiskConnectivity$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * CSVFS_DISK_CONNECTIVITY DiskConnectivity;
     * }
     */
    public static int DiskConnectivity$get(MemorySegment seg) {
        return (int)_CSV_QUERY_VOLUME_REDIRECT_STATE.DiskConnectivity$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * CSVFS_DISK_CONNECTIVITY DiskConnectivity;
     * }
     */
    public static void DiskConnectivity$set(MemorySegment seg, int x) {
        _CSV_QUERY_VOLUME_REDIRECT_STATE.DiskConnectivity$VH.set(seg, x);
    }
    public static int DiskConnectivity$get(MemorySegment seg, long index) {
        return (int)_CSV_QUERY_VOLUME_REDIRECT_STATE.DiskConnectivity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DiskConnectivity$set(MemorySegment seg, long index, int x) {
        _CSV_QUERY_VOLUME_REDIRECT_STATE.DiskConnectivity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


