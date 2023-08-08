// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_ACCESS_DESCRIPTION {
 *     LPSTR pszAccessMethod;
 *     CERT_ALT_NAME_ENTRY AccessLocation;
 * };
 * }
 */
public class _CERT_ACCESS_DESCRIPTION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszAccessMethod"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwAltNameChoice"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.unionLayout(
                Constants$root.C_POINTER$LAYOUT.withName("pOtherName"),
                Constants$root.C_POINTER$LAYOUT.withName("pwszRfc822Name"),
                Constants$root.C_POINTER$LAYOUT.withName("pwszDNSName"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("cbData"),
                    MemoryLayout.paddingLayout(32),
                    Constants$root.C_POINTER$LAYOUT.withName("pbData")
                ).withName("DirectoryName"),
                Constants$root.C_POINTER$LAYOUT.withName("pwszURL"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("cbData"),
                    MemoryLayout.paddingLayout(32),
                    Constants$root.C_POINTER$LAYOUT.withName("pbData")
                ).withName("IPAddress"),
                Constants$root.C_POINTER$LAYOUT.withName("pszRegisteredID")
            ).withName("$anon$0")
        ).withName("AccessLocation")
    ).withName("_CERT_ACCESS_DESCRIPTION");
    public static MemoryLayout $LAYOUT() {
        return _CERT_ACCESS_DESCRIPTION.$struct$LAYOUT;
    }
    static final VarHandle pszAccessMethod$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszAccessMethod"));
    public static VarHandle pszAccessMethod$VH() {
        return _CERT_ACCESS_DESCRIPTION.pszAccessMethod$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pszAccessMethod;
     * }
     */
    public static MemorySegment pszAccessMethod$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CERT_ACCESS_DESCRIPTION.pszAccessMethod$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pszAccessMethod;
     * }
     */
    public static void pszAccessMethod$set(MemorySegment seg, MemorySegment x) {
        _CERT_ACCESS_DESCRIPTION.pszAccessMethod$VH.set(seg, x);
    }
    public static MemorySegment pszAccessMethod$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CERT_ACCESS_DESCRIPTION.pszAccessMethod$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszAccessMethod$set(MemorySegment seg, long index, MemorySegment x) {
        _CERT_ACCESS_DESCRIPTION.pszAccessMethod$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment AccessLocation$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


