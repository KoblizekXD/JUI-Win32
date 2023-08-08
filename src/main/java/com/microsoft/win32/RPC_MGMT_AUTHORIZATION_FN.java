// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*RPC_MGMT_AUTHORIZATION_FN)(void* ClientBinding,unsigned long RequestedMgmtOperation,long* Status);
 * }
 */
public interface RPC_MGMT_AUTHORIZATION_FN {

    int apply(java.lang.foreign.MemorySegment pCNGContentDecryptInfo, int dwFlags, java.lang.foreign.MemorySegment pvReserved);
    static MemorySegment allocate(RPC_MGMT_AUTHORIZATION_FN fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$656.RPC_MGMT_AUTHORIZATION_FN_UP$MH, fi, constants$656.RPC_MGMT_AUTHORIZATION_FN$FUNC, scope);
    }
    static RPC_MGMT_AUTHORIZATION_FN ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _pCNGContentDecryptInfo, int _dwFlags, java.lang.foreign.MemorySegment _pvReserved) -> {
            try {
                return (int)constants$657.RPC_MGMT_AUTHORIZATION_FN_DOWN$MH.invokeExact(symbol, _pCNGContentDecryptInfo, _dwFlags, _pvReserved);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

