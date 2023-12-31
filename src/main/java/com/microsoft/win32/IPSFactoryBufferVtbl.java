// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IPSFactoryBufferVtbl {
 *     HRESULT (*QueryInterface)(IPSFactoryBuffer*,const IID*,void**);
 *     ULONG (*AddRef)(IPSFactoryBuffer*);
 *     ULONG (*Release)(IPSFactoryBuffer*);
 *     HRESULT (*CreateProxy)(IPSFactoryBuffer*,IUnknown*,const IID*,IRpcProxyBuffer**,void**);
 *     HRESULT (*CreateStub)(IPSFactoryBuffer*,const IID*,IUnknown*,IRpcStubBuffer**);
 * };
 * }
 */
public class IPSFactoryBufferVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("CreateProxy"),
        Constants$root.C_POINTER$LAYOUT.withName("CreateStub")
    ).withName("IPSFactoryBufferVtbl");
    public static MemoryLayout $LAYOUT() {
        return IPSFactoryBufferVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IPSFactoryBufferVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IPSFactoryBufferVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IPSFactoryBuffer*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IPSFactoryBufferVtbl.QueryInterface_UP$MH, fi, IPSFactoryBufferVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IPSFactoryBufferVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IPSFactoryBufferVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IPSFactoryBuffer*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IPSFactoryBufferVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IPSFactoryBuffer*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IPSFactoryBufferVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IPSFactoryBufferVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IPSFactoryBufferVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IPSFactoryBufferVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IPSFactoryBufferVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IPSFactoryBuffer*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IPSFactoryBufferVtbl.AddRef_UP$MH, fi, IPSFactoryBufferVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IPSFactoryBufferVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IPSFactoryBufferVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IPSFactoryBuffer*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IPSFactoryBufferVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IPSFactoryBuffer*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IPSFactoryBufferVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IPSFactoryBufferVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IPSFactoryBufferVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IPSFactoryBufferVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IPSFactoryBufferVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IPSFactoryBuffer*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IPSFactoryBufferVtbl.Release_UP$MH, fi, IPSFactoryBufferVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IPSFactoryBufferVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IPSFactoryBufferVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IPSFactoryBuffer*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IPSFactoryBufferVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IPSFactoryBuffer*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IPSFactoryBufferVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IPSFactoryBufferVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IPSFactoryBufferVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor CreateProxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor CreateProxy_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateProxy_UP$MH = RuntimeHelper.upcallHandle(CreateProxy.class, "apply", IPSFactoryBufferVtbl.CreateProxy_UP$FUNC);
    static final FunctionDescriptor CreateProxy_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateProxy_DOWN$MH = RuntimeHelper.downcallHandle(
        IPSFactoryBufferVtbl.CreateProxy_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*CreateProxy)(IPSFactoryBuffer*,IUnknown*,const IID*,IRpcProxyBuffer**,void**);
     * }
     */
    public interface CreateProxy {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(CreateProxy fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IPSFactoryBufferVtbl.CreateProxy_UP$MH, fi, IPSFactoryBufferVtbl.CreateProxy$FUNC, scope);
        }
        static CreateProxy ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (int)IPSFactoryBufferVtbl.CreateProxy_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle CreateProxy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CreateProxy"));
    public static VarHandle CreateProxy$VH() {
        return IPSFactoryBufferVtbl.CreateProxy$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*CreateProxy)(IPSFactoryBuffer*,IUnknown*,const IID*,IRpcProxyBuffer**,void**);
     * }
     */
    public static MemorySegment CreateProxy$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IPSFactoryBufferVtbl.CreateProxy$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*CreateProxy)(IPSFactoryBuffer*,IUnknown*,const IID*,IRpcProxyBuffer**,void**);
     * }
     */
    public static void CreateProxy$set(MemorySegment seg, MemorySegment x) {
        IPSFactoryBufferVtbl.CreateProxy$VH.set(seg, x);
    }
    public static MemorySegment CreateProxy$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IPSFactoryBufferVtbl.CreateProxy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CreateProxy$set(MemorySegment seg, long index, MemorySegment x) {
        IPSFactoryBufferVtbl.CreateProxy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static CreateProxy CreateProxy(MemorySegment segment, SegmentScope scope) {
        return CreateProxy.ofAddress(CreateProxy$get(segment), scope);
    }
    static final FunctionDescriptor CreateStub$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor CreateStub_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateStub_UP$MH = RuntimeHelper.upcallHandle(CreateStub.class, "apply", IPSFactoryBufferVtbl.CreateStub_UP$FUNC);
    static final FunctionDescriptor CreateStub_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateStub_DOWN$MH = RuntimeHelper.downcallHandle(
        IPSFactoryBufferVtbl.CreateStub_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*CreateStub)(IPSFactoryBuffer*,const IID*,IUnknown*,IRpcStubBuffer**);
     * }
     */
    public interface CreateStub {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(CreateStub fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IPSFactoryBufferVtbl.CreateStub_UP$MH, fi, IPSFactoryBufferVtbl.CreateStub$FUNC, scope);
        }
        static CreateStub ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (int)IPSFactoryBufferVtbl.CreateStub_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle CreateStub$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CreateStub"));
    public static VarHandle CreateStub$VH() {
        return IPSFactoryBufferVtbl.CreateStub$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*CreateStub)(IPSFactoryBuffer*,const IID*,IUnknown*,IRpcStubBuffer**);
     * }
     */
    public static MemorySegment CreateStub$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IPSFactoryBufferVtbl.CreateStub$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*CreateStub)(IPSFactoryBuffer*,const IID*,IUnknown*,IRpcStubBuffer**);
     * }
     */
    public static void CreateStub$set(MemorySegment seg, MemorySegment x) {
        IPSFactoryBufferVtbl.CreateStub$VH.set(seg, x);
    }
    public static MemorySegment CreateStub$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IPSFactoryBufferVtbl.CreateStub$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CreateStub$set(MemorySegment seg, long index, MemorySegment x) {
        IPSFactoryBufferVtbl.CreateStub$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static CreateStub CreateStub(MemorySegment segment, SegmentScope scope) {
        return CreateStub.ofAddress(CreateStub$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


