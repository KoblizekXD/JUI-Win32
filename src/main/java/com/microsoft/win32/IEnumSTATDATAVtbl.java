// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IEnumSTATDATAVtbl {
 *     HRESULT (*QueryInterface)(IEnumSTATDATA*,const IID*,void**);
 *     ULONG (*AddRef)(IEnumSTATDATA*);
 *     ULONG (*Release)(IEnumSTATDATA*);
 *     HRESULT (*Next)(IEnumSTATDATA*,ULONG,STATDATA*,ULONG*);
 *     HRESULT (*Skip)(IEnumSTATDATA*,ULONG);
 *     HRESULT (*Reset)(IEnumSTATDATA*);
 *     HRESULT (*Clone)(IEnumSTATDATA*,IEnumSTATDATA**);
 * };
 * }
 */
public class IEnumSTATDATAVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("Next"),
        Constants$root.C_POINTER$LAYOUT.withName("Skip"),
        Constants$root.C_POINTER$LAYOUT.withName("Reset"),
        Constants$root.C_POINTER$LAYOUT.withName("Clone")
    ).withName("IEnumSTATDATAVtbl");
    public static MemoryLayout $LAYOUT() {
        return IEnumSTATDATAVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IEnumSTATDATAVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumSTATDATAVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IEnumSTATDATA*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumSTATDATAVtbl.QueryInterface_UP$MH, fi, IEnumSTATDATAVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IEnumSTATDATAVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IEnumSTATDATAVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IEnumSTATDATA*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumSTATDATAVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IEnumSTATDATA*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IEnumSTATDATAVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumSTATDATAVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumSTATDATAVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IEnumSTATDATAVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumSTATDATAVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IEnumSTATDATA*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumSTATDATAVtbl.AddRef_UP$MH, fi, IEnumSTATDATAVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IEnumSTATDATAVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IEnumSTATDATAVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IEnumSTATDATA*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumSTATDATAVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IEnumSTATDATA*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IEnumSTATDATAVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumSTATDATAVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumSTATDATAVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IEnumSTATDATAVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumSTATDATAVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IEnumSTATDATA*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumSTATDATAVtbl.Release_UP$MH, fi, IEnumSTATDATAVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IEnumSTATDATAVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IEnumSTATDATAVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IEnumSTATDATA*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumSTATDATAVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IEnumSTATDATA*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IEnumSTATDATAVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumSTATDATAVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumSTATDATAVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Next_UP$MH = RuntimeHelper.upcallHandle(Next.class, "apply", IEnumSTATDATAVtbl.Next_UP$FUNC);
    static final FunctionDescriptor Next_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Next_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumSTATDATAVtbl.Next_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Next)(IEnumSTATDATA*,ULONG,STATDATA*,ULONG*);
     * }
     */
    public interface Next {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(Next fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumSTATDATAVtbl.Next_UP$MH, fi, IEnumSTATDATAVtbl.Next$FUNC, scope);
        }
        static Next ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (int)IEnumSTATDATAVtbl.Next_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Next"));
    public static VarHandle Next$VH() {
        return IEnumSTATDATAVtbl.Next$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Next)(IEnumSTATDATA*,ULONG,STATDATA*,ULONG*);
     * }
     */
    public static MemorySegment Next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumSTATDATAVtbl.Next$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Next)(IEnumSTATDATA*,ULONG,STATDATA*,ULONG*);
     * }
     */
    public static void Next$set(MemorySegment seg, MemorySegment x) {
        IEnumSTATDATAVtbl.Next$VH.set(seg, x);
    }
    public static MemorySegment Next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumSTATDATAVtbl.Next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Next$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumSTATDATAVtbl.Next$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Skip_UP$MH = RuntimeHelper.upcallHandle(Skip.class, "apply", IEnumSTATDATAVtbl.Skip_UP$FUNC);
    static final FunctionDescriptor Skip_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Skip_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumSTATDATAVtbl.Skip_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Skip)(IEnumSTATDATA*,ULONG);
     * }
     */
    public interface Skip {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(Skip fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumSTATDATAVtbl.Skip_UP$MH, fi, IEnumSTATDATAVtbl.Skip$FUNC, scope);
        }
        static Skip ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)IEnumSTATDATAVtbl.Skip_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Skip$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Skip"));
    public static VarHandle Skip$VH() {
        return IEnumSTATDATAVtbl.Skip$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Skip)(IEnumSTATDATA*,ULONG);
     * }
     */
    public static MemorySegment Skip$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumSTATDATAVtbl.Skip$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Skip)(IEnumSTATDATA*,ULONG);
     * }
     */
    public static void Skip$set(MemorySegment seg, MemorySegment x) {
        IEnumSTATDATAVtbl.Skip$VH.set(seg, x);
    }
    public static MemorySegment Skip$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumSTATDATAVtbl.Skip$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Skip$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumSTATDATAVtbl.Skip$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Reset_UP$MH = RuntimeHelper.upcallHandle(Reset.class, "apply", IEnumSTATDATAVtbl.Reset_UP$FUNC);
    static final FunctionDescriptor Reset_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Reset_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumSTATDATAVtbl.Reset_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Reset)(IEnumSTATDATA*);
     * }
     */
    public interface Reset {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Reset fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumSTATDATAVtbl.Reset_UP$MH, fi, IEnumSTATDATAVtbl.Reset$FUNC, scope);
        }
        static Reset ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IEnumSTATDATAVtbl.Reset_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Reset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reset"));
    public static VarHandle Reset$VH() {
        return IEnumSTATDATAVtbl.Reset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Reset)(IEnumSTATDATA*);
     * }
     */
    public static MemorySegment Reset$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumSTATDATAVtbl.Reset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Reset)(IEnumSTATDATA*);
     * }
     */
    public static void Reset$set(MemorySegment seg, MemorySegment x) {
        IEnumSTATDATAVtbl.Reset$VH.set(seg, x);
    }
    public static MemorySegment Reset$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumSTATDATAVtbl.Reset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reset$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumSTATDATAVtbl.Reset$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Clone_UP$MH = RuntimeHelper.upcallHandle(Clone.class, "apply", IEnumSTATDATAVtbl.Clone_UP$FUNC);
    static final FunctionDescriptor Clone_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Clone_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumSTATDATAVtbl.Clone_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Clone)(IEnumSTATDATA*,IEnumSTATDATA**);
     * }
     */
    public interface Clone {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(Clone fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumSTATDATAVtbl.Clone_UP$MH, fi, IEnumSTATDATAVtbl.Clone$FUNC, scope);
        }
        static Clone ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IEnumSTATDATAVtbl.Clone_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Clone$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Clone"));
    public static VarHandle Clone$VH() {
        return IEnumSTATDATAVtbl.Clone$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Clone)(IEnumSTATDATA*,IEnumSTATDATA**);
     * }
     */
    public static MemorySegment Clone$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumSTATDATAVtbl.Clone$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Clone)(IEnumSTATDATA*,IEnumSTATDATA**);
     * }
     */
    public static void Clone$set(MemorySegment seg, MemorySegment x) {
        IEnumSTATDATAVtbl.Clone$VH.set(seg, x);
    }
    public static MemorySegment Clone$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumSTATDATAVtbl.Clone$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Clone$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumSTATDATAVtbl.Clone$VH.set(seg.asSlice(index*sizeof()), x);
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


