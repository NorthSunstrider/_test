package com.northsunstrider.accessmodifier;

/**
 * @author North
 *
 */
public class MethodClass {

    public static void publicStaticMethod() {
        System.out.println("static public method!");
    }

    protected static void protectedStaticMethod() {
        System.out.println("static protected method!");
    }

    private static void privateStaticMethod() {
        System.out.println("static private method!");
    }

    static void defaultStaticMethod() {
        System.out.println("static default method!");
    }

    public void publicMethod() {
        System.out.println("public method!");
    }

    protected void protectedMethod() {
        System.out.println("protected method!");
    }

    private void privateMethod() {
        System.out.println("private method!");
    }

    void defaultMethod() {
        System.out.println("default method!");
    }
}
