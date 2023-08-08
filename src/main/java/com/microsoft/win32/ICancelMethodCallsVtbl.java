// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct ICancelMethodCallsVtbl {
 *     HRESULT (*QueryInterface)(ICancelMethodCalls*,const IID*,void**);
 *     ULONG (*AddRef)(ICancelMethodCalls*);
 *     ULONG (*Release)(ICancelMethodCalls*);
 *     HRESULT (*Cancel)(ICancelMethodCalls*,ULONG);
 *     HRESULT (*TestCancel)(ICancelMethodCalls*);
 * };
 * }
 */
public class ICancelMethodCallsVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("Cancel"),
        Constants$root.C_POINTER$LAYOUT.withName("TestCancel")
    ).withName("ICancelMethodCallsVtbl");
    public static MemoryLayout $LAYOUT() {
        return ICancelMethodCallsVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", ICancelMethodCallsVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        ICancelMethodCallsVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(ICancelMethodCalls*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(ICancelMethodCallsVtbl.QueryInterface_UP$MH, fi, ICancelMethodCallsVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)ICancelMethodCallsVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return ICancelMethodCallsVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(ICancelMethodCalls*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)ICancelMethodCallsVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(ICancelMethodCalls*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        ICancelMethodCallsVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)ICancelMethodCallsVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        ICancelMethodCallsVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", ICancelMethodCallsVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        ICancelMethodCallsVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(ICancelMethodCalls*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(ICancelMethodCallsVtbl.AddRef_UP$MH, fi, ICancelMethodCallsVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)ICancelMethodCallsVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return ICancelMethodCallsVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(ICancelMethodCalls*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)ICancelMethodCallsVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(ICancelMethodCalls*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        ICancelMethodCallsVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)ICancelMethodCallsVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        ICancelMethodCallsVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", ICancelMethodCallsVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        ICancelMethodCallsVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(ICancelMethodCalls*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(ICancelMethodCallsVtbl.Release_UP$MH, fi, ICancelMethodCallsVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)ICancelMethodCallsVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return ICancelMethodCallsVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(ICancelMethodCalls*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)ICancelMethodCallsVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(ICancelMethodCalls*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        ICancelMethodCallsVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)ICancelMethodCallsVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        ICancelMethodCallsVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor Cancel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor Cancel_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Cancel_UP$MH = RuntimeHelper.upcallHandle(Cancel.class, "apply", ICancelMethodCallsVtbl.Cancel_UP$FUNC);
    static final FunctionDescriptor Cancel_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Cancel_DOWN$MH = RuntimeHelper.downcallHandle(
        ICancelMethodCallsVtbl.Cancel_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Cancel)(ICancelMethodCalls*,ULONG);
     * }
     */
    public interface Cancel {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(Cancel fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(ICancelMethodCallsVtbl.Cancel_UP$MH, fi, ICancelMethodCallsVtbl.Cancel$FUNC, scope);
        }
        static Cancel ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)ICancelMethodCallsVtbl.Cancel_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Cancel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Cancel"));
    public static VarHandle Cancel$VH() {
        return ICancelMethodCallsVtbl.Cancel$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Cancel)(ICancelMethodCalls*,ULONG);
     * }
     */
    public static MemorySegment Cancel$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)ICancelMethodCallsVtbl.Cancel$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Cancel)(ICancelMethodCalls*,ULONG);
     * }
     */
    public static void Cancel$set(MemorySegment seg, MemorySegment x) {
        ICancelMethodCallsVtbl.Cancel$VH.set(seg, x);
    }
    public static MemorySegment Cancel$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)ICancelMethodCallsVtbl.Cancel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Cancel$set(MemorySegment seg, long index, MemorySegment x) {
        ICancelMethodCallsVtbl.Cancel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Cancel Cancel(MemorySegment segment, SegmentScope scope) {
        return Cancel.ofAddress(Cancel$get(segment), scope);
    }
    static final FunctionDescriptor TestCancel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor TestCancel_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TestCancel_UP$MH = RuntimeHelper.upcallHandle(TestCancel.class, "apply", ICancelMethodCallsVtbl.TestCancel_UP$FUNC);
    static final FunctionDescriptor TestCancel_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TestCancel_DOWN$MH = RuntimeHelper.downcallHandle(
        ICancelMethodCallsVtbl.TestCancel_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*TestCancel)(ICancelMethodCalls*);
     * }
     */
    public interface TestCancel {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(TestCancel fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(ICancelMethodCallsVtbl.TestCancel_UP$MH, fi, ICancelMethodCallsVtbl.TestCancel$FUNC, scope);
        }
        static TestCancel ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)ICancelMethodCallsVtbl.TestCancel_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle TestCancel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TestCancel"));
    public static VarHandle TestCancel$VH() {
        return ICancelMethodCallsVtbl.TestCancel$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*TestCancel)(ICancelMethodCalls*);
     * }
     */
    public static MemorySegment TestCancel$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)ICancelMethodCallsVtbl.TestCancel$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*TestCancel)(ICancelMethodCalls*);
     * }
     */
    public static void TestCancel$set(MemorySegment seg, MemorySegment x) {
        ICancelMethodCallsVtbl.TestCancel$VH.set(seg, x);
    }
    public static MemorySegment TestCancel$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)ICancelMethodCallsVtbl.TestCancel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TestCancel$set(MemorySegment seg, long index, MemorySegment x) {
        ICancelMethodCallsVtbl.TestCancel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static TestCancel TestCancel(MemorySegment segment, SegmentScope scope) {
        return TestCancel.ofAddress(TestCancel$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


