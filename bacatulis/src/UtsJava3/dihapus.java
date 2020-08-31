/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtsJava3;
import java.util.InputMismatchException;

import static UtsJava3.utama.Antri;
import static UtsJava3.utama.DataBase;
import static UtsJava3.utama.masukin;
/**
 *
 * @author User
 */
class dihapus {
    public static void hapus(){
        boolean status = true;
        int oo = 0;
        Antri();
        while(status) {
            System.out.print("masukan no antrian : "  + (DataBase.size() -1) +"] : ");
            try {
                status = false;
                oo = masukin().nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("No antrian harus berupa angka !");
                status = true;
            }
            DataBase.remove(oo);
            Antri();
        }
    }
    
}
