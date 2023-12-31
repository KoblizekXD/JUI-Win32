// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SCRUB_DATA_OUTPUT {
 *     DWORD Size;
 *     DWORD Flags;
 *     DWORD Status;
 *     ULONGLONG ErrorFileOffset;
 *     ULONGLONG ErrorLength;
 *     ULONGLONG NumberOfBytesRepaired;
 *     ULONGLONG NumberOfBytesFailed;
 *     ULONGLONG InternalFileReference;
 *     WORD ResumeContextLength;
 *     WORD ParityExtentDataOffset;
 *     DWORD Reserved[9];
 *     ULONGLONG NumberOfMetadataBytesProcessed;
 *     ULONGLONG NumberOfDataBytesProcessed;
 *     ULONGLONG TotalNumberOfMetadataBytesInUse;
 *     ULONGLONG TotalNumberOfDataBytesInUse;
 *     ULONGLONG DataBytesSkippedDueToNoAllocation;
 *     ULONGLONG DataBytesSkippedDueToInvalidRun;
 *     ULONGLONG DataBytesSkippedDueToIntegrityStream;
 *     ULONGLONG DataBytesSkippedDueToRegionBeingClean;
 *     ULONGLONG DataBytesSkippedDueToLockConflict;
 *     ULONGLONG DataBytesSkippedDueToNoScrubDataFlag;
 *     ULONGLONG DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag;
 *     ULONGLONG DataBytesScrubbed;
 *     BYTE ResumeContext[1040];
 * };
 * }
 */
