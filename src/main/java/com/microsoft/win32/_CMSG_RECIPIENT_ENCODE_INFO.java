// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CMSG_RECIPIENT_ENCODE_INFO {
 *     DWORD dwRecipientChoice;
 *     union {
 *         PCMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO pKeyTrans;
 *         PCMSG_KEY_AGREE_RECIPIENT_ENCODE_INFO pKeyAgree;
 *         PCMSG_MAIL_LIST_RECIPIENT_ENCODE_INFO pMailList;
 *     };
 * };
 * }
 */
public class _CMSG_RECIPIENT_ENCODE_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwRecipientChoice"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pKeyTrans"),
            Constants$root.C_POINTER$LAYOUT.withName("pKeyAgree"),
            Constants$root.C_POINTER$LAYOUT.withName("pMailList")
        ).withName("$anon$0")
    ).withName("_CMSG_RECIPIENT_ENCODE_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_RECIPIENT_ENCODE_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwRecipientChoice$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwRecipientChoice"));
    public static VarHandle dwRecipientChoice$VH() {
        return _CMSG_RECIPIENT_ENCODE_INFO.dwRecipientChoice$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwRecipientChoice;
     * }
     */
    public static int dwRecipientChoice$get(MemorySegment seg) {
        return (int)_CMSG_RECIPIENT_ENCODE_INFO.dwRecipientChoice$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwRecipientChoice;
     * }
     */
    public static void dwRecipientChoice$set(MemorySegment seg, int x) {
        _CMSG_RECIPIENT_ENCODE_INFO.dwRecipientChoice$VH.set(seg, x);
    }
    public static int dwRecipientChoice$get(MemorySegment seg, long index) {
        return (int)_CMSG_RECIPIENT_ENCODE_INFO.dwRecipientChoice$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwRecipientChoice$set(MemorySegment seg, long index, int x) {
        _CMSG_RECIPIENT_ENCODE_INFO.dwRecipientChoice$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pKeyTrans$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pKeyTrans"));
    public static VarHandle pKeyTrans$VH() {
        return _CMSG_RECIPIENT_ENCODE_INFO.pKeyTrans$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO pKeyTrans;
     * }
     */
    public static MemorySegment pKeyTrans$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMSG_RECIPIENT_ENCODE_INFO.pKeyTrans$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO pKeyTrans;
     * }
     */
    public static void pKeyTrans$set(MemorySegment seg, MemorySegment x) {
        _CMSG_RECIPIENT_ENCODE_INFO.pKeyTrans$VH.set(seg, x);
    }
    public static MemorySegment pKeyTrans$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMSG_RECIPIENT_ENCODE_INFO.pKeyTrans$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pKeyTrans$set(MemorySegment seg, long index, MemorySegment x) {
        _CMSG_RECIPIENT_ENCODE_INFO.pKeyTrans$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pKeyAgree$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pKeyAgree"));
    public static VarHandle pKeyAgree$VH() {
        return _CMSG_RECIPIENT_ENCODE_INFO.pKeyAgree$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCMSG_KEY_AGREE_RECIPIENT_ENCODE_INFO pKeyAgree;
     * }
     */
    public static MemorySegment pKeyAgree$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMSG_RECIPIENT_ENCODE_INFO.pKeyAgree$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCMSG_KEY_AGREE_RECIPIENT_ENCODE_INFO pKeyAgree;
     * }
     */
    public static void pKeyAgree$set(MemorySegment seg, MemorySegment x) {
        _CMSG_RECIPIENT_ENCODE_INFO.pKeyAgree$VH.set(seg, x);
    }
    public static MemorySegment pKeyAgree$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMSG_RECIPIENT_ENCODE_INFO.pKeyAgree$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pKeyAgree$set(MemorySegment seg, long index, MemorySegment x) {
        _CMSG_RECIPIENT_ENCODE_INFO.pKeyAgree$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pMailList$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pMailList"));
    public static VarHandle pMailList$VH() {
        return _CMSG_RECIPIENT_ENCODE_INFO.pMailList$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCMSG_MAIL_LIST_RECIPIENT_ENCODE_INFO pMailList;
     * }
     */
    public static MemorySegment pMailList$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMSG_RECIPIENT_ENCODE_INFO.pMailList$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCMSG_MAIL_LIST_RECIPIENT_ENCODE_INFO pMailList;
     * }
     */
    public static void pMailList$set(MemorySegment seg, MemorySegment x) {
        _CMSG_RECIPIENT_ENCODE_INFO.pMailList$VH.set(seg, x);
    }
    public static MemorySegment pMailList$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMSG_RECIPIENT_ENCODE_INFO.pMailList$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pMailList$set(MemorySegment seg, long index, MemorySegment x) {
        _CMSG_RECIPIENT_ENCODE_INFO.pMailList$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


