package UtsJava3;


import static UtsJava3.utama.Antri;
import static UtsJava3.utama.DataBase;
import static UtsJava3.utama.masukin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class Properti {
    
  public static void tambahin(){
        System.out.print("masukan nama : ");
        String data = masukin().nextLine();
        String gudang = masukin().nextLine();
        DataBase.add(gudang);
        System.out.print("masukan assrama : ");
        String data1 = masukin().nextLine();
        
        Antri();
    }
}
