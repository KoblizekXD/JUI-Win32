// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * RPC_STATUS (*I_RpcServerRegisterForwardFunction$pForwardFunction)(UUID*,RPC_VERSION*,UUID*,unsigned char*,void**);
 * }
 */
public interface I_RpcServerRegisterForwardFunction$pForwardFunction {

    int apply(java.lang.foreign.MemorySegment Context, java.lang.foreign.MemorySegment SessionIdPresent, java.lang.foreign.MemorySegment SessionId, java.lang.foreign.MemorySegment ResourceIdPresent, java.lang.foreign.MemorySegment ResourceId);
    static MemorySegment allocate(I_RpcServerRegisterForwardFunction$pForwardFunction fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$670.I_RpcServerRegisterForwardFunction$pForwardFunction_UP$MH, fi, constants$670.I_RpcServerRegisterForwardFunction$pForwardFunction$FUNC, scope);
    }
    static I_RpcServerRegisterForwardFunction$pForwardFunction ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _Context, java.lang.foreign.MemorySegment _SessionIdPresent, java.lang.foreign.MemorySegment _SessionId, java.lang.foreign.MemorySegment _ResourceIdPresent, java.lang.foreign.MemorySegment _ResourceId) -> {
            try {
                return (int)constants$670.I_RpcServerRegisterForwardFunction$pForwardFunction_DOWN$MH.invokeExact(symbol, _Context, _SessionIdPresent, _SessionId, _ResourceIdPresent, _ResourceId);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


