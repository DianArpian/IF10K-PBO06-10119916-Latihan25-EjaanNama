/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan25.ejaannama;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * NIM      : 10119916
 * KELAS    : IF10K
 * Deskripsi Program : Ejaan Nama
 */
public class PBO0610119916Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String text;
        int i, panjang_text;
        
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        text = input.next();
        panjang_text = text.length();
        String[] kata = text.split("");
        
        System.out.println("Ejaan Untuk " + text + " adalah ");
        
            for (i = 0; i < panjang_text; i++){
            System.out.println("Huruf ke- " + (i+1) + " : " +kata[i]);
    
            }
    }
    
}
