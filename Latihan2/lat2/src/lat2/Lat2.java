package lat2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Ni Kadek Dwi Pratwi 
 */
public class Lat2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader dtIN = new BufferedReader(new InputStreamReader (System.in) );
        
        String nama="";
        
        System.out.print("Tuliskan Nama: ");
        try{
            nama = dtIN.readLine();
        }catch(IOException e){
            System.out.println("Terjadi Masalah Saat Mengambil Data");
        }
        
            System.out.println("Isi Variabel nama: "+nama);
    }
}