/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg3.perulangan;

/**
 *
 * @author MOKLET-2
 */
public class Latihan3Perulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sukupertama= 10; //memasukkan variabel dengan tipe data int untuk suku pertama dengan angka 10
        int selisih= 5; //memasukkan variabel dengan tipe data int untuk selisih dengan angka 5
        int nilaiterakhir= 80; //memasukkan variabel dengan tipe data int untuk nilai terakhir dengan angka 80
        int updatenilai; //memasukkan variabel dengan tipe data int untuk update nilai 
        
        System.out.println("Deret Aritmatika"); //menampilkan hasil output untuk judul
        
        for(int a=0; a<3; a++){ //melakukan perulangan pertama
            for(int i=0; i<5; i++){ //melakukan perulangan kedua
                
                updatenilai = sukupertama; //memasukkan nilai suku pertama sama dengan update nilai
                sukupertama += selisih; //setiap perulangan terjadi, suku pertama selalu diambah oleh selisih yaitu 3
                
                System.out.print(" "+updatenilai);
            }
            System.out.println(" "); //menampilkan untuk spasi
        }
}
}
