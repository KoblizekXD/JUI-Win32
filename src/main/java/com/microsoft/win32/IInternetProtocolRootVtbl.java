// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IInternetProtocolRootVtbl {
 *     HRESULT (*QueryInterface)(IInternetProtocolRoot*,const IID*,void**);
 *     ULONG (*AddRef)(IInternetProtocolRoot*);
 *     ULONG (*Release)(IInternetProtocolRoot*);
 *     HRESULT (*Start)(IInternetProtocolRoot*,LPCWSTR,IInternetProtocolSink*,IInternetBindInfo*,DWORD,HANDLE_PTR);
 *     HRESULT (*Continue)(IInternetProtocolRoot*,PROTOCOLDATA*);
 *     HRESULT (*Abort)(IInternetProtocolRoot*,HRESULT,DWORD);
 *     HRESULT (*Terminate)(IInternetProtocolRoot*,DWORD);
 *     HRESULT (*Suspend)(IInternetProtocolRoot*);
 *     HRESULT (*Resume)(IInternetProtocolRoot*);
 * };
 * }
 */
public class IInternetProtocolRootVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("Start"),
        Constants$root.C_POINTER$LAYOUT.withName("Continue"),
        Constants$root.C_POINTER$LAYOUT.withName("Abort"),
        Constants$root.C_POINTER$LAYOUT.withName("Terminate"),
        Constants$root.C_POINTER$LAYOUT.withName("Suspend"),
        Constants$root.C_POINTER$LAYOUT.withName("Resume")
    ).withName("IInternetProtocolRootVtbl");
    public static MemoryLayout $LAYOUT() {
        return IInternetProtocolRootVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IInternetProtocolRootVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolRootVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IInternetProtocolRoot*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetProtocolRootVtbl.QueryInterface_UP$MH, fi, IInternetProtocolRootVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IInternetProtocolRootVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IInternetProtocolRootVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IInternetProtocolRoot*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetProtocolRootVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IInternetProtocolRoot*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IInternetProtocolRootVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetProtocolRootVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetProtocolRootVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IInternetProtocolRootVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolRootVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IInternetProtocolRoot*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetProtocolRootVtbl.AddRef_UP$MH, fi, IInternetProtocolRootVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IInternetProtocolRootVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IInternetProtocolRootVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IInternetProtocolRoot*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetProtocolRootVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IInternetProtocolRoot*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IInternetProtocolRootVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetProtocolRootVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetProtocolRootVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IInternetProtocolRootVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolRootVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IInternetProtocolRoot*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetProtocolRootVtbl.Release_UP$MH, fi, IInternetProtocolRootVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IInternetProtocolRootVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IInternetProtocolRootVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IInternetProtocolRoot*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetProtocolRootVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IInternetProtocolRoot*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IInternetProtocolRootVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetProtocolRootVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetProtocolRootVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor Start$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor Start_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle Start_UP$MH = RuntimeHelper.upcallHandle(Start.class, "apply", IInternetProtocolRootVtbl.Start_UP$FUNC);
    static final FunctionDescriptor Start_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle Start_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolRootVtbl.Start_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Start)(IInternetProtocolRoot*,LPCWSTR,IInternetProtocolSink*,IInternetBindInfo*,DWORD,HANDLE_PTR);
     * }
     */
    public interface Start {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, int _x4, long _x5);
        static MemorySegment allocate(Start fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetProtocolRootVtbl.Start_UP$MH, fi, IInternetProtocolRootVtbl.Start$FUNC, scope);
        }
        static Start ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, int __x4, long __x5) -> {
                try {
                    return (int)IInternetProtocolRootVtbl.Start_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Start$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Start"));
    public static VarHandle Start$VH() {
        return IInternetProtocolRootVtbl.Start$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Start)(IInternetProtocolRoot*,LPCWSTR,IInternetProtocolSink*,IInternetBindInfo*,DWORD,HANDLE_PTR);
     * }
     */
    public static MemorySegment Start$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetProtocolRootVtbl.Start$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Start)(IInternetProtocolRoot*,LPCWSTR,IInternetProtocolSink*,IInternetBindInfo*,DWORD,HANDLE_PTR);
     * }
     */
    public static void Start$set(MemorySegment seg, MemorySegment x) {
        IInternetProtocolRootVtbl.Start$VH.set(seg, x);
    }
    public static MemorySegment Start$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetProtocolRootVtbl.Start$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Start$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetProtocolRootVtbl.Start$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Start Start(MemorySegment segment, SegmentScope scope) {
        return Start.ofAddress(Start$get(segment), scope);
    }
    static final FunctionDescriptor Continue$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor Continue_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Continue_UP$MH = RuntimeHelper.upcallHandle(Continue.class, "apply", IInternetProtocolRootVtbl.Continue_UP$FUNC);
    static final FunctionDescriptor Continue_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Continue_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolRootVtbl.Continue_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Continue)(IInternetProtocolRoot*,PROTOCOLDATA*);
     * }
     */
    public interface Continue {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(Continue fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetProtocolRootVtbl.Continue_UP$MH, fi, IInternetProtocolRootVtbl.Continue$FUNC, scope);
        }
        static Continue ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IInternetProtocolRootVtbl.Continue_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Continue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Continue"));
    public static VarHandle Continue$VH() {
        return IInternetProtocolRootVtbl.Continue$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Continue)(IInternetProtocolRoot*,PROTOCOLDATA*);
     * }
     */
    public static MemorySegment Continue$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetProtocolRootVtbl.Continue$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Continue)(IInternetProtocolRoot*,PROTOCOLDATA*);
     * }
     */
    public static void Continue$set(MemorySegment seg, MemorySegment x) {
        IInternetProtocolRootVtbl.Continue$VH.set(seg, x);
    }
    public static MemorySegment Continue$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetProtocolRootVtbl.Continue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Continue$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetProtocolRootVtbl.Continue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Continue Continue(MemorySegment segment, SegmentScope scope) {
        return Continue.ofAddress(Continue$get(segment), scope);
    }
    static final FunctionDescriptor Abort$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor Abort_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Abort_UP$MH = RuntimeHelper.upcallHandle(Abort.class, "apply", IInternetProtocolRootVtbl.Abort_UP$FUNC);
    static final FunctionDescriptor Abort_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Abort_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolRootVtbl.Abort_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Abort)(IInternetProtocolRoot*,HRESULT,DWORD);
     * }
     */
    public interface Abort {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2);
        static MemorySegment allocate(Abort fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetProtocolRootVtbl.Abort_UP$MH, fi, IInternetProtocolRootVtbl.Abort$FUNC, scope);
        }
        static Abort ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2) -> {
                try {
                    return (int)IInternetProtocolRootVtbl.Abort_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Abort$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Abort"));
    public static VarHandle Abort$VH() {
        return IInternetProtocolRootVtbl.Abort$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Abort)(IInternetProtocolRoot*,HRESULT,DWORD);
     * }
     */
    public static MemorySegment Abort$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetProtocolRootVtbl.Abort$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Abort)(IInternetProtocolRoot*,HRESULT,DWORD);
     * }
     */
    public static void Abort$set(MemorySegment seg, MemorySegment x) {
        IInternetProtocolRootVtbl.Abort$VH.set(seg, x);
    }
    public static MemorySegment Abort$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetProtocolRootVtbl.Abort$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Abort$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetProtocolRootVtbl.Abort$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Abort Abort(MemorySegment segment, SegmentScope scope) {
        return Abort.ofAddress(Abort$get(segment), scope);
    }
    static final FunctionDescriptor Terminate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor Terminate_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Terminate_UP$MH = RuntimeHelper.upcallHandle(Terminate.class, "apply", IInternetProtocolRootVtbl.Terminate_UP$FUNC);
    static final FunctionDescriptor Terminate_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Terminate_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolRootVtbl.Terminate_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Terminate)(IInternetProtocolRoot*,DWORD);
     * }
     */
    public interface Terminate {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(Terminate fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetProtocolRootVtbl.Terminate_UP$MH, fi, IInternetProtocolRootVtbl.Terminate$FUNC, scope);
        }
        static Terminate ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)IInternetProtocolRootVtbl.Terminate_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Terminate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Terminate"));
    public static VarHandle Terminate$VH() {
        return IInternetProtocolRootVtbl.Terminate$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Terminate)(IInternetProtocolRoot*,DWORD);
     * }
     */
    public static MemorySegment Terminate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetProtocolRootVtbl.Terminate$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Terminate)(IInternetProtocolRoot*,DWORD);
     * }
     */
    public static void Terminate$set(MemorySegment seg, MemorySegment x) {
        IInternetProtocolRootVtbl.Terminate$VH.set(seg, x);
    }
    public static MemorySegment Terminate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetProtocolRootVtbl.Terminate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Terminate$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetProtocolRootVtbl.Terminate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Terminate Terminate(MemorySegment segment, SegmentScope scope) {
        return Terminate.ofAddress(Terminate$get(segment), scope);
    }
    static final FunctionDescriptor Suspend$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor Suspend_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Suspend_UP$MH = RuntimeHelper.upcallHandle(Suspend.class, "apply", IInternetProtocolRootVtbl.Suspend_UP$FUNC);
    static final FunctionDescriptor Suspend_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Suspend_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolRootVtbl.Suspend_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Suspend)(IInternetProtocolRoot*);
     * }
     */
    public interface Suspend {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Suspend fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetProtocolRootVtbl.Suspend_UP$MH, fi, IInternetProtocolRootVtbl.Suspend$FUNC, scope);
        }
        static Suspend ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IInternetProtocolRootVtbl.Suspend_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Suspend$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Suspend"));
    public static VarHandle Suspend$VH() {
        return IInternetProtocolRootVtbl.Suspend$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Suspend)(IInternetProtocolRoot*);
     * }
     */
    public static MemorySegment Suspend$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetProtocolRootVtbl.Suspend$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Suspend)(IInternetProtocolRoot*);
     * }
     */
    public static void Suspend$set(MemorySegment seg, MemorySegment x) {
        IInternetProtocolRootVtbl.Suspend$VH.set(seg, x);
    }
    public static MemorySegment Suspend$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetProtocolRootVtbl.Suspend$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Suspend$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetProtocolRootVtbl.Suspend$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Suspend Suspend(MemorySegment segment, SegmentScope scope) {
        return Suspend.ofAddress(Suspend$get(segment), scope);
    }
    static final FunctionDescriptor Resume$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor Resume_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Resume_UP$MH = RuntimeHelper.upcallHandle(Resume.class, "apply", IInternetProtocolRootVtbl.Resume_UP$FUNC);
    static final FunctionDescriptor Resume_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Resume_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolRootVtbl.Resume_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Resume)(IInternetProtocolRoot*);
     * }
     */
    public interface Resume {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Resume fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetProtocolRootVtbl.Resume_UP$MH, fi, IInternetProtocolRootVtbl.Resume$FUNC, scope);
        }
        static Resume ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IInternetProtocolRootVtbl.Resume_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Resume$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Resume"));
    public static VarHandle Resume$VH() {
        return IInternetProtocolRootVtbl.Resume$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Resume)(IInternetProtocolRoot*);
     * }
     */
    public static MemorySegment Resume$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetProtocolRootVtbl.Resume$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Resume)(IInternetProtocolRoot*);
     * }
     */
    public static void Resume$set(MemorySegment seg, MemorySegment x) {
        IInternetProtocolRootVtbl.Resume$VH.set(seg, x);
    }
    public static MemorySegment Resume$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetProtocolRootVtbl.Resume$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Resume$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetProtocolRootVtbl.Resume$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Resume Resume(MemorySegment segment, SegmentScope scope) {
        return Resume.ofAddress(Resume$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


