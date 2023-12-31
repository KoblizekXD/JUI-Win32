// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IMachineGlobalObjectTableVtbl {
 *     HRESULT (*QueryInterface)(IMachineGlobalObjectTable*,const IID*,void**);
 *     ULONG (*AddRef)(IMachineGlobalObjectTable*);
 *     ULONG (*Release)(IMachineGlobalObjectTable*);
 *     HRESULT (*RegisterObject)(IMachineGlobalObjectTable*,const IID*,LPCWSTR,IUnknown*,MachineGlobalObjectTableRegistrationToken*);
 *     HRESULT (*GetObjectA)(IMachineGlobalObjectTable*,const IID*,LPCWSTR,const IID*,void**);
 *     HRESULT (*RevokeObject)(IMachineGlobalObjectTable*,MachineGlobalObjectTableRegistrationToken);
 * };
 * }
 */
public class IMachineGlobalObjectTableVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("RegisterObject"),
        Constants$root.C_POINTER$LAYOUT.withName("GetObjectA"),
        Constants$root.C_POINTER$LAYOUT.withName("RevokeObject")
    ).withName("IMachineGlobalObjectTableVtbl");
    public static MemoryLayout $LAYOUT() {
        return IMachineGlobalObjectTableVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IMachineGlobalObjectTableVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IMachineGlobalObjectTableVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IMachineGlobalObjectTable*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMachineGlobalObjectTableVtbl.QueryInterface_UP$MH, fi, IMachineGlobalObjectTableVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IMachineGlobalObjectTableVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IMachineGlobalObjectTableVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IMachineGlobalObjectTable*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMachineGlobalObjectTableVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IMachineGlobalObjectTable*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IMachineGlobalObjectTableVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMachineGlobalObjectTableVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IMachineGlobalObjectTableVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IMachineGlobalObjectTableVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IMachineGlobalObjectTableVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IMachineGlobalObjectTable*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMachineGlobalObjectTableVtbl.AddRef_UP$MH, fi, IMachineGlobalObjectTableVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IMachineGlobalObjectTableVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IMachineGlobalObjectTableVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IMachineGlobalObjectTable*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMachineGlobalObjectTableVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IMachineGlobalObjectTable*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IMachineGlobalObjectTableVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMachineGlobalObjectTableVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IMachineGlobalObjectTableVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IMachineGlobalObjectTableVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IMachineGlobalObjectTableVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IMachineGlobalObjectTable*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMachineGlobalObjectTableVtbl.Release_UP$MH, fi, IMachineGlobalObjectTableVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IMachineGlobalObjectTableVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IMachineGlobalObjectTableVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IMachineGlobalObjectTable*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMachineGlobalObjectTableVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IMachineGlobalObjectTable*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IMachineGlobalObjectTableVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMachineGlobalObjectTableVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IMachineGlobalObjectTableVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor RegisterObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor RegisterObject_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterObject_UP$MH = RuntimeHelper.upcallHandle(RegisterObject.class, "apply", IMachineGlobalObjectTableVtbl.RegisterObject_UP$FUNC);
    static final FunctionDescriptor RegisterObject_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterObject_DOWN$MH = RuntimeHelper.downcallHandle(
        IMachineGlobalObjectTableVtbl.RegisterObject_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*RegisterObject)(IMachineGlobalObjectTable*,const IID*,LPCWSTR,IUnknown*,MachineGlobalObjectTableRegistrationToken*);
     * }
     */
    public interface RegisterObject {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(RegisterObject fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMachineGlobalObjectTableVtbl.RegisterObject_UP$MH, fi, IMachineGlobalObjectTableVtbl.RegisterObject$FUNC, scope);
        }
        static RegisterObject ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (int)IMachineGlobalObjectTableVtbl.RegisterObject_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle RegisterObject$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RegisterObject"));
    public static VarHandle RegisterObject$VH() {
        return IMachineGlobalObjectTableVtbl.RegisterObject$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*RegisterObject)(IMachineGlobalObjectTable*,const IID*,LPCWSTR,IUnknown*,MachineGlobalObjectTableRegistrationToken*);
     * }
     */
    public static MemorySegment RegisterObject$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMachineGlobalObjectTableVtbl.RegisterObject$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*RegisterObject)(IMachineGlobalObjectTable*,const IID*,LPCWSTR,IUnknown*,MachineGlobalObjectTableRegistrationToken*);
     * }
     */
    public static void RegisterObject$set(MemorySegment seg, MemorySegment x) {
        IMachineGlobalObjectTableVtbl.RegisterObject$VH.set(seg, x);
    }
    public static MemorySegment RegisterObject$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMachineGlobalObjectTableVtbl.RegisterObject$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RegisterObject$set(MemorySegment seg, long index, MemorySegment x) {
        IMachineGlobalObjectTableVtbl.RegisterObject$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static RegisterObject RegisterObject(MemorySegment segment, SegmentScope scope) {
        return RegisterObject.ofAddress(RegisterObject$get(segment), scope);
    }
    static final FunctionDescriptor GetObjectA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GetObjectA_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetObjectA_UP$MH = RuntimeHelper.upcallHandle(GetObjectA.class, "apply", IMachineGlobalObjectTableVtbl.GetObjectA_UP$FUNC);
    static final FunctionDescriptor GetObjectA_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetObjectA_DOWN$MH = RuntimeHelper.downcallHandle(
        IMachineGlobalObjectTableVtbl.GetObjectA_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*GetObjectA)(IMachineGlobalObjectTable*,const IID*,LPCWSTR,const IID*,void**);
     * }
     */
    public interface GetObjectA {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(GetObjectA fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMachineGlobalObjectTableVtbl.GetObjectA_UP$MH, fi, IMachineGlobalObjectTableVtbl.GetObjectA$FUNC, scope);
        }
        static GetObjectA ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (int)IMachineGlobalObjectTableVtbl.GetObjectA_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetObjectA$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetObjectA"));
    public static VarHandle GetObjectA$VH() {
        return IMachineGlobalObjectTableVtbl.GetObjectA$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetObjectA)(IMachineGlobalObjectTable*,const IID*,LPCWSTR,const IID*,void**);
     * }
     */
    public static MemorySegment GetObjectA$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMachineGlobalObjectTableVtbl.GetObjectA$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetObjectA)(IMachineGlobalObjectTable*,const IID*,LPCWSTR,const IID*,void**);
     * }
     */
    public static void GetObjectA$set(MemorySegment seg, MemorySegment x) {
        IMachineGlobalObjectTableVtbl.GetObjectA$VH.set(seg, x);
    }
    public static MemorySegment GetObjectA$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMachineGlobalObjectTableVtbl.GetObjectA$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetObjectA$set(MemorySegment seg, long index, MemorySegment x) {
        IMachineGlobalObjectTableVtbl.GetObjectA$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetObjectA GetObjectA(MemorySegment segment, SegmentScope scope) {
        return GetObjectA.ofAddress(GetObjectA$get(segment), scope);
    }
    static final FunctionDescriptor RevokeObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor RevokeObject_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RevokeObject_UP$MH = RuntimeHelper.upcallHandle(RevokeObject.class, "apply", IMachineGlobalObjectTableVtbl.RevokeObject_UP$FUNC);
    static final FunctionDescriptor RevokeObject_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RevokeObject_DOWN$MH = RuntimeHelper.downcallHandle(
        IMachineGlobalObjectTableVtbl.RevokeObject_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*RevokeObject)(IMachineGlobalObjectTable*,MachineGlobalObjectTableRegistrationToken);
     * }
     */
    public interface RevokeObject {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(RevokeObject fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMachineGlobalObjectTableVtbl.RevokeObject_UP$MH, fi, IMachineGlobalObjectTableVtbl.RevokeObject$FUNC, scope);
        }
        static RevokeObject ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IMachineGlobalObjectTableVtbl.RevokeObject_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle RevokeObject$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RevokeObject"));
    public static VarHandle RevokeObject$VH() {
        return IMachineGlobalObjectTableVtbl.RevokeObject$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*RevokeObject)(IMachineGlobalObjectTable*,MachineGlobalObjectTableRegistrationToken);
     * }
     */
    public static MemorySegment RevokeObject$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMachineGlobalObjectTableVtbl.RevokeObject$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*RevokeObject)(IMachineGlobalObjectTable*,MachineGlobalObjectTableRegistrationToken);
     * }
     */
    public static void RevokeObject$set(MemorySegment seg, MemorySegment x) {
        IMachineGlobalObjectTableVtbl.RevokeObject$VH.set(seg, x);
    }
    public static MemorySegment RevokeObject$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMachineGlobalObjectTableVtbl.RevokeObject$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RevokeObject$set(MemorySegment seg, long index, MemorySegment x) {
        IMachineGlobalObjectTableVtbl.RevokeObject$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static RevokeObject RevokeObject(MemorySegment segment, SegmentScope scope) {
        return RevokeObject.ofAddress(RevokeObject$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


