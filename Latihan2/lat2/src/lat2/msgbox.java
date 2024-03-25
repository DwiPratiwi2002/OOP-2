package lat2;

/**
 *
 * @author Ni Kadek Dwi Pratiwi
 * tgl : 25/03/2024
 */

import javax.swing.JOptionPane;

public class msgbox {
   public static void main(String[] args){
       String nama = "";
       nama = JOptionPane.showInputDialog("Tulis Nama");
       
       System.out.println("Isi Variabel nama: "+nama);
   }
    
}
