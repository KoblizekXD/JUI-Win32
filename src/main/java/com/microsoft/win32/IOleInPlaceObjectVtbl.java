// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IOleInPlaceObjectVtbl {
 *     HRESULT (*QueryInterface)(IOleInPlaceObject*,const IID*,void**);
 *     ULONG (*AddRef)(IOleInPlaceObject*);
 *     ULONG (*Release)(IOleInPlaceObject*);
 *     HRESULT (*GetWindow)(IOleInPlaceObject*,HWND*);
 *     HRESULT (*ContextSensitiveHelp)(IOleInPlaceObject*,BOOL);
 *     HRESULT (*InPlaceDeactivate)(IOleInPlaceObject*);
 *     HRESULT (*UIDeactivate)(IOleInPlaceObject*);
 *     HRESULT (*SetObjectRects)(IOleInPlaceObject*,LPCRECT,LPCRECT);
 *     HRESULT (*ReactivateAndUndo)(IOleInPlaceObject*);
 * };
 * }
 */
public class IOleInPlaceObjectVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("GetWindow"),
        Constants$root.C_POINTER$LAYOUT.withName("ContextSensitiveHelp"),
        Constants$root.C_POINTER$LAYOUT.withName("InPlaceDeactivate"),
        Constants$root.C_POINTER$LAYOUT.withName("UIDeactivate"),
        Constants$root.C_POINTER$LAYOUT.withName("SetObjectRects"),
        Constants$root.C_POINTER$LAYOUT.withName("ReactivateAndUndo")
    ).withName("IOleInPlaceObjectVtbl");
    public static MemoryLayout $LAYOUT() {
        return IOleInPlaceObjectVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IOleInPlaceObjectVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceObjectVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IOleInPlaceObject*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IOleInPlaceObjectVtbl.QueryInterface_UP$MH, fi, IOleInPlaceObjectVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IOleInPlaceObjectVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IOleInPlaceObjectVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IOleInPlaceObject*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IOleInPlaceObjectVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IOleInPlaceObject*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IOleInPlaceObjectVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IOleInPlaceObjectVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IOleInPlaceObjectVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IOleInPlaceObjectVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceObjectVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IOleInPlaceObject*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IOleInPlaceObjectVtbl.AddRef_UP$MH, fi, IOleInPlaceObjectVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IOleInPlaceObjectVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IOleInPlaceObjectVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IOleInPlaceObject*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IOleInPlaceObjectVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IOleInPlaceObject*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IOleInPlaceObjectVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IOleInPlaceObjectVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IOleInPlaceObjectVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IOleInPlaceObjectVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceObjectVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IOleInPlaceObject*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IOleInPlaceObjectVtbl.Release_UP$MH, fi, IOleInPlaceObjectVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IOleInPlaceObjectVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IOleInPlaceObjectVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IOleInPlaceObject*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IOleInPlaceObjectVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IOleInPlaceObject*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IOleInPlaceObjectVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IOleInPlaceObjectVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IOleInPlaceObjectVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor GetWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GetWindow_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindow_UP$MH = RuntimeHelper.upcallHandle(GetWindow.class, "apply", IOleInPlaceObjectVtbl.GetWindow_UP$FUNC);
    static final FunctionDescriptor GetWindow_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindow_DOWN$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceObjectVtbl.GetWindow_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*GetWindow)(IOleInPlaceObject*,HWND*);
     * }
     */
    public interface GetWindow {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetWindow fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IOleInPlaceObjectVtbl.GetWindow_UP$MH, fi, IOleInPlaceObjectVtbl.GetWindow$FUNC, scope);
        }
        static GetWindow ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IOleInPlaceObjectVtbl.GetWindow_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetWindow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetWindow"));
    public static VarHandle GetWindow$VH() {
        return IOleInPlaceObjectVtbl.GetWindow$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetWindow)(IOleInPlaceObject*,HWND*);
     * }
     */
    public static MemorySegment GetWindow$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IOleInPlaceObjectVtbl.GetWindow$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetWindow)(IOleInPlaceObject*,HWND*);
     * }
     */
    public static void GetWindow$set(MemorySegment seg, MemorySegment x) {
        IOleInPlaceObjectVtbl.GetWindow$VH.set(seg, x);
    }
    public static MemorySegment GetWindow$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IOleInPlaceObjectVtbl.GetWindow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetWindow$set(MemorySegment seg, long index, MemorySegment x) {
        IOleInPlaceObjectVtbl.GetWindow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetWindow GetWindow(MemorySegment segment, SegmentScope scope) {
        return GetWindow.ofAddress(GetWindow$get(segment), scope);
    }
    static final FunctionDescriptor ContextSensitiveHelp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor ContextSensitiveHelp_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ContextSensitiveHelp_UP$MH = RuntimeHelper.upcallHandle(ContextSensitiveHelp.class, "apply", IOleInPlaceObjectVtbl.ContextSensitiveHelp_UP$FUNC);
    static final FunctionDescriptor ContextSensitiveHelp_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ContextSensitiveHelp_DOWN$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceObjectVtbl.ContextSensitiveHelp_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*ContextSensitiveHelp)(IOleInPlaceObject*,BOOL);
     * }
     */
    public interface ContextSensitiveHelp {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(ContextSensitiveHelp fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IOleInPlaceObjectVtbl.ContextSensitiveHelp_UP$MH, fi, IOleInPlaceObjectVtbl.ContextSensitiveHelp$FUNC, scope);
        }
        static ContextSensitiveHelp ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)IOleInPlaceObjectVtbl.ContextSensitiveHelp_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ContextSensitiveHelp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ContextSensitiveHelp"));
    public static VarHandle ContextSensitiveHelp$VH() {
        return IOleInPlaceObjectVtbl.ContextSensitiveHelp$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*ContextSensitiveHelp)(IOleInPlaceObject*,BOOL);
     * }
     */
    public static MemorySegment ContextSensitiveHelp$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IOleInPlaceObjectVtbl.ContextSensitiveHelp$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*ContextSensitiveHelp)(IOleInPlaceObject*,BOOL);
     * }
     */
    public static void ContextSensitiveHelp$set(MemorySegment seg, MemorySegment x) {
        IOleInPlaceObjectVtbl.ContextSensitiveHelp$VH.set(seg, x);
    }
    public static MemorySegment ContextSensitiveHelp$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IOleInPlaceObjectVtbl.ContextSensitiveHelp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ContextSensitiveHelp$set(MemorySegment seg, long index, MemorySegment x) {
        IOleInPlaceObjectVtbl.ContextSensitiveHelp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ContextSensitiveHelp ContextSensitiveHelp(MemorySegment segment, SegmentScope scope) {
        return ContextSensitiveHelp.ofAddress(ContextSensitiveHelp$get(segment), scope);
    }
    static final FunctionDescriptor InPlaceDeactivate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor InPlaceDeactivate_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InPlaceDeactivate_UP$MH = RuntimeHelper.upcallHandle(InPlaceDeactivate.class, "apply", IOleInPlaceObjectVtbl.InPlaceDeactivate_UP$FUNC);
    static final FunctionDescriptor InPlaceDeactivate_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InPlaceDeactivate_DOWN$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceObjectVtbl.InPlaceDeactivate_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*InPlaceDeactivate)(IOleInPlaceObject*);
     * }
     */
    public interface InPlaceDeactivate {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(InPlaceDeactivate fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IOleInPlaceObjectVtbl.InPlaceDeactivate_UP$MH, fi, IOleInPlaceObjectVtbl.InPlaceDeactivate$FUNC, scope);
        }
        static InPlaceDeactivate ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IOleInPlaceObjectVtbl.InPlaceDeactivate_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle InPlaceDeactivate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("InPlaceDeactivate"));
    public static VarHandle InPlaceDeactivate$VH() {
        return IOleInPlaceObjectVtbl.InPlaceDeactivate$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*InPlaceDeactivate)(IOleInPlaceObject*);
     * }
     */
    public static MemorySegment InPlaceDeactivate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IOleInPlaceObjectVtbl.InPlaceDeactivate$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*InPlaceDeactivate)(IOleInPlaceObject*);
     * }
     */
    public static void InPlaceDeactivate$set(MemorySegment seg, MemorySegment x) {
        IOleInPlaceObjectVtbl.InPlaceDeactivate$VH.set(seg, x);
    }
    public static MemorySegment InPlaceDeactivate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IOleInPlaceObjectVtbl.InPlaceDeactivate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void InPlaceDeactivate$set(MemorySegment seg, long index, MemorySegment x) {
        IOleInPlaceObjectVtbl.InPlaceDeactivate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static InPlaceDeactivate InPlaceDeactivate(MemorySegment segment, SegmentScope scope) {
        return InPlaceDeactivate.ofAddress(InPlaceDeactivate$get(segment), scope);
    }
    static final FunctionDescriptor UIDeactivate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor UIDeactivate_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UIDeactivate_UP$MH = RuntimeHelper.upcallHandle(UIDeactivate.class, "apply", IOleInPlaceObjectVtbl.UIDeactivate_UP$FUNC);
    static final FunctionDescriptor UIDeactivate_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UIDeactivate_DOWN$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceObjectVtbl.UIDeactivate_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*UIDeactivate)(IOleInPlaceObject*);
     * }
     */
    public interface UIDeactivate {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(UIDeactivate fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IOleInPlaceObjectVtbl.UIDeactivate_UP$MH, fi, IOleInPlaceObjectVtbl.UIDeactivate$FUNC, scope);
        }
        static UIDeactivate ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IOleInPlaceObjectVtbl.UIDeactivate_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle UIDeactivate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UIDeactivate"));
    public static VarHandle UIDeactivate$VH() {
        return IOleInPlaceObjectVtbl.UIDeactivate$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*UIDeactivate)(IOleInPlaceObject*);
     * }
     */
    public static MemorySegment UIDeactivate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IOleInPlaceObjectVtbl.UIDeactivate$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*UIDeactivate)(IOleInPlaceObject*);
     * }
     */
    public static void UIDeactivate$set(MemorySegment seg, MemorySegment x) {
        IOleInPlaceObjectVtbl.UIDeactivate$VH.set(seg, x);
    }
    public static MemorySegment UIDeactivate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IOleInPlaceObjectVtbl.UIDeactivate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UIDeactivate$set(MemorySegment seg, long index, MemorySegment x) {
        IOleInPlaceObjectVtbl.UIDeactivate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static UIDeactivate UIDeactivate(MemorySegment segment, SegmentScope scope) {
        return UIDeactivate.ofAddress(UIDeactivate$get(segment), scope);
    }
    static final FunctionDescriptor SetObjectRects$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor SetObjectRects_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetObjectRects_UP$MH = RuntimeHelper.upcallHandle(SetObjectRects.class, "apply", IOleInPlaceObjectVtbl.SetObjectRects_UP$FUNC);
    static final FunctionDescriptor SetObjectRects_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetObjectRects_DOWN$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceObjectVtbl.SetObjectRects_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*SetObjectRects)(IOleInPlaceObject*,LPCRECT,LPCRECT);
     * }
     */
    public interface SetObjectRects {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(SetObjectRects fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IOleInPlaceObjectVtbl.SetObjectRects_UP$MH, fi, IOleInPlaceObjectVtbl.SetObjectRects$FUNC, scope);
        }
        static SetObjectRects ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IOleInPlaceObjectVtbl.SetObjectRects_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetObjectRects$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetObjectRects"));
    public static VarHandle SetObjectRects$VH() {
        return IOleInPlaceObjectVtbl.SetObjectRects$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SetObjectRects)(IOleInPlaceObject*,LPCRECT,LPCRECT);
     * }
     */
    public static MemorySegment SetObjectRects$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IOleInPlaceObjectVtbl.SetObjectRects$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SetObjectRects)(IOleInPlaceObject*,LPCRECT,LPCRECT);
     * }
     */
    public static void SetObjectRects$set(MemorySegment seg, MemorySegment x) {
        IOleInPlaceObjectVtbl.SetObjectRects$VH.set(seg, x);
    }
    public static MemorySegment SetObjectRects$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IOleInPlaceObjectVtbl.SetObjectRects$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetObjectRects$set(MemorySegment seg, long index, MemorySegment x) {
        IOleInPlaceObjectVtbl.SetObjectRects$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetObjectRects SetObjectRects(MemorySegment segment, SegmentScope scope) {
        return SetObjectRects.ofAddress(SetObjectRects$get(segment), scope);
    }
    static final FunctionDescriptor ReactivateAndUndo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor ReactivateAndUndo_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReactivateAndUndo_UP$MH = RuntimeHelper.upcallHandle(ReactivateAndUndo.class, "apply", IOleInPlaceObjectVtbl.ReactivateAndUndo_UP$FUNC);
    static final FunctionDescriptor ReactivateAndUndo_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReactivateAndUndo_DOWN$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceObjectVtbl.ReactivateAndUndo_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*ReactivateAndUndo)(IOleInPlaceObject*);
     * }
     */
    public interface ReactivateAndUndo {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(ReactivateAndUndo fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IOleInPlaceObjectVtbl.ReactivateAndUndo_UP$MH, fi, IOleInPlaceObjectVtbl.ReactivateAndUndo$FUNC, scope);
        }
        static ReactivateAndUndo ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IOleInPlaceObjectVtbl.ReactivateAndUndo_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ReactivateAndUndo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReactivateAndUndo"));
    public static VarHandle ReactivateAndUndo$VH() {
        return IOleInPlaceObjectVtbl.ReactivateAndUndo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*ReactivateAndUndo)(IOleInPlaceObject*);
     * }
     */
    public static MemorySegment ReactivateAndUndo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IOleInPlaceObjectVtbl.ReactivateAndUndo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*ReactivateAndUndo)(IOleInPlaceObject*);
     * }
     */
    public static void ReactivateAndUndo$set(MemorySegment seg, MemorySegment x) {
        IOleInPlaceObjectVtbl.ReactivateAndUndo$VH.set(seg, x);
    }
    public static MemorySegment ReactivateAndUndo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IOleInPlaceObjectVtbl.ReactivateAndUndo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReactivateAndUndo$set(MemorySegment seg, long index, MemorySegment x) {
        IOleInPlaceObjectVtbl.ReactivateAndUndo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ReactivateAndUndo ReactivateAndUndo(MemorySegment segment, SegmentScope scope) {
        return ReactivateAndUndo.ofAddress(ReactivateAndUndo$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


