/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pakson_drone;
import java.util.Scanner;

/**
 *
 * @author abdulkodir
 */
public class PakSon_DronePlayer {
    Scanner input = new Scanner(System.in);
    
    // atribut
    int energi;
    int ketinggian;
    int kecepatan;
    int tanyaKetinggian;
    int tanyaTurun;
    String merek;
    String status;

    // method
    void intro() {
        System.out.println("=====+AQILAH KAYA DRONE+=====");
        System.out.println("Your Drone : " + merek);
        System.out.println("Energi     : " + energi );
        System.out.println("Kecepatan  : " + kecepatan);
        System.out.println("ketinggian : " + ketinggian);
        System.out.println("Status     : " + status);
    }
    
    void option() {
        System.out.println("1. Check your ID");
        System.out.println("2. Turn on engine");
        System.out.println("3. Turn off engine");
        System.out.println("4. Fly");
        System.out.println("5. Land");
        System.out.println("6. side");
        System.out.println("7. back");
        System.out.println("8. Exit");
    }
    
    void terbang(){
        System.out.print("Seberapa tinggi kamu ingin terbang? ");
        int tanyaKetinggian = input.nextInt();
        
        ketinggian += tanyaKetinggian;
        energi -= 2;
        System.out.println("Dorne terbang " + ketinggian + " m di atas permukaan");
        
        
        if(energi <= 10){
            System.out.println("Energi lemah: Drone nggak bisa terbang lebih tinggi lagi");
            System.out.println("Cepat turun!");
        }
    }

    void matikanMesin(){
        if(ketinggian > 0){
            System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
            System.out.println("Kamu harus turun! jangan matikan mesin di ketinggian dong!!");
        } else {
            System.out.println("Mesin dimatikan...");
        }
    }
    
    void nyalakanMesin(){
        if(ketinggian == 0){
            System.out.println("Mesin Nyala!");
        }
    }

    void turun(){
        System.out.println("Mau turun kah? Yaudah, mau turun brp meter? ");
        int tanyaTurun = input.nextInt();
        
        if (tanyaTurun > ketinggian) {
            System.out.println("Invalid!, hanya bisa turun sebesar " + ketinggian + " m");
        } 
        else {
            // ketinggian berkurang, karena turun
            ketinggian -= tanyaTurun;
            energi -= 2;
            System.out.println("Drone turun");
        }
    }

    void belok(){
        energi -= 2;
        System.out.println("Drone belok");
        // belok ke mana? perlu dicek :)
    }

    void maju(){
        energi -= 2;
        System.out.println("Drone maju ke depan");
        kecepatan++;
    }

    void mundur(){
        energi -= 2;
        System.out.println("Drone mundur");
        kecepatan++;
    }
    
    void check(){
        if(status.contentEquals("engine on")) {
            System.out.println();
        }
        else {
            System.out.println("Nyalain dulu lah engine nya bang :)");
        }
    }
}
