// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PRTL_UMS_SCHEDULER_ENTRY_POINT)(enum _RTL_UMS_SCHEDULER_REASON,unsigned long long,void*);
 * }
 */
public interface PRTL_UMS_SCHEDULER_ENTRY_POINT {

    void apply(int _x0, long _x1, java.lang.foreign.MemorySegment _x2);
    static MemorySegment allocate(PRTL_UMS_SCHEDULER_ENTRY_POINT fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$101.PRTL_UMS_SCHEDULER_ENTRY_POINT_UP$MH, fi, constants$101.PRTL_UMS_SCHEDULER_ENTRY_POINT$FUNC, scope);
    }
    static PRTL_UMS_SCHEDULER_ENTRY_POINT ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (int __x0, long __x1, java.lang.foreign.MemorySegment __x2) -> {
            try {
                constants$102.PRTL_UMS_SCHEDULER_ENTRY_POINT_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


