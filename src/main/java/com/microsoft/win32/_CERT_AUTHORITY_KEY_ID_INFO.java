// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_AUTHORITY_KEY_ID_INFO {
 *     CRYPT_DATA_BLOB KeyId;
 *     CERT_NAME_BLOB CertIssuer;
 *     CRYPT_INTEGER_BLOB CertSerialNumber;
 * };
 * }
 */
public class _CERT_AUTHORITY_KEY_ID_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("KeyId"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("CertIssuer"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("CertSerialNumber")
    ).withName("_CERT_AUTHORITY_KEY_ID_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_AUTHORITY_KEY_ID_INFO.$struct$LAYOUT;
    }
    public static MemorySegment KeyId$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment CertIssuer$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static MemorySegment CertSerialNumber$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


