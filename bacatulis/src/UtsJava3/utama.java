package UtsJava3;


import java.util.Scanner;
import java.util.LinkedList;
import java.util.InputMismatchException;
import static UtsJava3.Properti.tambahin;

public class utama { 
  
    public static LinkedList<String>DataBase = new LinkedList<String>();
    
    //agar bisa masukin dataa secara berulang
    public static Scanner masukin(){
        return new Scanner(System.in);
    }
    
    public static void Antri(){
        System.out.println("\n NO Antrian : " + DataBase);
        System.out.println("Total antrian : " + DataBase.size());
    }
   public static void jumtot(){
       System.out.println("no antrian mu :"+DataBase.size());
   }
    public static void programExit(){
        System.exit(0);
    }
   
    public static void Switcher(){
        tambahin ba = new tambahin();
        dihapus ai = new dihapus();
        Search s = new Search();
        
        boolean status = true;
        int muenu = 0;
        while(status){
            try{
                status = false;
                System.out.println("pilih menu 1-4");
                muenu = masukin().nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("masukkan pilihan menu yang benar !");
                status = true;
            }
        }
        switch(muenu){
            case 1 : ba.addData();break;// pemasukan nama
            case 2 : ai.hapus();break;
            case 3 : s.cari();break;
            case 4 : programExit();
        }
        Menu();
        
        
    }

    public static void Menu() {
        System.out.println("\n Menu Nge-Laundry "
                          +"\n 1.Masukan Nama "
                          +"\n 2.Ambil Laundry sapa ? "
                          +"\n 3.mengecek laundry sapa ? "
                          +"\n 4.keluar");
        Switcher();
    }
      
} 