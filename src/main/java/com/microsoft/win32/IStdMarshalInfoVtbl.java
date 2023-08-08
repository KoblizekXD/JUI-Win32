// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IStdMarshalInfoVtbl {
 *     HRESULT (*QueryInterface)(IStdMarshalInfo*,const IID*,void**);
 *     ULONG (*AddRef)(IStdMarshalInfo*);
 *     ULONG (*Release)(IStdMarshalInfo*);
 *     HRESULT (*GetClassForHandler)(IStdMarshalInfo*,DWORD,void*,CLSID*);
 * };
 * }
 */
public class IStdMarshalInfoVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("GetClassForHandler")
    ).withName("IStdMarshalInfoVtbl");
    public static MemoryLayout $LAYOUT() {
        return IStdMarshalInfoVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IStdMarshalInfoVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IStdMarshalInfoVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IStdMarshalInfo*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IStdMarshalInfoVtbl.QueryInterface_UP$MH, fi, IStdMarshalInfoVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IStdMarshalInfoVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IStdMarshalInfoVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IStdMarshalInfo*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IStdMarshalInfoVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IStdMarshalInfo*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IStdMarshalInfoVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IStdMarshalInfoVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IStdMarshalInfoVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IStdMarshalInfoVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IStdMarshalInfoVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IStdMarshalInfo*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IStdMarshalInfoVtbl.AddRef_UP$MH, fi, IStdMarshalInfoVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IStdMarshalInfoVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IStdMarshalInfoVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IStdMarshalInfo*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IStdMarshalInfoVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IStdMarshalInfo*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IStdMarshalInfoVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IStdMarshalInfoVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IStdMarshalInfoVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IStdMarshalInfoVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IStdMarshalInfoVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IStdMarshalInfo*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IStdMarshalInfoVtbl.Release_UP$MH, fi, IStdMarshalInfoVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IStdMarshalInfoVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IStdMarshalInfoVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IStdMarshalInfo*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IStdMarshalInfoVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IStdMarshalInfo*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IStdMarshalInfoVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IStdMarshalInfoVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IStdMarshalInfoVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor GetClassForHandler$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GetClassForHandler_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClassForHandler_UP$MH = RuntimeHelper.upcallHandle(GetClassForHandler.class, "apply", IStdMarshalInfoVtbl.GetClassForHandler_UP$FUNC);
    static final FunctionDescriptor GetClassForHandler_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClassForHandler_DOWN$MH = RuntimeHelper.downcallHandle(
        IStdMarshalInfoVtbl.GetClassForHandler_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*GetClassForHandler)(IStdMarshalInfo*,DWORD,void*,CLSID*);
     * }
     */
    public interface GetClassForHandler {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(GetClassForHandler fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IStdMarshalInfoVtbl.GetClassForHandler_UP$MH, fi, IStdMarshalInfoVtbl.GetClassForHandler$FUNC, scope);
        }
        static GetClassForHandler ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (int)IStdMarshalInfoVtbl.GetClassForHandler_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetClassForHandler$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetClassForHandler"));
    public static VarHandle GetClassForHandler$VH() {
        return IStdMarshalInfoVtbl.GetClassForHandler$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetClassForHandler)(IStdMarshalInfo*,DWORD,void*,CLSID*);
     * }
     */
    public static MemorySegment GetClassForHandler$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IStdMarshalInfoVtbl.GetClassForHandler$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetClassForHandler)(IStdMarshalInfo*,DWORD,void*,CLSID*);
     * }
     */
    public static void GetClassForHandler$set(MemorySegment seg, MemorySegment x) {
        IStdMarshalInfoVtbl.GetClassForHandler$VH.set(seg, x);
    }
    public static MemorySegment GetClassForHandler$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IStdMarshalInfoVtbl.GetClassForHandler$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetClassForHandler$set(MemorySegment seg, long index, MemorySegment x) {
        IStdMarshalInfoVtbl.GetClassForHandler$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetClassForHandler GetClassForHandler(MemorySegment segment, SegmentScope scope) {
        return GetClassForHandler.ofAddress(GetClassForHandler$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


