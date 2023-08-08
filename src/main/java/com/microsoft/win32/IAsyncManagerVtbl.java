// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IAsyncManagerVtbl {
 *     HRESULT (*QueryInterface)(IAsyncManager*,const IID*,void**);
 *     ULONG (*AddRef)(IAsyncManager*);
 *     ULONG (*Release)(IAsyncManager*);
 *     HRESULT (*CompleteCall)(IAsyncManager*,HRESULT);
 *     HRESULT (*GetCallContext)(IAsyncManager*,const IID*,void**);
 *     HRESULT (*GetState)(IAsyncManager*,ULONG*);
 * };
 * }
 */
public class IAsyncManagerVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("CompleteCall"),
        Constants$root.C_POINTER$LAYOUT.withName("GetCallContext"),
        Constants$root.C_POINTER$LAYOUT.withName("GetState")
    ).withName("IAsyncManagerVtbl");
    public static MemoryLayout $LAYOUT() {
        return IAsyncManagerVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IAsyncManagerVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IAsyncManagerVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IAsyncManager*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IAsyncManagerVtbl.QueryInterface_UP$MH, fi, IAsyncManagerVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IAsyncManagerVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IAsyncManagerVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IAsyncManager*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IAsyncManagerVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IAsyncManager*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IAsyncManagerVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IAsyncManagerVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IAsyncManagerVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IAsyncManagerVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IAsyncManagerVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IAsyncManager*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IAsyncManagerVtbl.AddRef_UP$MH, fi, IAsyncManagerVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IAsyncManagerVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IAsyncManagerVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IAsyncManager*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IAsyncManagerVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IAsyncManager*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IAsyncManagerVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IAsyncManagerVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IAsyncManagerVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IAsyncManagerVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IAsyncManagerVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IAsyncManager*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IAsyncManagerVtbl.Release_UP$MH, fi, IAsyncManagerVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IAsyncManagerVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IAsyncManagerVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IAsyncManager*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IAsyncManagerVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IAsyncManager*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IAsyncManagerVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IAsyncManagerVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IAsyncManagerVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor CompleteCall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor CompleteCall_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CompleteCall_UP$MH = RuntimeHelper.upcallHandle(CompleteCall.class, "apply", IAsyncManagerVtbl.CompleteCall_UP$FUNC);
    static final FunctionDescriptor CompleteCall_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CompleteCall_DOWN$MH = RuntimeHelper.downcallHandle(
        IAsyncManagerVtbl.CompleteCall_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*CompleteCall)(IAsyncManager*,HRESULT);
     * }
     */
    public interface CompleteCall {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(CompleteCall fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IAsyncManagerVtbl.CompleteCall_UP$MH, fi, IAsyncManagerVtbl.CompleteCall$FUNC, scope);
        }
        static CompleteCall ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)IAsyncManagerVtbl.CompleteCall_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle CompleteCall$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CompleteCall"));
    public static VarHandle CompleteCall$VH() {
        return IAsyncManagerVtbl.CompleteCall$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*CompleteCall)(IAsyncManager*,HRESULT);
     * }
     */
    public static MemorySegment CompleteCall$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IAsyncManagerVtbl.CompleteCall$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*CompleteCall)(IAsyncManager*,HRESULT);
     * }
     */
    public static void CompleteCall$set(MemorySegment seg, MemorySegment x) {
        IAsyncManagerVtbl.CompleteCall$VH.set(seg, x);
    }
    public static MemorySegment CompleteCall$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IAsyncManagerVtbl.CompleteCall$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CompleteCall$set(MemorySegment seg, long index, MemorySegment x) {
        IAsyncManagerVtbl.CompleteCall$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static CompleteCall CompleteCall(MemorySegment segment, SegmentScope scope) {
        return CompleteCall.ofAddress(CompleteCall$get(segment), scope);
    }
    static final FunctionDescriptor GetCallContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GetCallContext_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCallContext_UP$MH = RuntimeHelper.upcallHandle(GetCallContext.class, "apply", IAsyncManagerVtbl.GetCallContext_UP$FUNC);
    static final FunctionDescriptor GetCallContext_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCallContext_DOWN$MH = RuntimeHelper.downcallHandle(
        IAsyncManagerVtbl.GetCallContext_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*GetCallContext)(IAsyncManager*,const IID*,void**);
     * }
     */
    public interface GetCallContext {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(GetCallContext fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IAsyncManagerVtbl.GetCallContext_UP$MH, fi, IAsyncManagerVtbl.GetCallContext$FUNC, scope);
        }
        static GetCallContext ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IAsyncManagerVtbl.GetCallContext_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetCallContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetCallContext"));
    public static VarHandle GetCallContext$VH() {
        return IAsyncManagerVtbl.GetCallContext$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetCallContext)(IAsyncManager*,const IID*,void**);
     * }
     */
    public static MemorySegment GetCallContext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IAsyncManagerVtbl.GetCallContext$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetCallContext)(IAsyncManager*,const IID*,void**);
     * }
     */
    public static void GetCallContext$set(MemorySegment seg, MemorySegment x) {
        IAsyncManagerVtbl.GetCallContext$VH.set(seg, x);
    }
    public static MemorySegment GetCallContext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IAsyncManagerVtbl.GetCallContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetCallContext$set(MemorySegment seg, long index, MemorySegment x) {
        IAsyncManagerVtbl.GetCallContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetCallContext GetCallContext(MemorySegment segment, SegmentScope scope) {
        return GetCallContext.ofAddress(GetCallContext$get(segment), scope);
    }
    static final FunctionDescriptor GetState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GetState_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetState_UP$MH = RuntimeHelper.upcallHandle(GetState.class, "apply", IAsyncManagerVtbl.GetState_UP$FUNC);
    static final FunctionDescriptor GetState_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetState_DOWN$MH = RuntimeHelper.downcallHandle(
        IAsyncManagerVtbl.GetState_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*GetState)(IAsyncManager*,ULONG*);
     * }
     */
    public interface GetState {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetState fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IAsyncManagerVtbl.GetState_UP$MH, fi, IAsyncManagerVtbl.GetState$FUNC, scope);
        }
        static GetState ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IAsyncManagerVtbl.GetState_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetState"));
    public static VarHandle GetState$VH() {
        return IAsyncManagerVtbl.GetState$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetState)(IAsyncManager*,ULONG*);
     * }
     */
    public static MemorySegment GetState$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IAsyncManagerVtbl.GetState$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetState)(IAsyncManager*,ULONG*);
     * }
     */
    public static void GetState$set(MemorySegment seg, MemorySegment x) {
        IAsyncManagerVtbl.GetState$VH.set(seg, x);
    }
    public static MemorySegment GetState$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IAsyncManagerVtbl.GetState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetState$set(MemorySegment seg, long index, MemorySegment x) {
        IAsyncManagerVtbl.GetState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetState GetState(MemorySegment segment, SegmentScope scope) {
        return GetState.ofAddress(GetState$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


