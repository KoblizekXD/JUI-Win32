// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SEC_WINNT_AUTH_IDENTITY_W {
 *     unsigned short* User;
 *     unsigned long UserLength;
 *     unsigned short* Domain;
 *     unsigned long DomainLength;
 *     unsigned short* Password;
 *     unsigned long PasswordLength;
 *     unsigned long Flags;
 * };
 * }
 */
public class _SEC_WINNT_AUTH_IDENTITY_W {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("User"),
        Constants$root.C_LONG$LAYOUT.withName("UserLength"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("Domain"),
        Constants$root.C_LONG$LAYOUT.withName("DomainLength"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("Password"),
        Constants$root.C_LONG$LAYOUT.withName("PasswordLength"),
        Constants$root.C_LONG$LAYOUT.withName("Flags")
    ).withName("_SEC_WINNT_AUTH_IDENTITY_W");
    public static MemoryLayout $LAYOUT() {
        return _SEC_WINNT_AUTH_IDENTITY_W.$struct$LAYOUT;
    }
    static final VarHandle User$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("User"));
    public static VarHandle User$VH() {
        return _SEC_WINNT_AUTH_IDENTITY_W.User$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short* User;
     * }
     */
    public static MemorySegment User$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SEC_WINNT_AUTH_IDENTITY_W.User$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short* User;
     * }
     */
    public static void User$set(MemorySegment seg, MemorySegment x) {
        _SEC_WINNT_AUTH_IDENTITY_W.User$VH.set(seg, x);
    }
    public static MemorySegment User$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SEC_WINNT_AUTH_IDENTITY_W.User$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void User$set(MemorySegment seg, long index, MemorySegment x) {
        _SEC_WINNT_AUTH_IDENTITY_W.User$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UserLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UserLength"));
    public static VarHandle UserLength$VH() {
        return _SEC_WINNT_AUTH_IDENTITY_W.UserLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long UserLength;
     * }
     */
    public static int UserLength$get(MemorySegment seg) {
        return (int)_SEC_WINNT_AUTH_IDENTITY_W.UserLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long UserLength;
     * }
     */
    public static void UserLength$set(MemorySegment seg, int x) {
        _SEC_WINNT_AUTH_IDENTITY_W.UserLength$VH.set(seg, x);
    }
    public static int UserLength$get(MemorySegment seg, long index) {
        return (int)_SEC_WINNT_AUTH_IDENTITY_W.UserLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UserLength$set(MemorySegment seg, long index, int x) {
        _SEC_WINNT_AUTH_IDENTITY_W.UserLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Domain$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Domain"));
    public static VarHandle Domain$VH() {
        return _SEC_WINNT_AUTH_IDENTITY_W.Domain$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short* Domain;
     * }
     */
    public static MemorySegment Domain$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SEC_WINNT_AUTH_IDENTITY_W.Domain$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short* Domain;
     * }
     */
    public static void Domain$set(MemorySegment seg, MemorySegment x) {
        _SEC_WINNT_AUTH_IDENTITY_W.Domain$VH.set(seg, x);
    }
    public static MemorySegment Domain$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SEC_WINNT_AUTH_IDENTITY_W.Domain$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Domain$set(MemorySegment seg, long index, MemorySegment x) {
        _SEC_WINNT_AUTH_IDENTITY_W.Domain$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DomainLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DomainLength"));
    public static VarHandle DomainLength$VH() {
        return _SEC_WINNT_AUTH_IDENTITY_W.DomainLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long DomainLength;
     * }
     */
    public static int DomainLength$get(MemorySegment seg) {
        return (int)_SEC_WINNT_AUTH_IDENTITY_W.DomainLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long DomainLength;
     * }
     */
    public static void DomainLength$set(MemorySegment seg, int x) {
        _SEC_WINNT_AUTH_IDENTITY_W.DomainLength$VH.set(seg, x);
    }
    public static int DomainLength$get(MemorySegment seg, long index) {
        return (int)_SEC_WINNT_AUTH_IDENTITY_W.DomainLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DomainLength$set(MemorySegment seg, long index, int x) {
        _SEC_WINNT_AUTH_IDENTITY_W.DomainLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Password$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Password"));
    public static VarHandle Password$VH() {
        return _SEC_WINNT_AUTH_IDENTITY_W.Password$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short* Password;
     * }
     */
    public static MemorySegment Password$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SEC_WINNT_AUTH_IDENTITY_W.Password$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short* Password;
     * }
     */
    public static void Password$set(MemorySegment seg, MemorySegment x) {
        _SEC_WINNT_AUTH_IDENTITY_W.Password$VH.set(seg, x);
    }
    public static MemorySegment Password$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SEC_WINNT_AUTH_IDENTITY_W.Password$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Password$set(MemorySegment seg, long index, MemorySegment x) {
        _SEC_WINNT_AUTH_IDENTITY_W.Password$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PasswordLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PasswordLength"));
    public static VarHandle PasswordLength$VH() {
        return _SEC_WINNT_AUTH_IDENTITY_W.PasswordLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long PasswordLength;
     * }
     */
    public static int PasswordLength$get(MemorySegment seg) {
        return (int)_SEC_WINNT_AUTH_IDENTITY_W.PasswordLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long PasswordLength;
     * }
     */
    public static void PasswordLength$set(MemorySegment seg, int x) {
        _SEC_WINNT_AUTH_IDENTITY_W.PasswordLength$VH.set(seg, x);
    }
    public static int PasswordLength$get(MemorySegment seg, long index) {
        return (int)_SEC_WINNT_AUTH_IDENTITY_W.PasswordLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PasswordLength$set(MemorySegment seg, long index, int x) {
        _SEC_WINNT_AUTH_IDENTITY_W.PasswordLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _SEC_WINNT_AUTH_IDENTITY_W.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_SEC_WINNT_AUTH_IDENTITY_W.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _SEC_WINNT_AUTH_IDENTITY_W.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_SEC_WINNT_AUTH_IDENTITY_W.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _SEC_WINNT_AUTH_IDENTITY_W.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


