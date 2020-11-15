/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan59_DetectiveConan;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan detective conan
 */
public class PBO_IF2_10116414_DetectiveConan {
    public static void main(String[] args) {
        KarakterUtama kogoro = new KarakterUtama("Detektif Swasta", "Memecahkan kasus","Kogoro Mouri", "Osaka",false);
        kogoro.TampilKarakter();
        KarakterUtama conan = new KarakterUtama("Investigator", "Menyelesaikan Kasus","Conan Edogawa","Tokyo",true);
        conan.TampilKarakter();        
        KarakterSupport eisuke = new KarakterSupport("Teman Sekelas Ran Mouri","Eisuke Hondo","Osaka",false);      
        eisuke.TampilKarakter();
        KarakterUtama ran = new KarakterUtama("Karate", "Sama seperti Shinichi","Ran Mouri","Osaka",false);
        ran.TampilKarakter();
    }
}
