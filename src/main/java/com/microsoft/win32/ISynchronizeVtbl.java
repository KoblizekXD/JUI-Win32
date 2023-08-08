// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct ISynchronizeVtbl {
 *     HRESULT (*QueryInterface)(ISynchronize*,const IID*,void**);
 *     ULONG (*AddRef)(ISynchronize*);
 *     ULONG (*Release)(ISynchronize*);
 *     HRESULT (*Wait)(ISynchronize*,DWORD,DWORD);
 *     HRESULT (*Signal)(ISynchronize*);
 *     HRESULT (*Reset)(ISynchronize*);
 * };
 * }
 */
public class ISynchronizeVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("Wait"),
        Constants$root.C_POINTER$LAYOUT.withName("Signal"),
        Constants$root.C_POINTER$LAYOUT.withName("Reset")
    ).withName("ISynchronizeVtbl");
    public static MemoryLayout $LAYOUT() {
        return ISynchronizeVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor QueryInterface_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", ISynchronizeVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        ISynchronizeVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(ISynchronize*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(ISynchronizeVtbl.QueryInterface_UP$MH, fi, ISynchronizeVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)ISynchronizeVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return ISynchronizeVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(ISynchronize*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)ISynchronizeVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(ISynchronize*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        ISynchronizeVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)ISynchronizeVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        ISynchronizeVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, SegmentScope scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor AddRef_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", ISynchronizeVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        ISynchronizeVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(ISynchronize*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(ISynchronizeVtbl.AddRef_UP$MH, fi, ISynchronizeVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)ISynchronizeVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return ISynchronizeVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(ISynchronize*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)ISynchronizeVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(ISynchronize*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        ISynchronizeVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)ISynchronizeVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        ISynchronizeVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, SegmentScope scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor Release_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", ISynchronizeVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        ISynchronizeVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(ISynchronize*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(ISynchronizeVtbl.Release_UP$MH, fi, ISynchronizeVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)ISynchronizeVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return ISynchronizeVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(ISynchronize*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)ISynchronizeVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(ISynchronize*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        ISynchronizeVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)ISynchronizeVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        ISynchronizeVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor Wait$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor Wait_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Wait_UP$MH = RuntimeHelper.upcallHandle(Wait.class, "apply", ISynchronizeVtbl.Wait_UP$FUNC);
    static final FunctionDescriptor Wait_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Wait_DOWN$MH = RuntimeHelper.downcallHandle(
        ISynchronizeVtbl.Wait_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Wait)(ISynchronize*,DWORD,DWORD);
     * }
     */
    public interface Wait {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2);
        static MemorySegment allocate(Wait fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(ISynchronizeVtbl.Wait_UP$MH, fi, ISynchronizeVtbl.Wait$FUNC, scope);
        }
        static Wait ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2) -> {
                try {
                    return (int)ISynchronizeVtbl.Wait_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Wait$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Wait"));
    public static VarHandle Wait$VH() {
        return ISynchronizeVtbl.Wait$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Wait)(ISynchronize*,DWORD,DWORD);
     * }
     */
    public static MemorySegment Wait$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)ISynchronizeVtbl.Wait$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Wait)(ISynchronize*,DWORD,DWORD);
     * }
     */
    public static void Wait$set(MemorySegment seg, MemorySegment x) {
        ISynchronizeVtbl.Wait$VH.set(seg, x);
    }
    public static MemorySegment Wait$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)ISynchronizeVtbl.Wait$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Wait$set(MemorySegment seg, long index, MemorySegment x) {
        ISynchronizeVtbl.Wait$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Wait Wait(MemorySegment segment, SegmentScope scope) {
        return Wait.ofAddress(Wait$get(segment), scope);
    }
    static final FunctionDescriptor Signal$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor Signal_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Signal_UP$MH = RuntimeHelper.upcallHandle(Signal.class, "apply", ISynchronizeVtbl.Signal_UP$FUNC);
    static final FunctionDescriptor Signal_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Signal_DOWN$MH = RuntimeHelper.downcallHandle(
        ISynchronizeVtbl.Signal_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Signal)(ISynchronize*);
     * }
     */
    public interface Signal {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Signal fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(ISynchronizeVtbl.Signal_UP$MH, fi, ISynchronizeVtbl.Signal$FUNC, scope);
        }
        static Signal ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)ISynchronizeVtbl.Signal_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Signal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Signal"));
    public static VarHandle Signal$VH() {
        return ISynchronizeVtbl.Signal$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Signal)(ISynchronize*);
     * }
     */
    public static MemorySegment Signal$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)ISynchronizeVtbl.Signal$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Signal)(ISynchronize*);
     * }
     */
    public static void Signal$set(MemorySegment seg, MemorySegment x) {
        ISynchronizeVtbl.Signal$VH.set(seg, x);
    }
    public static MemorySegment Signal$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)ISynchronizeVtbl.Signal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Signal$set(MemorySegment seg, long index, MemorySegment x) {
        ISynchronizeVtbl.Signal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Signal Signal(MemorySegment segment, SegmentScope scope) {
        return Signal.ofAddress(Signal$get(segment), scope);
    }
    static final FunctionDescriptor Reset$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor Reset_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Reset_UP$MH = RuntimeHelper.upcallHandle(Reset.class, "apply", ISynchronizeVtbl.Reset_UP$FUNC);
    static final FunctionDescriptor Reset_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Reset_DOWN$MH = RuntimeHelper.downcallHandle(
        ISynchronizeVtbl.Reset_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Reset)(ISynchronize*);
     * }
     */
    public interface Reset {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Reset fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(ISynchronizeVtbl.Reset_UP$MH, fi, ISynchronizeVtbl.Reset$FUNC, scope);
        }
        static Reset ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)ISynchronizeVtbl.Reset_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Reset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reset"));
    public static VarHandle Reset$VH() {
        return ISynchronizeVtbl.Reset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Reset)(ISynchronize*);
     * }
     */
    public static MemorySegment Reset$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)ISynchronizeVtbl.Reset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Reset)(ISynchronize*);
     * }
     */
    public static void Reset$set(MemorySegment seg, MemorySegment x) {
        ISynchronizeVtbl.Reset$VH.set(seg, x);
    }
    public static MemorySegment Reset$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)ISynchronizeVtbl.Reset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reset$set(MemorySegment seg, long index, MemorySegment x) {
        ISynchronizeVtbl.Reset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Reset Reset(MemorySegment segment, SegmentScope scope) {
        return Reset.ofAddress(Reset$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


