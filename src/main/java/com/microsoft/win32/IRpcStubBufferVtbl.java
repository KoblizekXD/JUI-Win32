// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IRpcStubBufferVtbl {
 *     HRESULT (*QueryInterface)(IRpcStubBuffer*,const IID*,void**);
 *     ULONG (*AddRef)(IRpcStubBuffer*);
 *     ULONG (*Release)(IRpcStubBuffer*);
 *     HRESULT (*Connect)(IRpcStubBuffer*,IUnknown*);
 *     void (*Disconnect)(IRpcStubBuffer*);
 *     HRESULT (*Invoke)(IRpcStubBuffer*,RPCOLEMESSAGE*,IRpcChannelBuffer*);
 *     IRpcStubBuffer* (*IsIIDSupported)(IRpcStubBuffer*,const IID*);
 *     ULONG (*CountRefs)(IRpcStubBuffer*);
 *     HRESULT (*DebugServerQueryInterface)(IRpcStubBuffer*,void**);
 *     void (*DebugServerRelease)(IRpcStubBuffer*,void*);
 * };
 * }
 */
public class IRpcStubBufferVtbl {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("Connect"),
        Constants$root.C_POINTER$LAYOUT.withName("Disconnect"),
        Constants$root.C_POINTER$LAYOUT.withName("Invoke"),
        Constants$root.C_POINTER$LAYOUT.withName("IsIIDSupported"),
        Constants$root.C_POINTER$LAYOUT.withName("CountRefs"),
        Constants$root.C_POINTER$LAYOUT.withName("DebugServerQueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("DebugServerRelease")
    ).withName("IRpcStubBufferVtbl");
    public static MemoryLayout $LAYOUT() {
        return IRpcStubBufferVtbl.$struct$LAYOUT;
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
    static final MethodHandle QueryInterface_UP$MH = RuntimeHelper.upcallHandle(QueryInterface.class, "apply", IRpcStubBufferVtbl.QueryInterface_UP$FUNC);
    static final FunctionDescriptor QueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IRpcStubBufferVtbl.QueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IRpcStubBuffer*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IRpcStubBufferVtbl.QueryInterface_UP$MH, fi, IRpcStubBufferVtbl.QueryInterface$FUNC, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IRpcStubBufferVtbl.QueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IRpcStubBufferVtbl.QueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IRpcStubBuffer*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.QueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IRpcStubBuffer*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        IRpcStubBufferVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IRpcStubBufferVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle AddRef_UP$MH = RuntimeHelper.upcallHandle(AddRef.class, "apply", IRpcStubBufferVtbl.AddRef_UP$FUNC);
    static final FunctionDescriptor AddRef_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef_DOWN$MH = RuntimeHelper.downcallHandle(
        IRpcStubBufferVtbl.AddRef_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*AddRef)(IRpcStubBuffer*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IRpcStubBufferVtbl.AddRef_UP$MH, fi, IRpcStubBufferVtbl.AddRef$FUNC, scope);
        }
        static AddRef ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IRpcStubBufferVtbl.AddRef_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IRpcStubBufferVtbl.AddRef$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IRpcStubBuffer*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.AddRef$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IRpcStubBuffer*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        IRpcStubBufferVtbl.AddRef$VH.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        IRpcStubBufferVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
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
    static final MethodHandle Release_UP$MH = RuntimeHelper.upcallHandle(Release.class, "apply", IRpcStubBufferVtbl.Release_UP$FUNC);
    static final FunctionDescriptor Release_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release_DOWN$MH = RuntimeHelper.downcallHandle(
        IRpcStubBufferVtbl.Release_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*Release)(IRpcStubBuffer*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IRpcStubBufferVtbl.Release_UP$MH, fi, IRpcStubBufferVtbl.Release$FUNC, scope);
        }
        static Release ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IRpcStubBufferVtbl.Release_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IRpcStubBufferVtbl.Release$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IRpcStubBuffer*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.Release$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IRpcStubBuffer*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        IRpcStubBufferVtbl.Release$VH.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        IRpcStubBufferVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, SegmentScope scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    static final FunctionDescriptor Connect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor Connect_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Connect_UP$MH = RuntimeHelper.upcallHandle(Connect.class, "apply", IRpcStubBufferVtbl.Connect_UP$FUNC);
    static final FunctionDescriptor Connect_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Connect_DOWN$MH = RuntimeHelper.downcallHandle(
        IRpcStubBufferVtbl.Connect_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Connect)(IRpcStubBuffer*,IUnknown*);
     * }
     */
    public interface Connect {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(Connect fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IRpcStubBufferVtbl.Connect_UP$MH, fi, IRpcStubBufferVtbl.Connect$FUNC, scope);
        }
        static Connect ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IRpcStubBufferVtbl.Connect_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Connect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Connect"));
    public static VarHandle Connect$VH() {
        return IRpcStubBufferVtbl.Connect$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Connect)(IRpcStubBuffer*,IUnknown*);
     * }
     */
    public static MemorySegment Connect$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.Connect$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Connect)(IRpcStubBuffer*,IUnknown*);
     * }
     */
    public static void Connect$set(MemorySegment seg, MemorySegment x) {
        IRpcStubBufferVtbl.Connect$VH.set(seg, x);
    }
    public static MemorySegment Connect$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.Connect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Connect$set(MemorySegment seg, long index, MemorySegment x) {
        IRpcStubBufferVtbl.Connect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Connect Connect(MemorySegment segment, SegmentScope scope) {
        return Connect.ofAddress(Connect$get(segment), scope);
    }
    static final FunctionDescriptor Disconnect$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor Disconnect_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Disconnect_UP$MH = RuntimeHelper.upcallHandle(Disconnect.class, "apply", IRpcStubBufferVtbl.Disconnect_UP$FUNC);
    static final FunctionDescriptor Disconnect_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Disconnect_DOWN$MH = RuntimeHelper.downcallHandle(
        IRpcStubBufferVtbl.Disconnect_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*Disconnect)(IRpcStubBuffer*);
     * }
     */
    public interface Disconnect {

        void apply(java.lang.foreign.MemorySegment pParameter);
        static MemorySegment allocate(Disconnect fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IRpcStubBufferVtbl.Disconnect_UP$MH, fi, IRpcStubBufferVtbl.Disconnect$FUNC, scope);
        }
        static Disconnect ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _pParameter) -> {
                try {
                    IRpcStubBufferVtbl.Disconnect_DOWN$MH.invokeExact(symbol, _pParameter);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Disconnect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Disconnect"));
    public static VarHandle Disconnect$VH() {
        return IRpcStubBufferVtbl.Disconnect$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*Disconnect)(IRpcStubBuffer*);
     * }
     */
    public static MemorySegment Disconnect$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.Disconnect$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*Disconnect)(IRpcStubBuffer*);
     * }
     */
    public static void Disconnect$set(MemorySegment seg, MemorySegment x) {
        IRpcStubBufferVtbl.Disconnect$VH.set(seg, x);
    }
    public static MemorySegment Disconnect$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.Disconnect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Disconnect$set(MemorySegment seg, long index, MemorySegment x) {
        IRpcStubBufferVtbl.Disconnect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Disconnect Disconnect(MemorySegment segment, SegmentScope scope) {
        return Disconnect.ofAddress(Disconnect$get(segment), scope);
    }
    static final FunctionDescriptor Invoke$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor Invoke_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Invoke_UP$MH = RuntimeHelper.upcallHandle(Invoke.class, "apply", IRpcStubBufferVtbl.Invoke_UP$FUNC);
    static final FunctionDescriptor Invoke_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Invoke_DOWN$MH = RuntimeHelper.downcallHandle(
        IRpcStubBufferVtbl.Invoke_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*Invoke)(IRpcStubBuffer*,RPCOLEMESSAGE*,IRpcChannelBuffer*);
     * }
     */
    public interface Invoke {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(Invoke fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IRpcStubBufferVtbl.Invoke_UP$MH, fi, IRpcStubBufferVtbl.Invoke$FUNC, scope);
        }
        static Invoke ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)IRpcStubBufferVtbl.Invoke_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Invoke$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Invoke"));
    public static VarHandle Invoke$VH() {
        return IRpcStubBufferVtbl.Invoke$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Invoke)(IRpcStubBuffer*,RPCOLEMESSAGE*,IRpcChannelBuffer*);
     * }
     */
    public static MemorySegment Invoke$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.Invoke$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Invoke)(IRpcStubBuffer*,RPCOLEMESSAGE*,IRpcChannelBuffer*);
     * }
     */
    public static void Invoke$set(MemorySegment seg, MemorySegment x) {
        IRpcStubBufferVtbl.Invoke$VH.set(seg, x);
    }
    public static MemorySegment Invoke$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.Invoke$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Invoke$set(MemorySegment seg, long index, MemorySegment x) {
        IRpcStubBufferVtbl.Invoke$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Invoke Invoke(MemorySegment segment, SegmentScope scope) {
        return Invoke.ofAddress(Invoke$get(segment), scope);
    }
    static final FunctionDescriptor IsIIDSupported$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor IsIIDSupported_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsIIDSupported_UP$MH = RuntimeHelper.upcallHandle(IsIIDSupported.class, "apply", IRpcStubBufferVtbl.IsIIDSupported_UP$FUNC);
    static final FunctionDescriptor IsIIDSupported_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsIIDSupported_DOWN$MH = RuntimeHelper.downcallHandle(
        IRpcStubBufferVtbl.IsIIDSupported_DOWN$FUNC
    );
    /**
     * {@snippet :
 * IRpcStubBuffer* (*IsIIDSupported)(IRpcStubBuffer*,const IID*);
     * }
     */
    public interface IsIIDSupported {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(IsIIDSupported fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IRpcStubBufferVtbl.IsIIDSupported_UP$MH, fi, IRpcStubBufferVtbl.IsIIDSupported$FUNC, scope);
        }
        static IsIIDSupported ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.IsIIDSupported_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle IsIIDSupported$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsIIDSupported"));
    public static VarHandle IsIIDSupported$VH() {
        return IRpcStubBufferVtbl.IsIIDSupported$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * IRpcStubBuffer* (*IsIIDSupported)(IRpcStubBuffer*,const IID*);
     * }
     */
    public static MemorySegment IsIIDSupported$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.IsIIDSupported$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * IRpcStubBuffer* (*IsIIDSupported)(IRpcStubBuffer*,const IID*);
     * }
     */
    public static void IsIIDSupported$set(MemorySegment seg, MemorySegment x) {
        IRpcStubBufferVtbl.IsIIDSupported$VH.set(seg, x);
    }
    public static MemorySegment IsIIDSupported$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.IsIIDSupported$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsIIDSupported$set(MemorySegment seg, long index, MemorySegment x) {
        IRpcStubBufferVtbl.IsIIDSupported$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static IsIIDSupported IsIIDSupported(MemorySegment segment, SegmentScope scope) {
        return IsIIDSupported.ofAddress(IsIIDSupported$get(segment), scope);
    }
    static final FunctionDescriptor CountRefs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor CountRefs_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CountRefs_UP$MH = RuntimeHelper.upcallHandle(CountRefs.class, "apply", IRpcStubBufferVtbl.CountRefs_UP$FUNC);
    static final FunctionDescriptor CountRefs_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CountRefs_DOWN$MH = RuntimeHelper.downcallHandle(
        IRpcStubBufferVtbl.CountRefs_DOWN$FUNC
    );
    /**
     * {@snippet :
 * ULONG (*CountRefs)(IRpcStubBuffer*);
     * }
     */
    public interface CountRefs {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(CountRefs fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IRpcStubBufferVtbl.CountRefs_UP$MH, fi, IRpcStubBufferVtbl.CountRefs$FUNC, scope);
        }
        static CountRefs ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)IRpcStubBufferVtbl.CountRefs_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle CountRefs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CountRefs"));
    public static VarHandle CountRefs$VH() {
        return IRpcStubBufferVtbl.CountRefs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*CountRefs)(IRpcStubBuffer*);
     * }
     */
    public static MemorySegment CountRefs$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.CountRefs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*CountRefs)(IRpcStubBuffer*);
     * }
     */
    public static void CountRefs$set(MemorySegment seg, MemorySegment x) {
        IRpcStubBufferVtbl.CountRefs$VH.set(seg, x);
    }
    public static MemorySegment CountRefs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.CountRefs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CountRefs$set(MemorySegment seg, long index, MemorySegment x) {
        IRpcStubBufferVtbl.CountRefs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static CountRefs CountRefs(MemorySegment segment, SegmentScope scope) {
        return CountRefs.ofAddress(CountRefs$get(segment), scope);
    }
    static final FunctionDescriptor DebugServerQueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor DebugServerQueryInterface_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DebugServerQueryInterface_UP$MH = RuntimeHelper.upcallHandle(DebugServerQueryInterface.class, "apply", IRpcStubBufferVtbl.DebugServerQueryInterface_UP$FUNC);
    static final FunctionDescriptor DebugServerQueryInterface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DebugServerQueryInterface_DOWN$MH = RuntimeHelper.downcallHandle(
        IRpcStubBufferVtbl.DebugServerQueryInterface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * HRESULT (*DebugServerQueryInterface)(IRpcStubBuffer*,void**);
     * }
     */
    public interface DebugServerQueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(DebugServerQueryInterface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IRpcStubBufferVtbl.DebugServerQueryInterface_UP$MH, fi, IRpcStubBufferVtbl.DebugServerQueryInterface$FUNC, scope);
        }
        static DebugServerQueryInterface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IRpcStubBufferVtbl.DebugServerQueryInterface_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle DebugServerQueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DebugServerQueryInterface"));
    public static VarHandle DebugServerQueryInterface$VH() {
        return IRpcStubBufferVtbl.DebugServerQueryInterface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*DebugServerQueryInterface)(IRpcStubBuffer*,void**);
     * }
     */
    public static MemorySegment DebugServerQueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.DebugServerQueryInterface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*DebugServerQueryInterface)(IRpcStubBuffer*,void**);
     * }
     */
    public static void DebugServerQueryInterface$set(MemorySegment seg, MemorySegment x) {
        IRpcStubBufferVtbl.DebugServerQueryInterface$VH.set(seg, x);
    }
    public static MemorySegment DebugServerQueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.DebugServerQueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DebugServerQueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        IRpcStubBufferVtbl.DebugServerQueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static DebugServerQueryInterface DebugServerQueryInterface(MemorySegment segment, SegmentScope scope) {
        return DebugServerQueryInterface.ofAddress(DebugServerQueryInterface$get(segment), scope);
    }
    static final FunctionDescriptor DebugServerRelease$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor DebugServerRelease_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DebugServerRelease_UP$MH = RuntimeHelper.upcallHandle(DebugServerRelease.class, "apply", IRpcStubBufferVtbl.DebugServerRelease_UP$FUNC);
    static final FunctionDescriptor DebugServerRelease_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DebugServerRelease_DOWN$MH = RuntimeHelper.downcallHandle(
        IRpcStubBufferVtbl.DebugServerRelease_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*DebugServerRelease)(IRpcStubBuffer*,void*);
     * }
     */
    public interface DebugServerRelease {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(DebugServerRelease fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(IRpcStubBufferVtbl.DebugServerRelease_UP$MH, fi, IRpcStubBufferVtbl.DebugServerRelease$FUNC, scope);
        }
        static DebugServerRelease ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    IRpcStubBufferVtbl.DebugServerRelease_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle DebugServerRelease$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DebugServerRelease"));
    public static VarHandle DebugServerRelease$VH() {
        return IRpcStubBufferVtbl.DebugServerRelease$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*DebugServerRelease)(IRpcStubBuffer*,void*);
     * }
     */
    public static MemorySegment DebugServerRelease$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.DebugServerRelease$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*DebugServerRelease)(IRpcStubBuffer*,void*);
     * }
     */
    public static void DebugServerRelease$set(MemorySegment seg, MemorySegment x) {
        IRpcStubBufferVtbl.DebugServerRelease$VH.set(seg, x);
    }
    public static MemorySegment DebugServerRelease$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IRpcStubBufferVtbl.DebugServerRelease$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DebugServerRelease$set(MemorySegment seg, long index, MemorySegment x) {
        IRpcStubBufferVtbl.DebugServerRelease$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static DebugServerRelease DebugServerRelease(MemorySegment segment, SegmentScope scope) {
        return DebugServerRelease.ofAddress(DebugServerRelease$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


