/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtsJava3;

import static UtsJava3.utama.Antri;
import static UtsJava3.utama.DataBase;
import static UtsJava3.utama.masukin;

/**
 *
 * @author User
 */
class tambahin {
    
           

    public tambahin() {
    }

    public static void addData() {
        System.out.println("masukan nama : ");
        String makan = masukin().nextLine();
        DataBase.add(makan);
        Antri();
    }
    
}
