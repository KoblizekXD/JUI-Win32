// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IEnterpriseDropTargetVtbl {
 *     HRESULT (*QueryInterface)(IEnterpriseDropTarget*,const IID*,void**);
 *     ULONG (*AddRef)(IEnterpriseDropTarget*);
 *     ULONG (*Release)(IEnterpriseDropTarget*);
 *     HRESULT (*SetDropSourceEnterpriseId)(IEnterpriseDropTarget*,LPCWSTR);
 *     HRESULT (*IsEvaluatingEdpPolicy)(IEnterpriseDropTarget*,BOOL*);
 * };
 * }
 */
public class IEnterpriseDropTargetVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("SetDropSourceEnterpriseId"),
        Constants$root.C_POINTER$LAYOUT.withName("IsEvaluatingEdpPolicy")
    ).withName("IEnterpriseDropTargetVtbl");
    public static MemoryLayout $LAYOUT() {
        return IEnterpriseDropTargetVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IEnterpriseDropTargetVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnterpriseDropTargetVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IEnterpriseDropTarget*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnterpriseDropTargetVtbl.QueryInterface_UP$MH, fi, IEnterpriseDropTargetVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IEnterpriseDropTargetVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IEnterpriseDropTargetVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IEnterpriseDropTarget*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnterpriseDropTargetVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IEnterpriseDropTarget*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IEnterpriseDropTargetVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnterpriseDropTargetVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IEnterpriseDropTargetVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IEnterpriseDropTargetVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnterpriseDropTargetVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IEnterpriseDropTarget*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnterpriseDropTargetVtbl.AddRef_UP$MH, fi, IEnterpriseDropTargetVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IEnterpriseDropTargetVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IEnterpriseDropTargetVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IEnterpriseDropTarget*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnterpriseDropTargetVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IEnterpriseDropTarget*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IEnterpriseDropTargetVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnterpriseDropTargetVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IEnterpriseDropTargetVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IEnterpriseDropTargetVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnterpriseDropTargetVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IEnterpriseDropTarget*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnterpriseDropTargetVtbl.Release_UP$MH, fi, IEnterpriseDropTargetVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IEnterpriseDropTargetVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IEnterpriseDropTargetVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IEnterpriseDropTarget*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnterpriseDropTargetVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IEnterpriseDropTarget*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IEnterpriseDropTargetVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnterpriseDropTargetVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IEnterpriseDropTargetVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor SetDropSourceEnterpriseId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor SetDropSourceEnterpriseId_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetDropSourceEnterpriseId_UP$MH = RuntimeHelper.upcallHandle(SetDropSourceEnterpriseId.class, "apply", IEnterpriseDropTargetVtbl.SetDropSourceEnterpriseId_UP$FUNC);
    static final FunctionDescriptor SetDropSourceEnterpriseId_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetDropSourceEnterpriseId_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnterpriseDropTargetVtbl.SetDropSourceEnterpriseId_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*SetDropSourceEnterpriseId)(IEnterpriseDropTarget*,LPCWSTR);
     * }
     */
    public interface SetDropSourceEnterpriseId {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(SetDropSourceEnterpriseId fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnterpriseDropTargetVtbl.SetDropSourceEnterpriseId_UP$MH, fi, IEnterpriseDropTargetVtbl.SetDropSourceEnterpriseId$FUNC, scope);
        }
        static SetDropSourceEnterpriseId ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IEnterpriseDropTargetVtbl.SetDropSourceEnterpriseId_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetDropSourceEnterpriseId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetDropSourceEnterpriseId"));
    public static VarHandle SetDropSourceEnterpriseId$VH() {
        return IEnterpriseDropTargetVtbl.SetDropSourceEnterpriseId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SetDropSourceEnterpriseId)(IEnterpriseDropTarget*,LPCWSTR);
     * }
     */
    public static MemorySegment SetDropSourceEnterpriseId$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnterpriseDropTargetVtbl.SetDropSourceEnterpriseId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SetDropSourceEnterpriseId)(IEnterpriseDropTarget*,LPCWSTR);
     * }
     */
    public static void SetDropSourceEnterpriseId$set(MemorySegment seg, MemorySegment x) {
        IEnterpriseDropTargetVtbl.SetDropSourceEnterpriseId$VH.set(seg, x);
    }
    public static MemorySegment SetDropSourceEnterpriseId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnterpriseDropTargetVtbl.SetDropSourceEnterpriseId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetDropSourceEnterpriseId$set(MemorySegment seg, long index, MemorySegment x) {
        IEnterpriseDropTargetVtbl.SetDropSourceEnterpriseId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetDropSourceEnterpriseId SetDropSourceEnterpriseId(MemorySegment segment, SegmentScope scope) {
        return SetDropSourceEnterpriseId.ofAddress(SetDropSourceEnterpriseId$get(segment), scope);
    }
    static final FunctionDescriptor IsEvaluatingEdpPolicy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor IsEvaluatingEdpPolicy_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsEvaluatingEdpPolicy_UP$MH = RuntimeHelper.upcallHandle(IsEvaluatingEdpPolicy.class, "apply", IEnterpriseDropTargetVtbl.IsEvaluatingEdpPolicy_UP$FUNC);
    static final FunctionDescriptor IsEvaluatingEdpPolicy_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsEvaluatingEdpPolicy_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnterpriseDropTargetVtbl.IsEvaluatingEdpPolicy_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*IsEvaluatingEdpPolicy)(IEnterpriseDropTarget*,BOOL*);
     * }
     */
    public interface IsEvaluatingEdpPolicy {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(IsEvaluatingEdpPolicy fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnterpriseDropTargetVtbl.IsEvaluatingEdpPolicy_UP$MH, fi, IEnterpriseDropTargetVtbl.IsEvaluatingEdpPolicy$FUNC, scope);
        }
        static IsEvaluatingEdpPolicy ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IEnterpriseDropTargetVtbl.IsEvaluatingEdpPolicy_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle IsEvaluatingEdpPolicy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsEvaluatingEdpPolicy"));
    public static VarHandle IsEvaluatingEdpPolicy$VH() {
        return IEnterpriseDropTargetVtbl.IsEvaluatingEdpPolicy$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*IsEvaluatingEdpPolicy)(IEnterpriseDropTarget*,BOOL*);
     * }
     */
    public static MemorySegment IsEvaluatingEdpPolicy$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnterpriseDropTargetVtbl.IsEvaluatingEdpPolicy$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*IsEvaluatingEdpPolicy)(IEnterpriseDropTarget*,BOOL*);
     * }
     */
    public static void IsEvaluatingEdpPolicy$set(MemorySegment seg, MemorySegment x) {
        IEnterpriseDropTargetVtbl.IsEvaluatingEdpPolicy$VH.set(seg, x);
    }
    public static MemorySegment IsEvaluatingEdpPolicy$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnterpriseDropTargetVtbl.IsEvaluatingEdpPolicy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsEvaluatingEdpPolicy$set(MemorySegment seg, long index, MemorySegment x) {
        IEnterpriseDropTargetVtbl.IsEvaluatingEdpPolicy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static IsEvaluatingEdpPolicy IsEvaluatingEdpPolicy(MemorySegment segment, SegmentScope scope) {
        return IsEvaluatingEdpPolicy.ofAddress(IsEvaluatingEdpPolicy$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

