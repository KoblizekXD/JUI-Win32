// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*RPC_AUTH_KEY_RETRIEVAL_FN)(void* Arg,unsigned short* ServerPrincName,unsigned long KeyVer,void** Key,long* Status);
 * }
 */
public interface RPC_AUTH_KEY_RETRIEVAL_FN {

    void apply(java.lang.foreign.MemorySegment Arg, java.lang.foreign.MemorySegment ServerPrincName, int KeyVer, java.lang.foreign.MemorySegment Key, java.lang.foreign.MemorySegment Status);
    static MemorySegment allocate(RPC_AUTH_KEY_RETRIEVAL_FN fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$651.RPC_AUTH_KEY_RETRIEVAL_FN_UP$MH, fi, constants$651.RPC_AUTH_KEY_RETRIEVAL_FN$FUNC, scope);
    }
    static RPC_AUTH_KEY_RETRIEVAL_FN ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _Arg, java.lang.foreign.MemorySegment _ServerPrincName, int _KeyVer, java.lang.foreign.MemorySegment _Key, java.lang.foreign.MemorySegment _Status) -> {
            try {
                constants$651.RPC_AUTH_KEY_RETRIEVAL_FN_DOWN$MH.invokeExact(symbol, _Arg, _ServerPrincName, _KeyVer, _Key, _Status);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


