// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IPropertySetStorageVtbl {
 *     HRESULT (*QueryInterface)(IPropertySetStorage*,const IID*,void**);
 *     ULONG (*AddRef)(IPropertySetStorage*);
 *     ULONG (*Release)(IPropertySetStorage*);
 *     HRESULT (*Create)(IPropertySetStorage*,const IID*,const CLSID*,DWORD,DWORD,IPropertyStorage**);
 *     HRESULT (*Open)(IPropertySetStorage*,const IID*,DWORD,IPropertyStorage**);
 *     HRESULT (*Delete)(IPropertySetStorage*,const IID*);
 *     HRESULT (*Enum)(IPropertySetStorage*,IEnumSTATPROPSETSTG**);
 * };
 * }
 */
public class IPropertySetStorageVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("Create"),
        Constants$root.C_POINTER$LAYOUT.withName("Open"),
        Constants$root.C_POINTER$LAYOUT.withName("Delete"),
        Constants$root.C_POINTER$LAYOUT.withName("Enum")
    ).withName("IPropertySetStorageVtbl");
    public static MemoryLayout $LAYOUT() {
        return IPropertySetStorageVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IPropertySetStorageVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IPropertySetStorageVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IPropertySetStorage*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IPropertySetStorageVtbl.QueryInterface_UP$MH, fi, IPropertySetStorageVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IPropertySetStorageVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IPropertySetStorageVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IPropertySetStorage*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IPropertySetStorageVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IPropertySetStorage*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IPropertySetStorageVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IPropertySetStorageVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IPropertySetStorageVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IPropertySetStorageVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IPropertySetStorageVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IPropertySetStorage*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IPropertySetStorageVtbl.AddRef_UP$MH, fi, IPropertySetStorageVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IPropertySetStorageVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IPropertySetStorageVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IPropertySetStorage*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IPropertySetStorageVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IPropertySetStorage*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IPropertySetStorageVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IPropertySetStorageVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IPropertySetStorageVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IPropertySetStorageVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IPropertySetStorageVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IPropertySetStorage*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IPropertySetStorageVtbl.Release_UP$MH, fi, IPropertySetStorageVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IPropertySetStorageVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IPropertySetStorageVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IPropertySetStorage*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IPropertySetStorageVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IPropertySetStorage*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IPropertySetStorageVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IPropertySetStorageVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IPropertySetStorageVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor Create$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor Create_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Create_UP$MH = RuntimeHelper.upcallHandle(Create.class, "apply", IPropertySetStorageVtbl.Create_UP$FUNC);
    static final FunctionDescriptor Create_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Create_DOWN$MH = RuntimeHelper.downcallHandle(
        IPropertySetStorageVtbl.Create_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Create)(IPropertySetStorage*,const IID*,const CLSID*,DWORD,DWORD,IPropertyStorage**);
     * }
     */
    public interface Create {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, int _x4, java.lang.foreign.MemorySegment _x5);
        static MemorySegment allocate(Create fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IPropertySetStorageVtbl.Create_UP$MH, fi, IPropertySetStorageVtbl.Create$FUNC, scope);
        }
        static Create ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, int __x4, java.lang.foreign.MemorySegment __x5) -> {
                try {
                    return (int)IPropertySetStorageVtbl.Create_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Create$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Create"));
    public static VarHandle Create$VH() {
        return IPropertySetStorageVtbl.Create$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Create)(IPropertySetStorage*,const IID*,const CLSID*,DWORD,DWORD,IPropertyStorage**);
     * }
     */
    public static MemorySegment Create$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IPropertySetStorageVtbl.Create$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Create)(IPropertySetStorage*,const IID*,const CLSID*,DWORD,DWORD,IPropertyStorage**);
     * }
     */
    public static void Create$set(MemorySegment seg, MemorySegment x) {
        IPropertySetStorageVtbl.Create$VH.set(seg, x);
    }
    public static MemorySegment Create$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IPropertySetStorageVtbl.Create$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Create$set(MemorySegment seg, long index, MemorySegment x) {
        IPropertySetStorageVtbl.Create$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Create Create(MemorySegment segment, SegmentScope scope) {
        return Create.ofAddress(Create$get(segment), scope);
    }
    static final FunctionDescriptor Open$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor Open_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Open_UP$MH = RuntimeHelper.upcallHandle(Open.class, "apply", IPropertySetStorageVtbl.Open_UP$FUNC);
    static final FunctionDescriptor Open_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Open_DOWN$MH = RuntimeHelper.downcallHandle(
        IPropertySetStorageVtbl.Open_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Open)(IPropertySetStorage*,const IID*,DWORD,IPropertyStorage**);
     * }
     */
    public interface Open {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(Open fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IPropertySetStorageVtbl.Open_UP$MH, fi, IPropertySetStorageVtbl.Open$FUNC, scope);
        }
        static Open ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (int)IPropertySetStorageVtbl.Open_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Open$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Open"));
    public static VarHandle Open$VH() {
        return IPropertySetStorageVtbl.Open$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Open)(IPropertySetStorage*,const IID*,DWORD,IPropertyStorage**);
     * }
     */
    public static MemorySegment Open$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IPropertySetStorageVtbl.Open$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Open)(IPropertySetStorage*,const IID*,DWORD,IPropertyStorage**);
     * }
     */
    public static void Open$set(MemorySegment seg, MemorySegment x) {
        IPropertySetStorageVtbl.Open$VH.set(seg, x);
    }
    public static MemorySegment Open$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IPropertySetStorageVtbl.Open$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Open$set(MemorySegment seg, long index, MemorySegment x) {
        IPropertySetStorageVtbl.Open$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Open Open(MemorySegment segment, SegmentScope scope) {
        return Open.ofAddress(Open$get(segment), scope);
    }
    static final FunctionDescriptor Delete$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor Delete_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Delete_UP$MH = RuntimeHelper.upcallHandle(Delete.class, "apply", IPropertySetStorageVtbl.Delete_UP$FUNC);
    static final FunctionDescriptor Delete_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Delete_DOWN$MH = RuntimeHelper.downcallHandle(
        IPropertySetStorageVtbl.Delete_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Delete)(IPropertySetStorage*,const IID*);
     * }
     */
    public interface Delete {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(Delete fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IPropertySetStorageVtbl.Delete_UP$MH, fi, IPropertySetStorageVtbl.Delete$FUNC, scope);
        }
        static Delete ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IPropertySetStorageVtbl.Delete_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Delete$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Delete"));
    public static VarHandle Delete$VH() {
        return IPropertySetStorageVtbl.Delete$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Delete)(IPropertySetStorage*,const IID*);
     * }
     */
    public static MemorySegment Delete$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IPropertySetStorageVtbl.Delete$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Delete)(IPropertySetStorage*,const IID*);
     * }
     */
    public static void Delete$set(MemorySegment seg, MemorySegment x) {
        IPropertySetStorageVtbl.Delete$VH.set(seg, x);
    }
    public static MemorySegment Delete$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IPropertySetStorageVtbl.Delete$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Delete$set(MemorySegment seg, long index, MemorySegment x) {
        IPropertySetStorageVtbl.Delete$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Delete Delete(MemorySegment segment, SegmentScope scope) {
        return Delete.ofAddress(Delete$get(segment), scope);
    }
    static final FunctionDescriptor Enum$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor Enum_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Enum_UP$MH = RuntimeHelper.upcallHandle(Enum.class, "apply", IPropertySetStorageVtbl.Enum_UP$FUNC);
    static final FunctionDescriptor Enum_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Enum_DOWN$MH = RuntimeHelper.downcallHandle(
        IPropertySetStorageVtbl.Enum_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Enum)(IPropertySetStorage*,IEnumSTATPROPSETSTG**);
     * }
     */
    public interface Enum {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(Enum fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IPropertySetStorageVtbl.Enum_UP$MH, fi, IPropertySetStorageVtbl.Enum$FUNC, scope);
        }
        static Enum ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IPropertySetStorageVtbl.Enum_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Enum$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Enum"));
    public static VarHandle Enum$VH() {
        return IPropertySetStorageVtbl.Enum$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Enum)(IPropertySetStorage*,IEnumSTATPROPSETSTG**);
     * }
     */
    public static MemorySegment Enum$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IPropertySetStorageVtbl.Enum$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Enum)(IPropertySetStorage*,IEnumSTATPROPSETSTG**);
     * }
     */
    public static void Enum$set(MemorySegment seg, MemorySegment x) {
        IPropertySetStorageVtbl.Enum$VH.set(seg, x);
    }
    public static MemorySegment Enum$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IPropertySetStorageVtbl.Enum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Enum$set(MemorySegment seg, long index, MemorySegment x) {
        IPropertySetStorageVtbl.Enum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Enum Enum(MemorySegment segment, SegmentScope scope) {
        return Enum.ofAddress(Enum$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

