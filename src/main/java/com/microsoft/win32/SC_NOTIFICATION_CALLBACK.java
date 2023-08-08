// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*SC_NOTIFICATION_CALLBACK)(DWORD dwNotify,PVOID pCallbackContext);
 * }
 */
public interface SC_NOTIFICATION_CALLBACK {

    void apply(int dwNotify, java.lang.foreign.MemorySegment pCallbackContext);
    static MemorySegment allocate(SC_NOTIFICATION_CALLBACK fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1262.SC_NOTIFICATION_CALLBACK_UP$MH, fi, constants$1262.SC_NOTIFICATION_CALLBACK$FUNC, scope);
    }
    static SC_NOTIFICATION_CALLBACK ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (int _dwNotify, java.lang.foreign.MemorySegment _pCallbackContext) -> {
            try {
                constants$1262.SC_NOTIFICATION_CALLBACK_DOWN$MH.invokeExact(symbol, _dwNotify, _pCallbackContext);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


