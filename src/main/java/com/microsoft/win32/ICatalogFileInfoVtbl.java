// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct ICatalogFileInfoVtbl {
 *     HRESULT (*QueryInterface)(ICatalogFileInfo*,const IID*,void**);
 *     ULONG (*AddRef)(ICatalogFileInfo*);
 *     ULONG (*Release)(ICatalogFileInfo*);
 *     HRESULT (*GetCatalogFile)(ICatalogFileInfo*,LPSTR*);
 *     HRESULT (*GetJavaTrust)(ICatalogFileInfo*,void**);
 * };
 * }
 */
public class ICatalogFileInfoVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("GetCatalogFile"),
        Constants$root.C_POINTER$LAYOUT.withName("GetJavaTrust")
    ).withName("ICatalogFileInfoVtbl");
    public static MemoryLayout $LAYOUT() {
        return ICatalogFileInfoVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", ICatalogFileInfoVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        ICatalogFileInfoVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(ICatalogFileInfo*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(ICatalogFileInfoVtbl.QueryInterface_UP$MH, fi, ICatalogFileInfoVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)ICatalogFileInfoVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return ICatalogFileInfoVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(ICatalogFileInfo*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)ICatalogFileInfoVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(ICatalogFileInfo*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        ICatalogFileInfoVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)ICatalogFileInfoVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        ICatalogFileInfoVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", ICatalogFileInfoVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        ICatalogFileInfoVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(ICatalogFileInfo*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(ICatalogFileInfoVtbl.AddRef_UP$MH, fi, ICatalogFileInfoVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)ICatalogFileInfoVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return ICatalogFileInfoVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(ICatalogFileInfo*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)ICatalogFileInfoVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(ICatalogFileInfo*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        ICatalogFileInfoVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)ICatalogFileInfoVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        ICatalogFileInfoVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", ICatalogFileInfoVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        ICatalogFileInfoVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(ICatalogFileInfo*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(ICatalogFileInfoVtbl.Release_UP$MH, fi, ICatalogFileInfoVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)ICatalogFileInfoVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return ICatalogFileInfoVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(ICatalogFileInfo*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)ICatalogFileInfoVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(ICatalogFileInfo*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        ICatalogFileInfoVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)ICatalogFileInfoVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        ICatalogFileInfoVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor GetCatalogFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GetCatalogFile_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCatalogFile_UP$MH = RuntimeHelper.upcallHandle(GetCatalogFile.class, "apply", ICatalogFileInfoVtbl.GetCatalogFile_UP$FUNC);
    static final FunctionDescriptor GetCatalogFile_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCatalogFile_DOWN$MH = RuntimeHelper.downcallHandle(
        ICatalogFileInfoVtbl.GetCatalogFile_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*GetCatalogFile)(ICatalogFileInfo*,LPSTR*);
     * }
     */
    public interface GetCatalogFile {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetCatalogFile fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(ICatalogFileInfoVtbl.GetCatalogFile_UP$MH, fi, ICatalogFileInfoVtbl.GetCatalogFile$FUNC, scope);
        }
        static GetCatalogFile ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)ICatalogFileInfoVtbl.GetCatalogFile_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetCatalogFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetCatalogFile"));
    public static VarHandle GetCatalogFile$VH() {
        return ICatalogFileInfoVtbl.GetCatalogFile$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetCatalogFile)(ICatalogFileInfo*,LPSTR*);
     * }
     */
    public static MemorySegment GetCatalogFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)ICatalogFileInfoVtbl.GetCatalogFile$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetCatalogFile)(ICatalogFileInfo*,LPSTR*);
     * }
     */
    public static void GetCatalogFile$set(MemorySegment seg, MemorySegment x) {
        ICatalogFileInfoVtbl.GetCatalogFile$VH.set(seg, x);
    }
    public static MemorySegment GetCatalogFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)ICatalogFileInfoVtbl.GetCatalogFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetCatalogFile$set(MemorySegment seg, long index, MemorySegment x) {
        ICatalogFileInfoVtbl.GetCatalogFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetCatalogFile GetCatalogFile(MemorySegment segment, SegmentScope scope) {
        return GetCatalogFile.ofAddress(GetCatalogFile$get(segment), scope);
    }
    static final FunctionDescriptor GetJavaTrust$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GetJavaTrust_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetJavaTrust_UP$MH = RuntimeHelper.upcallHandle(GetJavaTrust.class, "apply", ICatalogFileInfoVtbl.GetJavaTrust_UP$FUNC);
    static final FunctionDescriptor GetJavaTrust_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetJavaTrust_DOWN$MH = RuntimeHelper.downcallHandle(
        ICatalogFileInfoVtbl.GetJavaTrust_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*GetJavaTrust)(ICatalogFileInfo*,void**);
     * }
     */
    public interface GetJavaTrust {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetJavaTrust fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(ICatalogFileInfoVtbl.GetJavaTrust_UP$MH, fi, ICatalogFileInfoVtbl.GetJavaTrust$FUNC, scope);
        }
        static GetJavaTrust ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)ICatalogFileInfoVtbl.GetJavaTrust_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetJavaTrust$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetJavaTrust"));
    public static VarHandle GetJavaTrust$VH() {
        return ICatalogFileInfoVtbl.GetJavaTrust$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetJavaTrust)(ICatalogFileInfo*,void**);
     * }
     */
    public static MemorySegment GetJavaTrust$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)ICatalogFileInfoVtbl.GetJavaTrust$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetJavaTrust)(ICatalogFileInfo*,void**);
     * }
     */
    public static void GetJavaTrust$set(MemorySegment seg, MemorySegment x) {
        ICatalogFileInfoVtbl.GetJavaTrust$VH.set(seg, x);
    }
    public static MemorySegment GetJavaTrust$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)ICatalogFileInfoVtbl.GetJavaTrust$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetJavaTrust$set(MemorySegment seg, long index, MemorySegment x) {
        ICatalogFileInfoVtbl.GetJavaTrust$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetJavaTrust GetJavaTrust(MemorySegment segment, SegmentScope scope) {
        return GetJavaTrust.ofAddress(GetJavaTrust$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


