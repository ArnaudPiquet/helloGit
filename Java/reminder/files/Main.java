import java.io.FileInputStream;
import java.nio.channels.FileChannel;

public class Main{
    public static void main(final String[] args) {
        System.out.println("Hello");
        System.out.println("Current Directory :" + System.getProperty("user.dir"));
        final String fileName = "datas/loremipsum.txt";
        try {
            final FileInputStream f = new FileInputStream(fileName);
            final FileChannel fCh = f.getChannel();

            // Récupération de la taille du fichier en bytes 
            // 1 byte = 8 bits = 1 octet
            System.out.println(fCh.size() + " bytes" );
            //Fermeture du flux FileInputStream
            f.close(); 

        } catch (final Exception e) {
            System.out.println(e);
            //TODO: handle exception
            //
        } finally{
            System.out.println("Dans le bloc Finally");
        }
   }
}