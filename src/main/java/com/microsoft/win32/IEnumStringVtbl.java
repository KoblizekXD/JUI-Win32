// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IEnumStringVtbl {
 *     HRESULT (*QueryInterface)(IEnumString*,const IID*,void**);
 *     ULONG (*AddRef)(IEnumString*);
 *     ULONG (*Release)(IEnumString*);
 *     HRESULT (*Next)(IEnumString*,ULONG,LPOLESTR*,ULONG*);
 *     HRESULT (*Skip)(IEnumString*,ULONG);
 *     HRESULT (*Reset)(IEnumString*);
 *     HRESULT (*Clone)(IEnumString*,IEnumString**);
 * };
 * }
 */
public class IEnumStringVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("Next"),
        Constants$root.C_POINTER$LAYOUT.withName("Skip"),
        Constants$root.C_POINTER$LAYOUT.withName("Reset"),
        Constants$root.C_POINTER$LAYOUT.withName("Clone")
    ).withName("IEnumStringVtbl");
    public static MemoryLayout $LAYOUT() {
        return IEnumStringVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IEnumStringVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumStringVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IEnumString*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumStringVtbl.QueryInterface_UP$MH, fi, IEnumStringVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IEnumStringVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IEnumStringVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IEnumString*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumStringVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IEnumString*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IEnumStringVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumStringVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumStringVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IEnumStringVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumStringVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IEnumString*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumStringVtbl.AddRef_UP$MH, fi, IEnumStringVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IEnumStringVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IEnumStringVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IEnumString*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumStringVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IEnumString*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IEnumStringVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumStringVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumStringVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IEnumStringVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumStringVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IEnumString*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumStringVtbl.Release_UP$MH, fi, IEnumStringVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IEnumStringVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IEnumStringVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IEnumString*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumStringVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IEnumString*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IEnumStringVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumStringVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumStringVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Next_UP$MH = RuntimeHelper.upcallHandle(Next.class, "apply", IEnumStringVtbl.Next_UP$FUNC);
    static final FunctionDescriptor Next_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Next_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumStringVtbl.Next_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Next)(IEnumString*,ULONG,LPOLESTR*,ULONG*);
     * }
     */
    public interface Next {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(Next fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumStringVtbl.Next_UP$MH, fi, IEnumStringVtbl.Next$FUNC, scope);
        }
        static Next ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (int)IEnumStringVtbl.Next_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Next"));
    public static VarHandle Next$VH() {
        return IEnumStringVtbl.Next$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Next)(IEnumString*,ULONG,LPOLESTR*,ULONG*);
     * }
     */
    public static MemorySegment Next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumStringVtbl.Next$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Next)(IEnumString*,ULONG,LPOLESTR*,ULONG*);
     * }
     */
    public static void Next$set(MemorySegment seg, MemorySegment x) {
        IEnumStringVtbl.Next$VH.set(seg, x);
    }
    public static MemorySegment Next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumStringVtbl.Next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Next$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumStringVtbl.Next$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Skip_UP$MH = RuntimeHelper.upcallHandle(Skip.class, "apply", IEnumStringVtbl.Skip_UP$FUNC);
    static final FunctionDescriptor Skip_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Skip_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumStringVtbl.Skip_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Skip)(IEnumString*,ULONG);
     * }
     */
    public interface Skip {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(Skip fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumStringVtbl.Skip_UP$MH, fi, IEnumStringVtbl.Skip$FUNC, scope);
        }
        static Skip ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)IEnumStringVtbl.Skip_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Skip$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Skip"));
    public static VarHandle Skip$VH() {
        return IEnumStringVtbl.Skip$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Skip)(IEnumString*,ULONG);
     * }
     */
    public static MemorySegment Skip$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumStringVtbl.Skip$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Skip)(IEnumString*,ULONG);
     * }
     */
    public static void Skip$set(MemorySegment seg, MemorySegment x) {
        IEnumStringVtbl.Skip$VH.set(seg, x);
    }
    public static MemorySegment Skip$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumStringVtbl.Skip$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Skip$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumStringVtbl.Skip$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Reset_UP$MH = RuntimeHelper.upcallHandle(Reset.class, "apply", IEnumStringVtbl.Reset_UP$FUNC);
    static final FunctionDescriptor Reset_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Reset_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumStringVtbl.Reset_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Reset)(IEnumString*);
     * }
     */
    public interface Reset {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Reset fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumStringVtbl.Reset_UP$MH, fi, IEnumStringVtbl.Reset$FUNC, scope);
        }
        static Reset ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IEnumStringVtbl.Reset_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Reset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reset"));
    public static VarHandle Reset$VH() {
        return IEnumStringVtbl.Reset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Reset)(IEnumString*);
     * }
     */
    public static MemorySegment Reset$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumStringVtbl.Reset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Reset)(IEnumString*);
     * }
     */
    public static void Reset$set(MemorySegment seg, MemorySegment x) {
        IEnumStringVtbl.Reset$VH.set(seg, x);
    }
    public static MemorySegment Reset$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumStringVtbl.Reset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reset$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumStringVtbl.Reset$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Clone_UP$MH = RuntimeHelper.upcallHandle(Clone.class, "apply", IEnumStringVtbl.Clone_UP$FUNC);
    static final FunctionDescriptor Clone_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Clone_DOWN$MH = RuntimeHelper.downcallHandle(
        IEnumStringVtbl.Clone_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Clone)(IEnumString*,IEnumString**);
     * }
     */
    public interface Clone {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(Clone fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IEnumStringVtbl.Clone_UP$MH, fi, IEnumStringVtbl.Clone$FUNC, scope);
        }
        static Clone ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IEnumStringVtbl.Clone_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Clone$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Clone"));
    public static VarHandle Clone$VH() {
        return IEnumStringVtbl.Clone$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Clone)(IEnumString*,IEnumString**);
     * }
     */
    public static MemorySegment Clone$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IEnumStringVtbl.Clone$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Clone)(IEnumString*,IEnumString**);
     * }
     */
    public static void Clone$set(MemorySegment seg, MemorySegment x) {
        IEnumStringVtbl.Clone$VH.set(seg, x);
    }
    public static MemorySegment Clone$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IEnumStringVtbl.Clone$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Clone$set(MemorySegment seg, long index, MemorySegment x) {
        IEnumStringVtbl.Clone$VH.set(seg.asSlice(index*sizeof()), x);
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


