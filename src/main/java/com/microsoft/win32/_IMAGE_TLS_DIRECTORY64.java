// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_TLS_DIRECTORY64 {
 *     ULONGLONG StartAddressOfRawData;
 *     ULONGLONG EndAddressOfRawData;
 *     ULONGLONG AddressOfIndex;
 *     ULONGLONG AddressOfCallBacks;
 *     DWORD SizeOfZeroFill;
 *     union {
 *         DWORD Characteristics;
 *         struct {
 *              *             DWORD Reserved0;
 *             DWORD Alignment;
 *             DWORD Reserved1;
 *         };
 *     };
 * };
 * }
 */
public class _IMAGE_TLS_DIRECTORY64 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("StartAddressOfRawData"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("EndAddressOfRawData"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("AddressOfIndex"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("AddressOfCallBacks"),
        Constants$root.C_LONG$LAYOUT.withName("SizeOfZeroFill"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("Characteristics"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(32)
            ).withName("$anon$0")
        ).withName("$anon$0")
    ).withName("_IMAGE_TLS_DIRECTORY64");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_TLS_DIRECTORY64.$struct$LAYOUT;
    }
    static final VarHandle StartAddressOfRawData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StartAddressOfRawData"));
    public static VarHandle StartAddressOfRawData$VH() {
        return _IMAGE_TLS_DIRECTORY64.StartAddressOfRawData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG StartAddressOfRawData;
     * }
     */
    public static long StartAddressOfRawData$get(MemorySegment seg) {
        return (long)_IMAGE_TLS_DIRECTORY64.StartAddressOfRawData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG StartAddressOfRawData;
     * }
     */
    public static void StartAddressOfRawData$set(MemorySegment seg, long x) {
        _IMAGE_TLS_DIRECTORY64.StartAddressOfRawData$VH.set(seg, x);
    }
    public static long StartAddressOfRawData$get(MemorySegment seg, long index) {
        return (long)_IMAGE_TLS_DIRECTORY64.StartAddressOfRawData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StartAddressOfRawData$set(MemorySegment seg, long index, long x) {
        _IMAGE_TLS_DIRECTORY64.StartAddressOfRawData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EndAddressOfRawData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EndAddressOfRawData"));
    public static VarHandle EndAddressOfRawData$VH() {
        return _IMAGE_TLS_DIRECTORY64.EndAddressOfRawData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG EndAddressOfRawData;
     * }
     */
    public static long EndAddressOfRawData$get(MemorySegment seg) {
        return (long)_IMAGE_TLS_DIRECTORY64.EndAddressOfRawData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG EndAddressOfRawData;
     * }
     */
    public static void EndAddressOfRawData$set(MemorySegment seg, long x) {
        _IMAGE_TLS_DIRECTORY64.EndAddressOfRawData$VH.set(seg, x);
    }
    public static long EndAddressOfRawData$get(MemorySegment seg, long index) {
        return (long)_IMAGE_TLS_DIRECTORY64.EndAddressOfRawData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EndAddressOfRawData$set(MemorySegment seg, long index, long x) {
        _IMAGE_TLS_DIRECTORY64.EndAddressOfRawData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AddressOfIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddressOfIndex"));
    public static VarHandle AddressOfIndex$VH() {
        return _IMAGE_TLS_DIRECTORY64.AddressOfIndex$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG AddressOfIndex;
     * }
     */
    public static long AddressOfIndex$get(MemorySegment seg) {
        return (long)_IMAGE_TLS_DIRECTORY64.AddressOfIndex$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG AddressOfIndex;
     * }
     */
    public static void AddressOfIndex$set(MemorySegment seg, long x) {
        _IMAGE_TLS_DIRECTORY64.AddressOfIndex$VH.set(seg, x);
    }
    public static long AddressOfIndex$get(MemorySegment seg, long index) {
        return (long)_IMAGE_TLS_DIRECTORY64.AddressOfIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddressOfIndex$set(MemorySegment seg, long index, long x) {
        _IMAGE_TLS_DIRECTORY64.AddressOfIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AddressOfCallBacks$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddressOfCallBacks"));
    public static VarHandle AddressOfCallBacks$VH() {
        return _IMAGE_TLS_DIRECTORY64.AddressOfCallBacks$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG AddressOfCallBacks;
     * }
     */
    public static long AddressOfCallBacks$get(MemorySegment seg) {
        return (long)_IMAGE_TLS_DIRECTORY64.AddressOfCallBacks$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG AddressOfCallBacks;
     * }
     */
    public static void AddressOfCallBacks$set(MemorySegment seg, long x) {
        _IMAGE_TLS_DIRECTORY64.AddressOfCallBacks$VH.set(seg, x);
    }
    public static long AddressOfCallBacks$get(MemorySegment seg, long index) {
        return (long)_IMAGE_TLS_DIRECTORY64.AddressOfCallBacks$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddressOfCallBacks$set(MemorySegment seg, long index, long x) {
        _IMAGE_TLS_DIRECTORY64.AddressOfCallBacks$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfZeroFill$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfZeroFill"));
    public static VarHandle SizeOfZeroFill$VH() {
        return _IMAGE_TLS_DIRECTORY64.SizeOfZeroFill$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SizeOfZeroFill;
     * }
     */
    public static int SizeOfZeroFill$get(MemorySegment seg) {
        return (int)_IMAGE_TLS_DIRECTORY64.SizeOfZeroFill$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SizeOfZeroFill;
     * }
     */
    public static void SizeOfZeroFill$set(MemorySegment seg, int x) {
        _IMAGE_TLS_DIRECTORY64.SizeOfZeroFill$VH.set(seg, x);
    }
    public static int SizeOfZeroFill$get(MemorySegment seg, long index) {
        return (int)_IMAGE_TLS_DIRECTORY64.SizeOfZeroFill$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfZeroFill$set(MemorySegment seg, long index, int x) {
        _IMAGE_TLS_DIRECTORY64.SizeOfZeroFill$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Characteristics$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Characteristics"));
    public static VarHandle Characteristics$VH() {
        return _IMAGE_TLS_DIRECTORY64.Characteristics$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Characteristics;
     * }
     */
    public static int Characteristics$get(MemorySegment seg) {
        return (int)_IMAGE_TLS_DIRECTORY64.Characteristics$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Characteristics;
     * }
     */
    public static void Characteristics$set(MemorySegment seg, int x) {
        _IMAGE_TLS_DIRECTORY64.Characteristics$VH.set(seg, x);
    }
    public static int Characteristics$get(MemorySegment seg, long index) {
        return (int)_IMAGE_TLS_DIRECTORY64.Characteristics$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Characteristics$set(MemorySegment seg, long index, int x) {
        _IMAGE_TLS_DIRECTORY64.Characteristics$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

