// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * unsigned long (*OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK)(void* Process,void* TableAddress,unsigned long* Entries,struct _IMAGE_RUNTIME_FUNCTION_ENTRY** Functions);
 * }
 */
public interface OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK {

    int apply(java.lang.foreign.MemorySegment Process, java.lang.foreign.MemorySegment TableAddress, java.lang.foreign.MemorySegment Entries, java.lang.foreign.MemorySegment Functions);
    static MemorySegment allocate(OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$56.OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK_UP$MH, fi, constants$56.OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK$FUNC, scope);
    }
    static OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _Process, java.lang.foreign.MemorySegment _TableAddress, java.lang.foreign.MemorySegment _Entries, java.lang.foreign.MemorySegment _Functions) -> {
            try {
                return (int)constants$57.OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK_DOWN$MH.invokeExact(symbol, _Process, _TableAddress, _Entries, _Functions);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

