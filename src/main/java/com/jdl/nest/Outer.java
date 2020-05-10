package com.jdl.nest;

public class Outer {

    // public method
    public static void outerPublic() {
        System.out.println("Hello from outerPublic");
    }

    // private method
    private static void outerPrivate() {
        System.out.println("Hello from outerPrivate");
    }

    // Nested class
    public static class Inner {

        // public method that seems to directly access the private method of the host class
        public static void innerPublic() {
            outerPrivate();
        }
    }
}
