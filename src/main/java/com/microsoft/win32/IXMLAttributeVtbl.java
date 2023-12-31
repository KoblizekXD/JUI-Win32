// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IXMLAttributeVtbl {
 *     HRESULT (*QueryInterface)(IXMLAttribute*,const IID*,void**);
 *     ULONG (*AddRef)(IXMLAttribute*);
 *     ULONG (*Release)(IXMLAttribute*);
 *     HRESULT (*GetTypeInfoCount)(IXMLAttribute*,UINT*);
 *     HRESULT (*GetTypeInfo)(IXMLAttribute*,UINT,LCID,ITypeInfo**);
 *     HRESULT (*GetIDsOfNames)(IXMLAttribute*,const IID*,LPOLESTR*,UINT,LCID,DISPID*);
 *     HRESULT (*Invoke)(IXMLAttribute*,DISPID,const IID*,LCID,WORD,DISPPARAMS*,VARIANT*,EXCEPINFO*,UINT*);
 *     HRESULT (*get_name)(IXMLAttribute*,BSTR*);
 *     HRESULT (*get_value)(IXMLAttribute*,BSTR*);
 * };
 * }
 */
public class IXMLAttributeVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("GetTypeInfoCount"),
        Constants$root.C_POINTER$LAYOUT.withName("GetTypeInfo"),
        Constants$root.C_POINTER$LAYOUT.withName("GetIDsOfNames"),
        Constants$root.C_POINTER$LAYOUT.withName("Invoke"),
        Constants$root.C_POINTER$LAYOUT.withName("get_name"),
        Constants$root.C_POINTER$LAYOUT.withName("get_value")
    ).withName("IXMLAttributeVtbl");
    public static MemoryLayout $LAYOUT() {
        return IXMLAttributeVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IXMLAttributeVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IXMLAttributeVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IXMLAttribute*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IXMLAttributeVtbl.QueryInterface_UP$MH, fi, IXMLAttributeVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IXMLAttributeVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IXMLAttributeVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IXMLAttribute*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IXMLAttributeVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IXMLAttribute*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IXMLAttributeVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IXMLAttributeVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IXMLAttributeVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IXMLAttributeVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IXMLAttributeVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IXMLAttribute*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IXMLAttributeVtbl.AddRef_UP$MH, fi, IXMLAttributeVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IXMLAttributeVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IXMLAttributeVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IXMLAttribute*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IXMLAttributeVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IXMLAttribute*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IXMLAttributeVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IXMLAttributeVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IXMLAttributeVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IXMLAttributeVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IXMLAttributeVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IXMLAttribute*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IXMLAttributeVtbl.Release_UP$MH, fi, IXMLAttributeVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IXMLAttributeVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IXMLAttributeVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IXMLAttribute*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IXMLAttributeVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IXMLAttribute*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IXMLAttributeVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IXMLAttributeVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IXMLAttributeVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor GetTypeInfoCount$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GetTypeInfoCount_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTypeInfoCount_UP$MH = RuntimeHelper.upcallHandle(GetTypeInfoCount.class, "apply", IXMLAttributeVtbl.GetTypeInfoCount_UP$FUNC);
    static final FunctionDescriptor GetTypeInfoCount_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTypeInfoCount_DOWN$MH = RuntimeHelper.downcallHandle(
        IXMLAttributeVtbl.GetTypeInfoCount_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*GetTypeInfoCount)(IXMLAttribute*,UINT*);
     * }
     */
    public interface GetTypeInfoCount {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetTypeInfoCount fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IXMLAttributeVtbl.GetTypeInfoCount_UP$MH, fi, IXMLAttributeVtbl.GetTypeInfoCount$FUNC, scope);
        }
        static GetTypeInfoCount ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IXMLAttributeVtbl.GetTypeInfoCount_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetTypeInfoCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetTypeInfoCount"));
    public static VarHandle GetTypeInfoCount$VH() {
        return IXMLAttributeVtbl.GetTypeInfoCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetTypeInfoCount)(IXMLAttribute*,UINT*);
     * }
     */
    public static MemorySegment GetTypeInfoCount$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IXMLAttributeVtbl.GetTypeInfoCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetTypeInfoCount)(IXMLAttribute*,UINT*);
     * }
     */
    public static void GetTypeInfoCount$set(MemorySegment seg, MemorySegment x) {
        IXMLAttributeVtbl.GetTypeInfoCount$VH.set(seg, x);
    }
    public static MemorySegment GetTypeInfoCount$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IXMLAttributeVtbl.GetTypeInfoCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetTypeInfoCount$set(MemorySegment seg, long index, MemorySegment x) {
        IXMLAttributeVtbl.GetTypeInfoCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetTypeInfoCount GetTypeInfoCount(MemorySegment segment, SegmentScope scope) {
        return GetTypeInfoCount.ofAddress(GetTypeInfoCount$get(segment), scope);
    }
    static final FunctionDescriptor GetTypeInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GetTypeInfo_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTypeInfo_UP$MH = RuntimeHelper.upcallHandle(GetTypeInfo.class, "apply", IXMLAttributeVtbl.GetTypeInfo_UP$FUNC);
    static final FunctionDescriptor GetTypeInfo_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTypeInfo_DOWN$MH = RuntimeHelper.downcallHandle(
        IXMLAttributeVtbl.GetTypeInfo_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*GetTypeInfo)(IXMLAttribute*,UINT,LCID,ITypeInfo**);
     * }
     */
    public interface GetTypeInfo {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(GetTypeInfo fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IXMLAttributeVtbl.GetTypeInfo_UP$MH, fi, IXMLAttributeVtbl.GetTypeInfo$FUNC, scope);
        }
        static GetTypeInfo ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (int)IXMLAttributeVtbl.GetTypeInfo_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetTypeInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetTypeInfo"));
    public static VarHandle GetTypeInfo$VH() {
        return IXMLAttributeVtbl.GetTypeInfo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetTypeInfo)(IXMLAttribute*,UINT,LCID,ITypeInfo**);
     * }
     */
    public static MemorySegment GetTypeInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IXMLAttributeVtbl.GetTypeInfo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetTypeInfo)(IXMLAttribute*,UINT,LCID,ITypeInfo**);
     * }
     */
    public static void GetTypeInfo$set(MemorySegment seg, MemorySegment x) {
        IXMLAttributeVtbl.GetTypeInfo$VH.set(seg, x);
    }
    public static MemorySegment GetTypeInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IXMLAttributeVtbl.GetTypeInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetTypeInfo$set(MemorySegment seg, long index, MemorySegment x) {
        IXMLAttributeVtbl.GetTypeInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetTypeInfo GetTypeInfo(MemorySegment segment, SegmentScope scope) {
        return GetTypeInfo.ofAddress(GetTypeInfo$get(segment), scope);
    }
    static final FunctionDescriptor GetIDsOfNames$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GetIDsOfNames_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetIDsOfNames_UP$MH = RuntimeHelper.upcallHandle(GetIDsOfNames.class, "apply", IXMLAttributeVtbl.GetIDsOfNames_UP$FUNC);
    static final FunctionDescriptor GetIDsOfNames_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetIDsOfNames_DOWN$MH = RuntimeHelper.downcallHandle(
        IXMLAttributeVtbl.GetIDsOfNames_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*GetIDsOfNames)(IXMLAttribute*,const IID*,LPOLESTR*,UINT,LCID,DISPID*);
     * }
     */
    public interface GetIDsOfNames {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, int _x4, java.lang.foreign.MemorySegment _x5);
        static MemorySegment allocate(GetIDsOfNames fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IXMLAttributeVtbl.GetIDsOfNames_UP$MH, fi, IXMLAttributeVtbl.GetIDsOfNames$FUNC, scope);
        }
        static GetIDsOfNames ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, int __x4, java.lang.foreign.MemorySegment __x5) -> {
                try {
                    return (int)IXMLAttributeVtbl.GetIDsOfNames_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetIDsOfNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetIDsOfNames"));
    public static VarHandle GetIDsOfNames$VH() {
        return IXMLAttributeVtbl.GetIDsOfNames$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetIDsOfNames)(IXMLAttribute*,const IID*,LPOLESTR*,UINT,LCID,DISPID*);
     * }
     */
    public static MemorySegment GetIDsOfNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IXMLAttributeVtbl.GetIDsOfNames$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetIDsOfNames)(IXMLAttribute*,const IID*,LPOLESTR*,UINT,LCID,DISPID*);
     * }
     */
    public static void GetIDsOfNames$set(MemorySegment seg, MemorySegment x) {
        IXMLAttributeVtbl.GetIDsOfNames$VH.set(seg, x);
    }
    public static MemorySegment GetIDsOfNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IXMLAttributeVtbl.GetIDsOfNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetIDsOfNames$set(MemorySegment seg, long index, MemorySegment x) {
        IXMLAttributeVtbl.GetIDsOfNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetIDsOfNames GetIDsOfNames(MemorySegment segment, SegmentScope scope) {
        return GetIDsOfNames.ofAddress(GetIDsOfNames$get(segment), scope);
    }
    static final FunctionDescriptor Invoke$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor Invoke_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Invoke_UP$MH = RuntimeHelper.upcallHandle(Invoke.class, "apply", IXMLAttributeVtbl.Invoke_UP$FUNC);
    static final FunctionDescriptor Invoke_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Invoke_DOWN$MH = RuntimeHelper.downcallHandle(
        IXMLAttributeVtbl.Invoke_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Invoke)(IXMLAttribute*,DISPID,const IID*,LCID,WORD,DISPPARAMS*,VARIANT*,EXCEPINFO*,UINT*);
     * }
     */
    public interface Invoke {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, int _x3, short _x4, java.lang.foreign.MemorySegment _x5, java.lang.foreign.MemorySegment _x6, java.lang.foreign.MemorySegment _x7, java.lang.foreign.MemorySegment _x8);
        static MemorySegment allocate(Invoke fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IXMLAttributeVtbl.Invoke_UP$MH, fi, IXMLAttributeVtbl.Invoke$FUNC, scope);
        }
        static Invoke ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, int __x3, short __x4, java.lang.foreign.MemorySegment __x5, java.lang.foreign.MemorySegment __x6, java.lang.foreign.MemorySegment __x7, java.lang.foreign.MemorySegment __x8) -> {
                try {
                    return (int)IXMLAttributeVtbl.Invoke_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6, __x7, __x8);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Invoke$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Invoke"));
    public static VarHandle Invoke$VH() {
        return IXMLAttributeVtbl.Invoke$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Invoke)(IXMLAttribute*,DISPID,const IID*,LCID,WORD,DISPPARAMS*,VARIANT*,EXCEPINFO*,UINT*);
     * }
     */
    public static MemorySegment Invoke$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IXMLAttributeVtbl.Invoke$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Invoke)(IXMLAttribute*,DISPID,const IID*,LCID,WORD,DISPPARAMS*,VARIANT*,EXCEPINFO*,UINT*);
     * }
     */
    public static void Invoke$set(MemorySegment seg, MemorySegment x) {
        IXMLAttributeVtbl.Invoke$VH.set(seg, x);
    }
    public static MemorySegment Invoke$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IXMLAttributeVtbl.Invoke$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Invoke$set(MemorySegment seg, long index, MemorySegment x) {
        IXMLAttributeVtbl.Invoke$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Invoke Invoke(MemorySegment segment, SegmentScope scope) {
        return Invoke.ofAddress(Invoke$get(segment), scope);
    }
    static final FunctionDescriptor get_name$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_name_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_name_UP$MH = RuntimeHelper.upcallHandle(get_name.class, "apply", IXMLAttributeVtbl.get_name_UP$FUNC);
    static final FunctionDescriptor get_name_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_name_DOWN$MH = RuntimeHelper.downcallHandle(
        IXMLAttributeVtbl.get_name_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*get_name)(IXMLAttribute*,BSTR*);
     * }
     */
    public interface get_name {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(get_name fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IXMLAttributeVtbl.get_name_UP$MH, fi, IXMLAttributeVtbl.get_name$FUNC, scope);
        }
        static get_name ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IXMLAttributeVtbl.get_name_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_name"));
    public static VarHandle get_name$VH() {
        return IXMLAttributeVtbl.get_name$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*get_name)(IXMLAttribute*,BSTR*);
     * }
     */
    public static MemorySegment get_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IXMLAttributeVtbl.get_name$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*get_name)(IXMLAttribute*,BSTR*);
     * }
     */
    public static void get_name$set(MemorySegment seg, MemorySegment x) {
        IXMLAttributeVtbl.get_name$VH.set(seg, x);
    }
    public static MemorySegment get_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IXMLAttributeVtbl.get_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_name$set(MemorySegment seg, long index, MemorySegment x) {
        IXMLAttributeVtbl.get_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_name get_name(MemorySegment segment, SegmentScope scope) {
        return get_name.ofAddress(get_name$get(segment), scope);
    }
    static final FunctionDescriptor get_value$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_value_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_value_UP$MH = RuntimeHelper.upcallHandle(get_value.class, "apply", IXMLAttributeVtbl.get_value_UP$FUNC);
    static final FunctionDescriptor get_value_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_value_DOWN$MH = RuntimeHelper.downcallHandle(
        IXMLAttributeVtbl.get_value_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*get_value)(IXMLAttribute*,BSTR*);
     * }
     */
    public interface get_value {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(get_value fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IXMLAttributeVtbl.get_value_UP$MH, fi, IXMLAttributeVtbl.get_value$FUNC, scope);
        }
        static get_value ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IXMLAttributeVtbl.get_value_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_value"));
    public static VarHandle get_value$VH() {
        return IXMLAttributeVtbl.get_value$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*get_value)(IXMLAttribute*,BSTR*);
     * }
     */
    public static MemorySegment get_value$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IXMLAttributeVtbl.get_value$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*get_value)(IXMLAttribute*,BSTR*);
     * }
     */
    public static void get_value$set(MemorySegment seg, MemorySegment x) {
        IXMLAttributeVtbl.get_value$VH.set(seg, x);
    }
    public static MemorySegment get_value$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IXMLAttributeVtbl.get_value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_value$set(MemorySegment seg, long index, MemorySegment x) {
        IXMLAttributeVtbl.get_value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_value get_value(MemorySegment segment, SegmentScope scope) {
        return get_value.ofAddress(get_value$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


