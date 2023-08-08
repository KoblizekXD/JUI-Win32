// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IEnumMonikerVtbl {
 *     HRESULT (*QueryInterface)(IEnumMoniker*,const IID*,void**);
 *     ULONG (*AddRef)(IEnumMoniker*);
 *     ULONG (*Release)(IEnumMoniker*);
 *     HRESULT (*Next)(IEnumMoniker*,ULONG,IMoniker**,ULONG*);
 *     HRESULT (*Skip)(IEnumMoniker*,ULONG);
 *     HRESULT (*Reset)(IEnumMoniker*);
 *     HRESULT (*Clone)(IEnumMoniker*,IEnumMoniker**);
 * };
 * }
 */
public class IEnumMonikerVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("Next"),
        Constants$root.C_POINTER$LAYOUT.withName("Skip"),
        Constants$root.C_POINTER$LAYOUT.withName("Reset"),
        Constants$root.C_POINTER$LAYOUT.withName("Clone")
    ).withName("IEnumMonikerVtbl");
    public static MemoryLayout $LAYOUT() {
        return IEnumMonikerVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IEnumMonikerVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumMonikerVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IEnumMoniker*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumMonikerVtbl.QueryInterface_UP$MH, fi, IEnumMonikerVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IEnumMonikerVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IEnumMonikerVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IEnumMoniker*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumMonikerVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IEnumMoniker*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IEnumMonikerVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumMonikerVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumMonikerVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IEnumMonikerVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumMonikerVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IEnumMoniker*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumMonikerVtbl.AddRef_UP$MH, fi, IEnumMonikerVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IEnumMonikerVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IEnumMonikerVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IEnumMoniker*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumMonikerVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IEnumMoniker*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IEnumMonikerVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumMonikerVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumMonikerVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IEnumMonikerVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumMonikerVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IEnumMoniker*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumMonikerVtbl.Release_UP$MH, fi, IEnumMonikerVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IEnumMonikerVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IEnumMonikerVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IEnumMoniker*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumMonikerVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IEnumMoniker*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IEnumMonikerVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumMonikerVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumMonikerVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor Next$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor Next_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Next_UP$MH = RuntimeHelper.upcallHandle(Next.class, "apply", IEnumMonikerVtbl.Next_UP$FUNC);
    static final FunctionDescriptor Next_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Next_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumMonikerVtbl.Next_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Next)(IEnumMoniker*,ULONG,IMoniker**,ULONG*);
     * }
     */
    public interface Next {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(Next fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumMonikerVtbl.Next_UP$MH, fi, IEnumMonikerVtbl.Next$FUNC, scope);
        }
        static Next ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (int)IEnumMonikerVtbl.Next_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Next"));
    public static VarHandle Next$VH() {
        return IEnumMonikerVtbl.Next$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Next)(IEnumMoniker*,ULONG,IMoniker**,ULONG*);
     * }
     */
    public static MemorySegment Next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumMonikerVtbl.Next$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Next)(IEnumMoniker*,ULONG,IMoniker**,ULONG*);
     * }
     */
    public static void Next$set(MemorySegment seg, MemorySegment x) {
        IEnumMonikerVtbl.Next$VH.set(seg, x);
    }
    public static MemorySegment Next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumMonikerVtbl.Next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Next$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumMonikerVtbl.Next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Next Next(MemorySegment segment, SegmentScope scope) {
        return Next.ofAddress(Next$get(segment), scope);
    }
    static final FunctionDescriptor Skip$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor Skip_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Skip_UP$MH = RuntimeHelper.upcallHandle(Skip.class, "apply", IEnumMonikerVtbl.Skip_UP$FUNC);
    static final FunctionDescriptor Skip_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Skip_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumMonikerVtbl.Skip_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Skip)(IEnumMoniker*,ULONG);
     * }
     */
    public interface Skip {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(Skip fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumMonikerVtbl.Skip_UP$MH, fi, IEnumMonikerVtbl.Skip$FUNC, scope);
        }
        static Skip ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)IEnumMonikerVtbl.Skip_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Skip$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Skip"));
    public static VarHandle Skip$VH() {
        return IEnumMonikerVtbl.Skip$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Skip)(IEnumMoniker*,ULONG);
     * }
     */
    public static MemorySegment Skip$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumMonikerVtbl.Skip$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Skip)(IEnumMoniker*,ULONG);
     * }
     */
    public static void Skip$set(MemorySegment seg, MemorySegment x) {
        IEnumMonikerVtbl.Skip$VH.set(seg, x);
    }
    public static MemorySegment Skip$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumMonikerVtbl.Skip$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Skip$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumMonikerVtbl.Skip$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Skip Skip(MemorySegment segment, SegmentScope scope) {
        return Skip.ofAddress(Skip$get(segment), scope);
    }
    static final FunctionDescriptor Reset$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor Reset_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Reset_UP$MH = RuntimeHelper.upcallHandle(Reset.class, "apply", IEnumMonikerVtbl.Reset_UP$FUNC);
    static final FunctionDescriptor Reset_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Reset_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumMonikerVtbl.Reset_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Reset)(IEnumMoniker*);
     * }
     */
    public interface Reset {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Reset fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumMonikerVtbl.Reset_UP$MH, fi, IEnumMonikerVtbl.Reset$FUNC, scope);
        }
        static Reset ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IEnumMonikerVtbl.Reset_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Reset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reset"));
    public static VarHandle Reset$VH() {
        return IEnumMonikerVtbl.Reset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Reset)(IEnumMoniker*);
     * }
     */
    public static MemorySegment Reset$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumMonikerVtbl.Reset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Reset)(IEnumMoniker*);
     * }
     */
    public static void Reset$set(MemorySegment seg, MemorySegment x) {
        IEnumMonikerVtbl.Reset$VH.set(seg, x);
    }
    public static MemorySegment Reset$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumMonikerVtbl.Reset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reset$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumMonikerVtbl.Reset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Reset Reset(MemorySegment segment, SegmentScope scope) {
        return Reset.ofAddress(Reset$get(segment), scope);
    }
    static final FunctionDescriptor Clone$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor Clone_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Clone_UP$MH = RuntimeHelper.upcallHandle(Clone.class, "apply", IEnumMonikerVtbl.Clone_UP$FUNC);
    static final FunctionDescriptor Clone_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Clone_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumMonikerVtbl.Clone_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Clone)(IEnumMoniker*,IEnumMoniker**);
     * }
     */
    public interface Clone {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(Clone fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumMonikerVtbl.Clone_UP$MH, fi, IEnumMonikerVtbl.Clone$FUNC, scope);
        }
        static Clone ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IEnumMonikerVtbl.Clone_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Clone$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Clone"));
    public static VarHandle Clone$VH() {
        return IEnumMonikerVtbl.Clone$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Clone)(IEnumMoniker*,IEnumMoniker**);
     * }
     */
    public static MemorySegment Clone$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumMonikerVtbl.Clone$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Clone)(IEnumMoniker*,IEnumMoniker**);
     * }
     */
    public static void Clone$set(MemorySegment seg, MemorySegment x) {
        IEnumMonikerVtbl.Clone$VH.set(seg, x);
    }
    public static MemorySegment Clone$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumMonikerVtbl.Clone$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Clone$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumMonikerVtbl.Clone$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Clone Clone(MemorySegment segment, SegmentScope scope) {
        return Clone.ofAddress(Clone$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


