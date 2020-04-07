import com.rk.tataboga.Memasak;

public class Programs {
    public static void main(String[] args) {
        /* Access Modifier: public, private default dan protected */

        /* Dengan access modifier public, dapat diakses */
        Lain.methodPublic();

        /* Dengan Access modifier private, tidak dapat diakses */
        //Lain.methodPrivate();

        /* Karena ada di dalam package yang sama, maka dapat diakses */
        Lain.methodDefault();

        /* Karena ada di dalam package yang sama, maka dapat diakses */
        Lain.methodProtected();

        Memasak.dagingPublic();
        //Memasak.dagingPrivate(); //Tidak Bisa Diakses
        //Memasak.dagingDefault(); //Tidak Bisa Diakses
        //Memasak.dagingProtceted();//Tidak Bisa Diakses

    }

}
