// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IMallocVtbl {
 *     HRESULT (*QueryInterface)(IMalloc*,const IID*,void**);
 *     ULONG (*AddRef)(IMalloc*);
 *     ULONG (*Release)(IMalloc*);
 *     void* (*Alloc)(IMalloc*,SIZE_T);
 *     void* (*Realloc)(IMalloc*,void*,SIZE_T);
 *     void (*Free)(IMalloc*,void*);
 *     SIZE_T (*GetSize)(IMalloc*,void*);
 *     int (*DidAlloc)(IMalloc*,void*);
 *     void (*HeapMinimize)(IMalloc*);
 * };
 * }
 */
public class IMallocVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("Alloc"),
        Constants$root.C_POINTER$LAYOUT.withName("Realloc"),
        Constants$root.C_POINTER$LAYOUT.withName("Free"),
        Constants$root.C_POINTER$LAYOUT.withName("GetSize"),
        Constants$root.C_POINTER$LAYOUT.withName("DidAlloc"),
        Constants$root.C_POINTER$LAYOUT.withName("HeapMinimize")
    ).withName("IMallocVtbl");
    public static MemoryLayout $LAYOUT() {
        return IMallocVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IMallocVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IMallocVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IMalloc*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMallocVtbl.QueryInterface_UP$MH, fi, IMallocVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IMallocVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IMallocVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IMalloc*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMallocVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IMalloc*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IMallocVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMallocVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IMallocVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IMallocVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IMallocVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IMalloc*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMallocVtbl.AddRef_UP$MH, fi, IMallocVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IMallocVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IMallocVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IMalloc*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMallocVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IMalloc*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IMallocVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMallocVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IMallocVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IMallocVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IMallocVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IMalloc*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMallocVtbl.Release_UP$MH, fi, IMallocVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IMallocVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IMallocVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IMalloc*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMallocVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IMalloc*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IMallocVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMallocVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IMallocVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor Alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor Alloc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle Alloc_UP$MH = RuntimeHelper.upcallHandle(Alloc.class, "apply", IMallocVtbl.Alloc_UP$FUNC);
    static final FunctionDescriptor Alloc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle Alloc_DOWN$MH = RuntimeHelper.downcallHandle(
        IMallocVtbl.Alloc_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void* (*Alloc)(IMalloc*,SIZE_T);
     * }
     */
    public interface Alloc {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, long _x1);
        static MemorySegment allocate(Alloc fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMallocVtbl.Alloc_UP$MH, fi, IMallocVtbl.Alloc$FUNC, scope);
        }
        static Alloc ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, long __x1) -> {
                try {
                    return (java.lang.foreign.MemorySegment)IMallocVtbl.Alloc_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Alloc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Alloc"));
    public static VarHandle Alloc$VH() {
        return IMallocVtbl.Alloc$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* (*Alloc)(IMalloc*,SIZE_T);
     * }
     */
    public static MemorySegment Alloc$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMallocVtbl.Alloc$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* (*Alloc)(IMalloc*,SIZE_T);
     * }
     */
    public static void Alloc$set(MemorySegment seg, MemorySegment x) {
        IMallocVtbl.Alloc$VH.set(seg, x);
    }
    public static MemorySegment Alloc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMallocVtbl.Alloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Alloc$set(MemorySegment seg, long index, MemorySegment x) {
        IMallocVtbl.Alloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Alloc Alloc(MemorySegment segment, SegmentScope scope) {
        return Alloc.ofAddress(Alloc$get(segment), scope);
    }
    static final FunctionDescriptor Realloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor Realloc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle Realloc_UP$MH = RuntimeHelper.upcallHandle(Realloc.class, "apply", IMallocVtbl.Realloc_UP$FUNC);
    static final FunctionDescriptor Realloc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle Realloc_DOWN$MH = RuntimeHelper.downcallHandle(
        IMallocVtbl.Realloc_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void* (*Realloc)(IMalloc*,void*,SIZE_T);
     * }
     */
    public interface Realloc {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, long _x2);
        static MemorySegment allocate(Realloc fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMallocVtbl.Realloc_UP$MH, fi, IMallocVtbl.Realloc$FUNC, scope);
        }
        static Realloc ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, long __x2) -> {
                try {
                    return (java.lang.foreign.MemorySegment)IMallocVtbl.Realloc_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Realloc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Realloc"));
    public static VarHandle Realloc$VH() {
        return IMallocVtbl.Realloc$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* (*Realloc)(IMalloc*,void*,SIZE_T);
     * }
     */
    public static MemorySegment Realloc$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMallocVtbl.Realloc$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* (*Realloc)(IMalloc*,void*,SIZE_T);
     * }
     */
    public static void Realloc$set(MemorySegment seg, MemorySegment x) {
        IMallocVtbl.Realloc$VH.set(seg, x);
    }
    public static MemorySegment Realloc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMallocVtbl.Realloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Realloc$set(MemorySegment seg, long index, MemorySegment x) {
        IMallocVtbl.Realloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Realloc Realloc(MemorySegment segment, SegmentScope scope) {
        return Realloc.ofAddress(Realloc$get(segment), scope);
    }
    static final FunctionDescriptor Free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor Free_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Free_UP$MH = RuntimeHelper.upcallHandle(Free.class, "apply", IMallocVtbl.Free_UP$FUNC);
    static final FunctionDescriptor Free_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Free_DOWN$MH = RuntimeHelper.downcallHandle(
        IMallocVtbl.Free_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*Free)(IMalloc*,void*);
     * }
     */
    public interface Free {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(Free fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMallocVtbl.Free_UP$MH, fi, IMallocVtbl.Free$FUNC, scope);
        }
        static Free ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    IMallocVtbl.Free_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Free$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Free"));
    public static VarHandle Free$VH() {
        return IMallocVtbl.Free$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*Free)(IMalloc*,void*);
     * }
     */
    public static MemorySegment Free$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMallocVtbl.Free$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*Free)(IMalloc*,void*);
     * }
     */
    public static void Free$set(MemorySegment seg, MemorySegment x) {
        IMallocVtbl.Free$VH.set(seg, x);
    }
    public static MemorySegment Free$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMallocVtbl.Free$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Free$set(MemorySegment seg, long index, MemorySegment x) {
        IMallocVtbl.Free$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Free Free(MemorySegment segment, SegmentScope scope) {
        return Free.ofAddress(Free$get(segment), scope);
    }
    static final FunctionDescriptor GetSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GetSize_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSize_UP$MH = RuntimeHelper.upcallHandle(GetSize.class, "apply", IMallocVtbl.GetSize_UP$FUNC);
    static final FunctionDescriptor GetSize_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSize_DOWN$MH = RuntimeHelper.downcallHandle(
        IMallocVtbl.GetSize_DOWN$FUNC
    );
    /**
     * {@snippet :
 * SIZE_T (*GetSize)(IMalloc*,void*);
     * }
     */
    public interface GetSize {

        long apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetSize fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMallocVtbl.GetSize_UP$MH, fi, IMallocVtbl.GetSize$FUNC, scope);
        }
        static GetSize ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (long)IMallocVtbl.GetSize_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetSize"));
    public static VarHandle GetSize$VH() {
        return IMallocVtbl.GetSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SIZE_T (*GetSize)(IMalloc*,void*);
     * }
     */
    public static MemorySegment GetSize$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMallocVtbl.GetSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SIZE_T (*GetSize)(IMalloc*,void*);
     * }
     */
    public static void GetSize$set(MemorySegment seg, MemorySegment x) {
        IMallocVtbl.GetSize$VH.set(seg, x);
    }
    public static MemorySegment GetSize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMallocVtbl.GetSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetSize$set(MemorySegment seg, long index, MemorySegment x) {
        IMallocVtbl.GetSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetSize GetSize(MemorySegment segment, SegmentScope scope) {
        return GetSize.ofAddress(GetSize$get(segment), scope);
    }
    static final FunctionDescriptor DidAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor DidAlloc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DidAlloc_UP$MH = RuntimeHelper.upcallHandle(DidAlloc.class, "apply", IMallocVtbl.DidAlloc_UP$FUNC);
    static final FunctionDescriptor DidAlloc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DidAlloc_DOWN$MH = RuntimeHelper.downcallHandle(
        IMallocVtbl.DidAlloc_DOWN$FUNC
    );
    /**
     * {@snippet :
 * int (*DidAlloc)(IMalloc*,void*);
     * }
     */
    public interface DidAlloc {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(DidAlloc fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMallocVtbl.DidAlloc_UP$MH, fi, IMallocVtbl.DidAlloc$FUNC, scope);
        }
        static DidAlloc ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IMallocVtbl.DidAlloc_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle DidAlloc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DidAlloc"));
    public static VarHandle DidAlloc$VH() {
        return IMallocVtbl.DidAlloc$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*DidAlloc)(IMalloc*,void*);
     * }
     */
    public static MemorySegment DidAlloc$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMallocVtbl.DidAlloc$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*DidAlloc)(IMalloc*,void*);
     * }
     */
    public static void DidAlloc$set(MemorySegment seg, MemorySegment x) {
        IMallocVtbl.DidAlloc$VH.set(seg, x);
    }
    public static MemorySegment DidAlloc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMallocVtbl.DidAlloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DidAlloc$set(MemorySegment seg, long index, MemorySegment x) {
        IMallocVtbl.DidAlloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static DidAlloc DidAlloc(MemorySegment segment, SegmentScope scope) {
        return DidAlloc.ofAddress(DidAlloc$get(segment), scope);
    }
    static final FunctionDescriptor HeapMinimize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor HeapMinimize_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HeapMinimize_UP$MH = RuntimeHelper.upcallHandle(HeapMinimize.class, "apply", IMallocVtbl.HeapMinimize_UP$FUNC);
    static final FunctionDescriptor HeapMinimize_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HeapMinimize_DOWN$MH = RuntimeHelper.downcallHandle(
        IMallocVtbl.HeapMinimize_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*HeapMinimize)(IMalloc*);
     * }
     */
    public interface HeapMinimize {

        void apply(java.lang.foreign.MemorySegment pParameter);
        static MemorySegment allocate(HeapMinimize fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IMallocVtbl.HeapMinimize_UP$MH, fi, IMallocVtbl.HeapMinimize$FUNC, scope);
        }
        static HeapMinimize ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _pParameter) -> {
                try {
                    IMallocVtbl.HeapMinimize_DOWN$MH.invokeExact(symbol, _pParameter);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle HeapMinimize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HeapMinimize"));
    public static VarHandle HeapMinimize$VH() {
        return IMallocVtbl.HeapMinimize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*HeapMinimize)(IMalloc*);
     * }
     */
    public static MemorySegment HeapMinimize$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IMallocVtbl.HeapMinimize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*HeapMinimize)(IMalloc*);
     * }
     */
    public static void HeapMinimize$set(MemorySegment seg, MemorySegment x) {
        IMallocVtbl.HeapMinimize$VH.set(seg, x);
    }
    public static MemorySegment HeapMinimize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IMallocVtbl.HeapMinimize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HeapMinimize$set(MemorySegment seg, long index, MemorySegment x) {
        IMallocVtbl.HeapMinimize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static HeapMinimize HeapMinimize(MemorySegment segment, SegmentScope scope) {
        return HeapMinimize.ofAddress(HeapMinimize$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

