public class Lain {

    /* Bagian ini dapat diakses oleh seluruh program (siapapun) */
    public static void methodPublic(){
        System.out.println("Kalimat ini berada ada method Public");
    }

    /* Ini hanya dapat diakses oleh class yang bersangkutan */
    private static void methodPrivate(){
        System.out.println("Kalimat ini berada ada method Private");
    }

    /* Ini hanya dapat diakses oleh class dalam package yang sama */
    static void methodDefault(){ //Default
        System.out.println("Kalimat ini berada ada method Default");
    }

    /* Ini hanya dapat diakses oleh class dalam package yang sama dan sub-class nya */
    protected static void methodProtected(){
        System.out.println("Kalimat ini berada ada method Protected");
    }
}
