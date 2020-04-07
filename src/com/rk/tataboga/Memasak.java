package com.rk.tataboga;

public class Memasak {
    public static void dagingPublic() {
        System.out.println("Memasak Publik");
    }

    private static void dagingPrivate() {
        System.out.println("Memasak Private");
    }

    static void dagingDefault() {
        System.out.println("Memasak Default");
    }

    protected static void dagingProtected() {
        System.out.println("Memasak Protected");
    }
}
