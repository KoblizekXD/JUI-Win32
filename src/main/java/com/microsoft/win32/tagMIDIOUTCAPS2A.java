// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMIDIOUTCAPS2A {
 *     WORD wMid;
 *     WORD wPid;
 *     MMVERSION vDriverVersion;
 *     CHAR szPname[32];
 *     WORD wTechnology;
 *     WORD wVoices;
 *     WORD wNotes;
 *     WORD wChannelMask;
 *     DWORD dwSupport;
 *     GUID ManufacturerGuid;
 *     GUID ProductGuid;
 *     GUID NameGuid;
 * };
 * }
 */
public class tagMIDIOUTCAPS2A {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("wMid"),
        Constants$root.C_SHORT$LAYOUT.withName("wPid"),
        Constants$root.C_LONG$LAYOUT.withName("vDriverVersion"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("szPname"),
        Constants$root.C_SHORT$LAYOUT.withName("wTechnology"),
        Constants$root.C_SHORT$LAYOUT.withName("wVoices"),
        Constants$root.C_SHORT$LAYOUT.withName("wNotes"),
        Constants$root.C_SHORT$LAYOUT.withName("wChannelMask"),
        Constants$root.C_LONG$LAYOUT.withName("dwSupport"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("ManufacturerGuid"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("ProductGuid"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("NameGuid")
    ).withName("tagMIDIOUTCAPS2A");
    public static MemoryLayout $LAYOUT() {
        return tagMIDIOUTCAPS2A.$struct$LAYOUT;
    }
    static final VarHandle wMid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMid"));
    public static VarHandle wMid$VH() {
        return tagMIDIOUTCAPS2A.wMid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wMid;
     * }
     */
    public static short wMid$get(MemorySegment seg) {
        return (short)tagMIDIOUTCAPS2A.wMid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wMid;
     * }
     */
    public static void wMid$set(MemorySegment seg, short x) {
        tagMIDIOUTCAPS2A.wMid$VH.set(seg, x);
    }
    public static short wMid$get(MemorySegment seg, long index) {
        return (short)tagMIDIOUTCAPS2A.wMid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMid$set(MemorySegment seg, long index, short x) {
        tagMIDIOUTCAPS2A.wMid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wPid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wPid"));
    public static VarHandle wPid$VH() {
        return tagMIDIOUTCAPS2A.wPid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wPid;
     * }
     */
    public static short wPid$get(MemorySegment seg) {
        return (short)tagMIDIOUTCAPS2A.wPid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wPid;
     * }
     */
    public static void wPid$set(MemorySegment seg, short x) {
        tagMIDIOUTCAPS2A.wPid$VH.set(seg, x);
    }
    public static short wPid$get(MemorySegment seg, long index) {
        return (short)tagMIDIOUTCAPS2A.wPid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPid$set(MemorySegment seg, long index, short x) {
        tagMIDIOUTCAPS2A.wPid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle vDriverVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("vDriverVersion"));
    public static VarHandle vDriverVersion$VH() {
        return tagMIDIOUTCAPS2A.vDriverVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * MMVERSION vDriverVersion;
     * }
     */
    public static int vDriverVersion$get(MemorySegment seg) {
        return (int)tagMIDIOUTCAPS2A.vDriverVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * MMVERSION vDriverVersion;
     * }
     */
    public static void vDriverVersion$set(MemorySegment seg, int x) {
        tagMIDIOUTCAPS2A.vDriverVersion$VH.set(seg, x);
    }
    public static int vDriverVersion$get(MemorySegment seg, long index) {
        return (int)tagMIDIOUTCAPS2A.vDriverVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vDriverVersion$set(MemorySegment seg, long index, int x) {
        tagMIDIOUTCAPS2A.vDriverVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szPname$slice(MemorySegment seg) {
        return seg.asSlice(8, 32);
    }
    static final VarHandle wTechnology$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wTechnology"));
    public static VarHandle wTechnology$VH() {
        return tagMIDIOUTCAPS2A.wTechnology$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wTechnology;
     * }
     */
    public static short wTechnology$get(MemorySegment seg) {
        return (short)tagMIDIOUTCAPS2A.wTechnology$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wTechnology;
     * }
     */
    public static void wTechnology$set(MemorySegment seg, short x) {
        tagMIDIOUTCAPS2A.wTechnology$VH.set(seg, x);
    }
    public static short wTechnology$get(MemorySegment seg, long index) {
        return (short)tagMIDIOUTCAPS2A.wTechnology$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wTechnology$set(MemorySegment seg, long index, short x) {
        tagMIDIOUTCAPS2A.wTechnology$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wVoices$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wVoices"));
    public static VarHandle wVoices$VH() {
        return tagMIDIOUTCAPS2A.wVoices$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wVoices;
     * }
     */
    public static short wVoices$get(MemorySegment seg) {
        return (short)tagMIDIOUTCAPS2A.wVoices$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wVoices;
     * }
     */
    public static void wVoices$set(MemorySegment seg, short x) {
        tagMIDIOUTCAPS2A.wVoices$VH.set(seg, x);
    }
    public static short wVoices$get(MemorySegment seg, long index) {
        return (short)tagMIDIOUTCAPS2A.wVoices$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wVoices$set(MemorySegment seg, long index, short x) {
        tagMIDIOUTCAPS2A.wVoices$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wNotes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wNotes"));
    public static VarHandle wNotes$VH() {
        return tagMIDIOUTCAPS2A.wNotes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wNotes;
     * }
     */
    public static short wNotes$get(MemorySegment seg) {
        return (short)tagMIDIOUTCAPS2A.wNotes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wNotes;
     * }
     */
    public static void wNotes$set(MemorySegment seg, short x) {
        tagMIDIOUTCAPS2A.wNotes$VH.set(seg, x);
    }
    public static short wNotes$get(MemorySegment seg, long index) {
        return (short)tagMIDIOUTCAPS2A.wNotes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wNotes$set(MemorySegment seg, long index, short x) {
        tagMIDIOUTCAPS2A.wNotes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wChannelMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wChannelMask"));
    public static VarHandle wChannelMask$VH() {
        return tagMIDIOUTCAPS2A.wChannelMask$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wChannelMask;
     * }
     */
    public static short wChannelMask$get(MemorySegment seg) {
        return (short)tagMIDIOUTCAPS2A.wChannelMask$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wChannelMask;
     * }
     */
    public static void wChannelMask$set(MemorySegment seg, short x) {
        tagMIDIOUTCAPS2A.wChannelMask$VH.set(seg, x);
    }
    public static short wChannelMask$get(MemorySegment seg, long index) {
        return (short)tagMIDIOUTCAPS2A.wChannelMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wChannelMask$set(MemorySegment seg, long index, short x) {
        tagMIDIOUTCAPS2A.wChannelMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSupport$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSupport"));
    public static VarHandle dwSupport$VH() {
        return tagMIDIOUTCAPS2A.dwSupport$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSupport;
     * }
     */
    public static int dwSupport$get(MemorySegment seg) {
        return (int)tagMIDIOUTCAPS2A.dwSupport$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSupport;
     * }
     */
    public static void dwSupport$set(MemorySegment seg, int x) {
        tagMIDIOUTCAPS2A.dwSupport$VH.set(seg, x);
    }
    public static int dwSupport$get(MemorySegment seg, long index) {
        return (int)tagMIDIOUTCAPS2A.dwSupport$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSupport$set(MemorySegment seg, long index, int x) {
        tagMIDIOUTCAPS2A.dwSupport$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ManufacturerGuid$slice(MemorySegment seg) {
        return seg.asSlice(52, 16);
    }
    public static MemorySegment ProductGuid$slice(MemorySegment seg) {
        return seg.asSlice(68, 16);
    }
    public static MemorySegment NameGuid$slice(MemorySegment seg) {
        return seg.asSlice(84, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


