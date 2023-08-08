// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IWinInetFileStreamVtbl {
 *     HRESULT (*QueryInterface)(IWinInetFileStream*,const IID*,void**);
 *     ULONG (*AddRef)(IWinInetFileStream*);
 *     ULONG (*Release)(IWinInetFileStream*);
 *     HRESULT (*SetHandleForUnlock)(IWinInetFileStream*,DWORD_PTR,DWORD_PTR);
 *     HRESULT (*SetDeleteFile)(IWinInetFileStream*,DWORD_PTR);
 * };
 * }
 */
public class IWinInetFileStreamVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("SetHandleForUnlock"),
        Constants$root.C_POINTER$LAYOUT.withName("SetDeleteFile")
    ).withName("IWinInetFileStreamVtbl");
    public static MemoryLayout $LAYOUT() {
        return IWinInetFileStreamVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IWinInetFileStreamVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IWinInetFileStreamVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IWinInetFileStream*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IWinInetFileStreamVtbl.QueryInterface_UP$MH, fi, IWinInetFileStreamVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IWinInetFileStreamVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IWinInetFileStreamVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IWinInetFileStream*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IWinInetFileStreamVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IWinInetFileStream*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IWinInetFileStreamVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IWinInetFileStreamVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IWinInetFileStreamVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IWinInetFileStreamVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IWinInetFileStreamVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IWinInetFileStream*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IWinInetFileStreamVtbl.AddRef_UP$MH, fi, IWinInetFileStreamVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IWinInetFileStreamVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IWinInetFileStreamVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IWinInetFileStream*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IWinInetFileStreamVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IWinInetFileStream*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IWinInetFileStreamVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IWinInetFileStreamVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IWinInetFileStreamVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IWinInetFileStreamVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IWinInetFileStreamVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IWinInetFileStream*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IWinInetFileStreamVtbl.Release_UP$MH, fi, IWinInetFileStreamVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IWinInetFileStreamVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IWinInetFileStreamVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IWinInetFileStream*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IWinInetFileStreamVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IWinInetFileStream*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IWinInetFileStreamVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IWinInetFileStreamVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IWinInetFileStreamVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor SetHandleForUnlock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor SetHandleForUnlock_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SetHandleForUnlock_UP$MH = RuntimeHelper.upcallHandle(SetHandleForUnlock.class, "apply", IWinInetFileStreamVtbl.SetHandleForUnlock_UP$FUNC);
    static final FunctionDescriptor SetHandleForUnlock_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SetHandleForUnlock_DOWN$MH = RuntimeHelper.downcallHandle(
        IWinInetFileStreamVtbl.SetHandleForUnlock_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*SetHandleForUnlock)(IWinInetFileStream*,DWORD_PTR,DWORD_PTR);
     * }
     */
    public interface SetHandleForUnlock {

        int apply(java.lang.foreign.MemorySegment _x0, long _x1, long _x2);
        static MemorySegment allocate(SetHandleForUnlock fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IWinInetFileStreamVtbl.SetHandleForUnlock_UP$MH, fi, IWinInetFileStreamVtbl.SetHandleForUnlock$FUNC, scope);
        }
        static SetHandleForUnlock ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, long __x1, long __x2) -> {
                try {
                    return (int)IWinInetFileStreamVtbl.SetHandleForUnlock_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetHandleForUnlock$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetHandleForUnlock"));
    public static VarHandle SetHandleForUnlock$VH() {
        return IWinInetFileStreamVtbl.SetHandleForUnlock$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SetHandleForUnlock)(IWinInetFileStream*,DWORD_PTR,DWORD_PTR);
     * }
     */
    public static MemorySegment SetHandleForUnlock$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IWinInetFileStreamVtbl.SetHandleForUnlock$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SetHandleForUnlock)(IWinInetFileStream*,DWORD_PTR,DWORD_PTR);
     * }
     */
    public static void SetHandleForUnlock$set(MemorySegment seg, MemorySegment x) {
        IWinInetFileStreamVtbl.SetHandleForUnlock$VH.set(seg, x);
    }
    public static MemorySegment SetHandleForUnlock$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IWinInetFileStreamVtbl.SetHandleForUnlock$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetHandleForUnlock$set(MemorySegment seg, long index, MemorySegment x) {
        IWinInetFileStreamVtbl.SetHandleForUnlock$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetHandleForUnlock SetHandleForUnlock(MemorySegment segment, SegmentScope scope) {
        return SetHandleForUnlock.ofAddress(SetHandleForUnlock$get(segment), scope);
    }
    static final FunctionDescriptor SetDeleteFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor SetDeleteFile_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SetDeleteFile_UP$MH = RuntimeHelper.upcallHandle(SetDeleteFile.class, "apply", IWinInetFileStreamVtbl.SetDeleteFile_UP$FUNC);
    static final FunctionDescriptor SetDeleteFile_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SetDeleteFile_DOWN$MH = RuntimeHelper.downcallHandle(
        IWinInetFileStreamVtbl.SetDeleteFile_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*SetDeleteFile)(IWinInetFileStream*,DWORD_PTR);
     * }
     */
    public interface SetDeleteFile {

        int apply(java.lang.foreign.MemorySegment _x0, long _x1);
        static MemorySegment allocate(SetDeleteFile fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IWinInetFileStreamVtbl.SetDeleteFile_UP$MH, fi, IWinInetFileStreamVtbl.SetDeleteFile$FUNC, scope);
        }
        static SetDeleteFile ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, long __x1) -> {
                try {
                    return (int)IWinInetFileStreamVtbl.SetDeleteFile_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetDeleteFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetDeleteFile"));
    public static VarHandle SetDeleteFile$VH() {
        return IWinInetFileStreamVtbl.SetDeleteFile$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SetDeleteFile)(IWinInetFileStream*,DWORD_PTR);
     * }
     */
    public static MemorySegment SetDeleteFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IWinInetFileStreamVtbl.SetDeleteFile$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SetDeleteFile)(IWinInetFileStream*,DWORD_PTR);
     * }
     */
    public static void SetDeleteFile$set(MemorySegment seg, MemorySegment x) {
        IWinInetFileStreamVtbl.SetDeleteFile$VH.set(seg, x);
    }
    public static MemorySegment SetDeleteFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IWinInetFileStreamVtbl.SetDeleteFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetDeleteFile$set(MemorySegment seg, long index, MemorySegment x) {
        IWinInetFileStreamVtbl.SetDeleteFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetDeleteFile SetDeleteFile(MemorySegment segment, SegmentScope scope) {
        return SetDeleteFile.ofAddress(SetDeleteFile$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


