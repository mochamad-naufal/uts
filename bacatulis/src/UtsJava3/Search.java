/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtsJava3;

import static UtsJava3.utama.Antri;
import static UtsJava3.utama.DataBase;
import static UtsJava3.utama.jumtot;
import static UtsJava3.utama.masukin;

/**
 *
 * @author User
 */

public class Search {
    public static boolean cari(String data){
        return DataBase.contains(data);
    }
    public static void cari() {
        Antri();
        System.out.print("masukan nama yang ingin di cari :");
        String iya = masukin().nextLine();
        if(cari(iya)){
            System.out.println("buntelan mu :" +iya);
        }
        else{
            System.out.print("kmu masukin ny salah");
        }
        jumtot();
    }

   

    
    
}
