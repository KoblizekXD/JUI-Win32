// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * unsigned char* (*USER_MARSHAL_UNMARSHALLING_ROUTINE)(unsigned long*,unsigned char*,void*);
 * }
 */
public interface USER_MARSHAL_UNMARSHALLING_ROUTINE {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
    static MemorySegment allocate(USER_MARSHAL_UNMARSHALLING_ROUTINE fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$811.USER_MARSHAL_UNMARSHALLING_ROUTINE_UP$MH, fi, constants$811.USER_MARSHAL_UNMARSHALLING_ROUTINE$FUNC, scope);
    }
    static USER_MARSHAL_UNMARSHALLING_ROUTINE ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$812.USER_MARSHAL_UNMARSHALLING_ROUTINE_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


