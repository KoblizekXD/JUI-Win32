// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void* (*RpcSmSwapClientAllocFree$ClientAlloc)(size_t);
 * }
 */
public interface RpcSmSwapClientAllocFree$ClientAlloc {

    java.lang.foreign.MemorySegment apply(long Size);
    static MemorySegment allocate(RpcSmSwapClientAllocFree$ClientAlloc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$845.RpcSmSwapClientAllocFree$ClientAlloc_UP$MH, fi, constants$845.RpcSmSwapClientAllocFree$ClientAlloc$FUNC, scope);
    }
    static RpcSmSwapClientAllocFree$ClientAlloc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (long _Size) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$845.RpcSmSwapClientAllocFree$ClientAlloc_DOWN$MH.invokeExact(symbol, _Size);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

