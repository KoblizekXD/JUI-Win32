// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagEXCEPINFO {
 *     WORD wCode;
 *     WORD wReserved;
 *     BSTR bstrSource;
 *     BSTR bstrDescription;
 *     BSTR bstrHelpFile;
 *     DWORD dwHelpContext;
 *     PVOID pvReserved;
 *     HRESULT (*pfnDeferredFillIn)(struct tagEXCEPINFO*);
 *     SCODE scode;
 * };
 * }
 */
public class tagEXCEPINFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("wCode"),
        Constants$root.C_SHORT$LAYOUT.withName("wReserved"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("bstrSource"),
        Constants$root.C_POINTER$LAYOUT.withName("bstrDescription"),
        Constants$root.C_POINTER$LAYOUT.withName("bstrHelpFile"),
        Constants$root.C_LONG$LAYOUT.withName("dwHelpContext"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pvReserved"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnDeferredFillIn"),
        Constants$root.C_LONG$LAYOUT.withName("scode"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagEXCEPINFO");
    public static MemoryLayout $LAYOUT() {
        return tagEXCEPINFO.$struct$LAYOUT;
    }
    static final VarHandle wCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wCode"));
    public static VarHandle wCode$VH() {
        return tagEXCEPINFO.wCode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wCode;
     * }
     */
    public static short wCode$get(MemorySegment seg) {
        return (short)tagEXCEPINFO.wCode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wCode;
     * }
     */
    public static void wCode$set(MemorySegment seg, short x) {
        tagEXCEPINFO.wCode$VH.set(seg, x);
    }
    public static short wCode$get(MemorySegment seg, long index) {
        return (short)tagEXCEPINFO.wCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wCode$set(MemorySegment seg, long index, short x) {
        tagEXCEPINFO.wCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wReserved"));
    public static VarHandle wReserved$VH() {
        return tagEXCEPINFO.wReserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wReserved;
     * }
     */
    public static short wReserved$get(MemorySegment seg) {
        return (short)tagEXCEPINFO.wReserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wReserved;
     * }
     */
    public static void wReserved$set(MemorySegment seg, short x) {
        tagEXCEPINFO.wReserved$VH.set(seg, x);
    }
    public static short wReserved$get(MemorySegment seg, long index) {
        return (short)tagEXCEPINFO.wReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved$set(MemorySegment seg, long index, short x) {
        tagEXCEPINFO.wReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bstrSource$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bstrSource"));
    public static VarHandle bstrSource$VH() {
        return tagEXCEPINFO.bstrSource$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BSTR bstrSource;
     * }
     */
    public static MemorySegment bstrSource$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagEXCEPINFO.bstrSource$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BSTR bstrSource;
     * }
     */
    public static void bstrSource$set(MemorySegment seg, MemorySegment x) {
        tagEXCEPINFO.bstrSource$VH.set(seg, x);
    }
    public static MemorySegment bstrSource$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagEXCEPINFO.bstrSource$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bstrSource$set(MemorySegment seg, long index, MemorySegment x) {
        tagEXCEPINFO.bstrSource$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bstrDescription$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bstrDescription"));
    public static VarHandle bstrDescription$VH() {
        return tagEXCEPINFO.bstrDescription$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BSTR bstrDescription;
     * }
     */
    public static MemorySegment bstrDescription$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagEXCEPINFO.bstrDescription$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BSTR bstrDescription;
     * }
     */
    public static void bstrDescription$set(MemorySegment seg, MemorySegment x) {
        tagEXCEPINFO.bstrDescription$VH.set(seg, x);
    }
    public static MemorySegment bstrDescription$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagEXCEPINFO.bstrDescription$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bstrDescription$set(MemorySegment seg, long index, MemorySegment x) {
        tagEXCEPINFO.bstrDescription$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bstrHelpFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bstrHelpFile"));
    public static VarHandle bstrHelpFile$VH() {
        return tagEXCEPINFO.bstrHelpFile$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BSTR bstrHelpFile;
     * }
     */
    public static MemorySegment bstrHelpFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagEXCEPINFO.bstrHelpFile$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BSTR bstrHelpFile;
     * }
     */
    public static void bstrHelpFile$set(MemorySegment seg, MemorySegment x) {
        tagEXCEPINFO.bstrHelpFile$VH.set(seg, x);
    }
    public static MemorySegment bstrHelpFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagEXCEPINFO.bstrHelpFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bstrHelpFile$set(MemorySegment seg, long index, MemorySegment x) {
        tagEXCEPINFO.bstrHelpFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwHelpContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwHelpContext"));
    public static VarHandle dwHelpContext$VH() {
        return tagEXCEPINFO.dwHelpContext$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwHelpContext;
     * }
     */
    public static int dwHelpContext$get(MemorySegment seg) {
        return (int)tagEXCEPINFO.dwHelpContext$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwHelpContext;
     * }
     */
    public static void dwHelpContext$set(MemorySegment seg, int x) {
        tagEXCEPINFO.dwHelpContext$VH.set(seg, x);
    }
    public static int dwHelpContext$get(MemorySegment seg, long index) {
        return (int)tagEXCEPINFO.dwHelpContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwHelpContext$set(MemorySegment seg, long index, int x) {
        tagEXCEPINFO.dwHelpContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvReserved"));
    public static VarHandle pvReserved$VH() {
        return tagEXCEPINFO.pvReserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID pvReserved;
     * }
     */
    public static MemorySegment pvReserved$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagEXCEPINFO.pvReserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID pvReserved;
     * }
     */
    public static void pvReserved$set(MemorySegment seg, MemorySegment x) {
        tagEXCEPINFO.pvReserved$VH.set(seg, x);
    }
    public static MemorySegment pvReserved$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagEXCEPINFO.pvReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvReserved$set(MemorySegment seg, long index, MemorySegment x) {
        tagEXCEPINFO.pvReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor pfnDeferredFillIn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor pfnDeferredFillIn_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pfnDeferredFillIn_UP$MH = RuntimeHelper.upcallHandle(pfnDeferredFillIn.class, "apply", tagEXCEPINFO.pfnDeferredFillIn_UP$FUNC);
    static final FunctionDescriptor pfnDeferredFillIn_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pfnDeferredFillIn_DOWN$MH = RuntimeHelper.downcallHandle(
        tagEXCEPINFO.pfnDeferredFillIn_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*pfnDeferredFillIn)(struct tagEXCEPINFO*);
     * }
     */
    public interface pfnDeferredFillIn {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(pfnDeferredFillIn fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(tagEXCEPINFO.pfnDeferredFillIn_UP$MH, fi, tagEXCEPINFO.pfnDeferredFillIn$FUNC, scope);
        }
        static pfnDeferredFillIn ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)tagEXCEPINFO.pfnDeferredFillIn_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle pfnDeferredFillIn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnDeferredFillIn"));
    public static VarHandle pfnDeferredFillIn$VH() {
        return tagEXCEPINFO.pfnDeferredFillIn$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*pfnDeferredFillIn)(struct tagEXCEPINFO*);
     * }
     */
    public static MemorySegment pfnDeferredFillIn$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagEXCEPINFO.pfnDeferredFillIn$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*pfnDeferredFillIn)(struct tagEXCEPINFO*);
     * }
     */
    public static void pfnDeferredFillIn$set(MemorySegment seg, MemorySegment x) {
        tagEXCEPINFO.pfnDeferredFillIn$VH.set(seg, x);
    }
    public static MemorySegment pfnDeferredFillIn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagEXCEPINFO.pfnDeferredFillIn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnDeferredFillIn$set(MemorySegment seg, long index, MemorySegment x) {
        tagEXCEPINFO.pfnDeferredFillIn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static pfnDeferredFillIn pfnDeferredFillIn(MemorySegment segment, SegmentScope scope) {
        return pfnDeferredFillIn.ofAddress(pfnDeferredFillIn$get(segment), scope);
    }
    static final VarHandle scode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("scode"));
    public static VarHandle scode$VH() {
        return tagEXCEPINFO.scode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SCODE scode;
     * }
     */
    public static int scode$get(MemorySegment seg) {
        return (int)tagEXCEPINFO.scode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SCODE scode;
     * }
     */
    public static void scode$set(MemorySegment seg, int x) {
        tagEXCEPINFO.scode$VH.set(seg, x);
    }
    public static int scode$get(MemorySegment seg, long index) {
        return (int)tagEXCEPINFO.scode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void scode$set(MemorySegment seg, long index, int x) {
        tagEXCEPINFO.scode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


