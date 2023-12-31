// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IInternetBindInfoVtbl {
 *     HRESULT (*QueryInterface)(IInternetBindInfo*,const IID*,void**);
 *     ULONG (*AddRef)(IInternetBindInfo*);
 *     ULONG (*Release)(IInternetBindInfo*);
 *     HRESULT (*GetBindInfo)(IInternetBindInfo*,DWORD*,BINDINFO*);
 *     HRESULT (*GetBindString)(IInternetBindInfo*,ULONG,LPOLESTR*,ULONG,ULONG*);
 * };
 * }
 */
public class IInternetBindInfoVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("GetBindInfo"),
        Constants$root.C_POINTER$LAYOUT.withName("GetBindString")
    ).withName("IInternetBindInfoVtbl");
    public static MemoryLayout $LAYOUT() {
        return IInternetBindInfoVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IInternetBindInfoVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetBindInfoVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IInternetBindInfo*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetBindInfoVtbl.QueryInterface_UP$MH, fi, IInternetBindInfoVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IInternetBindInfoVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IInternetBindInfoVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IInternetBindInfo*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetBindInfoVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IInternetBindInfo*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IInternetBindInfoVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetBindInfoVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetBindInfoVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IInternetBindInfoVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetBindInfoVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IInternetBindInfo*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetBindInfoVtbl.AddRef_UP$MH, fi, IInternetBindInfoVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IInternetBindInfoVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IInternetBindInfoVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IInternetBindInfo*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetBindInfoVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IInternetBindInfo*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IInternetBindInfoVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetBindInfoVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetBindInfoVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IInternetBindInfoVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetBindInfoVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IInternetBindInfo*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetBindInfoVtbl.Release_UP$MH, fi, IInternetBindInfoVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IInternetBindInfoVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IInternetBindInfoVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IInternetBindInfo*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetBindInfoVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IInternetBindInfo*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IInternetBindInfoVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetBindInfoVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetBindInfoVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor GetBindInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GetBindInfo_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetBindInfo_UP$MH = RuntimeHelper.upcallHandle(GetBindInfo.class, "apply", IInternetBindInfoVtbl.GetBindInfo_UP$FUNC);
    static final FunctionDescriptor GetBindInfo_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetBindInfo_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetBindInfoVtbl.GetBindInfo_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*GetBindInfo)(IInternetBindInfo*,DWORD*,BINDINFO*);
     * }
     */
    public interface GetBindInfo {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(GetBindInfo fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetBindInfoVtbl.GetBindInfo_UP$MH, fi, IInternetBindInfoVtbl.GetBindInfo$FUNC, scope);
        }
        static GetBindInfo ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IInternetBindInfoVtbl.GetBindInfo_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetBindInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetBindInfo"));
    public static VarHandle GetBindInfo$VH() {
        return IInternetBindInfoVtbl.GetBindInfo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetBindInfo)(IInternetBindInfo*,DWORD*,BINDINFO*);
     * }
     */
    public static MemorySegment GetBindInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetBindInfoVtbl.GetBindInfo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetBindInfo)(IInternetBindInfo*,DWORD*,BINDINFO*);
     * }
     */
    public static void GetBindInfo$set(MemorySegment seg, MemorySegment x) {
        IInternetBindInfoVtbl.GetBindInfo$VH.set(seg, x);
    }
    public static MemorySegment GetBindInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetBindInfoVtbl.GetBindInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetBindInfo$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetBindInfoVtbl.GetBindInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetBindInfo GetBindInfo(MemorySegment segment, SegmentScope scope) {
        return GetBindInfo.ofAddress(GetBindInfo$get(segment), scope);
    }
    static final FunctionDescriptor GetBindString$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GetBindString_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetBindString_UP$MH = RuntimeHelper.upcallHandle(GetBindString.class, "apply", IInternetBindInfoVtbl.GetBindString_UP$FUNC);
    static final FunctionDescriptor GetBindString_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetBindString_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetBindInfoVtbl.GetBindString_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*GetBindString)(IInternetBindInfo*,ULONG,LPOLESTR*,ULONG,ULONG*);
     * }
     */
    public interface GetBindString {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, int _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(GetBindString fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetBindInfoVtbl.GetBindString_UP$MH, fi, IInternetBindInfoVtbl.GetBindString$FUNC, scope);
        }
        static GetBindString ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, int __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (int)IInternetBindInfoVtbl.GetBindString_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetBindString$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetBindString"));
    public static VarHandle GetBindString$VH() {
        return IInternetBindInfoVtbl.GetBindString$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetBindString)(IInternetBindInfo*,ULONG,LPOLESTR*,ULONG,ULONG*);
     * }
     */
    public static MemorySegment GetBindString$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetBindInfoVtbl.GetBindString$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetBindString)(IInternetBindInfo*,ULONG,LPOLESTR*,ULONG,ULONG*);
     * }
     */
    public static void GetBindString$set(MemorySegment seg, MemorySegment x) {
        IInternetBindInfoVtbl.GetBindString$VH.set(seg, x);
    }
    public static MemorySegment GetBindString$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetBindInfoVtbl.GetBindString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetBindString$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetBindInfoVtbl.GetBindString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetBindString GetBindString(MemorySegment segment, SegmentScope scope) {
        return GetBindString.ofAddress(GetBindString$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


