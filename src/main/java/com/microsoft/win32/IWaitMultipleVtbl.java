// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IWaitMultipleVtbl {
 *     HRESULT (*QueryInterface)(IWaitMultiple*,const IID*,void**);
 *     ULONG (*AddRef)(IWaitMultiple*);
 *     ULONG (*Release)(IWaitMultiple*);
 *     HRESULT (*WaitMultiple)(IWaitMultiple*,DWORD,ISynchronize**);
 *     HRESULT (*AddSynchronize)(IWaitMultiple*,ISynchronize*);
 * };
 * }
 */
public class IWaitMultipleVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("WaitMultiple"),
        Constants$root.C_POINTER$LAYOUT.withName("AddSynchronize")
    ).withName("IWaitMultipleVtbl");
    public static MemoryLayout $LAYOUT() {
        return IWaitMultipleVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IWaitMultipleVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IWaitMultipleVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IWaitMultiple*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IWaitMultipleVtbl.QueryInterface_UP$MH, fi, IWaitMultipleVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IWaitMultipleVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IWaitMultipleVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IWaitMultiple*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IWaitMultipleVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IWaitMultiple*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IWaitMultipleVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IWaitMultipleVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IWaitMultipleVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IWaitMultipleVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IWaitMultipleVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IWaitMultiple*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IWaitMultipleVtbl.AddRef_UP$MH, fi, IWaitMultipleVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IWaitMultipleVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IWaitMultipleVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IWaitMultiple*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IWaitMultipleVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IWaitMultiple*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IWaitMultipleVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IWaitMultipleVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IWaitMultipleVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IWaitMultipleVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IWaitMultipleVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IWaitMultiple*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IWaitMultipleVtbl.Release_UP$MH, fi, IWaitMultipleVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IWaitMultipleVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IWaitMultipleVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IWaitMultiple*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IWaitMultipleVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IWaitMultiple*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IWaitMultipleVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IWaitMultipleVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IWaitMultipleVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor WaitMultiple$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor WaitMultiple_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WaitMultiple_UP$MH = RuntimeHelper.upcallHandle(WaitMultiple.class, "apply", IWaitMultipleVtbl.WaitMultiple_UP$FUNC);
    static final FunctionDescriptor WaitMultiple_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WaitMultiple_DOWN$MH = RuntimeHelper.downcallHandle(
        IWaitMultipleVtbl.WaitMultiple_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*WaitMultiple)(IWaitMultiple*,DWORD,ISynchronize**);
     * }
     */
    public interface WaitMultiple {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(WaitMultiple fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IWaitMultipleVtbl.WaitMultiple_UP$MH, fi, IWaitMultipleVtbl.WaitMultiple$FUNC, scope);
        }
        static WaitMultiple ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IWaitMultipleVtbl.WaitMultiple_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle WaitMultiple$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("WaitMultiple"));
    public static VarHandle WaitMultiple$VH() {
        return IWaitMultipleVtbl.WaitMultiple$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*WaitMultiple)(IWaitMultiple*,DWORD,ISynchronize**);
     * }
     */
    public static MemorySegment WaitMultiple$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IWaitMultipleVtbl.WaitMultiple$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*WaitMultiple)(IWaitMultiple*,DWORD,ISynchronize**);
     * }
     */
    public static void WaitMultiple$set(MemorySegment seg, MemorySegment x) {
        IWaitMultipleVtbl.WaitMultiple$VH.set(seg, x);
    }
    public static MemorySegment WaitMultiple$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IWaitMultipleVtbl.WaitMultiple$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void WaitMultiple$set(MemorySegment seg, long index, MemorySegment x) {
        IWaitMultipleVtbl.WaitMultiple$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static WaitMultiple WaitMultiple(MemorySegment segment, SegmentScope scope) {
        return WaitMultiple.ofAddress(WaitMultiple$get(segment), scope);
    }
    static final FunctionDescriptor AddSynchronize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor AddSynchronize_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddSynchronize_UP$MH = RuntimeHelper.upcallHandle(AddSynchronize.class, "apply", IWaitMultipleVtbl.AddSynchronize_UP$FUNC);
    static final FunctionDescriptor AddSynchronize_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddSynchronize_DOWN$MH = RuntimeHelper.downcallHandle(
        IWaitMultipleVtbl.AddSynchronize_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*AddSynchronize)(IWaitMultiple*,ISynchronize*);
     * }
     */
    public interface AddSynchronize {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(AddSynchronize fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IWaitMultipleVtbl.AddSynchronize_UP$MH, fi, IWaitMultipleVtbl.AddSynchronize$FUNC, scope);
        }
        static AddSynchronize ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IWaitMultipleVtbl.AddSynchronize_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddSynchronize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddSynchronize"));
    public static VarHandle AddSynchronize$VH() {
        return IWaitMultipleVtbl.AddSynchronize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*AddSynchronize)(IWaitMultiple*,ISynchronize*);
     * }
     */
    public static MemorySegment AddSynchronize$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IWaitMultipleVtbl.AddSynchronize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*AddSynchronize)(IWaitMultiple*,ISynchronize*);
     * }
     */
    public static void AddSynchronize$set(MemorySegment seg, MemorySegment x) {
        IWaitMultipleVtbl.AddSynchronize$VH.set(seg, x);
    }
    public static MemorySegment AddSynchronize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IWaitMultipleVtbl.AddSynchronize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddSynchronize$set(MemorySegment seg, long index, MemorySegment x) {
        IWaitMultipleVtbl.AddSynchronize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddSynchronize AddSynchronize(MemorySegment segment, SegmentScope scope) {
        return AddSynchronize.ofAddress(AddSynchronize$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

