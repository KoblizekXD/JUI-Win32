// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IGlobalOptionsVtbl {
 *     HRESULT (*QueryInterface)(IGlobalOptions*,const IID*,void**);
 *     ULONG (*AddRef)(IGlobalOptions*);
 *     ULONG (*Release)(IGlobalOptions*);
 *     HRESULT (*Set)(IGlobalOptions*,GLOBALOPT_PROPERTIES,ULONG_PTR);
 *     HRESULT (*Query)(IGlobalOptions*,GLOBALOPT_PROPERTIES,ULONG_PTR*);
 * };
 * }
 */
public class IGlobalOptionsVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("Set"),
        Constants$root.C_POINTER$LAYOUT.withName("Query")
    ).withName("IGlobalOptionsVtbl");
    public static MemoryLayout $LAYOUT() {
        return IGlobalOptionsVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IGlobalOptionsVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IGlobalOptionsVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IGlobalOptions*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IGlobalOptionsVtbl.QueryInterface_UP$MH, fi, IGlobalOptionsVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IGlobalOptionsVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IGlobalOptionsVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IGlobalOptions*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IGlobalOptionsVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IGlobalOptions*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IGlobalOptionsVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IGlobalOptionsVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IGlobalOptionsVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IGlobalOptionsVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IGlobalOptionsVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IGlobalOptions*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IGlobalOptionsVtbl.AddRef_UP$MH, fi, IGlobalOptionsVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IGlobalOptionsVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IGlobalOptionsVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IGlobalOptions*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IGlobalOptionsVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IGlobalOptions*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IGlobalOptionsVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IGlobalOptionsVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IGlobalOptionsVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IGlobalOptionsVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IGlobalOptionsVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IGlobalOptions*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IGlobalOptionsVtbl.Release_UP$MH, fi, IGlobalOptionsVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IGlobalOptionsVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IGlobalOptionsVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IGlobalOptions*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IGlobalOptionsVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IGlobalOptions*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IGlobalOptionsVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IGlobalOptionsVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IGlobalOptionsVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor Set$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor Set_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle Set_UP$MH = RuntimeHelper.upcallHandle(Set.class, "apply", IGlobalOptionsVtbl.Set_UP$FUNC);
    static final FunctionDescriptor Set_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle Set_DOWN$MH = RuntimeHelper.downcallHandle(
        IGlobalOptionsVtbl.Set_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Set)(IGlobalOptions*,GLOBALOPT_PROPERTIES,ULONG_PTR);
     * }
     */
    public interface Set {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, long _x2);
        static MemorySegment allocate(Set fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IGlobalOptionsVtbl.Set_UP$MH, fi, IGlobalOptionsVtbl.Set$FUNC, scope);
        }
        static Set ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, long __x2) -> {
                try {
                    return (int)IGlobalOptionsVtbl.Set_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Set$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Set"));
    public static VarHandle Set$VH() {
        return IGlobalOptionsVtbl.Set$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Set)(IGlobalOptions*,GLOBALOPT_PROPERTIES,ULONG_PTR);
     * }
     */
    public static MemorySegment Set$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IGlobalOptionsVtbl.Set$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Set)(IGlobalOptions*,GLOBALOPT_PROPERTIES,ULONG_PTR);
     * }
     */
    public static void Set$set(MemorySegment seg, MemorySegment x) {
        IGlobalOptionsVtbl.Set$VH.set(seg, x);
    }
    public static MemorySegment Set$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IGlobalOptionsVtbl.Set$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Set$set(MemorySegment seg, long index, MemorySegment x) {
        IGlobalOptionsVtbl.Set$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Set Set(MemorySegment segment, SegmentScope scope) {
        return Set.ofAddress(Set$get(segment), scope);
    }
    static final FunctionDescriptor Query$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor Query_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Query_UP$MH = RuntimeHelper.upcallHandle(Query.class, "apply", IGlobalOptionsVtbl.Query_UP$FUNC);
    static final FunctionDescriptor Query_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Query_DOWN$MH = RuntimeHelper.downcallHandle(
        IGlobalOptionsVtbl.Query_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Query)(IGlobalOptions*,GLOBALOPT_PROPERTIES,ULONG_PTR*);
     * }
     */
    public interface Query {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(Query fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IGlobalOptionsVtbl.Query_UP$MH, fi, IGlobalOptionsVtbl.Query$FUNC, scope);
        }
        static Query ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IGlobalOptionsVtbl.Query_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Query$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Query"));
    public static VarHandle Query$VH() {
        return IGlobalOptionsVtbl.Query$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Query)(IGlobalOptions*,GLOBALOPT_PROPERTIES,ULONG_PTR*);
     * }
     */
    public static MemorySegment Query$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IGlobalOptionsVtbl.Query$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Query)(IGlobalOptions*,GLOBALOPT_PROPERTIES,ULONG_PTR*);
     * }
     */
    public static void Query$set(MemorySegment seg, MemorySegment x) {
        IGlobalOptionsVtbl.Query$VH.set(seg, x);
    }
    public static MemorySegment Query$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IGlobalOptionsVtbl.Query$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Query$set(MemorySegment seg, long index, MemorySegment x) {
        IGlobalOptionsVtbl.Query$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Query Query(MemorySegment segment, SegmentScope scope) {
        return Query.ofAddress(Query$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

