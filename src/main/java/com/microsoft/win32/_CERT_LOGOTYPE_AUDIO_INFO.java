// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_LOGOTYPE_AUDIO_INFO {
 *     DWORD dwFileSize;
 *     DWORD dwPlayTime;
 *     DWORD dwChannels;
 *     DWORD dwSampleRate;
 *     LPWSTR pwszLanguage;
 * };
 * }
 */
public class _CERT_LOGOTYPE_AUDIO_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwFileSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwPlayTime"),
        Constants$root.C_LONG$LAYOUT.withName("dwChannels"),
        Constants$root.C_LONG$LAYOUT.withName("dwSampleRate"),
        Constants$root.C_POINTER$LAYOUT.withName("pwszLanguage")
    ).withName("_CERT_LOGOTYPE_AUDIO_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_LOGOTYPE_AUDIO_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwFileSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFileSize"));
    public static VarHandle dwFileSize$VH() {
        return _CERT_LOGOTYPE_AUDIO_INFO.dwFileSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFileSize;
     * }
     */
    public static int dwFileSize$get(MemorySegment seg) {
        return (int)_CERT_LOGOTYPE_AUDIO_INFO.dwFileSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFileSize;
     * }
     */
    public static void dwFileSize$set(MemorySegment seg, int x) {
        _CERT_LOGOTYPE_AUDIO_INFO.dwFileSize$VH.set(seg, x);
    }
    public static int dwFileSize$get(MemorySegment seg, long index) {
        return (int)_CERT_LOGOTYPE_AUDIO_INFO.dwFileSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFileSize$set(MemorySegment seg, long index, int x) {
        _CERT_LOGOTYPE_AUDIO_INFO.dwFileSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPlayTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwPlayTime"));
    public static VarHandle dwPlayTime$VH() {
        return _CERT_LOGOTYPE_AUDIO_INFO.dwPlayTime$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwPlayTime;
     * }
     */
    public static int dwPlayTime$get(MemorySegment seg) {
        return (int)_CERT_LOGOTYPE_AUDIO_INFO.dwPlayTime$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwPlayTime;
     * }
     */
    public static void dwPlayTime$set(MemorySegment seg, int x) {
        _CERT_LOGOTYPE_AUDIO_INFO.dwPlayTime$VH.set(seg, x);
    }
    public static int dwPlayTime$get(MemorySegment seg, long index) {
        return (int)_CERT_LOGOTYPE_AUDIO_INFO.dwPlayTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPlayTime$set(MemorySegment seg, long index, int x) {
        _CERT_LOGOTYPE_AUDIO_INFO.dwPlayTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwChannels$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwChannels"));
    public static VarHandle dwChannels$VH() {
        return _CERT_LOGOTYPE_AUDIO_INFO.dwChannels$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwChannels;
     * }
     */
    public static int dwChannels$get(MemorySegment seg) {
        return (int)_CERT_LOGOTYPE_AUDIO_INFO.dwChannels$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwChannels;
     * }
     */
    public static void dwChannels$set(MemorySegment seg, int x) {
        _CERT_LOGOTYPE_AUDIO_INFO.dwChannels$VH.set(seg, x);
    }
    public static int dwChannels$get(MemorySegment seg, long index) {
        return (int)_CERT_LOGOTYPE_AUDIO_INFO.dwChannels$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwChannels$set(MemorySegment seg, long index, int x) {
        _CERT_LOGOTYPE_AUDIO_INFO.dwChannels$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSampleRate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSampleRate"));
    public static VarHandle dwSampleRate$VH() {
        return _CERT_LOGOTYPE_AUDIO_INFO.dwSampleRate$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSampleRate;
     * }
     */
    public static int dwSampleRate$get(MemorySegment seg) {
        return (int)_CERT_LOGOTYPE_AUDIO_INFO.dwSampleRate$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSampleRate;
     * }
     */
    public static void dwSampleRate$set(MemorySegment seg, int x) {
        _CERT_LOGOTYPE_AUDIO_INFO.dwSampleRate$VH.set(seg, x);
    }
    public static int dwSampleRate$get(MemorySegment seg, long index) {
        return (int)_CERT_LOGOTYPE_AUDIO_INFO.dwSampleRate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSampleRate$set(MemorySegment seg, long index, int x) {
        _CERT_LOGOTYPE_AUDIO_INFO.dwSampleRate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwszLanguage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pwszLanguage"));
    public static VarHandle pwszLanguage$VH() {
        return _CERT_LOGOTYPE_AUDIO_INFO.pwszLanguage$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pwszLanguage;
     * }
     */
    public static MemorySegment pwszLanguage$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CERT_LOGOTYPE_AUDIO_INFO.pwszLanguage$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pwszLanguage;
     * }
     */
    public static void pwszLanguage$set(MemorySegment seg, MemorySegment x) {
        _CERT_LOGOTYPE_AUDIO_INFO.pwszLanguage$VH.set(seg, x);
    }
    public static MemorySegment pwszLanguage$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CERT_LOGOTYPE_AUDIO_INFO.pwszLanguage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszLanguage$set(MemorySegment seg, long index, MemorySegment x) {
        _CERT_LOGOTYPE_AUDIO_INFO.pwszLanguage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


