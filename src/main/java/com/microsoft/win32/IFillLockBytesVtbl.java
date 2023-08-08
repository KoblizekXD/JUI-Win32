// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IFillLockBytesVtbl {
 *     HRESULT (*QueryInterface)(IFillLockBytes*,const IID*,void**);
 *     ULONG (*AddRef)(IFillLockBytes*);
 *     ULONG (*Release)(IFillLockBytes*);
 *     HRESULT (*FillAppend)(IFillLockBytes*,void*,ULONG,ULONG*);
 *     HRESULT (*FillAt)(IFillLockBytes*,ULARGE_INTEGER,void*,ULONG,ULONG*);
 *     HRESULT (*SetFillSize)(IFillLockBytes*,ULARGE_INTEGER);
 *     HRESULT (*Terminate)(IFillLockBytes*,BOOL);
 * };
 * }
 */
public class IFillLockBytesVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("FillAppend"),
        Constants$root.C_POINTER$LAYOUT.withName("FillAt"),
        Constants$root.C_POINTER$LAYOUT.withName("SetFillSize"),
        Constants$root.C_POINTER$LAYOUT.withName("Terminate")
    ).withName("IFillLockBytesVtbl");
    public static MemoryLayout $LAYOUT() {
        return IFillLockBytesVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IFillLockBytesVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IFillLockBytesVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IFillLockBytes*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IFillLockBytesVtbl.QueryInterface_UP$MH, fi, IFillLockBytesVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IFillLockBytesVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IFillLockBytesVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IFillLockBytes*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IFillLockBytesVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IFillLockBytes*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IFillLockBytesVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IFillLockBytesVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IFillLockBytesVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IFillLockBytesVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IFillLockBytesVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IFillLockBytes*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IFillLockBytesVtbl.AddRef_UP$MH, fi, IFillLockBytesVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IFillLockBytesVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IFillLockBytesVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IFillLockBytes*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IFillLockBytesVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IFillLockBytes*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IFillLockBytesVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IFillLockBytesVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IFillLockBytesVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IFillLockBytesVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IFillLockBytesVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IFillLockBytes*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IFillLockBytesVtbl.Release_UP$MH, fi, IFillLockBytesVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IFillLockBytesVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IFillLockBytesVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IFillLockBytes*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IFillLockBytesVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IFillLockBytes*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IFillLockBytesVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IFillLockBytesVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IFillLockBytesVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor FillAppend$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor FillAppend_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FillAppend_UP$MH = RuntimeHelper.upcallHandle(FillAppend.class, "apply", IFillLockBytesVtbl.FillAppend_UP$FUNC);
    static final FunctionDescriptor FillAppend_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FillAppend_DOWN$MH = RuntimeHelper.downcallHandle(
        IFillLockBytesVtbl.FillAppend_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*FillAppend)(IFillLockBytes*,void*,ULONG,ULONG*);
     * }
     */
    public interface FillAppend {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(FillAppend fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IFillLockBytesVtbl.FillAppend_UP$MH, fi, IFillLockBytesVtbl.FillAppend$FUNC, scope);
        }
        static FillAppend ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (int)IFillLockBytesVtbl.FillAppend_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle FillAppend$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FillAppend"));
    public static VarHandle FillAppend$VH() {
        return IFillLockBytesVtbl.FillAppend$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*FillAppend)(IFillLockBytes*,void*,ULONG,ULONG*);
     * }
     */
    public static MemorySegment FillAppend$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IFillLockBytesVtbl.FillAppend$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*FillAppend)(IFillLockBytes*,void*,ULONG,ULONG*);
     * }
     */
    public static void FillAppend$set(MemorySegment seg, MemorySegment x) {
        IFillLockBytesVtbl.FillAppend$VH.set(seg, x);
    }
    public static MemorySegment FillAppend$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IFillLockBytesVtbl.FillAppend$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FillAppend$set(MemorySegment seg, long index, MemorySegment x) {
        IFillLockBytesVtbl.FillAppend$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static FillAppend FillAppend(MemorySegment segment, SegmentScope scope) {
        return FillAppend.ofAddress(FillAppend$get(segment), scope);
    }
    static final FunctionDescriptor FillAt$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("_ULARGE_INTEGER"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor FillAt_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("_ULARGE_INTEGER"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FillAt_UP$MH = RuntimeHelper.upcallHandle(FillAt.class, "apply", IFillLockBytesVtbl.FillAt_UP$FUNC);
    static final FunctionDescriptor FillAt_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("_ULARGE_INTEGER"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FillAt_DOWN$MH = RuntimeHelper.downcallHandle(
        IFillLockBytesVtbl.FillAt_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*FillAt)(IFillLockBytes*,ULARGE_INTEGER,void*,ULONG,ULONG*);
     * }
     */
    public interface FillAt {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(FillAt fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IFillLockBytesVtbl.FillAt_UP$MH, fi, IFillLockBytesVtbl.FillAt$FUNC, scope);
        }
        static FillAt ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (int)IFillLockBytesVtbl.FillAt_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle FillAt$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FillAt"));
    public static VarHandle FillAt$VH() {
        return IFillLockBytesVtbl.FillAt$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*FillAt)(IFillLockBytes*,ULARGE_INTEGER,void*,ULONG,ULONG*);
     * }
     */
    public static MemorySegment FillAt$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IFillLockBytesVtbl.FillAt$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*FillAt)(IFillLockBytes*,ULARGE_INTEGER,void*,ULONG,ULONG*);
     * }
     */
    public static void FillAt$set(MemorySegment seg, MemorySegment x) {
        IFillLockBytesVtbl.FillAt$VH.set(seg, x);
    }
    public static MemorySegment FillAt$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IFillLockBytesVtbl.FillAt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FillAt$set(MemorySegment seg, long index, MemorySegment x) {
        IFillLockBytesVtbl.FillAt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static FillAt FillAt(MemorySegment segment, SegmentScope scope) {
        return FillAt.ofAddress(FillAt$get(segment), scope);
    }
    static final FunctionDescriptor SetFillSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("_ULARGE_INTEGER")
    );
    static final FunctionDescriptor SetFillSize_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("_ULARGE_INTEGER")
    );
    static final MethodHandle SetFillSize_UP$MH = RuntimeHelper.upcallHandle(SetFillSize.class, "apply", IFillLockBytesVtbl.SetFillSize_UP$FUNC);
    static final FunctionDescriptor SetFillSize_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("_ULARGE_INTEGER")
    );
    static final MethodHandle SetFillSize_DOWN$MH = RuntimeHelper.downcallHandle(
        IFillLockBytesVtbl.SetFillSize_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*SetFillSize)(IFillLockBytes*,ULARGE_INTEGER);
     * }
     */
    public interface SetFillSize {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(SetFillSize fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IFillLockBytesVtbl.SetFillSize_UP$MH, fi, IFillLockBytesVtbl.SetFillSize$FUNC, scope);
        }
        static SetFillSize ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IFillLockBytesVtbl.SetFillSize_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetFillSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetFillSize"));
    public static VarHandle SetFillSize$VH() {
        return IFillLockBytesVtbl.SetFillSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SetFillSize)(IFillLockBytes*,ULARGE_INTEGER);
     * }
     */
    public static MemorySegment SetFillSize$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IFillLockBytesVtbl.SetFillSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SetFillSize)(IFillLockBytes*,ULARGE_INTEGER);
     * }
     */
    public static void SetFillSize$set(MemorySegment seg, MemorySegment x) {
        IFillLockBytesVtbl.SetFillSize$VH.set(seg, x);
    }
    public static MemorySegment SetFillSize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IFillLockBytesVtbl.SetFillSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetFillSize$set(MemorySegment seg, long index, MemorySegment x) {
        IFillLockBytesVtbl.SetFillSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetFillSize SetFillSize(MemorySegment segment, SegmentScope scope) {
        return SetFillSize.ofAddress(SetFillSize$get(segment), scope);
    }
    static final FunctionDescriptor Terminate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor Terminate_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Terminate_UP$MH = RuntimeHelper.upcallHandle(Terminate.class, "apply", IFillLockBytesVtbl.Terminate_UP$FUNC);
    static final FunctionDescriptor Terminate_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Terminate_DOWN$MH = RuntimeHelper.downcallHandle(
        IFillLockBytesVtbl.Terminate_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Terminate)(IFillLockBytes*,BOOL);
     * }
     */
    public interface Terminate {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(Terminate fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IFillLockBytesVtbl.Terminate_UP$MH, fi, IFillLockBytesVtbl.Terminate$FUNC, scope);
        }
        static Terminate ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)IFillLockBytesVtbl.Terminate_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Terminate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Terminate"));
    public static VarHandle Terminate$VH() {
        return IFillLockBytesVtbl.Terminate$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Terminate)(IFillLockBytes*,BOOL);
     * }
     */
    public static MemorySegment Terminate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IFillLockBytesVtbl.Terminate$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Terminate)(IFillLockBytes*,BOOL);
     * }
     */
    public static void Terminate$set(MemorySegment seg, MemorySegment x) {
        IFillLockBytesVtbl.Terminate$VH.set(seg, x);
    }
    public static MemorySegment Terminate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IFillLockBytesVtbl.Terminate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Terminate$set(MemorySegment seg, long index, MemorySegment x) {
        IFillLockBytesVtbl.Terminate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Terminate Terminate(MemorySegment segment, SegmentScope scope) {
        return Terminate.ofAddress(Terminate$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


