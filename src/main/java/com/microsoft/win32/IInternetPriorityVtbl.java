// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IInternetPriorityVtbl {
 *     HRESULT (*QueryInterface)(IInternetPriority*,const IID*,void**);
 *     ULONG (*AddRef)(IInternetPriority*);
 *     ULONG (*Release)(IInternetPriority*);
 *     HRESULT (*SetPriority)(IInternetPriority*,LONG);
 *     HRESULT (*GetPriority)(IInternetPriority*,LONG*);
 * };
 * }
 */
public class IInternetPriorityVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("SetPriority"),
        Constants$root.C_POINTER$LAYOUT.withName("GetPriority")
    ).withName("IInternetPriorityVtbl");
    public static MemoryLayout $LAYOUT() {
        return IInternetPriorityVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IInternetPriorityVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetPriorityVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IInternetPriority*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetPriorityVtbl.QueryInterface_UP$MH, fi, IInternetPriorityVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IInternetPriorityVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IInternetPriorityVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IInternetPriority*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetPriorityVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IInternetPriority*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IInternetPriorityVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetPriorityVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetPriorityVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IInternetPriorityVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetPriorityVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IInternetPriority*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetPriorityVtbl.AddRef_UP$MH, fi, IInternetPriorityVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IInternetPriorityVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IInternetPriorityVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IInternetPriority*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetPriorityVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IInternetPriority*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IInternetPriorityVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetPriorityVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetPriorityVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IInternetPriorityVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetPriorityVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IInternetPriority*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetPriorityVtbl.Release_UP$MH, fi, IInternetPriorityVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IInternetPriorityVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IInternetPriorityVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IInternetPriority*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetPriorityVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IInternetPriority*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IInternetPriorityVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetPriorityVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetPriorityVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor SetPriority$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor SetPriority_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetPriority_UP$MH = RuntimeHelper.upcallHandle(SetPriority.class, "apply", IInternetPriorityVtbl.SetPriority_UP$FUNC);
    static final FunctionDescriptor SetPriority_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetPriority_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetPriorityVtbl.SetPriority_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*SetPriority)(IInternetPriority*,LONG);
     * }
     */
    public interface SetPriority {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(SetPriority fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetPriorityVtbl.SetPriority_UP$MH, fi, IInternetPriorityVtbl.SetPriority$FUNC, scope);
        }
        static SetPriority ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)IInternetPriorityVtbl.SetPriority_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetPriority$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetPriority"));
    public static VarHandle SetPriority$VH() {
        return IInternetPriorityVtbl.SetPriority$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SetPriority)(IInternetPriority*,LONG);
     * }
     */
    public static MemorySegment SetPriority$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetPriorityVtbl.SetPriority$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SetPriority)(IInternetPriority*,LONG);
     * }
     */
    public static void SetPriority$set(MemorySegment seg, MemorySegment x) {
        IInternetPriorityVtbl.SetPriority$VH.set(seg, x);
    }
    public static MemorySegment SetPriority$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetPriorityVtbl.SetPriority$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetPriority$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetPriorityVtbl.SetPriority$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetPriority SetPriority(MemorySegment segment, SegmentScope scope) {
        return SetPriority.ofAddress(SetPriority$get(segment), scope);
    }
    static final FunctionDescriptor GetPriority$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GetPriority_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPriority_UP$MH = RuntimeHelper.upcallHandle(GetPriority.class, "apply", IInternetPriorityVtbl.GetPriority_UP$FUNC);
    static final FunctionDescriptor GetPriority_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPriority_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetPriorityVtbl.GetPriority_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*GetPriority)(IInternetPriority*,LONG*);
     * }
     */
    public interface GetPriority {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetPriority fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetPriorityVtbl.GetPriority_UP$MH, fi, IInternetPriorityVtbl.GetPriority$FUNC, scope);
        }
        static GetPriority ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IInternetPriorityVtbl.GetPriority_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetPriority$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetPriority"));
    public static VarHandle GetPriority$VH() {
        return IInternetPriorityVtbl.GetPriority$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetPriority)(IInternetPriority*,LONG*);
     * }
     */
    public static MemorySegment GetPriority$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetPriorityVtbl.GetPriority$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetPriority)(IInternetPriority*,LONG*);
     * }
     */
    public static void GetPriority$set(MemorySegment seg, MemorySegment x) {
        IInternetPriorityVtbl.GetPriority$VH.set(seg, x);
    }
    public static MemorySegment GetPriority$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetPriorityVtbl.GetPriority$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetPriority$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetPriorityVtbl.GetPriority$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetPriority GetPriority(MemorySegment segment, SegmentScope scope) {
        return GetPriority.ofAddress(GetPriority$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


