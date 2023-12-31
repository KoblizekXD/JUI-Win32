// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IInternetSecurityMgrSiteVtbl {
 *     HRESULT (*QueryInterface)(IInternetSecurityMgrSite*,const IID*,void**);
 *     ULONG (*AddRef)(IInternetSecurityMgrSite*);
 *     ULONG (*Release)(IInternetSecurityMgrSite*);
 *     HRESULT (*GetWindow)(IInternetSecurityMgrSite*,HWND*);
 *     HRESULT (*EnableModeless)(IInternetSecurityMgrSite*,BOOL);
 * };
 * }
 */
public class IInternetSecurityMgrSiteVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("GetWindow"),
        Constants$root.C_POINTER$LAYOUT.withName("EnableModeless")
    ).withName("IInternetSecurityMgrSiteVtbl");
    public static MemoryLayout $LAYOUT() {
        return IInternetSecurityMgrSiteVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IInternetSecurityMgrSiteVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetSecurityMgrSiteVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IInternetSecurityMgrSite*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetSecurityMgrSiteVtbl.QueryInterface_UP$MH, fi, IInternetSecurityMgrSiteVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IInternetSecurityMgrSiteVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IInternetSecurityMgrSiteVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IInternetSecurityMgrSite*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetSecurityMgrSiteVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IInternetSecurityMgrSite*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IInternetSecurityMgrSiteVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetSecurityMgrSiteVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetSecurityMgrSiteVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IInternetSecurityMgrSiteVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetSecurityMgrSiteVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IInternetSecurityMgrSite*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetSecurityMgrSiteVtbl.AddRef_UP$MH, fi, IInternetSecurityMgrSiteVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IInternetSecurityMgrSiteVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IInternetSecurityMgrSiteVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IInternetSecurityMgrSite*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetSecurityMgrSiteVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IInternetSecurityMgrSite*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IInternetSecurityMgrSiteVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetSecurityMgrSiteVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetSecurityMgrSiteVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IInternetSecurityMgrSiteVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetSecurityMgrSiteVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IInternetSecurityMgrSite*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetSecurityMgrSiteVtbl.Release_UP$MH, fi, IInternetSecurityMgrSiteVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IInternetSecurityMgrSiteVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IInternetSecurityMgrSiteVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IInternetSecurityMgrSite*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetSecurityMgrSiteVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IInternetSecurityMgrSite*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IInternetSecurityMgrSiteVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetSecurityMgrSiteVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetSecurityMgrSiteVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle GetWindow_UP$MH = RuntimeHelper.upcallHandle(GetWindow.class, "apply", IInternetSecurityMgrSiteVtbl.GetWindow_UP$FUNC);
    static final FunctionDescriptor GetWindow_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindow_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetSecurityMgrSiteVtbl.GetWindow_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*GetWindow)(IInternetSecurityMgrSite*,HWND*);
     * }
     */
    public interface GetWindow {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetWindow fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetSecurityMgrSiteVtbl.GetWindow_UP$MH, fi, IInternetSecurityMgrSiteVtbl.GetWindow$FUNC, scope);
        }
        static GetWindow ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IInternetSecurityMgrSiteVtbl.GetWindow_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetWindow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetWindow"));
    public static VarHandle GetWindow$VH() {
        return IInternetSecurityMgrSiteVtbl.GetWindow$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetWindow)(IInternetSecurityMgrSite*,HWND*);
     * }
     */
    public static MemorySegment GetWindow$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetSecurityMgrSiteVtbl.GetWindow$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetWindow)(IInternetSecurityMgrSite*,HWND*);
     * }
     */
    public static void GetWindow$set(MemorySegment seg, MemorySegment x) {
        IInternetSecurityMgrSiteVtbl.GetWindow$VH.set(seg, x);
    }
    public static MemorySegment GetWindow$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetSecurityMgrSiteVtbl.GetWindow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetWindow$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetSecurityMgrSiteVtbl.GetWindow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetWindow GetWindow(MemorySegment segment, SegmentScope scope) {
        return GetWindow.ofAddress(GetWindow$get(segment), scope);
    }
    static final FunctionDescriptor EnableModeless$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor EnableModeless_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EnableModeless_UP$MH = RuntimeHelper.upcallHandle(EnableModeless.class, "apply", IInternetSecurityMgrSiteVtbl.EnableModeless_UP$FUNC);
    static final FunctionDescriptor EnableModeless_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EnableModeless_DOWN$MH = RuntimeHelper.downcallHandle(
        IInternetSecurityMgrSiteVtbl.EnableModeless_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*EnableModeless)(IInternetSecurityMgrSite*,BOOL);
     * }
     */
    public interface EnableModeless {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(EnableModeless fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IInternetSecurityMgrSiteVtbl.EnableModeless_UP$MH, fi, IInternetSecurityMgrSiteVtbl.EnableModeless$FUNC, scope);
        }
        static EnableModeless ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)IInternetSecurityMgrSiteVtbl.EnableModeless_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle EnableModeless$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EnableModeless"));
    public static VarHandle EnableModeless$VH() {
        return IInternetSecurityMgrSiteVtbl.EnableModeless$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*EnableModeless)(IInternetSecurityMgrSite*,BOOL);
     * }
     */
    public static MemorySegment EnableModeless$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IInternetSecurityMgrSiteVtbl.EnableModeless$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*EnableModeless)(IInternetSecurityMgrSite*,BOOL);
     * }
     */
    public static void EnableModeless$set(MemorySegment seg, MemorySegment x) {
        IInternetSecurityMgrSiteVtbl.EnableModeless$VH.set(seg, x);
    }
    public static MemorySegment EnableModeless$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IInternetSecurityMgrSiteVtbl.EnableModeless$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnableModeless$set(MemorySegment seg, long index, MemorySegment x) {
        IInternetSecurityMgrSiteVtbl.EnableModeless$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static EnableModeless EnableModeless(MemorySegment segment, SegmentScope scope) {
        return EnableModeless.ofAddress(EnableModeless$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


