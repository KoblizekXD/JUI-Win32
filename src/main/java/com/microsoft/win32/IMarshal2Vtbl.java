// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IMarshal2Vtbl {
 *     HRESULT (*QueryInterface)(IMarshal2*,const IID*,void**);
 *     ULONG (*AddRef)(IMarshal2*);
 *     ULONG (*Release)(IMarshal2*);
 *     HRESULT (*GetUnmarshalClass)(IMarshal2*,const IID*,void*,DWORD,void*,DWORD,CLSID*);
 *     HRESULT (*GetMarshalSizeMax)(IMarshal2*,const IID*,void*,DWORD,void*,DWORD,DWORD*);
 *     HRESULT (*MarshalInterface)(IMarshal2*,IStream*,const IID*,void*,DWORD,void*,DWORD);
 *     HRESULT (*UnmarshalInterface)(IMarshal2*,IStream*,const IID*,void**);
 *     HRESULT (*ReleaseMarshalData)(IMarshal2*,IStream*);
 *     HRESULT (*DisconnectObject)(IMarshal2*,DWORD);
 * };
 * }
 */
public class IMarshal2Vtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("GetUnmarshalClass"),
        Constants$root.C_POINTER$LAYOUT.withName("GetMarshalSizeMax"),
        Constants$root.C_POINTER$LAYOUT.withName("MarshalInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("UnmarshalInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("ReleaseMarshalData"),
        Constants$root.C_POINTER$LAYOUT.withName("DisconnectObject")
    ).withName("IMarshal2Vtbl");
    public static MemoryLayout $LAYOUT() {
        return IMarshal2Vtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IMarshal2Vtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IMarshal2Vtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IMarshal2*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMarshal2Vtbl.QueryInterface_UP$MH, fi, IMarshal2Vtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IMarshal2Vtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IMarshal2Vtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IMarshal2*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMarshal2Vtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IMarshal2*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IMarshal2Vtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMarshal2Vtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IMarshal2Vtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IMarshal2Vtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IMarshal2Vtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IMarshal2*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMarshal2Vtbl.AddRef_UP$MH, fi, IMarshal2Vtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IMarshal2Vtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IMarshal2Vtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IMarshal2*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMarshal2Vtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IMarshal2*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IMarshal2Vtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMarshal2Vtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IMarshal2Vtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IMarshal2Vtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IMarshal2Vtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IMarshal2*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMarshal2Vtbl.Release_UP$MH, fi, IMarshal2Vtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IMarshal2Vtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IMarshal2Vtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IMarshal2*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMarshal2Vtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IMarshal2*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IMarshal2Vtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMarshal2Vtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IMarshal2Vtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor GetUnmarshalClass$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GetUnmarshalClass_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUnmarshalClass_UP$MH = RuntimeHelper.upcallHandle(GetUnmarshalClass.class, "apply", IMarshal2Vtbl.GetUnmarshalClass_UP$FUNC);
    static final FunctionDescriptor GetUnmarshalClass_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUnmarshalClass_DOWN$MH = RuntimeHelper.downcallHandle(
        IMarshal2Vtbl.GetUnmarshalClass_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*GetUnmarshalClass)(IMarshal2*,const IID*,void*,DWORD,void*,DWORD,CLSID*);
     * }
     */
    public interface GetUnmarshalClass {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, java.lang.foreign.MemorySegment _x4, int _x5, java.lang.foreign.MemorySegment _x6);
        static MemorySegment allocate(GetUnmarshalClass fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMarshal2Vtbl.GetUnmarshalClass_UP$MH, fi, IMarshal2Vtbl.GetUnmarshalClass$FUNC, scope);
        }
        static GetUnmarshalClass ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, java.lang.foreign.MemorySegment __x4, int __x5, java.lang.foreign.MemorySegment __x6) -> {
                try {
                    return (int)IMarshal2Vtbl.GetUnmarshalClass_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetUnmarshalClass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetUnmarshalClass"));
    public static VarHandle GetUnmarshalClass$VH() {
        return IMarshal2Vtbl.GetUnmarshalClass$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetUnmarshalClass)(IMarshal2*,const IID*,void*,DWORD,void*,DWORD,CLSID*);
     * }
     */
    public static MemorySegment GetUnmarshalClass$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMarshal2Vtbl.GetUnmarshalClass$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetUnmarshalClass)(IMarshal2*,const IID*,void*,DWORD,void*,DWORD,CLSID*);
     * }
     */
    public static void GetUnmarshalClass$set(MemorySegment seg, MemorySegment x) {
        IMarshal2Vtbl.GetUnmarshalClass$VH.set(seg, x);
    }
    public static MemorySegment GetUnmarshalClass$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMarshal2Vtbl.GetUnmarshalClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetUnmarshalClass$set(MemorySegment seg, long index, MemorySegment x) {
        IMarshal2Vtbl.GetUnmarshalClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetUnmarshalClass GetUnmarshalClass(MemorySegment segment, SegmentScope scope) {
        return GetUnmarshalClass.ofAddress(GetUnmarshalClass$get(segment), scope);
    }
    static final FunctionDescriptor GetMarshalSizeMax$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GetMarshalSizeMax_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMarshalSizeMax_UP$MH = RuntimeHelper.upcallHandle(GetMarshalSizeMax.class, "apply", IMarshal2Vtbl.GetMarshalSizeMax_UP$FUNC);
    static final FunctionDescriptor GetMarshalSizeMax_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMarshalSizeMax_DOWN$MH = RuntimeHelper.downcallHandle(
        IMarshal2Vtbl.GetMarshalSizeMax_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*GetMarshalSizeMax)(IMarshal2*,const IID*,void*,DWORD,void*,DWORD,DWORD*);
     * }
     */
    public interface GetMarshalSizeMax {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, java.lang.foreign.MemorySegment _x4, int _x5, java.lang.foreign.MemorySegment _x6);
        static MemorySegment allocate(GetMarshalSizeMax fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMarshal2Vtbl.GetMarshalSizeMax_UP$MH, fi, IMarshal2Vtbl.GetMarshalSizeMax$FUNC, scope);
        }
        static GetMarshalSizeMax ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, java.lang.foreign.MemorySegment __x4, int __x5, java.lang.foreign.MemorySegment __x6) -> {
                try {
                    return (int)IMarshal2Vtbl.GetMarshalSizeMax_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetMarshalSizeMax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetMarshalSizeMax"));
    public static VarHandle GetMarshalSizeMax$VH() {
        return IMarshal2Vtbl.GetMarshalSizeMax$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetMarshalSizeMax)(IMarshal2*,const IID*,void*,DWORD,void*,DWORD,DWORD*);
     * }
     */
    public static MemorySegment GetMarshalSizeMax$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMarshal2Vtbl.GetMarshalSizeMax$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetMarshalSizeMax)(IMarshal2*,const IID*,void*,DWORD,void*,DWORD,DWORD*);
     * }
     */
    public static void GetMarshalSizeMax$set(MemorySegment seg, MemorySegment x) {
        IMarshal2Vtbl.GetMarshalSizeMax$VH.set(seg, x);
    }
    public static MemorySegment GetMarshalSizeMax$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMarshal2Vtbl.GetMarshalSizeMax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetMarshalSizeMax$set(MemorySegment seg, long index, MemorySegment x) {
        IMarshal2Vtbl.GetMarshalSizeMax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetMarshalSizeMax GetMarshalSizeMax(MemorySegment segment, SegmentScope scope) {
        return GetMarshalSizeMax.ofAddress(GetMarshalSizeMax$get(segment), scope);
    }
    static final FunctionDescriptor MarshalInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor MarshalInterface_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MarshalInterface_UP$MH = RuntimeHelper.upcallHandle(MarshalInterface.class, "apply", IMarshal2Vtbl.MarshalInterface_UP$FUNC);
    static final FunctionDescriptor MarshalInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MarshalInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IMarshal2Vtbl.MarshalInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*MarshalInterface)(IMarshal2*,IStream*,const IID*,void*,DWORD,void*,DWORD);
     * }
     */
    public interface MarshalInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, int _x4, java.lang.foreign.MemorySegment _x5, int _x6);
        static MemorySegment allocate(MarshalInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMarshal2Vtbl.MarshalInterface_UP$MH, fi, IMarshal2Vtbl.MarshalInterface$FUNC, scope);
        }
        static MarshalInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, int __x4, java.lang.foreign.MemorySegment __x5, int __x6) -> {
                try {
                    return (int)IMarshal2Vtbl.MarshalInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle MarshalInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MarshalInterface"));
    public static VarHandle MarshalInterface$VH() {
        return IMarshal2Vtbl.MarshalInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*MarshalInterface)(IMarshal2*,IStream*,const IID*,void*,DWORD,void*,DWORD);
     * }
     */
    public static MemorySegment MarshalInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMarshal2Vtbl.MarshalInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*MarshalInterface)(IMarshal2*,IStream*,const IID*,void*,DWORD,void*,DWORD);
     * }
     */
    public static void MarshalInterface$set(MemorySegment seg, MemorySegment x) {
        IMarshal2Vtbl.MarshalInterface$VH.set(seg, x);
    }
    public static MemorySegment MarshalInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMarshal2Vtbl.MarshalInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MarshalInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IMarshal2Vtbl.MarshalInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MarshalInterface MarshalInterface(MemorySegment segment, SegmentScope scope) {
        return MarshalInterface.ofAddress(MarshalInterface$get(segment), scope);
    }
    static final FunctionDescriptor UnmarshalInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor UnmarshalInterface_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnmarshalInterface_UP$MH = RuntimeHelper.upcallHandle(UnmarshalInterface.class, "apply", IMarshal2Vtbl.UnmarshalInterface_UP$FUNC);
    static final FunctionDescriptor UnmarshalInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnmarshalInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IMarshal2Vtbl.UnmarshalInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*UnmarshalInterface)(IMarshal2*,IStream*,const IID*,void**);
     * }
     */
    public interface UnmarshalInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(UnmarshalInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMarshal2Vtbl.UnmarshalInterface_UP$MH, fi, IMarshal2Vtbl.UnmarshalInterface$FUNC, scope);
        }
        static UnmarshalInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (int)IMarshal2Vtbl.UnmarshalInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle UnmarshalInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UnmarshalInterface"));
    public static VarHandle UnmarshalInterface$VH() {
        return IMarshal2Vtbl.UnmarshalInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*UnmarshalInterface)(IMarshal2*,IStream*,const IID*,void**);
     * }
     */
    public static MemorySegment UnmarshalInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMarshal2Vtbl.UnmarshalInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*UnmarshalInterface)(IMarshal2*,IStream*,const IID*,void**);
     * }
     */
    public static void UnmarshalInterface$set(MemorySegment seg, MemorySegment x) {
        IMarshal2Vtbl.UnmarshalInterface$VH.set(seg, x);
    }
    public static MemorySegment UnmarshalInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMarshal2Vtbl.UnmarshalInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UnmarshalInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IMarshal2Vtbl.UnmarshalInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static UnmarshalInterface UnmarshalInterface(MemorySegment segment, SegmentScope scope) {
        return UnmarshalInterface.ofAddress(UnmarshalInterface$get(segment), scope);
    }
    static final FunctionDescriptor ReleaseMarshalData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor ReleaseMarshalData_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReleaseMarshalData_UP$MH = RuntimeHelper.upcallHandle(ReleaseMarshalData.class, "apply", IMarshal2Vtbl.ReleaseMarshalData_UP$FUNC);
    static final FunctionDescriptor ReleaseMarshalData_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReleaseMarshalData_DOWN$MH = RuntimeHelper.downcallHandle(
        IMarshal2Vtbl.ReleaseMarshalData_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*ReleaseMarshalData)(IMarshal2*,IStream*);
     * }
     */
    public interface ReleaseMarshalData {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(ReleaseMarshalData fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMarshal2Vtbl.ReleaseMarshalData_UP$MH, fi, IMarshal2Vtbl.ReleaseMarshalData$FUNC, scope);
        }
        static ReleaseMarshalData ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IMarshal2Vtbl.ReleaseMarshalData_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ReleaseMarshalData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReleaseMarshalData"));
    public static VarHandle ReleaseMarshalData$VH() {
        return IMarshal2Vtbl.ReleaseMarshalData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*ReleaseMarshalData)(IMarshal2*,IStream*);
     * }
     */
    public static MemorySegment ReleaseMarshalData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMarshal2Vtbl.ReleaseMarshalData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*ReleaseMarshalData)(IMarshal2*,IStream*);
     * }
     */
    public static void ReleaseMarshalData$set(MemorySegment seg, MemorySegment x) {
        IMarshal2Vtbl.ReleaseMarshalData$VH.set(seg, x);
    }
    public static MemorySegment ReleaseMarshalData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMarshal2Vtbl.ReleaseMarshalData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReleaseMarshalData$set(MemorySegment seg, long index, MemorySegment x) {
        IMarshal2Vtbl.ReleaseMarshalData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ReleaseMarshalData ReleaseMarshalData(MemorySegment segment, SegmentScope scope) {
        return ReleaseMarshalData.ofAddress(ReleaseMarshalData$get(segment), scope);
    }
    static final FunctionDescriptor DisconnectObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor DisconnectObject_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DisconnectObject_UP$MH = RuntimeHelper.upcallHandle(DisconnectObject.class, "apply", IMarshal2Vtbl.DisconnectObject_UP$FUNC);
    static final FunctionDescriptor DisconnectObject_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DisconnectObject_DOWN$MH = RuntimeHelper.downcallHandle(
        IMarshal2Vtbl.DisconnectObject_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*DisconnectObject)(IMarshal2*,DWORD);
     * }
     */
    public interface DisconnectObject {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(DisconnectObject fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMarshal2Vtbl.DisconnectObject_UP$MH, fi, IMarshal2Vtbl.DisconnectObject$FUNC, scope);
        }
        static DisconnectObject ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)IMarshal2Vtbl.DisconnectObject_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle DisconnectObject$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DisconnectObject"));
    public static VarHandle DisconnectObject$VH() {
        return IMarshal2Vtbl.DisconnectObject$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*DisconnectObject)(IMarshal2*,DWORD);
     * }
     */
    public static MemorySegment DisconnectObject$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMarshal2Vtbl.DisconnectObject$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*DisconnectObject)(IMarshal2*,DWORD);
     * }
     */
    public static void DisconnectObject$set(MemorySegment seg, MemorySegment x) {
        IMarshal2Vtbl.DisconnectObject$VH.set(seg, x);
    }
    public static MemorySegment DisconnectObject$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMarshal2Vtbl.DisconnectObject$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DisconnectObject$set(MemorySegment seg, long index, MemorySegment x) {
        IMarshal2Vtbl.DisconnectObject$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static DisconnectObject DisconnectObject(MemorySegment segment, SegmentScope scope) {
        return DisconnectObject.ofAddress(DisconnectObject$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


