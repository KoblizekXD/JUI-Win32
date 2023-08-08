// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DCB {
 *     DWORD DCBlength;
 *     DWORD BaudRate;
 *      *     DWORD fBinary;
 *     DWORD fParity;
 *     DWORD fOutxCtsFlow;
 *     DWORD fOutxDsrFlow;
 *     DWORD fDtrControl;
 *     DWORD fDsrSensitivity;
 *     DWORD fTXContinueOnXoff;
 *     DWORD fOutX;
 *     DWORD fInX;
 *     DWORD fErrorChar;
 *     DWORD fNull;
 *     DWORD fRtsControl;
 *     DWORD fAbortOnError;
 *     DWORD fDummy2;
 *     WORD wReserved;
 *     WORD XonLim;
 *     WORD XoffLim;
 *     BYTE ByteSize;
 *     BYTE Parity;
 *     BYTE StopBits;
 *     char XonChar;
 *     char XoffChar;
 *     char ErrorChar;
 *     char EofChar;
 *     char EvtChar;
 *     WORD wReserved1;
 * };
 * }
 */
public class _DCB {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("DCBlength"),
        Constants$root.C_LONG$LAYOUT.withName("BaudRate"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_SHORT$LAYOUT.withName("wReserved"),
        Constants$root.C_SHORT$LAYOUT.withName("XonLim"),
        Constants$root.C_SHORT$LAYOUT.withName("XoffLim"),
        Constants$root.C_CHAR$LAYOUT.withName("ByteSize"),
        Constants$root.C_CHAR$LAYOUT.withName("Parity"),
        Constants$root.C_CHAR$LAYOUT.withName("StopBits"),
        Constants$root.C_CHAR$LAYOUT.withName("XonChar"),
        Constants$root.C_CHAR$LAYOUT.withName("XoffChar"),
        Constants$root.C_CHAR$LAYOUT.withName("ErrorChar"),
        Constants$root.C_CHAR$LAYOUT.withName("EofChar"),
        Constants$root.C_CHAR$LAYOUT.withName("EvtChar"),
        Constants$root.C_SHORT$LAYOUT.withName("wReserved1")
    ).withName("_DCB");
    public static MemoryLayout $LAYOUT() {
        return _DCB.$struct$LAYOUT;
    }
    static final VarHandle DCBlength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DCBlength"));
    public static VarHandle DCBlength$VH() {
        return _DCB.DCBlength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DCBlength;
     * }
     */
    public static int DCBlength$get(MemorySegment seg) {
        return (int)_DCB.DCBlength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DCBlength;
     * }
     */
    public static void DCBlength$set(MemorySegment seg, int x) {
        _DCB.DCBlength$VH.set(seg, x);
    }
    public static int DCBlength$get(MemorySegment seg, long index) {
        return (int)_DCB.DCBlength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DCBlength$set(MemorySegment seg, long index, int x) {
        _DCB.DCBlength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BaudRate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BaudRate"));
    public static VarHandle BaudRate$VH() {
        return _DCB.BaudRate$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD BaudRate;
     * }
     */
    public static int BaudRate$get(MemorySegment seg) {
        return (int)_DCB.BaudRate$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD BaudRate;
     * }
     */
    public static void BaudRate$set(MemorySegment seg, int x) {
        _DCB.BaudRate$VH.set(seg, x);
    }
    public static int BaudRate$get(MemorySegment seg, long index) {
        return (int)_DCB.BaudRate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BaudRate$set(MemorySegment seg, long index, int x) {
        _DCB.BaudRate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wReserved"));
    public static VarHandle wReserved$VH() {
        return _DCB.wReserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wReserved;
     * }
     */
    public static short wReserved$get(MemorySegment seg) {
        return (short)_DCB.wReserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wReserved;
     * }
     */
    public static void wReserved$set(MemorySegment seg, short x) {
        _DCB.wReserved$VH.set(seg, x);
    }
    public static short wReserved$get(MemorySegment seg, long index) {
        return (short)_DCB.wReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved$set(MemorySegment seg, long index, short x) {
        _DCB.wReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle XonLim$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("XonLim"));
    public static VarHandle XonLim$VH() {
        return _DCB.XonLim$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD XonLim;
     * }
     */
    public static short XonLim$get(MemorySegment seg) {
        return (short)_DCB.XonLim$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD XonLim;
     * }
     */
    public static void XonLim$set(MemorySegment seg, short x) {
        _DCB.XonLim$VH.set(seg, x);
    }
    public static short XonLim$get(MemorySegment seg, long index) {
        return (short)_DCB.XonLim$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void XonLim$set(MemorySegment seg, long index, short x) {
        _DCB.XonLim$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle XoffLim$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("XoffLim"));
    public static VarHandle XoffLim$VH() {
        return _DCB.XoffLim$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD XoffLim;
     * }
     */
    public static short XoffLim$get(MemorySegment seg) {
        return (short)_DCB.XoffLim$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD XoffLim;
     * }
     */
    public static void XoffLim$set(MemorySegment seg, short x) {
        _DCB.XoffLim$VH.set(seg, x);
    }
    public static short XoffLim$get(MemorySegment seg, long index) {
        return (short)_DCB.XoffLim$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void XoffLim$set(MemorySegment seg, long index, short x) {
        _DCB.XoffLim$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ByteSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ByteSize"));
    public static VarHandle ByteSize$VH() {
        return _DCB.ByteSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE ByteSize;
     * }
     */
    public static byte ByteSize$get(MemorySegment seg) {
        return (byte)_DCB.ByteSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE ByteSize;
     * }
     */
    public static void ByteSize$set(MemorySegment seg, byte x) {
        _DCB.ByteSize$VH.set(seg, x);
    }
    public static byte ByteSize$get(MemorySegment seg, long index) {
        return (byte)_DCB.ByteSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ByteSize$set(MemorySegment seg, long index, byte x) {
        _DCB.ByteSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Parity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Parity"));
    public static VarHandle Parity$VH() {
        return _DCB.Parity$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE Parity;
     * }
     */
    public static byte Parity$get(MemorySegment seg) {
        return (byte)_DCB.Parity$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE Parity;
     * }
     */
    public static void Parity$set(MemorySegment seg, byte x) {
        _DCB.Parity$VH.set(seg, x);
    }
    public static byte Parity$get(MemorySegment seg, long index) {
        return (byte)_DCB.Parity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Parity$set(MemorySegment seg, long index, byte x) {
        _DCB.Parity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StopBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StopBits"));
    public static VarHandle StopBits$VH() {
        return _DCB.StopBits$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE StopBits;
     * }
     */
    public static byte StopBits$get(MemorySegment seg) {
        return (byte)_DCB.StopBits$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE StopBits;
     * }
     */
    public static void StopBits$set(MemorySegment seg, byte x) {
        _DCB.StopBits$VH.set(seg, x);
    }
    public static byte StopBits$get(MemorySegment seg, long index) {
        return (byte)_DCB.StopBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StopBits$set(MemorySegment seg, long index, byte x) {
        _DCB.StopBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle XonChar$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("XonChar"));
    public static VarHandle XonChar$VH() {
        return _DCB.XonChar$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char XonChar;
     * }
     */
    public static byte XonChar$get(MemorySegment seg) {
        return (byte)_DCB.XonChar$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char XonChar;
     * }
     */
    public static void XonChar$set(MemorySegment seg, byte x) {
        _DCB.XonChar$VH.set(seg, x);
    }
    public static byte XonChar$get(MemorySegment seg, long index) {
        return (byte)_DCB.XonChar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void XonChar$set(MemorySegment seg, long index, byte x) {
        _DCB.XonChar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle XoffChar$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("XoffChar"));
    public static VarHandle XoffChar$VH() {
        return _DCB.XoffChar$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char XoffChar;
     * }
     */
    public static byte XoffChar$get(MemorySegment seg) {
        return (byte)_DCB.XoffChar$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char XoffChar;
     * }
     */
    public static void XoffChar$set(MemorySegment seg, byte x) {
        _DCB.XoffChar$VH.set(seg, x);
    }
    public static byte XoffChar$get(MemorySegment seg, long index) {
        return (byte)_DCB.XoffChar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void XoffChar$set(MemorySegment seg, long index, byte x) {
        _DCB.XoffChar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ErrorChar$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ErrorChar"));
    public static VarHandle ErrorChar$VH() {
        return _DCB.ErrorChar$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char ErrorChar;
     * }
     */
    public static byte ErrorChar$get(MemorySegment seg) {
        return (byte)_DCB.ErrorChar$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char ErrorChar;
     * }
     */
    public static void ErrorChar$set(MemorySegment seg, byte x) {
        _DCB.ErrorChar$VH.set(seg, x);
    }
    public static byte ErrorChar$get(MemorySegment seg, long index) {
        return (byte)_DCB.ErrorChar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ErrorChar$set(MemorySegment seg, long index, byte x) {
        _DCB.ErrorChar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EofChar$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EofChar"));
    public static VarHandle EofChar$VH() {
        return _DCB.EofChar$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char EofChar;
     * }
     */
    public static byte EofChar$get(MemorySegment seg) {
        return (byte)_DCB.EofChar$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char EofChar;
     * }
     */
    public static void EofChar$set(MemorySegment seg, byte x) {
        _DCB.EofChar$VH.set(seg, x);
    }
    public static byte EofChar$get(MemorySegment seg, long index) {
        return (byte)_DCB.EofChar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EofChar$set(MemorySegment seg, long index, byte x) {
        _DCB.EofChar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EvtChar$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EvtChar"));
    public static VarHandle EvtChar$VH() {
        return _DCB.EvtChar$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char EvtChar;
     * }
     */
    public static byte EvtChar$get(MemorySegment seg) {
        return (byte)_DCB.EvtChar$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char EvtChar;
     * }
     */
    public static void EvtChar$set(MemorySegment seg, byte x) {
        _DCB.EvtChar$VH.set(seg, x);
    }
    public static byte EvtChar$get(MemorySegment seg, long index) {
        return (byte)_DCB.EvtChar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EvtChar$set(MemorySegment seg, long index, byte x) {
        _DCB.EvtChar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wReserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wReserved1"));
    public static VarHandle wReserved1$VH() {
        return _DCB.wReserved1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wReserved1;
     * }
     */
    public static short wReserved1$get(MemorySegment seg) {
        return (short)_DCB.wReserved1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wReserved1;
     * }
     */
    public static void wReserved1$set(MemorySegment seg, short x) {
        _DCB.wReserved1$VH.set(seg, x);
    }
    public static short wReserved1$get(MemorySegment seg, long index) {
        return (short)_DCB.wReserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved1$set(MemorySegment seg, long index, short x) {
        _DCB.wReserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


