// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IOleItemContainerVtbl {
 *     HRESULT (*QueryInterface)(IOleItemContainer*,const IID*,void**);
 *     ULONG (*AddRef)(IOleItemContainer*);
 *     ULONG (*Release)(IOleItemContainer*);
 *     HRESULT (*ParseDisplayName)(IOleItemContainer*,IBindCtx*,LPOLESTR,ULONG*,IMoniker**);
 *     HRESULT (*EnumObjects)(IOleItemContainer*,DWORD,IEnumUnknown**);
 *     HRESULT (*LockContainer)(IOleItemContainer*,BOOL);
 *     HRESULT (*GetObjectA)(IOleItemContainer*,LPOLESTR,DWORD,IBindCtx*,const IID*,void**);
 *     HRESULT (*GetObjectStorage)(IOleItemContainer*,LPOLESTR,IBindCtx*,const IID*,void**);
 *     HRESULT (*IsRunning)(IOleItemContainer*,LPOLESTR);
 * };
 * }
 */
public class IOleItemContainerVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("ParseDisplayName"),
        Constants$root.C_POINTER$LAYOUT.withName("EnumObjects"),
        Constants$root.C_POINTER$LAYOUT.withName("LockContainer"),
        Constants$root.C_POINTER$LAYOUT.withName("GetObjectA"),
        Constants$root.C_POINTER$LAYOUT.withName("GetObjectStorage"),
        Constants$root.C_POINTER$LAYOUT.withName("IsRunning")
    ).withName("IOleItemContainerVtbl");
    public static MemoryLayout $LAYOUT() {
        return IOleItemContainerVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IOleItemContainerVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IOleItemContainerVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IOleItemContainer*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IOleItemContainerVtbl.QueryInterface_UP$MH, fi, IOleItemContainerVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IOleItemContainerVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IOleItemContainerVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IOleItemContainer*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IOleItemContainerVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IOleItemContainer*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IOleItemContainerVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IOleItemContainerVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IOleItemContainerVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IOleItemContainerVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IOleItemContainerVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IOleItemContainer*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IOleItemContainerVtbl.AddRef_UP$MH, fi, IOleItemContainerVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IOleItemContainerVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IOleItemContainerVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IOleItemContainer*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IOleItemContainerVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IOleItemContainer*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IOleItemContainerVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IOleItemContainerVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IOleItemContainerVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IOleItemContainerVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IOleItemContainerVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IOleItemContainer*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IOleItemContainerVtbl.Release_UP$MH, fi, IOleItemContainerVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IOleItemContainerVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IOleItemContainerVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IOleItemContainer*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IOleItemContainerVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IOleItemContainer*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IOleItemContainerVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IOleItemContainerVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IOleItemContainerVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor ParseDisplayName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor ParseDisplayName_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ParseDisplayName_UP$MH = RuntimeHelper.upcallHandle(ParseDisplayName.class, "apply", IOleItemContainerVtbl.ParseDisplayName_UP$FUNC);
    static final FunctionDescriptor ParseDisplayName_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ParseDisplayName_DOWN$MH = RuntimeHelper.downcallHandle(
        IOleItemContainerVtbl.ParseDisplayName_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*ParseDisplayName)(IOleItemContainer*,IBindCtx*,LPOLESTR,ULONG*,IMoniker**);
     * }
     */
    public interface ParseDisplayName {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(ParseDisplayName fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IOleItemContainerVtbl.ParseDisplayName_UP$MH, fi, IOleItemContainerVtbl.ParseDisplayName$FUNC, scope);
        }
        static ParseDisplayName ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (int)IOleItemContainerVtbl.ParseDisplayName_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ParseDisplayName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ParseDisplayName"));
    public static VarHandle ParseDisplayName$VH() {
        return IOleItemContainerVtbl.ParseDisplayName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*ParseDisplayName)(IOleItemContainer*,IBindCtx*,LPOLESTR,ULONG*,IMoniker**);
     * }
     */
    public static MemorySegment ParseDisplayName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IOleItemContainerVtbl.ParseDisplayName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*ParseDisplayName)(IOleItemContainer*,IBindCtx*,LPOLESTR,ULONG*,IMoniker**);
     * }
     */
    public static void ParseDisplayName$set(MemorySegment seg, MemorySegment x) {
        IOleItemContainerVtbl.ParseDisplayName$VH.set(seg, x);
    }
    public static MemorySegment ParseDisplayName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IOleItemContainerVtbl.ParseDisplayName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ParseDisplayName$set(MemorySegment seg, long index, MemorySegment x) {
        IOleItemContainerVtbl.ParseDisplayName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ParseDisplayName ParseDisplayName(MemorySegment segment, SegmentScope scope) {
        return ParseDisplayName.ofAddress(ParseDisplayName$get(segment), scope);
    }
    static final FunctionDescriptor EnumObjects$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor EnumObjects_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumObjects_UP$MH = RuntimeHelper.upcallHandle(EnumObjects.class, "apply", IOleItemContainerVtbl.EnumObjects_UP$FUNC);
    static final FunctionDescriptor EnumObjects_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumObjects_DOWN$MH = RuntimeHelper.downcallHandle(
        IOleItemContainerVtbl.EnumObjects_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*EnumObjects)(IOleItemContainer*,DWORD,IEnumUnknown**);
     * }
     */
    public interface EnumObjects {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(EnumObjects fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IOleItemContainerVtbl.EnumObjects_UP$MH, fi, IOleItemContainerVtbl.EnumObjects$FUNC, scope);
        }
        static EnumObjects ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IOleItemContainerVtbl.EnumObjects_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle EnumObjects$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EnumObjects"));
    public static VarHandle EnumObjects$VH() {
        return IOleItemContainerVtbl.EnumObjects$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*EnumObjects)(IOleItemContainer*,DWORD,IEnumUnknown**);
     * }
     */
    public static MemorySegment EnumObjects$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IOleItemContainerVtbl.EnumObjects$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*EnumObjects)(IOleItemContainer*,DWORD,IEnumUnknown**);
     * }
     */
    public static void EnumObjects$set(MemorySegment seg, MemorySegment x) {
        IOleItemContainerVtbl.EnumObjects$VH.set(seg, x);
    }
    public static MemorySegment EnumObjects$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IOleItemContainerVtbl.EnumObjects$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnumObjects$set(MemorySegment seg, long index, MemorySegment x) {
        IOleItemContainerVtbl.EnumObjects$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static EnumObjects EnumObjects(MemorySegment segment, SegmentScope scope) {
        return EnumObjects.ofAddress(EnumObjects$get(segment), scope);
    }
    static final FunctionDescriptor LockContainer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor LockContainer_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LockContainer_UP$MH = RuntimeHelper.upcallHandle(LockContainer.class, "apply", IOleItemContainerVtbl.LockContainer_UP$FUNC);
    static final FunctionDescriptor LockContainer_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LockContainer_DOWN$MH = RuntimeHelper.downcallHandle(
        IOleItemContainerVtbl.LockContainer_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*LockContainer)(IOleItemContainer*,BOOL);
     * }
     */
    public interface LockContainer {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(LockContainer fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IOleItemContainerVtbl.LockContainer_UP$MH, fi, IOleItemContainerVtbl.LockContainer$FUNC, scope);
        }
        static LockContainer ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)IOleItemContainerVtbl.LockContainer_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle LockContainer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LockContainer"));
    public static VarHandle LockContainer$VH() {
        return IOleItemContainerVtbl.LockContainer$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*LockContainer)(IOleItemContainer*,BOOL);
     * }
     */
    public static MemorySegment LockContainer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IOleItemContainerVtbl.LockContainer$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*LockContainer)(IOleItemContainer*,BOOL);
     * }
     */
    public static void LockContainer$set(MemorySegment seg, MemorySegment x) {
        IOleItemContainerVtbl.LockContainer$VH.set(seg, x);
    }
    public static MemorySegment LockContainer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IOleItemContainerVtbl.LockContainer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LockContainer$set(MemorySegment seg, long index, MemorySegment x) {
        IOleItemContainerVtbl.LockContainer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LockContainer LockContainer(MemorySegment segment, SegmentScope scope) {
        return LockContainer.ofAddress(LockContainer$get(segment), scope);
    }
    static final FunctionDescriptor GetObjectA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GetObjectA_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetObjectA_UP$MH = RuntimeHelper.upcallHandle(GetObjectA.class, "apply", IOleItemContainerVtbl.GetObjectA_UP$FUNC);
    static final FunctionDescriptor GetObjectA_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetObjectA_DOWN$MH = RuntimeHelper.downcallHandle(
        IOleItemContainerVtbl.GetObjectA_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*GetObjectA)(IOleItemContainer*,LPOLESTR,DWORD,IBindCtx*,const IID*,void**);
     * }
     */
    public interface GetObjectA {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5);
        static MemorySegment allocate(GetObjectA fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IOleItemContainerVtbl.GetObjectA_UP$MH, fi, IOleItemContainerVtbl.GetObjectA$FUNC, scope);
        }
        static GetObjectA ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5) -> {
                try {
                    return (int)IOleItemContainerVtbl.GetObjectA_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetObjectA$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetObjectA"));
    public static VarHandle GetObjectA$VH() {
        return IOleItemContainerVtbl.GetObjectA$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetObjectA)(IOleItemContainer*,LPOLESTR,DWORD,IBindCtx*,const IID*,void**);
     * }
     */
    public static MemorySegment GetObjectA$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IOleItemContainerVtbl.GetObjectA$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetObjectA)(IOleItemContainer*,LPOLESTR,DWORD,IBindCtx*,const IID*,void**);
     * }
     */
    public static void GetObjectA$set(MemorySegment seg, MemorySegment x) {
        IOleItemContainerVtbl.GetObjectA$VH.set(seg, x);
    }
    public static MemorySegment GetObjectA$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IOleItemContainerVtbl.GetObjectA$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetObjectA$set(MemorySegment seg, long index, MemorySegment x) {
        IOleItemContainerVtbl.GetObjectA$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetObjectA GetObjectA(MemorySegment segment, SegmentScope scope) {
        return GetObjectA.ofAddress(GetObjectA$get(segment), scope);
    }
    static final FunctionDescriptor GetObjectStorage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GetObjectStorage_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetObjectStorage_UP$MH = RuntimeHelper.upcallHandle(GetObjectStorage.class, "apply", IOleItemContainerVtbl.GetObjectStorage_UP$FUNC);
    static final FunctionDescriptor GetObjectStorage_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetObjectStorage_DOWN$MH = RuntimeHelper.downcallHandle(
        IOleItemContainerVtbl.GetObjectStorage_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*GetObjectStorage)(IOleItemContainer*,LPOLESTR,IBindCtx*,const IID*,void**);
     * }
     */
    public interface GetObjectStorage {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(GetObjectStorage fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IOleItemContainerVtbl.GetObjectStorage_UP$MH, fi, IOleItemContainerVtbl.GetObjectStorage$FUNC, scope);
        }
        static GetObjectStorage ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (int)IOleItemContainerVtbl.GetObjectStorage_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetObjectStorage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetObjectStorage"));
    public static VarHandle GetObjectStorage$VH() {
        return IOleItemContainerVtbl.GetObjectStorage$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetObjectStorage)(IOleItemContainer*,LPOLESTR,IBindCtx*,const IID*,void**);
     * }
     */
    public static MemorySegment GetObjectStorage$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IOleItemContainerVtbl.GetObjectStorage$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetObjectStorage)(IOleItemContainer*,LPOLESTR,IBindCtx*,const IID*,void**);
     * }
     */
    public static void GetObjectStorage$set(MemorySegment seg, MemorySegment x) {
        IOleItemContainerVtbl.GetObjectStorage$VH.set(seg, x);
    }
    public static MemorySegment GetObjectStorage$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IOleItemContainerVtbl.GetObjectStorage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetObjectStorage$set(MemorySegment seg, long index, MemorySegment x) {
        IOleItemContainerVtbl.GetObjectStorage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetObjectStorage GetObjectStorage(MemorySegment segment, SegmentScope scope) {
        return GetObjectStorage.ofAddress(GetObjectStorage$get(segment), scope);
    }
    static final FunctionDescriptor IsRunning$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor IsRunning_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsRunning_UP$MH = RuntimeHelper.upcallHandle(IsRunning.class, "apply", IOleItemContainerVtbl.IsRunning_UP$FUNC);
    static final FunctionDescriptor IsRunning_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsRunning_DOWN$MH = RuntimeHelper.downcallHandle(
        IOleItemContainerVtbl.IsRunning_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*IsRunning)(IOleItemContainer*,LPOLESTR);
     * }
     */
    public interface IsRunning {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(IsRunning fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IOleItemContainerVtbl.IsRunning_UP$MH, fi, IOleItemContainerVtbl.IsRunning$FUNC, scope);
        }
        static IsRunning ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IOleItemContainerVtbl.IsRunning_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle IsRunning$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsRunning"));
    public static VarHandle IsRunning$VH() {
        return IOleItemContainerVtbl.IsRunning$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*IsRunning)(IOleItemContainer*,LPOLESTR);
     * }
     */
    public static MemorySegment IsRunning$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IOleItemContainerVtbl.IsRunning$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*IsRunning)(IOleItemContainer*,LPOLESTR);
     * }
     */
    public static void IsRunning$set(MemorySegment seg, MemorySegment x) {
        IOleItemContainerVtbl.IsRunning$VH.set(seg, x);
    }
    public static MemorySegment IsRunning$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IOleItemContainerVtbl.IsRunning$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsRunning$set(MemorySegment seg, long index, MemorySegment x) {
        IOleItemContainerVtbl.IsRunning$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static IsRunning IsRunning(MemorySegment segment, SegmentScope scope) {
        return IsRunning.ofAddress(IsRunning$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


