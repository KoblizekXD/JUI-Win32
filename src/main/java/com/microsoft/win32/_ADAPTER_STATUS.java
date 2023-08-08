// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _ADAPTER_STATUS {
 *     UCHAR adapter_address[6];
 *     UCHAR rev_major;
 *     UCHAR reserved0;
 *     UCHAR adapter_type;
 *     UCHAR rev_minor;
 *     WORD duration;
 *     WORD frmr_recv;
 *     WORD frmr_xmit;
 *     WORD iframe_recv_err;
 *     WORD xmit_aborts;
 *     DWORD xmit_success;
 *     DWORD recv_success;
 *     WORD iframe_xmit_err;
 *     WORD recv_buff_unavail;
 *     WORD t1_timeouts;
 *     WORD ti_timeouts;
 *     DWORD reserved1;
 *     WORD free_ncbs;
 *     WORD max_cfg_ncbs;
 *     WORD max_ncbs;
 *     WORD xmit_buf_unavail;
 *     WORD max_dgram_size;
 *     WORD pending_sess;
 *     WORD max_cfg_sess;
 *     WORD max_sess;
 *     WORD max_sess_pkt_size;
 *     WORD name_count;
 * };
 * }
 */
public class _ADAPTER_STATUS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(6, Constants$root.C_CHAR$LAYOUT).withName("adapter_address"),
        Constants$root.C_CHAR$LAYOUT.withName("rev_major"),
        Constants$root.C_CHAR$LAYOUT.withName("reserved0"),
        Constants$root.C_CHAR$LAYOUT.withName("adapter_type"),
        Constants$root.C_CHAR$LAYOUT.withName("rev_minor"),
        Constants$root.C_SHORT$LAYOUT.withName("duration"),
        Constants$root.C_SHORT$LAYOUT.withName("frmr_recv"),
        Constants$root.C_SHORT$LAYOUT.withName("frmr_xmit"),
        Constants$root.C_SHORT$LAYOUT.withName("iframe_recv_err"),
        Constants$root.C_SHORT$LAYOUT.withName("xmit_aborts"),
        Constants$root.C_LONG$LAYOUT.withName("xmit_success"),
        Constants$root.C_LONG$LAYOUT.withName("recv_success"),
        Constants$root.C_SHORT$LAYOUT.withName("iframe_xmit_err"),
        Constants$root.C_SHORT$LAYOUT.withName("recv_buff_unavail"),
        Constants$root.C_SHORT$LAYOUT.withName("t1_timeouts"),
        Constants$root.C_SHORT$LAYOUT.withName("ti_timeouts"),
        Constants$root.C_LONG$LAYOUT.withName("reserved1"),
        Constants$root.C_SHORT$LAYOUT.withName("free_ncbs"),
        Constants$root.C_SHORT$LAYOUT.withName("max_cfg_ncbs"),
        Constants$root.C_SHORT$LAYOUT.withName("max_ncbs"),
        Constants$root.C_SHORT$LAYOUT.withName("xmit_buf_unavail"),
        Constants$root.C_SHORT$LAYOUT.withName("max_dgram_size"),
        Constants$root.C_SHORT$LAYOUT.withName("pending_sess"),
        Constants$root.C_SHORT$LAYOUT.withName("max_cfg_sess"),
        Constants$root.C_SHORT$LAYOUT.withName("max_sess"),
        Constants$root.C_SHORT$LAYOUT.withName("max_sess_pkt_size"),
        Constants$root.C_SHORT$LAYOUT.withName("name_count")
    ).withName("_ADAPTER_STATUS");
    public static MemoryLayout $LAYOUT() {
        return _ADAPTER_STATUS.$struct$LAYOUT;
    }
    public static MemorySegment adapter_address$slice(MemorySegment seg) {
        return seg.asSlice(0, 6);
    }
    static final VarHandle rev_major$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rev_major"));
    public static VarHandle rev_major$VH() {
        return _ADAPTER_STATUS.rev_major$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UCHAR rev_major;
     * }
     */
    public static byte rev_major$get(MemorySegment seg) {
        return (byte)_ADAPTER_STATUS.rev_major$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UCHAR rev_major;
     * }
     */
    public static void rev_major$set(MemorySegment seg, byte x) {
        _ADAPTER_STATUS.rev_major$VH.set(seg, x);
    }
    public static byte rev_major$get(MemorySegment seg, long index) {
        return (byte)_ADAPTER_STATUS.rev_major$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rev_major$set(MemorySegment seg, long index, byte x) {
        _ADAPTER_STATUS.rev_major$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle reserved0$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved0"));
    public static VarHandle reserved0$VH() {
        return _ADAPTER_STATUS.reserved0$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UCHAR reserved0;
     * }
     */
    public static byte reserved0$get(MemorySegment seg) {
        return (byte)_ADAPTER_STATUS.reserved0$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UCHAR reserved0;
     * }
     */
    public static void reserved0$set(MemorySegment seg, byte x) {
        _ADAPTER_STATUS.reserved0$VH.set(seg, x);
    }
    public static byte reserved0$get(MemorySegment seg, long index) {
        return (byte)_ADAPTER_STATUS.reserved0$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved0$set(MemorySegment seg, long index, byte x) {
        _ADAPTER_STATUS.reserved0$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle adapter_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("adapter_type"));
    public static VarHandle adapter_type$VH() {
        return _ADAPTER_STATUS.adapter_type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UCHAR adapter_type;
     * }
     */
    public static byte adapter_type$get(MemorySegment seg) {
        return (byte)_ADAPTER_STATUS.adapter_type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UCHAR adapter_type;
     * }
     */
    public static void adapter_type$set(MemorySegment seg, byte x) {
        _ADAPTER_STATUS.adapter_type$VH.set(seg, x);
    }
    public static byte adapter_type$get(MemorySegment seg, long index) {
        return (byte)_ADAPTER_STATUS.adapter_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void adapter_type$set(MemorySegment seg, long index, byte x) {
        _ADAPTER_STATUS.adapter_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rev_minor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rev_minor"));
    public static VarHandle rev_minor$VH() {
        return _ADAPTER_STATUS.rev_minor$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UCHAR rev_minor;
     * }
     */
    public static byte rev_minor$get(MemorySegment seg) {
        return (byte)_ADAPTER_STATUS.rev_minor$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UCHAR rev_minor;
     * }
     */
    public static void rev_minor$set(MemorySegment seg, byte x) {
        _ADAPTER_STATUS.rev_minor$VH.set(seg, x);
    }
    public static byte rev_minor$get(MemorySegment seg, long index) {
        return (byte)_ADAPTER_STATUS.rev_minor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rev_minor$set(MemorySegment seg, long index, byte x) {
        _ADAPTER_STATUS.rev_minor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle duration$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("duration"));
    public static VarHandle duration$VH() {
        return _ADAPTER_STATUS.duration$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD duration;
     * }
     */
    public static short duration$get(MemorySegment seg) {
        return (short)_ADAPTER_STATUS.duration$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD duration;
     * }
     */
    public static void duration$set(MemorySegment seg, short x) {
        _ADAPTER_STATUS.duration$VH.set(seg, x);
    }
    public static short duration$get(MemorySegment seg, long index) {
        return (short)_ADAPTER_STATUS.duration$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void duration$set(MemorySegment seg, long index, short x) {
        _ADAPTER_STATUS.duration$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle frmr_recv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("frmr_recv"));
    public static VarHandle frmr_recv$VH() {
        return _ADAPTER_STATUS.frmr_recv$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD frmr_recv;
     * }
     */
    public static short frmr_recv$get(MemorySegment seg) {
        return (short)_ADAPTER_STATUS.frmr_recv$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD frmr_recv;
     * }
     */
    public static void frmr_recv$set(MemorySegment seg, short x) {
        _ADAPTER_STATUS.frmr_recv$VH.set(seg, x);
    }
    public static short frmr_recv$get(MemorySegment seg, long index) {
        return (short)_ADAPTER_STATUS.frmr_recv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void frmr_recv$set(MemorySegment seg, long index, short x) {
        _ADAPTER_STATUS.frmr_recv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle frmr_xmit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("frmr_xmit"));
    public static VarHandle frmr_xmit$VH() {
        return _ADAPTER_STATUS.frmr_xmit$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD frmr_xmit;
     * }
     */
    public static short frmr_xmit$get(MemorySegment seg) {
        return (short)_ADAPTER_STATUS.frmr_xmit$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD frmr_xmit;
     * }
     */
    public static void frmr_xmit$set(MemorySegment seg, short x) {
        _ADAPTER_STATUS.frmr_xmit$VH.set(seg, x);
    }
    public static short frmr_xmit$get(MemorySegment seg, long index) {
        return (short)_ADAPTER_STATUS.frmr_xmit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void frmr_xmit$set(MemorySegment seg, long index, short x) {
        _ADAPTER_STATUS.frmr_xmit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iframe_recv_err$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iframe_recv_err"));
    public static VarHandle iframe_recv_err$VH() {
        return _ADAPTER_STATUS.iframe_recv_err$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD iframe_recv_err;
     * }
     */
    public static short iframe_recv_err$get(MemorySegment seg) {
        return (short)_ADAPTER_STATUS.iframe_recv_err$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD iframe_recv_err;
     * }
     */
    public static void iframe_recv_err$set(MemorySegment seg, short x) {
        _ADAPTER_STATUS.iframe_recv_err$VH.set(seg, x);
    }
    public static short iframe_recv_err$get(MemorySegment seg, long index) {
        return (short)_ADAPTER_STATUS.iframe_recv_err$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iframe_recv_err$set(MemorySegment seg, long index, short x) {
        _ADAPTER_STATUS.iframe_recv_err$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xmit_aborts$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xmit_aborts"));
    public static VarHandle xmit_aborts$VH() {
        return _ADAPTER_STATUS.xmit_aborts$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD xmit_aborts;
     * }
     */
    public static short xmit_aborts$get(MemorySegment seg) {
        return (short)_ADAPTER_STATUS.xmit_aborts$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD xmit_aborts;
     * }
     */
    public static void xmit_aborts$set(MemorySegment seg, short x) {
        _ADAPTER_STATUS.xmit_aborts$VH.set(seg, x);
    }
    public static short xmit_aborts$get(MemorySegment seg, long index) {
        return (short)_ADAPTER_STATUS.xmit_aborts$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xmit_aborts$set(MemorySegment seg, long index, short x) {
        _ADAPTER_STATUS.xmit_aborts$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xmit_success$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xmit_success"));
    public static VarHandle xmit_success$VH() {
        return _ADAPTER_STATUS.xmit_success$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD xmit_success;
     * }
     */
    public static int xmit_success$get(MemorySegment seg) {
        return (int)_ADAPTER_STATUS.xmit_success$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD xmit_success;
     * }
     */
    public static void xmit_success$set(MemorySegment seg, int x) {
        _ADAPTER_STATUS.xmit_success$VH.set(seg, x);
    }
    public static int xmit_success$get(MemorySegment seg, long index) {
        return (int)_ADAPTER_STATUS.xmit_success$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xmit_success$set(MemorySegment seg, long index, int x) {
        _ADAPTER_STATUS.xmit_success$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle recv_success$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("recv_success"));
    public static VarHandle recv_success$VH() {
        return _ADAPTER_STATUS.recv_success$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD recv_success;
     * }
     */
    public static int recv_success$get(MemorySegment seg) {
        return (int)_ADAPTER_STATUS.recv_success$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD recv_success;
     * }
     */
    public static void recv_success$set(MemorySegment seg, int x) {
        _ADAPTER_STATUS.recv_success$VH.set(seg, x);
    }
    public static int recv_success$get(MemorySegment seg, long index) {
        return (int)_ADAPTER_STATUS.recv_success$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void recv_success$set(MemorySegment seg, long index, int x) {
        _ADAPTER_STATUS.recv_success$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iframe_xmit_err$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iframe_xmit_err"));
    public static VarHandle iframe_xmit_err$VH() {
        return _ADAPTER_STATUS.iframe_xmit_err$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD iframe_xmit_err;
     * }
     */
    public static short iframe_xmit_err$get(MemorySegment seg) {
        return (short)_ADAPTER_STATUS.iframe_xmit_err$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD iframe_xmit_err;
     * }
     */
    public static void iframe_xmit_err$set(MemorySegment seg, short x) {
        _ADAPTER_STATUS.iframe_xmit_err$VH.set(seg, x);
    }
    public static short iframe_xmit_err$get(MemorySegment seg, long index) {
        return (short)_ADAPTER_STATUS.iframe_xmit_err$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iframe_xmit_err$set(MemorySegment seg, long index, short x) {
        _ADAPTER_STATUS.iframe_xmit_err$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle recv_buff_unavail$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("recv_buff_unavail"));
    public static VarHandle recv_buff_unavail$VH() {
        return _ADAPTER_STATUS.recv_buff_unavail$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD recv_buff_unavail;
     * }
     */
    public static short recv_buff_unavail$get(MemorySegment seg) {
        return (short)_ADAPTER_STATUS.recv_buff_unavail$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD recv_buff_unavail;
     * }
     */
    public static void recv_buff_unavail$set(MemorySegment seg, short x) {
        _ADAPTER_STATUS.recv_buff_unavail$VH.set(seg, x);
    }
    public static short recv_buff_unavail$get(MemorySegment seg, long index) {
        return (short)_ADAPTER_STATUS.recv_buff_unavail$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void recv_buff_unavail$set(MemorySegment seg, long index, short x) {
        _ADAPTER_STATUS.recv_buff_unavail$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle t1_timeouts$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("t1_timeouts"));
    public static VarHandle t1_timeouts$VH() {
        return _ADAPTER_STATUS.t1_timeouts$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD t1_timeouts;
     * }
     */
    public static short t1_timeouts$get(MemorySegment seg) {
        return (short)_ADAPTER_STATUS.t1_timeouts$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD t1_timeouts;
     * }
     */
    public static void t1_timeouts$set(MemorySegment seg, short x) {
        _ADAPTER_STATUS.t1_timeouts$VH.set(seg, x);
    }
    public static short t1_timeouts$get(MemorySegment seg, long index) {
        return (short)_ADAPTER_STATUS.t1_timeouts$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void t1_timeouts$set(MemorySegment seg, long index, short x) {
        _ADAPTER_STATUS.t1_timeouts$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ti_timeouts$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ti_timeouts"));
    public static VarHandle ti_timeouts$VH() {
        return _ADAPTER_STATUS.ti_timeouts$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD ti_timeouts;
     * }
     */
    public static short ti_timeouts$get(MemorySegment seg) {
        return (short)_ADAPTER_STATUS.ti_timeouts$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD ti_timeouts;
     * }
     */
    public static void ti_timeouts$set(MemorySegment seg, short x) {
        _ADAPTER_STATUS.ti_timeouts$VH.set(seg, x);
    }
    public static short ti_timeouts$get(MemorySegment seg, long index) {
        return (short)_ADAPTER_STATUS.ti_timeouts$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ti_timeouts$set(MemorySegment seg, long index, short x) {
        _ADAPTER_STATUS.ti_timeouts$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved1"));
    public static VarHandle reserved1$VH() {
        return _ADAPTER_STATUS.reserved1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD reserved1;
     * }
     */
    public static int reserved1$get(MemorySegment seg) {
        return (int)_ADAPTER_STATUS.reserved1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD reserved1;
     * }
     */
    public static void reserved1$set(MemorySegment seg, int x) {
        _ADAPTER_STATUS.reserved1$VH.set(seg, x);
    }
    public static int reserved1$get(MemorySegment seg, long index) {
        return (int)_ADAPTER_STATUS.reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved1$set(MemorySegment seg, long index, int x) {
        _ADAPTER_STATUS.reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle free_ncbs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("free_ncbs"));
    public static VarHandle free_ncbs$VH() {
        return _ADAPTER_STATUS.free_ncbs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD free_ncbs;
     * }
     */
    public static short free_ncbs$get(MemorySegment seg) {
        return (short)_ADAPTER_STATUS.free_ncbs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD free_ncbs;
     * }
     */
    public static void free_ncbs$set(MemorySegment seg, short x) {
        _ADAPTER_STATUS.free_ncbs$VH.set(seg, x);
    }
    public static short free_ncbs$get(MemorySegment seg, long index) {
        return (short)_ADAPTER_STATUS.free_ncbs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void free_ncbs$set(MemorySegment seg, long index, short x) {
        _ADAPTER_STATUS.free_ncbs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_cfg_ncbs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_cfg_ncbs"));
    public static VarHandle max_cfg_ncbs$VH() {
        return _ADAPTER_STATUS.max_cfg_ncbs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD max_cfg_ncbs;
     * }
     */
    public static short max_cfg_ncbs$get(MemorySegment seg) {
        return (short)_ADAPTER_STATUS.max_cfg_ncbs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD max_cfg_ncbs;
     * }
     */
    public static void max_cfg_ncbs$set(MemorySegment seg, short x) {
        _ADAPTER_STATUS.max_cfg_ncbs$VH.set(seg, x);
    }
    public static short max_cfg_ncbs$get(MemorySegment seg, long index) {
        return (short)_ADAPTER_STATUS.max_cfg_ncbs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_cfg_ncbs$set(MemorySegment seg, long index, short x) {
        _ADAPTER_STATUS.max_cfg_ncbs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_ncbs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_ncbs"));
    public static VarHandle max_ncbs$VH() {
        return _ADAPTER_STATUS.max_ncbs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD max_ncbs;
     * }
     */
    public static short max_ncbs$get(MemorySegment seg) {
        return (short)_ADAPTER_STATUS.max_ncbs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD max_ncbs;
     * }
     */
    public static void max_ncbs$set(MemorySegment seg, short x) {
        _ADAPTER_STATUS.max_ncbs$VH.set(seg, x);
    }
    public static short max_ncbs$get(MemorySegment seg, long index) {
        return (short)_ADAPTER_STATUS.max_ncbs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_ncbs$set(MemorySegment seg, long index, short x) {
        _ADAPTER_STATUS.max_ncbs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xmit_buf_unavail$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xmit_buf_unavail"));
    public static VarHandle xmit_buf_unavail$VH() {
        return _ADAPTER_STATUS.xmit_buf_unavail$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD xmit_buf_unavail;
     * }
     */
    public static short xmit_buf_unavail$get(MemorySegment seg) {
        return (short)_ADAPTER_STATUS.xmit_buf_unavail$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD xmit_buf_unavail;
     * }
     */
    public static void xmit_buf_unavail$set(MemorySegment seg, short x) {
        _ADAPTER_STATUS.xmit_buf_unavail$VH.set(seg, x);
    }
    public static short xmit_buf_unavail$get(MemorySegment seg, long index) {
        return (short)_ADAPTER_STATUS.xmit_buf_unavail$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xmit_buf_unavail$set(MemorySegment seg, long index, short x) {
        _ADAPTER_STATUS.xmit_buf_unavail$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_dgram_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_dgram_size"));
    public static VarHandle max_dgram_size$VH() {
        return _ADAPTER_STATUS.max_dgram_size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD max_dgram_size;
     * }
     */
    public static short max_dgram_size$get(MemorySegment seg) {
        return (short)_ADAPTER_STATUS.max_dgram_size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD max_dgram_size;
     * }
     */
    public static void max_dgram_size$set(MemorySegment seg, short x) {
        _ADAPTER_STATUS.max_dgram_size$VH.set(seg, x);
    }
    public static short max_dgram_size$get(MemorySegment seg, long index) {
        return (short)_ADAPTER_STATUS.max_dgram_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_dgram_size$set(MemorySegment seg, long index, short x) {
        _ADAPTER_STATUS.max_dgram_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pending_sess$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pending_sess"));
    public static VarHandle pending_sess$VH() {
        return _ADAPTER_STATUS.pending_sess$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD pending_sess;
     * }
     */
    public static short pending_sess$get(MemorySegment seg) {
        return (short)_ADAPTER_STATUS.pending_sess$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD pending_sess;
     * }
     */
    public static void pending_sess$set(MemorySegment seg, short x) {
        _ADAPTER_STATUS.pending_sess$VH.set(seg, x);
    }
    public static short pending_sess$get(MemorySegment seg, long index) {
        return (short)_ADAPTER_STATUS.pending_sess$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pending_sess$set(MemorySegment seg, long index, short x) {
        _ADAPTER_STATUS.pending_sess$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_cfg_sess$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_cfg_sess"));
    public static VarHandle max_cfg_sess$VH() {
        return _ADAPTER_STATUS.max_cfg_sess$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD max_cfg_sess;
     * }
     */
    public static short max_cfg_sess$get(MemorySegment seg) {
        return (short)_ADAPTER_STATUS.max_cfg_sess$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD max_cfg_sess;
     * }
     */
    public static void max_cfg_sess$set(MemorySegment seg, short x) {
        _ADAPTER_STATUS.max_cfg_sess$VH.set(seg, x);
    }
    public static short max_cfg_sess$get(MemorySegment seg, long index) {
        return (short)_ADAPTER_STATUS.max_cfg_sess$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_cfg_sess$set(MemorySegment seg, long index, short x) {
        _ADAPTER_STATUS.max_cfg_sess$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_sess$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_sess"));
    public static VarHandle max_sess$VH() {
        return _ADAPTER_STATUS.max_sess$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD max_sess;
     * }
     */
    public static short max_sess$get(MemorySegment seg) {
        return (short)_ADAPTER_STATUS.max_sess$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD max_sess;
     * }
     */
    public static void max_sess$set(MemorySegment seg, short x) {
        _ADAPTER_STATUS.max_sess$VH.set(seg, x);
    }
    public static short max_sess$get(MemorySegment seg, long index) {
        return (short)_ADAPTER_STATUS.max_sess$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_sess$set(MemorySegment seg, long index, short x) {
        _ADAPTER_STATUS.max_sess$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_sess_pkt_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_sess_pkt_size"));
    public static VarHandle max_sess_pkt_size$VH() {
        return _ADAPTER_STATUS.max_sess_pkt_size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD max_sess_pkt_size;
     * }
     */
    public static short max_sess_pkt_size$get(MemorySegment seg) {
        return (short)_ADAPTER_STATUS.max_sess_pkt_size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD max_sess_pkt_size;
     * }
     */
    public static void max_sess_pkt_size$set(MemorySegment seg, short x) {
        _ADAPTER_STATUS.max_sess_pkt_size$VH.set(seg, x);
    }
    public static short max_sess_pkt_size$get(MemorySegment seg, long index) {
        return (short)_ADAPTER_STATUS.max_sess_pkt_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_sess_pkt_size$set(MemorySegment seg, long index, short x) {
        _ADAPTER_STATUS.max_sess_pkt_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle name_count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("name_count"));
    public static VarHandle name_count$VH() {
        return _ADAPTER_STATUS.name_count$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD name_count;
     * }
     */
    public static short name_count$get(MemorySegment seg) {
        return (short)_ADAPTER_STATUS.name_count$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD name_count;
     * }
     */
    public static void name_count$set(MemorySegment seg, short x) {
        _ADAPTER_STATUS.name_count$VH.set(seg, x);
    }
    public static short name_count$get(MemorySegment seg, long index) {
        return (short)_ADAPTER_STATUS.name_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void name_count$set(MemorySegment seg, long index, short x) {
        _ADAPTER_STATUS.name_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


