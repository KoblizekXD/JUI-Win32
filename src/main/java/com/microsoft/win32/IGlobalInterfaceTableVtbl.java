// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IGlobalInterfaceTableVtbl {
 *     HRESULT (*QueryInterface)(IGlobalInterfaceTable*,const IID*,void**);
 *     ULONG (*AddRef)(IGlobalInterfaceTable*);
 *     ULONG (*Release)(IGlobalInterfaceTable*);
 *     HRESULT (*RegisterInterfaceInGlobal)(IGlobalInterfaceTable*,IUnknown*,const IID*,DWORD*);
 *     HRESULT (*RevokeInterfaceFromGlobal)(IGlobalInterfaceTable*,DWORD);
 *     HRESULT (*GetInterfaceFromGlobal)(IGlobalInterfaceTable*,DWORD,const IID*,void**);
 * };
 * }
 */
public class IGlobalInterfaceTableVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("RegisterInterfaceInGlobal"),
        Constants$root.C_POINTER$LAYOUT.withName("RevokeInterfaceFromGlobal"),
        Constants$root.C_POINTER$LAYOUT.withName("GetInterfaceFromGlobal")
    ).withName("IGlobalInterfaceTableVtbl");
    public static MemoryLayout $LAYOUT() {
        return IGlobalInterfaceTableVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IGlobalInterfaceTableVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IGlobalInterfaceTableVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IGlobalInterfaceTable*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IGlobalInterfaceTableVtbl.QueryInterface_UP$MH, fi, IGlobalInterfaceTableVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IGlobalInterfaceTableVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IGlobalInterfaceTableVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IGlobalInterfaceTable*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IGlobalInterfaceTableVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IGlobalInterfaceTable*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IGlobalInterfaceTableVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IGlobalInterfaceTableVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IGlobalInterfaceTableVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IGlobalInterfaceTableVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IGlobalInterfaceTableVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IGlobalInterfaceTable*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IGlobalInterfaceTableVtbl.AddRef_UP$MH, fi, IGlobalInterfaceTableVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IGlobalInterfaceTableVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IGlobalInterfaceTableVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IGlobalInterfaceTable*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IGlobalInterfaceTableVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IGlobalInterfaceTable*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IGlobalInterfaceTableVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IGlobalInterfaceTableVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IGlobalInterfaceTableVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IGlobalInterfaceTableVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IGlobalInterfaceTableVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IGlobalInterfaceTable*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IGlobalInterfaceTableVtbl.Release_UP$MH, fi, IGlobalInterfaceTableVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IGlobalInterfaceTableVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IGlobalInterfaceTableVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IGlobalInterfaceTable*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IGlobalInterfaceTableVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IGlobalInterfaceTable*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IGlobalInterfaceTableVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IGlobalInterfaceTableVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IGlobalInterfaceTableVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor RegisterInterfaceInGlobal$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor RegisterInterfaceInGlobal_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterInterfaceInGlobal_UP$MH = RuntimeHelper.upcallHandle(RegisterInterfaceInGlobal.class, "apply", IGlobalInterfaceTableVtbl.RegisterInterfaceInGlobal_UP$FUNC);
    static final FunctionDescriptor RegisterInterfaceInGlobal_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterInterfaceInGlobal_DOWN$MH = RuntimeHelper.downcallHandle(
        IGlobalInterfaceTableVtbl.RegisterInterfaceInGlobal_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*RegisterInterfaceInGlobal)(IGlobalInterfaceTable*,IUnknown*,const IID*,DWORD*);
     * }
     */
    public interface RegisterInterfaceInGlobal {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(RegisterInterfaceInGlobal fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IGlobalInterfaceTableVtbl.RegisterInterfaceInGlobal_UP$MH, fi, IGlobalInterfaceTableVtbl.RegisterInterfaceInGlobal$FUNC, scope);
        }
        static RegisterInterfaceInGlobal ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (int)IGlobalInterfaceTableVtbl.RegisterInterfaceInGlobal_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle RegisterInterfaceInGlobal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RegisterInterfaceInGlobal"));
    public static VarHandle RegisterInterfaceInGlobal$VH() {
        return IGlobalInterfaceTableVtbl.RegisterInterfaceInGlobal$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*RegisterInterfaceInGlobal)(IGlobalInterfaceTable*,IUnknown*,const IID*,DWORD*);
     * }
     */
    public static MemorySegment RegisterInterfaceInGlobal$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IGlobalInterfaceTableVtbl.RegisterInterfaceInGlobal$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*RegisterInterfaceInGlobal)(IGlobalInterfaceTable*,IUnknown*,const IID*,DWORD*);
     * }
     */
    public static void RegisterInterfaceInGlobal$set(MemorySegment seg, MemorySegment x) {
        IGlobalInterfaceTableVtbl.RegisterInterfaceInGlobal$VH.set(seg, x);
    }
    public static MemorySegment RegisterInterfaceInGlobal$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IGlobalInterfaceTableVtbl.RegisterInterfaceInGlobal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RegisterInterfaceInGlobal$set(MemorySegment seg, long index, MemorySegment x) {
        IGlobalInterfaceTableVtbl.RegisterInterfaceInGlobal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static RegisterInterfaceInGlobal RegisterInterfaceInGlobal(MemorySegment segment, SegmentScope scope) {
        return RegisterInterfaceInGlobal.ofAddress(RegisterInterfaceInGlobal$get(segment), scope);
    }
    static final FunctionDescriptor RevokeInterfaceFromGlobal$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor RevokeInterfaceFromGlobal_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RevokeInterfaceFromGlobal_UP$MH = RuntimeHelper.upcallHandle(RevokeInterfaceFromGlobal.class, "apply", IGlobalInterfaceTableVtbl.RevokeInterfaceFromGlobal_UP$FUNC);
    static final FunctionDescriptor RevokeInterfaceFromGlobal_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RevokeInterfaceFromGlobal_DOWN$MH = RuntimeHelper.downcallHandle(
        IGlobalInterfaceTableVtbl.RevokeInterfaceFromGlobal_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*RevokeInterfaceFromGlobal)(IGlobalInterfaceTable*,DWORD);
     * }
     */
    public interface RevokeInterfaceFromGlobal {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(RevokeInterfaceFromGlobal fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IGlobalInterfaceTableVtbl.RevokeInterfaceFromGlobal_UP$MH, fi, IGlobalInterfaceTableVtbl.RevokeInterfaceFromGlobal$FUNC, scope);
        }
        static RevokeInterfaceFromGlobal ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)IGlobalInterfaceTableVtbl.RevokeInterfaceFromGlobal_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle RevokeInterfaceFromGlobal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RevokeInterfaceFromGlobal"));
    public static VarHandle RevokeInterfaceFromGlobal$VH() {
        return IGlobalInterfaceTableVtbl.RevokeInterfaceFromGlobal$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*RevokeInterfaceFromGlobal)(IGlobalInterfaceTable*,DWORD);
     * }
     */
    public static MemorySegment RevokeInterfaceFromGlobal$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IGlobalInterfaceTableVtbl.RevokeInterfaceFromGlobal$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*RevokeInterfaceFromGlobal)(IGlobalInterfaceTable*,DWORD);
     * }
     */
    public static void RevokeInterfaceFromGlobal$set(MemorySegment seg, MemorySegment x) {
        IGlobalInterfaceTableVtbl.RevokeInterfaceFromGlobal$VH.set(seg, x);
    }
    public static MemorySegment RevokeInterfaceFromGlobal$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IGlobalInterfaceTableVtbl.RevokeInterfaceFromGlobal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RevokeInterfaceFromGlobal$set(MemorySegment seg, long index, MemorySegment x) {
        IGlobalInterfaceTableVtbl.RevokeInterfaceFromGlobal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static RevokeInterfaceFromGlobal RevokeInterfaceFromGlobal(MemorySegment segment, SegmentScope scope) {
        return RevokeInterfaceFromGlobal.ofAddress(RevokeInterfaceFromGlobal$get(segment), scope);
    }
    static final FunctionDescriptor GetInterfaceFromGlobal$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GetInterfaceFromGlobal_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetInterfaceFromGlobal_UP$MH = RuntimeHelper.upcallHandle(GetInterfaceFromGlobal.class, "apply", IGlobalInterfaceTableVtbl.GetInterfaceFromGlobal_UP$FUNC);
    static final FunctionDescriptor GetInterfaceFromGlobal_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetInterfaceFromGlobal_DOWN$MH = RuntimeHelper.downcallHandle(
        IGlobalInterfaceTableVtbl.GetInterfaceFromGlobal_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*GetInterfaceFromGlobal)(IGlobalInterfaceTable*,DWORD,const IID*,void**);
     * }
     */
    public interface GetInterfaceFromGlobal {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(GetInterfaceFromGlobal fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IGlobalInterfaceTableVtbl.GetInterfaceFromGlobal_UP$MH, fi, IGlobalInterfaceTableVtbl.GetInterfaceFromGlobal$FUNC, scope);
        }
        static GetInterfaceFromGlobal ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (int)IGlobalInterfaceTableVtbl.GetInterfaceFromGlobal_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetInterfaceFromGlobal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetInterfaceFromGlobal"));
    public static VarHandle GetInterfaceFromGlobal$VH() {
        return IGlobalInterfaceTableVtbl.GetInterfaceFromGlobal$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetInterfaceFromGlobal)(IGlobalInterfaceTable*,DWORD,const IID*,void**);
     * }
     */
    public static MemorySegment GetInterfaceFromGlobal$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IGlobalInterfaceTableVtbl.GetInterfaceFromGlobal$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetInterfaceFromGlobal)(IGlobalInterfaceTable*,DWORD,const IID*,void**);
     * }
     */
    public static void GetInterfaceFromGlobal$set(MemorySegment seg, MemorySegment x) {
        IGlobalInterfaceTableVtbl.GetInterfaceFromGlobal$VH.set(seg, x);
    }
    public static MemorySegment GetInterfaceFromGlobal$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IGlobalInterfaceTableVtbl.GetInterfaceFromGlobal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetInterfaceFromGlobal$set(MemorySegment seg, long index, MemorySegment x) {
        IGlobalInterfaceTableVtbl.GetInterfaceFromGlobal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetInterfaceFromGlobal GetInterfaceFromGlobal(MemorySegment segment, SegmentScope scope) {
        return GetInterfaceFromGlobal.ofAddress(GetInterfaceFromGlobal$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