public class _SCRUB_DATA_OUTPUT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("Status"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ErrorFileOffset"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ErrorLength"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("NumberOfBytesRepaired"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("NumberOfBytesFailed"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("InternalFileReference"),
        Constants$root.C_SHORT$LAYOUT.withName("ResumeContextLength"),
        Constants$root.C_SHORT$LAYOUT.withName("ParityExtentDataOffset"),
        MemoryLayout.sequenceLayout(9, Constants$root.C_LONG$LAYOUT).withName("Reserved"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("NumberOfMetadataBytesProcessed"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("NumberOfDataBytesProcessed"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TotalNumberOfMetadataBytesInUse"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TotalNumberOfDataBytesInUse"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("DataBytesSkippedDueToNoAllocation"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("DataBytesSkippedDueToInvalidRun"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("DataBytesSkippedDueToIntegrityStream"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("DataBytesSkippedDueToRegionBeingClean"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("DataBytesSkippedDueToLockConflict"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("DataBytesSkippedDueToNoScrubDataFlag"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("DataBytesScrubbed"),
        MemoryLayout.sequenceLayout(1040, Constants$root.C_CHAR$LAYOUT).withName("ResumeContext")
    ).withName("_SCRUB_DATA_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _SCRUB_DATA_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _SCRUB_DATA_OUTPUT.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_SCRUB_DATA_OUTPUT.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _SCRUB_DATA_OUTPUT.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_SCRUB_DATA_OUTPUT.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _SCRUB_DATA_OUTPUT.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _SCRUB_DATA_OUTPUT.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_SCRUB_DATA_OUTPUT.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _SCRUB_DATA_OUTPUT.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_SCRUB_DATA_OUTPUT.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _SCRUB_DATA_OUTPUT.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Status$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Status"));
    public static VarHandle Status$VH() {
        return _SCRUB_DATA_OUTPUT.Status$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Status;
     * }
     */
    public static int Status$get(MemorySegment seg) {
        return (int)_SCRUB_DATA_OUTPUT.Status$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Status;
     * }
     */
    public static void Status$set(MemorySegment seg, int x) {
        _SCRUB_DATA_OUTPUT.Status$VH.set(seg, x);
    }
    public static int Status$get(MemorySegment seg, long index) {
        return (int)_SCRUB_DATA_OUTPUT.Status$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Status$set(MemorySegment seg, long index, int x) {
        _SCRUB_DATA_OUTPUT.Status$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ErrorFileOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ErrorFileOffset"));
    public static VarHandle ErrorFileOffset$VH() {
        return _SCRUB_DATA_OUTPUT.ErrorFileOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG ErrorFileOffset;
     * }
     */
    public static long ErrorFileOffset$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.ErrorFileOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG ErrorFileOffset;
     * }
     */
    public static void ErrorFileOffset$set(MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.ErrorFileOffset$VH.set(seg, x);
    }
    public static long ErrorFileOffset$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.ErrorFileOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ErrorFileOffset$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.ErrorFileOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ErrorLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ErrorLength"));
    public static VarHandle ErrorLength$VH() {
        return _SCRUB_DATA_OUTPUT.ErrorLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG ErrorLength;
     * }
     */
    public static long ErrorLength$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.ErrorLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG ErrorLength;
     * }
     */
    public static void ErrorLength$set(MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.ErrorLength$VH.set(seg, x);
    }
    public static long ErrorLength$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.ErrorLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ErrorLength$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.ErrorLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfBytesRepaired$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfBytesRepaired"));
    public static VarHandle NumberOfBytesRepaired$VH() {
        return _SCRUB_DATA_OUTPUT.NumberOfBytesRepaired$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG NumberOfBytesRepaired;
     * }
     */
    public static long NumberOfBytesRepaired$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.NumberOfBytesRepaired$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG NumberOfBytesRepaired;
     * }
     */
    public static void NumberOfBytesRepaired$set(MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.NumberOfBytesRepaired$VH.set(seg, x);
    }
    public static long NumberOfBytesRepaired$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.NumberOfBytesRepaired$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfBytesRepaired$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.NumberOfBytesRepaired$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfBytesFailed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfBytesFailed"));
    public static VarHandle NumberOfBytesFailed$VH() {
        return _SCRUB_DATA_OUTPUT.NumberOfBytesFailed$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG NumberOfBytesFailed;
     * }
     */
    public static long NumberOfBytesFailed$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.NumberOfBytesFailed$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG NumberOfBytesFailed;
     * }
     */
    public static void NumberOfBytesFailed$set(MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.NumberOfBytesFailed$VH.set(seg, x);
    }
    public static long NumberOfBytesFailed$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.NumberOfBytesFailed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfBytesFailed$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.NumberOfBytesFailed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle InternalFileReference$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("InternalFileReference"));
    public static VarHandle InternalFileReference$VH() {
        return _SCRUB_DATA_OUTPUT.InternalFileReference$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG InternalFileReference;
     * }
     */
    public static long InternalFileReference$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.InternalFileReference$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG InternalFileReference;
     * }
     */
    public static void InternalFileReference$set(MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.InternalFileReference$VH.set(seg, x);
    }
    public static long InternalFileReference$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.InternalFileReference$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void InternalFileReference$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.InternalFileReference$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ResumeContextLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ResumeContextLength"));
    public static VarHandle ResumeContextLength$VH() {
        return _SCRUB_DATA_OUTPUT.ResumeContextLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD ResumeContextLength;
     * }
     */
    public static short ResumeContextLength$get(MemorySegment seg) {
        return (short)_SCRUB_DATA_OUTPUT.ResumeContextLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD ResumeContextLength;
     * }
     */
    public static void ResumeContextLength$set(MemorySegment seg, short x) {
        _SCRUB_DATA_OUTPUT.ResumeContextLength$VH.set(seg, x);
    }
    public static short ResumeContextLength$get(MemorySegment seg, long index) {
        return (short)_SCRUB_DATA_OUTPUT.ResumeContextLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ResumeContextLength$set(MemorySegment seg, long index, short x) {
        _SCRUB_DATA_OUTPUT.ResumeContextLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ParityExtentDataOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ParityExtentDataOffset"));
    public static VarHandle ParityExtentDataOffset$VH() {
        return _SCRUB_DATA_OUTPUT.ParityExtentDataOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD ParityExtentDataOffset;
     * }
     */
    public static short ParityExtentDataOffset$get(MemorySegment seg) {
        return (short)_SCRUB_DATA_OUTPUT.ParityExtentDataOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD ParityExtentDataOffset;
     * }
     */
    public static void ParityExtentDataOffset$set(MemorySegment seg, short x) {
        _SCRUB_DATA_OUTPUT.ParityExtentDataOffset$VH.set(seg, x);
    }
    public static short ParityExtentDataOffset$get(MemorySegment seg, long index) {
        return (short)_SCRUB_DATA_OUTPUT.ParityExtentDataOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ParityExtentDataOffset$set(MemorySegment seg, long index, short x) {
        _SCRUB_DATA_OUTPUT.ParityExtentDataOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(60, 36);
    }
    static final VarHandle NumberOfMetadataBytesProcessed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfMetadataBytesProcessed"));
    public static VarHandle NumberOfMetadataBytesProcessed$VH() {
        return _SCRUB_DATA_OUTPUT.NumberOfMetadataBytesProcessed$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG NumberOfMetadataBytesProcessed;
     * }
     */
    public static long NumberOfMetadataBytesProcessed$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.NumberOfMetadataBytesProcessed$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG NumberOfMetadataBytesProcessed;
     * }
     */
    public static void NumberOfMetadataBytesProcessed$set(MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.NumberOfMetadataBytesProcessed$VH.set(seg, x);
    }
    public static long NumberOfMetadataBytesProcessed$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.NumberOfMetadataBytesProcessed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfMetadataBytesProcessed$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.NumberOfMetadataBytesProcessed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfDataBytesProcessed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfDataBytesProcessed"));
    public static VarHandle NumberOfDataBytesProcessed$VH() {
        return _SCRUB_DATA_OUTPUT.NumberOfDataBytesProcessed$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG NumberOfDataBytesProcessed;
     * }
     */
    public static long NumberOfDataBytesProcessed$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.NumberOfDataBytesProcessed$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG NumberOfDataBytesProcessed;
     * }
     */
    public static void NumberOfDataBytesProcessed$set(MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.NumberOfDataBytesProcessed$VH.set(seg, x);
    }
    public static long NumberOfDataBytesProcessed$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.NumberOfDataBytesProcessed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfDataBytesProcessed$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.NumberOfDataBytesProcessed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalNumberOfMetadataBytesInUse$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalNumberOfMetadataBytesInUse"));
    public static VarHandle TotalNumberOfMetadataBytesInUse$VH() {
        return _SCRUB_DATA_OUTPUT.TotalNumberOfMetadataBytesInUse$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG TotalNumberOfMetadataBytesInUse;
     * }
     */
    public static long TotalNumberOfMetadataBytesInUse$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.TotalNumberOfMetadataBytesInUse$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG TotalNumberOfMetadataBytesInUse;
     * }
     */
    public static void TotalNumberOfMetadataBytesInUse$set(MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.TotalNumberOfMetadataBytesInUse$VH.set(seg, x);
    }
    public static long TotalNumberOfMetadataBytesInUse$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.TotalNumberOfMetadataBytesInUse$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalNumberOfMetadataBytesInUse$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.TotalNumberOfMetadataBytesInUse$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalNumberOfDataBytesInUse$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalNumberOfDataBytesInUse"));
    public static VarHandle TotalNumberOfDataBytesInUse$VH() {
        return _SCRUB_DATA_OUTPUT.TotalNumberOfDataBytesInUse$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG TotalNumberOfDataBytesInUse;
     * }
     */
    public static long TotalNumberOfDataBytesInUse$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.TotalNumberOfDataBytesInUse$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG TotalNumberOfDataBytesInUse;
     * }
     */
    public static void TotalNumberOfDataBytesInUse$set(MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.TotalNumberOfDataBytesInUse$VH.set(seg, x);
    }
    public static long TotalNumberOfDataBytesInUse$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.TotalNumberOfDataBytesInUse$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalNumberOfDataBytesInUse$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.TotalNumberOfDataBytesInUse$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataBytesSkippedDueToNoAllocation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataBytesSkippedDueToNoAllocation"));
    public static VarHandle DataBytesSkippedDueToNoAllocation$VH() {
        return _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToNoAllocation$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToNoAllocation;
     * }
     */
    public static long DataBytesSkippedDueToNoAllocation$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.DataBytesSkippedDueToNoAllocation$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToNoAllocation;
     * }
     */
    public static void DataBytesSkippedDueToNoAllocation$set(MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToNoAllocation$VH.set(seg, x);
    }
    public static long DataBytesSkippedDueToNoAllocation$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.DataBytesSkippedDueToNoAllocation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataBytesSkippedDueToNoAllocation$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToNoAllocation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataBytesSkippedDueToInvalidRun$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataBytesSkippedDueToInvalidRun"));
    public static VarHandle DataBytesSkippedDueToInvalidRun$VH() {
        return _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToInvalidRun$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToInvalidRun;
     * }
     */
    public static long DataBytesSkippedDueToInvalidRun$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.DataBytesSkippedDueToInvalidRun$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToInvalidRun;
     * }
     */
    public static void DataBytesSkippedDueToInvalidRun$set(MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToInvalidRun$VH.set(seg, x);
    }
    public static long DataBytesSkippedDueToInvalidRun$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.DataBytesSkippedDueToInvalidRun$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataBytesSkippedDueToInvalidRun$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToInvalidRun$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataBytesSkippedDueToIntegrityStream$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataBytesSkippedDueToIntegrityStream"));
    public static VarHandle DataBytesSkippedDueToIntegrityStream$VH() {
        return _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToIntegrityStream$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToIntegrityStream;
     * }
     */
    public static long DataBytesSkippedDueToIntegrityStream$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.DataBytesSkippedDueToIntegrityStream$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToIntegrityStream;
     * }
     */
    public static void DataBytesSkippedDueToIntegrityStream$set(MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToIntegrityStream$VH.set(seg, x);
    }
    public static long DataBytesSkippedDueToIntegrityStream$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.DataBytesSkippedDueToIntegrityStream$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataBytesSkippedDueToIntegrityStream$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToIntegrityStream$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataBytesSkippedDueToRegionBeingClean$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataBytesSkippedDueToRegionBeingClean"));
    public static VarHandle DataBytesSkippedDueToRegionBeingClean$VH() {
        return _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToRegionBeingClean$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToRegionBeingClean;
     * }
     */
    public static long DataBytesSkippedDueToRegionBeingClean$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.DataBytesSkippedDueToRegionBeingClean$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToRegionBeingClean;
     * }
     */
    public static void DataBytesSkippedDueToRegionBeingClean$set(MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToRegionBeingClean$VH.set(seg, x);
    }
    public static long DataBytesSkippedDueToRegionBeingClean$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.DataBytesSkippedDueToRegionBeingClean$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataBytesSkippedDueToRegionBeingClean$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToRegionBeingClean$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataBytesSkippedDueToLockConflict$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataBytesSkippedDueToLockConflict"));
    public static VarHandle DataBytesSkippedDueToLockConflict$VH() {
        return _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToLockConflict$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToLockConflict;
     * }
     */
    public static long DataBytesSkippedDueToLockConflict$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.DataBytesSkippedDueToLockConflict$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToLockConflict;
     * }
     */
    public static void DataBytesSkippedDueToLockConflict$set(MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToLockConflict$VH.set(seg, x);
    }
    public static long DataBytesSkippedDueToLockConflict$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.DataBytesSkippedDueToLockConflict$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataBytesSkippedDueToLockConflict$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToLockConflict$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataBytesSkippedDueToNoScrubDataFlag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataBytesSkippedDueToNoScrubDataFlag"));
    public static VarHandle DataBytesSkippedDueToNoScrubDataFlag$VH() {
        return _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToNoScrubDataFlag$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToNoScrubDataFlag;
     * }
     */
    public static long DataBytesSkippedDueToNoScrubDataFlag$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.DataBytesSkippedDueToNoScrubDataFlag$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToNoScrubDataFlag;
     * }
     */
    public static void DataBytesSkippedDueToNoScrubDataFlag$set(MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToNoScrubDataFlag$VH.set(seg, x);
    }
    public static long DataBytesSkippedDueToNoScrubDataFlag$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.DataBytesSkippedDueToNoScrubDataFlag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataBytesSkippedDueToNoScrubDataFlag$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToNoScrubDataFlag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag"));
    public static VarHandle DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag$VH() {
        return _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag;
     * }
     */
    public static long DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag;
     * }
     */
    public static void DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag$set(MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag$VH.set(seg, x);
    }
    public static long DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataBytesScrubbed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataBytesScrubbed"));
    public static VarHandle DataBytesScrubbed$VH() {
        return _SCRUB_DATA_OUTPUT.DataBytesScrubbed$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG DataBytesScrubbed;
     * }
     */
    public static long DataBytesScrubbed$get(MemorySegment seg) {
        return (long)_SCRUB_DATA_OUTPUT.DataBytesScrubbed$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG DataBytesScrubbed;
     * }
     */
    public static void DataBytesScrubbed$set(MemorySegment seg, long x) {
        _SCRUB_DATA_OUTPUT.DataBytesScrubbed$VH.set(seg, x);
    }
    public static long DataBytesScrubbed$get(MemorySegment seg, long index) {
        return (long)_SCRUB_DATA_OUTPUT.DataBytesScrubbed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataBytesScrubbed$set(MemorySegment seg, long index, long x) {
        _SCRUB_DATA_OUTPUT.DataBytesScrubbed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ResumeContext$slice(MemorySegment seg) {
        return seg.asSlice(192, 1040);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


