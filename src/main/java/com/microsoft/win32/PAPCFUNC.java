// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PAPCFUNC)(unsigned long long Parameter);
 * }
 */
public interface PAPCFUNC {

    void apply(long Parameter);
    static MemorySegment allocate(PAPCFUNC fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$105.PAPCFUNC_UP$MH, fi, constants$105.PAPCFUNC$FUNC, scope);
    }
    static PAPCFUNC ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (long _Parameter) -> {
            try {
                constants$105.PAPCFUNC_DOWN$MH.invokeExact(symbol, _Parameter);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

