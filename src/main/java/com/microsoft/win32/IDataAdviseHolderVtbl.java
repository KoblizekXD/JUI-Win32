// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IDataAdviseHolderVtbl {
 *     HRESULT (*QueryInterface)(IDataAdviseHolder*,const IID*,void**);
 *     ULONG (*AddRef)(IDataAdviseHolder*);
 *     ULONG (*Release)(IDataAdviseHolder*);
 *     HRESULT (*Advise)(IDataAdviseHolder*,IDataObject*,FORMATETC*,DWORD,IAdviseSink*,DWORD*);
 *     HRESULT (*Unadvise)(IDataAdviseHolder*,DWORD);
 *     HRESULT (*EnumAdvise)(IDataAdviseHolder*,IEnumSTATDATA**);
 *     HRESULT (*SendOnDataChange)(IDataAdviseHolder*,IDataObject*,DWORD,DWORD);
 * };
 * }
 */
public class IDataAdviseHolderVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("Advise"),
        Constants$root.C_POINTER$LAYOUT.withName("Unadvise"),
        Constants$root.C_POINTER$LAYOUT.withName("EnumAdvise"),
        Constants$root.C_POINTER$LAYOUT.withName("SendOnDataChange")
    ).withName("IDataAdviseHolderVtbl");
    public static MemoryLayout $LAYOUT() {
        return IDataAdviseHolderVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IDataAdviseHolderVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IDataAdviseHolderVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IDataAdviseHolder*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IDataAdviseHolderVtbl.QueryInterface_UP$MH, fi, IDataAdviseHolderVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IDataAdviseHolderVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IDataAdviseHolderVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IDataAdviseHolder*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IDataAdviseHolderVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IDataAdviseHolder*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IDataAdviseHolderVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IDataAdviseHolderVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IDataAdviseHolderVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IDataAdviseHolderVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IDataAdviseHolderVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IDataAdviseHolder*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IDataAdviseHolderVtbl.AddRef_UP$MH, fi, IDataAdviseHolderVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IDataAdviseHolderVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IDataAdviseHolderVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IDataAdviseHolder*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IDataAdviseHolderVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IDataAdviseHolder*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IDataAdviseHolderVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IDataAdviseHolderVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IDataAdviseHolderVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IDataAdviseHolderVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IDataAdviseHolderVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IDataAdviseHolder*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IDataAdviseHolderVtbl.Release_UP$MH, fi, IDataAdviseHolderVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IDataAdviseHolderVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IDataAdviseHolderVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IDataAdviseHolder*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IDataAdviseHolderVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IDataAdviseHolder*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IDataAdviseHolderVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IDataAdviseHolderVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IDataAdviseHolderVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor Advise$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor Advise_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Advise_UP$MH = RuntimeHelper.upcallHandle(Advise.class, "apply", IDataAdviseHolderVtbl.Advise_UP$FUNC);
    static final FunctionDescriptor Advise_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Advise_DOWN$MH = RuntimeHelper.downcallHandle(
        IDataAdviseHolderVtbl.Advise_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Advise)(IDataAdviseHolder*,IDataObject*,FORMATETC*,DWORD,IAdviseSink*,DWORD*);
     * }
     */
    public interface Advise {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5);
        static MemorySegment allocate(Advise fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IDataAdviseHolderVtbl.Advise_UP$MH, fi, IDataAdviseHolderVtbl.Advise$FUNC, scope);
        }
        static Advise ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5) -> {
                try {
                    return (int)IDataAdviseHolderVtbl.Advise_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Advise$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Advise"));
    public static VarHandle Advise$VH() {
        return IDataAdviseHolderVtbl.Advise$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Advise)(IDataAdviseHolder*,IDataObject*,FORMATETC*,DWORD,IAdviseSink*,DWORD*);
     * }
     */
    public static MemorySegment Advise$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IDataAdviseHolderVtbl.Advise$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Advise)(IDataAdviseHolder*,IDataObject*,FORMATETC*,DWORD,IAdviseSink*,DWORD*);
     * }
     */
    public static void Advise$set(MemorySegment seg, MemorySegment x) {
        IDataAdviseHolderVtbl.Advise$VH.set(seg, x);
    }
    public static MemorySegment Advise$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IDataAdviseHolderVtbl.Advise$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Advise$set(MemorySegment seg, long index, MemorySegment x) {
        IDataAdviseHolderVtbl.Advise$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Advise Advise(MemorySegment segment, SegmentScope scope) {
        return Advise.ofAddress(Advise$get(segment), scope);
    }
    static final FunctionDescriptor Unadvise$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor Unadvise_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Unadvise_UP$MH = RuntimeHelper.upcallHandle(Unadvise.class, "apply", IDataAdviseHolderVtbl.Unadvise_UP$FUNC);
    static final FunctionDescriptor Unadvise_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Unadvise_DOWN$MH = RuntimeHelper.downcallHandle(
        IDataAdviseHolderVtbl.Unadvise_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Unadvise)(IDataAdviseHolder*,DWORD);
     * }
     */
    public interface Unadvise {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(Unadvise fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IDataAdviseHolderVtbl.Unadvise_UP$MH, fi, IDataAdviseHolderVtbl.Unadvise$FUNC, scope);
        }
        static Unadvise ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)IDataAdviseHolderVtbl.Unadvise_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Unadvise$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Unadvise"));
    public static VarHandle Unadvise$VH() {
        return IDataAdviseHolderVtbl.Unadvise$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Unadvise)(IDataAdviseHolder*,DWORD);
     * }
     */
    public static MemorySegment Unadvise$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IDataAdviseHolderVtbl.Unadvise$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Unadvise)(IDataAdviseHolder*,DWORD);
     * }
     */
    public static void Unadvise$set(MemorySegment seg, MemorySegment x) {
        IDataAdviseHolderVtbl.Unadvise$VH.set(seg, x);
    }
    public static MemorySegment Unadvise$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IDataAdviseHolderVtbl.Unadvise$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Unadvise$set(MemorySegment seg, long index, MemorySegment x) {
        IDataAdviseHolderVtbl.Unadvise$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Unadvise Unadvise(MemorySegment segment, SegmentScope scope) {
        return Unadvise.ofAddress(Unadvise$get(segment), scope);
    }
    static final FunctionDescriptor EnumAdvise$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor EnumAdvise_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumAdvise_UP$MH = RuntimeHelper.upcallHandle(EnumAdvise.class, "apply", IDataAdviseHolderVtbl.EnumAdvise_UP$FUNC);
    static final FunctionDescriptor EnumAdvise_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumAdvise_DOWN$MH = RuntimeHelper.downcallHandle(
        IDataAdviseHolderVtbl.EnumAdvise_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*EnumAdvise)(IDataAdviseHolder*,IEnumSTATDATA**);
     * }
     */
    public interface EnumAdvise {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(EnumAdvise fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IDataAdviseHolderVtbl.EnumAdvise_UP$MH, fi, IDataAdviseHolderVtbl.EnumAdvise$FUNC, scope);
        }
        static EnumAdvise ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IDataAdviseHolderVtbl.EnumAdvise_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle EnumAdvise$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EnumAdvise"));
    public static VarHandle EnumAdvise$VH() {
        return IDataAdviseHolderVtbl.EnumAdvise$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*EnumAdvise)(IDataAdviseHolder*,IEnumSTATDATA**);
     * }
     */
    public static MemorySegment EnumAdvise$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IDataAdviseHolderVtbl.EnumAdvise$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*EnumAdvise)(IDataAdviseHolder*,IEnumSTATDATA**);
     * }
     */
    public static void EnumAdvise$set(MemorySegment seg, MemorySegment x) {
        IDataAdviseHolderVtbl.EnumAdvise$VH.set(seg, x);
    }
    public static MemorySegment EnumAdvise$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IDataAdviseHolderVtbl.EnumAdvise$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnumAdvise$set(MemorySegment seg, long index, MemorySegment x) {
        IDataAdviseHolderVtbl.EnumAdvise$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static EnumAdvise EnumAdvise(MemorySegment segment, SegmentScope scope) {
        return EnumAdvise.ofAddress(EnumAdvise$get(segment), scope);
    }
    static final FunctionDescriptor SendOnDataChange$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor SendOnDataChange_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SendOnDataChange_UP$MH = RuntimeHelper.upcallHandle(SendOnDataChange.class, "apply", IDataAdviseHolderVtbl.SendOnDataChange_UP$FUNC);
    static final FunctionDescriptor SendOnDataChange_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SendOnDataChange_DOWN$MH = RuntimeHelper.downcallHandle(
        IDataAdviseHolderVtbl.SendOnDataChange_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*SendOnDataChange)(IDataAdviseHolder*,IDataObject*,DWORD,DWORD);
     * }
     */
    public interface SendOnDataChange {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3);
        static MemorySegment allocate(SendOnDataChange fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IDataAdviseHolderVtbl.SendOnDataChange_UP$MH, fi, IDataAdviseHolderVtbl.SendOnDataChange$FUNC, scope);
        }
        static SendOnDataChange ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3) -> {
                try {
                    return (int)IDataAdviseHolderVtbl.SendOnDataChange_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SendOnDataChange$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SendOnDataChange"));
    public static VarHandle SendOnDataChange$VH() {
        return IDataAdviseHolderVtbl.SendOnDataChange$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SendOnDataChange)(IDataAdviseHolder*,IDataObject*,DWORD,DWORD);
     * }
     */
    public static MemorySegment SendOnDataChange$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IDataAdviseHolderVtbl.SendOnDataChange$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SendOnDataChange)(IDataAdviseHolder*,IDataObject*,DWORD,DWORD);
     * }
     */
    public static void SendOnDataChange$set(MemorySegment seg, MemorySegment x) {
        IDataAdviseHolderVtbl.SendOnDataChange$VH.set(seg, x);
    }
    public static MemorySegment SendOnDataChange$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IDataAdviseHolderVtbl.SendOnDataChange$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SendOnDataChange$set(MemorySegment seg, long index, MemorySegment x) {
        IDataAdviseHolderVtbl.SendOnDataChange$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SendOnDataChange SendOnDataChange(MemorySegment segment, SegmentScope scope) {
        return SendOnDataChange.ofAddress(SendOnDataChange$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


