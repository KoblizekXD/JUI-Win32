// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct mmtime_tag {
 *     UINT wType;
 *     union  u;
 * };
 * }
 */
public class mmtime_tag {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("wType"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("ms"),
            Constants$root.C_LONG$LAYOUT.withName("sample"),
            Constants$root.C_LONG$LAYOUT.withName("cb"),
            Constants$root.C_LONG$LAYOUT.withName("ticks"),
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("hour"),
                Constants$root.C_CHAR$LAYOUT.withName("min"),
                Constants$root.C_CHAR$LAYOUT.withName("sec"),
                Constants$root.C_CHAR$LAYOUT.withName("frame"),
                Constants$root.C_CHAR$LAYOUT.withName("fps"),
                Constants$root.C_CHAR$LAYOUT.withName("dummy"),
                MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("pad")
            ).withName("smpte"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("songptrpos")
            ).withName("midi")
        ).withName("u")
    ).withName("mmtime_tag");
    public static MemoryLayout $LAYOUT() {
        return mmtime_tag.$struct$LAYOUT;
    }
    static final VarHandle wType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wType"));
    public static VarHandle wType$VH() {
        return mmtime_tag.wType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wType;
     * }
     */
    public static int wType$get(MemorySegment seg) {
        return (int)mmtime_tag.wType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wType;
     * }
     */
    public static void wType$set(MemorySegment seg, int x) {
        mmtime_tag.wType$VH.set(seg, x);
    }
    public static int wType$get(MemorySegment seg, long index) {
        return (int)mmtime_tag.wType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wType$set(MemorySegment seg, long index, int x) {
        mmtime_tag.wType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union {
     *     DWORD ms;
     *     DWORD sample;
     *     DWORD cb;
     *     DWORD ticks;
     *     struct  smpte;
     *     struct  midi;
     * };
     * }
     */
    public static final class u {

        // Suppresses default constructor, ensuring non-instantiability.
        private u() {}
        static final UnionLayout u$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("ms"),
            Constants$root.C_LONG$LAYOUT.withName("sample"),
            Constants$root.C_LONG$LAYOUT.withName("cb"),
            Constants$root.C_LONG$LAYOUT.withName("ticks"),
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("hour"),
                Constants$root.C_CHAR$LAYOUT.withName("min"),
                Constants$root.C_CHAR$LAYOUT.withName("sec"),
                Constants$root.C_CHAR$LAYOUT.withName("frame"),
                Constants$root.C_CHAR$LAYOUT.withName("fps"),
                Constants$root.C_CHAR$LAYOUT.withName("dummy"),
                MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("pad")
            ).withName("smpte"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("songptrpos")
            ).withName("midi")
        );
        public static MemoryLayout $LAYOUT() {
            return u.u$union$LAYOUT;
        }
        static final VarHandle ms$VH = u$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ms"));
        public static VarHandle ms$VH() {
            return u.ms$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD ms;
         * }
         */
        public static int ms$get(MemorySegment seg) {
            return (int)u.ms$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD ms;
         * }
         */
        public static void ms$set(MemorySegment seg, int x) {
            u.ms$VH.set(seg, x);
        }
        public static int ms$get(MemorySegment seg, long index) {
            return (int)u.ms$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void ms$set(MemorySegment seg, long index, int x) {
            u.ms$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle sample$VH = u$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sample"));
        public static VarHandle sample$VH() {
            return u.sample$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD sample;
         * }
         */
        public static int sample$get(MemorySegment seg) {
            return (int)u.sample$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD sample;
         * }
         */
        public static void sample$set(MemorySegment seg, int x) {
            u.sample$VH.set(seg, x);
        }
        public static int sample$get(MemorySegment seg, long index) {
            return (int)u.sample$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void sample$set(MemorySegment seg, long index, int x) {
            u.sample$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle cb$VH = u$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cb"));
        public static VarHandle cb$VH() {
            return u.cb$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD cb;
         * }
         */
        public static int cb$get(MemorySegment seg) {
            return (int)u.cb$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD cb;
         * }
         */
        public static void cb$set(MemorySegment seg, int x) {
            u.cb$VH.set(seg, x);
        }
        public static int cb$get(MemorySegment seg, long index) {
            return (int)u.cb$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void cb$set(MemorySegment seg, long index, int x) {
            u.cb$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle ticks$VH = u$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ticks"));
        public static VarHandle ticks$VH() {
            return u.ticks$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD ticks;
         * }
         */
        public static int ticks$get(MemorySegment seg) {
            return (int)u.ticks$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD ticks;
         * }
         */
        public static void ticks$set(MemorySegment seg, int x) {
            u.ticks$VH.set(seg, x);
        }
        public static int ticks$get(MemorySegment seg, long index) {
            return (int)u.ticks$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void ticks$set(MemorySegment seg, long index, int x) {
            u.ticks$VH.set(seg.asSlice(index*sizeof()), x);
        }
        /**
         * {@snippet :
         * struct {
         *     BYTE hour;
         *     BYTE min;
         *     BYTE sec;
         *     BYTE frame;
         *     BYTE fps;
         *     BYTE dummy;
         *     BYTE pad[2];
         * };
         * }
         */
        public static final class smpte {

            // Suppresses default constructor, ensuring non-instantiability.
            private smpte() {}
            static final StructLayout u$smpte$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("hour"),
                Constants$root.C_CHAR$LAYOUT.withName("min"),
                Constants$root.C_CHAR$LAYOUT.withName("sec"),
                Constants$root.C_CHAR$LAYOUT.withName("frame"),
                Constants$root.C_CHAR$LAYOUT.withName("fps"),
                Constants$root.C_CHAR$LAYOUT.withName("dummy"),
                MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("pad")
            );
            public static MemoryLayout $LAYOUT() {
                return smpte.u$smpte$struct$LAYOUT;
            }
            static final VarHandle hour$VH = u$smpte$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hour"));
            public static VarHandle hour$VH() {
                return smpte.hour$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE hour;
             * }
             */
            public static byte hour$get(MemorySegment seg) {
                return (byte)smpte.hour$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE hour;
             * }
             */
            public static void hour$set(MemorySegment seg, byte x) {
                smpte.hour$VH.set(seg, x);
            }
            public static byte hour$get(MemorySegment seg, long index) {
                return (byte)smpte.hour$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void hour$set(MemorySegment seg, long index, byte x) {
                smpte.hour$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle min$VH = u$smpte$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("min"));
            public static VarHandle min$VH() {
                return smpte.min$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE min;
             * }
             */
            public static byte min$get(MemorySegment seg) {
                return (byte)smpte.min$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE min;
             * }
             */
            public static void min$set(MemorySegment seg, byte x) {
                smpte.min$VH.set(seg, x);
            }
            public static byte min$get(MemorySegment seg, long index) {
                return (byte)smpte.min$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void min$set(MemorySegment seg, long index, byte x) {
                smpte.min$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle sec$VH = u$smpte$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sec"));
            public static VarHandle sec$VH() {
                return smpte.sec$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE sec;
             * }
             */
            public static byte sec$get(MemorySegment seg) {
                return (byte)smpte.sec$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE sec;
             * }
             */
            public static void sec$set(MemorySegment seg, byte x) {
                smpte.sec$VH.set(seg, x);
            }
            public static byte sec$get(MemorySegment seg, long index) {
                return (byte)smpte.sec$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void sec$set(MemorySegment seg, long index, byte x) {
                smpte.sec$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle frame$VH = u$smpte$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("frame"));
            public static VarHandle frame$VH() {
                return smpte.frame$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE frame;
             * }
             */
            public static byte frame$get(MemorySegment seg) {
                return (byte)smpte.frame$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE frame;
             * }
             */
            public static void frame$set(MemorySegment seg, byte x) {
                smpte.frame$VH.set(seg, x);
            }
            public static byte frame$get(MemorySegment seg, long index) {
                return (byte)smpte.frame$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void frame$set(MemorySegment seg, long index, byte x) {
                smpte.frame$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle fps$VH = u$smpte$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fps"));
            public static VarHandle fps$VH() {
                return smpte.fps$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE fps;
             * }
             */
            public static byte fps$get(MemorySegment seg) {
                return (byte)smpte.fps$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE fps;
             * }
             */
            public static void fps$set(MemorySegment seg, byte x) {
                smpte.fps$VH.set(seg, x);
            }
            public static byte fps$get(MemorySegment seg, long index) {
                return (byte)smpte.fps$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void fps$set(MemorySegment seg, long index, byte x) {
                smpte.fps$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle dummy$VH = u$smpte$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy"));
            public static VarHandle dummy$VH() {
                return smpte.dummy$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE dummy;
             * }
             */
            public static byte dummy$get(MemorySegment seg) {
                return (byte)smpte.dummy$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE dummy;
             * }
             */
            public static void dummy$set(MemorySegment seg, byte x) {
                smpte.dummy$VH.set(seg, x);
            }
            public static byte dummy$get(MemorySegment seg, long index) {
                return (byte)smpte.dummy$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void dummy$set(MemorySegment seg, long index, byte x) {
                smpte.dummy$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static MemorySegment pad$slice(MemorySegment seg) {
                return seg.asSlice(6, 2);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
        }

        public static MemorySegment smpte$slice(MemorySegment seg) {
            return seg.asSlice(0, 8);
        }
        /**
         * {@snippet :
         * struct {
         *     DWORD songptrpos;
         * };
         * }
         */
        public static final class midi {

            // Suppresses default constructor, ensuring non-instantiability.
            private midi() {}
            static final StructLayout u$midi$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("songptrpos")
            );
            public static MemoryLayout $LAYOUT() {
                return midi.u$midi$struct$LAYOUT;
            }
            static final VarHandle songptrpos$VH = u$midi$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("songptrpos"));
            public static VarHandle songptrpos$VH() {
                return midi.songptrpos$VH;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD songptrpos;
             * }
             */
            public static int songptrpos$get(MemorySegment seg) {
                return (int)midi.songptrpos$VH.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD songptrpos;
             * }
             */
            public static void songptrpos$set(MemorySegment seg, int x) {
                midi.songptrpos$VH.set(seg, x);
            }
            public static int songptrpos$get(MemorySegment seg, long index) {
                return (int)midi.songptrpos$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void songptrpos$set(MemorySegment seg, long index, int x) {
                midi.songptrpos$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
        }

        public static MemorySegment midi$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment u$slice(MemorySegment seg) {
        return seg.asSlice(4, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


